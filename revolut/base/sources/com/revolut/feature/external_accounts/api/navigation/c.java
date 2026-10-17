package com.revolut.feature.external_accounts.api.navigation;

import aii.e;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExternalAccountsFeatureConfig.Configuration.TrueLayer f72360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExternalAccountsFeatureConfig.Configuration.DirectLink f72361b;

    public c(ExternalAccountsFeatureConfig.Configuration.TrueLayer trueLayer, ExternalAccountsFeatureConfig.Configuration.DirectLink directLink) {
        this.f72360a = trueLayer;
        this.f72361b = directLink;
    }

    public final ExternalAccountsFeatureConfig.Configuration.DirectLink b() {
        return this.f72361b;
    }

    public final ExternalAccountsFeatureConfig.Configuration.TrueLayer c() {
        return this.f72360a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f72360a, cVar.f72360a) && Intrinsics.f(this.f72361b, cVar.f72361b);
    }

    public final int hashCode() {
        ExternalAccountsFeatureConfig.Configuration.TrueLayer trueLayer = this.f72360a;
        int iHashCode = (trueLayer == null ? 0 : trueLayer.hashCode()) * 31;
        ExternalAccountsFeatureConfig.Configuration.DirectLink directLink = this.f72361b;
        return Boolean.hashCode(false) + ((iHashCode + (directLink == null ? 0 : directLink.hashCode())) * 31);
    }
}
