package ip0;

import com.revolut.core.ui_kit.delegates.ChatContextualChartDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class ja implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChatContextualChartDelegate.Model f164809b;

    public /* synthetic */ ja(ChatContextualChartDelegate.Model model, int i) {
        this.f164808a = i;
        this.f164809b = model;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f164808a;
        ChatContextualChartDelegate.Model model = this.f164809b;
        switch (i) {
            case 0:
                com.revolut.core.ui_kit.delegates.g6 it8 = (com.revolut.core.ui_kit.delegates.g6) obj2;
                ChatContextualChartDelegate.Companion aVar = ChatContextualChartDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new com.revolut.core.ui_kit.delegates.h3(model, it8);
            case 1:
                TrendViewDelegate.a it9 = (TrendViewDelegate.a) obj2;
                ChatContextualChartDelegate.Companion aVar2 = ChatContextualChartDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new com.revolut.core.ui_kit.delegates.f3(model, it9);
            default:
                ChatContextualChartDelegate.Companion aVar3 = ChatContextualChartDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter((HeaderDelegate.Model) obj2, "it");
                return new com.revolut.core.ui_kit.delegates.g3(model);
        }
    }
}
