package com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.kompot.common.IOData$Input;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior/isa/impl/ui/jisa_add_phone_number/JuniorIsaAddPhoneNumberScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_junior_isa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorIsaAddPhoneNumberScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<JuniorIsaAddPhoneNumberScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76769c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorIsaAddPhoneNumberScreenContract$InputData(((RegisteredIdentityId) parcel.readParcelable(JuniorIsaAddPhoneNumberScreenContract$InputData.class.getClassLoader())).f74764a, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorIsaAddPhoneNumberScreenContract$InputData[i];
        }
    }

    public JuniorIsaAddPhoneNumberScreenContract$InputData(String juniorRegId, String juniorCountry, String juniorName, String str) {
        Intrinsics.checkNotNullParameter(juniorRegId, "juniorRegId");
        Intrinsics.checkNotNullParameter(juniorCountry, "juniorCountry");
        Intrinsics.checkNotNullParameter(juniorName, "juniorName");
        this.f76767a = juniorRegId;
        this.f76768b = juniorCountry;
        this.f76769c = juniorName;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorIsaAddPhoneNumberScreenContract$InputData)) {
            return false;
        }
        JuniorIsaAddPhoneNumberScreenContract$InputData juniorIsaAddPhoneNumberScreenContract$InputData = (JuniorIsaAddPhoneNumberScreenContract$InputData) obj2;
        return Intrinsics.f(this.f76767a, juniorIsaAddPhoneNumberScreenContract$InputData.f76767a) && Intrinsics.f(this.f76768b, juniorIsaAddPhoneNumberScreenContract$InputData.f76768b) && Intrinsics.f(this.f76769c, juniorIsaAddPhoneNumberScreenContract$InputData.f76769c) && Intrinsics.f(this.d, juniorIsaAddPhoneNumberScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f76767a.hashCode() * 31, 31, this.f76768b), 31, this.f76769c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        e.x(this.f76767a, dest, i);
        dest.writeString(this.f76768b);
        dest.writeString(this.f76769c);
        dest.writeString(this.d);
    }
}
