package com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared/help_centre/impl/faq/screens/troubleshooter/cards/selection/CardsTroubleshooterSelectionScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardsTroubleshooterSelectionScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CardsTroubleshooterSelectionScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f86317b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardsTroubleshooterSelectionScreenContract$InputData(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardsTroubleshooterSelectionScreenContract$InputData[i];
        }
    }

    public CardsTroubleshooterSelectionScreenContract$InputData(String str, boolean z) {
        this.f86316a = str;
        this.f86317b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardsTroubleshooterSelectionScreenContract$InputData)) {
            return false;
        }
        CardsTroubleshooterSelectionScreenContract$InputData cardsTroubleshooterSelectionScreenContract$InputData = (CardsTroubleshooterSelectionScreenContract$InputData) obj2;
        return Intrinsics.f(this.f86316a, cardsTroubleshooterSelectionScreenContract$InputData.f86316a) && this.f86317b == cardsTroubleshooterSelectionScreenContract$InputData.f86317b;
    }

    public final int hashCode() {
        String str = this.f86316a;
        return Boolean.hashCode(this.f86317b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86316a);
        dest.writeInt(this.f86317b ? 1 : 0);
    }
}
