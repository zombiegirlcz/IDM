package com.revolut.feature.sca_prompt.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import grl.k9;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vrc.k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/sca_prompt/api/navigation/ScaPromptDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_sca_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScaPromptDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<ScaPromptDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f85337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f85338c;
    public final AnalyticsProduct d;
    public final Clause e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ScaPromptDestination(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), k.valueOf(parcel.readString()), (AnalyticsProduct) parcel.readParcelable(ScaPromptDestination.class.getClassLoader()), (Clause) parcel.readParcelable(ScaPromptDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ScaPromptDestination[i];
        }
    }

    public ScaPromptDestination(String legalEntityId, Integer num, k purpose, AnalyticsProduct analyticsProduct, Clause clause) {
        Intrinsics.checkNotNullParameter(legalEntityId, "legalEntityId");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f85336a = legalEntityId;
        this.f85337b = num;
        this.f85338c = purpose;
        this.d = analyticsProduct;
        this.e = clause;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ScaPromptDestination)) {
            return false;
        }
        ScaPromptDestination scaPromptDestination = (ScaPromptDestination) obj2;
        return Intrinsics.f(this.f85336a, scaPromptDestination.f85336a) && Intrinsics.f(this.f85337b, scaPromptDestination.f85337b) && this.f85338c == scaPromptDestination.f85338c && Intrinsics.f(this.d, scaPromptDestination.d) && Intrinsics.f(this.e, scaPromptDestination.e);
    }

    public final int hashCode() {
        int iHashCode = this.f85336a.hashCode() * 31;
        Integer num = this.f85337b;
        int iA = l.a((this.f85338c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31, this.d);
        Clause clause = this.e;
        return iA + (clause != null ? clause.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85336a);
        Integer num = this.f85337b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeString(this.f85338c.name());
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ScaPromptDestination(String str) {
        k kVar = k.OPTIONAL_TO_SKIP_2FA;
        k9 k9Var = k9.Crypto;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this(str, 328, kVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null);
    }
}
