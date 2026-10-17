package com.fourthline.orca.internal;

import android.view.View;
import android.view.Window;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class s71 implements r71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Window f32932a;

    public s71(Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        this.f32932a = window;
    }

    private final WindowInsetsControllerCompat c() {
        Window window = this.f32932a;
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
        Intrinsics.checkNotNullExpressionValue(insetsController, "getInsetsController(...)");
        return insetsController;
    }

    @Override // com.fourthline.orca.internal.r71
    public void a() {
        final View decorView = this.f32932a.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        c().setSystemBarsBehavior(1);
        c().show(WindowInsetsCompat.Type.systemBars());
        decorView.post(new Runnable() { // from class: com.fourthline.orca.internal.ds1
            @Override // java.lang.Runnable
            public final void run() {
                s71.a(decorView);
            }
        });
    }

    @Override // com.fourthline.orca.internal.r71
    public void b() {
        c().hide(WindowInsetsCompat.Type.systemBars());
        c().setSystemBarsBehavior(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(View view) {
        ViewCompat.requestApplyInsets(view);
    }
}
