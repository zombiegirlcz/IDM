package rrj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ie3.a f256851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f256852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f256853c;

    public c(ie3.a transactionsContent, b toolbarData, a aVar) {
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter(toolbarData, "toolbarData");
        this.f256851a = transactionsContent;
        this.f256852b = toolbarData;
        this.f256853c = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f256851a, cVar.f256851a) && Intrinsics.f(this.f256852b, cVar.f256852b) && Intrinsics.f(this.f256853c, cVar.f256853c);
    }

    public final int hashCode() {
        int iHashCode = (this.f256852b.hashCode() + (this.f256851a.hashCode() * 31)) * 31;
        a aVar = this.f256853c;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
