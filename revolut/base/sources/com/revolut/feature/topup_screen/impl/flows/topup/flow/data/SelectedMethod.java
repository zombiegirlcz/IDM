package com.revolut.feature.topup_screen.impl.flows.topup.flow.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.domain.models.externalcards.CardholderVerificationStatus;
import com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$OutputData$CardData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class SelectedMethod {

    public static abstract class StoredMethod extends SelectedMethod {

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/data/SelectedMethod$StoredMethod$Card;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/data/SelectedMethod$StoredMethod;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Card extends StoredMethod implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Card> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f90903a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Clause f90904b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Clause f90905c;
            public final Image d;
            public final boolean e;
            public final Clause f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final boolean f90906g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final boolean f90907h;
            public final String i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final CardDetailsScreenDescriptor$OutputData$CardData f90908j;
            public final CardholderVerificationStatus k;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    boolean z;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    Clause clause = (Clause) parcel.readParcelable(Card.class.getClassLoader());
                    Clause clause2 = (Clause) parcel.readParcelable(Card.class.getClassLoader());
                    Image image = (Image) parcel.readParcelable(Card.class.getClassLoader());
                    boolean z3 = true;
                    boolean z4 = parcel.readInt() != 0;
                    Clause clause3 = (Clause) parcel.readParcelable(Card.class.getClassLoader());
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = true;
                        z3 = false;
                    }
                    return new Card(string, clause, clause2, image, z4, clause3, z3, parcel.readInt() != 0 ? z : false, parcel.readString(), (CardDetailsScreenDescriptor$OutputData$CardData) parcel.readParcelable(Card.class.getClassLoader()), parcel.readInt() == 0 ? null : CardholderVerificationStatus.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Card[i];
                }
            }

            public Card(String id10, Clause title, Clause clause, Image logo, boolean z, Clause clause2, boolean z3, boolean z4, String str, CardDetailsScreenDescriptor$OutputData$CardData cardDetailsScreenDescriptor$OutputData$CardData, CardholderVerificationStatus cardholderVerificationStatus) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(logo, "logo");
                this.f90903a = id10;
                this.f90904b = title;
                this.f90905c = clause;
                this.d = logo;
                this.e = z;
                this.f = clause2;
                this.f90906g = z3;
                this.f90907h = z4;
                this.i = str;
                this.f90908j = cardDetailsScreenDescriptor$OutputData$CardData;
                this.k = cardholderVerificationStatus;
            }

            public static Card c(Card card, CardDetailsScreenDescriptor$OutputData$CardData cardDetailsScreenDescriptor$OutputData$CardData, CardholderVerificationStatus cardholderVerificationStatus, int i) {
                String id10 = card.f90903a;
                Clause title = card.f90904b;
                Clause clause = card.f90905c;
                Image logo = card.d;
                boolean z = card.e;
                Clause clause2 = card.f;
                boolean z3 = card.f90906g;
                boolean z4 = card.f90907h;
                String str = card.i;
                if ((i & 512) != 0) {
                    cardDetailsScreenDescriptor$OutputData$CardData = card.f90908j;
                }
                CardDetailsScreenDescriptor$OutputData$CardData cardDetailsScreenDescriptor$OutputData$CardData2 = cardDetailsScreenDescriptor$OutputData$CardData;
                if ((i & 1024) != 0) {
                    cardholderVerificationStatus = card.k;
                }
                card.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(logo, "logo");
                return new Card(id10, title, clause, logo, z, clause2, z3, z4, str, cardDetailsScreenDescriptor$OutputData$CardData2, cardholderVerificationStatus);
            }

            @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
            /* JADX INFO: renamed from: F, reason: from getter */
            public final Image getD() {
                return this.d;
            }

            @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
            /* JADX INFO: renamed from: a, reason: from getter */
            public final Clause getF() {
                return this.f;
            }

            @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod.StoredMethod
            /* JADX INFO: renamed from: b, reason: from getter */
            public final boolean getE() {
                return this.e;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Card)) {
                    return false;
                }
                Card card = (Card) obj2;
                return Intrinsics.f(this.f90903a, card.f90903a) && Intrinsics.f(this.f90904b, card.f90904b) && Intrinsics.f(this.f90905c, card.f90905c) && Intrinsics.f(this.d, card.d) && this.e == card.e && Intrinsics.f(this.f, card.f) && this.f90906g == card.f90906g && this.f90907h == card.f90907h && Intrinsics.f(this.i, card.i) && Intrinsics.f(this.f90908j, card.f90908j) && this.k == card.k;
            }

            @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
            /* JADX INFO: renamed from: getDescription, reason: from getter */
            public final Clause getF90905c() {
                return this.f90905c;
            }

            @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod.StoredMethod
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF90903a() {
                return this.f90903a;
            }

            @Override // com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod
            /* JADX INFO: renamed from: getTitle, reason: from getter */
            public final Clause getF90904b() {
                return this.f90904b;
            }

            public final int hashCode() {
                int iA = p.a.a(this.f90903a.hashCode() * 31, 31, this.f90904b);
                Clause clause = this.f90905c;
                int iC = j6.a.c(a10.b.c(this.d, (iA + (clause == null ? 0 : clause.hashCode())) * 31, 31), 31, this.e);
                Clause clause2 = this.f;
                int iC2 = j6.a.c(j6.a.c((iC + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31, this.f90906g), 31, this.f90907h);
                String str = this.i;
                int iHashCode = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
                CardDetailsScreenDescriptor$OutputData$CardData cardDetailsScreenDescriptor$OutputData$CardData = this.f90908j;
                int iHashCode2 = (iHashCode + (cardDetailsScreenDescriptor$OutputData$CardData == null ? 0 : cardDetailsScreenDescriptor$OutputData$CardData.hashCode())) * 31;
                CardholderVerificationStatus cardholderVerificationStatus = this.k;
                return iHashCode2 + (cardholderVerificationStatus != null ? cardholderVerificationStatus.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f90903a);
                dest.writeParcelable(this.f90904b, i);
                dest.writeParcelable(this.f90905c, i);
                dest.writeParcelable(this.d, i);
                dest.writeInt(this.e ? 1 : 0);
                dest.writeParcelable(this.f, i);
                dest.writeInt(this.f90906g ? 1 : 0);
                dest.writeInt(this.f90907h ? 1 : 0);
                dest.writeString(this.i);
                dest.writeParcelable(this.f90908j, i);
                CardholderVerificationStatus cardholderVerificationStatus = this.k;
                if (cardholderVerificationStatus == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(cardholderVerificationStatus.name());
                }
            }
        }

        private StoredMethod() {
        }

        /* JADX INFO: renamed from: b */
        public abstract boolean getE();

        /* JADX INFO: renamed from: getId */
        public abstract String getF90903a();
    }

    private SelectedMethod() {
    }

    /* JADX INFO: renamed from: F */
    public abstract Image getD();

    /* JADX INFO: renamed from: a */
    public abstract Clause getF();

    /* JADX INFO: renamed from: getDescription */
    public abstract Clause getF90905c();

    /* JADX INFO: renamed from: getTitle */
    public abstract Clause getF90904b();
}
