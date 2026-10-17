package e07;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f121440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f121441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f121442c;
    public final boolean d;
    public final boolean e;

    public e() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f121440a, eVar.f121440a) && Intrinsics.f(this.f121441b, eVar.f121441b) && Intrinsics.f(this.f121442c, eVar.f121442c) && this.d == eVar.d && this.e == eVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(kii.e.c(this.f121442c, kii.e.c(this.f121441b, this.f121440a.hashCode() * 31, 31), 31), 31, this.d);
    }

    public e(Data settings, Data availableSaleTypes, Data vatProfile, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(availableSaleTypes, "availableSaleTypes");
        Intrinsics.checkNotNullParameter(vatProfile, "vatProfile");
        this.f121440a = settings;
        this.f121441b = availableSaleTypes;
        this.f121442c = vatProfile;
        this.d = z;
        this.e = z3;
    }

    public /* synthetic */ e(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), false, false);
    }
}
