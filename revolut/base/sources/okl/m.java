package okl;

import android.content.Context;
import android.os.Parcel;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.internal.views.chart.HistogramView;
import com.revolut.retail.core.navigation.FinishCommand;
import java.io.IOException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.jcajce.provider.asymmetric.EC;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.util.Arrays;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class m {
    public static void A(StringBuilder sb6, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider, String str) {
        sb6.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb6.toString(), str);
    }

    public static void B(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm(str3, aSN1ObjectIdentifier, str + str2);
    }

    public static byte[] C(ASN1Sequence aSN1Sequence, int i) {
        return Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i)).getOctets());
    }

    public static StringBuilder D(String str, String str2, StringBuilder sb6, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider) {
        sb6.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb6.toString(), str);
        StringBuilder sb9 = new StringBuilder();
        sb9.append(str2);
        return sb9;
    }

    public static int a(HistogramView histogramView, String str, float f) {
        Context context = histogramView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, str);
        return kli.a.k(context, f);
    }

    public static int b(op0.q qVar, int i, int i2) {
        return (qVar.hashCode() + i) * i2;
    }

    public static int c(op0.r rVar, int i, int i2) {
        return (rVar.hashCode() + i) * i2;
    }

    public static int d(oq9.o oVar, int i, int i2) {
        return (oVar.hashCode() + i) * i2;
    }

    public static int e(ASN1Sequence aSN1Sequence, int i) {
        return ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i)).intValueExact();
    }

    public static String f(IOException iOException, StringBuilder sb6) {
        sb6.append(iOException.getMessage());
        return sb6.toString();
    }

    public static String g(Exception exc2, StringBuilder sb6) {
        sb6.append(exc2.toString());
        return sb6.toString();
    }

    public static String h(String str, String str2, String str3, String str4, ConfigurableProvider configurableProvider) {
        configurableProvider.addAlgorithm(str, str2);
        return str3 + str4;
    }

    public static String i(String str, AlgorithmParameterSpec algorithmParameterSpec) {
        return str + algorithmParameterSpec;
    }

    public static String j(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return str + aSN1ObjectIdentifier;
    }

    public static String k(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str2) {
        return str + aSN1ObjectIdentifier + str2;
    }

    public static String l(String str, CipherParameters cipherParameters) {
        return str.concat(cipherParameters.getClass().getName());
    }

    public static String m(Key key, StringBuilder sb6, String str) {
        sb6.append(key.getClass());
        sb6.append(str);
        return sb6.toString();
    }

    public static String n(ASN1Sequence aSN1Sequence, StringBuilder sb6) {
        sb6.append(aSN1Sequence.size());
        return sb6.toString();
    }

    public static String o(ASN1TaggedObject aSN1TaggedObject, StringBuilder sb6) {
        sb6.append(aSN1TaggedObject.getTagNo());
        return sb6.toString();
    }

    public static String p(j2 j2Var, kotlin.jvm.internal.p0 p0Var) {
        return p0Var.b(j2Var.getValue().getClass()).m();
    }

    public static StringBuilder q(String str, String str2, String str3, String str4, ConfigurableProvider configurableProvider) {
        configurableProvider.addAlgorithm(str3, str + str2);
        return new StringBuilder(str4);
    }

    public static StringBuilder r(String str, String str2, String str3, StringBuilder sb6, ConfigurableProvider configurableProvider) {
        sb6.append(str);
        sb6.append(str2);
        configurableProvider.addAlgorithm(str3, sb6.toString());
        return new StringBuilder();
    }

    public static StringBuilder s(String str, String str2, StringBuilder sb6, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider) {
        sb6.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb6.toString(), str);
        return new StringBuilder(str2);
    }

    public static StringBuilder t(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm(str, str2);
        return new StringBuilder(str3);
    }

    public static Map u(String str, String str2, String str3, String str4, ConfigurableProvider configurableProvider) {
        configurableProvider.addAlgorithm(str, str2, EC.generalEcAttributes);
        configurableProvider.addAlgorithm(str3, str4, EC.generalEcAttributes);
        return EC.generalEcAttributes;
    }

    public static ASN1ObjectIdentifier v(String str) {
        return new ASN1ObjectIdentifier(str).intern();
    }

    public static pfm.h w(Integer num, Map map, FinishCommand.Mode mode, int i, ln.a aVar) {
        return aVar.a(new FinishCommand(num, map, mode, i));
    }

    public static void x(com.google.protobuf.w0 w0Var, Parcel parcel, int i) {
        parcel.writeParcelable(new AnalyticsContext(w0Var), i);
    }

    public static void y(String str, String str2, String str3, StringBuilder sb6, ConfigurableProvider configurableProvider) {
        sb6.append(str);
        sb6.append(str2);
        configurableProvider.addAlgorithm(str3, sb6.toString());
    }

    public static void z(StringBuilder sb6, String str, ConfigurableProvider configurableProvider, String str2) {
        sb6.append(str);
        configurableProvider.addAlgorithm(str2, sb6.toString());
    }
}
