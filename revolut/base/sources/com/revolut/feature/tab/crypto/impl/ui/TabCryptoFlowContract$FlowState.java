package com.revolut.feature.tab.crypto.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.model.Data;
import com.revolut.feature.tab.crypto.impl.ui.v2.accounts.crypto.CryptoHeaderData;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qje.o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00072\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"com/revolut/feature/tab/crypto/impl/ui/TabCryptoFlowContract$FlowState", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "Loki/a;", "Lcom/revolut/feature/tab/crypto/impl/ui/TabCryptoFlowContract$TabPagerItem;", "", "toString", "()Ljava/lang/String;", "Companion", "b", "feature_tab_crypto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TabCryptoFlowContract$FlowState implements States$PersistentDomain, oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ake.a f89789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f89790b;

    @NotNull
    public static final Parcelable.Creator<TabCryptoFlowContract$FlowState> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            CryptoHeaderData cryptoHeaderData = (CryptoHeaderData) j6.a.f(parcel, "source", CryptoHeaderData.class);
            return new TabCryptoFlowContract$FlowState(new ake.a(new Data(cryptoHeaderData, null, cryptoHeaderData == null, 2, null), null, null, 1022), 2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TabCryptoFlowContract$FlowState[i];
        }
    }

    public TabCryptoFlowContract$FlowState() {
        this((ake.a) null, 3);
    }

    public static TabCryptoFlowContract$FlowState a(TabCryptoFlowContract$FlowState tabCryptoFlowContract$FlowState, ake.a cryptoAccountDomainState, o tabFlowDomainState, int i) {
        if ((i & 1) != 0) {
            cryptoAccountDomainState = tabCryptoFlowContract$FlowState.f89789a;
        }
        if ((i & 2) != 0) {
            tabFlowDomainState = tabCryptoFlowContract$FlowState.f89790b;
        }
        tabCryptoFlowContract$FlowState.getClass();
        Intrinsics.checkNotNullParameter(cryptoAccountDomainState, "cryptoAccountDomainState");
        Intrinsics.checkNotNullParameter(tabFlowDomainState, "tabFlowDomainState");
        return new TabCryptoFlowContract$FlowState(cryptoAccountDomainState, tabFlowDomainState);
    }

    @Override // oki.a
    /* JADX INFO: renamed from: W */
    public final List getF85711b() {
        return this.f89790b.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TabCryptoFlowContract$FlowState)) {
            return false;
        }
        TabCryptoFlowContract$FlowState tabCryptoFlowContract$FlowState = (TabCryptoFlowContract$FlowState) obj2;
        return Intrinsics.f(this.f89789a, tabCryptoFlowContract$FlowState.f89789a) && Intrinsics.f(this.f89790b, tabCryptoFlowContract$FlowState.f89790b);
    }

    public final int hashCode() {
        return this.f89790b.hashCode() + (this.f89789a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable((Parcelable) this.f89789a.f5802a.getContent(), 0);
    }

    @Override // oki.a
    /* JADX INFO: renamed from: z */
    public final String getF85710a() {
        return this.f89790b.f;
    }

    public TabCryptoFlowContract$FlowState(ake.a cryptoAccountDomainState, o tabFlowDomainState) {
        Intrinsics.checkNotNullParameter(cryptoAccountDomainState, "cryptoAccountDomainState");
        Intrinsics.checkNotNullParameter(tabFlowDomainState, "tabFlowDomainState");
        this.f89789a = cryptoAccountDomainState;
        this.f89790b = tabFlowDomainState;
    }

    public /* synthetic */ TabCryptoFlowContract$FlowState(ake.a aVar, int i) {
        this((i & 1) != 0 ? new ake.a(null, null, null, 1023) : aVar, new o());
    }
}
