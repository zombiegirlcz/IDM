package bbk;

import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i12.a f14318b;

    public /* synthetic */ b0(i12.a aVar, int i) {
        this.f14317a = i;
        this.f14318b = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f14317a) {
            case 0:
                return i.a((i) obj2, false, null, null, null, ((i12.b) this.f14318b).f157527a, 15);
            case 1:
                return i52.b.a((i52.b) obj2, null, ((i12.b) this.f14318b).f157527a, 255);
            default:
                return t42.b.a((t42.b) obj2, null, null, 0, ((i12.b) this.f14318b).f157527a, CertificateBody.profileType);
        }
    }
}
