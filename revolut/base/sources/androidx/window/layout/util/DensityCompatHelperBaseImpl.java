package androidx.window.layout.util;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/window/layout/util/DensityCompatHelperBaseImpl;", "Landroidx/window/layout/util/DensityCompatHelper;", "<init>", "()V", "Landroid/content/Context;", "context", "", "density", "(Landroid/content/Context;)F", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DensityCompatHelperBaseImpl implements DensityCompatHelper {

    @NotNull
    public static final DensityCompatHelperBaseImpl INSTANCE = new DensityCompatHelperBaseImpl();

    private DensityCompatHelperBaseImpl() {
    }

    @Override // androidx.window.layout.util.DensityCompatHelper
    public float density(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getDisplayMetrics().density;
    }
}
