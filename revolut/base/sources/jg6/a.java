package jg6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173933c;
    public final String d;

    public a(String transactionId, String compoundId, String state, String topupMethod) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(compoundId, "compoundId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(topupMethod, "topupMethod");
        this.f173931a = transactionId;
        this.f173932b = compoundId;
        this.f173933c = state;
        this.d = topupMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f173931a, aVar.f173931a) && Intrinsics.f(this.f173932b, aVar.f173932b) && Intrinsics.f(this.f173933c, aVar.f173933c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f173931a.hashCode() * 31, 31, this.f173932b), 31, this.f173933c);
    }
}
