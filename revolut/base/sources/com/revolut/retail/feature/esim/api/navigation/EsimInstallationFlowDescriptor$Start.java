package com.revolut.retail.feature.esim.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/revolut/retail/feature/esim/api/navigation/EsimInstallationFlowDescriptor$Start", "Landroid/os/Parcelable;", "", "Lcom/revolut/retail/feature/esim/api/navigation/EsimInstallationFlowDescriptor$Start;", "InstallationPicker", "DirectInstallation", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimInstallationFlowDescriptor$Start implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EsimInstallationFlowDescriptor$Start[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<EsimInstallationFlowDescriptor$Start> CREATOR;
    public static final EsimInstallationFlowDescriptor$Start DirectInstallation;
    public static final EsimInstallationFlowDescriptor$Start InstallationPicker;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return EsimInstallationFlowDescriptor$Start.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimInstallationFlowDescriptor$Start[i];
        }
    }

    static {
        EsimInstallationFlowDescriptor$Start esimInstallationFlowDescriptor$Start = new EsimInstallationFlowDescriptor$Start("InstallationPicker", 0);
        InstallationPicker = esimInstallationFlowDescriptor$Start;
        EsimInstallationFlowDescriptor$Start esimInstallationFlowDescriptor$Start2 = new EsimInstallationFlowDescriptor$Start("DirectInstallation", 1);
        DirectInstallation = esimInstallationFlowDescriptor$Start2;
        EsimInstallationFlowDescriptor$Start[] esimInstallationFlowDescriptor$StartArr = {esimInstallationFlowDescriptor$Start, esimInstallationFlowDescriptor$Start2};
        $VALUES = esimInstallationFlowDescriptor$StartArr;
        $ENTRIES = s.n(esimInstallationFlowDescriptor$StartArr);
        CREATOR = new a();
    }

    public static EsimInstallationFlowDescriptor$Start valueOf(String str) {
        return (EsimInstallationFlowDescriptor$Start) Enum.valueOf(EsimInstallationFlowDescriptor$Start.class, str);
    }

    public static EsimInstallationFlowDescriptor$Start[] values() {
        return (EsimInstallationFlowDescriptor$Start[]) $VALUES.clone();
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
