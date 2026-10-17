package com.revolut.feature.rev_points.giftcards.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductTermsAndConditions;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u0007\b\t\nJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsDestination$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InputData", "StartType", "PostPurchaseBackBehavior", "GiftcardsHomePagerItem", "feature_rev_points_giftcards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsGiftcardsDestination extends InternalDestination<InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<RevPointsGiftcardsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StartType f83655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransitionAnimation f83656c;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsDestination$GiftcardsHomePagerItem;", "Lcom/revolut/kompot/navigable/vc/pager/FixedIdPagerItem;", "Landroid/os/Parcelable;", "<init>", "()V", "Discover", "MyCards", "Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsDestination$GiftcardsHomePagerItem$Discover;", "Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsDestination$GiftcardsHomePagerItem$MyCards;", "feature_rev_points_giftcards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class GiftcardsHomePagerItem implements FixedIdPagerItem, Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsDestination$GiftcardsHomePagerItem$MyCards;", "Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsDestination$GiftcardsHomePagerItem;", "<init>", "()V", "feature_rev_points_giftcards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class MyCards extends GiftcardsHomePagerItem {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final MyCards f83658a = new MyCards();

            @NotNull
            public static final Parcelable.Creator<MyCards> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return MyCards.f83658a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new MyCards[i];
                }
            }

            private MyCards() {
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

        private GiftcardsHomePagerItem() {
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsDestination$GiftcardsHomePagerItem$Discover;", "Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsDestination$GiftcardsHomePagerItem;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_giftcards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Discover extends GiftcardsHomePagerItem {

            @NotNull
            public static final Parcelable.Creator<Discover> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f83657a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Discover(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Discover[i];
                }
            }

            public Discover(boolean z) {
                this.f83657a = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Discover) && this.f83657a == ((Discover) obj2).f83657a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f83657a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f83657a ? 1 : 0);
            }

            public Discover() {
                this(false);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_giftcards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StartType f83659a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputData((StartType) parcel.readParcelable(InputData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputData[i];
            }
        }

        public InputData(StartType startType) {
            Intrinsics.checkNotNullParameter(startType, "startType");
            this.f83659a = startType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InputData) && Intrinsics.f(this.f83659a, ((InputData) obj2).f83659a);
        }

        public final int hashCode() {
            return this.f83659a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83659a, i);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsDestination$PostPurchaseBackBehavior;", "Landroid/os/Parcelable;", "", "OPEN_MY_CARDS", "RETURN_TO_PREVIOUS", "feature_rev_points_giftcards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PostPurchaseBackBehavior implements Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PostPurchaseBackBehavior[] $VALUES;

        @NotNull
        public static final Parcelable.Creator<PostPurchaseBackBehavior> CREATOR;
        public static final PostPurchaseBackBehavior OPEN_MY_CARDS;
        public static final PostPurchaseBackBehavior RETURN_TO_PREVIOUS;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return PostPurchaseBackBehavior.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PostPurchaseBackBehavior[i];
            }
        }

        static {
            PostPurchaseBackBehavior postPurchaseBackBehavior = new PostPurchaseBackBehavior("OPEN_MY_CARDS", 0);
            OPEN_MY_CARDS = postPurchaseBackBehavior;
            PostPurchaseBackBehavior postPurchaseBackBehavior2 = new PostPurchaseBackBehavior("RETURN_TO_PREVIOUS", 1);
            RETURN_TO_PREVIOUS = postPurchaseBackBehavior2;
            PostPurchaseBackBehavior[] postPurchaseBackBehaviorArr = {postPurchaseBackBehavior, postPurchaseBackBehavior2};
            $VALUES = postPurchaseBackBehaviorArr;
            $ENTRIES = s.n(postPurchaseBackBehaviorArr);
            CREATOR = new a();
        }

        public static PostPurchaseBackBehavior valueOf(String str) {
            return (PostPurchaseBackBehavior) Enum.valueOf(PostPurchaseBackBehavior.class, str);
        }

        public static PostPurchaseBackBehavior[] values() {
            return (PostPurchaseBackBehavior[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsDestination$StartType;", "Landroid/os/Parcelable;", "<init>", "()V", "OpenGiftcardsHome", "OpenGiftcardsDetails", "OpenGiftcardsTermsAndConditions", "UsedAndExpiredCards", "DownloadCards", "Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsDestination$StartType$DownloadCards;", "Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsDestination$StartType$OpenGiftcardsDetails;", "Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsDestination$StartType$OpenGiftcardsHome;", "Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsDestination$StartType$OpenGiftcardsTermsAndConditions;", "Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsDestination$StartType$UsedAndExpiredCards;", "feature_rev_points_giftcards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class StartType implements Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsDestination$StartType$DownloadCards;", "Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsDestination$StartType;", "<init>", "()V", "feature_rev_points_giftcards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class DownloadCards extends StartType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final DownloadCards f83660a = new DownloadCards();

            @NotNull
            public static final Parcelable.Creator<DownloadCards> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return DownloadCards.f83660a;
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsDestination$StartType$OpenGiftcardsDetails;", "Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_giftcards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenGiftcardsDetails extends StartType {

            @NotNull
            public static final Parcelable.Creator<OpenGiftcardsDetails> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f83661a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f83662b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f83663c;
            public final PostPurchaseBackBehavior d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OpenGiftcardsDetails(parcel.readString(), parcel.readString(), parcel.readString(), PostPurchaseBackBehavior.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OpenGiftcardsDetails[i];
                }
            }

            public OpenGiftcardsDetails() {
                this(null, null, null, null, 15);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF83663c() {
                return this.f83663c;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final PostPurchaseBackBehavior getD() {
                return this.d;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getF83662b() {
                return this.f83662b;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getF83661a() {
                return this.f83661a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof OpenGiftcardsDetails)) {
                    return false;
                }
                OpenGiftcardsDetails openGiftcardsDetails = (OpenGiftcardsDetails) obj2;
                return Intrinsics.f(this.f83661a, openGiftcardsDetails.f83661a) && Intrinsics.f(this.f83662b, openGiftcardsDetails.f83662b) && Intrinsics.f(this.f83663c, openGiftcardsDetails.f83663c) && this.d == openGiftcardsDetails.d;
            }

            public final int hashCode() {
                String str = this.f83661a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f83662b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f83663c;
                return this.d.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f83661a);
                dest.writeString(this.f83662b);
                dest.writeString(this.f83663c);
                this.d.writeToParcel(dest, i);
            }

            public OpenGiftcardsDetails(String str, String str2, String str3, PostPurchaseBackBehavior postPurchaseBackBehavior) {
                Intrinsics.checkNotNullParameter(postPurchaseBackBehavior, "postPurchaseBackBehavior");
                this.f83661a = str;
                this.f83662b = str2;
                this.f83663c = str3;
                this.d = postPurchaseBackBehavior;
            }

            public /* synthetic */ OpenGiftcardsDetails(String str, String str2, String str3, PostPurchaseBackBehavior postPurchaseBackBehavior, int i) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? PostPurchaseBackBehavior.OPEN_MY_CARDS : postPurchaseBackBehavior);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsDestination$StartType$OpenGiftcardsHome;", "Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_giftcards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenGiftcardsHome extends StartType {

            @NotNull
            public static final Parcelable.Creator<OpenGiftcardsHome> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final GiftcardsHomePagerItem f83664a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OpenGiftcardsHome((GiftcardsHomePagerItem) parcel.readParcelable(OpenGiftcardsHome.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OpenGiftcardsHome[i];
                }
            }

            public OpenGiftcardsHome() {
                this(0);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final GiftcardsHomePagerItem getF83664a() {
                return this.f83664a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof OpenGiftcardsHome) && Intrinsics.f(this.f83664a, ((OpenGiftcardsHome) obj2).f83664a);
            }

            public final int hashCode() {
                return this.f83664a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f83664a, i);
            }

            public OpenGiftcardsHome(GiftcardsHomePagerItem pagerItem) {
                Intrinsics.checkNotNullParameter(pagerItem, "pagerItem");
                this.f83664a = pagerItem;
            }

            public /* synthetic */ OpenGiftcardsHome(int i) {
                this(new GiftcardsHomePagerItem.Discover(false));
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsDestination$StartType$OpenGiftcardsTermsAndConditions;", "Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_giftcards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenGiftcardsTermsAndConditions extends StartType {

            @NotNull
            public static final Parcelable.Creator<OpenGiftcardsTermsAndConditions> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final VoucherProductTermsAndConditions f83665a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f83666b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OpenGiftcardsTermsAndConditions(VoucherProductTermsAndConditions.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OpenGiftcardsTermsAndConditions[i];
                }
            }

            public OpenGiftcardsTermsAndConditions(VoucherProductTermsAndConditions voucherProductTermsAndConditions, String str) {
                Intrinsics.checkNotNullParameter(voucherProductTermsAndConditions, "voucherProductTermsAndConditions");
                this.f83665a = voucherProductTermsAndConditions;
                this.f83666b = str;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF83666b() {
                return this.f83666b;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final VoucherProductTermsAndConditions getF83665a() {
                return this.f83665a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof OpenGiftcardsTermsAndConditions)) {
                    return false;
                }
                OpenGiftcardsTermsAndConditions openGiftcardsTermsAndConditions = (OpenGiftcardsTermsAndConditions) obj2;
                return Intrinsics.f(this.f83665a, openGiftcardsTermsAndConditions.f83665a) && Intrinsics.f(this.f83666b, openGiftcardsTermsAndConditions.f83666b);
            }

            public final int hashCode() {
                int iHashCode = this.f83665a.hashCode() * 31;
                String str = this.f83666b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f83665a.writeToParcel(dest, i);
                dest.writeString(this.f83666b);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsDestination$StartType$UsedAndExpiredCards;", "Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsDestination$StartType;", "<init>", "()V", "feature_rev_points_giftcards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class UsedAndExpiredCards extends StartType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final UsedAndExpiredCards f83667a = new UsedAndExpiredCards();

            @NotNull
            public static final Parcelable.Creator<UsedAndExpiredCards> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return UsedAndExpiredCards.f83667a;
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

        private StartType() {
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsGiftcardsDestination((StartType) parcel.readParcelable(RevPointsGiftcardsDestination.class.getClassLoader()), (TransitionAnimation) parcel.readParcelable(RevPointsGiftcardsDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsGiftcardsDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevPointsGiftcardsDestination(StartType startType, TransitionAnimation transitionAnimation) {
        super(new InputData(startType));
        Intrinsics.checkNotNullParameter(startType, "startType");
        this.f83655b = startType;
        this.f83656c = transitionAnimation;
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final TransitionAnimation getF83656c() {
        return this.f83656c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final StartType getF83655b() {
        return this.f83655b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsGiftcardsDestination)) {
            return false;
        }
        RevPointsGiftcardsDestination revPointsGiftcardsDestination = (RevPointsGiftcardsDestination) obj2;
        return Intrinsics.f(this.f83655b, revPointsGiftcardsDestination.f83655b) && Intrinsics.f(this.f83656c, revPointsGiftcardsDestination.f83656c);
    }

    public final int hashCode() {
        int iHashCode = this.f83655b.hashCode() * 31;
        TransitionAnimation transitionAnimation = this.f83656c;
        return iHashCode + (transitionAnimation == null ? 0 : transitionAnimation.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f83655b, i);
        dest.writeParcelable(this.f83656c, i);
    }
}
