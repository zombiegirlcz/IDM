package fz3;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f139082a;

    public b(ArrayList users) {
        Intrinsics.checkNotNullParameter(users, "users");
        this.f139082a = users;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f139082a.equals(((b) obj2).f139082a);
    }

    public final int hashCode() {
        return this.f139082a.hashCode();
    }
}
