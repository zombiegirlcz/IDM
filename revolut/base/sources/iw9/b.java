package iw9;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f168999a;

    public b(ArrayList usernameList) {
        Intrinsics.checkNotNullParameter(usernameList, "usernameList");
        this.f168999a = usernameList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f168999a.equals(((b) obj2).f168999a);
    }

    public final int hashCode() {
        return this.f168999a.hashCode();
    }
}
