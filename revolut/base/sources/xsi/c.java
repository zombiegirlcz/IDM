package xsi;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f308526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f308527b;

    public c(Data state, boolean z) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f308526a = state;
        this.f308527b = z;
    }

    public static c a(c cVar, Data state) {
        boolean z = cVar.f308527b;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        return new c(state, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f308526a, cVar.f308526a) && this.f308527b == cVar.f308527b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f308527b) + (this.f308526a.hashCode() * 31);
    }
}
