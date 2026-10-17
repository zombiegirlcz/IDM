package n38;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class d implements qf1.d {

    @NotNull
    public static final c Companion = new c();
    public static final Lazy[] e = {null, yhm.j.c(yhm.k.PUBLICATION, new n08.b(24)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f211935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f211936c;
    public final int d;

    public /* synthetic */ d(int i, String str, p pVar, String str2, int i2) {
        if (15 != (i & 15)) {
            j1.f(b.f211930a.getDescriptor(), i, 15);
            throw null;
        }
        this.f211934a = str;
        this.f211935b = pVar;
        this.f211936c = str2;
        this.d = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f211934a, dVar.f211934a) && Intrinsics.f(this.f211935b, dVar.f211935b) && Intrinsics.f(this.f211936c, dVar.f211936c) && this.d == dVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + p.a.c((this.f211935b.hashCode() + (this.f211934a.hashCode() * 31)) * 31, 31, this.f211936c);
    }

    public d(p state, String userCountry, int i) {
        Intrinsics.checkNotNullParameter("joint_add_new_product_item", "itemId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(userCountry, "userCountry");
        this.f211934a = "joint_add_new_product_item";
        this.f211935b = state;
        this.f211936c = userCountry;
        this.d = i;
    }
}
