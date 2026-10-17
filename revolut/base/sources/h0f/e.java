package h0f;

import com.revolut.domain.models.topup.methods.TopupMethodType;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yqi.d f148386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yqi.d f148387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f148388c;
    public final String d;
    public final TopupMethodType e;

    public e() {
        this(null, 31);
    }

    public static e a(e eVar, yqi.d dVar, yqi.d dVar2, String str, String str2, int i) {
        if ((i & 1) != 0) {
            dVar = eVar.f148386a;
        }
        yqi.d accountNumber = dVar;
        if ((i & 2) != 0) {
            dVar2 = eVar.f148387b;
        }
        yqi.d ifscCode = dVar2;
        if ((i & 4) != 0) {
            str = eVar.f148388c;
        }
        String focusedListId = str;
        if ((i & 8) != 0) {
            str2 = eVar.d;
        }
        String bankName = str2;
        TopupMethodType topupMethodType = eVar.e;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(ifscCode, "ifscCode");
        Intrinsics.checkNotNullParameter(focusedListId, "focusedListId");
        Intrinsics.checkNotNullParameter(bankName, "bankName");
        return new e(accountNumber, ifscCode, focusedListId, bankName, topupMethodType);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f148386a, eVar.f148386a) && Intrinsics.f(this.f148387b, eVar.f148387b) && Intrinsics.f(this.f148388c, eVar.f148388c) && Intrinsics.f(this.d, eVar.d) && this.e == eVar.e;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c((this.f148387b.hashCode() + (this.f148386a.hashCode() * 31)) * 31, 31, this.f148388c), 31, this.d);
        TopupMethodType topupMethodType = this.e;
        return iC + (topupMethodType == null ? 0 : topupMethodType.hashCode());
    }

    public e(yqi.d accountNumber, yqi.d ifscCode, String focusedListId, String bankName, TopupMethodType topupMethodType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(ifscCode, "ifscCode");
        Intrinsics.checkNotNullParameter(focusedListId, "focusedListId");
        Intrinsics.checkNotNullParameter(bankName, "bankName");
        this.f148386a = accountNumber;
        this.f148387b = ifscCode;
        this.f148388c = focusedListId;
        this.d = bankName;
        this.e = topupMethodType;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ e(TopupMethodType topupMethodType, int i) {
        yqi.c cVar = yqi.d.Companion;
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        cVar.getClass();
        yqi.d dVarA = yqi.c.a("");
        m70.a.c(t0Var);
        cVar.getClass();
        yqi.d dVarA2 = yqi.c.a("");
        m70.a.c(t0Var);
        m70.a.c(t0Var);
        this(dVarA, dVarA2, "", "", (i & 16) != 0 ? null : topupMethodType);
    }
}
