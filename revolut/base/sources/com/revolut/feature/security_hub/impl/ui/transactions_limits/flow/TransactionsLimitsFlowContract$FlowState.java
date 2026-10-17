package com.revolut.feature.security_hub.impl.ui.transactions_limits.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$LimitFlowType;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/revolut/feature/security_hub/impl/ui/transactions_limits/flow/TransactionsLimitsFlowContract$FlowState", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "Loki/a;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/flow/TransactionsLimitsFlowContract$PagerItem;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionsLimitsFlowContract$FlowState implements States$PersistentDomain, oki.a {

    @NotNull
    public static final Parcelable.Creator<TransactionsLimitsFlowContract$FlowState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f85754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransactionsLimitsScreenContract$LimitFlowType f85755c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(TransactionsLimitsFlowContract$FlowState.class, parcel, arrayList, iE, 1);
            }
            return new TransactionsLimitsFlowContract$FlowState(string, arrayList, (TransactionsLimitsScreenContract$LimitFlowType) parcel.readParcelable(TransactionsLimitsFlowContract$FlowState.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransactionsLimitsFlowContract$FlowState[i];
        }
    }

    public TransactionsLimitsFlowContract$FlowState() {
        this(0);
    }

    public static TransactionsLimitsFlowContract$FlowState a(TransactionsLimitsFlowContract$FlowState transactionsLimitsFlowContract$FlowState, String str, List pagerItems, int i) {
        if ((i & 2) != 0) {
            pagerItems = transactionsLimitsFlowContract$FlowState.f85754b;
        }
        TransactionsLimitsScreenContract$LimitFlowType transactionsLimitsScreenContract$LimitFlowType = transactionsLimitsFlowContract$FlowState.f85755c;
        boolean z = transactionsLimitsFlowContract$FlowState.d;
        transactionsLimitsFlowContract$FlowState.getClass();
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        return new TransactionsLimitsFlowContract$FlowState(str, pagerItems, transactionsLimitsScreenContract$LimitFlowType, z);
    }

    @Override // oki.a
    /* JADX INFO: renamed from: W, reason: from getter */
    public final List getF85754b() {
        return this.f85754b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransactionsLimitsFlowContract$FlowState)) {
            return false;
        }
        TransactionsLimitsFlowContract$FlowState transactionsLimitsFlowContract$FlowState = (TransactionsLimitsFlowContract$FlowState) obj2;
        return Intrinsics.f(this.f85753a, transactionsLimitsFlowContract$FlowState.f85753a) && Intrinsics.f(this.f85754b, transactionsLimitsFlowContract$FlowState.f85754b) && Intrinsics.f(this.f85755c, transactionsLimitsFlowContract$FlowState.f85755c) && this.d == transactionsLimitsFlowContract$FlowState.d;
    }

    public final int hashCode() {
        String str = this.f85753a;
        int iD = p.a.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f85754b);
        TransactionsLimitsScreenContract$LimitFlowType transactionsLimitsScreenContract$LimitFlowType = this.f85755c;
        return Boolean.hashCode(this.d) + ((iD + (transactionsLimitsScreenContract$LimitFlowType != null ? transactionsLimitsScreenContract$LimitFlowType.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85753a);
        Iterator itV = p.a.v(this.f85754b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.f85755c, i);
        dest.writeInt(this.d ? 1 : 0);
    }

    @Override // oki.a
    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getF85753a() {
        return this.f85753a;
    }

    public TransactionsLimitsFlowContract$FlowState(String str, List pagerItems, TransactionsLimitsScreenContract$LimitFlowType transactionsLimitsScreenContract$LimitFlowType, boolean z) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        this.f85753a = str;
        this.f85754b = pagerItems;
        this.f85755c = transactionsLimitsScreenContract$LimitFlowType;
        this.d = z;
    }

    public TransactionsLimitsFlowContract$FlowState(int i) {
        this(null, f0.f322471a, null, false);
    }
}
