package com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/document/models/ValidationViolation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ValidationViolation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ValidationViolation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jv3.a f67952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f67953c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ValidationViolation(parcel.readString(), jv3.a.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ValidationViolation[i];
        }
    }

    public ValidationViolation(String keyword, jv3.a matchType, String errorMessage) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        Intrinsics.checkNotNullParameter(matchType, "matchType");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f67951a = keyword;
        this.f67952b = matchType;
        this.f67953c = errorMessage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ValidationViolation)) {
            return false;
        }
        ValidationViolation validationViolation = (ValidationViolation) obj2;
        return Intrinsics.f(this.f67951a, validationViolation.f67951a) && this.f67952b == validationViolation.f67952b && Intrinsics.f(this.f67953c, validationViolation.f67953c);
    }

    public final int hashCode() {
        return this.f67953c.hashCode() + ((this.f67952b.hashCode() + (this.f67951a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f67951a);
        dest.writeString(this.f67952b.name());
        dest.writeString(this.f67953c);
    }
}
