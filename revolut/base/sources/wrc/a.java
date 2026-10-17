package wrc;

import aii.e;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import grl.k9;
import h30.l;
import kotlin.jvm.internal.Intrinsics;
import vrc.k;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f299547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsProduct f299548c;

    public a(String legalEntityId, AnalyticsProduct.Retail analyticsProduct, int i) {
        k purpose = k.OPTIONAL_TO_SKIP_2FA;
        if ((i & 4) != 0) {
            k9 k9Var = k9.Crypto;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            analyticsProduct = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        }
        Intrinsics.checkNotNullParameter(legalEntityId, "legalEntityId");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f299546a = legalEntityId;
        this.f299547b = purpose;
        this.f299548c = analyticsProduct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f299546a, aVar.f299546a) && this.f299547b == aVar.f299547b && Intrinsics.f(this.f299548c, aVar.f299548c);
    }

    public final int hashCode() {
        return l.a((this.f299547b.hashCode() + (this.f299546a.hashCode() * 31)) * 31, 31, this.f299548c);
    }
}
