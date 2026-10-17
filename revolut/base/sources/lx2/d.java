package lx2;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c90.c f200519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f200520b;

    public d(c90.c uiResources) {
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.f200519a = uiResources;
        this.f200520b = j.b(new ljd.e(this, 20));
    }

    public final String a() {
        int i = c.f200518a[((c90.b) this.f200520b.getValue()).ordinal()];
        return i != 1 ? (i == 2 || i == 3) ? "@2x" : "@3x" : "@1x";
    }
}
