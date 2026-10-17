package qq9;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okl.m;
import oq9.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f248508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f248509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f248510c;
    public final List d;
    public final String e;
    public final String f;

    public b(String transactionId, o owner, List splits, ArrayList arrayList, String str, String str2) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(splits, "splits");
        this.f248508a = transactionId;
        this.f248509b = owner;
        this.f248510c = splits;
        this.d = arrayList;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f248508a, bVar.f248508a) && Intrinsics.f(this.f248509b, bVar.f248509b) && Intrinsics.f(this.f248510c, bVar.f248510c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        int iD = p.a.d(m.d(this.f248509b, this.f248508a.hashCode() * 31, 31), 31, this.f248510c);
        List list = this.d;
        int iHashCode = (iD + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
