package op0;

import com.revolut.core.ui_kit.delegates.IconDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class d5 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.core.ui_kit.delegates.widgets.y4 f227230b;

    public /* synthetic */ d5(com.revolut.core.ui_kit.delegates.widgets.y4 y4Var, int i) {
        this.f227229a = i;
        this.f227230b = y4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f227229a) {
            case 0:
                Object obj3 = ((IconDelegate.Model) obj2).i;
                com.revolut.core.ui_kit.delegates.widgets.v4 v4Var = obj3 instanceof com.revolut.core.ui_kit.delegates.widgets.v4 ? (com.revolut.core.ui_kit.delegates.widgets.v4) obj3 : null;
                if (v4Var != null) {
                    this.f227230b.f55570r.invoke(v4Var);
                }
                break;
            default:
                this.f227230b.f55571s.invoke();
                break;
        }
        return Unit.f186387a;
    }
}
