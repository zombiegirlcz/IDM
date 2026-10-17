package goi;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.view.ViewGroup;
import com.revolut.recyclerkit.AdaptiveGridLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import rp0.f2;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements ComponentCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f145158b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f145157a = i;
        this.f145158b = obj2;
    }

    private final void a() {
    }

    private final void b() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        switch (this.f145157a) {
            case 0:
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                AdaptiveGridLayoutManager adaptiveGridLayoutManager = (AdaptiveGridLayoutManager) this.f145158b;
                adaptiveGridLayoutManager.setSpanCount(((Number) adaptiveGridLayoutManager.f98527a.invoke()).intValue());
                break;
            default:
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                f2 f2Var = (f2) this.f145158b;
                gu0.a aVar = f2Var.f256082g;
                if (aVar != null) {
                    aVar.cancel();
                }
                ViewGroup viewGroup = f2Var.d;
                gu0.a aVar2 = new gu0.a(viewGroup, 6, f2Var);
                viewGroup.addOnLayoutChangeListener(aVar2);
                f2Var.f256082g = aVar2;
                break;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        int i = this.f145157a;
    }
}
