package ymf;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f314977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f314978b;

    public e(File file, Image previewImage) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(previewImage, "previewImage");
        this.f314977a = file;
        this.f314978b = previewImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f314977a, eVar.f314977a) && Intrinsics.f(this.f314978b, eVar.f314978b);
    }

    public final int hashCode() {
        return this.f314978b.hashCode() + (this.f314977a.hashCode() * 31);
    }
}
