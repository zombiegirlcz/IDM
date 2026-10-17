package lb;

import com.fourthline.kyc.QesAttachment;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ QesAttachment f193492b;

    public /* synthetic */ h(QesAttachment qesAttachment, int i) {
        this.f193491a = i;
        this.f193492b = qesAttachment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f193491a) {
            case 0:
                return com.fourthline.kyc.internal.g.b(this.f193492b, (com.fourthline.kyc.internal.e) obj2);
            case 1:
                return com.fourthline.kyc.internal.g.c(this.f193492b, (com.fourthline.kyc.internal.e) obj2);
            default:
                return com.fourthline.kyc.internal.g.a(this.f193492b, (com.fourthline.kyc.internal.e) obj2);
        }
    }
}
