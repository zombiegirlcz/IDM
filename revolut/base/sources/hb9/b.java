package hb9;

import android.app.Activity;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.os.Build;
import aw0.o9;
import c93.o;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.feature.user.details.api.UserDetailsToggles$ConfirmButtonUserDetails;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.play.core.splitinstall.internal.zzbl;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import com.revolut.domain.models.user.UserCompanyRegion;
import com.revolut.feature.apm.bills.core.api.model.BillInputV2;
import com.revolut.feature.backend_flow.domain.models.Action;
import com.revolut.feature.store.api.model.StoreMegaOffersResponse;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonNode;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import dv5.p;
import efm.r;
import f2e.k3;
import f2e.n3;
import ft3.j1;
import go.g;
import gt3.d;
import hha.w0;
import hp1.f;
import io3.i;
import io3.l;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.ByteBuffer;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import l8.x;
import le.u1;
import n93.e;
import nii.m0;
import sp1.c;
import zhm.q0;
import zhm.r0;
import zhm.u;
import zhm.w;
import zm3.h;
import zm3.j;
import zm3.k;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b {
    public static final Integer A(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        switch (e.f213552a[oVar.ordinal()]) {
            case 1:
                return Integer.valueOf(R$string.common_tax_vat);
            case 2:
                return Integer.valueOf(R$string.common_tax_igst);
            case 3:
                return Integer.valueOf(R$string.common_tax_cgst);
            case 4:
                return Integer.valueOf(R$string.common_tax_sgst);
            case 5:
                return Integer.valueOf(com.revolut.feature.cards_core.R$string.common_tax_gmf);
            case 6:
                return Integer.valueOf(R$string.common_tax_stamp_duty);
            case 7:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final TextClause B(TransferReasonNode transferReasonNode) {
        Intrinsics.checkNotNullParameter(transferReasonNode, "<this>");
        String label = transferReasonNode.getF92434c();
        if (label == null) {
            label = transferReasonNode.getF92432a();
        }
        return new TextClause(label, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static final n6c.a C(UserCompanyRegion userCompanyRegion) {
        switch (userCompanyRegion == null ? -1 : e6c.a.f122968a[userCompanyRegion.ordinal()]) {
            case 1:
                return n6c.a.REVOLUT_LTD;
            case 2:
                return n6c.a.REVOLUT_BANK;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return n6c.a.EEA_BUAB;
            default:
                return n6c.a.UNKNOWN;
        }
    }

    public static final j D(kq8.b bVar) {
        k kVar;
        h hVar;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String strO = com.google.android.gms.internal.mlkit_vision_face.a.o(bVar.f188335b, " ", bVar.f188336c);
        String str = bVar.f188335b;
        String str2 = bVar.f188336c;
        int i = km9.a.f185732a[bVar.f188337g.ordinal()];
        if (i == 1) {
            kVar = k.INDIVIDUAL;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            kVar = k.JUNIOR;
        }
        k kVar2 = kVar;
        String str3 = bVar.d;
        String str4 = bVar.e;
        m70.a.c(t0.f186434a);
        do3.b bVar2 = do3.b.FULL;
        w0 w0Var = bVar.f188338h;
        switch (w0Var == null ? -1 : km9.a.f185733b[w0Var.ordinal()]) {
            case -1:
            case 8:
            case 9:
                hVar = null;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                hVar = h.ESSENTIALS;
                break;
            case 2:
                hVar = h.STANDARD;
                break;
            case 3:
                hVar = h.PLUS;
                break;
            case 4:
                hVar = h.PREMIUM;
                break;
            case 5:
                hVar = h.METAL;
                break;
            case 6:
                hVar = h.ULTRA;
                break;
            case 7:
                hVar = h.PRIVATE;
                break;
        }
        return new j(strO, str, str2, null, kVar2, str3, str4, "", bVar2, hVar, null);
    }

    public static final StoreMegaOffersResponse E(n3 n3Var) {
        Intrinsics.checkNotNullParameter(n3Var, "<this>");
        List list = n3Var.f131665a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(gj7.b.J((k3) it8.next()));
        }
        return new StoreMegaOffersResponse(arrayList);
    }

    public static final f F(xo1.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        String strName = hVar.f307571a.name();
        ArrayList arrayList = hVar.f307572b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(c.b((BillInputV2) it8.next()));
        }
        String str = hVar.f307573c;
        LocalDate localDate = hVar.d;
        return new f(strName, str, localDate != null ? localDate.toString() : null, arrayList2);
    }

    public static final String G(gt3.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (fVar instanceof gt3.c) {
            gt3.c cVar = (gt3.c) fVar;
            Map map = gt3.a.f146556a;
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            return u1.h(cVar, gt3.a.f146556a);
        }
        if (fVar instanceof d) {
            return ((d) fVar).name();
        }
        if (fVar instanceof gt3.e) {
            return ((gt3.e) fVar).name();
        }
        if (fVar instanceof gt3.b) {
            return ((gt3.b) fVar).name();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final tt5.a H(tt5.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i = tt5.b.f274235a[aVar.ordinal()];
        if (i == 1) {
            return tt5.a.ASCENDING;
        }
        if (i == 2) {
            return tt5.a.DESCENDING;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static wc.f I(String str, Class cls, Object obj2) {
        return new wc.f(obj2, L(obj2, str), Array.newInstance((Class<?>) cls, 0).getClass());
    }

    public static Object J() {
        try {
            Constructor declaredConstructor = AssetManager.class.getDeclaredConstructor(null);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor.newInstance(null);
        } catch (Exception e) {
            throw new zzbl("Failed to invoke default constructor on class ".concat(AssetManager.class.getName()), e);
        }
    }

    public static Object K(Object obj2, String str, Class cls, Class cls2, Serializable serializable) {
        try {
            return cls.cast(M(obj2.getClass(), str, cls2).invoke(obj2, serializable));
        } catch (Exception e) {
            throw new zzbl("Failed to invoke method " + str + " on an object of type " + obj2.getClass(), e);
        }
    }

    public static Field L(Object obj2, String str) {
        for (Class<?> superclass = obj2.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new zzbl(a0.d.s("Failed to find a field named ", str, " on an object of instance ", obj2.getClass().getName()));
    }

    public static Method M(Class cls, String str, Class... clsArr) {
        for (Class superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new zzbl(String.format("Could not find a method named %s with parameters %s in type %s", str, Arrays.asList(clsArr), cls));
    }

    public static final URL a(String source, Map map) {
        Intrinsics.checkNotNullParameter(source, "source");
        StringBuilder sb6 = new StringBuilder(source);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str.length() > 0 && str2 != null && str2.length() != 0) {
                String string = sb6.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb6.append(d0.J(string, "?", false) ? "&" : "?");
                sb6.append(str + '=' + str2);
            }
        }
        return new URL(sb6.toString());
    }

    public static final Map b() {
        return q0.c(new Pair("EXTERNAL", i.EXTERNAL));
    }

    public static final Map c() {
        return r0.k(new Pair("GLOBAL", io3.f.GLOBAL), new Pair("LOCAL", io3.f.LOCAL));
    }

    public static final Map d() {
        return r0.k(new Pair("Base64", io3.a.BASE64), new Pair("URL", io3.a.URL));
    }

    public static final Map e() {
        return r0.k(new Pair("PERSONAL", io3.j.PERSONAL), new Pair("SHARED", io3.j.SHARED));
    }

    public static final Map f() {
        return r0.k(new Pair("ACTIVE", io3.k.ACTIVE), new Pair("INACTIVE", io3.k.INACTIVE), new Pair("DELISTED", io3.k.DELISTED), new Pair("DELETED", io3.k.DELETED), new Pair("COMPLETE", io3.k.COMPLETE), new Pair("UNKNOWN", io3.k.UNKNOWN));
    }

    public static final Map g() {
        return r0.k(new Pair("CURRENT", l.CURRENT), new Pair("SAVINGS", l.SAVINGS), new Pair("STAKING", l.STAKING), new Pair("STAKING_PROXY", l.STAKING_PROXY), new Pair("CRYPTO_EXCHANGE", l.CRYPTO_EXCHANGE), new Pair("REVX_FIAT", l.REVX_FIAT), new Pair("INVESTMENT", l.INVESTMENT), new Pair("CREDIT", l.CREDIT), new Pair("MERCHANT", l.MERCHANT), new Pair("INSTALMENT", l.INSTALMENT), new Pair("VESTING", l.VESTING), new Pair("BLOCKING", l.BLOCKING), new Pair("SAVINGS_INTEREST_BEARING", l.SAVINGS_INTEREST_BEARING), new Pair("COLLATERAL", l.COLLATERAL), new Pair("COLLATERAL_PROXY", l.COLLATERAL_PROXY), new Pair("LOCKED_GIFT", l.LOCKED_GIFT), new Pair("INHERITANCE", l.INHERITANCE), new Pair("UNKNOWN", l.UNKNOWN));
    }

    public static final Map h() {
        return r0.k(new Pair("ACTIVE", fo3.e.ACTIVE), new Pair("LOCKED", fo3.e.LOCKED), new Pair("DELETED", fo3.e.DELETED), new Pair("TERMINATED", fo3.e.TERMINATED));
    }

    public static List i() {
        return u.c(UserDetailsToggles$ConfirmButtonUserDetails.f26225c);
    }

    public static final g j(Object obj2) {
        return new g(new Data(obj2, null, false, 6, null), 2);
    }

    public static final long k(lzi.i iVar, AnalyticsSpendingPeriod$Interval interval) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(interval, "interval");
        int i = lzi.k.f200983a[iVar.ordinal()];
        if (i == 1) {
            return 1L;
        }
        if (i == 2) {
            return rim.d.d(ChronoUnit.DAYS.between(interval.f99210a, interval.f99211b) / 31.0f);
        }
        if (i == 3) {
            return 1L;
        }
        if (i == 4 || i == 5) {
            return ChronoUnit.DAYS.between(interval.f99210a, interval.f99211b);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final m0 l(fii.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        if (gVar != null) {
            return gVar.f135430a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static Enum m(Class cls, String str) {
        return Enum.valueOf(cls, str);
    }

    public static int n(List list, InputStream inputStream, f8.f fVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new x(inputStream, fVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int iD = ((c8.f) list.get(i)).d(inputStream, fVar);
                if (iD != -1) {
                    return iD;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    public static final Action o(xl2.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        List listO = bVar.getF63588g();
        if (listO != null) {
            return (Action) zhm.d0.e0(0, listO);
        }
        return null;
    }

    public static final Action p(xl2.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        List listO = bVar.getF63588g();
        if (listO != null) {
            return (Action) zhm.d0.e0(1, listO);
        }
        return null;
    }

    public static ImageHeaderParser$ImageType q(List list, InputStream inputStream, f8.f fVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new x(inputStream, fVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeA = ((c8.f) list.get(i)).a(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeA != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeA;
                }
            } catch (Throwable th10) {
                inputStream.reset();
                throw th10;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ImageHeaderParser$ImageType r(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeB = ((c8.f) list.get(i)).b(byteBuffer);
                AtomicReference atomicReference = y8.b.f311592a;
                if (imageHeaderParser$ImageTypeB != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeB;
                }
            } catch (Throwable th10) {
                AtomicReference atomicReference2 = y8.b.f311592a;
                throw th10;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static final boolean s(xo0.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        switch (xo0.h.f307544a[gVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 11:
                return true;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean t(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        int i = Build.VERSION.SDK_INT;
        Configuration configuration = activity.getResources().getConfiguration();
        return i >= 30 ? configuration.isNightModeActive() : (configuration.uiMode & 48) == 32;
    }

    public static boolean u(AtomicReference atomicReference, String str) {
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean z = DynamiteModule.getLocalVersion(ch.h.c().b(), str) > 0;
        atomicReference.set(Boolean.valueOf(z));
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final gt3.f v(j1 productType, String str) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        if (str != null) {
            int i = 0;
            switch (ut3.a.f283016a[productType.ordinal()]) {
                case 1:
                    gt3.c[] cVarArrValues = gt3.c.values();
                    int length = cVarArrValues.length;
                    while (i < length) {
                        gt3.c cVar = cVarArrValues[i];
                        if (a0.z(cVar.name(), str, true)) {
                            return cVar;
                        }
                        i++;
                    }
                    break;
                case 2:
                    d[] dVarArrValues = d.values();
                    int length2 = dVarArrValues.length;
                    while (i < length2) {
                        d dVar = dVarArrValues[i];
                        if (a0.z(dVar.name(), str, true)) {
                            return dVar;
                        }
                        i++;
                    }
                    break;
                case 3:
                    gt3.e[] eVarArrValues = gt3.e.values();
                    int length3 = eVarArrValues.length;
                    while (i < length3) {
                        gt3.e eVar = eVarArrValues[i];
                        if (a0.z(eVar.name(), str, true)) {
                            return eVar;
                        }
                        i++;
                    }
                    break;
                case 4:
                    gt3.b[] bVarArrValues = gt3.b.values();
                    int length4 = bVarArrValues.length;
                    while (i < length4) {
                        gt3.b bVar = bVarArrValues[i];
                        if (a0.z(bVar.name(), str, true)) {
                            return bVar;
                        }
                        i++;
                    }
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }

    public static final r w(r rVar, xi0.b currency) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(currency, "currency");
        r map = rVar.map(new hp5.b(new p(29, currency), 18));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public static final jhi.k x(Flow flow, Object obj2) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return new jhi.k(flow, obj2, 3);
    }

    public static final io3.d y(b9c.e eVar) {
        Object next;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Iterator it8 = eVar.f13704c.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((io3.d) next).f163145a, eVar.d)) {
                break;
            }
        }
        return (io3.d) next;
    }

    public static final String z(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iS = d0.S(str, '?', 0, 6);
        if (iS == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iS);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }
}
