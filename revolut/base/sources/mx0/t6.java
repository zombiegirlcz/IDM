package mx0;

import android.graphics.drawable.ColorDrawable;
import com.revolut.core.ui_kit.internal.drawables.FloatingBottomBarDrawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class t6 implements u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FloatingBottomBarDrawable f210013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorDrawable f210014b;

    public t6(FloatingBottomBarDrawable contentBackground, ColorDrawable containerBackground) {
        Intrinsics.checkNotNullParameter(contentBackground, "contentBackground");
        Intrinsics.checkNotNullParameter(containerBackground, "containerBackground");
        this.f210013a = contentBackground;
        this.f210014b = containerBackground;
    }
}
