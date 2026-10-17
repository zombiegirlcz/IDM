package com.revolut.feature_retail_user_declarations.identity_declarations;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowState;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IdentityDeclarationsFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<IdentityDeclarationsFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f97655a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readParcelable(IdentityDeclarationsFlowContract$State.class.getClassLoader()), parcel.readParcelable(IdentityDeclarationsFlowContract$State.class.getClassLoader()));
            }
            return new IdentityDeclarationsFlowContract$State(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IdentityDeclarationsFlowContract$State[i];
        }
    }

    public IdentityDeclarationsFlowContract$State() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof IdentityDeclarationsFlowContract$State) && Intrinsics.f(this.f97655a, ((IdentityDeclarationsFlowContract$State) obj2).f97655a);
    }

    public final int hashCode() {
        return this.f97655a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itZ = j6.a.z(this.f97655a, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeParcelable((Parcelable) entry.getKey(), i);
            dest.writeParcelable((Parcelable) entry.getValue(), i);
        }
    }

    public IdentityDeclarationsFlowContract$State(Map dataPointResults) {
        Intrinsics.checkNotNullParameter(dataPointResults, "dataPointResults");
        this.f97655a = dataPointResults;
    }

    public /* synthetic */ IdentityDeclarationsFlowContract$State(int i) {
        this(r0.g());
    }
}
