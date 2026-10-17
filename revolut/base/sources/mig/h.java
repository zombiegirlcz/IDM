package mig;

import hfg.q;
import kotlin.jvm.internal.Intrinsics;
import mig.f;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f205846a;

    public h(q suggestionItem) {
        Intrinsics.checkNotNullParameter(suggestionItem, "suggestionItem");
        this.f205846a = suggestionItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f205846a, ((h) obj2).f205846a);
    }

    public final int hashCode() {
        return this.f205846a.hashCode();
    }
}
