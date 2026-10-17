package d3f;

import del.b;
import kotlin.jvm.internal.Intrinsics;
import wel.e;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f111099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f111100b;

    public a(e portfolio, b bVar) {
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        this.f111099a = portfolio;
        this.f111100b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f111099a, aVar.f111099a) && Intrinsics.f(this.f111100b, aVar.f111100b);
    }

    public final int hashCode() {
        int iHashCode = this.f111099a.hashCode() * 31;
        b bVar = this.f111100b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
