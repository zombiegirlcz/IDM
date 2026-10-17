package po;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Regex f237841a;

    public c(Regex pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        this.f237841a = pattern;
    }

    @Override // po.a
    public final Regex a() {
        return this.f237841a;
    }

    @Override // po.a
    public final String b() {
        return "";
    }
}
