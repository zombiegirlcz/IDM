package fkd;

import com.revolut.feature.slot_manager.api.model.SlotIconAsset;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.ISO7816;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class c0 {

    @NotNull
    public static final b0 Companion = new b0();
    public static final Lazy[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f135752c;
    public final d0 d;
    public final String e;
    public final SlotIconAsset f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SlotIconAsset f135753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f135754h;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        i = new Lazy[]{null, null, null, null, null, yhm.j.c(kVar, new fk8.a(10)), yhm.j.c(kVar, new fk8.a(11)), null};
    }

    public /* synthetic */ c0(int i2, String str, String str2, boolean z, d0 d0Var, String str3, SlotIconAsset slotIconAsset, SlotIconAsset slotIconAsset2, String str4) {
        if (151 != (i2 & ISO7816.TAG_SM_EXPECTED_LENGTH)) {
            j1.f(a0.f135748a.getDescriptor(), i2, ISO7816.TAG_SM_EXPECTED_LENGTH);
            throw null;
        }
        this.f135750a = str;
        this.f135751b = str2;
        this.f135752c = z;
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = d0Var;
        }
        this.e = str3;
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = slotIconAsset;
        }
        if ((i2 & 64) == 0) {
            this.f135753g = null;
        } else {
            this.f135753g = slotIconAsset2;
        }
        this.f135754h = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f135750a, c0Var.f135750a) && Intrinsics.f(this.f135751b, c0Var.f135751b) && this.f135752c == c0Var.f135752c && Intrinsics.f(this.d, c0Var.d) && Intrinsics.f(this.e, c0Var.e) && Intrinsics.f(this.f, c0Var.f) && Intrinsics.f(this.f135753g, c0Var.f135753g) && Intrinsics.f(this.f135754h, c0Var.f135754h);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(this.f135750a.hashCode() * 31, 31, this.f135751b), 31, this.f135752c);
        d0 d0Var = this.d;
        int iC2 = p.a.c((iC + (d0Var == null ? 0 : d0Var.hashCode())) * 31, 31, this.e);
        SlotIconAsset slotIconAsset = this.f;
        int iHashCode = (iC2 + (slotIconAsset == null ? 0 : slotIconAsset.hashCode())) * 31;
        SlotIconAsset slotIconAsset2 = this.f135753g;
        return this.f135754h.hashCode() + ((iHashCode + (slotIconAsset2 != null ? slotIconAsset2.hashCode() : 0)) * 31);
    }
}
