package klj;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f185643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f185644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f185645c;

    public m(ArrayList items, j navBarConfig, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        this.f185643a = items;
        this.f185644b = navBarConfig;
        this.f185645c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f185643a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f185643a.equals(mVar.f185643a) && this.f185644b.equals(mVar.f185644b) && this.f185645c == mVar.f185645c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f185645c) + ((this.f185644b.hashCode() + (this.f185643a.hashCode() * 31)) * 31);
    }
}
