package n36;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f211885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f211886c;

    public /* synthetic */ g(int i, dj0.d dVar, dj0.d dVar2, String str) {
        if (7 != (i & 7)) {
            j1.f(e.f211883a.getDescriptor(), i, 7);
            throw null;
        }
        this.f211884a = str;
        this.f211885b = dVar;
        this.f211886c = dVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f211884a, gVar.f211884a) && Intrinsics.f(this.f211885b, gVar.f211885b) && Intrinsics.f(this.f211886c, gVar.f211886c);
    }

    public final int hashCode() {
        return this.f211886c.hashCode() + v7.c(this.f211884a.hashCode() * 31, 31, this.f211885b);
    }

    public g(dj0.d balance, dj0.d fiatValue, String pocketId) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(fiatValue, "fiatValue");
        this.f211884a = pocketId;
        this.f211885b = balance;
        this.f211886c = fiatValue;
    }
}
