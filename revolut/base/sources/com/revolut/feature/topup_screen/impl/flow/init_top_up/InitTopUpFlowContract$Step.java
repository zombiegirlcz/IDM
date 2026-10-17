package com.revolut.feature.topup_screen.impl.flow.init_top_up;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.topup.methods.PreselectedTopUpMethodId;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.core.navigation.NaviCommand;
import dj0.d;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/topup_screen/impl/flow/init_top_up/InitTopUpFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "BgnRestrictionArticle", "BgnRestrictionsDialog", "UnsupportedCurrencyDialog", "TopupFlow", "Lcom/revolut/feature/topup_screen/impl/flow/init_top_up/InitTopUpFlowContract$Step$BgnRestrictionArticle;", "Lcom/revolut/feature/topup_screen/impl/flow/init_top_up/InitTopUpFlowContract$Step$BgnRestrictionsDialog;", "Lcom/revolut/feature/topup_screen/impl/flow/init_top_up/InitTopUpFlowContract$Step$TopupFlow;", "Lcom/revolut/feature/topup_screen/impl/flow/init_top_up/InitTopUpFlowContract$Step$UnsupportedCurrencyDialog;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class InitTopUpFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flow/init_top_up/InitTopUpFlowContract$Step$BgnRestrictionArticle;", "Lcom/revolut/feature/topup_screen/impl/flow/init_top_up/InitTopUpFlowContract$Step;", "<init>", "()V", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BgnRestrictionArticle extends InitTopUpFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BgnRestrictionArticle f90619a = new BgnRestrictionArticle();

        @NotNull
        public static final Parcelable.Creator<BgnRestrictionArticle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BgnRestrictionArticle.f90619a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BgnRestrictionArticle[i];
            }
        }

        private BgnRestrictionArticle() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flow/init_top_up/InitTopUpFlowContract$Step$BgnRestrictionsDialog;", "Lcom/revolut/feature/topup_screen/impl/flow/init_top_up/InitTopUpFlowContract$Step;", "<init>", "()V", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BgnRestrictionsDialog extends InitTopUpFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BgnRestrictionsDialog f90620a = new BgnRestrictionsDialog();

        @NotNull
        public static final Parcelable.Creator<BgnRestrictionsDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BgnRestrictionsDialog.f90620a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BgnRestrictionsDialog[i];
            }
        }

        private BgnRestrictionsDialog() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flow/init_top_up/InitTopUpFlowContract$Step$TopupFlow;", "Lcom/revolut/feature/topup_screen/impl/flow/init_top_up/InitTopUpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TopupFlow extends InitTopUpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TopupFlow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TopUpTarget f90621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final pte.a f90622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f90623c;
        public final PreselectedTopUpMethodId d;
        public final boolean e;
        public final d f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TopupFlow((TopUpTarget) parcel.readParcelable(TopupFlow.class.getClassLoader()), pte.a.valueOf(parcel.readString()), (b) parcel.readSerializable(), (PreselectedTopUpMethodId) parcel.readParcelable(TopupFlow.class.getClassLoader()), parcel.readInt() != 0, (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TopupFlow[i];
            }
        }

        public TopupFlow(TopUpTarget target, pte.a topUpFlow, b currency, PreselectedTopUpMethodId preselectedTopUpMethodId, boolean z, d dVar) {
            Intrinsics.checkNotNullParameter(target, "target");
            Intrinsics.checkNotNullParameter(topUpFlow, "topUpFlow");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f90621a = target;
            this.f90622b = topUpFlow;
            this.f90623c = currency;
            this.d = preselectedTopUpMethodId;
            this.e = z;
            this.f = dVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TopupFlow)) {
                return false;
            }
            TopupFlow topupFlow = (TopupFlow) obj2;
            return Intrinsics.f(this.f90621a, topupFlow.f90621a) && this.f90622b == topupFlow.f90622b && Intrinsics.f(this.f90623c, topupFlow.f90623c) && Intrinsics.f(this.d, topupFlow.d) && this.e == topupFlow.e && Intrinsics.f(this.f, topupFlow.f);
        }

        public final int hashCode() {
            int iJ = l.j(this.f90623c, (this.f90622b.hashCode() + (this.f90621a.hashCode() * 31)) * 31, 31);
            PreselectedTopUpMethodId preselectedTopUpMethodId = this.d;
            int iC = j6.a.c((iJ + (preselectedTopUpMethodId == null ? 0 : preselectedTopUpMethodId.hashCode())) * 31, 31, this.e);
            d dVar = this.f;
            return iC + (dVar != null ? dVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f90621a, i);
            dest.writeString(this.f90622b.name());
            dest.writeSerializable(this.f90623c);
            dest.writeParcelable(this.d, i);
            dest.writeInt(this.e ? 1 : 0);
            dest.writeSerializable(this.f);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flow/init_top_up/InitTopUpFlowContract$Step$UnsupportedCurrencyDialog;", "Lcom/revolut/feature/topup_screen/impl/flow/init_top_up/InitTopUpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnsupportedCurrencyDialog extends InitTopUpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<UnsupportedCurrencyDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f90624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f90625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NaviCommand f90626c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UnsupportedCurrencyDialog((b) parcel.readSerializable(), (b) parcel.readSerializable(), (NaviCommand) parcel.readParcelable(UnsupportedCurrencyDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnsupportedCurrencyDialog[i];
            }
        }

        public UnsupportedCurrencyDialog(b currency, b baseCurrency, NaviCommand fallbackNavigation) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
            Intrinsics.checkNotNullParameter(fallbackNavigation, "fallbackNavigation");
            this.f90624a = currency;
            this.f90625b = baseCurrency;
            this.f90626c = fallbackNavigation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UnsupportedCurrencyDialog)) {
                return false;
            }
            UnsupportedCurrencyDialog unsupportedCurrencyDialog = (UnsupportedCurrencyDialog) obj2;
            return Intrinsics.f(this.f90624a, unsupportedCurrencyDialog.f90624a) && Intrinsics.f(this.f90625b, unsupportedCurrencyDialog.f90625b) && Intrinsics.f(this.f90626c, unsupportedCurrencyDialog.f90626c);
        }

        public final int hashCode() {
            return this.f90626c.hashCode() + l.j(this.f90625b, this.f90624a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90624a);
            dest.writeSerializable(this.f90625b);
            dest.writeParcelable(this.f90626c, i);
        }
    }

    private InitTopUpFlowContract$Step() {
    }
}
