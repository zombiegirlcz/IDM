package g7a;

import aii.e;
import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f141139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f141140b;

    public a() {
        this(3, (d) null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f141139a, aVar.f141139a) && this.f141140b == aVar.f141140b;
    }

    public final int hashCode() {
        d dVar = this.f141139a;
        return Boolean.hashCode(this.f141140b) + ((dVar == null ? 0 : dVar.hashCode()) * 31);
    }

    public /* synthetic */ a(int i, d dVar) {
        this((i & 1) != 0 ? null : dVar, false);
    }

    public a(d dVar, boolean z) {
        this.f141139a = dVar;
        this.f141140b = z;
    }
}
