package lim;

import ch.qos.logback.core.CoreConstants;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f195560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f195561b;

    public b(List segments, File root) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.f195560a = root;
        this.f195561b = segments;
    }

    public final File a() {
        return this.f195560a;
    }

    public final List b() {
        return this.f195561b;
    }

    public final int c() {
        return this.f195561b.size();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f195560a, bVar.f195560a) && Intrinsics.f(this.f195561b, bVar.f195561b);
    }

    public final int hashCode() {
        return this.f195561b.hashCode() + (this.f195560a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("FilePathComponents(root=");
        sb6.append(this.f195560a);
        sb6.append(", segments=");
        return m72.b.p(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f195561b, sb6);
    }
}
