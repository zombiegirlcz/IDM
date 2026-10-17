package com.revolut.feature.rev_points.giftcards.impl.ui.flow.root;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductTermsAndConditions;
import com.revolut.feature.rev_points.giftcards.api.navigation.RevPointsGiftcardsDestination;
import com.revolut.feature.rev_points.giftcards.impl.ui.model.GiftCardPreview;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"com/revolut/feature/rev_points/giftcards/impl/ui/flow/root/RevPointsGiftcardsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "OpenGiftcardsHome", "OpenGiftcardDetails", "OpenGiftcardTermsAndConditions", "OpenSearch", "UsedAndExpiredCards", "DownloadCards", "Lcom/revolut/feature/rev_points/giftcards/impl/ui/flow/root/RevPointsGiftcardsFlowContract$Step$DownloadCards;", "Lcom/revolut/feature/rev_points/giftcards/impl/ui/flow/root/RevPointsGiftcardsFlowContract$Step$OpenGiftcardDetails;", "Lcom/revolut/feature/rev_points/giftcards/impl/ui/flow/root/RevPointsGiftcardsFlowContract$Step$OpenGiftcardTermsAndConditions;", "Lcom/revolut/feature/rev_points/giftcards/impl/ui/flow/root/RevPointsGiftcardsFlowContract$Step$OpenGiftcardsHome;", "Lcom/revolut/feature/rev_points/giftcards/impl/ui/flow/root/RevPointsGiftcardsFlowContract$Step$OpenSearch;", "Lcom/revolut/feature/rev_points/giftcards/impl/ui/flow/root/RevPointsGiftcardsFlowContract$Step$UsedAndExpiredCards;", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevPointsGiftcardsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/impl/ui/flow/root/RevPointsGiftcardsFlowContract$Step$DownloadCards;", "Lcom/revolut/feature/rev_points/giftcards/impl/ui/flow/root/RevPointsGiftcardsFlowContract$Step;", "<init>", "()V", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DownloadCards extends RevPointsGiftcardsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DownloadCards f83686a = new DownloadCards();

        @NotNull
        public static final Parcelable.Creator<DownloadCards> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DownloadCards.f83686a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DownloadCards[i];
            }
        }

        private DownloadCards() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/impl/ui/flow/root/RevPointsGiftcardsFlowContract$Step$OpenGiftcardDetails;", "Lcom/revolut/feature/rev_points/giftcards/impl/ui/flow/root/RevPointsGiftcardsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenGiftcardDetails extends RevPointsGiftcardsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OpenGiftcardDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f83688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final GiftCardPreview f83689c;
        public final RevPointsGiftcardsDestination.PostPurchaseBackBehavior d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenGiftcardDetails(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : GiftCardPreview.CREATOR.createFromParcel(parcel), (RevPointsGiftcardsDestination.PostPurchaseBackBehavior) parcel.readParcelable(OpenGiftcardDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenGiftcardDetails[i];
            }
        }

        public OpenGiftcardDetails() {
            this(null, null, null, null, 15);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OpenGiftcardDetails)) {
                return false;
            }
            OpenGiftcardDetails openGiftcardDetails = (OpenGiftcardDetails) obj2;
            return Intrinsics.f(this.f83687a, openGiftcardDetails.f83687a) && Intrinsics.f(this.f83688b, openGiftcardDetails.f83688b) && Intrinsics.f(this.f83689c, openGiftcardDetails.f83689c) && this.d == openGiftcardDetails.d;
        }

        public final int hashCode() {
            String str = this.f83687a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f83688b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            GiftCardPreview giftCardPreview = this.f83689c;
            return this.d.hashCode() + ((iHashCode2 + (giftCardPreview != null ? giftCardPreview.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83687a);
            dest.writeString(this.f83688b);
            GiftCardPreview giftCardPreview = this.f83689c;
            if (giftCardPreview == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                giftCardPreview.writeToParcel(dest, i);
            }
            dest.writeParcelable(this.d, i);
        }

        public OpenGiftcardDetails(String str, String str2, GiftCardPreview giftCardPreview, RevPointsGiftcardsDestination.PostPurchaseBackBehavior postPurchaseBackBehavior) {
            Intrinsics.checkNotNullParameter(postPurchaseBackBehavior, "postPurchaseBackBehavior");
            this.f83687a = str;
            this.f83688b = str2;
            this.f83689c = giftCardPreview;
            this.d = postPurchaseBackBehavior;
        }

        public /* synthetic */ OpenGiftcardDetails(String str, String str2, GiftCardPreview giftCardPreview, RevPointsGiftcardsDestination.PostPurchaseBackBehavior postPurchaseBackBehavior, int i) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : giftCardPreview, (i & 8) != 0 ? RevPointsGiftcardsDestination.PostPurchaseBackBehavior.OPEN_MY_CARDS : postPurchaseBackBehavior);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/impl/ui/flow/root/RevPointsGiftcardsFlowContract$Step$OpenGiftcardTermsAndConditions;", "Lcom/revolut/feature/rev_points/giftcards/impl/ui/flow/root/RevPointsGiftcardsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenGiftcardTermsAndConditions extends RevPointsGiftcardsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OpenGiftcardTermsAndConditions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VoucherProductTermsAndConditions f83690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f83691b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenGiftcardTermsAndConditions((VoucherProductTermsAndConditions) parcel.readParcelable(OpenGiftcardTermsAndConditions.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenGiftcardTermsAndConditions[i];
            }
        }

        public OpenGiftcardTermsAndConditions(VoucherProductTermsAndConditions voucherProductTermsAndConditions, String str) {
            Intrinsics.checkNotNullParameter(voucherProductTermsAndConditions, "voucherProductTermsAndConditions");
            this.f83690a = voucherProductTermsAndConditions;
            this.f83691b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OpenGiftcardTermsAndConditions)) {
                return false;
            }
            OpenGiftcardTermsAndConditions openGiftcardTermsAndConditions = (OpenGiftcardTermsAndConditions) obj2;
            return Intrinsics.f(this.f83690a, openGiftcardTermsAndConditions.f83690a) && Intrinsics.f(this.f83691b, openGiftcardTermsAndConditions.f83691b);
        }

        public final int hashCode() {
            int iHashCode = this.f83690a.hashCode() * 31;
            String str = this.f83691b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83690a, i);
            dest.writeString(this.f83691b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/impl/ui/flow/root/RevPointsGiftcardsFlowContract$Step$OpenGiftcardsHome;", "Lcom/revolut/feature/rev_points/giftcards/impl/ui/flow/root/RevPointsGiftcardsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenGiftcardsHome extends RevPointsGiftcardsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OpenGiftcardsHome> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevPointsGiftcardsDestination.GiftcardsHomePagerItem f83692a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenGiftcardsHome((RevPointsGiftcardsDestination.GiftcardsHomePagerItem) parcel.readParcelable(OpenGiftcardsHome.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenGiftcardsHome[i];
            }
        }

        public OpenGiftcardsHome() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OpenGiftcardsHome) && Intrinsics.f(this.f83692a, ((OpenGiftcardsHome) obj2).f83692a);
        }

        public final int hashCode() {
            return this.f83692a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83692a, i);
        }

        public OpenGiftcardsHome(RevPointsGiftcardsDestination.GiftcardsHomePagerItem pagerItem) {
            Intrinsics.checkNotNullParameter(pagerItem, "pagerItem");
            this.f83692a = pagerItem;
        }

        public /* synthetic */ OpenGiftcardsHome(int i) {
            this(new RevPointsGiftcardsDestination.GiftcardsHomePagerItem.Discover(false));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/impl/ui/flow/root/RevPointsGiftcardsFlowContract$Step$OpenSearch;", "Lcom/revolut/feature/rev_points/giftcards/impl/ui/flow/root/RevPointsGiftcardsFlowContract$Step;", "<init>", "()V", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OpenSearch extends RevPointsGiftcardsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OpenSearch f83693a = new OpenSearch();

        @NotNull
        public static final Parcelable.Creator<OpenSearch> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OpenSearch.f83693a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenSearch[i];
            }
        }

        private OpenSearch() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/impl/ui/flow/root/RevPointsGiftcardsFlowContract$Step$UsedAndExpiredCards;", "Lcom/revolut/feature/rev_points/giftcards/impl/ui/flow/root/RevPointsGiftcardsFlowContract$Step;", "<init>", "()V", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UsedAndExpiredCards extends RevPointsGiftcardsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UsedAndExpiredCards f83694a = new UsedAndExpiredCards();

        @NotNull
        public static final Parcelable.Creator<UsedAndExpiredCards> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UsedAndExpiredCards.f83694a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UsedAndExpiredCards[i];
            }
        }

        private UsedAndExpiredCards() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private RevPointsGiftcardsFlowContract$Step() {
    }
}
