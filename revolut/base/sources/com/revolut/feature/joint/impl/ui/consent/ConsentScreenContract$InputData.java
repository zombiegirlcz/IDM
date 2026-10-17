package com.revolut.feature.joint.impl.ui.consent;

import android.os.Parcel;
import android.os.Parcelable;
import cci.g;
import com.revolut.feature.joint.impl.ui.invite_flow.models.InvitationType;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/joint/impl/ui/consent/ConsentScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConsentScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ConsentScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvitationType f76526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f76527b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            InvitationType invitationType = (InvitationType) j6.a.f(parcel, "parcel", ConsentScreenContract$InputData.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(g.valueOf(parcel.readString()));
            }
            return new ConsentScreenContract$InputData(invitationType, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ConsentScreenContract$InputData[i];
        }
    }

    public ConsentScreenContract$InputData(InvitationType invitationType, List selectedPurposes) {
        Intrinsics.checkNotNullParameter(invitationType, "invitationType");
        Intrinsics.checkNotNullParameter(selectedPurposes, "selectedPurposes");
        this.f76526a = invitationType;
        this.f76527b = selectedPurposes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ConsentScreenContract$InputData)) {
            return false;
        }
        ConsentScreenContract$InputData consentScreenContract$InputData = (ConsentScreenContract$InputData) obj2;
        return Intrinsics.f(this.f76526a, consentScreenContract$InputData.f76526a) && Intrinsics.f(this.f76527b, consentScreenContract$InputData.f76527b);
    }

    public final int hashCode() {
        return this.f76527b.hashCode() + (this.f76526a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f76526a, i);
        Iterator itV = p.a.v(this.f76527b, dest);
        while (itV.hasNext()) {
            dest.writeString(((g) itV.next()).name());
        }
    }
}
