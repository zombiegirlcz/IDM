package com.revolut.feature.credit.card.models.additional_cards;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yw4.l;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/card/models/additional_cards/AdditionalCardholdersState;", "Landroid/os/Parcelable;", "Available", "NotAvailable", "Lcom/revolut/feature/credit/card/models/additional_cards/AdditionalCardholdersState$Available;", "Lcom/revolut/feature/credit/card/models/additional_cards/AdditionalCardholdersState$NotAvailable;", "feature_credit_card_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AdditionalCardholdersState extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/models/additional_cards/AdditionalCardholdersState$Available;", "Lcom/revolut/feature/credit/card/models/additional_cards/AdditionalCardholdersState;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Available implements AdditionalCardholdersState {

        @NotNull
        public static final Parcelable.Creator<Available> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f69810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l f69811c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Available(parcel.readString(), parcel.readInt(), l.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Available[i];
            }
        }

        public Available(String facilityId, int i, l accessLevel) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(accessLevel, "accessLevel");
            this.f69809a = facilityId;
            this.f69810b = i;
            this.f69811c = accessLevel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Available)) {
                return false;
            }
            Available available = (Available) obj2;
            return Intrinsics.f(this.f69809a, available.f69809a) && this.f69810b == available.f69810b && this.f69811c == available.f69811c;
        }

        public final int hashCode() {
            return this.f69811c.hashCode() + j6.a.b(this.f69810b, this.f69809a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69809a);
            dest.writeInt(this.f69810b);
            dest.writeString(this.f69811c.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/models/additional_cards/AdditionalCardholdersState$NotAvailable;", "Lcom/revolut/feature/credit/card/models/additional_cards/AdditionalCardholdersState;", "<init>", "()V", "feature_credit_card_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NotAvailable implements AdditionalCardholdersState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotAvailable f69812a = new NotAvailable();

        @NotNull
        public static final Parcelable.Creator<NotAvailable> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NotAvailable.f69812a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotAvailable[i];
            }
        }

        private NotAvailable() {
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
}
