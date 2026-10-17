package ip0;

import com.revolut.core.ui_kit.delegates.ChatItemsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class la implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChatItemsDelegate.Model f165152b;

    public /* synthetic */ la(ChatItemsDelegate.Model model, int i) {
        this.f165151a = i;
        this.f165152b = model;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f165151a;
        ChatItemsDelegate.Model model = this.f165152b;
        switch (i) {
            case 0:
                FullScreenStateDelegate.Model it8 = (FullScreenStateDelegate.Model) obj2;
                ChatItemsDelegate.Companion aVar = ChatItemsDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new com.revolut.core.ui_kit.delegates.i3(model, it8);
            case 1:
                LargeActionButtonDelegate.Model it9 = (LargeActionButtonDelegate.Model) obj2;
                ChatItemsDelegate.Companion aVar2 = ChatItemsDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new com.revolut.core.ui_kit.delegates.i3(model, it9);
            case 2:
                RowDelegate.Model it10 = (RowDelegate.Model) obj2;
                ChatItemsDelegate.Companion aVar3 = ChatItemsDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new com.revolut.core.ui_kit.delegates.i3(model, it10);
            default:
                RowDelegate.Model it11 = (RowDelegate.Model) obj2;
                ChatItemsDelegate.Companion aVar4 = ChatItemsDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new com.revolut.core.ui_kit.delegates.i3(model, it11);
        }
    }
}
