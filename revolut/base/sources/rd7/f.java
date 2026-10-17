package rd7;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f253364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f253365b;

    public f(String filePath, String str) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.f253364a = filePath;
        this.f253365b = str;
    }

    @Override // rd7.h
    public final String a() {
        return this.f253365b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f253364a, fVar.f253364a) && Intrinsics.f(this.f253365b, fVar.f253365b);
    }

    public final int hashCode() {
        int iHashCode = this.f253364a.hashCode() * 31;
        String str = this.f253365b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(File file, String str) {
        Intrinsics.checkNotNullParameter(file, "file");
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        this(absolutePath, str);
    }
}
