package t68;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@g
public final class c implements qf1.d {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] e = {null, j.c(k.PUBLICATION, new szl.a(20)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f268264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f268265c;
    public final Integer d;

    public /* synthetic */ c(int i, Integer num, Integer num2, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(a.f268262a.getDescriptor(), i, 3);
            throw null;
        }
        this.f268263a = str;
        this.f268264b = list;
        if ((i & 4) == 0) {
            this.f268265c = null;
        } else {
            this.f268265c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f268263a, cVar.f268263a) && Intrinsics.f(this.f268264b, cVar.f268264b) && Intrinsics.f(this.f268265c, cVar.f268265c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f268263a.hashCode() * 31, 31, this.f268264b);
        Integer num = this.f268265c;
        int iHashCode = (iD + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public c(String itemId, List profilesWithWalletId, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(profilesWithWalletId, "profilesWithWalletId");
        this.f268263a = itemId;
        this.f268264b = profilesWithWalletId;
        this.f268265c = num;
        this.d = num2;
    }
}
