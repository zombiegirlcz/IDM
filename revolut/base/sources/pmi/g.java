package pmi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.CardFileInputStream;
import org.jmrtd.BACKey;
import org.jmrtd.PassportService;
import org.jmrtd.lds.CardAccessFile;
import org.jmrtd.lds.ChipAuthenticationInfo;
import org.jmrtd.lds.ChipAuthenticationPublicKeyInfo;
import org.jmrtd.lds.PACEInfo;
import org.jmrtd.lds.SecurityInfo;
import org.jmrtd.lds.icao.DG14File;
import yhm.j;
import yhm.k;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qmi.a f237593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f237594b;

    public g(qmi.a nfcReaderComponentsProvider, a nfcPassportMrzMapper) {
        Intrinsics.checkNotNullParameter(nfcReaderComponentsProvider, "nfcReaderComponentsProvider");
        Intrinsics.checkNotNullParameter(nfcPassportMrzMapper, "nfcPassportMrzMapper");
        this.f237593a = nfcReaderComponentsProvider;
        this.f237594b = j.c(k.NONE, new pgk.f(this, 11));
    }

    public static final boolean a(g gVar, PassportService passportService, BACKey bACKey) {
        Object objA;
        gVar.getClass();
        try {
            m.Companion companion = m.INSTANCE;
            CardFileInputStream stream = passportService.getInputStream((short) 284, gVar.c());
            try {
                Intrinsics.h(stream);
                Intrinsics.checkNotNullParameter(stream, "stream");
                Iterator<SecurityInfo> it8 = new CardAccessFile(stream).getSecurityInfos().iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        Unit unit = Unit.f186387a;
                        stream.close();
                        objA = Unit.f186387a;
                        break;
                    }
                    SecurityInfo next = it8.next();
                    Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                    SecurityInfo securityInfo = next;
                    if (securityInfo instanceof PACEInfo) {
                        objA = passportService.doPACE(bACKey, ((PACEInfo) securityInfo).getObjectIdentifier(), PACEInfo.toParameterSpec(((PACEInfo) securityInfo).getParameterId()), null);
                        stream.close();
                        break;
                    }
                }
            } finally {
            }
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        m.Companion companion3 = m.INSTANCE;
        return !(objA instanceof n);
    }

    public static final boolean b(g gVar, PassportService passportService) {
        Object objA;
        CardFileInputStream stream;
        ArrayList arrayList;
        ChipAuthenticationInfo chipAuthenticationInfo;
        gVar.getClass();
        try {
            m.Companion companion = m.INSTANCE;
            stream = passportService.getInputStream(PassportService.EF_DG14, gVar.c());
            try {
                Intrinsics.h(stream);
                Intrinsics.checkNotNullParameter(stream, "stream");
                DG14File dG14File = new DG14File(stream);
                Collection<SecurityInfo> securityInfos = dG14File.getSecurityInfos();
                Intrinsics.checkNotNullExpressionValue(securityInfos, "getSecurityInfos(...)");
                arrayList = new ArrayList();
                for (Object obj2 : securityInfos) {
                    if (obj2 instanceof ChipAuthenticationPublicKeyInfo) {
                        arrayList.add(obj2);
                    }
                }
                Collection<SecurityInfo> securityInfos2 = dG14File.getSecurityInfos();
                Intrinsics.checkNotNullExpressionValue(securityInfos2, "getSecurityInfos(...)");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : securityInfos2) {
                    if (obj3 instanceof ChipAuthenticationInfo) {
                        arrayList2.add(obj3);
                    }
                }
                chipAuthenticationInfo = (ChipAuthenticationInfo) d0.d0(arrayList2);
            } finally {
            }
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (chipAuthenticationInfo == null) {
            stream.close();
            return false;
        }
        Iterator it8 = arrayList.iterator();
        if (it8.hasNext()) {
            objA = passportService.doEACCA(chipAuthenticationInfo.getKeyId(), chipAuthenticationInfo.getObjectIdentifier(), chipAuthenticationInfo.getProtocolOIDString(), ((ChipAuthenticationPublicKeyInfo) it8.next()).getSubjectPublicKey());
            stream.close();
        } else {
            Unit unit = Unit.f186387a;
            stream.close();
            objA = Unit.f186387a;
        }
        m.Companion companion3 = m.INSTANCE;
        return !(objA instanceof n);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final int c() {
        return ((Number) this.f237594b.getValue()).intValue();
    }
}
