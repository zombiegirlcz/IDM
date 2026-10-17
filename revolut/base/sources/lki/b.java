package lki;

import android.animation.Animator;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b implements x {

    @NotNull
    private static final a Companion = new a(0);
    public static Field e;
    public static boolean f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Animator f196454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z f196455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f196456c;
    public View d;

    /* JADX INFO: loaded from: classes10.dex */
    public static final class a {
        private a() {
        }

        public a(int i) {
        }
    }

    public static void b(int i, View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            a41.g.h(i, view);
            return;
        }
        Field declaredField = e;
        if (!f) {
            try {
                declaredField = View.class.getDeclaredField("mViewFlags");
                declaredField.setAccessible(true);
                e = declaredField;
            } catch (NoSuchFieldException unused) {
                gom.c cVar = gom.e.f145194a;
                cVar.f("AnimationTransition");
                cVar.d("fetchViewFlagsField failed.", new Object[0]);
            }
            f = true;
        }
        if (declaredField != null) {
            try {
                declaredField.setInt(view, (declaredField.getInt(view) & (-13)) | i);
                return;
            } catch (IllegalAccessException unused2) {
            }
        }
        view.setVisibility(i);
    }

    public abstract Animator a(View view, View view2, boolean z);

    public void c(View view, lki.a animation) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (view.getWidth() > 0) {
            animation.invoke();
        } else if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new cli.u(animation, 8));
        } else {
            animation.invoke();
        }
    }

    @Override // lki.x
    public void e(View view, View view2, boolean z, z transitionListener) {
        Intrinsics.checkNotNullParameter(transitionListener, "transitionListener");
        int i = this.f196456c + 1;
        this.f196456c = i;
        this.d = view2;
        if (view2 != null) {
            b(4, view2);
        }
        transitionListener.o();
        View view3 = view2 == null ? view : view2;
        Intrinsics.h(view3);
        c(view3, new lki.a(i, this, view2, view, z, transitionListener));
    }

    @Override // lki.x
    public void g() {
        this.f196456c++;
        Animator animator = this.f196454a;
        if (animator == null) {
            View view = this.d;
            if (view != null) {
                b(0, view);
                Object parent = view.getParent();
                View view2 = parent instanceof View ? (View) parent : null;
                if (view2 != null) {
                    view2.invalidate();
                    Unit unit = Unit.f186387a;
                }
            }
            this.d = null;
        } else {
            animator.removeAllListeners();
            animator.end();
        }
        this.f196454a = null;
        this.d = null;
        z zVar = this.f196455b;
        if (zVar != null) {
            zVar.r();
        }
        z zVar2 = this.f196455b;
        if (zVar2 != null) {
            zVar2.q();
        }
        this.f196455b = null;
    }
}
