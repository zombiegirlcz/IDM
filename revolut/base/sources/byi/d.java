package byi;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f19825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f19827c;
    public final Data d;
    public final Data e;
    public final Data f;

    public d(Data user, Data loungePass, Data loungePassQrCode, Data refundInfo, Data termsAndConditionsUrl, boolean z) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(loungePass, "loungePass");
        Intrinsics.checkNotNullParameter(loungePassQrCode, "loungePassQrCode");
        Intrinsics.checkNotNullParameter(refundInfo, "refundInfo");
        Intrinsics.checkNotNullParameter(termsAndConditionsUrl, "termsAndConditionsUrl");
        this.f19825a = user;
        this.f19826b = z;
        this.f19827c = loungePass;
        this.d = loungePassQrCode;
        this.e = refundInfo;
        this.f = termsAndConditionsUrl;
    }

    public static d a(d dVar, Data data, Data data2, Data data3, Data data4, Data data5, int i) {
        if ((i & 1) != 0) {
            data = dVar.f19825a;
        }
        Data user = data;
        boolean z = (i & 2) != 0 ? dVar.f19826b : false;
        if ((i & 4) != 0) {
            data2 = dVar.f19827c;
        }
        Data loungePass = data2;
        if ((i & 8) != 0) {
            data3 = dVar.d;
        }
        Data loungePassQrCode = data3;
        if ((i & 16) != 0) {
            data4 = dVar.e;
        }
        Data refundInfo = data4;
        if ((i & 32) != 0) {
            data5 = dVar.f;
        }
        Data termsAndConditionsUrl = data5;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(loungePass, "loungePass");
        Intrinsics.checkNotNullParameter(loungePassQrCode, "loungePassQrCode");
        Intrinsics.checkNotNullParameter(refundInfo, "refundInfo");
        Intrinsics.checkNotNullParameter(termsAndConditionsUrl, "termsAndConditionsUrl");
        return new d(user, loungePass, loungePassQrCode, refundInfo, termsAndConditionsUrl, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f19825a, dVar.f19825a) && this.f19826b == dVar.f19826b && Intrinsics.f(this.f19827c, dVar.f19827c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f19827c, j6.a.c(this.f19825a.hashCode() * 31, 31, this.f19826b), 31), 31), 31);
    }
}
