package qx8;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import tx8.y;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements cy8.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Regex f250031a;

    public b(Regex regex) {
        this.f250031a = regex;
    }

    @Override // cy8.a
    public final Object i(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        if (this.f250031a.a(url2)) {
            return url2;
        }
        return null;
    }

    @Override // cy8.a
    public final av1.c m() {
        return y.f275368c;
    }
}
