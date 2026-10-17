package u09;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f276100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276101b;

    public b(String url2, ArrayList children) {
        Intrinsics.checkNotNullParameter(children, "children");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f276100a = children;
        this.f276101b = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f276100a.equals(bVar.f276100a) && Intrinsics.f(this.f276101b, bVar.f276101b);
    }

    public final int hashCode() {
        return this.f276101b.hashCode() + (this.f276100a.hashCode() * 31);
    }
}
