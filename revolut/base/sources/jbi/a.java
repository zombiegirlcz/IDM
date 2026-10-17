package jbi;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f172636a;

    public a(List companies) {
        Intrinsics.checkNotNullParameter(companies, "companies");
        this.f172636a = companies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f172636a, ((a) obj2).f172636a);
    }

    public final int hashCode() {
        return this.f172636a.hashCode();
    }
}
