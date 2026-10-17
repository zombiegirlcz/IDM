package iz0;

import android.R;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.internal.ViewUtils;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.background.StatefulAnimatedBackground;
import com.revolut.core.ui_kit.views.KeyboardSuggestionsView;
import d01.g;
import efm.r;
import fp0.l;
import is6.t;
import iv0.p;
import ivb.i;
import ix0.x0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.d8;
import or0.u;
import org.jetbrains.annotations.NotNull;
import rv0.f;
import rv0.j;
import rv0.k;
import te0.w;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements g {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Window f169813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f169814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f169815c;
    public int d;
    public boolean e;
    public volatile d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f169816g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ViewGroup f169817h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final KeyboardSuggestionsView f169818j;

    public e(Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        this.f169813a = window;
        this.f169814b = new Handler(Looper.getMainLooper());
        f0 f0Var = f0.f322471a;
        this.f = new d(new c(f0Var), new c(f0Var));
        this.i = w.y0(new p(this, 6));
        Context context = window.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        KeyboardSuggestionsView keyboardSuggestionsView = new KeyboardSuggestionsView(context, null, 6, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        keyboardSuggestionsView.setLayoutParams(layoutParams);
        this.f169818j = keyboardSuggestionsView;
        this.f169815c = true;
        View decorView = window.getDecorView();
        Intrinsics.h(decorView);
        final int i = 0;
        u.a(decorView, new Function1(this) { // from class: iz0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f169807b;

            {
                this.f169807b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                WindowInsets newInsets = (WindowInsets) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(newInsets, "newInsets");
                        boolean zC = x0.c(newInsets);
                        e eVar = this.f169807b;
                        if (zC != eVar.e) {
                            eVar.e = zC;
                            eVar.h();
                        }
                        return Unit.f186387a;
                    default:
                        Intrinsics.checkNotNullParameter(newInsets, "newInsets");
                        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(newInsets);
                        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(...)");
                        e eVar2 = this.f169807b;
                        j jVarA = kli.c.a(e.a(eVar2.f169813a));
                        k kVar = jVarA instanceof k ? (k) jVarA : null;
                        f fVar = kVar != null ? ((sv0.c) kVar).f265817l : null;
                        int i2 = 0;
                        if (fVar instanceof rv0.e) {
                            rv0.d dVar = ((rv0.e) fVar).f257635a;
                            if (dVar instanceof rv0.c) {
                                i2 = ((rv0.c) dVar).f257634a;
                            } else if (!dVar.equals(rv0.b.f257633a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        int i3 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime()).bottom - i2;
                        if (i3 != eVar2.d) {
                            eVar2.d = i3;
                            eVar2.f169818j.setTranslationY(-i3);
                            eVar2.h();
                        }
                        return Unit.f186387a;
                }
            }
        });
        ViewUtils.requestApplyInsetsWhenAttached(decorView);
        final int i2 = 1;
        u.b(keyboardSuggestionsView, true, new Function1(this) { // from class: iz0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f169807b;

            {
                this.f169807b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                WindowInsets newInsets = (WindowInsets) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(newInsets, "newInsets");
                        boolean zC = x0.c(newInsets);
                        e eVar = this.f169807b;
                        if (zC != eVar.e) {
                            eVar.e = zC;
                            eVar.h();
                        }
                        return Unit.f186387a;
                    default:
                        Intrinsics.checkNotNullParameter(newInsets, "newInsets");
                        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(newInsets);
                        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(...)");
                        e eVar2 = this.f169807b;
                        j jVarA = kli.c.a(e.a(eVar2.f169813a));
                        k kVar = jVarA instanceof k ? (k) jVarA : null;
                        f fVar = kVar != null ? ((sv0.c) kVar).f265817l : null;
                        int i22 = 0;
                        if (fVar instanceof rv0.e) {
                            rv0.d dVar = ((rv0.e) fVar).f257635a;
                            if (dVar instanceof rv0.c) {
                                i22 = ((rv0.c) dVar).f257634a;
                            } else if (!dVar.equals(rv0.b.f257633a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        int i3 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime()).bottom - i22;
                        if (i3 != eVar2.d) {
                            eVar2.d = i3;
                            eVar2.f169818j.setTranslationY(-i3);
                            eVar2.h();
                        }
                        return Unit.f186387a;
                }
            }
        });
        h();
    }

    public static ViewGroup a(Window window) {
        View decorView = window.getDecorView();
        Intrinsics.i(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewFindViewById = ((ViewGroup) decorView).findViewById(R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        return (ViewGroup) viewFindViewById;
    }

    public static ViewGroup b(ViewGroup viewGroup) {
        ViewGroup viewGroupB;
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                i = -1;
                break;
            }
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof AnimatedBackgroundView) || (childAt instanceof StatefulAnimatedBackground)) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            int childCount2 = viewGroup.getChildCount();
            for (int i2 = i + 1; i2 < childCount2; i2++) {
                View childAt2 = viewGroup.getChildAt(i2);
                ViewGroup viewGroup2 = childAt2 instanceof ViewGroup ? (ViewGroup) childAt2 : null;
                if (viewGroup2 != null) {
                    return viewGroup2;
                }
            }
        }
        int childCount3 = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount3; i3++) {
            View childAt3 = viewGroup.getChildAt(i3);
            if ((childAt3 instanceof ViewGroup) && !(childAt3 instanceof AnimatedBackgroundView) && !(childAt3 instanceof StatefulAnimatedBackground) && (viewGroupB = b((ViewGroup) childAt3)) != null) {
                return viewGroupB;
            }
        }
        return null;
    }

    public final void c(String sourceId) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        d dVar = this.f;
        e(new d(new c(dVar.f169811a.f169810c, Intrinsics.f(sourceId, dVar.f169811a.f169808a) ? null : dVar.f169811a.f169808a, Intrinsics.f(sourceId, dVar.f169811a.f169808a) ? f0.f322471a : dVar.f169811a.f169809b), new c(dVar.f169812b.f169810c, Intrinsics.f(sourceId, dVar.f169812b.f169808a) ? null : dVar.f169812b.f169808a, Intrinsics.f(sourceId, dVar.f169812b.f169808a) ? f0.f322471a : dVar.f169812b.f169809b)));
    }

    public final r d(String sourceId) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        r rVarSwitchMapSingle = this.f169818j.d.switchMapSingle(new i(new t(this, sourceId, 21), 11));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMapSingle, "switchMapSingle(...)");
        return rVarSwitchMapSingle;
    }

    public final void e(d dVar) {
        if (Intrinsics.f(this.f, dVar)) {
            return;
        }
        this.f = dVar;
        if (this.f169815c) {
            return;
        }
        this.f169815c = true;
        this.f169814b.post(new l(this, 14));
    }

    public final void f(d01.e layoutStyle, String sourceId, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(layoutStyle, "layoutStyle");
        d dVar = this.f;
        c cVar = new c(!Intrinsics.f(sourceId, "legacy_source_id") ? layoutStyle : dVar.f169811a.f169810c, !Intrinsics.f(sourceId, "legacy_source_id") ? sourceId : dVar.f169811a.f169808a, !Intrinsics.f(sourceId, "legacy_source_id") ? items : dVar.f169811a.f169809b);
        String str = Intrinsics.f(sourceId, "legacy_source_id") ? sourceId : dVar.f169812b.f169808a;
        if (!Intrinsics.f(sourceId, "legacy_source_id")) {
            items = dVar.f169812b.f169809b;
        }
        if (!Intrinsics.f(sourceId, "legacy_source_id")) {
            layoutStyle = dVar.f169812b.f169810c;
        }
        e(new d(cVar, new c(layoutStyle, str, items)));
    }

    public final void g(String sourceId, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        f(d01.e.DEFAULT, sourceId, items);
    }

    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, kotlin.Lazy] */
    public final void h() {
        ViewGroup viewGroup;
        int iIntValue;
        this.f169815c = false;
        d dVar = this.f;
        int i = (!this.e || (dVar.f169811a.f169809b.isEmpty() && dVar.f169812b.f169809b.isEmpty())) ? 8 : 0;
        if (i == 0) {
            c cVar = !dVar.f169811a.f169809b.isEmpty() ? dVar.f169811a : dVar.f169812b;
            KeyboardSuggestionsView keyboardSuggestionsView = this.f169818j;
            List<d01.b> list = cVar.f169809b;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            for (d01.b bVar : list) {
                arrayList.add(new d8(bVar.f110277a, bVar.f110278b, bVar.f, bVar.e, bVar.d, bVar.f110279c));
            }
            keyboardSuggestionsView.setModel(new KeyboardSuggestionsView.c(arrayList, cVar.f169810c));
            KeyboardSuggestionsView keyboardSuggestionsView2 = this.f169818j;
            if (keyboardSuggestionsView2.getParent() == null) {
                ViewGroup viewGroupA = a(this.f169813a);
                viewGroupA.addView(keyboardSuggestionsView2);
                viewGroupA.requestLayout();
                viewGroupA.bringChildToFront(keyboardSuggestionsView2);
            }
        }
        j jVarA = kli.c.a(a(this.f169813a));
        k kVar = jVarA instanceof k ? (k) jVarA : null;
        f fVar = kVar != null ? ((sv0.c) kVar).f265817l : null;
        boolean z = i != this.f169818j.getVisibility();
        rv0.e eVar = fVar instanceof rv0.e ? (rv0.e) fVar : null;
        rv0.d dVar2 = eVar != null ? eVar.f257635a : null;
        boolean zF = Intrinsics.f(dVar2, this.f169818j.getTag(R$id.internal_keyboardSuggestionsDisplayer_imeInsetsVariant));
        boolean z3 = i == 0 && this.f169817h == null;
        if (z || !zF || z3) {
            this.f169818j.setVisibility(i);
            if (i == 0) {
                viewGroup = this.f169817h;
                if (viewGroup == null) {
                    ViewGroup viewGroupA2 = a(this.f169813a);
                    ViewGroup viewGroupB = b(viewGroupA2);
                    if (viewGroupB == null) {
                        int childCount = viewGroupA2.getChildCount();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= childCount) {
                                viewGroup = null;
                                break;
                            }
                            View childAt = viewGroupA2.getChildAt(i2);
                            if ((childAt instanceof ViewGroup) && !(childAt instanceof AnimatedBackgroundView) && !(childAt instanceof StatefulAnimatedBackground)) {
                                viewGroup = (ViewGroup) childAt;
                                break;
                            }
                            i2++;
                        }
                    } else {
                        viewGroup = viewGroupB;
                    }
                    if (viewGroup != null) {
                        this.f169817h = viewGroup;
                        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        this.f169816g = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    } else {
                        viewGroup = null;
                    }
                }
            } else {
                viewGroup = this.f169817h;
            }
            if (viewGroup != null) {
                if (i == 0) {
                    Integer numValueOf = !(dVar2 instanceof rv0.c) ? Integer.valueOf(((Number) this.i.getValue()).intValue()) : null;
                    iIntValue = this.f169816g + (numValueOf != null ? numValueOf.intValue() : 0);
                } else {
                    iIntValue = this.f169816g;
                }
                ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams.bottomMargin = iIntValue;
                viewGroup.setLayoutParams(marginLayoutParams);
            }
            this.f169818j.setTag(R$id.internal_keyboardSuggestionsDisplayer_imeInsetsVariant, dVar2);
            if (i == 8) {
                this.f169817h = null;
            }
        }
    }
}
