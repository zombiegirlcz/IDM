package org.bouncycastle.jcajce.provider.digest;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.widgets.api.exception.WidgetNotAvailableException;
import e4m.b;
import e4m.e;
import ey.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.pqc.crypto.lms.LMSigParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters;
import org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyFactorySpi;
import org.jmrtd.ASN1Util;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.tz.NameProvider;
import ove.w;
import oz9.c;
import oz9.h;
import p12.f0;
import p2k.g;
import p2k.i;
import p2k.k;
import p2k.n;
import p2k.x;
import p2k.y;
import ppd.i0;
import prk.g0;
import prk.j;
import vkm.v1;

/* JADX INFO: loaded from: classes14.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ boolean A(AtomicReference atomicReference, NameProvider nameProvider) {
        while (!atomicReference.compareAndSet(null, nameProvider)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean B(AtomicReferenceArray atomicReferenceArray, int i, DateTimeFormatter dateTimeFormatter) {
        while (!atomicReferenceArray.compareAndSet(i, null, dateTimeFormatter)) {
            if (atomicReferenceArray.get(i) != null) {
                return false;
            }
        }
        return true;
    }

    public static e C(c cVar, h hVar, int i) {
        return b.b(new w(cVar, hVar, i, 16));
    }

    public static void D(BouncyCastleProvider bouncyCastleProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        bouncyCastleProvider.addKeyInfoConverter(aSN1ObjectIdentifier, new SPHINCSPlusKeyFactorySpi());
    }

    public static int a(Parcelable.Creator creator, Parcel parcel, ArrayList arrayList, int i, int i2) {
        arrayList.add(creator.createFromParcel(parcel));
        return i + i2;
    }

    public static int b(ResourceImage resourceImage, int i, int i2) {
        return (resourceImage.hashCode() + i) * i2;
    }

    public static int c(CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration, int i, int i2) {
        return (creditApplicationPluginFlowContract$Configuration.hashCode() + i) * i2;
    }

    public static int d(ej0.b bVar, int i, int i2) {
        return (bVar.hashCode() + i) * i2;
    }

    public static e e(ey.b bVar, d dVar, int i) {
        return b.b(new w(bVar, dVar, i, 9));
    }

    public static e f(ey.b bVar, oz.c cVar, int i) {
        return b.b(new w(bVar, cVar, i, 10));
    }

    public static e g(c cVar, h hVar, int i) {
        return b.b(new w(cVar, hVar, i, 15));
    }

    public static e h(n nVar, i iVar, g gVar, int i) {
        return b.b(new ned.h(nVar, iVar, gVar, i, 23));
    }

    public static e i(n nVar, i iVar, k kVar, int i) {
        return b.b(new ned.h(nVar, iVar, kVar, i, 24));
    }

    public static e j(x xVar, y yVar, int i) {
        return b.b(new f0(xVar, yVar, i, 11));
    }

    public static e k(g0 g0Var, j jVar, int i) {
        return b.b(new i0(g0Var, jVar, i, 19));
    }

    public static e l(g0 g0Var, prk.k kVar, int i) {
        return b.b(new i0(g0Var, kVar, i, 20));
    }

    public static Object m(Data data, Data data2, String str, String str2) {
        Intrinsics.checkNotNullParameter(data, str);
        Intrinsics.checkNotNullParameter(data2, str2);
        return data.getContent();
    }

    public static StringBuilder n(String str, String str2, String str3, String str4, ConfigurableProvider configurableProvider) {
        configurableProvider.addAlgorithm(str, str2);
        configurableProvider.addAlgorithm(str3, str4);
        return new StringBuilder();
    }

    public static StringBuilder o(String str, String str2, String str3, StringBuilder sb6, ConfigurableProvider configurableProvider) {
        sb6.append(str);
        configurableProvider.addAlgorithm(str2, sb6.toString());
        StringBuilder sb9 = new StringBuilder();
        sb9.append(str3);
        return sb9;
    }

    public static StringBuilder p(String str, String str2, StringBuilder sb6, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider) {
        sb6.append(str);
        configurableProvider.addAlgorithm(str2, aSN1ObjectIdentifier, sb6.toString());
        return new StringBuilder();
    }

    public static StringBuilder q(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm(str, aSN1ObjectIdentifier, str2);
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str3);
        return sb6;
    }

    public static ECFieldElement r(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return eCFieldElement.square().add(eCFieldElement2).add(eCFieldElement3);
    }

    public static v1 s(int i, String str) {
        return ta6.a.j(new WidgetNotAvailableException(str, i));
    }

    public static void t(int i, int i2, ASN1ObjectIdentifier aSN1ObjectIdentifier, HashMap map, Integer num) {
        map.put(num, new XMSSMTParameters(i, i2, aSN1ObjectIdentifier));
    }

    public static void u(Parcel parcel, int i, hel.b bVar) {
        parcel.writeInt(i);
        parcel.writeString(bVar.name());
    }

    public static void v(Parcel parcel, int i, Double d) {
        parcel.writeInt(i);
        parcel.writeDouble(d.doubleValue());
    }

    public static void w(Boolean bool, HashMap map, Integer num) {
        map.put(num, ASN1Util.encodeBoolean(bool.booleanValue()));
    }

    public static void x(BouncyCastleProvider bouncyCastleProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        bouncyCastleProvider.addKeyInfoConverter(aSN1ObjectIdentifier, new SnovaKeyFactorySpi());
    }

    public static void y(LMSigParameters lMSigParameters, LMSigParameters.AnonymousClass1 anonymousClass1, LMSigParameters lMSigParameters2) {
        anonymousClass1.put(Integer.valueOf(lMSigParameters.type), lMSigParameters2);
    }

    public static /* synthetic */ boolean z(AtomicReference atomicReference, Map map) {
        while (!atomicReference.compareAndSet(null, map)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }
}
