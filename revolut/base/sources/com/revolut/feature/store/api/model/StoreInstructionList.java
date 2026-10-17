package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreInstructionList;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreInstructionList implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreInstructionList> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f88528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88529b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoreInstructionList(parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreInstructionList[i];
        }
    }

    public StoreInstructionList(List instructions, String str) {
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        this.f88528a = instructions;
        this.f88529b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreInstructionList)) {
            return false;
        }
        StoreInstructionList storeInstructionList = (StoreInstructionList) obj2;
        return Intrinsics.f(this.f88528a, storeInstructionList.f88528a) && Intrinsics.f(this.f88529b, storeInstructionList.f88529b);
    }

    public final int hashCode() {
        int iHashCode = this.f88528a.hashCode() * 31;
        String str = this.f88529b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringList(this.f88528a);
        dest.writeString(this.f88529b);
    }
}
