package lu0;

import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.transition.TransitionManager;
import com.revolut.core.ui_kit.internal.views.reactionskeyboard.ReactionsKeyboardTabs;
import java.util.ArrayList;
import java.util.List;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class s implements ListUpdateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReactionsKeyboardTabs f200005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f200006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f200007c;

    public s(ReactionsKeyboardTabs reactionsKeyboardTabs, List list, String str) {
        this.f200005a = reactionsKeyboardTabs;
        this.f200006b = list;
        this.f200007c = str;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public final void onChanged(int i, int i2, Object obj2) {
        ReactionsKeyboardTabs.i(this.f200005a, this.f200006b, this.f200007c);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public final void onInserted(int i, int i2) {
        List list = this.f200006b;
        ReactionsKeyboardTabs reactionsKeyboardTabs = this.f200005a;
        if (i2 != 1 || i < 0 || i >= list.size()) {
            ReactionsKeyboardTabs.i(reactionsKeyboardTabs, list, this.f200007c);
            return;
        }
        com.revolut.core.ui_kit.internal.views.reactionskeyboard.a aVar = (com.revolut.core.ui_kit.internal.views.reactionskeyboard.a) list.get(i);
        ReactionsKeyboardTabs.Companion companion = ReactionsKeyboardTabs.INSTANCE;
        reactionsKeyboardTabs.j();
        reactionsKeyboardTabs.getReactionsKeyboardTabs_tabLayout().b(reactionsKeyboardTabs.k(aVar), i, false);
        reactionsKeyboardTabs.f = list;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public final void onMoved(int i, int i2) {
        ReactionsKeyboardTabs.i(this.f200005a, this.f200006b, this.f200007c);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public final void onRemoved(int i, int i2) {
        if (i >= 0) {
            ReactionsKeyboardTabs reactionsKeyboardTabs = this.f200005a;
            if (i < reactionsKeyboardTabs.f.size()) {
                ReactionsKeyboardTabs.Companion companion = ReactionsKeyboardTabs.INSTANCE;
                reactionsKeyboardTabs.n(this.f200007c, true, true);
                ArrayList arrayListF1 = d0.f1(reactionsKeyboardTabs.f);
                TransitionManager.beginDelayedTransition(reactionsKeyboardTabs.getReactionsKeyboardTabs_tabLayout(), reactionsKeyboardTabs.getDeleteTransition());
                for (int i3 = 0; i3 < i2; i3++) {
                    reactionsKeyboardTabs.getReactionsKeyboardTabs_tabLayout().p(i);
                    arrayListF1.remove(i);
                }
                reactionsKeyboardTabs.f = d0.f1(arrayListF1);
            }
        }
    }
}
