package dze;

import android.content.ContextWrapper;
import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends ContextWrapper {
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        Resources resources = getApplicationContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return resources;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = getApplicationContext().getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        return theme;
    }
}
