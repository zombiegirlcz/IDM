package xv0;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import k50.u1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class o extends RecyclerView.OnScrollListener implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f309160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f309161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f309162c;
    public final Function1 d;
    public final Function1 e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f309163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x.b f309164h;
    public final Handler i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f309165j;
    public List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f309166l;

    public o(RecyclerView rv4, float f, float f4, Function1 onSufficientlyVisibleItems, u1 u1Var, int i) {
        Intrinsics.checkNotNullParameter(rv4, "rv");
        Intrinsics.checkNotNullParameter(onSufficientlyVisibleItems, "onSufficientlyVisibleItems");
        this.f309160a = rv4;
        this.f309161b = f;
        this.f309162c = f4;
        this.d = onSufficientlyVisibleItems;
        this.e = u1Var;
        this.f = i;
        this.f309164h = new x.b(this, 8);
        this.i = new Handler(Looper.getMainLooper());
        this.f309165j = new ArrayList();
    }

    public final void b(List list) {
        if (Intrinsics.f(list, this.f309166l)) {
            return;
        }
        this.f309166l = list;
        Function1 function1 = this.e;
        if (function1 != null) {
            function1.invoke(list);
        }
    }

    public final void c() {
        int absoluteAdapterPosition;
        this.f309163g = false;
        ArrayList arrayList = this.f309165j;
        arrayList.clear();
        RecyclerView recyclerView = this.f309160a;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int paddingTop = layoutManager != null ? layoutManager.getPaddingTop() : recyclerView.getPaddingTop();
        int height = recyclerView.getHeight() - (layoutManager != null ? layoutManager.getPaddingBottom() : recyclerView.getPaddingBottom());
        float f = height - paddingTop;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        Function1 function1 = this.d;
        if (f <= BitmapDescriptorFactory.HUE_RED || recyclerView.getChildCount() == 0) {
            List list = f0.f322471a;
            if (!Intrinsics.f(list, this.k)) {
                List listD1 = d0.d1(list);
                this.k = listD1;
                function1.invoke(listD1);
            }
            b(list);
            return;
        }
        int childCount = recyclerView.getChildCount();
        int iMax = Integer.MIN_VALUE;
        int i = 0;
        int iMin = Integer.MAX_VALUE;
        while (i < childCount) {
            float f5 = f4;
            View childAt = recyclerView.getChildAt(i);
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(childAt);
            koi.b bVar = childViewHolder instanceof koi.b ? (koi.b) childViewHolder : null;
            if (bVar != null && (absoluteAdapterPosition = bVar.getAbsoluteAdapterPosition()) != -1) {
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                float height2 = childAt.getHeight();
                float fMin = Math.min(bottom, height) - Math.max(top, paddingTop);
                if (fMin > f5) {
                    boolean z = height2 > f5 && fMin / height2 >= this.f309161b;
                    if ((z || fMin / f < this.f309162c) ? z : true) {
                        koi.j jVar = bVar.e;
                        if (jVar != null) {
                            arrayList.add(jVar);
                        }
                        iMin = Math.min(iMin, absoluteAdapterPosition);
                        iMax = Math.max(iMax, absoluteAdapterPosition);
                    }
                }
            }
            i++;
            f4 = f5;
        }
        if (!Intrinsics.f(arrayList, this.k)) {
            List listD12 = d0.d1(arrayList);
            this.k = listD12;
            function1.invoke(listD12);
        }
        if (this.e != null) {
            if (iMin == Integer.MAX_VALUE) {
                b(f0.f322471a);
                return;
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            koi.a aVar = adapter instanceof koi.a ? (koi.a) adapter : null;
            if (aVar == null) {
                return;
            }
            int itemCount = aVar.getItemCount();
            int i2 = this.f;
            int iMax2 = Math.max(0, iMin - i2);
            int iMin2 = Math.min(itemCount - 1, iMax + i2);
            ArrayList arrayList2 = new ArrayList();
            if (iMax2 <= iMin2) {
                while (true) {
                    arrayList2.add(aVar.a(iMax2));
                    if (iMax2 == iMin2) {
                        break;
                    } else {
                        iMax2++;
                    }
                }
            }
            b(arrayList2);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        if ((i == i6 && i2 == i21 && i3 == i22 && i5 == i32) || this.f309163g) {
            return;
        }
        this.i.post(this.f309164h);
        this.f309163g = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (this.f309163g) {
            return;
        }
        this.i.post(this.f309164h);
        this.f309163g = true;
    }
}
