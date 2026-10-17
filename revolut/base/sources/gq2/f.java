package gq2;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f145524b;

    public f(File file, String termsId) {
        Intrinsics.checkNotNullParameter(termsId, "termsId");
        Intrinsics.checkNotNullParameter(file, "file");
        this.f145523a = termsId;
        this.f145524b = file;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f145523a, fVar.f145523a) && Intrinsics.f(this.f145524b, fVar.f145524b);
    }

    public final int hashCode() {
        return this.f145524b.hashCode() + (this.f145523a.hashCode() * 31);
    }

    @Override // gq2.g
    public final String q0() {
        return this.f145523a;
    }
}
