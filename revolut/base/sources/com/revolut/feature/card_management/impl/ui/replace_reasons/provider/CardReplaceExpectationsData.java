package com.revolut.feature.card_management.impl.ui.replace_reasons.provider;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.card_management.api.CardManagementFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wy2.d;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/impl/ui/replace_reasons/provider/CardReplaceExpectationsData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardReplaceExpectationsData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardReplaceExpectationsData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f64927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NaviCommand f64929c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardReplaceExpectationsData(d.valueOf(parcel.readString()), parcel.readString(), (NaviCommand) parcel.readParcelable(CardReplaceExpectationsData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardReplaceExpectationsData[i];
        }
    }

    public CardReplaceExpectationsData(d reason, String cardId, NaviCommand nextCommand) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(nextCommand, "nextCommand");
        this.f64927a = reason;
        this.f64928b = cardId;
        this.f64929c = nextCommand;
    }

    public final FeatureCommand a() {
        return new FeatureCommand(new CardManagementFeatureConfig.CardReplaceExpectations(this.f64927a, this.f64928b, this.f64929c));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardReplaceExpectationsData)) {
            return false;
        }
        CardReplaceExpectationsData cardReplaceExpectationsData = (CardReplaceExpectationsData) obj2;
        return this.f64927a == cardReplaceExpectationsData.f64927a && Intrinsics.f(this.f64928b, cardReplaceExpectationsData.f64928b) && Intrinsics.f(this.f64929c, cardReplaceExpectationsData.f64929c);
    }

    public final int hashCode() {
        return this.f64929c.hashCode() + p.a.c(this.f64927a.hashCode() * 31, 31, this.f64928b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f64927a.name());
        dest.writeString(this.f64928b);
        dest.writeParcelable(this.f64929c, i);
    }
}
