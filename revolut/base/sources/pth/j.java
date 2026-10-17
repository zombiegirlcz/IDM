package pth;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.workflow.engine.onboarding.impl.workflow.a f239696b;

    public /* synthetic */ j(com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar, int i) {
        this.f239695a = i;
        this.f239696b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f239695a) {
            case 0:
                this.f239696b.C2(til.n.f271581a);
                break;
            case 1:
                this.f239696b.C2(til.n.f271581a);
                break;
            default:
                this.f239696b.W2();
                break;
        }
        return Unit.f186387a;
    }
}
