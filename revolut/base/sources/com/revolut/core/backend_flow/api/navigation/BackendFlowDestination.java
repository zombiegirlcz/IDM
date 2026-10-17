package com.revolut.core.backend_flow.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/backend_flow/api/navigation/BackendFlowDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/core/backend_flow/api/navigation/BackendFlowInput;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BackendFlowDestination extends InternalDestination<BackendFlowInput<?>> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<BackendFlowDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BackendFlowInput f51217b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BackendFlowDestination(BackendFlowInput.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BackendFlowDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackendFlowDestination(BackendFlowInput inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f51217b = inputData;
    }

    @Override // com.revolut.kompot.common.InternalDestination
    /* JADX INFO: renamed from: b */
    public final IOData$Input getF80510b() {
        return this.f51217b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BackendFlowInput getF51217b() {
        return this.f51217b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof BackendFlowDestination) && Intrinsics.f(this.f51217b, ((BackendFlowDestination) obj2).f51217b);
    }

    public final int hashCode() {
        return this.f51217b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f51217b.writeToParcel(dest, i);
    }
}
