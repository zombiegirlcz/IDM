package com.revolut.feature.junior_allowance.impl.ui.screen.allowance_pager;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_allowance/impl/ui/screen/allowance_pager/JuniorAllowancePagerScreenContract$Input", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_junior_allowance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorAllowancePagerScreenContract$Input implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<JuniorAllowancePagerScreenContract$Input> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76841c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorAllowancePagerScreenContract$Input(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorAllowancePagerScreenContract$Input[i];
        }
    }

    public JuniorAllowancePagerScreenContract$Input(String juniorId, String startingAllowanceId, String originatorRegisteredIdentityId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(startingAllowanceId, "startingAllowanceId");
        Intrinsics.checkNotNullParameter(originatorRegisteredIdentityId, "originatorRegisteredIdentityId");
        this.f76839a = juniorId;
        this.f76840b = startingAllowanceId;
        this.f76841c = originatorRegisteredIdentityId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorAllowancePagerScreenContract$Input)) {
            return false;
        }
        JuniorAllowancePagerScreenContract$Input juniorAllowancePagerScreenContract$Input = (JuniorAllowancePagerScreenContract$Input) obj2;
        return Intrinsics.f(this.f76839a, juniorAllowancePagerScreenContract$Input.f76839a) && Intrinsics.f(this.f76840b, juniorAllowancePagerScreenContract$Input.f76840b) && Intrinsics.f(this.f76841c, juniorAllowancePagerScreenContract$Input.f76841c);
    }

    public final int hashCode() {
        return this.f76841c.hashCode() + p.a.c(this.f76839a.hashCode() * 31, 31, this.f76840b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76839a);
        dest.writeString(this.f76840b);
        dest.writeString(this.f76841c);
    }
}
