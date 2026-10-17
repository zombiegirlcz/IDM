package oy;

import a41.g;
import android.app.Activity;
import android.os.Build;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;
import aw0.y9;
import kotlin.jvm.internal.Intrinsics;
import yji.d;

/* JADX INFO: loaded from: classes16.dex */
public final class a extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f230867c;
    public Integer d;
    public Integer e;
    public Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f230868g;

    public a(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f230867c = controller;
    }

    public final AppCompatActivity Q() {
        Activity activityM2 = this.f230867c.m2();
        Intrinsics.i(activityM2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        return (AppCompatActivity) activityM2;
    }

    public final void R(boolean z) {
        if (z) {
            AppCompatActivity appCompatActivityQ = Q();
            WindowCompat.setDecorFitsSystemWindows(appCompatActivityQ.getWindow(), false);
            Window window = appCompatActivityQ.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            int i = Build.VERSION.SDK_INT;
            window.setNavigationBarDividerColor(0);
            if (i >= 29) {
                window.setNavigationBarContrastEnforced(false);
            }
            y9 y9Var = y9.LIGHT;
            Window window2 = appCompatActivityQ.getWindow();
            Intrinsics.checkNotNullExpressionValue(window2, "getWindow(...)");
            y9Var.a(window2);
            return;
        }
        Window window3 = Q().getWindow();
        Intrinsics.checkNotNullExpressionValue(window3, "getWindow(...)");
        Integer num = this.d;
        Integer num2 = this.e;
        Integer num3 = this.f;
        Boolean bool = this.f230868g;
        if (num != null) {
            window3.setStatusBarColor(num.intValue());
        }
        if (num2 != null) {
            window3.setNavigationBarColor(num2.intValue());
        }
        int i2 = Build.VERSION.SDK_INT;
        if (num3 != null) {
            window3.setNavigationBarDividerColor(num3.intValue());
        }
        if (i2 >= 29 && bool != null) {
            g.n(window3, bool.booleanValue());
        }
        y9 y9Var2 = y9.THEME;
        Window window4 = Q().getWindow();
        Intrinsics.checkNotNullExpressionValue(window4, "getWindow(...)");
        y9Var2.a(window4);
    }

    @Override // yji.d
    public final void onCreate() {
        this.d = Integer.valueOf(Q().getWindow().getStatusBarColor());
        this.e = Integer.valueOf(Q().getWindow().getNavigationBarColor());
        if (Build.VERSION.SDK_INT >= 29) {
            this.f230868g = Boolean.valueOf(Q().getWindow().isNavigationBarContrastEnforced());
        }
        this.f = Integer.valueOf(Q().getWindow().getNavigationBarDividerColor());
    }
}
