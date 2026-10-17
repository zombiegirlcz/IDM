package ff4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements cli.j {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ax4.b f134719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f134720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f134721c;
    public final Long d;
    public final fu3.a e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f134722g;

    public i(ax4.b constructorState, boolean z, Long l2, Long l3, fu3.a aVar, Data offerContent, boolean z3) {
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        Intrinsics.checkNotNullParameter(offerContent, "offerContent");
        this.f134719a = constructorState;
        this.f134720b = z;
        this.f134721c = l2;
        this.d = l3;
        this.e = aVar;
        this.f = offerContent;
        this.f134722g = z3;
    }

    public static i a(i iVar, ax4.b bVar, Long l2, Long l3, fu3.a aVar, Data data, int i) {
        if ((i & 1) != 0) {
            bVar = iVar.f134719a;
        }
        ax4.b constructorState = bVar;
        iVar.getClass();
        boolean z = (i & 4) != 0 ? iVar.f134720b : true;
        if ((i & 8) != 0) {
            l2 = iVar.f134721c;
        }
        Long l4 = l2;
        if ((i & 16) != 0) {
            l3 = iVar.d;
        }
        Long l5 = l3;
        if ((i & 32) != 0) {
            aVar = iVar.e;
        }
        fu3.a aVar2 = aVar;
        if ((i & 64) != 0) {
            data = iVar.f;
        }
        Data offerContent = data;
        boolean z3 = (i & 128) != 0 ? iVar.f134722g : true;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        Intrinsics.checkNotNullParameter(offerContent, "offerContent");
        return new i(constructorState, z, l4, l5, aVar2, offerContent, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f134719a, iVar.f134719a) && this.f134720b == iVar.f134720b && Intrinsics.f(this.f134721c, iVar.f134721c) && Intrinsics.f(this.d, iVar.d) && this.e == iVar.e && Intrinsics.f(this.f, iVar.f) && this.f134722g == iVar.f134722g;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(this.f134719a.hashCode() * 31, 31, false), 31, this.f134720b);
        Long l2 = this.f134721c;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.d;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        fu3.a aVar = this.e;
        return Boolean.hashCode(this.f134722g) + kii.e.c(this.f, (iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31, 31);
    }
}
