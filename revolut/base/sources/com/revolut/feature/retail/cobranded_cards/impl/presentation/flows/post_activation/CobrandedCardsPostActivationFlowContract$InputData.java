package com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.post_activation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/retail/cobranded_cards/impl/presentation/flows/post_activation/CobrandedCardsPostActivationFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Default", "PostActivation", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/post_activation/CobrandedCardsPostActivationFlowContract$InputData$Default;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/post_activation/CobrandedCardsPostActivationFlowContract$InputData$PostActivation;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CobrandedCardsPostActivationFlowContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/post_activation/CobrandedCardsPostActivationFlowContract$InputData$Default;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/post_activation/CobrandedCardsPostActivationFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Default implements CobrandedCardsPostActivationFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f82537b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Default(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        public Default() {
            this(null, true);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Default)) {
                return false;
            }
            Default r56 = (Default) obj2;
            return Intrinsics.f(this.f82536a, r56.f82536a) && this.f82537b == r56.f82537b;
        }

        public final int hashCode() {
            String str = this.f82536a;
            return Boolean.hashCode(this.f82537b) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82536a);
            dest.writeInt(this.f82537b ? 1 : 0);
        }

        public Default(String str, boolean z) {
            this.f82536a = str;
            this.f82537b = z;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/post_activation/CobrandedCardsPostActivationFlowContract$InputData$PostActivation;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/post_activation/CobrandedCardsPostActivationFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PostActivation implements CobrandedCardsPostActivationFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<PostActivation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NaviCommand f82538a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PostActivation((NaviCommand) parcel.readParcelable(PostActivation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PostActivation[i];
            }
        }

        public PostActivation(NaviCommand nextCommand) {
            Intrinsics.checkNotNullParameter(nextCommand, "nextCommand");
            this.f82538a = nextCommand;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PostActivation) && Intrinsics.f(this.f82538a, ((PostActivation) obj2).f82538a);
        }

        public final int hashCode() {
            return this.f82538a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82538a, i);
        }
    }
}
