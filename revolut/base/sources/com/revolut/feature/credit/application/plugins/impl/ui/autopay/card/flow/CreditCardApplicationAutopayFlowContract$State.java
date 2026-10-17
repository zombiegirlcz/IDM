package com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.config.AutoPayPromptScreenConfig;
import com.revolut.feature.credit.autopay.models.AccountDetails;
import com.revolut.feature.credit_card.autopay.api.models.CreditScheduledAmountType;
import com.revolut.kompot.navigable.flow.FlowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mb5.q;
import mb5.r;
import mb5.s;
import mb5.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/autopay/card/flow/CreditCardApplicationAutopayFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "l54/b", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardApplicationAutopayFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<CreditCardApplicationAutopayFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mb5.b f67122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AutoPayPromptScreenConfig f67123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f67124c;
    public final CreditScheduledAmountType d;
    public final AccountDetails.LinkedAccount e;
    public final l54.b f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardApplicationAutopayFlowContract$State((mb5.b) parcel.readSerializable(), (AutoPayPromptScreenConfig) parcel.readParcelable(CreditCardApplicationAutopayFlowContract$State.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (CreditScheduledAmountType) parcel.readParcelable(CreditCardApplicationAutopayFlowContract$State.class.getClassLoader()), (AccountDetails.LinkedAccount) parcel.readParcelable(CreditCardApplicationAutopayFlowContract$State.class.getClassLoader()), l54.b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardApplicationAutopayFlowContract$State[i];
        }
    }

    public CreditCardApplicationAutopayFlowContract$State() {
        this(0);
    }

    public static CreditCardApplicationAutopayFlowContract$State a(CreditCardApplicationAutopayFlowContract$State creditCardApplicationAutopayFlowContract$State, mb5.b bVar, AutoPayPromptScreenConfig autoPayPromptScreenConfig, Integer num, CreditScheduledAmountType creditScheduledAmountType, AccountDetails.LinkedAccount linkedAccount, l54.b bVar2, int i) {
        if ((i & 1) != 0) {
            bVar = creditCardApplicationAutopayFlowContract$State.f67122a;
        }
        mb5.b bVar3 = bVar;
        if ((i & 2) != 0) {
            autoPayPromptScreenConfig = creditCardApplicationAutopayFlowContract$State.f67123b;
        }
        AutoPayPromptScreenConfig autoPayPromptScreenConfig2 = autoPayPromptScreenConfig;
        if ((i & 4) != 0) {
            num = creditCardApplicationAutopayFlowContract$State.f67124c;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            creditScheduledAmountType = creditCardApplicationAutopayFlowContract$State.d;
        }
        CreditScheduledAmountType creditScheduledAmountType2 = creditScheduledAmountType;
        if ((i & 16) != 0) {
            linkedAccount = creditCardApplicationAutopayFlowContract$State.e;
        }
        AccountDetails.LinkedAccount linkedAccount2 = linkedAccount;
        if ((i & 32) != 0) {
            bVar2 = creditCardApplicationAutopayFlowContract$State.f;
        }
        l54.b repaymentFlow = bVar2;
        creditCardApplicationAutopayFlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(repaymentFlow, "repaymentFlow");
        return new CreditCardApplicationAutopayFlowContract$State(bVar3, autoPayPromptScreenConfig2, num2, creditScheduledAmountType2, linkedAccount2, repaymentFlow);
    }

    public final mb5.b b() {
        mb5.b bVar = this.f67122a;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final u c() {
        u uVar;
        mb5.b bVarB = b();
        s sVarA = bVarB.a();
        u uVar2 = null;
        r rVar = sVarA != null ? sVarA.f204156b : null;
        q qVar = rVar instanceof q ? (q) rVar : null;
        if (qVar == null || (uVar = qVar.f204152b) == null) {
            s sVarA2 = bVarB.a();
            if (sVarA2 != null) {
                uVar2 = sVarA2.f204155a;
            }
        } else {
            uVar2 = uVar;
        }
        if (uVar2 != null) {
            return uVar2;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardApplicationAutopayFlowContract$State)) {
            return false;
        }
        CreditCardApplicationAutopayFlowContract$State creditCardApplicationAutopayFlowContract$State = (CreditCardApplicationAutopayFlowContract$State) obj2;
        return Intrinsics.f(this.f67122a, creditCardApplicationAutopayFlowContract$State.f67122a) && Intrinsics.f(this.f67123b, creditCardApplicationAutopayFlowContract$State.f67123b) && Intrinsics.f(this.f67124c, creditCardApplicationAutopayFlowContract$State.f67124c) && Intrinsics.f(this.d, creditCardApplicationAutopayFlowContract$State.d) && Intrinsics.f(this.e, creditCardApplicationAutopayFlowContract$State.e) && this.f == creditCardApplicationAutopayFlowContract$State.f;
    }

    public final int hashCode() {
        mb5.b bVar = this.f67122a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        AutoPayPromptScreenConfig autoPayPromptScreenConfig = this.f67123b;
        int iHashCode2 = (iHashCode + (autoPayPromptScreenConfig == null ? 0 : autoPayPromptScreenConfig.hashCode())) * 31;
        Integer num = this.f67124c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        CreditScheduledAmountType creditScheduledAmountType = this.d;
        int iHashCode4 = (iHashCode3 + (creditScheduledAmountType == null ? 0 : creditScheduledAmountType.hashCode())) * 31;
        AccountDetails.LinkedAccount linkedAccount = this.e;
        return this.f.hashCode() + ((iHashCode4 + (linkedAccount != null ? linkedAccount.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f67122a);
        dest.writeParcelable(this.f67123b, i);
        Integer num = this.f67124c;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeString(this.f.name());
    }

    public CreditCardApplicationAutopayFlowContract$State(mb5.b bVar, AutoPayPromptScreenConfig autoPayPromptScreenConfig, Integer num, CreditScheduledAmountType creditScheduledAmountType, AccountDetails.LinkedAccount linkedAccount, l54.b repaymentFlow) {
        Intrinsics.checkNotNullParameter(repaymentFlow, "repaymentFlow");
        this.f67122a = bVar;
        this.f67123b = autoPayPromptScreenConfig;
        this.f67124c = num;
        this.d = creditScheduledAmountType;
        this.e = linkedAccount;
        this.f = repaymentFlow;
    }

    public /* synthetic */ CreditCardApplicationAutopayFlowContract$State(int i) {
        this(null, null, null, null, null, l54.b.REVOLUT);
    }
}
