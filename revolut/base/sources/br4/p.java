package br4;

import com.revolut.feature.credit.card.api.navigation.CreditCardDescriptionDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardDescriptionDestination.DescriptionConfig.Local.SpendingLimit f17918a;

    public p(CreditCardDescriptionDestination.DescriptionConfig.Local.SpendingLimit config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f17918a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && this.f17918a.equals(((p) obj2).f17918a);
    }

    public final int hashCode() {
        return this.f17918a.hashCode();
    }
}
