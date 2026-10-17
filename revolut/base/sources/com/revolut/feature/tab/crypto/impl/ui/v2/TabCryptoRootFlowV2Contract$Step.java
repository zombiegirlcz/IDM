package com.revolut.feature.tab.crypto.impl.ui.v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/tab/crypto/impl/ui/v2/TabCryptoRootFlowV2Contract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Home", "AccountPicker", "Lcom/revolut/feature/tab/crypto/impl/ui/v2/TabCryptoRootFlowV2Contract$Step$AccountPicker;", "Lcom/revolut/feature/tab/crypto/impl/ui/v2/TabCryptoRootFlowV2Contract$Step$Home;", "feature_tab_crypto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TabCryptoRootFlowV2Contract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/crypto/impl/ui/v2/TabCryptoRootFlowV2Contract$Step$AccountPicker;", "Lcom/revolut/feature/tab/crypto/impl/ui/v2/TabCryptoRootFlowV2Contract$Step;", "", "toString", "()Ljava/lang/String;", "feature_tab_crypto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountPicker implements TabCryptoRootFlowV2Contract$Step {

        @NotNull
        public static final Parcelable.Creator<AccountPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f89813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f89814b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(AccountPicker.class, parcel, arrayList, iE, 1);
                }
                return new AccountPicker(arrayList, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountPicker[i];
            }
        }

        public AccountPicker(List accountsStates, String selectedAccountId) {
            Intrinsics.checkNotNullParameter(accountsStates, "accountsStates");
            Intrinsics.checkNotNullParameter(selectedAccountId, "selectedAccountId");
            this.f89813a = accountsStates;
            this.f89814b = selectedAccountId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AccountPicker)) {
                return false;
            }
            AccountPicker accountPicker = (AccountPicker) obj2;
            return Intrinsics.f(this.f89813a, accountPicker.f89813a) && Intrinsics.f(this.f89814b, accountPicker.f89814b);
        }

        public final int hashCode() {
            return this.f89814b.hashCode() + (this.f89813a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f89813a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeString(this.f89814b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/crypto/impl/ui/v2/TabCryptoRootFlowV2Contract$Step$Home;", "Lcom/revolut/feature/tab/crypto/impl/ui/v2/TabCryptoRootFlowV2Contract$Step;", "<init>", "()V", "feature_tab_crypto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Home implements TabCryptoRootFlowV2Contract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Home f89815a = new Home();

        @NotNull
        public static final Parcelable.Creator<Home> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Home.f89815a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Home[i];
            }
        }

        private Home() {
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
}
