package lb;

import com.fourthline.kyc.Document;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193488a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Document f193489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Document f193490c;
    public final /* synthetic */ com.fourthline.kyc.internal.g d;

    public /* synthetic */ g(Document document, Document document2, com.fourthline.kyc.internal.g gVar) {
        this.f193489b = document;
        this.f193490c = document2;
        this.d = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f193488a) {
            case 0:
                return com.fourthline.kyc.internal.g.a(this.f193489b, this.d, this.f193490c, (com.fourthline.kyc.internal.e) obj2);
            default:
                return com.fourthline.kyc.internal.g.a(this.f193489b, this.f193490c, this.d, (com.fourthline.kyc.internal.e) obj2);
        }
    }

    public /* synthetic */ g(Document document, com.fourthline.kyc.internal.g gVar, Document document2) {
        this.f193489b = document;
        this.d = gVar;
        this.f193490c = document2;
    }
}
