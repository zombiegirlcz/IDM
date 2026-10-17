package lf8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f194663a;

    public a(d firstPartyMarketing) {
        Intrinsics.checkNotNullParameter(firstPartyMarketing, "firstPartyMarketing");
        this.f194663a = firstPartyMarketing;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f194663a, ((a) obj2).f194663a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f194663a.f194667a);
    }
}
