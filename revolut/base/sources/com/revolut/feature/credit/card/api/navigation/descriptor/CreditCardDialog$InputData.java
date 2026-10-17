package com.revolut.feature.credit.card.api.navigation.descriptor;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardDialogModel;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/card/api/navigation/descriptor/CreditCardDialog$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "PreLoadedContent", "LoadContent", "Lcom/revolut/feature/credit/card/api/navigation/descriptor/CreditCardDialog$InputData$LoadContent;", "Lcom/revolut/feature/credit/card/api/navigation/descriptor/CreditCardDialog$InputData$PreLoadedContent;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardDialog$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/descriptor/CreditCardDialog$InputData$LoadContent;", "Lcom/revolut/feature/credit/card/api/navigation/descriptor/CreditCardDialog$InputData;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoadContent implements CreditCardDialog$InputData {

        @NotNull
        public static final Parcelable.Creator<LoadContent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f68990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f68991b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LoadContent(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoadContent[i];
            }
        }

        public LoadContent(String facilityId, String type) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f68990a = facilityId;
            this.f68991b = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LoadContent)) {
                return false;
            }
            LoadContent loadContent = (LoadContent) obj2;
            return Intrinsics.f(this.f68990a, loadContent.f68990a) && Intrinsics.f(this.f68991b, loadContent.f68991b);
        }

        public final int hashCode() {
            return this.f68991b.hashCode() + (this.f68990a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68990a);
            dest.writeString(this.f68991b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/descriptor/CreditCardDialog$InputData$PreLoadedContent;", "Lcom/revolut/feature/credit/card/api/navigation/descriptor/CreditCardDialog$InputData;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PreLoadedContent implements CreditCardDialog$InputData {

        @NotNull
        public static final Parcelable.Creator<PreLoadedContent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditCardDialogModel f68992a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PreLoadedContent(CreditCardDialogModel.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PreLoadedContent[i];
            }
        }

        public PreLoadedContent(CreditCardDialogModel dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            this.f68992a = dialog;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PreLoadedContent) && Intrinsics.f(this.f68992a, ((PreLoadedContent) obj2).f68992a);
        }

        public final int hashCode() {
            return this.f68992a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f68992a.writeToParcel(dest, i);
        }
    }
}
