package i47;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f158298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f158299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f158300c;

    public m(l headerState, k footerState, List items) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(footerState, "footerState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f158298a = headerState;
        this.f158299b = footerState;
        this.f158300c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f158300c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f158298a, mVar.f158298a) && Intrinsics.f(this.f158299b, mVar.f158299b) && Intrinsics.f(this.f158300c, mVar.f158300c);
    }

    public final int hashCode() {
        return this.f158300c.hashCode() + ((this.f158299b.hashCode() + (this.f158298a.hashCode() * 31)) * 31);
    }
}
