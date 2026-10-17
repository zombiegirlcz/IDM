package com.revolut.feature.pay_bills_taxes.impl.ui.errors;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui/errors/FormServerError;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FormServerError implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FormServerError> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f78691c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            String string = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iA = 0;
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(FormFieldError.CREATOR, parcel, arrayList, iA, 1);
            }
            return new FormServerError(i, string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FormServerError[i];
        }
    }

    public FormServerError(int i, String str, ArrayList errors) {
        Intrinsics.checkNotNullParameter(errors, "errors");
        this.f78689a = i;
        this.f78690b = str;
        this.f78691c = errors;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FormServerError)) {
            return false;
        }
        FormServerError formServerError = (FormServerError) obj2;
        return this.f78689a == formServerError.f78689a && Intrinsics.f(this.f78690b, formServerError.f78690b) && this.f78691c.equals(formServerError.f78691c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f78689a) * 31;
        String str = this.f78690b;
        return this.f78691c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f78689a);
        dest.writeString(this.f78690b);
        Iterator itY = j6.a.y(this.f78691c, dest);
        while (itY.hasNext()) {
            ((FormFieldError) itY.next()).writeToParcel(dest, i);
        }
    }
}
