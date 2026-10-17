package aya;

import aii.e;
import kotlin.jvm.internal.Intrinsics;
import pwa.n;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f11111a;

    public a() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f11111a == ((a) obj2).f11111a;
    }

    public final int hashCode() {
        return this.f11111a.hashCode() + j6.a.c(Boolean.hashCode(false) * 31, 961, false);
    }

    public a(int i) {
        n referralCampaignV4Type = n.STANDARD;
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        this.f11111a = referralCampaignV4Type;
    }
}
