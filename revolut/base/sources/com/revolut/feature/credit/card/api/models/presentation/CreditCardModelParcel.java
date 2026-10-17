package com.revolut.feature.credit.card.api.models.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.card.api.navigation.deeplink.CreditCardDeeplink;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tl4.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardModelParcel;", "Landroid/os/Parcelable;", "DialogParcel", "DeeplinkParcel", "ContextualParcel", "CollapsingParcel", "Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardModelParcel$CollapsingParcel;", "Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardModelParcel$ContextualParcel;", "Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardModelParcel$DeeplinkParcel;", "Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardModelParcel$DialogParcel;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardModelParcel extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardModelParcel$CollapsingParcel;", "Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardModelParcel;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CollapsingParcel implements CreditCardModelParcel {

        @NotNull
        public static final Parcelable.Creator<CollapsingParcel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f68851a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CollapsingParcel(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CollapsingParcel[i];
            }
        }

        public CollapsingParcel(String str) {
            this.f68851a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CollapsingParcel) && Intrinsics.f(this.f68851a, ((CollapsingParcel) obj2).f68851a);
        }

        public final int hashCode() {
            String str = this.f68851a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68851a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardModelParcel$ContextualParcel;", "Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardModelParcel;", "Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardActionParcel;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ContextualParcel implements CreditCardModelParcel, CreditCardActionParcel {

        @NotNull
        public static final Parcelable.Creator<ContextualParcel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f68852a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ContextualParcel(b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ContextualParcel[i];
            }
        }

        public ContextualParcel(b value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f68852a = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ContextualParcel) && this.f68852a == ((ContextualParcel) obj2).f68852a;
        }

        public final int hashCode() {
            return this.f68852a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68852a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardModelParcel$DeeplinkParcel;", "Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardModelParcel;", "Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardActionParcel;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeeplinkParcel implements CreditCardModelParcel, CreditCardActionParcel {

        @NotNull
        public static final Parcelable.Creator<DeeplinkParcel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditCardDeeplink f68853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f68854b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeeplinkParcel((CreditCardDeeplink) parcel.readParcelable(DeeplinkParcel.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeeplinkParcel[i];
            }
        }

        public DeeplinkParcel(CreditCardDeeplink creditCardDeeplink, String rawDeeplink) {
            Intrinsics.checkNotNullParameter(rawDeeplink, "rawDeeplink");
            this.f68853a = creditCardDeeplink;
            this.f68854b = rawDeeplink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DeeplinkParcel)) {
                return false;
            }
            DeeplinkParcel deeplinkParcel = (DeeplinkParcel) obj2;
            return Intrinsics.f(this.f68853a, deeplinkParcel.f68853a) && Intrinsics.f(this.f68854b, deeplinkParcel.f68854b);
        }

        public final int hashCode() {
            CreditCardDeeplink creditCardDeeplink = this.f68853a;
            return this.f68854b.hashCode() + ((creditCardDeeplink == null ? 0 : creditCardDeeplink.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f68853a, i);
            dest.writeString(this.f68854b);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardModelParcel$DialogParcel;", "Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardModelParcel;", "Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardActionParcel;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DialogParcel implements CreditCardModelParcel, CreditCardActionParcel {

        @NotNull
        public static final Parcelable.Creator<DialogParcel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditCardDialogModel f68855a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DialogParcel(CreditCardDialogModel.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DialogParcel[i];
            }
        }

        public DialogParcel(CreditCardDialogModel dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            this.f68855a = dialog;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DialogParcel) && Intrinsics.f(this.f68855a, ((DialogParcel) obj2).f68855a);
        }

        public final int hashCode() {
            return this.f68855a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f68855a.writeToParcel(dest, i);
        }
    }
}
