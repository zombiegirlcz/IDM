package com.revolut.feature.contacts.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import el3.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/contacts/api/navigation/BlockUserBottomSheetInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "el3/e", "retail_feature_contacts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BlockUserBottomSheetInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BlockUserBottomSheetInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.a f65980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f65981b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BlockUserBottomSheetInputData((zm3.a) parcel.readSerializable(), e.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlockUserBottomSheetInputData[i];
        }
    }

    public BlockUserBottomSheetInputData(zm3.a contact, e mode) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f65980a = contact;
        this.f65981b = mode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BlockUserBottomSheetInputData)) {
            return false;
        }
        BlockUserBottomSheetInputData blockUserBottomSheetInputData = (BlockUserBottomSheetInputData) obj2;
        return Intrinsics.f(this.f65980a, blockUserBottomSheetInputData.f65980a) && this.f65981b == blockUserBottomSheetInputData.f65981b;
    }

    public final int hashCode() {
        return this.f65981b.hashCode() + (this.f65980a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f65980a);
        dest.writeString(this.f65981b.name());
    }
}
