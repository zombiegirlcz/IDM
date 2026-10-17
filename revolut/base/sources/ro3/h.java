package ro3;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f255844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f255845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f255846c;

    public /* synthetic */ h(String str, int i, Long l2, Long l3) {
        if (7 != (i & 7)) {
            j1.f(f.f255843a.getDescriptor(), i, 7);
            throw null;
        }
        this.f255844a = str;
        this.f255845b = l2;
        this.f255846c = l3;
    }

    public final Long a() {
        return this.f255845b;
    }

    public final Long b() {
        return this.f255846c;
    }

    public final String c() {
        return this.f255844a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f255844a, hVar.f255844a) && Intrinsics.f(this.f255845b, hVar.f255845b) && Intrinsics.f(this.f255846c, hVar.f255846c);
    }

    public final int hashCode() {
        int iHashCode = this.f255844a.hashCode() * 31;
        Long l2 = this.f255845b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f255846c;
        return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
    }
}
