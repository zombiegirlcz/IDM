package com.revolut.feature.credit.application.plugins.api.models.esign;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.confirmation_code.data.OtpTask;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/esign/ESignTask;", "Lcom/revolut/feature/confirmation_code/data/OtpTask;", "", "INSTANCE", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ESignTask implements OtpTask {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ESignTask[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<ESignTask> CREATOR;
    public static final ESignTask INSTANCE;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return ESignTask.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ESignTask[i];
        }
    }

    static {
        ESignTask eSignTask = new ESignTask("INSTANCE", 0);
        INSTANCE = eSignTask;
        ESignTask[] eSignTaskArr = {eSignTask};
        $VALUES = eSignTaskArr;
        $ENTRIES = s.n(eSignTaskArr);
        CREATOR = new a();
    }

    public static ESignTask valueOf(String str) {
        return (ESignTask) Enum.valueOf(ESignTask.class, str);
    }

    public static ESignTask[] values() {
        return (ESignTask[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.revolut.feature.confirmation_code.data.OtpTask
    /* JADX INFO: renamed from: getTaskId */
    public final String getF78555a() {
        throw new IllegalStateException("Task id is not used for credit application flow");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
