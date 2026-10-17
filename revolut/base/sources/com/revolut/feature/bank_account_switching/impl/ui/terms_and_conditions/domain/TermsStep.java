package com.revolut.feature.bank_account_switching.impl.ui.terms_and_conditions.domain;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/terms_and_conditions/domain/TermsStep;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TermsStep implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TermsStep> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f64078c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TermsStep(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TermsStep[i];
        }
    }

    public TermsStep(String title, String str, List scopes) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        this.f64076a = title;
        this.f64077b = str;
        this.f64078c = scopes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TermsStep)) {
            return false;
        }
        TermsStep termsStep = (TermsStep) obj2;
        return Intrinsics.f(this.f64076a, termsStep.f64076a) && Intrinsics.f(this.f64077b, termsStep.f64077b) && Intrinsics.f(this.f64078c, termsStep.f64078c);
    }

    public final int hashCode() {
        int iHashCode = this.f64076a.hashCode() * 31;
        String str = this.f64077b;
        return this.f64078c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f64076a);
        dest.writeString(this.f64077b);
        dest.writeStringList(this.f64078c);
    }
}
