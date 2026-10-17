package vge;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f288886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f288887b;

    public e(Data data, b bVar) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f288886a = data;
        this.f288887b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f288886a, eVar.f288886a) && Intrinsics.f(this.f288887b, eVar.f288887b);
    }

    public final int hashCode() {
        int iHashCode = this.f288886a.hashCode() * 31;
        b bVar = this.f288887b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
