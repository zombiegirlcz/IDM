package cpb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f107915b;

    public e(Data savingsAccount, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(savingsAccount, "savingsAccount");
        this.f107914a = name;
        this.f107915b = savingsAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f107914a, eVar.f107914a) && Intrinsics.f(this.f107915b, eVar.f107915b);
    }

    public final int hashCode() {
        return this.f107915b.hashCode() + (this.f107914a.hashCode() * 31);
    }
}
