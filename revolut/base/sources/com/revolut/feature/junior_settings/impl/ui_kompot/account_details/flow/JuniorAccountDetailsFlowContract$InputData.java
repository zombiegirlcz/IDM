package com.revolut.feature.junior_settings.impl.ui_kompot.account_details.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.kompot.common.IOData$Input;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_settings/impl/ui_kompot/account_details/flow/JuniorAccountDetailsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorAccountDetailsFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<JuniorAccountDetailsFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77267a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorAccountDetailsFlowContract$InputData(((RegisteredIdentityId) parcel.readParcelable(JuniorAccountDetailsFlowContract$InputData.class.getClassLoader())).f74764a);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorAccountDetailsFlowContract$InputData[i];
        }
    }

    public JuniorAccountDetailsFlowContract$InputData(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f77267a = juniorId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof JuniorAccountDetailsFlowContract$InputData) && Intrinsics.f(this.f77267a, ((JuniorAccountDetailsFlowContract$InputData) obj2).f77267a);
    }

    public final int hashCode() {
        return this.f77267a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        e.x(this.f77267a, dest, i);
    }
}
