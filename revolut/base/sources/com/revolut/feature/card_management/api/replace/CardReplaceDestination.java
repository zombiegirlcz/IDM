package com.revolut.feature.card_management.api.replace;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wy2.d;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/card_management/api/replace/CardReplaceDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "StartType", "feature_card_management_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardReplaceDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CardReplaceDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StartType f64802a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/card_management/api/replace/CardReplaceDestination$StartType;", "Landroid/os/Parcelable;", "<init>", "()V", "SelectReason", "Expectations", "Lcom/revolut/feature/card_management/api/replace/CardReplaceDestination$StartType$Expectations;", "Lcom/revolut/feature/card_management/api/replace/CardReplaceDestination$StartType$SelectReason;", "feature_card_management_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class StartType implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/api/replace/CardReplaceDestination$StartType$Expectations;", "Lcom/revolut/feature/card_management/api/replace/CardReplaceDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_card_management_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Expectations extends StartType {

            @NotNull
            public static final Parcelable.Creator<Expectations> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f64803a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f64804b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final NaviCommand f64805c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Expectations(d.valueOf(parcel.readString()), parcel.readString(), (NaviCommand) parcel.readParcelable(Expectations.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Expectations[i];
                }
            }

            public Expectations(d reason, String cardId, NaviCommand nextCommand) {
                Intrinsics.checkNotNullParameter(reason, "reason");
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                Intrinsics.checkNotNullParameter(nextCommand, "nextCommand");
                this.f64803a = reason;
                this.f64804b = cardId;
                this.f64805c = nextCommand;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Expectations)) {
                    return false;
                }
                Expectations expectations = (Expectations) obj2;
                return this.f64803a == expectations.f64803a && Intrinsics.f(this.f64804b, expectations.f64804b) && Intrinsics.f(this.f64805c, expectations.f64805c);
            }

            public final int hashCode() {
                return this.f64805c.hashCode() + p.a.c(this.f64803a.hashCode() * 31, 31, this.f64804b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f64803a.name());
                dest.writeString(this.f64804b);
                dest.writeParcelable(this.f64805c, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/api/replace/CardReplaceDestination$StartType$SelectReason;", "Lcom/revolut/feature/card_management/api/replace/CardReplaceDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_card_management_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SelectReason extends StartType {

            @NotNull
            public static final Parcelable.Creator<SelectReason> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f64806a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final d f64807b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SelectReason(parcel.readString(), parcel.readInt() == 0 ? null : d.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SelectReason[i];
                }
            }

            public SelectReason(String cardId, d dVar) {
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                this.f64806a = cardId;
                this.f64807b = dVar;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof SelectReason)) {
                    return false;
                }
                SelectReason selectReason = (SelectReason) obj2;
                return Intrinsics.f(this.f64806a, selectReason.f64806a) && this.f64807b == selectReason.f64807b;
            }

            public final int hashCode() {
                int iHashCode = this.f64806a.hashCode() * 31;
                d dVar = this.f64807b;
                return iHashCode + (dVar == null ? 0 : dVar.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f64806a);
                d dVar = this.f64807b;
                if (dVar == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(dVar.name());
                }
            }
        }

        private StartType() {
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardReplaceDestination((StartType) parcel.readParcelable(CardReplaceDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardReplaceDestination[i];
        }
    }

    public CardReplaceDestination(StartType startType) {
        Intrinsics.checkNotNullParameter(startType, "startType");
        this.f64802a = startType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final StartType getF64802a() {
        return this.f64802a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CardReplaceDestination) && Intrinsics.f(this.f64802a, ((CardReplaceDestination) obj2).f64802a);
    }

    public final int hashCode() {
        return this.f64802a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f64802a, i);
    }
}
