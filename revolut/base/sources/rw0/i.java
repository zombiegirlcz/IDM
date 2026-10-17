package rw0;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f257806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f257807b;

    public i(Clause text, List image) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f257806a = text;
        this.f257807b = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f257806a, iVar.f257806a) && Intrinsics.f(this.f257807b, iVar.f257807b);
    }

    public final int hashCode() {
        return this.f257807b.hashCode() + (this.f257806a.hashCode() * 31);
    }
}
