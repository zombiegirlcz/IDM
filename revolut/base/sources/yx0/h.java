package yx0;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import aw0.s8;
import aw0.v1;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v1 f317529a = v1.DARK;

    private h() {
    }

    public static ColorDrawable a(Context context, NavBarWithContainerBackground wallpaper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(wallpaper, "wallpaper");
        return new ColorDrawable(kli.a.s(wallpaper.getD() != s8.DEFAULT ? R$attr.uikit_colorBlack_60 : R$attr.uikit_colorBlack_50, context));
    }
}
