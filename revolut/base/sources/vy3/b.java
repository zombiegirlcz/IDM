package vy3;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f293128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f293129b;

    public b(String title, ArrayList loans) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(loans, "loans");
        this.f293128a = title;
        this.f293129b = loans;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f293128a, bVar.f293128a) && this.f293129b.equals(bVar.f293129b);
    }

    public final int hashCode() {
        return this.f293129b.hashCode() + (this.f293128a.hashCode() * 31);
    }
}
