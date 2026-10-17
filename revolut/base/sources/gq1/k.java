package gq1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f145514b;

    public /* synthetic */ k(l lVar, int i) {
        this.f145513a = i;
        this.f145514b = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f145513a) {
            case 0:
                l lVar = this.f145514b;
                lVar.l2(new ge7.f(lVar, null, 22), new yi5.b(26));
                break;
            default:
                l lVar2 = this.f145514b;
                lVar2.l2(new ge7.f(lVar2, null, 22), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
