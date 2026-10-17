package usb;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f282870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f282871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f282872c;
    public final Data d;
    public final e e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f282873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f282874h;

    public f(dj0.d amount, Data data, Data data2, Data currencyPickerModel, e eVar, boolean z, boolean z3, List suggestedAmounts) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currencyPickerModel, "currencyPickerModel");
        Intrinsics.checkNotNullParameter(suggestedAmounts, "suggestedAmounts");
        this.f282870a = amount;
        this.f282871b = data;
        this.f282872c = data2;
        this.d = currencyPickerModel;
        this.e = eVar;
        this.f = z;
        this.f282873g = z3;
        this.f282874h = suggestedAmounts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f282870a, fVar.f282870a) && Intrinsics.f(this.f282871b, fVar.f282871b) && Intrinsics.f(this.f282872c, fVar.f282872c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && this.f == fVar.f && this.f282873g == fVar.f282873g && Intrinsics.f(this.f282874h, fVar.f282874h);
    }

    public final int hashCode() {
        int iHashCode = this.f282870a.hashCode() * 31;
        Data data = this.f282871b;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.f282872c;
        int iC = kii.e.c(this.d, (iHashCode2 + (data2 == null ? 0 : data2.hashCode())) * 31, 31);
        e eVar = this.e;
        return this.f282874h.hashCode() + j6.a.c(j6.a.c((iC + (eVar != null ? eVar.hashCode() : 0)) * 31, 31, this.f), 31, this.f282873g);
    }
}
