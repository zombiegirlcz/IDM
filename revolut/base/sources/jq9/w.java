package jq9;

import com.revolut.feature.push_to_card.api.data.CardOwnerWithStats;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardOwnerWithStats f177524a;

    public w(CardOwnerWithStats card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f177524a = card;
    }

    @Override // jq9.t
    public final String a() {
        return this.f177524a.f81495a.a();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f177524a, ((w) obj2).f177524a);
    }

    public final int hashCode() {
        return this.f177524a.hashCode();
    }
}
