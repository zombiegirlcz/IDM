package com.revolut.feature.shared.help_centre.api.faq;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.chat.domain.model.NewTicketContext;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.shared.help_centre.api.faq.model.TransactionTroubleshooterFilter;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003\u0007\b\tJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InputData", "StartPoint", "PassthroughData", "feature_shared_help_centre_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SharedFaqDestination extends InternalDestination<InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<SharedFaqDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StartPoint f86106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PassthroughData f86107c;
    public final TransitionAnimation d;
    public final boolean e;

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StartPoint f86108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PassthroughData f86109b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputData((StartPoint) parcel.readParcelable(InputData.class.getClassLoader()), PassthroughData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputData[i];
            }
        }

        public InputData(StartPoint startPoint, PassthroughData passthroughData) {
            Intrinsics.checkNotNullParameter(startPoint, "startPoint");
            Intrinsics.checkNotNullParameter(passthroughData, "passthroughData");
            this.f86108a = startPoint;
            this.f86109b = passthroughData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InputData)) {
                return false;
            }
            InputData inputData = (InputData) obj2;
            return Intrinsics.f(this.f86108a, inputData.f86108a) && Intrinsics.f(this.f86109b, inputData.f86109b);
        }

        public final int hashCode() {
            return this.f86109b.hashCode() + (this.f86108a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f86108a, i);
            this.f86109b.writeToParcel(dest, i);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$PassthroughData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PassthroughData implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PassthroughData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NewTicketContext f86110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f86111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f86112c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PassthroughData((NewTicketContext) parcel.readParcelable(PassthroughData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PassthroughData[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public PassthroughData() {
            boolean z = false;
            this(null, z, z, 7);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PassthroughData)) {
                return false;
            }
            PassthroughData passthroughData = (PassthroughData) obj2;
            return Intrinsics.f(this.f86110a, passthroughData.f86110a) && this.f86111b == passthroughData.f86111b && this.f86112c == passthroughData.f86112c;
        }

        public final int hashCode() {
            NewTicketContext newTicketContext = this.f86110a;
            return Boolean.hashCode(this.f86112c) + j6.a.c((newTicketContext == null ? 0 : newTicketContext.hashCode()) * 31, 31, this.f86111b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f86110a, i);
            dest.writeInt(this.f86111b ? 1 : 0);
            dest.writeInt(this.f86112c ? 1 : 0);
        }

        public PassthroughData(NewTicketContext newTicketContext, boolean z, boolean z3) {
            this.f86110a = newTicketContext;
            this.f86111b = z;
            this.f86112c = z3;
        }

        public /* synthetic */ PassthroughData(NewTicketContext newTicketContext, boolean z, boolean z3, int i) {
            this((i & 1) != 0 ? null : newTicketContext, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z3);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint;", "Landroid/os/Parcelable;", "<init>", "()V", "Search", "TopLevelFaq", "SomethingElse", "FaqExplicit", "FaqByNode", "FaqByDisplayableItems", "CardsTroubleshooter", "CardTroubleshooter", "AllCards", "TransactionTroubleshooter", "FaqTransactionTroubleshooter", "UpcomingTransactionTroubleshooter", "Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint$AllCards;", "Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint$CardTroubleshooter;", "Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint$CardsTroubleshooter;", "Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint$FaqByDisplayableItems;", "Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint$FaqByNode;", "Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint$FaqExplicit;", "Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint$FaqTransactionTroubleshooter;", "Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint$Search;", "Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint$SomethingElse;", "Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint$TopLevelFaq;", "Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint$TransactionTroubleshooter;", "Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint$UpcomingTransactionTroubleshooter;", "feature_shared_help_centre_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class StartPoint implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint$AllCards;", "Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AllCards extends StartPoint {

            @NotNull
            public static final Parcelable.Creator<AllCards> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f86113a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AllCards(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AllCards[i];
                }
            }

            public AllCards(String str) {
                this.f86113a = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof AllCards) && Intrinsics.f(this.f86113a, ((AllCards) obj2).f86113a);
            }

            public final int hashCode() {
                String str = this.f86113a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f86113a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint$CardTroubleshooter;", "Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CardTroubleshooter extends StartPoint {

            @NotNull
            public static final Parcelable.Creator<CardTroubleshooter> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f86114a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f86115b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f86116c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CardTroubleshooter(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CardTroubleshooter[i];
                }
            }

            public CardTroubleshooter(String cardId, String str, boolean z) {
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                this.f86114a = cardId;
                this.f86115b = str;
                this.f86116c = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof CardTroubleshooter)) {
                    return false;
                }
                CardTroubleshooter cardTroubleshooter = (CardTroubleshooter) obj2;
                return Intrinsics.f(this.f86114a, cardTroubleshooter.f86114a) && Intrinsics.f(this.f86115b, cardTroubleshooter.f86115b) && this.f86116c == cardTroubleshooter.f86116c;
            }

            public final int hashCode() {
                int iHashCode = this.f86114a.hashCode() * 31;
                String str = this.f86115b;
                return Boolean.hashCode(this.f86116c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f86114a);
                dest.writeString(this.f86115b);
                dest.writeInt(this.f86116c ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint$CardsTroubleshooter;", "Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CardsTroubleshooter extends StartPoint {

            @NotNull
            public static final Parcelable.Creator<CardsTroubleshooter> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f86117a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CardsTroubleshooter(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CardsTroubleshooter[i];
                }
            }

            public CardsTroubleshooter(String str) {
                this.f86117a = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof CardsTroubleshooter) && Intrinsics.f(this.f86117a, ((CardsTroubleshooter) obj2).f86117a);
            }

            public final int hashCode() {
                String str = this.f86117a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f86117a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint$FaqByDisplayableItems;", "Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FaqByDisplayableItems extends StartPoint {

            @NotNull
            public static final Parcelable.Creator<FaqByDisplayableItems> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f86118a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List f86119b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f86120c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Clause clause = (Clause) j6.a.f(parcel, "parcel", FaqByDisplayableItems.class);
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(FaqByDisplayableItems.class, parcel, arrayList, iE, 1);
                    }
                    return new FaqByDisplayableItems(clause, parcel.readString(), arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FaqByDisplayableItems[i];
                }
            }

            public FaqByDisplayableItems(Clause title, String analyticsContextId, List items) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(items, "items");
                Intrinsics.checkNotNullParameter(analyticsContextId, "analyticsContextId");
                this.f86118a = title;
                this.f86119b = items;
                this.f86120c = analyticsContextId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof FaqByDisplayableItems)) {
                    return false;
                }
                FaqByDisplayableItems faqByDisplayableItems = (FaqByDisplayableItems) obj2;
                return Intrinsics.f(this.f86118a, faqByDisplayableItems.f86118a) && Intrinsics.f(this.f86119b, faqByDisplayableItems.f86119b) && Intrinsics.f(this.f86120c, faqByDisplayableItems.f86120c);
            }

            public final int hashCode() {
                return this.f86120c.hashCode() + p.a.d(this.f86118a.hashCode() * 31, 31, this.f86119b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f86118a, i);
                Iterator itV = p.a.v(this.f86119b, dest);
                while (itV.hasNext()) {
                    dest.writeParcelable((Parcelable) itV.next(), i);
                }
                dest.writeString(this.f86120c);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint$FaqByNode;", "Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FaqByNode extends StartPoint {

            @NotNull
            public static final Parcelable.Creator<FaqByNode> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final FaqNodeBase f86121a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f86122b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new FaqByNode((FaqNodeBase) parcel.readParcelable(FaqByNode.class.getClassLoader()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FaqByNode[i];
                }
            }

            public FaqByNode(FaqNodeBase node, boolean z) {
                Intrinsics.checkNotNullParameter(node, "node");
                this.f86121a = node;
                this.f86122b = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof FaqByNode)) {
                    return false;
                }
                FaqByNode faqByNode = (FaqByNode) obj2;
                return Intrinsics.f(this.f86121a, faqByNode.f86121a) && this.f86122b == faqByNode.f86122b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f86122b) + (this.f86121a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f86121a, i);
                dest.writeInt(this.f86122b ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint$FaqTransactionTroubleshooter;", "Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @d
        public static final /* data */ class FaqTransactionTroubleshooter extends StartPoint {

            @NotNull
            public static final Parcelable.Creator<FaqTransactionTroubleshooter> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f86126a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f86127b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new FaqTransactionTroubleshooter(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FaqTransactionTroubleshooter[i];
                }
            }

            public FaqTransactionTroubleshooter(String faqKey, String faqTitle) {
                Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                Intrinsics.checkNotNullParameter(faqTitle, "faqTitle");
                this.f86126a = faqKey;
                this.f86127b = faqTitle;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof FaqTransactionTroubleshooter)) {
                    return false;
                }
                FaqTransactionTroubleshooter faqTransactionTroubleshooter = (FaqTransactionTroubleshooter) obj2;
                return Intrinsics.f(this.f86126a, faqTransactionTroubleshooter.f86126a) && Intrinsics.f(this.f86127b, faqTransactionTroubleshooter.f86127b);
            }

            public final int hashCode() {
                return this.f86127b.hashCode() + (this.f86126a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f86126a);
                dest.writeString(this.f86127b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint$SomethingElse;", "Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SomethingElse extends StartPoint {

            @NotNull
            public static final Parcelable.Creator<SomethingElse> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f86129a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SomethingElse(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SomethingElse[i];
                }
            }

            public SomethingElse(String str) {
                this.f86129a = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof SomethingElse) && Intrinsics.f(this.f86129a, ((SomethingElse) obj2).f86129a);
            }

            public final int hashCode() {
                String str = this.f86129a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f86129a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint$UpcomingTransactionTroubleshooter;", "Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class UpcomingTransactionTroubleshooter extends StartPoint {

            @NotNull
            public static final Parcelable.Creator<UpcomingTransactionTroubleshooter> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f86134a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new UpcomingTransactionTroubleshooter(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new UpcomingTransactionTroubleshooter[i];
                }
            }

            public UpcomingTransactionTroubleshooter(String transactionId) {
                Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                this.f86134a = transactionId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof UpcomingTransactionTroubleshooter) && Intrinsics.f(this.f86134a, ((UpcomingTransactionTroubleshooter) obj2).f86134a);
            }

            public final int hashCode() {
                return this.f86134a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f86134a);
            }
        }

        private StartPoint() {
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint$Search;", "Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Search extends StartPoint {

            @NotNull
            public static final Parcelable.Creator<Search> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f86128a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Search(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Search[i];
                }
            }

            public Search(String str) {
                this.f86128a = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Search) && Intrinsics.f(this.f86128a, ((Search) obj2).f86128a);
            }

            public final int hashCode() {
                String str = this.f86128a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f86128a);
            }

            public Search() {
                this(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint$TopLevelFaq;", "Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TopLevelFaq extends StartPoint {

            @NotNull
            public static final Parcelable.Creator<TopLevelFaq> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f86130a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return new TopLevelFaq(null);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TopLevelFaq[i];
                }
            }

            public TopLevelFaq(List list) {
                this.f86130a = list;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof TopLevelFaq) && Intrinsics.f(this.f86130a, ((TopLevelFaq) obj2).f86130a);
            }

            public final int hashCode() {
                List list = this.f86130a;
                if (list == null) {
                    return 0;
                }
                return list.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            public TopLevelFaq() {
                this(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint$TransactionTroubleshooter;", "Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TransactionTroubleshooter extends StartPoint {

            @NotNull
            public static final Parcelable.Creator<TransactionTroubleshooter> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f86131a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final j7d.a f86132b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final TransactionTroubleshooterFilter f86133c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new TransactionTroubleshooter(parcel.readString(), j7d.a.valueOf(parcel.readString()), (TransactionTroubleshooterFilter) parcel.readParcelable(TransactionTroubleshooter.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TransactionTroubleshooter[i];
                }
            }

            public TransactionTroubleshooter(String str, j7d.a troubleshooterListType, TransactionTroubleshooterFilter troubleshooterFilter) {
                Intrinsics.checkNotNullParameter(troubleshooterListType, "troubleshooterListType");
                Intrinsics.checkNotNullParameter(troubleshooterFilter, "troubleshooterFilter");
                this.f86131a = str;
                this.f86132b = troubleshooterListType;
                this.f86133c = troubleshooterFilter;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof TransactionTroubleshooter)) {
                    return false;
                }
                TransactionTroubleshooter transactionTroubleshooter = (TransactionTroubleshooter) obj2;
                return Intrinsics.f(this.f86131a, transactionTroubleshooter.f86131a) && this.f86132b == transactionTroubleshooter.f86132b && Intrinsics.f(this.f86133c, transactionTroubleshooter.f86133c);
            }

            public final int hashCode() {
                String str = this.f86131a;
                return this.f86133c.hashCode() + ((this.f86132b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f86131a);
                dest.writeString(this.f86132b.name());
                dest.writeParcelable(this.f86133c, i);
            }

            public /* synthetic */ TransactionTroubleshooter(j7d.a aVar) {
                this(null, aVar, TransactionTroubleshooterFilter.None.f86143a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint$FaqExplicit;", "Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$StartPoint;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FaqExplicit extends StartPoint {

            @NotNull
            public static final Parcelable.Creator<FaqExplicit> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f86123a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List f86124b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final NewTicketContext f86125c;
            public final boolean d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new FaqExplicit(parcel.readString(), parcel.createStringArrayList(), (NewTicketContext) parcel.readParcelable(FaqExplicit.class.getClassLoader()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FaqExplicit[i];
                }
            }

            public FaqExplicit(String key, List fallbackKeys, NewTicketContext newTicketContext, boolean z) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(fallbackKeys, "fallbackKeys");
                this.f86123a = key;
                this.f86124b = fallbackKeys;
                this.f86125c = newTicketContext;
                this.d = z;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getD() {
                return this.d;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof FaqExplicit)) {
                    return false;
                }
                FaqExplicit faqExplicit = (FaqExplicit) obj2;
                return Intrinsics.f(this.f86123a, faqExplicit.f86123a) && Intrinsics.f(this.f86124b, faqExplicit.f86124b) && Intrinsics.f(this.f86125c, faqExplicit.f86125c) && this.d == faqExplicit.d;
            }

            /* JADX INFO: renamed from: getKey, reason: from getter */
            public final String getF86123a() {
                return this.f86123a;
            }

            public final int hashCode() {
                int iD = p.a.d(this.f86123a.hashCode() * 31, 31, this.f86124b);
                NewTicketContext newTicketContext = this.f86125c;
                return Boolean.hashCode(this.d) + ((iD + (newTicketContext == null ? 0 : newTicketContext.hashCode())) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f86123a);
                dest.writeStringList(this.f86124b);
                dest.writeParcelable(this.f86125c, i);
                dest.writeInt(this.d ? 1 : 0);
            }

            public FaqExplicit(String str, int i) {
                this(str, f0.f322471a, null, (i & 8) != 0);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SharedFaqDestination((StartPoint) parcel.readParcelable(SharedFaqDestination.class.getClassLoader()), PassthroughData.CREATOR.createFromParcel(parcel), (TransitionAnimation) parcel.readParcelable(SharedFaqDestination.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SharedFaqDestination[i];
        }
    }

    public /* synthetic */ SharedFaqDestination(StartPoint startPoint, PassthroughData passthroughData, boolean z, int i) {
        TransitionAnimation.FADE fade = TransitionAnimation.FADE.f98392a;
        NewTicketContext newTicketContext = null;
        if ((i & 2) != 0) {
            boolean z3 = false;
            passthroughData = new PassthroughData(newTicketContext, z3, z3, 7);
        }
        this(startPoint, passthroughData, (i & 4) != 0 ? null : fade, (i & 8) != 0 ? true : z);
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final TransitionAnimation getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SharedFaqDestination)) {
            return false;
        }
        SharedFaqDestination sharedFaqDestination = (SharedFaqDestination) obj2;
        return Intrinsics.f(this.f86106b, sharedFaqDestination.f86106b) && Intrinsics.f(this.f86107c, sharedFaqDestination.f86107c) && Intrinsics.f(this.d, sharedFaqDestination.d) && this.e == sharedFaqDestination.e;
    }

    public final int hashCode() {
        int iHashCode = (this.f86107c.hashCode() + (this.f86106b.hashCode() * 31)) * 31;
        TransitionAnimation transitionAnimation = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (transitionAnimation == null ? 0 : transitionAnimation.hashCode())) * 31);
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: n1, reason: from getter */
    public final boolean getE() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f86106b, i);
        this.f86107c.writeToParcel(dest, i);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedFaqDestination(StartPoint startPoint, PassthroughData passthroughData, TransitionAnimation transitionAnimation, boolean z) {
        super(new InputData(startPoint, passthroughData));
        Intrinsics.checkNotNullParameter(startPoint, "startPoint");
        Intrinsics.checkNotNullParameter(passthroughData, "passthroughData");
        this.f86106b = startPoint;
        this.f86107c = passthroughData;
        this.d = transitionAnimation;
        this.e = z;
    }
}
