package lb;

import com.fourthline.core.location.Coordinate;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Coordinate f193484b;

    public /* synthetic */ e(Coordinate coordinate, int i) {
        this.f193483a = i;
        this.f193484b = coordinate;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f193483a) {
            case 0:
                return com.fourthline.kyc.internal.g.c(this.f193484b, (com.fourthline.kyc.internal.e) obj2);
            case 1:
                return com.fourthline.kyc.internal.g.i(this.f193484b, (com.fourthline.kyc.internal.e) obj2);
            case 2:
                return com.fourthline.kyc.internal.g.j(this.f193484b, (com.fourthline.kyc.internal.e) obj2);
            case 3:
                return com.fourthline.kyc.internal.g.d(this.f193484b, (com.fourthline.kyc.internal.e) obj2);
            case 4:
                return com.fourthline.kyc.internal.g.g(this.f193484b, (com.fourthline.kyc.internal.e) obj2);
            case 5:
                return com.fourthline.kyc.internal.g.h(this.f193484b, (com.fourthline.kyc.internal.e) obj2);
            case 6:
                return com.fourthline.kyc.internal.g.e(this.f193484b, (com.fourthline.kyc.internal.e) obj2);
            case 7:
                return com.fourthline.kyc.internal.g.f(this.f193484b, (com.fourthline.kyc.internal.e) obj2);
            case 8:
                return com.fourthline.kyc.internal.g.a(this.f193484b, (com.fourthline.kyc.internal.e) obj2);
            case 9:
                return com.fourthline.kyc.internal.g.b(this.f193484b, (com.fourthline.kyc.internal.e) obj2);
            case 10:
                return com.fourthline.kyc.internal.g.k(this.f193484b, (com.fourthline.kyc.internal.e) obj2);
            default:
                return com.fourthline.kyc.internal.g.l(this.f193484b, (com.fourthline.kyc.internal.e) obj2);
        }
    }
}
