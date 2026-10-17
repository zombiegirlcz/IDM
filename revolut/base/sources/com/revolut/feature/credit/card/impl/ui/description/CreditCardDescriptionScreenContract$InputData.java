package com.revolut.feature.credit.card.impl.ui.description;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.card.api.navigation.CreditCardDescriptionDestination;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/card/impl/ui/description/CreditCardDescriptionScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Local", "Remote", "Lcom/revolut/feature/credit/card/impl/ui/description/CreditCardDescriptionScreenContract$InputData$Local;", "Lcom/revolut/feature/credit/card/impl/ui/description/CreditCardDescriptionScreenContract$InputData$Remote;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardDescriptionScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/description/CreditCardDescriptionScreenContract$InputData$Local;", "Lcom/revolut/feature/credit/card/impl/ui/description/CreditCardDescriptionScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Local implements CreditCardDescriptionScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Local> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditCardDescriptionDestination.DescriptionConfig.Local f69209a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Local((CreditCardDescriptionDestination.DescriptionConfig.Local) parcel.readParcelable(Local.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Local[i];
            }
        }

        public Local(CreditCardDescriptionDestination.DescriptionConfig.Local config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f69209a = config;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Local) && Intrinsics.f(this.f69209a, ((Local) obj2).f69209a);
        }

        public final int hashCode() {
            return this.f69209a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f69209a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/description/CreditCardDescriptionScreenContract$InputData$Remote;", "Lcom/revolut/feature/credit/card/impl/ui/description/CreditCardDescriptionScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Remote implements CreditCardDescriptionScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Remote> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final pl4.a f69210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final vm4.a f69211b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Remote(pl4.a.valueOf(parcel.readString()), (vm4.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Remote[i];
            }
        }

        public Remote(pl4.a type, vm4.a details) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(details, "details");
            this.f69210a = type;
            this.f69211b = details;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Remote)) {
                return false;
            }
            Remote remote = (Remote) obj2;
            return this.f69210a == remote.f69210a && Intrinsics.f(this.f69211b, remote.f69211b);
        }

        public final int hashCode() {
            return this.f69211b.hashCode() + (this.f69210a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69210a.name());
            dest.writeSerializable(this.f69211b);
        }
    }
}
