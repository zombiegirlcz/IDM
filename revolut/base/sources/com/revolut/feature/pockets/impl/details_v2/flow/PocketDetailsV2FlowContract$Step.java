package com.revolut.feature.pockets.impl.details_v2.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pockets.api.navigation.PocketDetailsInitialAction;
import com.revolut.feature.pockets.impl.details_v2.domain.PocketDetailsBottomButtonAction;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.core.navigation.NaviCommand;
import h30.l;
import io3.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/pockets/impl/details_v2/flow/PocketDetailsV2FlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "LinkedAccountDetailsStep", "OpenPocketDetailsStep", "Lcom/revolut/feature/pockets/impl/details_v2/flow/PocketDetailsV2FlowContract$Step$LinkedAccountDetailsStep;", "Lcom/revolut/feature/pockets/impl/details_v2/flow/PocketDetailsV2FlowContract$Step$OpenPocketDetailsStep;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PocketDetailsV2FlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pockets/impl/details_v2/flow/PocketDetailsV2FlowContract$Step$LinkedAccountDetailsStep;", "Lcom/revolut/feature/pockets/impl/details_v2/flow/PocketDetailsV2FlowContract$Step;", "<init>", "()V", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LinkedAccountDetailsStep implements PocketDetailsV2FlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LinkedAccountDetailsStep f80803a = new LinkedAccountDetailsStep();

        @NotNull
        public static final Parcelable.Creator<LinkedAccountDetailsStep> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LinkedAccountDetailsStep.f80803a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkedAccountDetailsStep[i];
            }
        }

        private LinkedAccountDetailsStep() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pockets/impl/details_v2/flow/PocketDetailsV2FlowContract$Step$OpenPocketDetailsStep;", "Lcom/revolut/feature/pockets/impl/details_v2/flow/PocketDetailsV2FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenPocketDetailsStep implements PocketDetailsV2FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OpenPocketDetailsStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f80804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AccountId f80805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f80806c;
        public final boolean d;
        public final wi0.b e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f80807g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final PocketDetailsBottomButtonAction f80808h;
        public final NaviCommand i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final PocketDetailsInitialAction f80809j;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                d dVar = (d) parcel.readSerializable();
                AccountId accountId = (AccountId) parcel.readParcelable(OpenPocketDetailsStep.class.getClassLoader());
                boolean z4 = false;
                boolean z6 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                } else {
                    z = false;
                }
                wi0.b bVar = (wi0.b) parcel.readSerializable();
                if (parcel.readInt() != 0) {
                    z3 = z;
                    z = true;
                } else {
                    z3 = z;
                }
                return new OpenPocketDetailsStep(dVar, accountId, z6, z4, bVar, z, parcel.readInt() == 0 ? z3 : true, (PocketDetailsBottomButtonAction) parcel.readParcelable(OpenPocketDetailsStep.class.getClassLoader()), (NaviCommand) parcel.readParcelable(OpenPocketDetailsStep.class.getClassLoader()), (PocketDetailsInitialAction) parcel.readParcelable(OpenPocketDetailsStep.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenPocketDetailsStep[i];
            }
        }

        public OpenPocketDetailsStep(d pocket, AccountId accountId, boolean z, boolean z3, wi0.b bVar, boolean z4, boolean z6, PocketDetailsBottomButtonAction pocketDetailsBottomButtonAction, NaviCommand naviCommand, PocketDetailsInitialAction pocketDetailsInitialAction) {
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f80804a = pocket;
            this.f80805b = accountId;
            this.f80806c = z;
            this.d = z3;
            this.e = bVar;
            this.f = z4;
            this.f80807g = z6;
            this.f80808h = pocketDetailsBottomButtonAction;
            this.i = naviCommand;
            this.f80809j = pocketDetailsInitialAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OpenPocketDetailsStep)) {
                return false;
            }
            OpenPocketDetailsStep openPocketDetailsStep = (OpenPocketDetailsStep) obj2;
            return Intrinsics.f(this.f80804a, openPocketDetailsStep.f80804a) && Intrinsics.f(this.f80805b, openPocketDetailsStep.f80805b) && this.f80806c == openPocketDetailsStep.f80806c && this.d == openPocketDetailsStep.d && Intrinsics.f(this.e, openPocketDetailsStep.e) && this.f == openPocketDetailsStep.f && this.f80807g == openPocketDetailsStep.f80807g && Intrinsics.f(this.f80808h, openPocketDetailsStep.f80808h) && Intrinsics.f(this.i, openPocketDetailsStep.i) && Intrinsics.f(this.f80809j, openPocketDetailsStep.f80809j);
        }

        public final int hashCode() {
            int iC = j6.a.c(j6.a.c(l.b(this.f80805b, this.f80804a.hashCode() * 31, 31), 31, this.f80806c), 31, this.d);
            wi0.b bVar = this.e;
            int iC2 = j6.a.c(j6.a.c((iC + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31, 31, this.f), 31, this.f80807g);
            PocketDetailsBottomButtonAction pocketDetailsBottomButtonAction = this.f80808h;
            int iHashCode = (iC2 + (pocketDetailsBottomButtonAction == null ? 0 : pocketDetailsBottomButtonAction.hashCode())) * 31;
            NaviCommand naviCommand = this.i;
            int iHashCode2 = (iHashCode + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
            PocketDetailsInitialAction pocketDetailsInitialAction = this.f80809j;
            return iHashCode2 + (pocketDetailsInitialAction != null ? pocketDetailsInitialAction.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f80804a);
            dest.writeParcelable(this.f80805b, i);
            dest.writeInt(this.f80806c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeSerializable(this.e);
            dest.writeInt(this.f ? 1 : 0);
            dest.writeInt(this.f80807g ? 1 : 0);
            dest.writeParcelable(this.f80808h, i);
            dest.writeParcelable(this.i, i);
            dest.writeParcelable(this.f80809j, i);
        }
    }
}
