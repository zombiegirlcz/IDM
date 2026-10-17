package yx5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f317560a;

    public c(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f317560a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f317560a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f317560a, ((c) obj2).f317560a);
    }

    public final int hashCode() {
        return this.f317560a.hashCode();
    }
}
