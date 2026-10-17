package mle;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f206681a;

    public k(Data accountSettings) {
        Intrinsics.checkNotNullParameter(accountSettings, "accountSettings");
        this.f206681a = accountSettings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f206681a, ((k) obj2).f206681a);
    }

    public final int hashCode() {
        return this.f206681a.hashCode();
    }
}
