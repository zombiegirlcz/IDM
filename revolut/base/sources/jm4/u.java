package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_account_info.AdditionalCardsCardholderAccountInfoScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class u implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdditionalCardsCardholderAccountInfoScreenContract$InputData f176371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176373c;
    public final e4m.e d;

    public u(a3 a3Var, AdditionalCardsCardholderAccountInfoScreenContract$InputData additionalCardsCardholderAccountInfoScreenContract$InputData) {
        this.f176372b = a3Var;
        this.f176371a = additionalCardsCardholderAccountInfoScreenContract$InputData;
        int i = 14;
        this.f176373c = e4m.b.b(new jdi.i(a3Var, this, 1, i));
        this.d = e4m.b.b(new jdi.i(a3Var, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
