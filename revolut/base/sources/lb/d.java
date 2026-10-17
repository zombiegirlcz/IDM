package lb;

import com.fourthline.kyc.Document;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Document f193482b;

    public /* synthetic */ d(Document document, int i) {
        this.f193481a = i;
        this.f193482b = document;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f193481a) {
            case 0:
                return com.fourthline.kyc.internal.g.a(this.f193482b, (com.fourthline.kyc.internal.e) obj2);
            case 1:
                return com.fourthline.kyc.internal.g.b(this.f193482b, (com.fourthline.kyc.internal.e) obj2);
            default:
                return com.fourthline.kyc.internal.g.c(this.f193482b, (com.fourthline.kyc.internal.e) obj2);
        }
    }
}
