package z0m;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f318666a;

    public s(Context context, c1m.h hVar) {
        DisplayMetrics displayMetrics;
        j1m.b bVar;
        Intrinsics.checkNotNullParameter(context, "context");
        HashMap map = new HashMap();
        this.f318666a = map;
        String id10 = Calendar.getInstance().getTimeZone().getID();
        if (id10 != null) {
            map.put("tz", id10);
        }
        String displayLanguage = Locale.getDefault().getDisplayLanguage();
        if (displayLanguage != null) {
            map.put("lang", displayLanguage);
        }
        if (Intrinsics.f(Boolean.valueOf(hVar.k()), Boolean.TRUE)) {
            int i = context.getResources().getDisplayMetrics().widthPixels;
            int i2 = context.getResources().getDisplayMetrics().heightPixels;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(i);
            sb6.append('x');
            sb6.append(i2);
            map.put("res", sb6.toString());
        } else {
            try {
                if (Build.VERSION.SDK_INT >= 30) {
                    WindowMetrics currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
                    Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "context.getSystemService…ava).currentWindowMetrics");
                    bVar = new j1m.b(currentWindowMetrics.getBounds().width(), currentWindowMetrics.getBounds().height());
                } else {
                    Object systemService = context.getSystemService("window");
                    WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
                    Display defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
                    if (defaultDisplay != null) {
                        displayMetrics = new DisplayMetrics();
                        defaultDisplay.getRealMetrics(displayMetrics);
                    } else {
                        displayMetrics = Resources.getSystem().getDisplayMetrics();
                    }
                    bVar = new j1m.b(displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                a(bVar);
            } catch (Throwable unused) {
                Intrinsics.checkNotNullExpressionValue("s", "TAG");
                j.b("s", "Failed to set default screen resolution.", new Object[0]);
            }
        }
        String strL = hVar.l();
        if (strL != null) {
            this.f318666a.put("uid", strL);
        }
        String strE = hVar.e();
        if (strE != null) {
            this.f318666a.put("tnuid", strE);
        }
        String strB = hVar.b();
        if (strB != null) {
            this.f318666a.put("duid", strB);
        }
        String strM = hVar.m();
        if (strM != null) {
            this.f318666a.put("ua", strM);
        }
        String strC = hVar.c();
        if (strC != null) {
            this.f318666a.put("ip", strC);
        }
        String strI = hVar.i();
        if (strI != null) {
            this.f318666a.put("tz", strI);
        }
        String strD = hVar.d();
        if (strD != null) {
            this.f318666a.put("lang", strD);
        }
        j1m.b bVarF = hVar.f();
        if (bVarF != null) {
            a(bVarF);
        }
        j1m.b bVarH = hVar.h();
        if (bVarH != null) {
            StringBuilder sb9 = new StringBuilder();
            sb9.append(bVarH.f170635a);
            sb9.append('x');
            sb9.append(bVarH.f170636b);
            this.f318666a.put("vp", sb9.toString());
        }
        Integer numA = hVar.a();
        if (numA != null) {
            this.f318666a.put("cd", Integer.valueOf(numA.intValue()).toString());
        }
        Intrinsics.checkNotNullExpressionValue("s", "TAG");
        j.e("s", "Subject created successfully.", new Object[0]);
    }

    public final void a(j1m.b bVar) {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(bVar.f170635a);
        sb6.append('x');
        sb6.append(bVar.f170636b);
        this.f318666a.put("res", sb6.toString());
    }
}
