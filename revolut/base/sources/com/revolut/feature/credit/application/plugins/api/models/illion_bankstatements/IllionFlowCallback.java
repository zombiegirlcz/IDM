package com.revolut.feature.credit.application.plugins.api.models.illion_bankstatements;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/illion_bankstatements/IllionFlowCallback;", "Landroid/os/Parcelable;", "", "", "url", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "SUCCESS", "FAILURE", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IllionFlowCallback implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IllionFlowCallback[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<IllionFlowCallback> CREATOR;
    public static final IllionFlowCallback FAILURE;
    public static final IllionFlowCallback SUCCESS;

    @NotNull
    private final String url;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return IllionFlowCallback.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IllionFlowCallback[i];
        }
    }

    static {
        IllionFlowCallback illionFlowCallback = new IllionFlowCallback("SUCCESS", 0, "https://callback.revolut.com/success");
        SUCCESS = illionFlowCallback;
        IllionFlowCallback illionFlowCallback2 = new IllionFlowCallback("FAILURE", 1, "https://callback.revolut.com/failure");
        FAILURE = illionFlowCallback2;
        IllionFlowCallback[] illionFlowCallbackArr = {illionFlowCallback, illionFlowCallback2};
        $VALUES = illionFlowCallbackArr;
        $ENTRIES = s.n(illionFlowCallbackArr);
        CREATOR = new a();
    }

    public IllionFlowCallback(String str, int i, String str2) {
        this.url = str2;
    }

    public static IllionFlowCallback valueOf(String str) {
        return (IllionFlowCallback) Enum.valueOf(IllionFlowCallback.class, str);
    }

    public static IllionFlowCallback[] values() {
        return (IllionFlowCallback[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getUrl() {
        return this.url;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
