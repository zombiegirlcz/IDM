package ky4;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f90.b f190619a;

    public c(f90.b pluralFormatter) {
        Intrinsics.checkNotNullParameter(pluralFormatter, "pluralFormatter");
        this.f190619a = pluralFormatter;
    }

    public final String a(Number number) {
        Intrinsics.checkNotNullParameter(number, "number");
        return this.f190619a.a("{0,ordinal}", number);
    }
}
