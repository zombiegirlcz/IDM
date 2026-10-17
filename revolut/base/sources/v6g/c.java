package v6g;

import cli.j;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f286387a;

    public c() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f286387a, ((c) obj2).f286387a);
    }

    public final int hashCode() {
        return this.f286387a.hashCode();
    }

    public c(Set expandedSections) {
        Intrinsics.checkNotNullParameter(expandedSections, "expandedSections");
        this.f286387a = expandedSections;
    }

    public c(int i) {
        this(h0.f322473a);
    }
}
