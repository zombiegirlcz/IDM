package com.revolut.feature.security_hub.impl.ui.linked_wallets.host;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import h93.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vuc.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/security_hub/impl/ui/linked_wallets/host/LinkedWalletsScreenContract$TabItem", "Lcom/revolut/kompot/navigable/vc/pager/PagerItem;", "CommonTabItem", "WalletsTabItem", "Lcom/revolut/feature/security_hub/impl/ui/linked_wallets/host/LinkedWalletsScreenContract$TabItem$CommonTabItem;", "Lcom/revolut/feature/security_hub/impl/ui/linked_wallets/host/LinkedWalletsScreenContract$TabItem$WalletsTabItem;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LinkedWalletsScreenContract$TabItem extends PagerItem {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/linked_wallets/host/LinkedWalletsScreenContract$TabItem$WalletsTabItem;", "Lcom/revolut/feature/security_hub/impl/ui/linked_wallets/host/LinkedWalletsScreenContract$TabItem;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WalletsTabItem implements LinkedWalletsScreenContract$TabItem {

        @NotNull
        public static final Parcelable.Creator<WalletsTabItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f0 f85609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f85610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Throwable f85611c;
        public final Boolean d;
        public final m e = m.WALLETS;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                f0 f0Var = (f0) parcel.readSerializable();
                Boolean boolValueOf = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(LinkedWalletsScreenContract$WalletConnectionSection.CREATOR, parcel, arrayList, iA, 1);
                    }
                }
                Throwable th10 = (Throwable) parcel.readSerializable();
                if (parcel.readInt() != 0) {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new WalletsTabItem(f0Var, arrayList, th10, boolValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WalletsTabItem[i];
            }
        }

        public WalletsTabItem(f0 f0Var, List list, Throwable th10, Boolean bool) {
            this.f85609a = f0Var;
            this.f85610b = list;
            this.f85611c = th10;
            this.d = bool;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WalletsTabItem)) {
                return false;
            }
            WalletsTabItem walletsTabItem = (WalletsTabItem) obj2;
            return Intrinsics.f(this.f85609a, walletsTabItem.f85609a) && Intrinsics.f(this.f85610b, walletsTabItem.f85610b) && Intrinsics.f(this.f85611c, walletsTabItem.f85611c) && Intrinsics.f(this.d, walletsTabItem.d);
        }

        @Override // com.revolut.feature.security_hub.impl.ui.linked_wallets.host.LinkedWalletsScreenContract$TabItem
        /* JADX INFO: renamed from: getType, reason: from getter */
        public final m getE() {
            return this.e;
        }

        public final int hashCode() {
            f0 f0Var = this.f85609a;
            int iHashCode = (f0Var == null ? 0 : f0Var.hashCode()) * 31;
            List list = this.f85610b;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            Throwable th10 = this.f85611c;
            int iHashCode3 = (iHashCode2 + (th10 == null ? 0 : th10.hashCode())) * 31;
            Boolean bool = this.d;
            return iHashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f85609a);
            List list = this.f85610b;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = v0.a.q(dest, 1, list);
                while (itQ.hasNext()) {
                    ((LinkedWalletsScreenContract$WalletConnectionSection) itQ.next()).writeToParcel(dest, i);
                }
            }
            dest.writeSerializable(this.f85611c);
            Boolean bool = this.d;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool);
            }
        }
    }

    @Override // com.revolut.kompot.navigable.vc.pager.PagerItem
    /* JADX INFO: renamed from: getId */
    default String getF79006a() {
        return getE().getId();
    }

    /* JADX INFO: renamed from: getType */
    m getE();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/linked_wallets/host/LinkedWalletsScreenContract$TabItem$CommonTabItem;", "Lcom/revolut/feature/security_hub/impl/ui/linked_wallets/host/LinkedWalletsScreenContract$TabItem;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CommonTabItem implements LinkedWalletsScreenContract$TabItem {

        @NotNull
        public static final Parcelable.Creator<CommonTabItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f85606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f85607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Throwable f85608c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                m mVarValueOf = m.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(LinkedWalletsScreenContract$CardConnectionSection.CREATOR, parcel, arrayList2, iA, 1);
                    }
                    arrayList = arrayList2;
                }
                return new CommonTabItem(mVarValueOf, arrayList, (Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CommonTabItem[i];
            }
        }

        public CommonTabItem(m type, List list, Throwable th10) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f85606a = type;
            this.f85607b = list;
            this.f85608c = th10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CommonTabItem)) {
                return false;
            }
            CommonTabItem commonTabItem = (CommonTabItem) obj2;
            return this.f85606a == commonTabItem.f85606a && Intrinsics.f(this.f85607b, commonTabItem.f85607b) && Intrinsics.f(this.f85608c, commonTabItem.f85608c);
        }

        @Override // com.revolut.feature.security_hub.impl.ui.linked_wallets.host.LinkedWalletsScreenContract$TabItem
        /* JADX INFO: renamed from: getType, reason: from getter */
        public final m getE() {
            return this.f85606a;
        }

        public final int hashCode() {
            int iHashCode = this.f85606a.hashCode() * 31;
            List list = this.f85607b;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            Throwable th10 = this.f85608c;
            return iHashCode2 + (th10 != null ? th10.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85606a.name());
            List list = this.f85607b;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = v0.a.q(dest, 1, list);
                while (itQ.hasNext()) {
                    ((LinkedWalletsScreenContract$CardConnectionSection) itQ.next()).writeToParcel(dest, i);
                }
            }
            dest.writeSerializable(this.f85608c);
        }

        public CommonTabItem() {
            this(m.WALLETS, null, null);
        }
    }
}
