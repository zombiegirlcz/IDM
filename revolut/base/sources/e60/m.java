package e60;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class m extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f122862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t80.l f122863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f122864c;

    public m(List files, t80.l source, String str) {
        Intrinsics.checkNotNullParameter(files, "files");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f122862a = files;
        this.f122863b = source;
        this.f122864c = str;
    }

    @Override // e60.l
    public final String a() {
        return this.f122864c;
    }

    public final File b() {
        return (File) d0.b0(this.f122862a);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f122862a, mVar.f122862a) && Intrinsics.f(this.f122863b, mVar.f122863b) && Intrinsics.f(this.f122864c, mVar.f122864c);
    }

    public final int hashCode() {
        int iHashCode = (this.f122863b.hashCode() + (this.f122862a.hashCode() * 31)) * 31;
        String str = this.f122864c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
