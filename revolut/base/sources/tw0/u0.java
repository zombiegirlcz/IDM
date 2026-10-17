package tw0;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.recycler.WidgetGridLayoutManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u0 implements ComponentCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WidgetGridLayoutManager f274885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f274886b;

    public u0(WidgetGridLayoutManager widgetGridLayoutManager, RecyclerView recyclerView) {
        this.f274885a = widgetGridLayoutManager;
        this.f274886b = recyclerView;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        int i = WidgetGridLayoutManager.f;
        this.f274885a.m(this.f274886b);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
