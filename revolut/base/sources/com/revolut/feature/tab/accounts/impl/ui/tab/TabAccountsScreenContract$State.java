package com.revolut.feature.tab.accounts.impl.ui.tab;

import android.os.Parcel;
import android.os.Parcelable;
import cie.j0;
import cie.k0;
import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.api.model.AccountContent;
import com.revolut.feature.tab.accounts.impl.model.TabScreenLoadingConfiguration;
import com.revolut.feature.tab.accounts.impl.ui.tab.ParcelableAccountSections;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import hx7.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import tx0.j;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/revolut/feature/tab/accounts/impl/ui/tab/TabAccountsScreenContract$State", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "", "toString", "()Ljava/lang/String;", "Companion", "b", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TabAccountsScreenContract$State implements States$PersistentDomain {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f89684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f89685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f89686c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f89687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f89688h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k0 f89689j;
    public final ProductAccountDescriptor$Value k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f89690l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TabScreenLoadingConfiguration f89691m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f89692n;
    public final Integer o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f89693p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final NavBarMessage f89694q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final itb.b f89695r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j f89696s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f89697t;
    public final boolean u;
    public final String v;

    @NotNull
    public static final Parcelable.Creator<TabAccountsScreenContract$State> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel source) throws Throwable {
            Object objA;
            Intrinsics.checkNotNullParameter(source, "source");
            Parcelable[] parcelableArray = source.readParcelableArray(AccountContent.class.getClassLoader());
            List listV0 = parcelableArray != null ? kotlin.collections.d.v0(parcelableArray) : null;
            List list = listV0 instanceof List ? listV0 : null;
            ProductAccountDescriptor$Value productAccountDescriptor$Value = (ProductAccountDescriptor$Value) source.readParcelable(ProductAccountDescriptor$Value.class.getClassLoader());
            TabScreenLoadingConfiguration tabScreenLoadingConfiguration = (TabScreenLoadingConfiguration) source.readParcelable(TabScreenLoadingConfiguration.class.getClassLoader());
            TabScreenLoadingConfiguration tabScreenLoadingConfigurationA = tabScreenLoadingConfiguration != null ? TabScreenLoadingConfiguration.a(tabScreenLoadingConfiguration) : null;
            try {
                m.Companion companion = m.INSTANCE;
                ParcelableAccountSections parcelableAccountSections = (ParcelableAccountSections) source.readParcelable(ParcelableAccountSections.class.getClassLoader());
                objA = parcelableAccountSections != null ? com.revolut.feature.tab.accounts.impl.ui.tab.a.a(parcelableAccountSections) : null;
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                objA = o.a(th10);
            }
            Throwable thA = m.a(objA);
            if (thA != null) {
                e.n(thA);
            }
            List list2 = (List) (objA instanceof n ? null : objA);
            boolean z = source.readInt() == 1;
            Data data = new Data(list, null, false, 6, null);
            if (list2 == null) {
                list2 = f0.f322471a;
            }
            return new TabAccountsScreenContract$State(data, list2, productAccountDescriptor$Value, tabScreenLoadingConfigurationA, z, 3140027);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TabAccountsScreenContract$State[i];
        }
    }

    public TabAccountsScreenContract$State() {
        this(null, null, null, null, false, 4194303);
    }

    public static TabAccountsScreenContract$State a(TabAccountsScreenContract$State tabAccountsScreenContract$State, Data data, List list, Data data2, Data data3, Data data4, Data data5, List list2, Data data6, List list3, k0 k0Var, ProductAccountDescriptor$Value productAccountDescriptor$Value, boolean z, TabScreenLoadingConfiguration tabScreenLoadingConfiguration, boolean z3, Integer num, List list4, NavBarMessage navBarMessage, itb.b bVar, j jVar, boolean z4, boolean z6, String str, int i) {
        Data user = (i & 1) != 0 ? tabAccountsScreenContract$State.f89684a : data;
        List menuItemIds = (i & 2) != 0 ? tabAccountsScreenContract$State.f89685b : list;
        Data accounts = (i & 4) != 0 ? tabAccountsScreenContract$State.f89686c : data2;
        Data newsBanners = (i & 8) != 0 ? tabAccountsScreenContract$State.d : data3;
        Data slotManagerItems = (i & 16) != 0 ? tabAccountsScreenContract$State.e : data4;
        Data secondarySlotManagerItems = (i & 32) != 0 ? tabAccountsScreenContract$State.f : data5;
        List accountSections = (i & 64) != 0 ? tabAccountsScreenContract$State.f89687g : list2;
        Data pendingActions = (i & 128) != 0 ? tabAccountsScreenContract$State.f89688h : data6;
        List npsItems = (i & 256) != 0 ? tabAccountsScreenContract$State.i : list3;
        k0 widgetsState = (i & 512) != 0 ? tabAccountsScreenContract$State.f89689j : k0Var;
        ProductAccountDescriptor$Value productAccountDescriptor$Value2 = (i & 1024) != 0 ? tabAccountsScreenContract$State.k : productAccountDescriptor$Value;
        boolean z11 = (i & 2048) != 0 ? tabAccountsScreenContract$State.f89690l : z;
        TabScreenLoadingConfiguration tabScreenLoadingConfiguration2 = (i & 4096) != 0 ? tabAccountsScreenContract$State.f89691m : tabScreenLoadingConfiguration;
        boolean z12 = (i & 8192) != 0 ? tabAccountsScreenContract$State.f89692n : z3;
        ProductAccountDescriptor$Value productAccountDescriptor$Value3 = productAccountDescriptor$Value2;
        Integer num2 = (i & 16384) != 0 ? tabAccountsScreenContract$State.o : num;
        List footerItems = (i & 32768) != 0 ? tabAccountsScreenContract$State.f89693p : list4;
        Integer num3 = num2;
        NavBarMessage navBarMessage2 = (i & 65536) != 0 ? tabAccountsScreenContract$State.f89694q : navBarMessage;
        itb.b userProfileAvatarParams = (i & 131072) != 0 ? tabAccountsScreenContract$State.f89695r : bVar;
        boolean z29 = z11;
        j jVar2 = (i & 262144) != 0 ? tabAccountsScreenContract$State.f89696s : jVar;
        boolean z31 = (i & 524288) != 0 ? tabAccountsScreenContract$State.f89697t : z4;
        boolean z41 = (i & PKIFailureInfo.badCertTemplate) != 0 ? tabAccountsScreenContract$State.u : z6;
        String str2 = (i & PKIFailureInfo.badSenderNonce) != 0 ? tabAccountsScreenContract$State.v : str;
        tabAccountsScreenContract$State.getClass();
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(menuItemIds, "menuItemIds");
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(newsBanners, "newsBanners");
        Intrinsics.checkNotNullParameter(slotManagerItems, "slotManagerItems");
        Intrinsics.checkNotNullParameter(secondarySlotManagerItems, "secondarySlotManagerItems");
        Intrinsics.checkNotNullParameter(accountSections, "accountSections");
        Intrinsics.checkNotNullParameter(pendingActions, "pendingActions");
        Intrinsics.checkNotNullParameter(npsItems, "npsItems");
        Intrinsics.checkNotNullParameter(widgetsState, "widgetsState");
        Intrinsics.checkNotNullParameter(footerItems, "footerItems");
        Intrinsics.checkNotNullParameter(userProfileAvatarParams, "userProfileAvatarParams");
        return new TabAccountsScreenContract$State(user, menuItemIds, accounts, newsBanners, slotManagerItems, secondarySlotManagerItems, accountSections, pendingActions, npsItems, widgetsState, productAccountDescriptor$Value3, z29, tabScreenLoadingConfiguration2, z12, num3, footerItems, navBarMessage2, userProfileAvatarParams, jVar2, z31, z41, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TabAccountsScreenContract$State)) {
            return false;
        }
        TabAccountsScreenContract$State tabAccountsScreenContract$State = (TabAccountsScreenContract$State) obj2;
        return Intrinsics.f(this.f89684a, tabAccountsScreenContract$State.f89684a) && Intrinsics.f(this.f89685b, tabAccountsScreenContract$State.f89685b) && Intrinsics.f(this.f89686c, tabAccountsScreenContract$State.f89686c) && Intrinsics.f(this.d, tabAccountsScreenContract$State.d) && Intrinsics.f(this.e, tabAccountsScreenContract$State.e) && Intrinsics.f(this.f, tabAccountsScreenContract$State.f) && Intrinsics.f(this.f89687g, tabAccountsScreenContract$State.f89687g) && Intrinsics.f(this.f89688h, tabAccountsScreenContract$State.f89688h) && Intrinsics.f(this.i, tabAccountsScreenContract$State.i) && Intrinsics.f(this.f89689j, tabAccountsScreenContract$State.f89689j) && Intrinsics.f(this.k, tabAccountsScreenContract$State.k) && this.f89690l == tabAccountsScreenContract$State.f89690l && Intrinsics.f(this.f89691m, tabAccountsScreenContract$State.f89691m) && this.f89692n == tabAccountsScreenContract$State.f89692n && Intrinsics.f(this.o, tabAccountsScreenContract$State.o) && Intrinsics.f(this.f89693p, tabAccountsScreenContract$State.f89693p) && Intrinsics.f(this.f89694q, tabAccountsScreenContract$State.f89694q) && Intrinsics.f(this.f89695r, tabAccountsScreenContract$State.f89695r) && Intrinsics.f(this.f89696s, tabAccountsScreenContract$State.f89696s) && this.f89697t == tabAccountsScreenContract$State.f89697t && this.u == tabAccountsScreenContract$State.u && Intrinsics.f(this.v, tabAccountsScreenContract$State.v);
    }

    public final int hashCode() {
        int iHashCode = (this.f89689j.hashCode() + p.a.d(kii.e.c(this.f89688h, p.a.d(kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f89686c, p.a.d(this.f89684a.hashCode() * 31, 31, this.f89685b), 31), 31), 31), 31), 31, this.f89687g), 31), 31, this.i)) * 31;
        ProductAccountDescriptor$Value productAccountDescriptor$Value = this.k;
        int iC = j6.a.c((iHashCode + (productAccountDescriptor$Value == null ? 0 : productAccountDescriptor$Value.hashCode())) * 31, 31, this.f89690l);
        TabScreenLoadingConfiguration tabScreenLoadingConfiguration = this.f89691m;
        int iC2 = j6.a.c((iC + (tabScreenLoadingConfiguration == null ? 0 : tabScreenLoadingConfiguration.hashCode())) * 31, 31, this.f89692n);
        Integer num = this.o;
        int iD = p.a.d((iC2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f89693p);
        NavBarMessage navBarMessage = this.f89694q;
        int iHashCode2 = (this.f89695r.hashCode() + ((iD + (navBarMessage == null ? 0 : navBarMessage.hashCode())) * 31)) * 31;
        j jVar = this.f89696s;
        int iC3 = j6.a.c(j6.a.c((iHashCode2 + (jVar == null ? 0 : jVar.hashCode())) * 31, 31, this.f89697t), 31, this.u);
        String str = this.v;
        return iC3 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List list = (List) this.f89686c.getContent();
        dest.writeParcelableArray(list != null ? (AccountContent[]) list.toArray(new AccountContent[0]) : null, 0);
        dest.writeParcelable(this.k, 0);
        dest.writeParcelable(this.f89691m, 0);
        List list2 = this.f89687g;
        Intrinsics.checkNotNullParameter(list2, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            ParcelableAccountSections.ParcelableItem parcelableItemB = com.revolut.feature.tab.accounts.impl.ui.tab.a.b((koi.j) it8.next());
            if (parcelableItemB != null) {
                arrayList.add(parcelableItemB);
            }
        }
        dest.writeParcelable(new ParcelableAccountSections(arrayList), 0);
        dest.writeInt(this.u ? 1 : 0);
    }

    public TabAccountsScreenContract$State(Data user, List menuItemIds, Data accounts, Data newsBanners, Data slotManagerItems, Data secondarySlotManagerItems, List accountSections, Data pendingActions, List npsItems, k0 widgetsState, ProductAccountDescriptor$Value productAccountDescriptor$Value, boolean z, TabScreenLoadingConfiguration tabScreenLoadingConfiguration, boolean z3, Integer num, List footerItems, NavBarMessage navBarMessage, itb.b userProfileAvatarParams, j jVar, boolean z4, boolean z6, String str) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(menuItemIds, "menuItemIds");
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(newsBanners, "newsBanners");
        Intrinsics.checkNotNullParameter(slotManagerItems, "slotManagerItems");
        Intrinsics.checkNotNullParameter(secondarySlotManagerItems, "secondarySlotManagerItems");
        Intrinsics.checkNotNullParameter(accountSections, "accountSections");
        Intrinsics.checkNotNullParameter(pendingActions, "pendingActions");
        Intrinsics.checkNotNullParameter(npsItems, "npsItems");
        Intrinsics.checkNotNullParameter(widgetsState, "widgetsState");
        Intrinsics.checkNotNullParameter(footerItems, "footerItems");
        Intrinsics.checkNotNullParameter(userProfileAvatarParams, "userProfileAvatarParams");
        this.f89684a = user;
        this.f89685b = menuItemIds;
        this.f89686c = accounts;
        this.d = newsBanners;
        this.e = slotManagerItems;
        this.f = secondarySlotManagerItems;
        this.f89687g = accountSections;
        this.f89688h = pendingActions;
        this.i = npsItems;
        this.f89689j = widgetsState;
        this.k = productAccountDescriptor$Value;
        this.f89690l = z;
        this.f89691m = tabScreenLoadingConfiguration;
        this.f89692n = z3;
        this.o = num;
        this.f89693p = footerItems;
        this.f89694q = navBarMessage;
        this.f89695r = userProfileAvatarParams;
        this.f89696s = jVar;
        this.f89697t = z4;
        this.u = z6;
        this.v = str;
    }

    public TabAccountsScreenContract$State(Data data, List list, ProductAccountDescriptor$Value productAccountDescriptor$Value, TabScreenLoadingConfiguration tabScreenLoadingConfiguration, boolean z, int i) {
        Data data2 = new Data(null, null, true, 3, null);
        f0 f0Var = f0.f322471a;
        Data data3 = (i & 4) != 0 ? new Data(null, null, true, 3, null) : data;
        Data data4 = new Data(null, null, true, 3, null);
        Data data5 = new Data(f0Var, null, false, 6, null);
        Data data6 = new Data(f0Var, null, false, 6, null);
        List list2 = (i & 64) != 0 ? f0Var : list;
        Data data7 = new Data(null, null, true, 3, null);
        ProductAccountDescriptor$Value productAccountDescriptor$Value2 = (i & 1024) != 0 ? null : productAccountDescriptor$Value;
        TabScreenLoadingConfiguration tabScreenLoadingConfiguration2 = (i & 4096) != 0 ? null : tabScreenLoadingConfiguration;
        itb.b.Companion.getClass();
        this(data2, f0Var, data3, data4, data5, data6, list2, data7, f0Var, j0.f24492a, productAccountDescriptor$Value2, false, tabScreenLoadingConfiguration2, true, null, f0Var, null, itb.b.d, null, false, (i & PKIFailureInfo.badCertTemplate) != 0 ? true : z, null);
    }
}
