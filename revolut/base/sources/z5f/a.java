package z5f;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f319611a;

    public a(ArrayList sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f319611a = sections;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f319611a.equals(((a) obj2).f319611a);
    }

    public final int hashCode() {
        return this.f319611a.hashCode();
    }
}
