package kli;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import java.util.Set;
import kli.b;
import kotlin.jvm.internal.Intrinsics;
import rv0.j;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c {
    public static final j a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object systemService = view.getContext().getSystemService("revolut_service::keyboard");
        if (systemService instanceof j) {
            return (j) systemService;
        }
        return null;
    }

    public static final void b(View view, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.postDelayed(new com.google.android.material.internal.b(view, z, 1), j2);
    }

    public static final void c(View view, boolean z) {
        Window window;
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z) {
            view.clearFocus();
        }
        j jVarA = a(view);
        Context context = view.getContext();
        WindowInsetsControllerCompat insetsController = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (window = activity.getWindow()) != null) {
            insetsController = WindowCompat.getInsetsController(window, view);
        }
        if (jVarA != null) {
            ((sv0.c) jVarA).h(view);
        } else {
            if (insetsController != null) {
                insetsController.hide(WindowInsetsCompat.Type.ime());
                return;
            }
            Object systemService = view.getContext().getSystemService("input_method");
            Intrinsics.i(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static final void d(View view, long j2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.postDelayed(new bb6.b(view, 5), j2);
    }

    public static final void f(View view) {
        Window window;
        Intrinsics.checkNotNullParameter(view, "<this>");
        b.Companion.getClass();
        b bVarA = b.a.a(view);
        if (bVarA != null) {
            Set keyboardOwners = bVarA.f185630a;
            Intrinsics.checkNotNullExpressionValue(keyboardOwners, "keyboardOwners");
            if (!keyboardOwners.isEmpty()) {
                return;
            }
        }
        j jVarA = a(view);
        Context context = view.getContext();
        WindowInsetsControllerCompat insetsController = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (window = activity.getWindow()) != null) {
            insetsController = WindowCompat.getInsetsController(window, view);
        }
        if (jVarA != null) {
            ((sv0.c) jVarA).p(view);
        } else {
            if (insetsController != null) {
                insetsController.show(WindowInsetsCompat.Type.ime());
                return;
            }
            Object systemService = view.getContext().getSystemService("input_method");
            Intrinsics.i(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(view, 1);
        }
    }
}
