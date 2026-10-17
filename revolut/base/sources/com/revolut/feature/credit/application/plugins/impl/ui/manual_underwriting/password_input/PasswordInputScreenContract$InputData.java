package com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.password_input;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.DocumentValidationConfig;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/password_input/PasswordInputScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PasswordInputScreenContract$InputData implements IOData$Input, Parcelable {

    @NotNull
    public static final Parcelable.Creator<PasswordInputScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f67964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DocumentValidationConfig f67965c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PasswordInputScreenContract$InputData(parcel.readString(), parcel.readString(), (DocumentValidationConfig) parcel.readParcelable(PasswordInputScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PasswordInputScreenContract$InputData[i];
        }
    }

    public PasswordInputScreenContract$InputData(String documentPath, String documentName, DocumentValidationConfig validationConfig) {
        Intrinsics.checkNotNullParameter(documentPath, "documentPath");
        Intrinsics.checkNotNullParameter(documentName, "documentName");
        Intrinsics.checkNotNullParameter(validationConfig, "validationConfig");
        this.f67963a = documentPath;
        this.f67964b = documentName;
        this.f67965c = validationConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PasswordInputScreenContract$InputData)) {
            return false;
        }
        PasswordInputScreenContract$InputData passwordInputScreenContract$InputData = (PasswordInputScreenContract$InputData) obj2;
        return Intrinsics.f(this.f67963a, passwordInputScreenContract$InputData.f67963a) && Intrinsics.f(this.f67964b, passwordInputScreenContract$InputData.f67964b) && Intrinsics.f(this.f67965c, passwordInputScreenContract$InputData.f67965c);
    }

    public final int hashCode() {
        return this.f67965c.hashCode() + p.a.c(this.f67963a.hashCode() * 31, 31, this.f67964b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f67963a);
        dest.writeString(this.f67964b);
        dest.writeParcelable(this.f67965c, i);
    }
}
