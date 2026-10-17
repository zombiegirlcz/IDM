package xng;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f307490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f307491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f307492c;
    public final Image d;
    public final Clause e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f307493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f307494h;
    public final sil.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f307495j;
    public final String k;

    public h(Clause title, Clause clause, Clause clause2, Image image, Clause buttonClause, Data currency, boolean z, List frequencies, sil.c pickedFrequency, long j2, String incomeAmountInput) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonClause, "buttonClause");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(frequencies, "frequencies");
        Intrinsics.checkNotNullParameter(pickedFrequency, "pickedFrequency");
        Intrinsics.checkNotNullParameter(incomeAmountInput, "incomeAmountInput");
        this.f307490a = title;
        this.f307491b = clause;
        this.f307492c = clause2;
        this.d = image;
        this.e = buttonClause;
        this.f = currency;
        this.f307493g = z;
        this.f307494h = frequencies;
        this.i = pickedFrequency;
        this.f307495j = j2;
        this.k = incomeAmountInput;
    }

    public static h a(h hVar, Data data, sil.c cVar, long j2, String str, int i) {
        Clause title = hVar.f307490a;
        Clause clause = hVar.f307491b;
        Clause clause2 = hVar.f307492c;
        Image image = hVar.d;
        Clause buttonClause = hVar.e;
        Data currency = (i & 32) != 0 ? hVar.f : data;
        boolean z = hVar.f307493g;
        List frequencies = hVar.f307494h;
        sil.c pickedFrequency = (i & 256) != 0 ? hVar.i : cVar;
        long j3 = (i & 512) != 0 ? hVar.f307495j : j2;
        String incomeAmountInput = (i & 1024) != 0 ? hVar.k : str;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonClause, "buttonClause");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(frequencies, "frequencies");
        Intrinsics.checkNotNullParameter(pickedFrequency, "pickedFrequency");
        Intrinsics.checkNotNullParameter(incomeAmountInput, "incomeAmountInput");
        return new h(title, clause, clause2, image, buttonClause, currency, z, frequencies, pickedFrequency, j3, incomeAmountInput);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f307490a, hVar.f307490a) && Intrinsics.f(this.f307491b, hVar.f307491b) && Intrinsics.f(this.f307492c, hVar.f307492c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && this.f307493g == hVar.f307493g && Intrinsics.f(this.f307494h, hVar.f307494h) && this.i == hVar.i && this.f307495j == hVar.f307495j && Intrinsics.f(this.k, hVar.k);
    }

    public final int hashCode() {
        int iHashCode = this.f307490a.hashCode() * 31;
        Clause clause = this.f307491b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f307492c;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Image image = this.d;
        return this.k.hashCode() + a0.d.c((this.i.hashCode() + p.a.d(j6.a.c(kii.e.c(this.f, p.a.a((iHashCode3 + (image != null ? image.hashCode() : 0)) * 31, 31, this.e), 31), 31, this.f307493g), 31, this.f307494h)) * 31, 31, this.f307495j);
    }
}
