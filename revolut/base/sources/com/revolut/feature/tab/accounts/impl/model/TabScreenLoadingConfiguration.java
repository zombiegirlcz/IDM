package com.revolut.feature.tab.accounts.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000e\u0010\tR\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/revolut/feature/tab/accounts/impl/model/TabScreenLoadingConfiguration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "", "a", "I", "c", "()I", "newsBannersCount", "b", "e", "slotManagerItemsCount", "d", "pendingActionsCount", "accountSectionsCount", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TabScreenLoadingConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TabScreenLoadingConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("newsBannersCount")
    private final int newsBannersCount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("slotManagerItemsCount")
    private final int slotManagerItemsCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("pendingActionsCount")
    private final int pendingActionsCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("accountSectionsCount")
    private final int accountSectionsCount;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TabScreenLoadingConfiguration(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), 16);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TabScreenLoadingConfiguration[i];
        }
    }

    public TabScreenLoadingConfiguration() {
        this(0, 0, 0, 0, 31);
    }

    public static TabScreenLoadingConfiguration a(TabScreenLoadingConfiguration tabScreenLoadingConfiguration) {
        return new TabScreenLoadingConfiguration(tabScreenLoadingConfiguration.newsBannersCount, tabScreenLoadingConfiguration.slotManagerItemsCount, tabScreenLoadingConfiguration.pendingActionsCount, tabScreenLoadingConfiguration.accountSectionsCount, true);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAccountSectionsCount() {
        return this.accountSectionsCount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getNewsBannersCount() {
        return this.newsBannersCount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getPendingActionsCount() {
        return this.pendingActionsCount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getSlotManagerItemsCount() {
        return this.slotManagerItemsCount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TabScreenLoadingConfiguration)) {
            return false;
        }
        TabScreenLoadingConfiguration tabScreenLoadingConfiguration = (TabScreenLoadingConfiguration) obj2;
        return this.newsBannersCount == tabScreenLoadingConfiguration.newsBannersCount && this.slotManagerItemsCount == tabScreenLoadingConfiguration.slotManagerItemsCount && this.pendingActionsCount == tabScreenLoadingConfiguration.pendingActionsCount && this.accountSectionsCount == tabScreenLoadingConfiguration.accountSectionsCount && this.e == tabScreenLoadingConfiguration.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.b(this.accountSectionsCount, j6.a.b(this.pendingActionsCount, j6.a.b(this.slotManagerItemsCount, Integer.hashCode(this.newsBannersCount) * 31, 31), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.newsBannersCount);
        dest.writeInt(this.slotManagerItemsCount);
        dest.writeInt(this.pendingActionsCount);
        dest.writeInt(this.accountSectionsCount);
    }

    public TabScreenLoadingConfiguration(int i, int i2, int i3, int i5, boolean z) {
        this.newsBannersCount = i;
        this.slotManagerItemsCount = i2;
        this.pendingActionsCount = i3;
        this.accountSectionsCount = i5;
        this.e = z;
    }

    public /* synthetic */ TabScreenLoadingConfiguration(int i, int i2, int i3, int i5, int i6) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i5, false);
    }
}
