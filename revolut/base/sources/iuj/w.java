package iuj;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class w implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f168648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f168649b;

    public w(ArrayList items, q headerState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        this.f168648a = items;
        this.f168649b = headerState;
    }

    @Override // cli.p
    public final List c() {
        return this.f168648a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f168648a.equals(wVar.f168648a) && Intrinsics.f(this.f168649b, wVar.f168649b);
    }

    public final int hashCode() {
        return this.f168649b.hashCode() + (this.f168648a.hashCode() * 31);
    }
}
