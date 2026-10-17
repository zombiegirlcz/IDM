package j45;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f171295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x35.e f171296b;

    public e(Data groups, x35.e eVar) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.f171295a = groups;
        this.f171296b = eVar;
    }

    public static e a(e eVar, Data groups, x35.e eVar2, int i) {
        if ((i & 1) != 0) {
            groups = eVar.f171295a;
        }
        if ((i & 2) != 0) {
            eVar2 = eVar.f171296b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(groups, "groups");
        return new e(groups, eVar2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f171295a, eVar.f171295a) && Intrinsics.f(this.f171296b, eVar.f171296b);
    }

    public final int hashCode() {
        int iHashCode = this.f171295a.hashCode() * 31;
        x35.e eVar = this.f171296b;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }
}
