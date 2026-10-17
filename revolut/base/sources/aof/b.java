package aof;

import bof.i;
import do3.n;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f7981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f7982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f7983c;

    public b(a3 transaction, n user, i useCase) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        this.f7981a = transaction;
        this.f7982b = user;
        this.f7983c = useCase;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f7981a, bVar.f7981a) && Intrinsics.f(this.f7982b, bVar.f7982b) && this.f7983c == bVar.f7983c;
    }

    public final int hashCode() {
        return this.f7983c.hashCode() + ((this.f7982b.hashCode() + (this.f7981a.hashCode() * 31)) * 31);
    }
}
