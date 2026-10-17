package com.revolut.feature.topup_screen.api.descriptor;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ste.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/topup_screen/api/descriptor/EditStoredMethodLabelDescriptor$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EditStoredMethodLabelDescriptor$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EditStoredMethodLabelDescriptor$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f90492c;
    public final TopUpMethodsContext d;
    public final d e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EditStoredMethodLabelDescriptor$InputData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TopUpMethodsContext.CREATOR.createFromParcel(parcel), d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EditStoredMethodLabelDescriptor$InputData[i];
        }
    }

    public EditStoredMethodLabelDescriptor$InputData(String accountDetailsId, String originalAccountName, String customLabel, TopUpMethodsContext topUpMethodsContext, d flowRegion) {
        Intrinsics.checkNotNullParameter(accountDetailsId, "accountDetailsId");
        Intrinsics.checkNotNullParameter(originalAccountName, "originalAccountName");
        Intrinsics.checkNotNullParameter(customLabel, "customLabel");
        Intrinsics.checkNotNullParameter(flowRegion, "flowRegion");
        this.f90490a = accountDetailsId;
        this.f90491b = originalAccountName;
        this.f90492c = customLabel;
        this.d = topUpMethodsContext;
        this.e = flowRegion;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EditStoredMethodLabelDescriptor$InputData)) {
            return false;
        }
        EditStoredMethodLabelDescriptor$InputData editStoredMethodLabelDescriptor$InputData = (EditStoredMethodLabelDescriptor$InputData) obj2;
        return Intrinsics.f(this.f90490a, editStoredMethodLabelDescriptor$InputData.f90490a) && Intrinsics.f(this.f90491b, editStoredMethodLabelDescriptor$InputData.f90491b) && Intrinsics.f(this.f90492c, editStoredMethodLabelDescriptor$InputData.f90492c) && Intrinsics.f(this.d, editStoredMethodLabelDescriptor$InputData.d) && this.e == editStoredMethodLabelDescriptor$InputData.e;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f90490a.hashCode() * 31, 31, this.f90491b), 31, this.f90492c);
        TopUpMethodsContext topUpMethodsContext = this.d;
        return this.e.hashCode() + ((iC + (topUpMethodsContext == null ? 0 : topUpMethodsContext.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f90490a);
        dest.writeString(this.f90491b);
        dest.writeString(this.f90492c);
        TopUpMethodsContext topUpMethodsContext = this.d;
        if (topUpMethodsContext == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            topUpMethodsContext.writeToParcel(dest, i);
        }
        dest.writeString(this.e.name());
    }
}
