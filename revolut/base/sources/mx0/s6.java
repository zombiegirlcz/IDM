package mx0;

import com.revolut.core.ui_kit.internal.drawables.FloatingBottomBarDrawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class s6 implements u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FloatingBottomBarDrawable f209993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FloatingBottomBarDrawable f209994b;

    public s6(FloatingBottomBarDrawable sharedBackground, FloatingBottomBarDrawable collapsedSelectionForeground) {
        Intrinsics.checkNotNullParameter(sharedBackground, "sharedBackground");
        Intrinsics.checkNotNullParameter(collapsedSelectionForeground, "collapsedSelectionForeground");
        this.f209993a = sharedBackground;
        this.f209994b = collapsedSelectionForeground;
    }
}
