package mle;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import xzg.q0;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f206682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f206683b;

    public l(Data accountSettings, q0 holderType) {
        Intrinsics.checkNotNullParameter(accountSettings, "accountSettings");
        Intrinsics.checkNotNullParameter(holderType, "holderType");
        this.f206682a = accountSettings;
        this.f206683b = holderType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f206682a, lVar.f206682a) && this.f206683b == lVar.f206683b;
    }

    public final int hashCode() {
        return this.f206683b.hashCode() + (this.f206682a.hashCode() * 31);
    }
}
