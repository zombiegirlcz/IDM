package x5i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f302979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountWrapper f302980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yqi.b f302981c;
    public final List d;

    public a(dj0.d amount, AccountWrapper accountWrapper, yqi.b bVar, List suggestions) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(accountWrapper, "accountWrapper");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        this.f302979a = amount;
        this.f302980b = accountWrapper;
        this.f302981c = bVar;
        this.d = suggestions;
    }

    public static a a(a aVar, dj0.d amount, AccountWrapper accountWrapper, int i) {
        if ((i & 1) != 0) {
            amount = aVar.f302979a;
        }
        if ((i & 2) != 0) {
            accountWrapper = aVar.f302980b;
        }
        yqi.b bVar = aVar.f302981c;
        List suggestions = aVar.d;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(accountWrapper, "accountWrapper");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        return new a(amount, accountWrapper, bVar, suggestions);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f302979a, aVar.f302979a) && Intrinsics.f(this.f302980b, aVar.f302980b) && Intrinsics.f(this.f302981c, aVar.f302981c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f302980b.hashCode() + (this.f302979a.hashCode() * 31)) * 31;
        yqi.b bVar = this.f302981c;
        return this.d.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }
}
