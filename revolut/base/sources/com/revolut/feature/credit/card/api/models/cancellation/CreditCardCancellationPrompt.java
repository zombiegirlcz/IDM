package com.revolut.feature.credit.card.api.models.cancellation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardLargeButtonModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/cancellation/CreditCardCancellationPrompt;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardCancellationPrompt implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardCancellationPrompt> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f68712c;
    public final CreditCardLargeButtonModel d;
    public final CreditCardLargeButtonModel e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Parcelable.Creator<CreditCardLargeButtonModel> creator = CreditCardLargeButtonModel.CREATOR;
            return new CreditCardCancellationPrompt(string, string2, string3, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardCancellationPrompt[i];
        }
    }

    public CreditCardCancellationPrompt(String title, String subtitle, String icon, CreditCardLargeButtonModel confirmAction, CreditCardLargeButtonModel cancelAction) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(confirmAction, "confirmAction");
        Intrinsics.checkNotNullParameter(cancelAction, "cancelAction");
        this.f68710a = title;
        this.f68711b = subtitle;
        this.f68712c = icon;
        this.d = confirmAction;
        this.e = cancelAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardCancellationPrompt)) {
            return false;
        }
        CreditCardCancellationPrompt creditCardCancellationPrompt = (CreditCardCancellationPrompt) obj2;
        return Intrinsics.f(this.f68710a, creditCardCancellationPrompt.f68710a) && Intrinsics.f(this.f68711b, creditCardCancellationPrompt.f68711b) && Intrinsics.f(this.f68712c, creditCardCancellationPrompt.f68712c) && Intrinsics.f(this.d, creditCardCancellationPrompt.d) && Intrinsics.f(this.e, creditCardCancellationPrompt.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + p.a.c(p.a.c(this.f68710a.hashCode() * 31, 31, this.f68711b), 31, this.f68712c)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68710a);
        dest.writeString(this.f68711b);
        dest.writeString(this.f68712c);
        this.d.writeToParcel(dest, i);
        this.e.writeToParcel(dest, i);
    }
}
