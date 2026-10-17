package iu0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f168428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f168429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f168430c;
    public final StringBuilder d;
    public ald.o e;
    public ald.o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public yx0.d f168431g;

    public d(b dots, int i, boolean z) {
        Intrinsics.checkNotNullParameter(dots, "dots");
        this.f168428a = dots;
        this.f168429b = i;
        this.f168430c = z;
        this.d = new StringBuilder();
        dots.a();
    }

    public final String a() {
        String string = this.d.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final boolean b() {
        return this.d.length() == 0;
    }
}
