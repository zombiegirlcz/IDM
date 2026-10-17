package eqh;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import uqh.z;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f128460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f128461b;

    public f(z extensionState, Data data) {
        Intrinsics.checkNotNullParameter(extensionState, "extensionState");
        this.f128460a = extensionState;
        this.f128461b = data;
    }

    public static f a(f fVar, z extensionState, Data data, int i) {
        if ((i & 1) != 0) {
            extensionState = fVar.f128460a;
        }
        if ((i & 2) != 0) {
            data = fVar.f128461b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(extensionState, "extensionState");
        return new f(extensionState, data);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f128460a, fVar.f128460a) && Intrinsics.f(this.f128461b, fVar.f128461b);
    }

    public final int hashCode() {
        int iHashCode = this.f128460a.hashCode() * 31;
        Data data = this.f128461b;
        return iHashCode + (data == null ? 0 : data.hashCode());
    }
}
