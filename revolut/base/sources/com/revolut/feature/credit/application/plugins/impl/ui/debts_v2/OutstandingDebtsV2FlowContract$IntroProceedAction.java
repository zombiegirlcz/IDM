package com.revolut.feature.credit.application.plugins.impl.ui.debts_v2;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qu3.l;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$IntroProceedAction", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OutstandingDebtsV2FlowContract$IntroProceedAction implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f67452b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<OutstandingDebtsV2FlowContract$IntroProceedAction> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.OutstandingDebtsV2FlowContract$IntroProceedAction$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OutstandingDebtsV2FlowContract$IntroProceedAction(parcel.readString(), (l) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OutstandingDebtsV2FlowContract$IntroProceedAction[i];
        }
    }

    public OutstandingDebtsV2FlowContract$IntroProceedAction(String loadingButtonTag, l action) {
        Intrinsics.checkNotNullParameter(loadingButtonTag, "loadingButtonTag");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f67451a = loadingButtonTag;
        this.f67452b = action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OutstandingDebtsV2FlowContract$IntroProceedAction)) {
            return false;
        }
        OutstandingDebtsV2FlowContract$IntroProceedAction outstandingDebtsV2FlowContract$IntroProceedAction = (OutstandingDebtsV2FlowContract$IntroProceedAction) obj2;
        return Intrinsics.f(this.f67451a, outstandingDebtsV2FlowContract$IntroProceedAction.f67451a) && Intrinsics.f(this.f67452b, outstandingDebtsV2FlowContract$IntroProceedAction.f67452b);
    }

    public final int hashCode() {
        return this.f67452b.hashCode() + (this.f67451a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f67451a);
        dest.writeSerializable(this.f67452b);
    }
}
