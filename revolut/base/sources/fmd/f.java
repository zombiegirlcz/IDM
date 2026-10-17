package fmd;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes7.dex */
@g
public final class f implements qf1.d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f136373c = {null, j.c(k.PUBLICATION, new fk8.a(25))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f136375b;

    public /* synthetic */ f(int i, String str, e eVar) {
        if (3 != (i & 3)) {
            j1.f(a.f136370a.getDescriptor(), i, 3);
            throw null;
        }
        this.f136374a = str;
        this.f136375b = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f136374a, fVar.f136374a) && Intrinsics.f(this.f136375b, fVar.f136375b);
    }

    public final int hashCode() {
        return this.f136375b.hashCode() + (this.f136374a.hashCode() * 31);
    }

    public f(String itemId, d destination) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f136374a = itemId;
        this.f136375b = destination;
    }
}
