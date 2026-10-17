package gn0;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@g(with = e.class)
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144900a;

    public /* synthetic */ f(String str) {
        this.f144900a = str;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof f) {
            return Intrinsics.f(this.f144900a, ((f) obj2).f144900a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f144900a.hashCode();
    }

    public final String toString() {
        return p.a.p("FormattedFingerprint(value=", this.f144900a, ")");
    }
}
