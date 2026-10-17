package com.revolut.feature.transaction.troubleshooter.impl.ui.flow.screen.detail;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transaction.troubleshooter.api.domain.models.Troubleshooter;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transaction/troubleshooter/impl/ui/flow/screen/detail/TroubleshooterDetailScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_troubleshooter_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TroubleshooterDetailScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TroubleshooterDetailScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Troubleshooter f91885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91886c;
    public final mff.a d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TroubleshooterDetailScreenContract$InputData(parcel.readString(), (Troubleshooter) parcel.readParcelable(TroubleshooterDetailScreenContract$InputData.class.getClassLoader()), parcel.readString(), mff.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TroubleshooterDetailScreenContract$InputData[i];
        }
    }

    public TroubleshooterDetailScreenContract$InputData(String entityId, Troubleshooter troubleshooterModel, String str, mff.a troubleshooterEntityType) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(troubleshooterModel, "troubleshooterModel");
        Intrinsics.checkNotNullParameter(troubleshooterEntityType, "troubleshooterEntityType");
        this.f91884a = entityId;
        this.f91885b = troubleshooterModel;
        this.f91886c = str;
        this.d = troubleshooterEntityType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TroubleshooterDetailScreenContract$InputData)) {
            return false;
        }
        TroubleshooterDetailScreenContract$InputData troubleshooterDetailScreenContract$InputData = (TroubleshooterDetailScreenContract$InputData) obj2;
        return Intrinsics.f(this.f91884a, troubleshooterDetailScreenContract$InputData.f91884a) && Intrinsics.f(this.f91885b, troubleshooterDetailScreenContract$InputData.f91885b) && Intrinsics.f(this.f91886c, troubleshooterDetailScreenContract$InputData.f91886c) && this.d == troubleshooterDetailScreenContract$InputData.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f91885b.hashCode() + (this.f91884a.hashCode() * 31)) * 31;
        String str = this.f91886c;
        return this.d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91884a);
        dest.writeParcelable(this.f91885b, i);
        dest.writeString(this.f91886c);
        dest.writeString(this.d.name());
    }
}
