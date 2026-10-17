package jsl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class p implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f178229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f178230b;

    public p() {
        this(0);
    }

    public static p a(p pVar, t extensionState, List list, int i) {
        if ((i & 1) != 0) {
            extensionState = pVar.f178229a;
        }
        if ((i & 2) != 0) {
            list = pVar.f178230b;
        }
        pVar.getClass();
        Intrinsics.checkNotNullParameter(extensionState, "extensionState");
        return new p(extensionState, list);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f178229a, pVar.f178229a) && Intrinsics.f(this.f178230b, pVar.f178230b);
    }

    public final int hashCode() {
        int iHashCode = this.f178229a.hashCode() * 31;
        List list = this.f178230b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public p(t extensionState, List list) {
        Intrinsics.checkNotNullParameter(extensionState, "extensionState");
        this.f178229a = extensionState;
        this.f178230b = list;
    }

    public /* synthetic */ p(int i) {
        this(r.f178232a, null);
    }
}
