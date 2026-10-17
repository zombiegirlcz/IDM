package oq9;

import ip0.v7;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f227830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f227831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f227832c;
    public final o d;
    public final dj0.d e;
    public final dj0.d f;

    public j(String id10, String billId, String groupId, o owner, dj0.d amount, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(billId, "billId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f227830a = id10;
        this.f227831b = billId;
        this.f227832c = groupId;
        this.d = owner;
        this.e = amount;
        this.f = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f227830a, jVar.f227830a) && Intrinsics.f(this.f227831b, jVar.f227831b) && Intrinsics.f(this.f227832c, jVar.f227832c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f);
    }

    public final int hashCode() {
        int iC = v7.c(okl.m.d(this.d, p.a.c(p.a.c(this.f227830a.hashCode() * 31, 31, this.f227831b), 31, this.f227832c), 31), 31, this.e);
        dj0.d dVar = this.f;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }
}
