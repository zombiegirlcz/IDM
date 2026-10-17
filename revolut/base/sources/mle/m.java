package mle;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f206684a;

    public m(Data accountSettings) {
        Intrinsics.checkNotNullParameter(accountSettings, "accountSettings");
        this.f206684a = accountSettings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f206684a, ((m) obj2).f206684a);
    }

    public final int hashCode() {
        return this.f206684a.hashCode();
    }
}
