package yl7;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f314663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f314664b;

    public c(Clause title, Clause value) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f314663a = title;
        this.f314664b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f314663a.equals(cVar.f314663a) && this.f314664b.equals(cVar.f314664b);
    }

    public final int hashCode() {
        return this.f314664b.hashCode() + (this.f314663a.hashCode() * 31);
    }
}
