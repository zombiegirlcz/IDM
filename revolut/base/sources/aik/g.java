package aik;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oki.g f5306b;

    public /* synthetic */ g(oki.g gVar, int i) {
        this.f5305a = i;
        this.f5306b = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f5305a) {
            case 0:
                this.f5306b.pop();
                break;
            case 1:
                this.f5306b.pop();
                break;
            case 2:
                this.f5306b.pop();
                break;
            case 3:
                this.f5306b.pop();
                break;
            default:
                this.f5306b.pop();
                break;
        }
        return Unit.f186387a;
    }
}
