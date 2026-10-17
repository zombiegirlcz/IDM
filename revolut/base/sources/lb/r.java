package lb;

import com.fourthline.kyc.Document;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193516a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Document f193517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.fourthline.kyc.internal.g f193518c;

    public /* synthetic */ r(Document document, com.fourthline.kyc.internal.g gVar) {
        this.f193517b = document;
        this.f193518c = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f193516a) {
            case 0:
                return com.fourthline.kyc.internal.g.a(this.f193518c, this.f193517b, (com.fourthline.kyc.internal.e) obj2);
            default:
                return com.fourthline.kyc.internal.g.a(this.f193517b, this.f193518c, (com.fourthline.kyc.internal.e) obj2);
        }
    }

    public /* synthetic */ r(com.fourthline.kyc.internal.g gVar, Document document) {
        this.f193518c = gVar;
        this.f193517b = document;
    }
}
