package h33;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149033b;

    public n(String listId, String text) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f149032a = listId;
        this.f149033b = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f149032a, nVar.f149032a) && Intrinsics.f(this.f149033b, nVar.f149033b);
    }

    public final int hashCode() {
        return this.f149033b.hashCode() + (this.f149032a.hashCode() * 31);
    }
}
