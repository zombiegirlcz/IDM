package v20;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f285576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f285577b;

    public u0(File file, String str) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.f285576a = file;
        this.f285577b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return Intrinsics.f(this.f285576a, u0Var.f285576a) && Intrinsics.f(this.f285577b, u0Var.f285577b);
    }

    public final int hashCode() {
        int iHashCode = this.f285576a.hashCode() * 31;
        String str = this.f285577b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
