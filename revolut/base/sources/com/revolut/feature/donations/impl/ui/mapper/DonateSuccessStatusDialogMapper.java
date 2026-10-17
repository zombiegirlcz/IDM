package com.revolut.feature.donations.impl.ui.mapper;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.o9;
import b93.b;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.donations.impl.R$string;
import dj0.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class DonateSuccessStatusDialogMapper {

    @NotNull
    public static final a Companion = new a();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/mapper/DonateSuccessStatusDialogMapper$CampaignUnlocked;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CampaignUnlocked implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CampaignUnlocked> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f72112a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CampaignUnlocked((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CampaignUnlocked[i];
            }
        }

        public CampaignUnlocked(b cardCode) {
            Intrinsics.checkNotNullParameter(cardCode, "cardCode");
            this.f72112a = cardCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CampaignUnlocked) && Intrinsics.f(this.f72112a, ((CampaignUnlocked) obj2).f72112a);
        }

        public final int hashCode() {
            return this.f72112a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f72112a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/mapper/DonateSuccessStatusDialogMapper$SuccessUrl;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SuccessUrl implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SuccessUrl> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72113a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SuccessUrl(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SuccessUrl[i];
            }
        }

        public SuccessUrl(String url2) {
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f72113a = url2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SuccessUrl) && Intrinsics.f(this.f72113a, ((SuccessUrl) obj2).f72113a);
        }

        public final int hashCode() {
            return this.f72113a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72113a);
        }
    }

    public static final class a {
        private a() {
        }
    }

    public static TextLocalisedClause a(d dVar, String str, wi0.b bVar) {
        wi0.b.Companion.getClass();
        return Intrinsics.f(bVar, wi0.b.X0) ? new TextLocalisedClause(R$string.charity_donation_success_jp_title, null, null, 14) : new TextLocalisedClause(R$string.charity_donation_success_title, v.k(new MoneyClause(dVar, new MoneyClause.Format.Shorts(false, 63), null, null, 12), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
    }
}
