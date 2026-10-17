package ix0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class p0 {

    @NotNull
    public static final o0 Companion = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f169279a;

    public p0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f169279a = context;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final int a() {
        return (((Boolean) jo0.g.u.getValue()).booleanValue() && c8g.c.J(this.f169279a) >= 390.0f) ? 6 : 5;
    }
}
