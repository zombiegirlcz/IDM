package kli;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.text.method.MovementMethod;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import ao.j;
import com.google.protobuf.k3;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.tracking.v3.AnalyticEvent;
import e8.q;
import efm.d;
import efm.d0;
import efm.f;
import efm.h0;
import efm.k;
import efm.n;
import efm.r;
import efm.y;
import fo.h;
import fo.i;
import grl.fc;
import ix0.c0;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lfm.e;
import ljl.p1;
import ljl.q1;
import nkm.p;
import or0.l;
import or0.u;
import rfm.e0;
import ty0.g;
import v3e.s;
import wl0.o;
import xab.z0;
import yhm.m;
import zhm.b1;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a implements d4m.b {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlinx.serialization.KSerializer A(tlm.e r5, kotlin.reflect.KType r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kli.a.A(tlm.e, kotlin.reflect.KType, boolean):kotlinx.serialization.KSerializer");
    }

    public static final int B(Context context, float f) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (int) (f * context.getResources().getDisplayMetrics().scaledDensity);
    }

    public static final j C(i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        String id10 = iVar.f136731b.getId();
        Intrinsics.checkNotNullExpressionValue(id10, "getId(...)");
        byte[] bArr = iVar.f136732c;
        k3 clientTimestamp = iVar.f136731b.getClientTimestamp();
        Intrinsics.checkNotNullExpressionValue(clientTimestamp, "getClientTimestamp(...)");
        Intrinsics.checkNotNullParameter(clientTimestamp, "<this>");
        return new j(id10, bArr, TimeUnit.NANOSECONDS.toMillis(clientTimestamp.getNanos()) + TimeUnit.SECONDS.toMillis(clientTimestamp.getSeconds()), iVar.f136730a);
    }

    public static final fc D(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        int i = z0.f303868b[oVar.ordinal()];
        if (i == 1) {
            return fc.Pin;
        }
        if (i == 2) {
            return fc.Fingerprint;
        }
        if (i == 3) {
            return fc.Face;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static boolean E(Object obj2, kfm.o oVar, d dVar) {
        f fVar;
        if (!(obj2 instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) obj2).call();
            if (objCall != null) {
                Object objApply = oVar.apply(objCall);
                mfm.f.b(objApply, "The mapper returned a null CompletableSource");
                fVar = (f) objApply;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                fVar.d(dVar);
                return true;
            }
            dVar.onSubscribe(e.INSTANCE);
            dVar.onComplete();
            return true;
        } catch (Throwable th10) {
            m70.a.u(th10);
            dVar.onSubscribe(e.INSTANCE);
            dVar.onError(th10);
            return true;
        }
    }

    public static boolean F(Object obj2, kfm.o oVar, y yVar) {
        n nVar;
        if (!(obj2 instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) obj2).call();
            if (objCall != null) {
                Object objApply = oVar.apply(objCall);
                mfm.f.b(objApply, "The mapper returned a null MaybeSource");
                nVar = (n) objApply;
            } else {
                nVar = null;
            }
            if (nVar == null) {
                e.a(yVar);
                return true;
            }
            ((k) nVar).i(new e0(yVar, 0));
            return true;
        } catch (Throwable th10) {
            m70.a.u(th10);
            e.d(th10, yVar);
            return true;
        }
    }

    public static boolean G(Object obj2, kfm.o oVar, y yVar) {
        h0 h0Var;
        if (!(obj2 instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) obj2).call();
            if (objCall != null) {
                Object objApply = oVar.apply(objCall);
                mfm.f.b(objApply, "The mapper returned a null SingleSource");
                h0Var = (h0) objApply;
            } else {
                h0Var = null;
            }
            if (h0Var == null) {
                e.a(yVar);
                return true;
            }
            ((d0) h0Var).q(new e0(yVar, 1));
            return true;
        } catch (Throwable th10) {
            m70.a.u(th10);
            e.d(th10, yVar);
            return true;
        }
    }

    public static final int H(Context context, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return rim.d.c(TypedValue.applyDimension(i, i2, context.getResources().getDisplayMetrics()));
    }

    public static final void I(TextView textView, Clause clause) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        f(textView, (clause == null || !((bp0.y) u.k(textView).b0()).t(clause)) ? null : c0.f169220a);
    }

    public static final q J(int i, View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return new q(view, i);
    }

    public static final Iterator K(Iterator iterator, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return !iterator.hasNext() ? zhm.e0.f322469a : p.a(new b1(i, i2, iterator, z, null));
    }

    public static Class L(Class cls) {
        return cls == Integer.TYPE ? Integer.class : cls == Float.TYPE ? Float.class : cls == Byte.TYPE ? Byte.class : cls == Double.TYPE ? Double.class : cls == Long.TYPE ? Long.class : cls == Character.TYPE ? Character.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Void.TYPE ? Void.class : cls;
    }

    public static final void a(TextView textView, Clause clause, TrackableItem trackableItem, Function1 function1, g handleTypeface) {
        l lVar;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(trackableItem, "trackableItem");
        Intrinsics.checkNotNullParameter(handleTypeface, "handleTypeface");
        if (clause == null) {
            Object tag2 = textView.getTag(R$id.internal_trackable_clause_click_listener);
            l lVar2 = tag2 instanceof l ? (l) tag2 : null;
            if (lVar2 != null) {
                lVar2.a();
            }
            bp0.y yVar = (bp0.y) u.k(textView).b0();
            if (yVar.o(textView) == null) {
                textView.setText((CharSequence) null);
            } else {
                yVar.l(null, textView, null, handleTypeface);
            }
            textView.setVisibility(8);
            return;
        }
        if (function1 != null) {
            Object tag3 = textView.getTag(R$id.internal_trackable_clause_click_listener);
            lVar = tag3 instanceof l ? (l) tag3 : null;
            if (lVar == null) {
                lVar = new l(textView);
                textView.setTag(R$id.internal_trackable_clause_click_listener, lVar);
            }
            lVar.b(trackableItem, function1);
        } else {
            lVar = null;
        }
        if (lVar == null) {
            Object tag4 = textView.getTag(R$id.internal_trackable_clause_click_listener);
            l lVar3 = tag4 instanceof l ? (l) tag4 : null;
            if (lVar3 != null) {
                lVar3.a();
            }
        }
        ((bp0.y) u.k(textView).b0()).l(clause, textView, lVar, handleTypeface);
        textView.setVisibility(0);
    }

    public static final void b(TextView textView, Clause clause, g handleTypeface) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(handleTypeface, "handleTypeface");
        e(textView, clause, null, handleTypeface, 0, 8);
    }

    public static /* synthetic */ void d(TextView textView, Clause clause, TrackableItem trackableItem, Function1 function1, int i) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        a(textView, clause, trackableItem, function1, ty0.f.f275450a);
    }

    public static void e(TextView textView, Clause clause, Function1 function1, g handleTypeface, int i, int i2) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        if ((i2 & 4) != 0) {
            handleTypeface = ty0.f.f275450a;
        }
        if ((i2 & 8) != 0) {
            i = 8;
        }
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(handleTypeface, "handleTypeface");
        if (clause != null) {
            ((bp0.y) u.k(textView).b0()).l(clause, textView, function1, handleTypeface);
            textView.setVisibility(0);
            return;
        }
        bp0.y yVar = (bp0.y) u.k(textView).b0();
        if (yVar.o(textView) == null) {
            textView.setText((CharSequence) null);
        } else {
            yVar.l(null, textView, null, handleTypeface);
        }
        textView.setVisibility(i);
    }

    public static final void f(TextView textView, MovementMethod movementMethod) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setMovementMethod(movementMethod);
        textView.setLongClickable(false);
        textView.setClickable(false);
    }

    public static final void g(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException((i != i2 ? com.google.android.gms.internal.mlkit_vision_face.a.m("Both size ", i, i2, " and step ", " must be greater than zero.") : j6.a.l(i, "size ", " must be greater than zero.")).toString());
        }
    }

    public static final r h(r a7, r b4) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        r rVarCombineLatest = r.combineLatest(a7, b4, new s(new pq0.d(8), 1));
        Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
        return rVarCombineLatest;
    }

    public static final r i(r a7, r b4, r c2) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        return nim.a.w(h(h(a7, b4), c2), new qza.q(16));
    }

    public static final i j(h hVar, String host, AnalyticEvent event) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(event, "event");
        byte[] byteArray = event.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return new i(host, event, byteArray);
    }

    public static final int k(Context context, float f) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (int) (f * context.getResources().getDisplayMetrics().density);
    }

    public static final float l(Context context, float f) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return f * context.getResources().getDisplayMetrics().density;
    }

    public static final Activity m(Context context) {
        boolean z;
        Intrinsics.checkNotNullParameter(context, "<this>");
        while (true) {
            z = context instanceof Activity;
            if (!z && (context instanceof ContextWrapper)) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() == null) {
                    break;
                }
                context = contextWrapper.getBaseContext();
                Intrinsics.checkNotNullExpressionValue(context, "getBaseContext(...)");
            } else {
                break;
            }
        }
        if (z) {
            return (Activity) context;
        }
        return null;
    }

    public static final q1 n(Activity activity) {
        Object objA;
        b60.a aVar;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        try {
            m.Companion aVar2 = m.INSTANCE;
            phm.a aVar3 = (phm.a) ue0.e.j(activity).a().get(q1.class);
            aVar = aVar3 != null ? (b60.a) aVar3.get() : null;
        } catch (Throwable th10) {
            m.Companion aVar4 = m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        if (aVar != null) {
            objA = (q1) aVar.b();
            q1 q1Var = (q1) (objA instanceof yhm.n ? null : objA);
            return q1Var == null ? p1.Companion.g() : q1Var;
        }
        throw new IllegalStateException("Api " + q1.class + " is not found");
    }

    public static final int o(Context context) {
        Object objA;
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            m.Companion aVar = m.INSTANCE;
            objA = Integer.valueOf(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
        } catch (Throwable th10) {
            m.Companion aVar2 = m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        if (objA instanceof yhm.n) {
            objA = 0;
        }
        int iIntValue = ((Number) objA).intValue();
        if (iIntValue > 0) {
            return context.getResources().getDimensionPixelSize(iIntValue);
        }
        return 0;
    }

    public static void p(bsi.a aVar, pri.f authorizedPresenterDelegate) {
        aVar.getClass();
        Intrinsics.checkNotNullParameter(authorizedPresenterDelegate, "authorizedPresenterDelegate");
        aVar.P(zhm.u.c(authorizedPresenterDelegate));
    }

    public static final boolean q(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static final boolean r(int i, Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(i, typedValue, true) && typedValue.data != 0;
    }

    public static final int s(int i, Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return ContextCompat.getColor(context, typedValue.resourceId);
    }

    public static final ColorStateList t(int i, Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        ColorStateList colorStateList = AppCompatResources.getColorStateList(context, i);
        Intrinsics.checkNotNullExpressionValue(colorStateList, "getColorStateList(...)");
        return colorStateList;
    }

    public static final ColorStateList u(int i, Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        ColorStateList colorStateList = AppCompatResources.getColorStateList(context, x(i, context));
        Intrinsics.checkNotNullExpressionValue(colorStateList, "getColorStateList(...)");
        return colorStateList;
    }

    public static final float v(int i, Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return context.getResources().getDimension(typedValue.resourceId);
    }

    public static final int w(int i, Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return context.getResources().getDimensionPixelSize(typedValue.resourceId);
    }

    public static final int x(int i, Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    public static final int y(Context context, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        return !context.getTheme().resolveAttribute(i, typedValue, true) ? i2 : typedValue.resourceId;
    }

    public static final float z(int i, Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return i / context.getResources().getDisplayMetrics().density;
    }
}
