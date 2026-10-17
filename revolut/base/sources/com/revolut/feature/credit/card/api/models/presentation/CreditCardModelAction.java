package com.revolut.feature.credit.card.api.models.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.card.api.navigation.deeplink.CreditCardDeeplink;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tl4.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardModelAction;", "Landroid/os/Parcelable;", "Deeplink", "Contextual", "Dialogue", "tl4/b", "Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardModelAction$Contextual;", "Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardModelAction$Deeplink;", "Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardModelAction$Dialogue;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardModelAction extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardModelAction$Contextual;", "Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardModelAction;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Contextual implements CreditCardModelAction {

        @NotNull
        public static final Parcelable.Creator<Contextual> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f68847a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Contextual(b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Contextual[i];
            }
        }

        public Contextual(b value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f68847a = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Contextual) && this.f68847a == ((Contextual) obj2).f68847a;
        }

        public final int hashCode() {
            return this.f68847a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68847a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardModelAction$Deeplink;", "Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardModelAction;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Deeplink implements CreditCardModelAction {

        @NotNull
        public static final Parcelable.Creator<Deeplink> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditCardDeeplink f68848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f68849b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Deeplink((CreditCardDeeplink) parcel.readParcelable(Deeplink.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Deeplink[i];
            }
        }

        public Deeplink(CreditCardDeeplink creditCardDeeplink, String rawDeeplink) {
            Intrinsics.checkNotNullParameter(rawDeeplink, "rawDeeplink");
            this.f68848a = creditCardDeeplink;
            this.f68849b = rawDeeplink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Deeplink)) {
                return false;
            }
            Deeplink deeplink = (Deeplink) obj2;
            return Intrinsics.f(this.f68848a, deeplink.f68848a) && Intrinsics.f(this.f68849b, deeplink.f68849b);
        }

        public final int hashCode() {
            CreditCardDeeplink creditCardDeeplink = this.f68848a;
            return this.f68849b.hashCode() + ((creditCardDeeplink == null ? 0 : creditCardDeeplink.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f68848a, i);
            dest.writeString(this.f68849b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardModelAction$Dialogue;", "Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardModelAction;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Dialogue implements CreditCardModelAction {

        @NotNull
        public static final Parcelable.Creator<Dialogue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditCardDialogModel f68850a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Dialogue(CreditCardDialogModel.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Dialogue[i];
            }
        }

        public Dialogue(CreditCardDialogModel dialogue) {
            Intrinsics.checkNotNullParameter(dialogue, "dialogue");
            this.f68850a = dialogue;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Dialogue) && Intrinsics.f(this.f68850a, ((Dialogue) obj2).f68850a);
        }

        public final int hashCode() {
            return this.f68850a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f68850a.writeToParcel(dest, i);
        }
    }
}
