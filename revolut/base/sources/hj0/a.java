package hj0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152623b;

    public a(String title, String details) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(details, "details");
        this.f152622a = title;
        this.f152623b = details;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f152622a, aVar.f152622a) && Intrinsics.f(this.f152623b, aVar.f152623b);
    }

    public final int hashCode() {
        return this.f152623b.hashCode() + (this.f152622a.hashCode() * 31);
    }
}
