package eyc;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f130662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f130663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f130664c;

    public n(Data data, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f130662a = z;
        this.f130663b = data;
        this.f130664c = z3;
    }

    public static n a(n nVar, Data data, int i) {
        boolean z = nVar.f130662a;
        if ((i & 2) != 0) {
            data = nVar.f130663b;
        }
        boolean z3 = (i & 4) != 0 ? nVar.f130664c : true;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        return new n(data, z, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f130662a == nVar.f130662a && Intrinsics.f(this.f130663b, nVar.f130663b) && this.f130664c == nVar.f130664c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f130664c) + kii.e.c(this.f130663b, Boolean.hashCode(this.f130662a) * 31, 31);
    }
}
