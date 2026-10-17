package r40;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class m0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f251353b;

    public /* synthetic */ m0(x0 x0Var, int i) {
        this.f251352a = i;
        this.f251353b = x0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f251352a) {
            case 0:
                x0 x0Var = this.f251353b;
                break;
            case 1:
                this.f251353b.x2(new r2d.d(25));
                break;
            default:
                zhm.f0 f0Var = zhm.f0.f322471a;
                x0 x0Var2 = this.f251353b;
                x0Var2.D2(f0Var);
                x0Var2.x2(new r2d.d(24));
                break;
        }
        return Unit.f186387a;
    }
}
