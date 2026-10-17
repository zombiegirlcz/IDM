package t27;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f267431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f267432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f267433c;
    public final float d;

    public i() {
        this(0);
    }

    public static i a(i iVar, Data taxPocket, n selectedTaxOption, String str, float f, int i) {
        if ((i & 1) != 0) {
            taxPocket = iVar.f267431a;
        }
        if ((i & 2) != 0) {
            selectedTaxOption = iVar.f267432b;
        }
        if ((i & 4) != 0) {
            str = iVar.f267433c;
        }
        if ((i & 8) != 0) {
            f = iVar.d;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(taxPocket, "taxPocket");
        Intrinsics.checkNotNullParameter(selectedTaxOption, "selectedTaxOption");
        return new i(taxPocket, selectedTaxOption, str, f);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f267431a, iVar.f267431a) && this.f267432b == iVar.f267432b && Intrinsics.f(this.f267433c, iVar.f267433c) && Float.compare(this.d, iVar.d) == 0;
    }

    public final int hashCode() {
        int iHashCode = (this.f267432b.hashCode() + (this.f267431a.hashCode() * 31)) * 31;
        String str = this.f267433c;
        return Float.hashCode(this.d) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public i(Data taxPocket, n selectedTaxOption, String str, float f) {
        Intrinsics.checkNotNullParameter(taxPocket, "taxPocket");
        Intrinsics.checkNotNullParameter(selectedTaxOption, "selectedTaxOption");
        this.f267431a = taxPocket;
        this.f267432b = selectedTaxOption;
        this.f267433c = str;
        this.d = f;
    }

    public /* synthetic */ i(int i) {
        this(new Data(null, null, true, 3, null), n.PRODUCT_TAX, null, BitmapDescriptorFactory.HUE_RED);
    }
}
