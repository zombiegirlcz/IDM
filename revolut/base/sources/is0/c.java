package is0;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.core.content.res.ResourcesCompat;
import com.revolut.core.ui_kit_resources.R$font;
import fd0.d;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f168079a = new d(8);

    private c() {
    }

    public static Typeface a(int i, Context context) {
        Typeface typeface;
        Object objA;
        Object objC;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z = i == R$font.aeonik_pro_medium || i == R$font.aeonik_pro_black;
        if (Build.VERSION.SDK_INT < 29 || !z) {
            typeface = null;
        } else {
            d dVar = f168079a;
            Integer numValueOf = Integer.valueOf(i);
            synchronized (dVar) {
                objC = dVar.c(numValueOf);
                if (objC == null) {
                    b.f();
                    q2.a.r();
                    q2.a.x();
                    Typeface.CustomFallbackBuilder customFallbackBuilderG = q2.a.g(q2.a.k(b.d(context.getResources(), i).build()).build());
                    q2.a.r();
                    q2.a.x();
                    objC = customFallbackBuilderG.addCustomFallback(q2.a.k(b.d(context.getResources(), R$font.inter_variable).build()).build()).build();
                    Intrinsics.checkNotNullExpressionValue(objC, "build(...)");
                    dVar.d(numValueOf, objC);
                }
            }
            typeface = (Typeface) objC;
        }
        if (typeface != null) {
            return typeface;
        }
        try {
            m.Companion companion = m.INSTANCE;
            objA = ResourcesCompat.getFont(context, i);
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            e.h(new IllegalStateException(a0.d.h(i, " font is not found"), thA));
        }
        return (Typeface) (objA instanceof n ? null : objA);
    }
}
