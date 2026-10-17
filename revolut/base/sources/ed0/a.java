package ed0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124906b;

    public a(String viewId, String itemId) {
        Intrinsics.checkNotNullParameter(viewId, "viewId");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.f124905a = viewId;
        this.f124906b = itemId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f124905a, aVar.f124905a) && Intrinsics.f(this.f124906b, aVar.f124906b);
    }

    public final int hashCode() {
        return this.f124906b.hashCode() + (this.f124905a.hashCode() * 31);
    }
}
