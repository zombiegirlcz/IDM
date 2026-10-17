package qoc;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final toc.a f248101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f248102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final alc.g f248103c;

    public c0(toc.a contributionType, dj0.d currentAmount, alc.g config) {
        Intrinsics.checkNotNullParameter(contributionType, "contributionType");
        Intrinsics.checkNotNullParameter(currentAmount, "currentAmount");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f248101a = contributionType;
        this.f248102b = currentAmount;
        this.f248103c = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return this.f248101a == c0Var.f248101a && Intrinsics.f(this.f248102b, c0Var.f248102b) && Intrinsics.f(this.f248103c, c0Var.f248103c);
    }

    public final int hashCode() {
        return this.f248103c.hashCode() + v7.c(this.f248101a.hashCode() * 31, 31, this.f248102b);
    }
}
