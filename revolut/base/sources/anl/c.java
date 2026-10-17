package anl;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f7808a;

    public c(Data accountsSessions) {
        Intrinsics.checkNotNullParameter(accountsSessions, "accountsSessions");
        this.f7808a = accountsSessions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f7808a, ((c) obj2).f7808a);
    }

    public final int hashCode() {
        return this.f7808a.hashCode();
    }
}
