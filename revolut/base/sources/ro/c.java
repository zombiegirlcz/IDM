package ro;

import android.view.View;
import ho.i;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f255727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f255728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f255729c;
    public i d;

    public c(e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f255727a = dateProvider;
    }

    public static boolean a(View view, View view2) {
        if (view.equals(view2)) {
            return true;
        }
        while (view != null) {
            if (Intrinsics.f(view.getParent(), view2)) {
                return true;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return false;
    }
}
