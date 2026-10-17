package vb2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f287360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f287361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f287362c;
    public final String d;

    public e() {
        this(0);
    }

    public static e a(e eVar, String selectedTabId, String payId, String bsb2, String accountNumber, int i) {
        if ((i & 1) != 0) {
            selectedTabId = eVar.f287360a;
        }
        if ((i & 2) != 0) {
            payId = eVar.f287361b;
        }
        if ((i & 4) != 0) {
            bsb2 = eVar.f287362c;
        }
        if ((i & 8) != 0) {
            accountNumber = eVar.d;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        Intrinsics.checkNotNullParameter(payId, "payId");
        Intrinsics.checkNotNullParameter(bsb2, "bsb");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new e(selectedTabId, payId, bsb2, accountNumber);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f287360a, eVar.f287360a) && Intrinsics.f(this.f287361b, eVar.f287361b) && Intrinsics.f(this.f287362c, eVar.f287362c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f287360a.hashCode() * 31, 31, this.f287361b), 31, this.f287362c);
    }

    public e(String selectedTabId, String payId, String bsb2, String accountNumber) {
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        Intrinsics.checkNotNullParameter(payId, "payId");
        Intrinsics.checkNotNullParameter(bsb2, "bsb");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.f287360a = selectedTabId;
        this.f287361b = payId;
        this.f287362c = bsb2;
        this.d = accountNumber;
    }

    public /* synthetic */ e(int i) {
        this(h.PAY_ID.getId(), "", "", "");
    }
}
