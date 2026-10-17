package xv0;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w extends RecyclerView.OnScrollListener implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f309176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f309177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f309178c;
    public int d;
    public RecyclerView e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x.b f309179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f309180h;

    public w(Function1 onCompletelyVisibleItems, Function1 function1) {
        Intrinsics.checkNotNullParameter(onCompletelyVisibleItems, "onCompletelyVisibleItems");
        this.f309176a = onCompletelyVisibleItems;
        this.f309177b = function1;
        this.f309178c = -1;
        this.d = -1;
        this.f309179g = new x.b(this, 9);
        this.f309180h = new Handler(Looper.getMainLooper());
    }

    public static ArrayList d(koi.h hVar, int i, int i2) {
        if (i < 0 || i >= hVar.getItemCount() || i2 < 0 || i2 >= hVar.getItemCount()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (i <= i2) {
            while (true) {
                arrayList.add(hVar.a(i));
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final void b(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        c();
        this.e = recyclerView;
        recyclerView.addOnScrollListener(this);
        recyclerView.addOnLayoutChangeListener(this);
    }

    public final void c() {
        RecyclerView recyclerView = this.e;
        if (recyclerView != null) {
            this.f309180h.removeCallbacksAndMessages(null);
            this.f = false;
            recyclerView.removeOnScrollListener(this);
            recyclerView.removeOnLayoutChangeListener(this);
            this.e = null;
            this.f309178c = -1;
            this.d = -1;
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        List listK = zhm.v.k(Integer.valueOf(i6), Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(i32));
        if ((listK instanceof Collection) && listK.isEmpty()) {
            return;
        }
        Iterator it8 = listK.iterator();
        while (it8.hasNext()) {
            if (((Number) it8.next()).intValue() != 0) {
                if (!(view instanceof RecyclerView) || this.f) {
                    return;
                }
                this.f309180h.post(this.f309179g);
                this.f = true;
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (this.f) {
            return;
        }
        this.f309180h.post(this.f309179g);
        this.f = true;
    }
}
