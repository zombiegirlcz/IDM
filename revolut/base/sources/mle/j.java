package mle;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f206680a;

    public j(Data accountSettings) {
        Intrinsics.checkNotNullParameter(accountSettings, "accountSettings");
        this.f206680a = accountSettings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f206680a, ((j) obj2).f206680a);
    }

    public final int hashCode() {
        return this.f206680a.hashCode();
    }
}
