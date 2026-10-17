package wr9;

import kotlin.jvm.internal.Intrinsics;
import oq9.o;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f299531a;

    public d(o member) {
        Intrinsics.checkNotNullParameter(member, "member");
        this.f299531a = member;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f299531a, ((d) obj2).f299531a);
    }

    public final int hashCode() {
        return this.f299531a.hashCode();
    }
}
