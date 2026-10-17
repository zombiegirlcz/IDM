package com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowState;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/trading_onboarding/impl/ui/national_identifiers/kompot/flow/NationalIdentifiersFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NationalIdentifiersFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<NationalIdentifiersFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f104212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f104213b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC, 1);
                }
                arrayList = arrayList2;
            }
            int i2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                linkedHashMap.put(Integer.valueOf(parcel.readInt()), parcel.readSerializable());
            }
            return new NationalIdentifiersFlowContract$State(arrayList, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NationalIdentifiersFlowContract$State[i];
        }
    }

    public NationalIdentifiersFlowContract$State() {
        this(0);
    }

    public static NationalIdentifiersFlowContract$State a(NationalIdentifiersFlowContract$State nationalIdentifiersFlowContract$State, List list, Map documentValuesByPosition, int i) {
        if ((i & 1) != 0) {
            list = nationalIdentifiersFlowContract$State.f104212a;
        }
        if ((i & 2) != 0) {
            documentValuesByPosition = nationalIdentifiersFlowContract$State.f104213b;
        }
        nationalIdentifiersFlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(documentValuesByPosition, "documentValuesByPosition");
        return new NationalIdentifiersFlowContract$State(list, documentValuesByPosition);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NationalIdentifiersFlowContract$State)) {
            return false;
        }
        NationalIdentifiersFlowContract$State nationalIdentifiersFlowContract$State = (NationalIdentifiersFlowContract$State) obj2;
        return Intrinsics.f(this.f104212a, nationalIdentifiersFlowContract$State.f104212a) && Intrinsics.f(this.f104213b, nationalIdentifiersFlowContract$State.f104213b);
    }

    public final int hashCode() {
        List list = this.f104212a;
        return this.f104213b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List list = this.f104212a;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeSerializable((Serializable) itQ.next());
            }
        }
        Iterator itZ = j6.a.z(this.f104213b, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeInt(((Number) entry.getKey()).intValue());
            dest.writeSerializable((Serializable) entry.getValue());
        }
    }

    public NationalIdentifiersFlowContract$State(List list, Map documentValuesByPosition) {
        Intrinsics.checkNotNullParameter(documentValuesByPosition, "documentValuesByPosition");
        this.f104212a = list;
        this.f104213b = documentValuesByPosition;
    }

    public /* synthetic */ NationalIdentifiersFlowContract$State(int i) {
        this(null, r0.g());
    }
}
