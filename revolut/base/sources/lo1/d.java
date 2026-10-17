package lo1;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import oo1.a;
import oo1.b;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yqi.d f197363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yqi.d f197364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f197365c;
    public final String d;

    public d() {
        this(0);
    }

    public static d a(d dVar, yqi.d billerCode, yqi.d referenceNumber, String label, String focusedListId, int i) {
        if ((i & 1) != 0) {
            billerCode = dVar.f197363a;
        }
        if ((i & 2) != 0) {
            referenceNumber = dVar.f197364b;
        }
        if ((i & 4) != 0) {
            label = dVar.f197365c;
        }
        if ((i & 8) != 0) {
            focusedListId = dVar.d;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(billerCode, "billerCode");
        Intrinsics.checkNotNullParameter(referenceNumber, "referenceNumber");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(focusedListId, "focusedListId");
        return new d(billerCode, referenceNumber, label, focusedListId);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f197363a, dVar.f197363a) && Intrinsics.f(this.f197364b, dVar.f197364b) && Intrinsics.f(this.f197365c, dVar.f197365c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c((this.f197364b.hashCode() + (this.f197363a.hashCode() * 31)) * 31, 31, this.f197365c);
    }

    public d(yqi.d billerCode, yqi.d referenceNumber, String label, String focusedListId) {
        Intrinsics.checkNotNullParameter(billerCode, "billerCode");
        Intrinsics.checkNotNullParameter(referenceNumber, "referenceNumber");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(focusedListId, "focusedListId");
        this.f197363a = billerCode;
        this.f197364b = referenceNumber;
        this.f197365c = label;
        this.d = focusedListId;
    }

    public /* synthetic */ d(int i) {
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        yqi.d dVar = new yqi.d("", a.C1259a.f226992a);
        m70.a.c(t0Var);
        yqi.d dVar2 = new yqi.d("", b.C1260b.f226993a);
        m70.a.c(t0Var);
        m70.a.c(t0Var);
        this(dVar, dVar2, "", "");
    }
}
