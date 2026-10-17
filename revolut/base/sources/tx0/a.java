package tx0;

import aw0.x8;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AccountSelectionNavBarContentView f275077b;

    public /* synthetic */ a(AccountSelectionNavBarContentView accountSelectionNavBarContentView, int i) {
        this.f275076a = i;
        this.f275077b = accountSelectionNavBarContentView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f275076a) {
            case 0:
                ihm.f fVar = this.f275077b.i;
                Unit unit = Unit.f186387a;
                fVar.onNext(unit);
                return unit;
            case 1:
                x8 x8Var = (x8) obj2;
                u2 u2Var = this.f275077b.B;
                if (u2Var != null) {
                    u2Var.a(x8Var.f10609a, x8Var.f10610b, x8Var.f10611c, x8Var.e);
                }
                return Unit.f186387a;
            case 2:
                x8 x8Var2 = (x8) obj2;
                u2 u2Var2 = this.f275077b.B;
                if (u2Var2 != null) {
                    u2Var2.a(x8Var2.f10609a, x8Var2.f10610b, x8Var2.f10611c, x8Var2.e);
                }
                return Unit.f186387a;
            case 3:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                this.f275077b.f59178t.onNext(null);
                throw null;
            case 4:
                this.f275077b.f59171l.onNext((Unit) obj2);
                return Unit.f186387a;
            case 5:
                ihm.f fVar2 = this.f275077b.f59172m;
                Unit unit2 = Unit.f186387a;
                fVar2.onNext(unit2);
                return unit2;
            case 6:
                this.f275077b.f59177s.onNext((Unit) obj2);
                return Unit.f186387a;
            default:
                this.f275077b.o.onNext((ActionsView.Item) obj2);
                return Unit.f186387a;
        }
    }
}
