package tva;

import dj0.d;
import kotlin.jvm.internal.Intrinsics;
import whf.p;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f274739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f274740b;

    public a(d totalPaid, p transactionsContent) {
        Intrinsics.checkNotNullParameter(totalPaid, "totalPaid");
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        this.f274739a = totalPaid;
        this.f274740b = transactionsContent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f274739a, aVar.f274739a) && Intrinsics.f(this.f274740b, aVar.f274740b);
    }

    public final int hashCode() {
        return this.f274740b.hashCode() + (this.f274739a.hashCode() * 31);
    }
}
