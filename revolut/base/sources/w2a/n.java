package w2a;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f293997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f293998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f293999c;

    public n(ArrayList categories, l gifsInfo, i browseMode) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(gifsInfo, "gifsInfo");
        Intrinsics.checkNotNullParameter(browseMode, "browseMode");
        this.f293997a = categories;
        this.f293998b = gifsInfo;
        this.f293999c = browseMode;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        n nVar = oldState instanceof n ? (n) oldState : null;
        if (nVar != null) {
            k kVar = nVar.f293998b.f293995b;
            k kVar2 = this.f293998b.f293995b;
            if (kVar != kVar2) {
                return new m(kVar2);
            }
        }
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f293997a.equals(nVar.f293997a) && Intrinsics.f(this.f293998b, nVar.f293998b) && Intrinsics.f(this.f293999c, nVar.f293999c);
    }

    public final int hashCode() {
        return this.f293999c.hashCode() + ((this.f293998b.hashCode() + (this.f293997a.hashCode() * 31)) * 31);
    }
}
