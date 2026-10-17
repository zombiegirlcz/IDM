package mx0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.recyclerkit.UIKitRecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes20.dex */
public final class q extends RecyclerView.LayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f209946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f209947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f209948c;

    public q(int i, UIKitRecyclerView recyclerView, boolean z) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f209946a = i;
        this.f209947b = recyclerView;
        this.f209948c = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        Object next;
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getItemCount() == 0) {
            removeAllViews();
            return;
        }
        detachAndScrapAttachedViews(recycler);
        IntRange intRangeO = kotlin.ranges.f.o(0, state.getItemCount());
        ArrayList<View> arrayList = new ArrayList(zhm.w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            arrayList.add(recycler.getViewForPosition(it8.nextInt()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (View view : arrayList) {
            measureChildWithMargins(view, 0, 0);
            linkedHashMap.put(view, Integer.valueOf(view.getMeasuredWidth()));
        }
        int width = (this.f209947b.getWidth() - getPaddingStart()) - getPaddingEnd();
        LinkedHashMap linkedHashMapZ = zhm.r0.z(linkedHashMap);
        int i = (int) (((double) width) / 2.5d);
        int iT0 = zhm.d0.T0(linkedHashMap.values());
        int size = linkedHashMap.size() - 1;
        int i2 = this.f209946a;
        int i3 = (size * i2) + iT0;
        if (i3 > width) {
            loop2: while (i3 > width) {
                Collection collectionValues = linkedHashMapZ.values();
                if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                    Iterator it9 = collectionValues.iterator();
                    while (it9.hasNext()) {
                        if (((Number) it9.next()).intValue() > i) {
                            Iterator it10 = linkedHashMapZ.entrySet().iterator();
                            if (it10.hasNext()) {
                                next = it10.next();
                                if (it10.hasNext()) {
                                    int iIntValue = ((Number) ((Map.Entry) next).getValue()).intValue();
                                    do {
                                        Object next2 = it10.next();
                                        int iIntValue2 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                                        if (iIntValue < iIntValue2) {
                                            next = next2;
                                            iIntValue = iIntValue2;
                                        }
                                    } while (it10.hasNext());
                                }
                            } else {
                                next = null;
                            }
                            Intrinsics.h(next);
                            Map.Entry entry = (Map.Entry) next;
                            View view2 = (View) entry.getKey();
                            int iIntValue3 = ((Number) entry.getValue()).intValue();
                            int i5 = i3 - iIntValue3;
                            int i6 = i5 + i < width ? iIntValue3 - (i3 - width) : i;
                            linkedHashMapZ.put(view2, Integer.valueOf(i6));
                            i3 = i5 + i6;
                        }
                    }
                    break loop2;
                }
                break;
            }
            if (i3 > width) {
                int size2 = linkedHashMap.size() * i2;
                float f = (width - size2) / (i3 - size2);
                Iterator it11 = linkedHashMap.keySet().iterator();
                while (it11.hasNext()) {
                    linkedHashMapZ.put((View) it11.next(), Integer.valueOf((int) (((Number) zhm.r0.h(r3, linkedHashMapZ)).intValue() * f)));
                }
            }
        } else if (this.f209948c) {
            int size3 = (width - ((linkedHashMap.size() - 1) * i2)) / linkedHashMap.size();
            Iterator it12 = linkedHashMap.keySet().iterator();
            while (it12.hasNext()) {
                linkedHashMapZ.put((View) it12.next(), Integer.valueOf(size3));
            }
        } else {
            linkedHashMapZ.putAll(linkedHashMap);
        }
        int paddingStart = getPaddingStart();
        int i21 = paddingStart;
        for (View view3 : arrayList) {
            addView(view3);
            int iIntValue4 = ((Number) zhm.r0.h(view3, linkedHashMapZ)).intValue();
            view3.measure(View.MeasureSpec.makeMeasureSpec(iIntValue4, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            or0.g.a(this, view3, i21, getPaddingTop(), i21 + iIntValue4, getPaddingTop() + view3.getMeasuredHeight());
            i21 += iIntValue4 + i2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onMeasure(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2) {
        Integer num;
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onMeasure(recycler, state, i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        IntRange intRangeO = kotlin.ranges.f.o(0, state.getItemCount());
        ArrayList arrayList = new ArrayList(zhm.w.t(intRangeO, 10));
        Iterator<Integer> it8 = intRangeO.iterator();
        while (it8.hasNext()) {
            arrayList.add(recycler.getViewForPosition(((zhm.l0) it8).nextInt()));
        }
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            ((View) it9.next()).measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        Iterator it10 = arrayList.iterator();
        int measuredWidth = 0;
        while (it10.hasNext()) {
            measuredWidth += ((View) it10.next()).getMeasuredWidth();
        }
        int paddingEnd = getPaddingEnd() + getPaddingStart() + ((arrayList.size() - 1) * this.f209946a) + measuredWidth;
        Iterator it11 = arrayList.iterator();
        if (it11.hasNext()) {
            Integer numValueOf = Integer.valueOf(((View) it11.next()).getMeasuredHeight());
            while (it11.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((View) it11.next()).getMeasuredHeight());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        int iIntValue = num != null ? num.intValue() : 0;
        if (mode == Integer.MIN_VALUE ? paddingEnd < size : mode != 1073741824) {
            size = paddingEnd;
        }
        if (mode2 == Integer.MIN_VALUE ? iIntValue < size2 : mode2 != 1073741824) {
            size2 = iIntValue;
        }
        setMeasuredDimension(size, size2);
    }
}
