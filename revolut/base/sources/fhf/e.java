package fhf;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f135213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f5j.a f135214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f135215c;
    public final boolean d;

    public e(Data transactionsContent, f5j.a aVar, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        this.f135213a = transactionsContent;
        this.f135214b = aVar;
        this.f135215c = z;
        this.d = z3;
    }

    public static e a(e eVar, Data transactionsContent, f5j.a aVar, int i) {
        if ((i & 1) != 0) {
            transactionsContent = eVar.f135213a;
        }
        if ((i & 2) != 0) {
            aVar = eVar.f135214b;
        }
        boolean z = eVar.f135215c;
        boolean z3 = eVar.d;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        return new e(transactionsContent, aVar, z, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f135213a, eVar.f135213a) && Intrinsics.f(this.f135214b, eVar.f135214b) && this.f135215c == eVar.f135215c && this.d == eVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f135213a.hashCode() * 31;
        f5j.a aVar = this.f135214b;
        return Boolean.hashCode(this.d) + j6.a.c((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f135215c);
    }
}
