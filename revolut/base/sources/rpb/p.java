package rpb;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import pcd.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f256333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f256334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f256335c;

    public p(String id10, dj0.d balanceInBaseCurrency, h0 state) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(balanceInBaseCurrency, "balanceInBaseCurrency");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f256333a = id10;
        this.f256334b = balanceInBaseCurrency;
        this.f256335c = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f256333a, pVar.f256333a) && Intrinsics.f(this.f256334b, pVar.f256334b) && this.f256335c == pVar.f256335c;
    }

    public final int hashCode() {
        return this.f256335c.hashCode() + v7.c(this.f256333a.hashCode() * 31, 31, this.f256334b);
    }
}
