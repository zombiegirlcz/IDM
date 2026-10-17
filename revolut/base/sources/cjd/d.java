package cjd;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import pjd.b;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f24636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f24637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24638c;
    public final int d;
    public final boolean e;
    public final b.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f24639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f24640h;

    public d() {
        this(0);
    }

    public static d a(d dVar, Data data, Data data2, String str, int i, boolean z, b.a aVar, boolean z3, boolean z4, int i2) {
        if ((i2 & 1) != 0) {
            data = dVar.f24636a;
        }
        Data shopsCampaignOfferInfo = data;
        if ((i2 & 2) != 0) {
            data2 = dVar.f24637b;
        }
        Data shopsInstructions = data2;
        if ((i2 & 4) != 0) {
            str = dVar.f24638c;
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            i = dVar.d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z = dVar.e;
        }
        boolean z6 = z;
        if ((i2 & 32) != 0) {
            aVar = dVar.f;
        }
        b.a termsConfig = aVar;
        boolean z11 = (i2 & 64) != 0 ? dVar.f24639g : z3;
        boolean z12 = (i2 & 128) != 0 ? dVar.f24640h : z4;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(shopsCampaignOfferInfo, "shopsCampaignOfferInfo");
        Intrinsics.checkNotNullParameter(shopsInstructions, "shopsInstructions");
        Intrinsics.checkNotNullParameter(termsConfig, "termsConfig");
        return new d(shopsCampaignOfferInfo, shopsInstructions, str2, i3, z6, termsConfig, z11, z12);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f24636a, dVar.f24636a) && Intrinsics.f(this.f24637b, dVar.f24637b) && Intrinsics.f(this.f24638c, dVar.f24638c) && this.d == dVar.d && this.e == dVar.e && Intrinsics.f(this.f, dVar.f) && this.f24639g == dVar.f24639g && this.f24640h == dVar.f24640h;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f24637b, this.f24636a.hashCode() * 31, 31);
        String str = this.f24638c;
        return Boolean.hashCode(this.f24640h) + j6.a.c((this.f.hashCode() + j6.a.c(j6.a.b(this.d, (iC + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.e)) * 31, 31, this.f24639g);
    }

    public d(Data shopsCampaignOfferInfo, Data shopsInstructions, String str, int i, boolean z, b.a termsConfig, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(shopsCampaignOfferInfo, "shopsCampaignOfferInfo");
        Intrinsics.checkNotNullParameter(shopsInstructions, "shopsInstructions");
        Intrinsics.checkNotNullParameter(termsConfig, "termsConfig");
        this.f24636a = shopsCampaignOfferInfo;
        this.f24637b = shopsInstructions;
        this.f24638c = str;
        this.d = i;
        this.e = z;
        this.f = termsConfig;
        this.f24639g = z3;
        this.f24640h = z4;
    }

    public d(int i) {
        Data data = new Data(null, null, false, 7, null);
        Data data2 = new Data(null, null, false, 7, null);
        b.a.Companion.getClass();
        this(data, data2, null, -1, false, b.a.f236732h, false, false);
    }
}
