package qq9;

import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okl.m;
import oq9.o;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f248514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f248515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f248516c;
    public final List d;
    public final List e;

    public f(String title, dj0.d amount, o owner, List splits, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(splits, "splits");
        this.f248514a = title;
        this.f248515b = amount;
        this.f248516c = owner;
        this.d = splits;
        this.e = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f248514a, fVar.f248514a) && Intrinsics.f(this.f248515b, fVar.f248515b) && Intrinsics.f(this.f248516c, fVar.f248516c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        int iD = p.a.d(m.d(this.f248516c, v7.c(this.f248514a.hashCode() * 31, 31, this.f248515b), 31), 31, this.d);
        List list = this.e;
        return iD + (list == null ? 0 : list.hashCode());
    }
}
