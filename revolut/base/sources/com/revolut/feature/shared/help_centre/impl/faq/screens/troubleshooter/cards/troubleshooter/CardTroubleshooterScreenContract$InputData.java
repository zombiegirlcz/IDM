package com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.troubleshooter;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared/help_centre/impl/faq/screens/troubleshooter/cards/troubleshooter/CardTroubleshooterScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardTroubleshooterScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CardTroubleshooterScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f86323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f86324c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardTroubleshooterScreenContract$InputData(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardTroubleshooterScreenContract$InputData[i];
        }
    }

    public CardTroubleshooterScreenContract$InputData(String cardId, boolean z, String str, boolean z3) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f86322a = cardId;
        this.f86323b = z;
        this.f86324c = str;
        this.d = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardTroubleshooterScreenContract$InputData)) {
            return false;
        }
        CardTroubleshooterScreenContract$InputData cardTroubleshooterScreenContract$InputData = (CardTroubleshooterScreenContract$InputData) obj2;
        return Intrinsics.f(this.f86322a, cardTroubleshooterScreenContract$InputData.f86322a) && this.f86323b == cardTroubleshooterScreenContract$InputData.f86323b && Intrinsics.f(this.f86324c, cardTroubleshooterScreenContract$InputData.f86324c) && this.d == cardTroubleshooterScreenContract$InputData.d;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f86322a.hashCode() * 31, 31, this.f86323b);
        String str = this.f86324c;
        return Boolean.hashCode(this.d) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86322a);
        dest.writeInt(this.f86323b ? 1 : 0);
        dest.writeString(this.f86324c);
        dest.writeInt(this.d ? 1 : 0);
    }
}
