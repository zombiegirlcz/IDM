package zqf;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f324476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hpf.a f324477b;

    public d(Data transaction, hpf.a type) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f324476a = transaction;
        this.f324477b = type;
    }

    public static d a(d dVar, Data transaction) {
        hpf.a type = dVar.f324477b;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(type, "type");
        return new d(transaction, type);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f324476a, dVar.f324476a) && this.f324477b == dVar.f324477b;
    }

    public final int hashCode() {
        return this.f324477b.hashCode() + (this.f324476a.hashCode() * 31);
    }
}
