package com.revolut.feature.statements.impl.ui.statement_of_fees.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.core.model.domain.wallet.WalletId;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.feature.statements.api.models.StatementProductType;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/statements/impl/ui/statement_of_fees/flow/StatementOfFeesFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StatementOfFeesFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<StatementOfFeesFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StatementProductType f88389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f88390c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            WalletId walletId = (WalletId) parcel.readParcelable(StatementOfFeesFlowContract$InputData.class.getClassLoader());
            String str = walletId != null ? walletId.f66106a : null;
            StatementProductType statementProductTypeValueOf = StatementProductType.valueOf(parcel.readString());
            RegisteredIdentityId registeredIdentityId = (RegisteredIdentityId) parcel.readParcelable(StatementOfFeesFlowContract$InputData.class.getClassLoader());
            return new StatementOfFeesFlowContract$InputData(statementProductTypeValueOf, str, registeredIdentityId != null ? registeredIdentityId.f74764a : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StatementOfFeesFlowContract$InputData[i];
        }
    }

    public StatementOfFeesFlowContract$InputData(StatementProductType productType, String str, String str2) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        this.f88388a = str;
        this.f88389b = productType;
        this.f88390c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.revolut.feature.statements.impl.ui.statement_of_fees.flow.StatementOfFeesFlowContract$InputData
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.revolut.feature.statements.impl.ui.statement_of_fees.flow.StatementOfFeesFlowContract$InputData r5 = (com.revolut.feature.statements.impl.ui.statement_of_fees.flow.StatementOfFeesFlowContract$InputData) r5
            java.lang.String r1 = r5.f88388a
            java.lang.String r3 = r4.f88388a
            if (r3 != 0) goto L18
            if (r1 != 0) goto L16
            r1 = r0
            goto L1f
        L16:
            r1 = r2
            goto L1f
        L18:
            if (r1 != 0) goto L1b
            goto L16
        L1b:
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
        L1f:
            if (r1 != 0) goto L22
            return r2
        L22:
            com.revolut.feature.statements.api.models.StatementProductType r1 = r4.f88389b
            com.revolut.feature.statements.api.models.StatementProductType r3 = r5.f88389b
            if (r1 == r3) goto L29
            return r2
        L29:
            java.lang.String r5 = r5.f88390c
            java.lang.String r1 = r4.f88390c
            if (r1 != 0) goto L35
            if (r5 != 0) goto L33
            r5 = r0
            goto L3c
        L33:
            r5 = r2
            goto L3c
        L35:
            if (r5 != 0) goto L38
            goto L33
        L38:
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
        L3c:
            if (r5 != 0) goto L3f
            return r2
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.statements.impl.ui.statement_of_fees.flow.StatementOfFeesFlowContract$InputData.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f88388a;
        int iHashCode = (this.f88389b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.f88390c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        String str = this.f88388a;
        dest.writeParcelable(str != null ? new WalletId(str) : null, i);
        dest.writeString(this.f88389b.name());
        String str2 = this.f88390c;
        dest.writeParcelable(str2 != null ? new RegisteredIdentityId(str2) : null, i);
    }
}
