package zil;

import aii.e;
import com.revolut.sso.api.email.change.ChangeEmailInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChangeEmailInputData f322583a;

    public d() {
        this(0);
    }

    public final ChangeEmailInputData b() {
        return this.f322583a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f322583a, ((d) obj2).f322583a);
    }

    public final int hashCode() {
        return this.f322583a.hashCode();
    }

    public d(int i) {
        ChangeEmailInputData inputData = new ChangeEmailInputData(null, null, null, null, 63);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f322583a = inputData;
    }
}
