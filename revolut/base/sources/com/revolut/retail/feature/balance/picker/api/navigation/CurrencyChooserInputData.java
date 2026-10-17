package com.revolut.retail.feature.balance.picker.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.balance.picker.api.models.SupportedTargetCurrencies;
import h30.l;
import k1j.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/navigation/CurrencyChooserInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CurrencyChooserInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CurrencyChooserInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f99483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f99484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f99485c;
    public final SupportedTargetCurrencies d;
    public final Clause e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f99486g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CurrencyChooserInputData(d.valueOf(parcel.readString()), (AccountId) parcel.readParcelable(CurrencyChooserInputData.class.getClassLoader()), (b) parcel.readSerializable(), (SupportedTargetCurrencies) parcel.readParcelable(CurrencyChooserInputData.class.getClassLoader()), (Clause) parcel.readParcelable(CurrencyChooserInputData.class.getClassLoader()), parcel.readInt() != 0, (Clause) parcel.readParcelable(CurrencyChooserInputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CurrencyChooserInputData[i];
        }
    }

    public CurrencyChooserInputData(d walletScope, AccountId accountId, b bVar, SupportedTargetCurrencies supportedTargetCurrencies, Clause clause, boolean z, Clause clause2) {
        Intrinsics.checkNotNullParameter(walletScope, "walletScope");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f99483a = walletScope;
        this.f99484b = accountId;
        this.f99485c = bVar;
        this.d = supportedTargetCurrencies;
        this.e = clause;
        this.f = z;
        this.f99486g = clause2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CurrencyChooserInputData)) {
            return false;
        }
        CurrencyChooserInputData currencyChooserInputData = (CurrencyChooserInputData) obj2;
        return this.f99483a == currencyChooserInputData.f99483a && Intrinsics.f(this.f99484b, currencyChooserInputData.f99484b) && Intrinsics.f(this.f99485c, currencyChooserInputData.f99485c) && Intrinsics.f(this.d, currencyChooserInputData.d) && Intrinsics.f(this.e, currencyChooserInputData.e) && this.f == currencyChooserInputData.f && Intrinsics.f(this.f99486g, currencyChooserInputData.f99486g);
    }

    public final int hashCode() {
        int iB = l.b(this.f99484b, this.f99483a.hashCode() * 31, 31);
        b bVar = this.f99485c;
        int iHashCode = (iB + (bVar == null ? 0 : bVar.hashCode())) * 31;
        SupportedTargetCurrencies supportedTargetCurrencies = this.d;
        int iHashCode2 = (iHashCode + (supportedTargetCurrencies == null ? 0 : supportedTargetCurrencies.hashCode())) * 31;
        Clause clause = this.e;
        int iC = j6.a.c((iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f);
        Clause clause2 = this.f99486g;
        return iC + (clause2 != null ? clause2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f99483a.name());
        dest.writeParcelable(this.f99484b, i);
        dest.writeSerializable(this.f99485c);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeParcelable(this.f99486g, i);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CurrencyChooserInputData(k1j.d r9, com.revolut.core.model.account.AccountId r10, xi0.b r11, com.revolut.retail.feature.balance.picker.api.models.SupportedTargetCurrencies r12, com.revolut.core.ui_kit.models.Clause r13, boolean r14, com.revolut.core.ui_kit.models.TextLocalisedClause r15, int r16) {
        /*
            r8 = this;
            r0 = r16 & 2
            if (r0 == 0) goto L6
            com.revolut.core.model.account.AccountId$Personal r10 = com.revolut.core.model.account.AccountId.Personal.f51414a
        L6:
            r2 = r10
            r10 = r16 & 16
            r0 = 0
            if (r10 == 0) goto Le
            r5 = r0
            goto Lf
        Le:
            r5 = r13
        Lf:
            r10 = r16 & 32
            if (r10 == 0) goto L14
            r14 = 0
        L14:
            r6 = r14
            r10 = r16 & 64
            if (r10 == 0) goto L1f
            r7 = r0
            r1 = r9
            r3 = r11
            r4 = r12
            r0 = r8
            goto L24
        L1f:
            r7 = r15
            r0 = r8
            r1 = r9
            r3 = r11
            r4 = r12
        L24:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserInputData.<init>(k1j.d, com.revolut.core.model.account.AccountId, xi0.b, com.revolut.retail.feature.balance.picker.api.models.SupportedTargetCurrencies, com.revolut.core.ui_kit.models.Clause, boolean, com.revolut.core.ui_kit.models.TextLocalisedClause, int):void");
    }
}
