package xya;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f309687a;

    public j(Data invitesList) {
        Intrinsics.checkNotNullParameter(invitesList, "invitesList");
        this.f309687a = invitesList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f309687a, ((j) obj2).f309687a);
    }

    public final int hashCode() {
        return this.f309687a.hashCode();
    }
}
