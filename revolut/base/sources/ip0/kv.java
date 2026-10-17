package ip0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class kv implements mv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f165088a;

    public kv(ArrayList content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f165088a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof kv) && this.f165088a.equals(((kv) obj2).f165088a);
    }

    public final int hashCode() {
        return this.f165088a.hashCode();
    }
}
