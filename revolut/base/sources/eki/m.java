package eki;

import aki.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.kompot.navigable.ControllerKey;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import dki.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wji.e;
import zhm.d0;
import zhm.q0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends ListAdapter implements o {

    @NotNull
    private static final i Companion = new i();
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f127174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final aki.c f127175h;
    public final Function1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f127176j;
    public final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ViewPager2 f127177l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedList f127178m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l f127179n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i, com.revolut.kompot.navigable.a parentController, aki.c controllersCache, Function1 controllersFactory) {
        super(new k());
        Intrinsics.checkNotNullParameter(parentController, "parentController");
        Intrinsics.checkNotNullParameter(controllersCache, "controllersCache");
        Intrinsics.checkNotNullParameter(controllersFactory, "controllersFactory");
        this.f = i;
        this.f127174g = parentController;
        this.f127175h = controllersCache;
        this.i = controllersFactory;
        this.f127176j = new HashMap();
        this.k = new ArrayList(3);
        this.f127178m = new LinkedList();
        this.f127179n = new l(this);
    }

    public final com.revolut.kompot.navigable.a a(PagerItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String d = item.getD();
        HashMap map = this.f127176j;
        ControllerKey controllerKey = (ControllerKey) map.get(d);
        com.revolut.kompot.navigable.a aVarD = controllerKey != null ? ((aki.f) this.f127175h).d(controllerKey) : null;
        if (aVarD != null) {
            return aVarD;
        }
        com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) this.i.invoke(item);
        aVar.M2(a.c.f5958a);
        map.put(item.getD(), aVar.u2());
        return aVar;
    }

    public final void b(j jVar) {
        com.revolut.kompot.navigable.b controllerManager = jVar.f;
        com.revolut.kompot.navigable.a from = controllerManager.k;
        if (from != null) {
            wji.c.Companion.getClass();
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(controllerManager, "controllerManager");
            new wji.c(from, null, controllerManager, false, false, e.b.f298140a).a(TransitionAnimation.NONE.f98393a);
            controllerManager.k = null;
            controllerManager.f98424l = true;
        }
        controllerManager.e();
        this.f127178m.remove(controllerManager);
    }

    public final void c(float f, Integer num) {
        ArrayList arrayList = this.k;
        if (arrayList.isEmpty()) {
            return;
        }
        for (int iJ = v.j(arrayList); iJ >= 0; iJ--) {
            Object obj2 = arrayList.get(iJ);
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            j jVar = (j) obj2;
            int bindingAdapterPosition = jVar.getBindingAdapterPosition();
            if (num == null || bindingAdapterPosition == num.intValue() || (bindingAdapterPosition == num.intValue() + 1 && f > BitmapDescriptorFactory.HUE_RED)) {
                arrayList.remove(iJ);
                d(jVar, bindingAdapterPosition);
            }
        }
    }

    public final void d(j jVar, int i) {
        List currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        PagerItem pagerItem = (PagerItem) d0.e0(i, currentList);
        if (pagerItem == null) {
            gom.c cVar = gom.e.f145194a;
            cVar.f("ScrollerFlowControllersAdapter");
            cVar.e("Can't find item in currentList for holder " + jVar + " in position " + i, new Object[0]);
            return;
        }
        jVar.e = pagerItem;
        com.revolut.kompot.navigable.b bVar = jVar.f;
        com.revolut.kompot.navigable.a aVarA = a(pagerItem);
        bVar.c();
        this.f127178m.add(bVar);
        bVar.j(aVarA, this.f127174g, TransitionAnimation.NONE.f98393a, false);
    }

    public final void e(List oldList, List newList) {
        Intrinsics.checkNotNullParameter(oldList, "oldList");
        Intrinsics.checkNotNullParameter(newList, "newList");
        List list = newList;
        int iB = q0.b(w.t(list, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj2 : list) {
            linkedHashMap.put(((PagerItem) obj2).getD(), obj2);
        }
        Iterator it8 = oldList.iterator();
        while (it8.hasNext()) {
            PagerItem pagerItem = (PagerItem) it8.next();
            PagerItem pagerItem2 = (PagerItem) linkedHashMap.get(pagerItem.getD());
            if (pagerItem2 == null || !pagerItem.equals(pagerItem2)) {
                ControllerKey controllerKey = (ControllerKey) this.f127176j.remove(pagerItem.getD());
                if (controllerKey != null) {
                    boolean z = true;
                    LinkedList linkedList = this.f127178m;
                    if (linkedList == null || !linkedList.isEmpty()) {
                        Iterator it9 = linkedList.iterator();
                        while (true) {
                            if (!it9.hasNext()) {
                                break;
                            }
                            com.revolut.kompot.navigable.a aVar = ((com.revolut.kompot.navigable.b) it9.next()).k;
                            if (Intrinsics.f(aVar != null ? aVar.u2() : null, controllerKey)) {
                                z = false;
                                break;
                            }
                        }
                    }
                    aki.c.a(this.f127175h, controllerKey, z);
                }
            }
        }
    }

    @Override // dki.o
    public final List getAll() {
        return this.f127178m;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        ViewParent parent = recyclerView.getParent();
        ViewPager2 viewPager2 = parent instanceof ViewPager2 ? (ViewPager2) parent : null;
        if (viewPager2 != null) {
            this.f127177l = viewPager2;
            viewPager2.registerOnPageChangeCallback(this.f127179n);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        j holder = (j) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        PagerItem pagerItem = (PagerItem) getCurrentList().get(i);
        PagerItem pagerItem2 = holder.e;
        holder.e = pagerItem;
        com.revolut.kompot.navigable.b bVar = holder.f;
        if (bVar.k == null || Intrinsics.f(pagerItem2, pagerItem)) {
            return;
        }
        Intrinsics.h(pagerItem);
        bVar.j(a(pagerItem), this.f127174g, TransitionAnimation.NONE.f98393a, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(this.f, parent, false);
        Intrinsics.i(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        aki.c cVar = this.f127175h;
        j jVar = new j(this.f127174g, (ViewGroup) viewInflate, cVar);
        if (parent.getParent() instanceof ViewPager2) {
            jVar.itemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        }
        return jVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        ViewPager2 viewPager2 = this.f127177l;
        if (viewPager2 != null) {
            viewPager2.unregisterOnPageChangeCallback(this.f127179n);
        }
        this.f127177l = null;
        this.k.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        j holder = (j) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        ViewPager2 viewPager2 = this.f127177l;
        if (bindingAdapterPosition == (viewPager2 != null ? viewPager2.getCurrentItem() : bindingAdapterPosition)) {
            d(holder, bindingAdapterPosition);
        } else {
            this.k.add(holder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        j holder = (j) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        this.k.remove(holder);
        holder.e = null;
        b(holder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        j holder = (j) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled(holder);
        this.k.remove(holder);
        holder.e = null;
        b(holder);
    }
}
