package o63;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n63.b f222492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b93.d f222493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountId f222494c;
    public final CardScreenAction d;

    public d() {
        this(null, 31);
    }

    public final AccountId b() {
        return this.f222494c;
    }

    public final CardScreenAction c() {
        return this.d;
    }

    public final b93.d d() {
        return this.f222493b;
    }

    public final n63.b e() {
        return this.f222492a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f222492a == dVar.f222492a && this.f222493b == dVar.f222493b && Intrinsics.f(this.f222494c, dVar.f222494c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + l.b(this.f222494c, (this.f222493b.hashCode() + (this.f222492a.hashCode() * 31)) * 31, 31);
    }

    public d(CardScreenAction.Select select, int i) {
        n63.b flow = n63.b.RETAIL;
        b93.d cardScope = b93.d.RETAIL;
        CardScreenAction action = select;
        action = (i & 16) != 0 ? CardScreenAction.Idle.f65329a : action;
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(cardScope, "cardScope");
        AccountId.Personal accountId = AccountId.Personal.f51414a;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f222492a = flow;
        this.f222493b = cardScope;
        this.f222494c = accountId;
        this.d = action;
    }
}
