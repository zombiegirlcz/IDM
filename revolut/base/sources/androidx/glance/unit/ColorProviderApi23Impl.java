package androidx.glance.unit;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0007¨\u0006\b"}, d2 = {"Landroidx/glance/unit/ColorProviderApi23Impl;", "", "()V", "getColor", "", "context", "Landroid/content/Context;", "resId", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ColorProviderApi23Impl {

    @NotNull
    public static final ColorProviderApi23Impl INSTANCE = new ColorProviderApi23Impl();

    private ColorProviderApi23Impl() {
    }

    public final int getColor(@NotNull Context context, int resId) {
        return context.getColor(resId);
    }
}
