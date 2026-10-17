package ip0;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionWidgetDelegate.Model f165597b;

    public /* synthetic */ o(ActionWidgetDelegate.Model model, int i) {
        this.f165596a = i;
        this.f165597b = model;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f165596a) {
            case 0:
                ActionWidgetDelegate.a action = (ActionWidgetDelegate.a) obj2;
                Intrinsics.checkNotNullParameter(action, "action");
                return new com.revolut.core.ui_kit.delegates.t(action, this.f165597b);
            default:
                Boolean it8 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new Pair(this.f165597b, it8);
        }
    }
}
