package tch;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class q implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f269843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f269844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f269845c;
    public final Data d;

    public q() {
        this(null, null, null, null);
    }

    public static q a(q qVar, Data data, Data data2, List list, Data data3, int i) {
        if ((i & 1) != 0) {
            data = qVar.f269843a;
        }
        if ((i & 2) != 0) {
            data2 = qVar.f269844b;
        }
        if ((i & 4) != 0) {
            list = qVar.f269845c;
        }
        if ((i & 8) != 0) {
            data3 = qVar.d;
        }
        qVar.getClass();
        return new q(data, data2, data3, list);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f269843a, qVar.f269843a) && Intrinsics.f(this.f269844b, qVar.f269844b) && Intrinsics.f(this.f269845c, qVar.f269845c) && Intrinsics.f(this.d, qVar.d);
    }

    public final int hashCode() {
        Data data = this.f269843a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f269844b;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        List list = this.f269845c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Data data3 = this.d;
        return iHashCode3 + (data3 != null ? data3.hashCode() : 0);
    }

    public q(Data data, Data data2, Data data3, List list) {
        this.f269843a = data;
        this.f269844b = data2;
        this.f269845c = list;
        this.d = data3;
    }
}
