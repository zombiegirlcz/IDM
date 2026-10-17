package mx0;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit.views.ActionsView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionsView f209590b;

    public /* synthetic */ b(ActionsView actionsView, int i) {
        this.f209589a = i;
        this.f209590b = actionsView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f209589a) {
            case 0:
                break;
            case 1:
                RowDelegate.Model model = (RowDelegate.Model) obj2;
                ActionsView actionsView = this.f209590b;
                rp0.m mVar = actionsView.u;
                if (mVar != null) {
                    mVar.b(false);
                }
                e01.a aVar = actionsView.f58296a;
                Object obj3 = model.u;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.core.ui_kit.views.ActionsView.Item");
                aVar.b((ActionsView.Item) obj3);
                break;
            default:
                e01.a aVar2 = this.f209590b.f58296a;
                Object f52249j = ((PopupMenuItem) obj2).getD();
                Intrinsics.i(f52249j, "null cannot be cast to non-null type com.revolut.core.ui_kit.views.ActionsView.Item");
                aVar2.b((ActionsView.Item) f52249j);
                break;
        }
        return Unit.f186387a;
    }
}
