package com.revolut.feature.rfi_tool.impl.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rfi_tool.impl.domain.model.Content;
import com.revolut.feature.rfi_tool.impl.domain.model.EndDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/rfi_tool/impl/navigation/RfiToolFlowContract$RfiToolFlowState", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rfi_tool_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RfiToolFlowContract$RfiToolFlowState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RfiToolFlowContract$RfiToolFlowState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f85009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EndDialog f85010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f85011c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Content.CREATOR, parcel, arrayList, iA, 1);
            }
            return new RfiToolFlowContract$RfiToolFlowState(arrayList, parcel.readInt() == 0 ? null : EndDialog.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RfiToolFlowContract$RfiToolFlowState[i];
        }
    }

    public RfiToolFlowContract$RfiToolFlowState() {
        this(0);
    }

    public static RfiToolFlowContract$RfiToolFlowState a(RfiToolFlowContract$RfiToolFlowState rfiToolFlowContract$RfiToolFlowState, List pendingContents) {
        EndDialog endDialog = rfiToolFlowContract$RfiToolFlowState.f85010b;
        boolean z = rfiToolFlowContract$RfiToolFlowState.f85011c;
        rfiToolFlowContract$RfiToolFlowState.getClass();
        Intrinsics.checkNotNullParameter(pendingContents, "pendingContents");
        return new RfiToolFlowContract$RfiToolFlowState(pendingContents, endDialog, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RfiToolFlowContract$RfiToolFlowState)) {
            return false;
        }
        RfiToolFlowContract$RfiToolFlowState rfiToolFlowContract$RfiToolFlowState = (RfiToolFlowContract$RfiToolFlowState) obj2;
        return Intrinsics.f(this.f85009a, rfiToolFlowContract$RfiToolFlowState.f85009a) && Intrinsics.f(this.f85010b, rfiToolFlowContract$RfiToolFlowState.f85010b) && this.f85011c == rfiToolFlowContract$RfiToolFlowState.f85011c;
    }

    public final int hashCode() {
        int iHashCode = this.f85009a.hashCode() * 31;
        EndDialog endDialog = this.f85010b;
        return Boolean.hashCode(this.f85011c) + ((iHashCode + (endDialog == null ? 0 : endDialog.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f85009a, dest);
        while (itV.hasNext()) {
            ((Content) itV.next()).writeToParcel(dest, i);
        }
        EndDialog endDialog = this.f85010b;
        if (endDialog == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            endDialog.writeToParcel(dest, i);
        }
        dest.writeInt(this.f85011c ? 1 : 0);
    }

    public RfiToolFlowContract$RfiToolFlowState(List pendingContents, EndDialog endDialog, boolean z) {
        Intrinsics.checkNotNullParameter(pendingContents, "pendingContents");
        this.f85009a = pendingContents;
        this.f85010b = endDialog;
        this.f85011c = z;
    }

    public RfiToolFlowContract$RfiToolFlowState(int i) {
        this(f0.f322471a, null, false);
    }
}
