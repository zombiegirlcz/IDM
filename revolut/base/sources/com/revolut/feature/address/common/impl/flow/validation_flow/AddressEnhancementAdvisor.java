package com.revolut.feature.address.common.impl.flow.validation_flow;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
public final class AddressEnhancementAdvisor {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/address/common/impl/flow/validation_flow/AddressEnhancementAdvisor$AddressEnhancement;", "Landroid/os/Parcelable;", "", "JP_ROOM_NUMBER_NEEDED", "SG_FLOOR_NUMBER_NEEDED", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddressEnhancement implements Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AddressEnhancement[] $VALUES;

        @NotNull
        public static final Parcelable.Creator<AddressEnhancement> CREATOR;
        public static final AddressEnhancement JP_ROOM_NUMBER_NEEDED;
        public static final AddressEnhancement SG_FLOOR_NUMBER_NEEDED;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return AddressEnhancement.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddressEnhancement[i];
            }
        }

        static {
            AddressEnhancement addressEnhancement = new AddressEnhancement("JP_ROOM_NUMBER_NEEDED", 0);
            JP_ROOM_NUMBER_NEEDED = addressEnhancement;
            AddressEnhancement addressEnhancement2 = new AddressEnhancement("SG_FLOOR_NUMBER_NEEDED", 1);
            SG_FLOOR_NUMBER_NEEDED = addressEnhancement2;
            AddressEnhancement[] addressEnhancementArr = {addressEnhancement, addressEnhancement2};
            $VALUES = addressEnhancementArr;
            $ENTRIES = s.n(addressEnhancementArr);
            CREATOR = new a();
        }

        public static AddressEnhancement valueOf(String str) {
            return (AddressEnhancement) Enum.valueOf(AddressEnhancement.class, str);
        }

        public static AddressEnhancement[] values() {
            return (AddressEnhancement[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }
}
