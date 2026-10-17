package i42;

import cli.p;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f158270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f158271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f158272c;

    public e(List items, File file, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f158270a = items;
        this.f158271b = file;
        this.f158272c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f158270a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f158270a, eVar.f158270a) && Intrinsics.f(this.f158271b, eVar.f158271b) && this.f158272c == eVar.f158272c;
    }

    public final int hashCode() {
        int iHashCode = this.f158270a.hashCode() * 31;
        File file = this.f158271b;
        return Boolean.hashCode(this.f158272c) + ((iHashCode + (file == null ? 0 : file.hashCode())) * 31);
    }
}
