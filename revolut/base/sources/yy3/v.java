package yy3;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class v implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f317802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f317803b;

    public v(long j2, ArrayList content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f317802a = content;
        this.f317803b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f317802a.equals(vVar.f317802a) && this.f317803b == vVar.f317803b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f317803b) + (this.f317802a.hashCode() * 31);
    }
}
