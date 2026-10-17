package com.revolut.feature.apm.core.models.payments_authorisations;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/InitiationFlow;", "Landroid/os/Parcelable;", "", "INTENT", "COLLECT", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InitiationFlow implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InitiationFlow[] $VALUES;
    public static final InitiationFlow COLLECT;

    @NotNull
    public static final Parcelable.Creator<InitiationFlow> CREATOR;
    public static final InitiationFlow INTENT;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return InitiationFlow.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InitiationFlow[i];
        }
    }

    static {
        InitiationFlow initiationFlow = new InitiationFlow("INTENT", 0);
        INTENT = initiationFlow;
        InitiationFlow initiationFlow2 = new InitiationFlow("COLLECT", 1);
        COLLECT = initiationFlow2;
        InitiationFlow[] initiationFlowArr = {initiationFlow, initiationFlow2};
        $VALUES = initiationFlowArr;
        $ENTRIES = s.n(initiationFlowArr);
        CREATOR = new a();
    }

    public static InitiationFlow valueOf(String str) {
        return (InitiationFlow) Enum.valueOf(InitiationFlow.class, str);
    }

    public static InitiationFlow[] values() {
        return (InitiationFlow[]) $VALUES.clone();
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
