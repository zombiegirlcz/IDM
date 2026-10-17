package com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesDisclaimer;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/airportlounges/impl/ui/flows/pass_details/AirportLoungePassDetailsFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AirportLoungePassDetailsFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<AirportLoungePassDetailsFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f98986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f98988c;
    public final boolean d;
    public final AirportLoungesDisclaimer e;
    public final Set f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashSet linkedHashSet;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int iA = 0;
            boolean z = parcel.readInt() != 0;
            String string = parcel.readString();
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            AirportLoungesDisclaimer airportLoungesDisclaimer = (AirportLoungesDisclaimer) parcel.readParcelable(AirportLoungePassDetailsFlowContract$State.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i);
                while (iA != i) {
                    iA = o.a(parcel, linkedHashSet2, iA, 1);
                }
                linkedHashSet = linkedHashSet2;
            }
            return new AirportLoungePassDetailsFlowContract$State(z, string, z3, z4, airportLoungesDisclaimer, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AirportLoungePassDetailsFlowContract$State[i];
        }
    }

    public AirportLoungePassDetailsFlowContract$State(boolean z, String str, boolean z3, boolean z4, AirportLoungesDisclaimer airportLoungesDisclaimer, Set set) {
        this.f98986a = z;
        this.f98987b = str;
        this.f98988c = z3;
        this.d = z4;
        this.e = airportLoungesDisclaimer;
        this.f = set;
    }

    public static AirportLoungePassDetailsFlowContract$State a(AirportLoungePassDetailsFlowContract$State airportLoungePassDetailsFlowContract$State, boolean z, String str, AirportLoungesDisclaimer airportLoungesDisclaimer, Set set, int i) {
        if ((i & 1) != 0) {
            z = airportLoungePassDetailsFlowContract$State.f98986a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            str = airportLoungePassDetailsFlowContract$State.f98987b;
        }
        String str2 = str;
        boolean z4 = (i & 4) != 0 ? airportLoungePassDetailsFlowContract$State.f98988c : true;
        boolean z6 = (i & 8) != 0 ? airportLoungePassDetailsFlowContract$State.d : true;
        if ((i & 16) != 0) {
            airportLoungesDisclaimer = airportLoungePassDetailsFlowContract$State.e;
        }
        AirportLoungesDisclaimer airportLoungesDisclaimer2 = airportLoungesDisclaimer;
        if ((i & 32) != 0) {
            set = airportLoungePassDetailsFlowContract$State.f;
        }
        airportLoungePassDetailsFlowContract$State.getClass();
        return new AirportLoungePassDetailsFlowContract$State(z3, str2, z4, z6, airportLoungesDisclaimer2, set);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AirportLoungePassDetailsFlowContract$State)) {
            return false;
        }
        AirportLoungePassDetailsFlowContract$State airportLoungePassDetailsFlowContract$State = (AirportLoungePassDetailsFlowContract$State) obj2;
        return this.f98986a == airportLoungePassDetailsFlowContract$State.f98986a && Intrinsics.f(this.f98987b, airportLoungePassDetailsFlowContract$State.f98987b) && this.f98988c == airportLoungePassDetailsFlowContract$State.f98988c && this.d == airportLoungePassDetailsFlowContract$State.d && Intrinsics.f(this.e, airportLoungePassDetailsFlowContract$State.e) && Intrinsics.f(this.f, airportLoungePassDetailsFlowContract$State.f);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f98986a) * 31;
        String str = this.f98987b;
        int iC = j6.a.c(j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f98988c), 31, this.d);
        AirportLoungesDisclaimer airportLoungesDisclaimer = this.e;
        int iHashCode2 = (iC + (airportLoungesDisclaimer == null ? 0 : airportLoungesDisclaimer.hashCode())) * 31;
        Set set = this.f;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f98986a ? 1 : 0);
        dest.writeString(this.f98987b);
        dest.writeInt(this.f98988c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeParcelable(this.e, i);
        Set set = this.f;
        if (set == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = kii.e.q(dest, 1, set);
        while (itQ.hasNext()) {
            dest.writeString((String) itQ.next());
        }
    }
}
