package wqd;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements j, oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f299437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f299438b;

    public c(List pagerItems, String str) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        this.f299437a = pagerItems;
        this.f299438b = str;
    }

    @Override // oki.a
    public final List W() {
        return this.f299437a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f299437a, cVar.f299437a) && Intrinsics.f(this.f299438b, cVar.f299438b);
    }

    public final int hashCode() {
        int iHashCode = this.f299437a.hashCode() * 31;
        String str = this.f299438b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // oki.a
    public final String z() {
        return this.f299438b;
    }
}
