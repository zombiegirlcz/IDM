package v61;

import com.revolut.domain.models.moneyrequest.SplitBillState;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f286288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SplitBillState f286289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f286290c;
    public final String d;
    public final long e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f286291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f286292h;
    public final String i;

    public h(String id10, SplitBillState state, xi0.b currency, String str, long j2, ArrayList splittedItems, ArrayList moneyRequests, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(splittedItems, "splittedItems");
        Intrinsics.checkNotNullParameter(moneyRequests, "moneyRequests");
        this.f286288a = id10;
        this.f286289b = state;
        this.f286290c = currency;
        this.d = str;
        this.e = j2;
        this.f = splittedItems;
        this.f286291g = moneyRequests;
        this.f286292h = str2;
        this.i = str3;
    }

    public final List a() {
        return this.f286291g;
    }

    public final List b() {
        return this.f;
    }

    public final SplitBillState c() {
        return this.f286289b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f286288a, hVar.f286288a) && this.f286289b == hVar.f286289b && this.f286290c.equals(hVar.f286290c) && Intrinsics.f(this.d, hVar.d) && this.e == hVar.e && this.f.equals(hVar.f) && this.f286291g.equals(hVar.f286291g) && Intrinsics.f(this.f286292h, hVar.f286292h) && Intrinsics.f(this.i, hVar.i);
    }

    public final String getId() {
        return this.f286288a;
    }

    public final int hashCode() {
        int iJ = h30.l.j(this.f286290c, (this.f286289b.hashCode() + (this.f286288a.hashCode() * 31)) * 31, 31);
        String str = this.d;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f286291g, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, a0.d.c((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31), 31);
        String str2 = this.f286292h;
        int iHashCode = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }
}
