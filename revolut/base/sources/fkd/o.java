package fkd;

import com.revolut.feature.slot_manager.api.model.SlotIconAsset;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();
    public static final Lazy[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f135780c;
    public final p d;
    public final List e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SlotIconAsset f135781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SlotIconAsset f135782h;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        i = new Lazy[]{null, null, null, null, yhm.j.c(kVar, new fk8.a(6)), null, yhm.j.c(kVar, new fk8.a(7)), yhm.j.c(kVar, new fk8.a(8))};
    }

    public /* synthetic */ o(int i2, String str, String str2, boolean z, p pVar, List list, String str3, SlotIconAsset slotIconAsset, SlotIconAsset slotIconAsset2) {
        if (55 != (i2 & 55)) {
            j1.f(m.f135774a.getDescriptor(), i2, 55);
            throw null;
        }
        this.f135778a = str;
        this.f135779b = str2;
        this.f135780c = z;
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = pVar;
        }
        this.e = list;
        this.f = str3;
        if ((i2 & 64) == 0) {
            this.f135781g = null;
        } else {
            this.f135781g = slotIconAsset;
        }
        if ((i2 & 128) == 0) {
            this.f135782h = null;
        } else {
            this.f135782h = slotIconAsset2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f135778a, oVar.f135778a) && Intrinsics.f(this.f135779b, oVar.f135779b) && this.f135780c == oVar.f135780c && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f) && Intrinsics.f(this.f135781g, oVar.f135781g) && Intrinsics.f(this.f135782h, oVar.f135782h);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(this.f135778a.hashCode() * 31, 31, this.f135779b), 31, this.f135780c);
        p pVar = this.d;
        int iC2 = p.a.c(p.a.d((iC + (pVar == null ? 0 : pVar.hashCode())) * 31, 31, this.e), 31, this.f);
        SlotIconAsset slotIconAsset = this.f135781g;
        int iHashCode = (iC2 + (slotIconAsset == null ? 0 : slotIconAsset.hashCode())) * 31;
        SlotIconAsset slotIconAsset2 = this.f135782h;
        return iHashCode + (slotIconAsset2 != null ? slotIconAsset2.hashCode() : 0);
    }
}
