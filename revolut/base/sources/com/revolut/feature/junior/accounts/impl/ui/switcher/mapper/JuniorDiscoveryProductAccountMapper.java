package com.revolut.feature.junior.accounts.impl.ui.switcher.mapper;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes4.dex */
public final class JuniorDiscoveryProductAccountMapper {

    @NotNull
    public static final a Companion = new a();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/accounts/impl/ui/switcher/mapper/JuniorDiscoveryProductAccountMapper$DiscoverMulticurrencyItemParcel;", "Lcom/revolut/feature/tab/accounts/models/ProductAccountId$Payload;", "", "toString", "()Ljava/lang/String;", "feature_junior_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DiscoverMulticurrencyItemParcel implements ProductAccountId.Payload {

        @NotNull
        public static final Parcelable.Creator<DiscoverMulticurrencyItemParcel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f76705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f76706c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DiscoverMulticurrencyItemParcel(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DiscoverMulticurrencyItemParcel[i];
            }
        }

        public DiscoverMulticurrencyItemParcel(String juniorId, String walletId, String firstName) {
            Intrinsics.checkNotNullParameter(juniorId, "juniorId");
            Intrinsics.checkNotNullParameter(walletId, "walletId");
            Intrinsics.checkNotNullParameter(firstName, "firstName");
            this.f76704a = juniorId;
            this.f76705b = walletId;
            this.f76706c = firstName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DiscoverMulticurrencyItemParcel)) {
                return false;
            }
            DiscoverMulticurrencyItemParcel discoverMulticurrencyItemParcel = (DiscoverMulticurrencyItemParcel) obj2;
            return Intrinsics.f(this.f76704a, discoverMulticurrencyItemParcel.f76704a) && Intrinsics.f(this.f76705b, discoverMulticurrencyItemParcel.f76705b) && Intrinsics.f(this.f76706c, discoverMulticurrencyItemParcel.f76706c);
        }

        public final int hashCode() {
            return this.f76706c.hashCode() + p.a.c(this.f76704a.hashCode() * 31, 31, this.f76705b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76704a);
            dest.writeString(this.f76705b);
            dest.writeString(this.f76706c);
        }
    }

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model.MainImage.Image40 a(int i) {
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i2 = R$attr.uikit_colorAccentNeutral;
        Color.Solid solid = new Color.Solid(i2);
        return new RowDelegate.Model.MainImage.Image40(y.h(new Color.Solid(i2), 0.1f, companion, i, solid), null, null, false, null, false, 60);
    }
}
