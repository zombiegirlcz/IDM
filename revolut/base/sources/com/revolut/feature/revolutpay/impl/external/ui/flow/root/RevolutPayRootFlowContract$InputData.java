package com.revolut.feature.revolutpay.impl.external.ui.flow.root;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/revolut/feature/revolutpay/impl/external/ui/flow/root/RevolutPayRootFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevolutPayRootFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RevolutPayRootFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f84465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84467c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevolutPayRootFlowContract$InputData((Intent) parcel.readParcelable(RevolutPayRootFlowContract$InputData.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutPayRootFlowContract$InputData[i];
        }
    }

    public RevolutPayRootFlowContract$InputData(Intent intent, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f84465a = intent;
        this.f84466b = str;
        this.f84467c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f84465a, i);
        dest.writeString(this.f84466b);
        dest.writeString(this.f84467c);
        dest.writeString(this.d);
    }
}
