package com.revolut.feature.junior_allowance.impl.ui.screen.list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/junior_allowance/impl/ui/screen/list/JuniorAllowancesListScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AllowancePager", "Lcom/revolut/feature/junior_allowance/impl/ui/screen/list/JuniorAllowancesListScreenContract$ModalStep$AllowancePager;", "feature_junior_allowance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorAllowancesListScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_allowance/impl/ui/screen/list/JuniorAllowancesListScreenContract$ModalStep$AllowancePager;", "Lcom/revolut/feature/junior_allowance/impl/ui/screen/list/JuniorAllowancesListScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_junior_allowance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AllowancePager implements JuniorAllowancesListScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AllowancePager> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f76844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f76845c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AllowancePager(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AllowancePager[i];
            }
        }

        public AllowancePager(String juniorId, String startingAllowanceId, String originatorRegisteredIdentityId) {
            Intrinsics.checkNotNullParameter(juniorId, "juniorId");
            Intrinsics.checkNotNullParameter(startingAllowanceId, "startingAllowanceId");
            Intrinsics.checkNotNullParameter(originatorRegisteredIdentityId, "originatorRegisteredIdentityId");
            this.f76843a = juniorId;
            this.f76844b = startingAllowanceId;
            this.f76845c = originatorRegisteredIdentityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AllowancePager)) {
                return false;
            }
            AllowancePager allowancePager = (AllowancePager) obj2;
            return Intrinsics.f(this.f76843a, allowancePager.f76843a) && Intrinsics.f(this.f76844b, allowancePager.f76844b) && Intrinsics.f(this.f76845c, allowancePager.f76845c);
        }

        public final int hashCode() {
            return this.f76845c.hashCode() + p.a.c(this.f76843a.hashCode() * 31, 31, this.f76844b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76843a);
            dest.writeString(this.f76844b);
            dest.writeString(this.f76845c);
        }
    }
}
