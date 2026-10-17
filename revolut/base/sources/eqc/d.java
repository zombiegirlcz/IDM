package eqc;

import ekd.i0;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f128421c = {yhm.j.c(yhm.k.PUBLICATION, new i0(13)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f128422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f128423b;

    public /* synthetic */ d(int i, b bVar, String str) {
        if (3 != (i & 3)) {
            j1.f(a.f128420a.getDescriptor(), i, 3);
            throw null;
        }
        this.f128422a = bVar;
        this.f128423b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f128422a == dVar.f128422a && Intrinsics.f(this.f128423b, dVar.f128423b);
    }

    public final int hashCode() {
        return this.f128423b.hashCode() + (this.f128422a.hashCode() * 31);
    }

    public d(b accountType, String accountValue) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountValue, "accountValue");
        this.f128422a = accountType;
        this.f128423b = accountValue;
    }
}
