package com.revolut.feature.junior_allowance.impl.ui.flow.allowance;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf8.h;
import qua.p;
import zm3.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/junior_allowance/impl/ui/flow/allowance/JuniorAllowanceFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Allowance", "Lcom/revolut/feature/junior_allowance/impl/ui/flow/allowance/JuniorAllowanceFlowContract$Step$Allowance;", "feature_junior_allowance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class JuniorAllowanceFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_allowance/impl/ui/flow/allowance/JuniorAllowanceFlowContract$Step$Allowance;", "Lcom/revolut/feature/junior_allowance/impl/ui/flow/allowance/JuniorAllowanceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_allowance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Allowance extends JuniorAllowanceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Allowance> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f76826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p f76827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f76828c;
        public final h d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Allowance((l) parcel.readSerializable(), (p) parcel.readSerializable(), parcel.readString(), (h) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Allowance[i];
            }
        }

        public Allowance(l contact, p pVar, String str, h hVar) {
            Intrinsics.checkNotNullParameter(contact, "contact");
            this.f76826a = contact;
            this.f76827b = pVar;
            this.f76828c = str;
            this.d = hVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Allowance)) {
                return false;
            }
            Allowance allowance = (Allowance) obj2;
            return Intrinsics.f(this.f76826a, allowance.f76826a) && Intrinsics.f(this.f76827b, allowance.f76827b) && Intrinsics.f(this.f76828c, allowance.f76828c) && Intrinsics.f(this.d, allowance.d);
        }

        public final int hashCode() {
            int iHashCode = this.f76826a.hashCode() * 31;
            p pVar = this.f76827b;
            int iHashCode2 = (iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31;
            String str = this.f76828c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            h hVar = this.d;
            return iHashCode3 + (hVar != null ? hVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f76826a);
            dest.writeSerializable(this.f76827b);
            dest.writeString(this.f76828c);
            dest.writeSerializable(this.d);
        }
    }

    private JuniorAllowanceFlowContract$Step() {
    }
}
