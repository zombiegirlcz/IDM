package po;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Regex f237842a;

    public e(Regex pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        this.f237842a = pattern;
    }

    @Override // po.a
    public final Regex a() {
        return this.f237842a;
    }

    @Override // po.a
    public final String b() {
        return "<id>";
    }
}
