package cuj;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f109039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0j.b0 f109040b;

    public i() {
        this(0);
    }

    public static i a(i iVar, Data collection, d0j.b0 b0Var, int i) {
        if ((i & 1) != 0) {
            collection = iVar.f109039a;
        }
        if ((i & 2) != 0) {
            b0Var = iVar.f109040b;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(collection, "collection");
        return new i(collection, b0Var);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f109039a, iVar.f109039a) && this.f109040b == iVar.f109040b;
    }

    public final int hashCode() {
        int iHashCode = this.f109039a.hashCode() * 31;
        d0j.b0 b0Var = this.f109040b;
        return iHashCode + (b0Var == null ? 0 : b0Var.hashCode());
    }

    public i(Data collection, d0j.b0 b0Var) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        this.f109039a = collection;
        this.f109040b = b0Var;
    }

    public /* synthetic */ i(int i) {
        this(new Data(null, null, true, 3, null), null);
    }
}
