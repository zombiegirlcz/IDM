package hu1;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f155532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f155533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f155534c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f155535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f155536h;
    public final String i;

    public o(Data blikCode, Data contactsInfo, Data transactionsInfo, boolean z, boolean z3, boolean z4, boolean z6, String str, String userPhoneNumber) {
        Intrinsics.checkNotNullParameter(blikCode, "blikCode");
        Intrinsics.checkNotNullParameter(contactsInfo, "contactsInfo");
        Intrinsics.checkNotNullParameter(transactionsInfo, "transactionsInfo");
        Intrinsics.checkNotNullParameter(userPhoneNumber, "userPhoneNumber");
        this.f155532a = blikCode;
        this.f155533b = contactsInfo;
        this.f155534c = transactionsInfo;
        this.d = z;
        this.e = z3;
        this.f = z4;
        this.f155535g = z6;
        this.f155536h = str;
        this.i = userPhoneNumber;
    }

    public static o a(o oVar, Data data, Data data2, Data data3, boolean z, boolean z3, boolean z4, boolean z6, String str, String str2, int i) {
        if ((i & 1) != 0) {
            data = oVar.f155532a;
        }
        Data blikCode = data;
        if ((i & 2) != 0) {
            data2 = oVar.f155533b;
        }
        Data contactsInfo = data2;
        if ((i & 4) != 0) {
            data3 = oVar.f155534c;
        }
        Data transactionsInfo = data3;
        if ((i & 8) != 0) {
            z = oVar.d;
        }
        boolean z11 = z;
        if ((i & 16) != 0) {
            z3 = oVar.e;
        }
        boolean z12 = z3;
        boolean z29 = (i & 32) != 0 ? oVar.f : z4;
        boolean z31 = (i & 64) != 0 ? oVar.f155535g : z6;
        String str3 = (i & 128) != 0 ? oVar.f155536h : str;
        String userPhoneNumber = (i & 256) != 0 ? oVar.i : str2;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(blikCode, "blikCode");
        Intrinsics.checkNotNullParameter(contactsInfo, "contactsInfo");
        Intrinsics.checkNotNullParameter(transactionsInfo, "transactionsInfo");
        Intrinsics.checkNotNullParameter(userPhoneNumber, "userPhoneNumber");
        return new o(blikCode, contactsInfo, transactionsInfo, z11, z12, z29, z31, str3, userPhoneNumber);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f155532a, oVar.f155532a) && Intrinsics.f(this.f155533b, oVar.f155533b) && Intrinsics.f(this.f155534c, oVar.f155534c) && this.d == oVar.d && this.e == oVar.e && this.f == oVar.f && this.f155535g == oVar.f155535g && Intrinsics.f(this.f155536h, oVar.f155536h) && Intrinsics.f(this.i, oVar.i);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c(kii.e.c(this.f155534c, kii.e.c(this.f155533b, this.f155532a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.f155535g);
        String str = this.f155536h;
        return this.i.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
