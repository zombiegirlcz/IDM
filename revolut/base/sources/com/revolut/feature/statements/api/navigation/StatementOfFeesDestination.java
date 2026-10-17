package com.revolut.feature.statements.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.core.model.domain.wallet.WalletId;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.feature.statements.api.models.StatementProductType;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/api/navigation/StatementOfFeesDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StatementOfFeesDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<StatementOfFeesDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StatementProductType f88266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f88267c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            WalletId walletId = (WalletId) parcel.readParcelable(StatementOfFeesDestination.class.getClassLoader());
            String str = walletId != null ? walletId.f66106a : null;
            StatementProductType statementProductTypeValueOf = StatementProductType.valueOf(parcel.readString());
            RegisteredIdentityId registeredIdentityId = (RegisteredIdentityId) parcel.readParcelable(StatementOfFeesDestination.class.getClassLoader());
            return new StatementOfFeesDestination(statementProductTypeValueOf, str, registeredIdentityId != null ? registeredIdentityId.f74764a : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StatementOfFeesDestination[i];
        }
    }

    public StatementOfFeesDestination(StatementProductType productType, String str, String str2) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        this.f88265a = str;
        this.f88266b = productType;
        this.f88267c = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF88267c() {
        return this.f88267c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final StatementProductType getF88266b() {
        return this.f88266b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF88265a() {
        return this.f88265a;
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
            boolean r1 = r5 instanceof com.revolut.feature.statements.api.navigation.StatementOfFeesDestination
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.revolut.feature.statements.api.navigation.StatementOfFeesDestination r5 = (com.revolut.feature.statements.api.navigation.StatementOfFeesDestination) r5
            java.lang.String r1 = r5.f88265a
            java.lang.String r3 = r4.f88265a
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
            com.revolut.feature.statements.api.models.StatementProductType r1 = r4.f88266b
            com.revolut.feature.statements.api.models.StatementProductType r3 = r5.f88266b
            if (r1 == r3) goto L29
            return r2
        L29:
            java.lang.String r5 = r5.f88267c
            java.lang.String r1 = r4.f88267c
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
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.statements.api.navigation.StatementOfFeesDestination.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f88265a;
        int iHashCode = (this.f88266b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.f88267c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        String str = this.f88265a;
        dest.writeParcelable(str != null ? new WalletId(str) : null, i);
        dest.writeString(this.f88266b.name());
        String str2 = this.f88267c;
        dest.writeParcelable(str2 != null ? new RegisteredIdentityId(str2) : null, i);
    }
}
