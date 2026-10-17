package lb;

import com.fourthline.kyc.KycInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fourthline.kyc.internal.g f193486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ KycInfo f193487c;

    public /* synthetic */ f(KycInfo kycInfo, com.fourthline.kyc.internal.g gVar) {
        this.f193485a = 0;
        this.f193487c = kycInfo;
        this.f193486b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f193485a) {
            case 0:
                return com.fourthline.kyc.internal.g.a(this.f193487c, this.f193486b, (com.fourthline.kyc.internal.e) obj2);
            case 1:
                return com.fourthline.kyc.internal.g.a(this.f193486b, this.f193487c, (com.fourthline.kyc.internal.e) obj2);
            default:
                return com.fourthline.kyc.internal.g.b(this.f193486b, this.f193487c, (com.fourthline.kyc.internal.e) obj2);
        }
    }

    public /* synthetic */ f(com.fourthline.kyc.internal.g gVar, KycInfo kycInfo, int i) {
        this.f193485a = i;
        this.f193486b = gVar;
        this.f193487c = kycInfo;
    }
}
