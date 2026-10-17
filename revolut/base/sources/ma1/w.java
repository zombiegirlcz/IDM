package ma1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lal.a f203912b;

    public /* synthetic */ w(lal.a aVar, int i) {
        this.f203911a = i;
        this.f203912b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f203911a) {
            case 0:
                this.f203912b.f193426b = (fa1.y) obj2;
                break;
            case 1:
                this.f203912b.f193427c = (Throwable) obj2;
                break;
            case 2:
                this.f203912b.f193426b = (fa1.y) obj2;
                break;
            default:
                this.f203912b.f193427c = (Throwable) obj2;
                break;
        }
        return Unit.f186387a;
    }
}
