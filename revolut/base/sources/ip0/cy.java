package ip0;

import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class cy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.core.ui_kit.delegates.o9 f163804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NewRevolutCardDelegate.Model f163805c;

    public /* synthetic */ cy(NewRevolutCardDelegate newRevolutCardDelegate, com.revolut.core.ui_kit.delegates.o9 o9Var, NewRevolutCardDelegate.Model model, int i) {
        this.f163803a = i;
        this.f163804b = o9Var;
        this.f163805c = model;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Unit it8 = (Unit) obj2;
        switch (this.f163803a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.core.ui_kit.delegates.o9 o9Var = this.f163804b;
                NewRevolutCardDelegate.Model model = this.f163805c;
                NewRevolutCardDelegate.q(o9Var, "card_view.copy_pan", model);
                return model;
            case 1:
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.core.ui_kit.delegates.o9 o9Var2 = this.f163804b;
                NewRevolutCardDelegate.Model model2 = this.f163805c;
                NewRevolutCardDelegate.q(o9Var2, "card_view.copy_cvv", model2);
                return model2;
            case 2:
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.core.ui_kit.delegates.o9 o9Var3 = this.f163804b;
                NewRevolutCardDelegate.Model model3 = this.f163805c;
                NewRevolutCardDelegate.q(o9Var3, "card_view.tag", model3);
                return model3;
            case 3:
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.core.ui_kit.delegates.o9 o9Var4 = this.f163804b;
                NewRevolutCardDelegate.Model model4 = this.f163805c;
                NewRevolutCardDelegate.q(o9Var4, "card_view.secondary_tag", model4);
                return model4;
            case 4:
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.core.ui_kit.delegates.o9 o9Var5 = this.f163804b;
                NewRevolutCardDelegate.Model model5 = this.f163805c;
                NewRevolutCardDelegate.q(o9Var5, "card_view.label", model5);
                return model5;
            case 5:
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.core.ui_kit.delegates.o9 o9Var6 = this.f163804b;
                NewRevolutCardDelegate.Model model6 = this.f163805c;
                NewRevolutCardDelegate.q(o9Var6, "card_view.front_click", model6);
                return model6;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.core.ui_kit.delegates.o9 o9Var7 = this.f163804b;
                NewRevolutCardDelegate.Model model7 = this.f163805c;
                NewRevolutCardDelegate.q(o9Var7, "card_view.back_click", model7);
                return model7;
        }
    }
}
