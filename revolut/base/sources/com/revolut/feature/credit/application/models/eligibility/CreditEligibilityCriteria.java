package com.revolut.feature.credit.application.models.eligibility;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/models/eligibility/CreditEligibilityCriteria;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "es3/a", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditEligibilityCriteria implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditEligibilityCriteria> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final es3.a f66244c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditEligibilityCriteria(parcel.readString(), parcel.readString(), es3.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditEligibilityCriteria[i];
        }
    }

    public CreditEligibilityCriteria(String title, String description, es3.a icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f66242a = title;
        this.f66243b = description;
        this.f66244c = icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditEligibilityCriteria)) {
            return false;
        }
        CreditEligibilityCriteria creditEligibilityCriteria = (CreditEligibilityCriteria) obj2;
        return Intrinsics.f(this.f66242a, creditEligibilityCriteria.f66242a) && Intrinsics.f(this.f66243b, creditEligibilityCriteria.f66243b) && this.f66244c == creditEligibilityCriteria.f66244c;
    }

    public final int hashCode() {
        return this.f66244c.hashCode() + p.a.c(this.f66242a.hashCode() * 31, 31, this.f66243b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66242a);
        dest.writeString(this.f66243b);
        dest.writeString(this.f66244c.name());
    }
}
