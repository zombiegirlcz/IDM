package s43;

import com.revolut.core.model.account.AccountId;
import h93.l0;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import q43.b0;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId f259734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f259735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x33.b f259736c;
    public final String d;
    public final Set e;
    public final x33.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x33.e f259737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f259738h;
    public final l0 i;

    public f(AccountId accountId, b0 section, x33.b content, String searchQuery, Set boundPocketIds, x33.e oldSelectedOption, x33.e eVar, boolean z, l0 l0Var) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(boundPocketIds, "boundPocketIds");
        Intrinsics.checkNotNullParameter(oldSelectedOption, "oldSelectedOption");
        this.f259734a = accountId;
        this.f259735b = section;
        this.f259736c = content;
        this.d = searchQuery;
        this.e = boundPocketIds;
        this.f = oldSelectedOption;
        this.f259737g = eVar;
        this.f259738h = z;
        this.i = l0Var;
    }

    public final x33.e a() {
        x33.e eVar = this.f259737g;
        return eVar == null ? this.f : eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f259734a, fVar.f259734a) && this.f259735b == fVar.f259735b && Intrinsics.f(this.f259736c, fVar.f259736c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f259737g, fVar.f259737g) && this.f259738h == fVar.f259738h && this.i == fVar.i;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + p.a.f(p.a.c((this.f259736c.hashCode() + ((this.f259735b.hashCode() + (this.f259734a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e)) * 31;
        x33.e eVar = this.f259737g;
        int iC = j6.a.c((iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31, 31, this.f259738h);
        l0 l0Var = this.i;
        return iC + (l0Var != null ? l0Var.hashCode() : 0);
    }
}
