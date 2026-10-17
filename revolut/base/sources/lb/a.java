package lb;

import com.fourthline.kyc.Attachment;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Attachment.Selfie f193475b;

    public /* synthetic */ a(Attachment.Selfie selfie, int i) {
        this.f193474a = i;
        this.f193475b = selfie;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f193474a) {
            case 0:
                return com.fourthline.kyc.internal.g.d(this.f193475b, (com.fourthline.kyc.internal.e) obj2);
            case 1:
                return com.fourthline.kyc.internal.g.f(this.f193475b, (com.fourthline.kyc.internal.e) obj2);
            case 2:
                return com.fourthline.kyc.internal.g.b(this.f193475b, (com.fourthline.kyc.internal.e) obj2);
            case 3:
                return com.fourthline.kyc.internal.g.c(this.f193475b, (com.fourthline.kyc.internal.e) obj2);
            case 4:
                return com.fourthline.kyc.internal.g.e(this.f193475b, (com.fourthline.kyc.internal.e) obj2);
            default:
                return com.fourthline.kyc.internal.g.a(this.f193475b, (com.fourthline.kyc.internal.e) obj2);
        }
    }
}
