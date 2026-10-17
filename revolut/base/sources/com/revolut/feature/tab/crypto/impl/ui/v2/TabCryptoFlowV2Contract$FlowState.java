package com.revolut.feature.tab.crypto.impl.ui.v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.tab.crypto.api.extensions.account.AccountsExtensionContract$AccountsState;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qje.o;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00072\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"com/revolut/feature/tab/crypto/impl/ui/v2/TabCryptoFlowV2Contract$FlowState", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "Loki/a;", "Lcom/revolut/feature/tab/crypto/impl/ui/TabCryptoFlowContract$TabPagerItem;", "", "toString", "()Ljava/lang/String;", "Companion", "b", "feature_tab_crypto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TabCryptoFlowV2Contract$FlowState implements States$PersistentDomain, oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f89811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f89812b;

    @NotNull
    public static final Parcelable.Creator<TabCryptoFlowV2Contract$FlowState> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            Parcelable[] parcelableArray = source.readParcelableArray(AccountsExtensionContract$AccountsState.class.getClassLoader());
            List listV0 = parcelableArray != null ? d.v0(parcelableArray) : null;
            if (!(listV0 instanceof List)) {
                listV0 = null;
            }
            return listV0 != null ? new TabCryptoFlowV2Contract$FlowState(listV0, 1) : new TabCryptoFlowV2Contract$FlowState((List) null, 3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TabCryptoFlowV2Contract$FlowState[i];
        }
    }

    public TabCryptoFlowV2Contract$FlowState() {
        this((List) null, 3);
    }

    public static TabCryptoFlowV2Contract$FlowState a(TabCryptoFlowV2Contract$FlowState tabCryptoFlowV2Contract$FlowState, o tabFlowDomainState, List accountsStates, int i) {
        if ((i & 1) != 0) {
            tabFlowDomainState = tabCryptoFlowV2Contract$FlowState.f89811a;
        }
        if ((i & 2) != 0) {
            accountsStates = tabCryptoFlowV2Contract$FlowState.f89812b;
        }
        tabCryptoFlowV2Contract$FlowState.getClass();
        Intrinsics.checkNotNullParameter(tabFlowDomainState, "tabFlowDomainState");
        Intrinsics.checkNotNullParameter(accountsStates, "accountsStates");
        return new TabCryptoFlowV2Contract$FlowState(tabFlowDomainState, accountsStates);
    }

    @Override // oki.a
    public final List W() {
        return this.f89811a.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TabCryptoFlowV2Contract$FlowState)) {
            return false;
        }
        TabCryptoFlowV2Contract$FlowState tabCryptoFlowV2Contract$FlowState = (TabCryptoFlowV2Contract$FlowState) obj2;
        return Intrinsics.f(this.f89811a, tabCryptoFlowV2Contract$FlowState.f89811a) && Intrinsics.f(this.f89812b, tabCryptoFlowV2Contract$FlowState.f89812b);
    }

    public final int hashCode() {
        return this.f89812b.hashCode() + (this.f89811a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelableArray((Parcelable[]) this.f89812b.toArray(new AccountsExtensionContract$AccountsState[0]), 0);
    }

    @Override // oki.a
    public final String z() {
        return this.f89811a.f;
    }

    public TabCryptoFlowV2Contract$FlowState(o tabFlowDomainState, List accountsStates) {
        Intrinsics.checkNotNullParameter(tabFlowDomainState, "tabFlowDomainState");
        Intrinsics.checkNotNullParameter(accountsStates, "accountsStates");
        this.f89811a = tabFlowDomainState;
        this.f89812b = accountsStates;
    }

    public TabCryptoFlowV2Contract$FlowState(List list, int i) {
        this(new o(), (i & 2) != 0 ? f0.f322471a : list);
    }
}
