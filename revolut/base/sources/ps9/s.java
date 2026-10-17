package ps9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f239443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f239444b;

    public s(List items, q header) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f239443a = items;
        this.f239444b = header;
    }

    @Override // cli.p
    public final List c() {
        return this.f239443a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f239443a, sVar.f239443a) && Intrinsics.f(this.f239444b, sVar.f239444b);
    }

    public final int hashCode() {
        return this.f239444b.hashCode() + (this.f239443a.hashCode() * 31);
    }
}
