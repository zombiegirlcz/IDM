package sxi;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f266504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f266505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f266506c;

    public i(Data lounge, Data loungeSaved, Data userHasExistingPass) {
        Intrinsics.checkNotNullParameter(lounge, "lounge");
        Intrinsics.checkNotNullParameter(loungeSaved, "loungeSaved");
        Intrinsics.checkNotNullParameter(userHasExistingPass, "userHasExistingPass");
        this.f266504a = lounge;
        this.f266505b = loungeSaved;
        this.f266506c = userHasExistingPass;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f266504a, iVar.f266504a) && Intrinsics.f(this.f266505b, iVar.f266505b) && Intrinsics.f(this.f266506c, iVar.f266506c);
    }

    public final int hashCode() {
        return this.f266506c.hashCode() + kii.e.c(this.f266505b, this.f266504a.hashCode() * 31, 31);
    }
}
