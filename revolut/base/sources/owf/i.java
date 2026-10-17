package owf;

import cli.p;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f230444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f230445b;

    public i(List items, File file) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f230444a = items;
        this.f230445b = file;
    }

    @Override // cli.p
    public final List c() {
        return this.f230444a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f230444a, iVar.f230444a) && Intrinsics.f(this.f230445b, iVar.f230445b);
    }

    public final int hashCode() {
        int iHashCode = this.f230444a.hashCode() * 31;
        File file = this.f230445b;
        return iHashCode + (file == null ? 0 : file.hashCode());
    }
}
