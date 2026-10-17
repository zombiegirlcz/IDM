package tfe;

import aii.e;
import com.revolut.feature.tab.accounts.api.remove_account.RemoveAccountContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoveAccountContract$InputData f270301a;

    public a(RemoveAccountContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f270301a = inputData;
    }

    public final RemoveAccountContract$InputData b() {
        return this.f270301a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f270301a, ((a) obj2).f270301a);
    }

    public final int hashCode() {
        return this.f270301a.hashCode();
    }
}
