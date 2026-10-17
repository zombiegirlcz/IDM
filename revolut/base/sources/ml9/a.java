package ml9;

import cli.j;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f206649a;

    public a(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.f206649a = file;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f206649a, ((a) obj2).f206649a);
    }

    public final int hashCode() {
        return this.f206649a.hashCode();
    }
}
