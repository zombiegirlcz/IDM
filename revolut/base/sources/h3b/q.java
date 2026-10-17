package h3b;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f149092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.i f149093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f149094c;

    public q(p header, aw0.i footer, ArrayList items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f149092a = header;
        this.f149093b = footer;
        this.f149094c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f149094c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f149092a, qVar.f149092a) && Intrinsics.f(this.f149093b, qVar.f149093b) && this.f149094c.equals(qVar.f149094c);
    }

    public final int hashCode() {
        return this.f149094c.hashCode() + ((this.f149093b.hashCode() + (this.f149092a.hashCode() * 31)) * 31);
    }
}
