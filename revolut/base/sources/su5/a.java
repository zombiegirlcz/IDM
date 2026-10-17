package su5;

import kotlin.jvm.internal.Intrinsics;
import whf.p;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f265672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f265673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f265674c;

    public a(p transactionsContent, String searchQuery, boolean z) {
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f265672a = transactionsContent;
        this.f265673b = searchQuery;
        this.f265674c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f265672a, aVar.f265672a) && Intrinsics.f(this.f265673b, aVar.f265673b) && this.f265674c == aVar.f265674c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f265674c) + p.a.c(this.f265672a.hashCode() * 31, 31, this.f265673b);
    }
}
