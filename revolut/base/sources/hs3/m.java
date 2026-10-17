package hs3;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht3.l0 f154907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f154908b;

    public m(ht3.l0 content, HashMap actions) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f154907a = content;
        this.f154908b = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f154907a, mVar.f154907a) && Intrinsics.f(this.f154908b, mVar.f154908b);
    }

    public final int hashCode() {
        return this.f154908b.hashCode() + (this.f154907a.hashCode() * 31);
    }
}
