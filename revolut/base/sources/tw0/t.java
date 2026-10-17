package tw0;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f274877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f274878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LinearLayoutManager f274879c;
    public final /* synthetic */ OrientationHelper d;

    public t(u uVar, String str, LinearLayoutManager linearLayoutManager, OrientationHelper orientationHelper) {
        this.f274877a = uVar;
        this.f274878b = str;
        this.f274879c = linearLayoutManager;
        this.d = orientationHelper;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        OrientationHelper orientationHelper = this.d;
        Intrinsics.h(orientationHelper);
        u.a(this.f274877a, this.f274878b, recyclerView, this.f274879c, orientationHelper);
    }
}
