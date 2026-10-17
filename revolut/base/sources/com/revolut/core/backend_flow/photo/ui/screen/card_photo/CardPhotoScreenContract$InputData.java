package com.revolut.core.backend_flow.photo.ui.screen.card_photo;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lc0.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/core/backend_flow/photo/ui/screen/card_photo/CardPhotoScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_photo_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardPhotoScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CardPhotoScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f51306c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardPhotoScreenContract$InputData(parcel.readString(), parcel.readString(), n.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardPhotoScreenContract$InputData[i];
        }
    }

    public CardPhotoScreenContract$InputData(String cardId, String alertId, n photoType) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(alertId, "alertId");
        Intrinsics.checkNotNullParameter(photoType, "photoType");
        this.f51304a = cardId;
        this.f51305b = alertId;
        this.f51306c = photoType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardPhotoScreenContract$InputData)) {
            return false;
        }
        CardPhotoScreenContract$InputData cardPhotoScreenContract$InputData = (CardPhotoScreenContract$InputData) obj2;
        return Intrinsics.f(this.f51304a, cardPhotoScreenContract$InputData.f51304a) && Intrinsics.f(this.f51305b, cardPhotoScreenContract$InputData.f51305b) && this.f51306c == cardPhotoScreenContract$InputData.f51306c;
    }

    public final int hashCode() {
        return this.f51306c.hashCode() + p.a.c(this.f51304a.hashCode() * 31, 31, this.f51305b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f51304a);
        dest.writeString(this.f51305b);
        dest.writeString(this.f51306c.name());
    }
}
