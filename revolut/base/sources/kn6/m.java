package kn6;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f186025b;

    public /* synthetic */ m(n nVar, int i) {
        this.f186024a = i;
        this.f186025b = nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f186024a) {
            case 0:
                this.f186025b.C2(h.f186020a);
                break;
            case 1:
                this.f186025b.C2(i.f186021a);
                break;
            case 2:
                this.f186025b.C2(j.f186022a);
                break;
            case 3:
                this.f186025b.C2(h.f186020a);
                break;
            default:
                this.f186025b.C2(i.f186021a);
                break;
        }
        return Unit.f186387a;
    }
}
