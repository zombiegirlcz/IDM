package ejl;

import aii.e;
import com.revolut.sso.api.passcode.change.ChangePasscodeInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChangePasscodeInputData f126914a;

    public c() {
        this(0);
    }

    public final ChangePasscodeInputData b() {
        return this.f126914a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f126914a, ((c) obj2).f126914a);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f126914a.f106014a);
    }

    public c(int i) {
        ChangePasscodeInputData inputData = new ChangePasscodeInputData(true);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f126914a = inputData;
    }
}
