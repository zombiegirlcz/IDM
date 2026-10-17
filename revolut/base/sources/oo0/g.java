package oo0;

import android.net.Uri;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f226977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f226978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f226979c;
    public final Uri d;

    public g(File file, m waveform, long j2) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(waveform, "waveform");
        this.f226977a = file;
        this.f226978b = waveform;
        this.f226979c = j2;
        Uri uriFromFile = Uri.fromFile(file);
        Intrinsics.checkNotNullExpressionValue(uriFromFile, "fromFile(...)");
        this.d = uriFromFile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f226977a, gVar.f226977a) && Intrinsics.f(this.f226978b, gVar.f226978b) && this.f226979c == gVar.f226979c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f226979c) + ((this.f226978b.hashCode() + (this.f226977a.hashCode() * 31)) * 31);
    }
}
