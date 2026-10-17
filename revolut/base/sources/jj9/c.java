package jj9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f174781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f174782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f174783c;
    public final Data d;
    public final Data e;
    public final ai9.c f;

    public c(Data management, Data agreements, Data feeSettings, Data icon, Data user, ai9.c cVar) {
        Intrinsics.checkNotNullParameter(management, "management");
        Intrinsics.checkNotNullParameter(agreements, "agreements");
        Intrinsics.checkNotNullParameter(feeSettings, "feeSettings");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f174781a = management;
        this.f174782b = agreements;
        this.f174783c = feeSettings;
        this.d = icon;
        this.e = user;
        this.f = cVar;
    }

    public static c a(c cVar, Data data, Data data2, Data data3, Data data4, Data data5, ai9.c cVar2, int i) {
        if ((i & 1) != 0) {
            data = cVar.f174781a;
        }
        Data management = data;
        if ((i & 2) != 0) {
            data2 = cVar.f174782b;
        }
        Data agreements = data2;
        if ((i & 4) != 0) {
            data3 = cVar.f174783c;
        }
        Data feeSettings = data3;
        if ((i & 8) != 0) {
            data4 = cVar.d;
        }
        Data icon = data4;
        if ((i & 16) != 0) {
            data5 = cVar.e;
        }
        Data user = data5;
        if ((i & 32) != 0) {
            cVar2 = cVar.f;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(management, "management");
        Intrinsics.checkNotNullParameter(agreements, "agreements");
        Intrinsics.checkNotNullParameter(feeSettings, "feeSettings");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(user, "user");
        return new c(management, agreements, feeSettings, icon, user, cVar2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f174781a, cVar.f174781a) && Intrinsics.f(this.f174782b, cVar.f174782b) && Intrinsics.f(this.f174783c, cVar.f174783c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f174783c, kii.e.c(this.f174782b, this.f174781a.hashCode() * 31, 31), 31), 31), 31);
        ai9.c cVar = this.f;
        return iC + (cVar == null ? 0 : cVar.hashCode());
    }
}
