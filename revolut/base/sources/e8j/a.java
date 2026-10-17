package e8j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123738a;

    public a(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.f123738a = link;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f123738a, ((a) obj2).f123738a);
    }

    public final int hashCode() {
        return this.f123738a.hashCode();
    }
}
