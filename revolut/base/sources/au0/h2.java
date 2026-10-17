package au0;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f9219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j2 f9220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f9221c;
    public boolean d;

    public h2(View navBarView, g4 g4Var, List items, RecyclerView recyclerView) {
        aqd.h1 delegateProvider = new aqd.h1(14);
        Intrinsics.checkNotNullParameter(navBarView, "navBarView");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(delegateProvider, "delegateProvider");
        this.f9219a = navBarView;
        Context context = navBarView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f9220b = ro0.g0.b(context, ro0.e0.REFLECTIVE_SURFACE) ? new e4(navBarView, new aqe.a(this, 10), items, recyclerView, g4Var, delegateProvider) : new a0(navBarView, g4Var);
        this.f9221c = 1.0f;
    }
}
