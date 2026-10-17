package hl4;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f152978a;

    public c(ArrayList reasons) {
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        this.f152978a = reasons;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f152978a.equals(((c) obj2).f152978a);
    }

    public final int hashCode() {
        return this.f152978a.hashCode();
    }
}
