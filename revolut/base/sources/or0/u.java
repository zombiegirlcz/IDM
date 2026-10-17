package or0;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import au0.x4;
import bp0.y;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import ip0.j5;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f228038a = yhm.j.c(yhm.k.NONE, new oqj.d(1));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f228039b = new int[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f228040c = new int[2];

    public static final void A(View view, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.height == i && layoutParams.width == i2) {
            return;
        }
        layoutParams.height = i;
        layoutParams.width = i2;
        view.setLayoutParams(layoutParams);
    }

    public static final void B(int i, View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.width != i) {
            layoutParams.width = i;
            view.setLayoutParams(layoutParams);
        }
    }

    public static final void a(View view, Function1 listener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        b(view, false, listener);
    }

    public static final void b(View view, boolean z, Function1 listener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        c cVarI = i(view);
        View view2 = cVarI.f228006a;
        Intrinsics.checkNotNullParameter(listener, "listener");
        ArrayList arrayList = cVarI.f228008c;
        if (!arrayList.contains(listener)) {
            arrayList.add(listener);
        }
        if (z) {
            WindowInsets windowInsets = cVarI.d;
            if (windowInsets != null) {
                listener.invoke(windowInsets);
                return;
            }
            if (view2.isAttachedToWindow()) {
                view2.requestApplyInsets();
            } else if (cVarI.e == null) {
                x4 x4Var = new x4(cVarI, 2);
                view2.addOnAttachStateChangeListener(x4Var);
                cVarI.e = x4Var;
            }
        }
    }

    public static final void c(View view, Clause clause) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(clause != null ? 0 : 8);
    }

    public static final void d(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag2 = view.getTag(R$id.internal_touch_delegate_holder_tag);
        k kVar = tag2 instanceof k ? (k) tag2 : null;
        if (kVar != null) {
            kVar.b();
        }
    }

    public static final void e(View view, Function1 action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        action.invoke(view);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                e(viewGroup.getChildAt(i), action);
            }
        }
    }

    public static final void f(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewCompat.setNestedScrollingEnabled(view, false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                f(childAt);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Lifecycle g(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            if (context2 instanceof LifecycleOwner) {
                return ((LifecycleOwner) context2).getLifecycle();
            }
            Context baseContext = ((ContextWrapper) context2).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
            context2 = baseContext;
        }
        Object applicationContext = context2.getApplicationContext();
        if (applicationContext instanceof LifecycleOwner) {
            return ((LifecycleOwner) applicationContext).getLifecycle();
        }
        throw new IllegalStateException("View has no context that is lifecycle owner");
    }

    public static final th0.a h(ViewGroup viewGroup) {
        th0.a aVar;
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        try {
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            aVar = (th0.a) ue0.e.i(ue0.e.j(context), th0.a.class);
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            aVar = null;
        }
        return aVar == null ? (th0.a) th0.l.Companion.c() : aVar;
    }

    public static final c i(View view) {
        Object tag2 = view.getTag(R$id.internal_on_apply_window_insets_listener_tag);
        c cVar = tag2 instanceof c ? (c) tag2 : null;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(view);
        view.setTag(R$id.internal_on_apply_window_insets_listener_tag, cVar2);
        ViewCompat.setOnApplyWindowInsetsListener(view, cVar2);
        return cVar2;
    }

    public static final k j(View view) {
        Object tag2 = view.getTag(R$id.internal_touch_delegate_holder_tag);
        if (tag2 != null) {
            if (!(tag2 instanceof k)) {
                tag2 = null;
            }
            k kVar = (k) tag2;
            if (kVar != null) {
                return kVar;
            }
        }
        k kVar2 = new k(view);
        view.setTag(R$id.internal_touch_delegate_holder_tag, kVar2);
        return kVar2;
    }

    public static final wy0.a k(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return jh.d.f(context);
    }

    public static final void l(View view, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        k kVarJ = j(view);
        kVarJ.d(i, i2, i3, i5);
        kVarJ.a();
    }

    public static final void m(View view, View anotherView, int[] outLocation) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(anotherView, "anotherView");
        Intrinsics.checkNotNullParameter(outLocation, "outLocation");
        int[] iArr = f228039b;
        view.getLocationInWindow(iArr);
        int[] iArr2 = f228040c;
        anotherView.getLocationInWindow(iArr2);
        outLocation[0] = iArr[0] - iArr2[0];
        outLocation[1] = iArr[1] - iArr2[1];
    }

    public static final void n(TextView textView, boolean z) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        ((y) k(textView).b0()).s(textView, z);
    }

    public static final void o(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setOnClickListener(null);
        view.setClickable(false);
    }

    public static final void p(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
    }

    public static final void q(View view, Function1 listener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Object tag2 = view.getTag(R$id.internal_on_apply_window_insets_listener_tag);
        c cVar = tag2 instanceof c ? (c) tag2 : null;
        if (cVar == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(listener, "listener");
        cVar.f228008c.remove(listener);
    }

    public static final void r(View view, TrackableItem component, Clause clause, View.OnClickListener delegate) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        s(view, component, clause != null ? new py0.c(clause) : null, delegate);
    }

    public static final void s(View view, TrackableItem component, py0.d dVar, View.OnClickListener delegate) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        view.setOnClickListener(new j5(component, 7, dVar, delegate));
    }

    public static final void t(ImageView imageView, TrackableItem component, View.OnClickListener delegate) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        s(imageView, component, null, delegate);
    }

    public static final void u(TextView textView, TrackableItem component, View.OnClickListener delegate) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        r(textView, component, null, delegate);
    }

    public static final void v(int i, View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setClipToOutline(true);
        view.setOutlineProvider(new t(i, 0));
    }

    public static final void w(int i, View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.height != i) {
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }

    public static final void x(View view, int i, int i2, int i3, int i5) {
        boolean z;
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        boolean z3 = true;
        if (i < 0 || i == marginLayoutParams.leftMargin) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i;
            z = true;
        }
        if (i2 >= 0 && i2 != marginLayoutParams.topMargin) {
            marginLayoutParams.topMargin = i2;
            z = true;
        }
        if (i5 >= 0 && i5 != marginLayoutParams.bottomMargin) {
            marginLayoutParams.bottomMargin = i5;
            z = true;
        }
        if (i3 < 0 || i3 == marginLayoutParams.rightMargin) {
            z3 = z;
        } else {
            marginLayoutParams.rightMargin = i3;
        }
        if (z3) {
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static /* synthetic */ void y(View view, int i, int i2, int i3, int i5, int i6) {
        if ((i6 & 1) != 0) {
            i = -1;
        }
        if ((i6 & 2) != 0) {
            i2 = -1;
        }
        if ((i6 & 4) != 0) {
            i3 = -1;
        }
        if ((i6 & 8) != 0) {
            i5 = -1;
        }
        x(view, i, i2, i3, i5);
    }

    public static void z(View view, int i, int i2, int i3, int i5, boolean z, int i6) {
        if ((i6 & 1) != 0) {
            i = -1;
        }
        if ((i6 & 2) != 0) {
            i2 = -1;
        }
        if ((i6 & 4) != 0) {
            i3 = -1;
        }
        if ((i6 & 8) != 0) {
            i5 = -1;
        }
        boolean z3 = false;
        if ((i6 & 16) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        boolean z4 = true;
        if (i >= 0 && i != marginLayoutParams.getMarginStart()) {
            marginLayoutParams.setMarginStart(i);
            z3 = true;
        }
        if (i2 >= 0 && i2 != marginLayoutParams.topMargin) {
            marginLayoutParams.topMargin = i2;
            z3 = true;
        }
        if (i5 >= 0 && i5 != marginLayoutParams.bottomMargin) {
            marginLayoutParams.bottomMargin = i5;
            z3 = true;
        }
        if (i3 < 0 || i3 == marginLayoutParams.getMarginEnd()) {
            z4 = z3;
        } else {
            marginLayoutParams.setMarginEnd(i3);
        }
        if (!z4 || z) {
            return;
        }
        view.setLayoutParams(marginLayoutParams);
    }
}
