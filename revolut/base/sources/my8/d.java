package my8;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f210375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f210376b;

    public d(File file, h metadata) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f210375a = file;
        this.f210376b = metadata;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f210375a, dVar.f210375a) && Intrinsics.f(this.f210376b, dVar.f210376b);
    }

    public final int hashCode() {
        return this.f210376b.hashCode() + (this.f210375a.hashCode() * 31);
    }
}
