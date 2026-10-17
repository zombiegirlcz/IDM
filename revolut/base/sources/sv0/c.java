package sv0;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsAnimation;
import android.view.inputmethod.EditorInfo;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.keyboard.ui.R$dimen;
import com.revolut.core.ui_kit.keyboard.ui.R$id;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import ht0.b0;
import ie.a0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import nkm.t;
import or0.u;
import org.jetbrains.annotations.NotNull;
import rv0.f;
import rv0.g;
import rv0.k;
import ss4.z;
import tv0.m;
import tv0.n;
import wv0.d;
import yhm.j;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements k {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uv0.b f265811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Window f265812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f265813c;
    public final EditorInfo d;
    public Integer e;
    public WeakReference f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WeakReference f265814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final onh.b f265815h;
    public final prl.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n f265816j;
    public Integer k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f265817l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f265818m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Lazy f265819n;
    public final Lazy o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Lazy f265820p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a80.e f265821q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sl5.a f265822r;

    public c(Activity activity, uv0.b keyboardRepository) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(keyboardRepository, "keyboardRepository");
        this.f265811a = keyboardRepository;
        Window window = activity.getWindow();
        this.f265812b = window;
        Intrinsics.checkNotNullExpressionValue(window, "window");
        vv0.b bVar = new vv0.b(window);
        Context context = window.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        vv0.c cVar = new vv0.c(context);
        Intrinsics.checkNotNullExpressionValue(window, "window");
        vv0.a[] elements = {bVar, cVar, new vv0.c(window)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        this.f265813c = setY0;
        this.d = new EditorInfo();
        this.f265815h = new onh.b(this, 23);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        this.i = new prl.e(decorView, f());
        View decorView2 = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "getDecorView(...)");
        this.f265816j = new n(decorView2, new a(this, 1), new a(this, 2), new a(this, 3), new b0(0, this, c.class, "releaseCustomKeyboardAfterHandover", "releaseCustomKeyboardAfterHandover()V", 0, 20));
        this.f265817l = f.a.f257638a;
        this.f265819n = j.b(new a(this, 4));
        this.o = j.b(new a(this, 5));
        this.f265820p = j.b(new a(this, 6));
        this.f265821q = new a80.e(activity);
        this.f265822r = new sl5.a(this, 24);
        Iterator it8 = setY0.iterator();
        while (it8.hasNext()) {
            ((vv0.a) it8.next()).b(new b0(0, this, c.class, "onToggleStateChanged", "onToggleStateChanged()V", 0, 19));
        }
        View decorView3 = this.f265812b.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "getDecorView(...)");
        sl5.a modifier = this.f265822r;
        Object obj2 = u.f228038a;
        Intrinsics.checkNotNullParameter(decorView3, "<this>");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        or0.c cVarI = u.i(decorView3);
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        ArrayList arrayList = cVarI.f228007b;
        if (!arrayList.contains(modifier)) {
            arrayList.add(modifier);
        }
        n nVar = this.f265816j;
        if (Build.VERSION.SDK_INT < 30) {
            nVar.getClass();
        } else {
            ViewCompat.setWindowInsetsAnimationCallback(nVar.f274678a, (m) nVar.f274684l.getValue());
        }
        this.f265812b.getDecorView().addOnAttachStateChangeListener(new es0.k(this, 8));
        ViewCompat.requestApplyInsets(this.f265812b.getDecorView());
    }

    public static void g(c cVar, boolean z, int i) {
        WindowInsetsAnimation windowInsetsAnimation;
        Integer numValueOf;
        boolean z3 = (i & 1) == 0;
        if ((i & 2) != 0) {
            z = false;
        }
        Window window = cVar.f265812b;
        prl.e eVar = cVar.i;
        g gVarE = cVar.e();
        FrameLayout container = cVar.d();
        container.animate().cancel();
        boolean zB = cVar.b();
        f.a aVar = f.a.f257638a;
        if (!zB || z3 || z) {
            tv0.e eVar2 = (tv0.e) eVar.d;
            if (eVar2 != null && (windowInsetsAnimation = eVar2.f) != null) {
                ValueAnimator valueAnimator = eVar2.f274667b;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                eVar2.c(windowInsetsAnimation);
            }
            if (!z3) {
                cVar.f265817l = aVar;
                ViewCompat.requestApplyInsets(window.getDecorView());
                cVar.f265814g = null;
            }
            if (!z) {
                container.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(200L).withEndAction(new a0(container, cVar, gVarE, z3, 3)).start();
                return;
            } else {
                container.setVisibility(8);
                o(cVar, gVarE, 2);
                return;
            }
        }
        int iA = cVar.f265817l.a();
        s86.a onSettled = new s86.a(cVar, gVarE, 29);
        eVar.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(onSettled, "onSettled");
        tv0.e eVar3 = (tv0.e) eVar.d;
        if (eVar3 != null) {
            Integer num = (Integer) eVar.e;
            if (num != null) {
                int iIntValue = num.intValue();
                eVar.e = null;
                int iC = iIntValue - rim.d.c(container.getTranslationY());
                eVar3.b(iC, true);
                WindowInsetsAnimation windowInsetsAnimation2 = eVar3.f;
                if (windowInsetsAnimation2 != null) {
                    eVar3.f274668c = null;
                    ValueAnimator valueAnimator2 = eVar3.f274667b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    eVar3.c(windowInsetsAnimation2);
                }
                numValueOf = Integer.valueOf(iC);
            } else {
                numValueOf = null;
            }
            int iIntValue2 = numValueOf != null ? numValueOf.intValue() : iA;
            WindowInsetsAnimation windowInsetsAnimation3 = eVar3.f;
            if (windowInsetsAnimation3 != null) {
                ValueAnimator valueAnimator3 = eVar3.f274667b;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                eVar3.c(windowInsetsAnimation3);
            }
            eVar3.a(iIntValue2, 0, new tv0.f(container, iA, 1), new tml.a(container, onSettled, 17));
        }
        cVar.f265817l = aVar;
        ViewCompat.requestApplyInsets(window.getDecorView());
        cVar.f265814g = null;
    }

    public static void i(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i);
            if (childAt instanceof rv0.a) {
                ((rv0.a) childAt).c();
            }
            if (childAt instanceof ViewGroup) {
                i((ViewGroup) childAt);
            }
        }
    }

    public static void o(c cVar, g gVar, int i) {
        if ((i & 1) != 0) {
            gVar = cVar.e();
        }
        if ((i & 2) != 0) {
            n nVar = cVar.f265816j;
            nVar.c();
            if (Build.VERSION.SDK_INT >= 30 && nVar.f274681g) {
                nVar.f274681g = false;
                if (nVar.f == 0) {
                    nVar.d();
                }
            }
        }
        if (gVar == null) {
            cVar.getClass();
            return;
        }
        f fVar = cVar.f265817l;
        rv0.e eVar = fVar instanceof rv0.e ? (rv0.e) fVar : null;
        if (eVar != null) {
            cVar.f265817l = rv0.e.b(eVar, 0, 5);
        }
        FrameLayout frameLayoutA = cVar.a();
        if (frameLayoutA != null) {
            frameLayoutA.removeView(gVar.getView());
            frameLayoutA.setPaddingRelative(0, ((Number) cVar.f265819n.getValue()).intValue(), 0, ((Number) cVar.o.getValue()).intValue());
            frameLayoutA.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        }
        cVar.f265818m = true;
        ReactionsKeyboardView reactionsKeyboardView = (ReactionsKeyboardView) gVar;
        reactionsKeyboardView.N = null;
        zx0.j jVar = zx0.j.HIDDEN;
        if (reactionsKeyboardView.getState() == jVar) {
            return;
        }
        reactionsKeyboardView.setState(jVar);
    }

    public final FrameLayout a() {
        Object next;
        Iterator it8 = ViewGroupKt.getChildren(f()).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((View) next).getId() == R$id.custom_keyboard_container_id) {
                break;
            }
        }
        if (next instanceof FrameLayout) {
            return (FrameLayout) next;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean b() {
        return ((tv0.e) this.i.d) != null && ((Boolean) jo0.g.G.getValue()).booleanValue();
    }

    public final su9.c c(int i, int i2) {
        boolean z = (i & 15) == 2 && (i & 8192) != 0;
        int i3 = i2 & 15;
        boolean z3 = i3 != 0;
        if (!z && !z3) {
            return null;
        }
        d.b bVar = (i3 == 1 || i3 == 2) ? new d.b(false) : new d.b(true);
        return new su9.c(new wv0.b(bVar, 0), new wv0.b(bVar, 1));
    }

    public final FrameLayout d() {
        int dimensionPixelSize;
        Insets insets;
        FrameLayout frameLayoutF = f();
        FrameLayout frameLayoutA = a();
        if (frameLayoutA != null && (e() != null || !this.f265818m)) {
            return frameLayoutA;
        }
        this.f265818m = false;
        int i = ((uv0.d) this.f265811a).f283259a.getInt("system_keyboard_height_px_v2", -1);
        Integer numValueOf = Integer.valueOf(i);
        if (i == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            dimensionPixelSize = numValueOf.intValue();
        } else {
            Window window = this.f265812b;
            WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(window.getDecorView());
            dimensionPixelSize = window.getContext().getResources().getDimensionPixelSize(R$dimen.internal_keyboard_default_height) + ((rootWindowInsets == null || (insets = rootWindowInsets.getInsets(WindowInsetsCompat.Type.systemBars())) == null) ? 0 : insets.bottom);
        }
        Lazy lazy = this.o;
        int iIntValue = ((Number) lazy.getValue()).intValue() + dimensionPixelSize;
        Lazy lazy2 = this.f265819n;
        int iIntValue2 = (((Number) lazy2.getValue()).intValue() + iIntValue) - ((Number) this.f265820p.getValue()).intValue();
        if (frameLayoutA != null) {
            ViewGroup.LayoutParams layoutParams = frameLayoutA.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = iIntValue2;
            frameLayoutA.setLayoutParams(layoutParams);
            return frameLayoutA;
        }
        FrameLayout frameLayout = new FrameLayout(frameLayoutF.getContext());
        frameLayout.setId(R$id.custom_keyboard_container_id);
        frameLayout.setAlpha(BitmapDescriptorFactory.HUE_RED);
        frameLayout.setPaddingRelative(0, ((Number) lazy2.getValue()).intValue(), 0, ((Number) lazy.getValue()).intValue());
        frameLayoutF.addView(frameLayout, new FrameLayout.LayoutParams(-1, iIntValue2, 80));
        return frameLayout;
    }

    public final g e() {
        f fVar = this.f265817l;
        rv0.e eVar = fVar instanceof rv0.e ? (rv0.e) fVar : null;
        if (eVar != null) {
            return eVar.f257636b;
        }
        return null;
    }

    public final FrameLayout f() {
        View viewFindViewById = this.f265812b.getDecorView().findViewById(R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        return (FrameLayout) viewFindViewById;
    }

    public final void h(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        boolean zK = k(view);
        Window window = this.f265812b;
        if (zK) {
            WindowCompat.getInsetsController(window, view).hide(WindowInsetsCompat.Type.ime());
            return;
        }
        if (this.f265817l instanceof rv0.e) {
            g(this, false, 3);
        }
        if (this.f265817l instanceof f.b) {
            WindowCompat.getInsetsController(window, view).hide(WindowInsetsCompat.Type.ime());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(android.view.View r5) {
        /*
            r4 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r5 instanceof yz0.a
            r1 = 0
            if (r0 == 0) goto L16
            r0 = r5
            yz0.a r0 = (yz0.a) r0
            int r0 = r0.getInputType()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L27
        L16:
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 == 0) goto L26
            r0 = r5
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r0 = r0.getInputType()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L27
        L26:
            r0 = r1
        L27:
            r2 = 0
            if (r0 == 0) goto L6e
            int r0 = r0.intValue()
            boolean r3 = r5 instanceof rx0.q
            if (r3 == 0) goto L35
            r1 = r5
            rx0.q r1 = (rx0.q) r1
        L35:
            if (r1 == 0) goto L3c
            int r5 = r1.getUiKitInputType()
            goto L3d
        L3c:
            r5 = r2
        L3d:
            java.util.Set r1 = r4.f265813c
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r3 = r1 instanceof java.util.Collection
            if (r3 == 0) goto L4f
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L4f
            goto L66
        L4f:
            java.util.Iterator r1 = r1.iterator()
        L53:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L66
            java.lang.Object r3 = r1.next()
            vv0.a r3 = (vv0.a) r3
            boolean r3 = r3.a()
            if (r3 != 0) goto L53
            goto L6e
        L66:
            su9.c r5 = r4.c(r0, r5)
            if (r5 == 0) goto L6e
            r5 = 1
            return r5
        L6e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: sv0.c.j(android.view.View):boolean");
    }

    public final boolean k(View view) {
        View view2;
        g gVarE = e();
        if (gVarE == null || (view2 = gVarE.getView()) == null) {
            return false;
        }
        Iterator it8 = t.g(view, new z(11)).iterator();
        while (it8.hasNext()) {
            if (((View) it8.next()) == view2) {
                return true;
            }
        }
        return false;
    }

    public final boolean l(boolean z) {
        g gVarE = e();
        if (gVarE == null) {
            if (this.f265817l instanceof rv0.e) {
                g(this, false, 3);
                if (z) {
                }
            }
            return false;
        }
        ReactionsKeyboardView reactionsKeyboardView = (ReactionsKeyboardView) gVarE;
        zx0.j backState = reactionsKeyboardView.getBackState();
        if (backState == null || backState == zx0.j.HIDDEN) {
            g(this, !b(), 1);
            return true;
        }
        if (reactionsKeyboardView.getState() != backState) {
            reactionsKeyboardView.setState(backState);
            return true;
        }
        return true;
    }

    public final void m(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        WeakReference weakReference = this.f265814g;
        if (Intrinsics.f(weakReference != null ? (View) weakReference.get() : null, view) && (this.f265817l instanceof rv0.e)) {
            View viewFindFocus = this.f265812b.getDecorView().findFocus();
            if (viewFindFocus == null || !viewFindFocus.onCheckIsTextEditor()) {
                g(this, true, 1);
            } else {
                viewFindFocus.requestFocus();
                p(viewFindFocus);
            }
        }
    }

    public final void n(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (Intrinsics.f(this.f265817l, f.a.f257638a)) {
            return;
        }
        p(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(android.view.View r19) {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sv0.c.p(android.view.View):void");
    }
}
