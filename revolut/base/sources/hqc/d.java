package hqc;

import hl7.ma;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f154660c = {j.c(k.PUBLICATION, new ma(16)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f154661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154662b;

    public /* synthetic */ d(int i, b bVar, String str) {
        if (3 != (i & 3)) {
            j1.f(a.f154659a.getDescriptor(), i, 3);
            throw null;
        }
        this.f154661a = bVar;
        this.f154662b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f154661a == dVar.f154661a && Intrinsics.f(this.f154662b, dVar.f154662b);
    }

    public final int hashCode() {
        return this.f154662b.hashCode() + (this.f154661a.hashCode() * 31);
    }

    public d(b accountType, String accountValue) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountValue, "accountValue");
        this.f154661a = accountType;
        this.f154662b = accountValue;
    }
}
