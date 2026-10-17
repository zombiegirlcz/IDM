package com.revolut.feature.add_card_to_google_pay_shared.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.add_card_to_google_pay.integration.api.model.SharedRevolutCardWrapper;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kg1.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/add_card_to_google_pay_shared/api/navigation/CardSecurityPromptDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_add_card_to_google_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardSecurityPromptDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CardSecurityPromptDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedRevolutCardWrapper f60862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f60863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f60864c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardSecurityPromptDestination((SharedRevolutCardWrapper) parcel.readParcelable(CardSecurityPromptDestination.class.getClassLoader()), parcel.readInt() != 0, d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardSecurityPromptDestination[i];
        }
    }

    public CardSecurityPromptDestination(SharedRevolutCardWrapper cardWrapper, boolean z, d secondaryButtonType) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(secondaryButtonType, "secondaryButtonType");
        this.f60862a = cardWrapper;
        this.f60863b = z;
        this.f60864c = secondaryButtonType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardSecurityPromptDestination)) {
            return false;
        }
        CardSecurityPromptDestination cardSecurityPromptDestination = (CardSecurityPromptDestination) obj2;
        return Intrinsics.f(this.f60862a, cardSecurityPromptDestination.f60862a) && this.f60863b == cardSecurityPromptDestination.f60863b && this.f60864c == cardSecurityPromptDestination.f60864c;
    }

    public final int hashCode() {
        return this.f60864c.hashCode() + j6.a.c(this.f60862a.hashCode() * 31, 31, this.f60863b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f60862a, i);
        dest.writeInt(this.f60863b ? 1 : 0);
        dest.writeString(this.f60864c.name());
    }
}
