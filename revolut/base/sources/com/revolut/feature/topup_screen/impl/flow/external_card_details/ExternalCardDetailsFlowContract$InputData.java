package com.revolut.feature.topup_screen.impl.flow.external_card_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import com.revolut.kompot.common.IOData$Input;
import io3.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/topup_screen/impl/flow/external_card_details/ExternalCardDetailsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExternalCardDetailsFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ExternalCardDetailsFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f90602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f90603c;
    public final TopUpMethodsContext d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExternalCardDetailsFlowContract$InputData((TopUpMethodsContext) parcel.readParcelable(ExternalCardDetailsFlowContract$InputData.class.getClassLoader()), l.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExternalCardDetailsFlowContract$InputData[i];
        }
    }

    public ExternalCardDetailsFlowContract$InputData(TopUpMethodsContext topUpMethodsContext, l pocketType, String externalCardId, boolean z) {
        Intrinsics.checkNotNullParameter(externalCardId, "externalCardId");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        this.f90601a = externalCardId;
        this.f90602b = pocketType;
        this.f90603c = z;
        this.d = topUpMethodsContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExternalCardDetailsFlowContract$InputData)) {
            return false;
        }
        ExternalCardDetailsFlowContract$InputData externalCardDetailsFlowContract$InputData = (ExternalCardDetailsFlowContract$InputData) obj2;
        return Intrinsics.f(this.f90601a, externalCardDetailsFlowContract$InputData.f90601a) && this.f90602b == externalCardDetailsFlowContract$InputData.f90602b && this.f90603c == externalCardDetailsFlowContract$InputData.f90603c && Intrinsics.f(this.d, externalCardDetailsFlowContract$InputData.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(t61.a.c(this.f90602b, this.f90601a.hashCode() * 31, 31), 31, this.f90603c);
        TopUpMethodsContext topUpMethodsContext = this.d;
        return iC + (topUpMethodsContext == null ? 0 : topUpMethodsContext.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f90601a);
        dest.writeString(this.f90602b.name());
        dest.writeInt(this.f90603c ? 1 : 0);
        dest.writeParcelable(this.d, i);
    }
}
