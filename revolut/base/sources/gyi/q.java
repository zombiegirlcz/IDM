package gyi;

import com.revolut.core.ui_kit.models.ProfileCardModel;
import com.revolut.core.ui_kit.views.ActionsView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f147903b;

    public /* synthetic */ q(r rVar, int i) {
        this.f147902a = i;
        this.f147903b = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f147902a) {
            case 0:
                this.f147903b.f.invoke();
                break;
            case 1:
                ActionsView.Item item = (ActionsView.Item) obj2;
                this.f147903b.f147904g.invoke(new g(item.f58316a, item.f58324n));
                break;
            case 2:
                ProfileCardModel.CircleActionButtonModel circleActionButtonModel = (ProfileCardModel.CircleActionButtonModel) obj2;
                this.f147903b.f147904g.invoke(new g(circleActionButtonModel.f57917a, circleActionButtonModel.d));
                break;
            default:
                com.revolut.core.ui_kit.models.b0 b0Var = (com.revolut.core.ui_kit.models.b0) obj2;
                if (b0Var.d) {
                    this.f147903b.f147904g.invoke(new g("gifted_info", b0Var.e));
                }
                break;
        }
        return Unit.f186387a;
    }
}
