package rob;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f255953a;

    public f(Data accountData) {
        Intrinsics.checkNotNullParameter(accountData, "accountData");
        this.f255953a = accountData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f255953a, ((f) obj2).f255953a);
    }

    public final int hashCode() {
        return this.f255953a.hashCode();
    }
}
