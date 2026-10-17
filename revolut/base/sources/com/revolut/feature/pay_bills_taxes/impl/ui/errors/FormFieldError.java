package com.revolut.feature.pay_bills_taxes.impl.ui.errors;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui/errors/FormFieldError;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FormFieldError implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FormFieldError> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f78688c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FormFieldError(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FormFieldError[i];
        }
    }

    public FormFieldError(String code, String message, List path) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(path, "path");
        this.f78686a = code;
        this.f78687b = message;
        this.f78688c = path;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FormFieldError)) {
            return false;
        }
        FormFieldError formFieldError = (FormFieldError) obj2;
        return Intrinsics.f(this.f78686a, formFieldError.f78686a) && Intrinsics.f(this.f78687b, formFieldError.f78687b) && Intrinsics.f(this.f78688c, formFieldError.f78688c);
    }

    public final int hashCode() {
        return this.f78688c.hashCode() + p.a.c(this.f78686a.hashCode() * 31, 31, this.f78687b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78686a);
        dest.writeString(this.f78687b);
        dest.writeStringList(this.f78688c);
    }
}
