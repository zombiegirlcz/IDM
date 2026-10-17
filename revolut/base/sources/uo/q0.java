package uo;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.analytics.tracking.ObfuscatedValueException;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.analytics.impl.R$id;
import com.revolut.retail.core.mvp.BaseMvpFragment;
import java.util.LinkedList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import no.e1;
import yhm.m;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lo0.a f281502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f281503b;

    public q0(lo0.a resourceIdParser, b activeScreenHolder) {
        Intrinsics.checkNotNullParameter(resourceIdParser, "resourceIdParser");
        Intrinsics.checkNotNullParameter(activeScreenHolder, "activeScreenHolder");
        this.f281502a = resourceIdParser;
        this.f281503b = activeScreenHolder;
    }

    public static o0 a(Object obj2) {
        String simpleName = obj2.getClass().getSimpleName();
        f(simpleName, false, obj2);
        if (obj2 instanceof Activity) {
            simpleName = kotlin.text.d0.g0(simpleName, "Activity");
        } else if (obj2 instanceof Fragment) {
            simpleName = kotlin.text.d0.g0(simpleName, "Fragment");
        } else if (obj2 instanceof BaseScreen) {
            simpleName = kotlin.text.d0.g0(simpleName, "Screen");
        } else if (obj2 instanceof dki.p) {
            simpleName = kotlin.text.d0.g0(simpleName, "Flow");
        } else if (obj2 instanceof ViewController) {
            simpleName = kotlin.text.d0.g0(kotlin.text.d0.g0(kotlin.text.d0.g0(simpleName, "Controller"), "Flow"), "Screen");
        }
        Regex regex = e1.f217762a;
        Intrinsics.h(simpleName);
        return new o0(e1.a(simpleName), null);
    }

    public static Clause c(Object obj2, View view) throws Throwable {
        boolean z;
        Object objA;
        View view2;
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z3 = obj2 instanceof ho.l0;
        linkedList.offer(view);
        while (true) {
            if (linkedList.isEmpty() && linkedList2.isEmpty()) {
                return null;
            }
            if (linkedList.isEmpty()) {
                linkedList.addAll(linkedList2);
                linkedList2.clear();
            }
            View view3 = (View) linkedList.poll();
            if (view3 != null && (!((z = view3 instanceof RecyclerView)) || z3)) {
                Object tag2 = view3.getTag(R$id.internal_screen_ref);
                if (!(obj2 instanceof ho.m0) || tag2 == null || tag2.equals(obj2)) {
                    Object tag3 = view3.getTag(com.revolut.core.ui_kit.R$id.internal_nav_bar_title_clause);
                    if (tag3 != null) {
                        try {
                            m.Companion companion = yhm.m.INSTANCE;
                            objA = (Clause) tag3;
                        } catch (CancellationException e) {
                            throw e;
                        } catch (Throwable th10) {
                            m.Companion companion2 = yhm.m.INSTANCE;
                            objA = yhm.o.a(th10);
                        }
                        Throwable thA = yhm.m.a(objA);
                        if (thA != null) {
                            hx7.e.n(thA);
                        }
                        return (Clause) (objA instanceof yhm.n ? null : objA);
                    }
                    if (view3 instanceof ViewGroup) {
                        LinkedList linkedList3 = z ? linkedList2 : linkedList;
                        ViewGroup viewGroup = (ViewGroup) view3;
                        ViewParent parent = viewGroup.getParent();
                        ViewPager2 viewPager2 = parent instanceof ViewPager2 ? (ViewPager2) parent : null;
                        if (!(viewGroup instanceof RecyclerView) || viewPager2 == null) {
                            int childCount = viewGroup.getChildCount();
                            for (int i = 0; i < childCount; i++) {
                                linkedList3.offer(viewGroup.getChildAt(i));
                            }
                        } else {
                            Intrinsics.checkNotNullParameter(viewPager2, "<this>");
                            Object tag4 = viewPager2.getTag(com.revolut.core.ui_kit.R$id.internal_selected_page_position);
                            Integer num = tag4 instanceof Integer ? (Integer) tag4 : null;
                            if (num != null) {
                                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ((RecyclerView) viewGroup).findViewHolderForAdapterPosition(num.intValue());
                                if (viewHolderFindViewHolderForAdapterPosition != null && (view2 = viewHolderFindViewHolderForAdapterPosition.itemView) != null) {
                                    linkedList3.offer(view2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void f(String str, boolean z, Object obj2) {
        ObfuscatedValueException.INSTANCE.getClass();
        if (ObfuscatedValueException.Companion.a(str)) {
            ObfuscatedValueException obfuscatedValueException = new ObfuscatedValueException("Obfuscated screen class: " + str + ", res=" + z + ", class=" + obj2.getClass().getCanonicalName());
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "ScreenNameFinder", null, obfuscatedValueException, h0Var);
        }
    }

    public final o0 b(Object obj2, View view) {
        lo0.a aVar;
        String strA;
        Object tag2 = view.getTag(com.revolut.core.ui_kit.R$id.internal_content_description_clause);
        Clause clause = tag2 instanceof Clause ? (Clause) tag2 : null;
        if (clause == null || (strA = (aVar = this.f281502a).a(clause, true)) == null) {
            return null;
        }
        String strA2 = aVar.a(clause, false);
        f(strA, true, obj2);
        return new o0(strA, strA2);
    }

    public final Object d(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        while (view != null) {
            Object tag2 = view.getTag(R$id.internal_screen_ref);
            if (tag2 != null) {
                return tag2;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public final o0 e(Object screen) throws Throwable {
        Clause clauseC;
        lo0.a aVar;
        String strA;
        o0 o0Var;
        FragmentActivity activity;
        View viewL;
        FragmentActivity activity2;
        View viewL2;
        Intrinsics.checkNotNullParameter(screen, "screen");
        View viewK = rd0.e.k(screen);
        if (screen instanceof no.b1) {
            return ((no.b1) screen).f217737b;
        }
        if (viewK == null) {
            return a(screen);
        }
        boolean z = screen instanceof Fragment;
        o0 o0VarB = null;
        if (z) {
            clauseC = c(screen, viewK);
            if (clauseC == null) {
                Fragment fragment = (Fragment) screen;
                clauseC = (!(fragment instanceof BaseMvpFragment) || b(screen, viewK) != null || (activity2 = fragment.getActivity()) == null || (viewL2 = rd0.e.l(activity2)) == null) ? null : c(screen, viewL2);
            }
        } else {
            clauseC = c(screen, viewK);
        }
        if (clauseC == null || (strA = (aVar = this.f281502a).a(clauseC, true)) == null) {
            o0Var = null;
        } else {
            String strA2 = aVar.a(clauseC, false);
            f(strA, true, screen);
            o0Var = new o0(strA, strA2);
        }
        if (o0Var != null) {
            return o0Var;
        }
        if (z) {
            o0 o0VarB2 = b(screen, viewK);
            if (o0VarB2 == null) {
                Fragment fragment2 = (Fragment) screen;
                if ((fragment2 instanceof BaseMvpFragment) && (activity = fragment2.getActivity()) != null && (viewL = rd0.e.l(activity)) != null) {
                    FragmentActivity activity3 = fragment2.getActivity();
                    if (activity3 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    o0VarB = b(activity3, viewL);
                }
            } else {
                o0VarB = o0VarB2;
            }
        } else {
            o0VarB = b(screen, viewK);
        }
        return o0VarB == null ? a(screen) : o0VarB;
    }
}
