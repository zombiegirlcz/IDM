package com.revolut.feature.junior_settings.impl.ui_kompot.payments_settings_explanatory;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import po8.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_settings/impl/ui_kompot/payments_settings_explanatory/JuniorPaymentsSettingsExplanatoryControllerContract$Input", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorPaymentsSettingsExplanatoryControllerContract$Input implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<JuniorPaymentsSettingsExplanatoryControllerContract$Input> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f77308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77309c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorPaymentsSettingsExplanatoryControllerContract$Input(parcel.readString(), f.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorPaymentsSettingsExplanatoryControllerContract$Input[i];
        }
    }

    public JuniorPaymentsSettingsExplanatoryControllerContract$Input(String juniorId, f setting, String firstName, String username) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(setting, "setting");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(username, "username");
        this.f77307a = juniorId;
        this.f77308b = setting;
        this.f77309c = firstName;
        this.d = username;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorPaymentsSettingsExplanatoryControllerContract$Input)) {
            return false;
        }
        JuniorPaymentsSettingsExplanatoryControllerContract$Input juniorPaymentsSettingsExplanatoryControllerContract$Input = (JuniorPaymentsSettingsExplanatoryControllerContract$Input) obj2;
        return Intrinsics.f(this.f77307a, juniorPaymentsSettingsExplanatoryControllerContract$Input.f77307a) && this.f77308b == juniorPaymentsSettingsExplanatoryControllerContract$Input.f77308b && Intrinsics.f(this.f77309c, juniorPaymentsSettingsExplanatoryControllerContract$Input.f77309c) && Intrinsics.f(this.d, juniorPaymentsSettingsExplanatoryControllerContract$Input.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c((this.f77308b.hashCode() + (this.f77307a.hashCode() * 31)) * 31, 31, this.f77309c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77307a);
        dest.writeString(this.f77308b.name());
        dest.writeString(this.f77309c);
        dest.writeString(this.d);
    }
}
