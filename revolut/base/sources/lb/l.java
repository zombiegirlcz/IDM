package lb;

import com.fourthline.kyc.SecondaryDocument;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fourthline.kyc.internal.g f193501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SecondaryDocument f193502c;

    public /* synthetic */ l(SecondaryDocument secondaryDocument, com.fourthline.kyc.internal.g gVar) {
        this.f193500a = 2;
        this.f193502c = secondaryDocument;
        this.f193501b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f193500a) {
            case 0:
                return com.fourthline.kyc.internal.g.a(this.f193501b, this.f193502c, (com.fourthline.kyc.internal.e) obj2);
            case 1:
                return com.fourthline.kyc.internal.g.b(this.f193501b, this.f193502c, (com.fourthline.kyc.internal.e) obj2);
            default:
                return com.fourthline.kyc.internal.g.a(this.f193502c, this.f193501b, (com.fourthline.kyc.internal.e) obj2);
        }
    }

    public /* synthetic */ l(com.fourthline.kyc.internal.g gVar, SecondaryDocument secondaryDocument, int i) {
        this.f193500a = i;
        this.f193501b = gVar;
        this.f193502c = secondaryDocument;
    }
}
