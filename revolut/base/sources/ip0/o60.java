package ip0;

import android.view.View;
import com.revolut.core.ui_kit.views.DraggableTabsView;
import com.revolut.core.ui_kit.views.Tabs;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class o60 implements View.OnScrollChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f165629b;

    public /* synthetic */ o60(Object obj2, int i) {
        this.f165628a = i;
        this.f165629b = obj2;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i2, int i3, int i5) {
        int i6 = this.f165628a;
        Object obj2 = this.f165629b;
        switch (i6) {
            case 0:
                ((com.revolut.core.ui_kit.delegates.ed) obj2).H(i2);
                break;
            case 1:
                DraggableTabsView.a((DraggableTabsView) obj2, i, i3);
                break;
            default:
                Tabs tabs = (Tabs) obj2;
                Tabs.a aVar = Tabs.Companion;
                float trailingFadingEdgeAlpha$ui_kit_components_release = tabs.getTrailingFadingEdgeAlpha$ui_kit_components_release();
                float leadingFadingEdgeAlpha$ui_kit_components_release = tabs.getLeadingFadingEdgeAlpha$ui_kit_components_release();
                if (trailingFadingEdgeAlpha$ui_kit_components_release != tabs.f58890p || leadingFadingEdgeAlpha$ui_kit_components_release != tabs.f58891q) {
                    tabs.f58890p = trailingFadingEdgeAlpha$ui_kit_components_release;
                    tabs.f58891q = leadingFadingEdgeAlpha$ui_kit_components_release;
                    tabs.invalidate();
                }
                break;
        }
    }
}
