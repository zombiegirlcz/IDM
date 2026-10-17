package dmj;

import com.revolut.retail.feature.esim.api.model.EsimTermsConsent;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f116146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EsimTermsConsent f116147c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ d0(Map map, EsimTermsConsent esimTermsConsent, boolean z, int i) {
        this.f116145a = i;
        this.f116146b = map;
        this.f116147c = esimTermsConsent;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f116145a) {
            case 0:
                a0 update = (a0) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return a0.a(update, null, null, null, null, null, null, false, zhm.r0.q(this.f116146b, new Pair(this.f116147c, Boolean.valueOf(!this.d))), CertificateBody.profileType);
            default:
                njj.b0 update2 = (njj.b0) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return njj.b0.a(update2, null, null, null, null, null, null, null, false, zhm.r0.q(this.f116146b, new Pair(this.f116147c, Boolean.valueOf(!this.d))), 255);
        }
    }
}
