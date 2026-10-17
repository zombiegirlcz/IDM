package dda;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f113198b;

    public t(String title, ArrayList content) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f113197a = title;
        this.f113198b = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f113197a, tVar.f113197a) && this.f113198b.equals(tVar.f113198b);
    }

    public final int hashCode() {
        return this.f113198b.hashCode() + (this.f113197a.hashCode() * 31);
    }
}
