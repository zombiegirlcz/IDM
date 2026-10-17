package qvi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f249706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Exception f249707b;

    public a(Exception exc2, boolean z) {
        this.f249706a = z;
        this.f249707b = exc2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f249706a == aVar.f249706a && Intrinsics.f(this.f249707b, aVar.f249707b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f249706a) * 31;
        Exception exc2 = this.f249707b;
        return iHashCode + (exc2 == null ? 0 : exc2.hashCode());
    }

    public /* synthetic */ a() {
        this(null, false);
    }
}
