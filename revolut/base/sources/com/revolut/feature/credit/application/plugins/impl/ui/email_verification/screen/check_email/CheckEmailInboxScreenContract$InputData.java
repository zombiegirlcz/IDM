package com.revolut.feature.credit.application.plugins.impl.ui.email_verification.screen.check_email;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/email_verification/screen/check_email/CheckEmailInboxScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CheckEmailInboxScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CheckEmailInboxScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditApplicationPluginFlowContract$Configuration f67638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f67639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f67640c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CheckEmailInboxScreenContract$InputData((CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(CheckEmailInboxScreenContract$InputData.class.getClassLoader()), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CheckEmailInboxScreenContract$InputData[i];
        }
    }

    public CheckEmailInboxScreenContract$InputData(CreditApplicationPluginFlowContract$Configuration pluginConfig, long j2, String email) {
        Intrinsics.checkNotNullParameter(pluginConfig, "pluginConfig");
        Intrinsics.checkNotNullParameter(email, "email");
        this.f67638a = pluginConfig;
        this.f67639b = j2;
        this.f67640c = email;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CheckEmailInboxScreenContract$InputData)) {
            return false;
        }
        CheckEmailInboxScreenContract$InputData checkEmailInboxScreenContract$InputData = (CheckEmailInboxScreenContract$InputData) obj2;
        return Intrinsics.f(this.f67638a, checkEmailInboxScreenContract$InputData.f67638a) && this.f67639b == checkEmailInboxScreenContract$InputData.f67639b && Intrinsics.f(this.f67640c, checkEmailInboxScreenContract$InputData.f67640c);
    }

    public final int hashCode() {
        return this.f67640c.hashCode() + d.c(this.f67638a.hashCode() * 31, 31, this.f67639b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f67638a, i);
        dest.writeLong(this.f67639b);
        dest.writeString(this.f67640c);
    }
}
