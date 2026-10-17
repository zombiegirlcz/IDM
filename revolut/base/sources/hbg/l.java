package hbg;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f150703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f150704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f150705c;
    public final Data d;
    public final Data e;
    public final Boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f150706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f150707h;
    public final boolean i;

    public l() {
        this(0);
    }

    public static l a(l lVar, Data data, Data data2, Data data3, Data data4, Data data5, Boolean bool, boolean z, boolean z3, int i) {
        if ((i & 1) != 0) {
            data = lVar.f150703a;
        }
        Data bookingDetails = data;
        if ((i & 2) != 0) {
            data2 = lVar.f150704b;
        }
        Data status = data2;
        if ((i & 4) != 0) {
            data3 = lVar.f150705c;
        }
        Data transactions = data3;
        if ((i & 8) != 0) {
            data4 = lVar.d;
        }
        Data inventoryProviders = data4;
        if ((i & 16) != 0) {
            data5 = lVar.e;
        }
        Data suggestedExperiences = data5;
        Boolean bool2 = (i & 32) != 0 ? lVar.f : bool;
        boolean z4 = (i & 64) != 0 ? lVar.f150706g : true;
        boolean z6 = (i & 128) != 0 ? lVar.f150707h : z;
        boolean z11 = (i & 256) != 0 ? lVar.i : z3;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(bookingDetails, "bookingDetails");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(inventoryProviders, "inventoryProviders");
        Intrinsics.checkNotNullParameter(suggestedExperiences, "suggestedExperiences");
        return new l(bookingDetails, status, transactions, inventoryProviders, suggestedExperiences, bool2, z4, z6, z11);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f150703a, lVar.f150703a) && Intrinsics.f(this.f150704b, lVar.f150704b) && Intrinsics.f(this.f150705c, lVar.f150705c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && this.f150706g == lVar.f150706g && this.f150707h == lVar.f150707h && this.i == lVar.i;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f150705c, kii.e.c(this.f150704b, this.f150703a.hashCode() * 31, 31), 31), 31), 31);
        Boolean bool = this.f;
        return Boolean.hashCode(this.i) + j6.a.c(j6.a.c((iC + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f150706g), 31, this.f150707h);
    }

    public l(Data bookingDetails, Data status, Data transactions, Data inventoryProviders, Data suggestedExperiences, Boolean bool, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(bookingDetails, "bookingDetails");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(inventoryProviders, "inventoryProviders");
        Intrinsics.checkNotNullParameter(suggestedExperiences, "suggestedExperiences");
        this.f150703a = bookingDetails;
        this.f150704b = status;
        this.f150705c = transactions;
        this.d = inventoryProviders;
        this.e = suggestedExperiences;
        this.f = bool;
        this.f150706g = z;
        this.f150707h = z3;
        this.i = z4;
    }

    public /* synthetic */ l(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, false, 7, null), null, false, false, false);
    }
}
