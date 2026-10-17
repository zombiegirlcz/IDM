package qq9;

import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okl.m;
import oq9.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f248504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f248505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f248506c;
    public final List d;
    public final List e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f248507g;

    public a(String title, dj0.d amount, o owner, List splits, ArrayList arrayList, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(splits, "splits");
        this.f248504a = title;
        this.f248505b = amount;
        this.f248506c = owner;
        this.d = splits;
        this.e = arrayList;
        this.f = str;
        this.f248507g = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f248504a, aVar.f248504a) && Intrinsics.f(this.f248505b, aVar.f248505b) && Intrinsics.f(this.f248506c, aVar.f248506c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f248507g, aVar.f248507g);
    }

    public final int hashCode() {
        int iD = p.a.d(m.d(this.f248506c, v7.c(this.f248504a.hashCode() * 31, 31, this.f248505b), 31), 31, this.d);
        List list = this.e;
        int iHashCode = (iD + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f248507g;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
