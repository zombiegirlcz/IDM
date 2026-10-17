package hoi;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c extends SimpleItemAnimator {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f154303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f154304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f154305c;
    public boolean d;
    public final ArrayList e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f154306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f154307h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f154308j;
    public final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f154309l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f154310m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f154311n;
    public final ArrayList o;

    public static final class a {
        private a() {
        }
    }

    public c() {
        this(false, 31);
    }

    public static void c(ArrayList arrayList) {
        TimeInterpolator timeInterpolatorP = hx7.i.p();
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = ((RecyclerView.ViewHolder) arrayList.get(size)).itemView.animate();
            viewPropertyAnimatorAnimate.cancel();
            viewPropertyAnimatorAnimate.setInterpolator(timeInterpolatorP);
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public Float a(RecyclerView.ViewHolder holder, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        return null;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateAdd(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        endAnimation(holder);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        hx7.i.b(itemView);
        g(holder);
        this.f154307h.add(holder);
        return true;
    }

    public abstract void animateAddImpl(RecyclerView.ViewHolder viewHolder);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateChange(RecyclerView.ViewHolder oldHolder, RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(oldHolder, "oldHolder");
        ArrayList arrayList = this.f154308j;
        if (oldHolder == viewHolder) {
            if (!(viewHolder instanceof ioi.a) || !((ioi.a) viewHolder).m(viewHolder)) {
                return animateMove(oldHolder, i, i2, i3, i5);
            }
            int translationX = ((int) viewHolder.itemView.getTranslationX()) + i;
            int translationY = ((int) viewHolder.itemView.getTranslationY()) + i2;
            endAnimation(oldHolder);
            ((ioi.a) viewHolder).e(viewHolder, translationX, translationY, i3, i5);
            arrayList.add(new b(oldHolder, viewHolder, translationX, translationY, i3, i5));
            return true;
        }
        float translationX2 = oldHolder.itemView.getTranslationX();
        float translationY2 = oldHolder.itemView.getTranslationY();
        float alpha = oldHolder.itemView.getAlpha();
        endAnimation(oldHolder);
        int i6 = (int) ((i3 - i) - translationX2);
        int i21 = (int) ((i5 - i2) - translationY2);
        View view = oldHolder.itemView;
        view.setTranslationX(translationX2);
        view.setTranslationY(translationY2);
        view.setAlpha(alpha);
        if ((viewHolder != 0 ? viewHolder.itemView : null) != null) {
            endAnimation(viewHolder);
            View view2 = viewHolder.itemView;
            view2.setAlpha(BitmapDescriptorFactory.HUE_RED);
            view2.setTranslationX(-i6);
            view2.setTranslationY(-i21);
        }
        arrayList.add(new b(oldHolder, viewHolder, i, i2, i3, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final boolean animateMove(RecyclerView.ViewHolder holder, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        int translationX = i + ((int) itemView.getTranslationX());
        int translationY = i2 + ((int) itemView.getTranslationY());
        endAnimation(holder);
        int i6 = i3 - translationX;
        int i21 = i5 - translationY;
        if (i6 == 0 && i21 == 0) {
            dispatchMoveFinished(holder);
            return false;
        }
        if (i6 != 0) {
            itemView.setTranslationX(-i6);
        }
        if (i21 != 0) {
            itemView.setTranslationY(-i21);
        }
        Intrinsics.checkNotNullParameter(holder, "holder");
        g gVar = new g();
        gVar.f154319a = holder;
        gVar.f154320b = translationX;
        gVar.f154321c = translationY;
        gVar.d = i3;
        gVar.e = i5;
        this.i.add(gVar);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateRemove(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        endAnimation(holder);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        hx7.i.b(itemView);
        if (holder instanceof ioi.b) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            ((ap0.j) ((ioi.b) holder)).F().setTranslationY(BitmapDescriptorFactory.HUE_RED);
        }
        h(holder);
        this.f154306g.add(holder);
        return true;
    }

    public abstract void animateRemoveImpl(RecyclerView.ViewHolder viewHolder);

    public float b(RecyclerView.ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder viewHolder, List payloads) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        return viewHolder instanceof ioi.a ? ((ioi.a) viewHolder).x(payloads) : !payloads.isEmpty() || super.canReuseUpdatedViewHolder(viewHolder, payloads);
    }

    public final void d() {
        if (isRunning()) {
            return;
        }
        dispatchAnimationsFinished();
    }

    public final void e(ArrayList arrayList, RecyclerView.ViewHolder viewHolder) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            b bVar = (b) arrayList.get(size);
            if (f(bVar, viewHolder) && bVar.f154300a == null && bVar.f154301b == null) {
                arrayList.remove(bVar);
            }
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimation(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "item");
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        ViewPropertyAnimator viewPropertyAnimatorAnimate = itemView.animate();
        viewPropertyAnimatorAnimate.cancel();
        viewPropertyAnimatorAnimate.setInterpolator(hx7.i.p());
        if (holder instanceof ioi.a) {
            ((ioi.a) holder).d(holder);
        }
        if (holder instanceof ioi.b) {
            Intrinsics.checkNotNullParameter(holder, "holder");
        }
        ArrayList arrayList = this.i;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                Object obj2 = arrayList.get(size);
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                if (((g) obj2).f154319a == holder) {
                    itemView.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    itemView.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    dispatchMoveFinished(holder);
                    arrayList.remove(size);
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        e(this.f154308j, holder);
        if (this.f154306g.remove(holder)) {
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            hx7.i.b(itemView2);
            dispatchRemoveFinished(holder);
        }
        if (this.f154307h.remove(holder)) {
            View itemView3 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
            hx7.i.b(itemView3);
            dispatchAddFinished(holder);
        }
        ArrayList arrayList2 = this.f154310m;
        int size2 = arrayList2.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                Object obj3 = arrayList2.get(size2);
                Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                ArrayList arrayList3 = (ArrayList) obj3;
                e(arrayList3, holder);
                if (arrayList3.isEmpty()) {
                    arrayList2.remove(size2);
                }
                if (i2 < 0) {
                    break;
                } else {
                    size2 = i2;
                }
            }
        }
        ArrayList arrayList4 = this.f154309l;
        int size3 = arrayList4.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i3 = size3 - 1;
                Object obj4 = arrayList4.get(size3);
                Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                ArrayList arrayList5 = (ArrayList) obj4;
                int size4 = arrayList5.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i5 = size4 - 1;
                        Object obj5 = arrayList5.get(size4);
                        Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
                        if (((g) obj5).f154319a == holder) {
                            itemView.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                            itemView.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                            dispatchMoveFinished(holder);
                            arrayList5.remove(size4);
                            if (arrayList5.isEmpty()) {
                                arrayList4.remove(size3);
                            }
                        } else if (i5 < 0) {
                            break;
                        } else {
                            size4 = i5;
                        }
                    }
                }
                if (i3 < 0) {
                    break;
                } else {
                    size3 = i3;
                }
            }
        }
        ArrayList arrayList6 = this.k;
        int size5 = arrayList6.size() - 1;
        if (size5 >= 0) {
            while (true) {
                int i6 = size5 - 1;
                Object obj6 = arrayList6.get(size5);
                Intrinsics.checkNotNullExpressionValue(obj6, "get(...)");
                ArrayList arrayList7 = (ArrayList) obj6;
                if (arrayList7.remove(holder)) {
                    View itemView4 = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView4, "itemView");
                    hx7.i.b(itemView4);
                    dispatchAddFinished(holder);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size5);
                    }
                }
                if (i6 < 0) {
                    break;
                } else {
                    size5 = i6;
                }
            }
        }
        this.f.remove(holder);
        this.e.remove(holder);
        this.o.remove(holder);
        this.f154311n.remove(holder);
        d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimations() {
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            Object obj2 = arrayList.get(size);
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            g gVar = (g) obj2;
            RecyclerView.ViewHolder viewHolder = gVar.f154319a;
            RecyclerView.ViewHolder viewHolder2 = gVar.f154319a;
            View itemView = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            itemView.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            itemView.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            Float fA = a(viewHolder2, gVar.f154320b, gVar.f154321c, gVar.d, gVar.e);
            if (fA != null) {
                itemView.setScaleX(fA.floatValue());
                itemView.setScaleY(fA.floatValue());
            }
            dispatchMoveFinished(viewHolder2);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f154306g;
        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
            Object obj3 = arrayList2.get(size2);
            Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
            dispatchRemoveFinished((RecyclerView.ViewHolder) obj3);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f154307h;
        for (int size3 = arrayList3.size() - 1; -1 < size3; size3--) {
            Object obj4 = arrayList3.get(size3);
            Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
            RecyclerView.ViewHolder viewHolder3 = (RecyclerView.ViewHolder) obj4;
            View itemView2 = viewHolder3.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            hx7.i.b(itemView2);
            dispatchAddFinished(viewHolder3);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f154308j;
        for (int size4 = arrayList4.size() - 1; -1 < size4; size4--) {
            Object obj5 = arrayList4.get(size4);
            Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
            b bVar = (b) obj5;
            RecyclerView.ViewHolder viewHolder4 = bVar.f154300a;
            if (viewHolder4 != null) {
                f(bVar, viewHolder4);
            }
            RecyclerView.ViewHolder viewHolder5 = bVar.f154301b;
            if (viewHolder5 != null) {
                f(bVar, viewHolder5);
            }
        }
        arrayList4.clear();
        if (isRunning()) {
            ArrayList arrayList5 = this.f154309l;
            for (int size5 = arrayList5.size() - 1; -1 < size5; size5--) {
                Object obj6 = arrayList5.get(size5);
                Intrinsics.checkNotNullExpressionValue(obj6, "get(...)");
                ArrayList arrayList6 = (ArrayList) obj6;
                for (int size6 = arrayList6.size() - 1; -1 < size6; size6--) {
                    Object obj7 = arrayList6.get(size6);
                    Intrinsics.checkNotNullExpressionValue(obj7, "get(...)");
                    g gVar2 = (g) obj7;
                    RecyclerView.ViewHolder viewHolder6 = gVar2.f154319a;
                    View itemView3 = viewHolder6.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
                    itemView3.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    itemView3.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    Float fA2 = a(viewHolder6, gVar2.f154320b, gVar2.f154321c, gVar2.d, gVar2.e);
                    if (fA2 != null) {
                        itemView3.setScaleX(fA2.floatValue());
                        itemView3.setScaleY(fA2.floatValue());
                    }
                    dispatchMoveFinished(gVar2.f154319a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.k;
            for (int size7 = arrayList7.size() - 1; -1 < size7; size7--) {
                Object obj8 = arrayList7.get(size7);
                Intrinsics.checkNotNullExpressionValue(obj8, "get(...)");
                ArrayList arrayList8 = (ArrayList) obj8;
                for (int size8 = arrayList8.size() - 1; -1 < size8; size8--) {
                    Object obj9 = arrayList8.get(size8);
                    Intrinsics.checkNotNullExpressionValue(obj9, "get(...)");
                    RecyclerView.ViewHolder viewHolder7 = (RecyclerView.ViewHolder) obj9;
                    View itemView4 = viewHolder7.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView4, "itemView");
                    itemView4.setAlpha(1.0f);
                    dispatchAddFinished(viewHolder7);
                    if (size8 < arrayList8.size()) {
                        arrayList8.remove(size8);
                    }
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f154310m;
            for (int size9 = arrayList9.size() - 1; -1 < size9; size9--) {
                Object obj10 = arrayList9.get(size9);
                Intrinsics.checkNotNullExpressionValue(obj10, "get(...)");
                ArrayList arrayList10 = (ArrayList) obj10;
                for (int size10 = arrayList10.size() - 1; -1 < size10; size10--) {
                    Object obj11 = arrayList10.get(size10);
                    Intrinsics.checkNotNullExpressionValue(obj11, "get(...)");
                    b bVar2 = (b) obj11;
                    RecyclerView.ViewHolder viewHolder8 = bVar2.f154300a;
                    if (viewHolder8 != null) {
                        f(bVar2, viewHolder8);
                    }
                    RecyclerView.ViewHolder viewHolder9 = bVar2.f154301b;
                    if (viewHolder9 != null) {
                        f(bVar2, viewHolder9);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            c(this.f);
            c(this.f154311n);
            c(this.e);
            c(this.o);
            dispatchAnimationsFinished();
        }
    }

    public final boolean f(b bVar, RecyclerView.ViewHolder viewHolder) {
        View view;
        boolean z = false;
        if (Intrinsics.f(viewHolder, bVar.f154301b)) {
            bVar.f154301b = null;
            if (Intrinsics.f(bVar.f154300a, viewHolder)) {
                bVar.f154300a = null;
            }
        } else {
            if (!Intrinsics.f(viewHolder, bVar.f154300a)) {
                return false;
            }
            bVar.f154300a = null;
            z = true;
        }
        if (viewHolder != null && (view = viewHolder.itemView) != null) {
            view.setAlpha(1.0f);
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        }
        dispatchChangeFinished(viewHolder, z);
        return true;
    }

    public void g(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    public void h(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean isRunning() {
        return (this.f154307h.isEmpty() && this.f154308j.isEmpty() && this.i.isEmpty() && this.f154306g.isEmpty() && this.f154311n.isEmpty() && this.f.isEmpty() && this.e.isEmpty() && this.o.isEmpty() && this.f154309l.isEmpty() && this.k.isEmpty() && this.f154310m.isEmpty()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void runPendingAnimations() {
        ArrayList arrayList = this.f154306g;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.i;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f154308j;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f154307h;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator it8 = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it8, "iterator(...)");
        while (it8.hasNext()) {
            Object next = it8.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            RecyclerView.ViewHolder holder = (RecyclerView.ViewHolder) next;
            if (holder instanceof ioi.b) {
                f listener = new f(this, holder);
                ap0.j jVar = (ap0.j) ((ioi.b) holder);
                jVar.getClass();
                Intrinsics.checkNotNullParameter(holder, "holder");
                Intrinsics.checkNotNullParameter(listener, "listener");
                jVar.F().c(listener);
            } else {
                animateRemoveImpl(holder);
            }
        }
        arrayList.clear();
        if (!zIsEmpty2) {
            final ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.f154309l.add(arrayList5);
            arrayList2.clear();
            final int i = 0;
            Runnable runnable = new Runnable() { // from class: hoi.a
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
                /* JADX WARN: Removed duplicated region for block: B:77:0x00fc A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:80:0x003d A[SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instruction units count: 462
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: hoi.a.run():void");
                }
            };
            if (zIsEmpty || this.f154305c) {
                runnable.run();
            } else {
                View itemView = ((g) arrayList5.get(0)).f154319a.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                ViewCompat.postOnAnimationDelayed(itemView, runnable, getRemoveDuration());
            }
        }
        if (!zIsEmpty3) {
            final ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.f154310m.add(arrayList6);
            arrayList3.clear();
            final int i2 = 1;
            Runnable runnable2 = new Runnable() { // from class: hoi.a
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
                /* JADX WARN: Removed duplicated region for block: B:77:0x00fc A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:80:0x003d A[SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instruction units count: 462
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: hoi.a.run():void");
                }
            };
            if (zIsEmpty || this.d) {
                runnable2.run();
            } else {
                RecyclerView.ViewHolder viewHolder = ((b) arrayList6.get(0)).f154300a;
                Intrinsics.h(viewHolder);
                ViewCompat.postOnAnimationDelayed(viewHolder.itemView, runnable2, getRemoveDuration());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        final ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        this.k.add(arrayList7);
        arrayList4.clear();
        final int i3 = 2;
        Runnable runnable3 = new Runnable() { // from class: hoi.a
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
            /* JADX WARN: Removed duplicated region for block: B:77:0x00fc A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:80:0x003d A[SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instruction units count: 462
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: hoi.a.run():void");
            }
        };
        if ((zIsEmpty && zIsEmpty2 && zIsEmpty3) || this.f154304b) {
            runnable3.run();
            return;
        }
        long jMax = Math.max(!zIsEmpty2 ? getMoveDuration() : 0L, zIsEmpty3 ? 0L : getChangeDuration()) + (!zIsEmpty ? getRemoveDuration() : 0L);
        View itemView2 = ((RecyclerView.ViewHolder) arrayList7.get(0)).itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        ViewCompat.postOnAnimationDelayed(itemView2, runnable3, jMax);
    }

    public /* synthetic */ c(boolean z, int i) {
        this(true, (i & 2) != 0 ? false : z, (i & 4) == 0, false, false);
    }

    public c(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f154303a = z;
        this.f154304b = z4;
        this.f154305c = z6;
        this.d = z11;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.f154306g = new ArrayList();
        this.f154307h = new ArrayList();
        this.i = new ArrayList();
        this.f154308j = new ArrayList();
        this.k = new ArrayList();
        this.f154309l = new ArrayList();
        this.f154310m = new ArrayList();
        this.f154311n = new ArrayList();
        this.o = new ArrayList();
        setSupportsChangeAnimations(z3);
    }
}
