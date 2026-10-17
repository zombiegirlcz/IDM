package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ok0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sk0 f165676b;

    public ok0(String listId, sk0 selected) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f165675a = listId;
        this.f165676b = selected;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ok0)) {
            return false;
        }
        ok0 ok0Var = (ok0) obj2;
        return Intrinsics.f(this.f165675a, ok0Var.f165675a) && this.f165676b == ok0Var.f165676b;
    }

    public final int hashCode() {
        return this.f165676b.hashCode() + (this.f165675a.hashCode() * 31);
    }
}
