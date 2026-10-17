package com.revolut.feature.tab.accounts.api.mode;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.tab.accounts.api.model.spaces.ProductContext;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pie.v;
import rfe.n;
import rfe.o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/mode/TabAccountsMode;", "Landroid/os/Parcelable;", "Companion", "rfe/n", "Home", "Credit", "a", "Lcom/revolut/feature/tab/accounts/api/mode/TabAccountsMode$Credit;", "Lcom/revolut/feature/tab/accounts/api/mode/TabAccountsMode$Home;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TabAccountsMode extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f89470a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/mode/TabAccountsMode$Credit;", "Lcom/revolut/feature/tab/accounts/api/mode/TabAccountsMode;", "<init>", "()V", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Credit implements TabAccountsMode {

        @NotNull
        public static final Parcelable.Creator<Credit> CREATOR;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Credit f89462a = new Credit();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final o f89463b = o.CREDIT;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ProductContext f89464c = new ProductContext(ProductId.CREDIT, ProductSpaceIdentifier.Personal.f89749c, v.CREDIT);
        public static final String d = "CREDIT_ACCOUNTS_TAB_STORAGE";
        public static final n e;
        public static final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f89465g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Credit.f89462a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Credit[i];
            }
        }

        static {
            Intrinsics.checkNotNullParameter("CREDIT_LAST_SELECTED_ACCOUNT_DESCRIPTOR_KEY", "lastSelectedDescriptor");
            Intrinsics.checkNotNullParameter("CREDIT_LAST_SELECTED_ACCOUNT_PAYLOAD_KEY", "lastSelectedPayload");
            Intrinsics.checkNotNullParameter("CREDIT_LAST_SELECTED_ACCOUNT_METADATA_KEY", "lastSelectedMetadata");
            Intrinsics.checkNotNullParameter("CREDIT_ACCOUNT_SWITCHER_COLLAPSED_SECTIONS", "id");
            Intrinsics.checkNotNullParameter("ACCOUNT_SWITCHER_FAVOURITES", "id");
            Intrinsics.checkNotNullParameter("CREDIT_ACCOUNT_SWITCHER_ITEMS_ORDER", "id");
            Intrinsics.checkNotNullParameter("CREDIT_HIDDEN_DISCOVER_ITEMS", "id");
            e = new n("CREDIT_ACCOUNT_SWITCHER_COLLAPSED_SECTIONS", "CREDIT_ACCOUNT_SWITCHER_ITEMS_ORDER", "CREDIT_HIDDEN_DISCOVER_ITEMS");
            f = "CreditTabAccountsScreenModel";
            f89465g = "CreditAccountSpacesScreenModel";
            CREATOR = new a();
        }

        private Credit() {
        }

        @Override // com.revolut.feature.tab.accounts.api.mode.TabAccountsMode
        public final String H5() {
            return f;
        }

        @Override // com.revolut.feature.tab.accounts.api.mode.TabAccountsMode
        public final String J1() {
            return d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.tab.accounts.api.mode.TabAccountsMode
        public final String f3() {
            return f89465g;
        }

        @Override // com.revolut.feature.tab.accounts.api.mode.TabAccountsMode
        public final o getId() {
            return f89463b;
        }

        @Override // com.revolut.feature.tab.accounts.api.mode.TabAccountsMode
        public final n h2() {
            return e;
        }

        @Override // com.revolut.feature.tab.accounts.api.mode.TabAccountsMode
        public final ProductContext p8() {
            return f89464c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/mode/TabAccountsMode$Home;", "Lcom/revolut/feature/tab/accounts/api/mode/TabAccountsMode;", "<init>", "()V", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Home implements TabAccountsMode {

        @NotNull
        public static final Parcelable.Creator<Home> CREATOR;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Home f89466a = new Home();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final o f89467b = o.HOME;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ProductContext f89468c = new ProductContext(ProductId.CURRENCY, ProductSpaceIdentifier.Personal.f89749c, v.ACCOUNTS);
        public static final String d = "ACCOUNTS_TAB_STORAGE";
        public static final n e;
        public static final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f89469g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Home.f89466a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Home[i];
            }
        }

        static {
            Intrinsics.checkNotNullParameter("LAST_SELECTED_ACCOUNT_DESCRIPTOR_KEY_V2", "lastSelectedDescriptor");
            Intrinsics.checkNotNullParameter("LAST_SELECTED_ACCOUNT_PAYLOAD_KEY", "lastSelectedPayload");
            Intrinsics.checkNotNullParameter("LAST_SELECTED_ACCOUNT_METADATA_KEY", "lastSelectedMetadata");
            Intrinsics.checkNotNullParameter("HOME_ACCOUNT_SWITCHER_COLLAPSED_SECTIONS", "id");
            Intrinsics.checkNotNullParameter("ACCOUNT_SWITCHER_FAVOURITES", "id");
            Intrinsics.checkNotNullParameter("HOME_ACCOUNT_SWITCHER_ITEMS_ORDER", "id");
            Intrinsics.checkNotNullParameter("HIDDEN_DISCOVER_ITEMS", "id");
            e = new n("HOME_ACCOUNT_SWITCHER_COLLAPSED_SECTIONS", "HOME_ACCOUNT_SWITCHER_ITEMS_ORDER", "HIDDEN_DISCOVER_ITEMS");
            f = "TabAccountsScreenModel";
            f89469g = "AccountSpacesScreenModel";
            CREATOR = new a();
        }

        private Home() {
        }

        @Override // com.revolut.feature.tab.accounts.api.mode.TabAccountsMode
        public final String H5() {
            return f;
        }

        @Override // com.revolut.feature.tab.accounts.api.mode.TabAccountsMode
        public final String J1() {
            return d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.tab.accounts.api.mode.TabAccountsMode
        public final String f3() {
            return f89469g;
        }

        @Override // com.revolut.feature.tab.accounts.api.mode.TabAccountsMode
        public final o getId() {
            return f89467b;
        }

        @Override // com.revolut.feature.tab.accounts.api.mode.TabAccountsMode
        public final n h2() {
            return e;
        }

        @Override // com.revolut.feature.tab.accounts.api.mode.TabAccountsMode
        public final ProductContext p8() {
            return f89468c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.tab.accounts.api.mode.TabAccountsMode$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f89470a = new Companion();

        private Companion() {
        }
    }

    String H5();

    String J1();

    String f3();

    o getId();

    n h2();

    ProductContext p8();
}
