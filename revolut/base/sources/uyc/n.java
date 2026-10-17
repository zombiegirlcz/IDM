package uyc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f284144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f284145b;

    public n(List documents, String actionToDoId) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(actionToDoId, "actionToDoId");
        this.f284144a = documents;
        this.f284145b = actionToDoId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f284144a, nVar.f284144a) && Intrinsics.f(this.f284145b, nVar.f284145b);
    }

    public final int hashCode() {
        return this.f284145b.hashCode() + (this.f284144a.hashCode() * 31);
    }
}
