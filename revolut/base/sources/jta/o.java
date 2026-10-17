package jta;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f178452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f178453b;

    public o(n state, ArrayList items) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f178452a = state;
        this.f178453b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f178453b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f178452a.equals(oVar.f178452a) && this.f178453b.equals(oVar.f178453b);
    }

    public final int hashCode() {
        return this.f178453b.hashCode() + (this.f178452a.hashCode() * 31);
    }
}
