package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signing_methods_info;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yy3.s;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/mortgage_signature/signing_methods_info/SigningMethodsInfoScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SigningMethodsInfoScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SigningMethodsInfoScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f68051a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SigningMethodsInfoScreenContract$InputData((s) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SigningMethodsInfoScreenContract$InputData[i];
        }
    }

    public SigningMethodsInfoScreenContract$InputData(s configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f68051a = configuration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof SigningMethodsInfoScreenContract$InputData) && Intrinsics.f(this.f68051a, ((SigningMethodsInfoScreenContract$InputData) obj2).f68051a);
    }

    public final int hashCode() {
        return this.f68051a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f68051a);
    }
}
