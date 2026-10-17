package tgb;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f271154b;

    public n(String text, ArrayList actions) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f271153a = text;
        this.f271154b = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f271153a, nVar.f271153a) && this.f271154b.equals(nVar.f271154b);
    }

    public final int hashCode() {
        return this.f271154b.hashCode() + (this.f271153a.hashCode() * 31);
    }
}
