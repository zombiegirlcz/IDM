package lb;

import com.fourthline.kyc.Attachment;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193510a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Attachment.Document f193511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.fourthline.kyc.internal.g f193512c;

    public /* synthetic */ p(Attachment.Document document, com.fourthline.kyc.internal.g gVar) {
        this.f193511b = document;
        this.f193512c = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f193510a) {
            case 0:
                return com.fourthline.kyc.internal.g.a(this.f193512c, this.f193511b, (com.fourthline.kyc.internal.e) obj2);
            default:
                return com.fourthline.kyc.internal.g.a(this.f193511b, this.f193512c, (com.fourthline.kyc.internal.e) obj2);
        }
    }

    public /* synthetic */ p(com.fourthline.kyc.internal.g gVar, Attachment.Document document) {
        this.f193512c = gVar;
        this.f193511b = document;
    }
}
