package kli;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.Window;
import com.revolut.core.ui_kit.keyboard.api.R$id;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.s1;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f185630a = Collections.newSetFromMap(new WeakHashMap());

    public static final class a {
        private a() {
        }

        public static b a(View view) {
            b bVar;
            Activity activity;
            Window window;
            View decorView;
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
                Intrinsics.checkNotNullExpressionValue(context, "getBaseContext(...)");
            }
            if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                Object tag2 = decorView.getTag(R$id.tag_keyboard_display_guard);
                bVar = tag2 instanceof b ? (b) tag2 : null;
                if (bVar == null) {
                    b bVar2 = new b();
                    decorView.setTag(R$id.tag_keyboard_display_guard, bVar2);
                    return bVar2;
                }
            }
            return bVar;
        }
    }

    public final void a(s1 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f185630a.add(owner);
    }

    public final void b(s1 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f185630a.remove(owner);
    }
}
