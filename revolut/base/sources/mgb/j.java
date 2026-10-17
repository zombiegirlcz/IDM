package mgb;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f205246b;

    public j(String text, ArrayList actions) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f205245a = text;
        this.f205246b = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f205245a, jVar.f205245a) && this.f205246b.equals(jVar.f205246b);
    }

    public final int hashCode() {
        return this.f205246b.hashCode() + (this.f205245a.hashCode() * 31);
    }
}
