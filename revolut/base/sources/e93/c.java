package e93;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f123825b;

    public c(String str, ArrayList options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f123824a = str;
        this.f123825b = options;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f123824a, cVar.f123824a) && this.f123825b.equals(cVar.f123825b);
    }

    public final int hashCode() {
        String str = this.f123824a;
        return this.f123825b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
