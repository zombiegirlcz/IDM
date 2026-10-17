package kl8;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185405a;

    public a(String juniorFirstName) {
        Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
        this.f185405a = juniorFirstName;
    }

    public final String b() {
        return this.f185405a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f185405a, ((a) obj2).f185405a);
    }

    public final int hashCode() {
        return this.f185405a.hashCode();
    }
}
