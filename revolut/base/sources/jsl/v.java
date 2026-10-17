package jsl;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class v implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f178243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f178244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f178245c;
    public final List d;

    public v(Data data, Data data2, Data chargeBreakdown, List list) {
        Intrinsics.checkNotNullParameter(chargeBreakdown, "chargeBreakdown");
        this.f178243a = data;
        this.f178244b = data2;
        this.f178245c = chargeBreakdown;
        this.d = list;
    }

    public static v a(v vVar, Data data, Data data2, Data chargeBreakdown, List list, int i) {
        if ((i & 1) != 0) {
            data = vVar.f178243a;
        }
        if ((i & 2) != 0) {
            data2 = vVar.f178244b;
        }
        if ((i & 4) != 0) {
            chargeBreakdown = vVar.f178245c;
        }
        if ((i & 8) != 0) {
            list = vVar.d;
        }
        vVar.getClass();
        Intrinsics.checkNotNullParameter(chargeBreakdown, "chargeBreakdown");
        return new v(data, data2, chargeBreakdown, list);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f178243a, vVar.f178243a) && Intrinsics.f(this.f178244b, vVar.f178244b) && Intrinsics.f(this.f178245c, vVar.f178245c) && Intrinsics.f(this.d, vVar.d);
    }

    public final int hashCode() {
        Data data = this.f178243a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f178244b;
        int iC = kii.e.c(this.f178245c, (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31, 31);
        List list = this.d;
        return iC + (list != null ? list.hashCode() : 0);
    }
}
