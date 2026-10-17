package kq8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f188342c;

    public /* synthetic */ e(int i, String str, boolean z, String str2) {
        if (7 != (i & 7)) {
            j1.f(c.f188339a.getDescriptor(), i, 7);
            throw null;
        }
        this.f188340a = str;
        this.f188341b = str2;
        this.f188342c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f188340a, eVar.f188340a) && Intrinsics.f(this.f188341b, eVar.f188341b) && this.f188342c == eVar.f188342c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f188342c) + p.a.c(this.f188340a.hashCode() * 31, 31, this.f188341b);
    }

    public e(String juniorId, String counterpartyId, boolean z) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(counterpartyId, "counterpartyId");
        this.f188340a = juniorId;
        this.f188341b = counterpartyId;
        this.f188342c = z;
    }
}
