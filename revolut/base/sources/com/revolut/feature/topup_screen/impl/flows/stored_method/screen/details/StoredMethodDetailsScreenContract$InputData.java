package com.revolut.feature.topup_screen.impl.flows.stored_method.screen.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import com.revolut.kompot.common.IOData$Input;
import io3.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yte.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/topup_screen/impl/flows/stored_method/screen/details/StoredMethodDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoredMethodDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<StoredMethodDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f90819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f90820c;
    public final TopUpMethodsContext d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoredMethodDetailsScreenContract$InputData(parcel.readString(), parcel.readInt() == 0 ? null : m.valueOf(parcel.readString()), l.valueOf(parcel.readString()), (TopUpMethodsContext) parcel.readParcelable(StoredMethodDetailsScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoredMethodDetailsScreenContract$InputData[i];
        }
    }

    public StoredMethodDetailsScreenContract$InputData(String storedMethodAccountId, m mVar, l pocketType, TopUpMethodsContext topUpMethodsContext) {
        Intrinsics.checkNotNullParameter(storedMethodAccountId, "storedMethodAccountId");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        this.f90818a = storedMethodAccountId;
        this.f90819b = mVar;
        this.f90820c = pocketType;
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
        if (!(obj2 instanceof StoredMethodDetailsScreenContract$InputData)) {
            return false;
        }
        StoredMethodDetailsScreenContract$InputData storedMethodDetailsScreenContract$InputData = (StoredMethodDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f90818a, storedMethodDetailsScreenContract$InputData.f90818a) && this.f90819b == storedMethodDetailsScreenContract$InputData.f90819b && this.f90820c == storedMethodDetailsScreenContract$InputData.f90820c && Intrinsics.f(this.d, storedMethodDetailsScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = this.f90818a.hashCode() * 31;
        m mVar = this.f90819b;
        int iC = t61.a.c(this.f90820c, (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31, 31);
        TopUpMethodsContext topUpMethodsContext = this.d;
        return iC + (topUpMethodsContext != null ? topUpMethodsContext.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f90818a);
        m mVar = this.f90819b;
        if (mVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(mVar.name());
        }
        dest.writeString(this.f90820c.name());
        dest.writeParcelable(this.d, i);
    }
}
