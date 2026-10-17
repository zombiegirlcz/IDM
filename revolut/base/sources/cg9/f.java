package cg9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f23871b;

    public f(Data billData, String billId) {
        Intrinsics.checkNotNullParameter(billId, "billId");
        Intrinsics.checkNotNullParameter(billData, "billData");
        this.f23870a = billId;
        this.f23871b = billData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f23870a, fVar.f23870a) && Intrinsics.f(this.f23871b, fVar.f23871b);
    }

    public final int hashCode() {
        return this.f23871b.hashCode() + (this.f23870a.hashCode() * 31);
    }
}
