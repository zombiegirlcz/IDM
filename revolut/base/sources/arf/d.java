package arf;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f8693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hpf.a f8694b;

    public d(Data transaction, hpf.a type) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f8693a = transaction;
        this.f8694b = type;
    }

    public static d a(d dVar, Data transaction) {
        hpf.a type = dVar.f8694b;
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
        return Intrinsics.f(this.f8693a, dVar.f8693a) && this.f8694b == dVar.f8694b;
    }

    public final int hashCode() {
        return this.f8694b.hashCode() + (this.f8693a.hashCode() * 31);
    }
}
