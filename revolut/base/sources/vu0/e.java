package vu0;

import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f292145c = R$id.internal_swipe_memory_tag;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f292146a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f292147b;

    public static final class a {
        private a() {
        }
    }

    public e() {
        Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        Intrinsics.checkNotNullExpressionValue(setNewSetFromMap, "newSetFromMap(...)");
        this.f292147b = setNewSetFromMap;
    }

    public final void a(SwipeToActionLayout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        for (SwipeToActionLayout swipeToActionLayout : this.f292147b) {
            if (!Intrinsics.f(swipeToActionLayout, layout)) {
                swipeToActionLayout.a(true);
            }
        }
    }
}
