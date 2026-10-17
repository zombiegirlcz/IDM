package mx0;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class eb implements ix0.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f209682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f209683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f209684c;

    public eb(RecyclerView rv4, int i, float f) {
        Intrinsics.checkNotNullParameter(rv4, "rv");
        this.f209682a = rv4;
        this.f209683b = i;
        this.f209684c = f;
    }

    @Override // ix0.g0
    public final ix0.f0 a(ViewGroup containerLayout) {
        Intrinsics.checkNotNullParameter(containerLayout, "containerLayout");
        View childAt = this.f209682a.getChildAt(this.f209683b);
        if (childAt == null) {
            return null;
        }
        return new ix0.f0((childAt.getWidth() / 2.0f) + knm.b.f(childAt, containerLayout), (childAt.getHeight() / 2.0f) + knm.b.h(childAt, containerLayout), (Math.min(childAt.getWidth(), childAt.getHeight()) / 2.0f) + this.f209684c);
    }
}
