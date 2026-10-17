package sq8;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f265022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f265023c;

    public /* synthetic */ c(int i, String str, boolean z, String str2) {
        if (7 != (i & 7)) {
            j1.f(a.f265020a.getDescriptor(), i, 7);
            throw null;
        }
        this.f265021a = str;
        this.f265022b = str2;
        this.f265023c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f265021a, cVar.f265021a) && Intrinsics.f(this.f265022b, cVar.f265022b) && this.f265023c == cVar.f265023c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f265023c) + p.a.c(this.f265021a.hashCode() * 31, 31, this.f265022b);
    }

    public c(String juniorId, String counterpartyId, boolean z) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(counterpartyId, "counterpartyId");
        this.f265021a = juniorId;
        this.f265022b = counterpartyId;
        this.f265023c = z;
    }
}
