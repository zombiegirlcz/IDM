package com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.giftcards.impl.ui.model.GiftCardPreview;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/rev_points/giftcards/impl/ui/screen/giftcarddetails/RevPointsGiftcardDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsGiftcardDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RevPointsGiftcardDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GiftCardPreview f83710c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsGiftcardDetailsScreenContract$InputData(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : GiftCardPreview.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsGiftcardDetailsScreenContract$InputData[i];
        }
    }

    public RevPointsGiftcardDetailsScreenContract$InputData(String str, String str2, GiftCardPreview giftCardPreview) {
        this.f83708a = str;
        this.f83709b = str2;
        this.f83710c = giftCardPreview;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsGiftcardDetailsScreenContract$InputData)) {
            return false;
        }
        RevPointsGiftcardDetailsScreenContract$InputData revPointsGiftcardDetailsScreenContract$InputData = (RevPointsGiftcardDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f83708a, revPointsGiftcardDetailsScreenContract$InputData.f83708a) && Intrinsics.f(this.f83709b, revPointsGiftcardDetailsScreenContract$InputData.f83709b) && Intrinsics.f(this.f83710c, revPointsGiftcardDetailsScreenContract$InputData.f83710c);
    }

    public final int hashCode() {
        String str = this.f83708a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f83709b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        GiftCardPreview giftCardPreview = this.f83710c;
        return iHashCode2 + (giftCardPreview != null ? giftCardPreview.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f83708a);
        dest.writeString(this.f83709b);
        GiftCardPreview giftCardPreview = this.f83710c;
        if (giftCardPreview == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            giftCardPreview.writeToParcel(dest, i);
        }
    }

    public RevPointsGiftcardDetailsScreenContract$InputData() {
        this(null, null, null);
    }
}
