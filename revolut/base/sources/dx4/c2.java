package dx4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c2 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f120562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120564c;

    public c2(c1 c1Var, String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f120562a = c1Var;
        this.f120563b = title;
        this.f120564c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj2;
        return Intrinsics.f(this.f120562a, c2Var.f120562a) && Intrinsics.f(this.f120563b, c2Var.f120563b) && Intrinsics.f(this.f120564c, c2Var.f120564c);
    }

    public final int hashCode() {
        c1 c1Var = this.f120562a;
        int iC = p.a.c((c1Var == null ? 0 : c1Var.hashCode()) * 31, 31, this.f120563b);
        String str = this.f120564c;
        return iC + (str != null ? str.hashCode() : 0);
    }
}
