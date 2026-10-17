package com.revolut.feature.credit.autopay.ui.screen.confirm_autopay;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/autopay/ui/screen/confirm_autopay/ConfirmAutopayContract$ScreenConfig", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "BackUpCardInfoDialogConfig", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConfirmAutopayContract$ScreenConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ConfirmAutopayContract$ScreenConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f68632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f68633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f68634c;
    public final BackUpCardInfoDialogConfig d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/autopay/ui/screen/confirm_autopay/ConfirmAutopayContract$ScreenConfig$BackUpCardInfoDialogConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BackUpCardInfoDialogConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<BackUpCardInfoDialogConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f68635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f68636b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BackUpCardInfoDialogConfig((Clause) parcel.readParcelable(BackUpCardInfoDialogConfig.class.getClassLoader()), (Clause) parcel.readParcelable(BackUpCardInfoDialogConfig.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BackUpCardInfoDialogConfig[i];
            }
        }

        public BackUpCardInfoDialogConfig(Clause title, Clause description) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.f68635a = title;
            this.f68636b = description;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BackUpCardInfoDialogConfig)) {
                return false;
            }
            BackUpCardInfoDialogConfig backUpCardInfoDialogConfig = (BackUpCardInfoDialogConfig) obj2;
            return Intrinsics.f(this.f68635a, backUpCardInfoDialogConfig.f68635a) && Intrinsics.f(this.f68636b, backUpCardInfoDialogConfig.f68636b);
        }

        public final int hashCode() {
            return this.f68636b.hashCode() + (this.f68635a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f68635a, i);
            dest.writeParcelable(this.f68636b, i);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConfirmAutopayContract$ScreenConfig((Clause) parcel.readParcelable(ConfirmAutopayContract$ScreenConfig.class.getClassLoader()), (Clause) parcel.readParcelable(ConfirmAutopayContract$ScreenConfig.class.getClassLoader()), (Clause) parcel.readParcelable(ConfirmAutopayContract$ScreenConfig.class.getClassLoader()), BackUpCardInfoDialogConfig.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ConfirmAutopayContract$ScreenConfig[i];
        }
    }

    public ConfirmAutopayContract$ScreenConfig() {
        this(null, null, null, null, 15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ConfirmAutopayContract$ScreenConfig)) {
            return false;
        }
        ConfirmAutopayContract$ScreenConfig confirmAutopayContract$ScreenConfig = (ConfirmAutopayContract$ScreenConfig) obj2;
        return Intrinsics.f(this.f68632a, confirmAutopayContract$ScreenConfig.f68632a) && Intrinsics.f(this.f68633b, confirmAutopayContract$ScreenConfig.f68633b) && Intrinsics.f(this.f68634c, confirmAutopayContract$ScreenConfig.f68634c) && Intrinsics.f(this.d, confirmAutopayContract$ScreenConfig.d);
    }

    public final int hashCode() {
        int iA = p.a.a(this.f68632a.hashCode() * 31, 31, this.f68633b);
        Clause clause = this.f68634c;
        return this.d.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f68632a, i);
        dest.writeParcelable(this.f68633b, i);
        dest.writeParcelable(this.f68634c, i);
        this.d.writeToParcel(dest, i);
    }

    public ConfirmAutopayContract$ScreenConfig(Clause title, Clause description, Clause clause, BackUpCardInfoDialogConfig backUpCardInfoDialogConfig) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(backUpCardInfoDialogConfig, "backUpCardInfoDialogConfig");
        this.f68632a = title;
        this.f68633b = description;
        this.f68634c = clause;
        this.d = backUpCardInfoDialogConfig;
    }

    public /* synthetic */ ConfirmAutopayContract$ScreenConfig(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3, BackUpCardInfoDialogConfig backUpCardInfoDialogConfig, int i) {
        this((i & 1) != 0 ? new TextLocalisedClause(R$string.credit_autopay_ach_confirm_title, null, null, 14) : textLocalisedClause, (i & 2) != 0 ? new TextLocalisedClause(R$string.credit_autopay_ach_confirm_subtitle, null, null, 14) : textLocalisedClause2, (i & 4) != 0 ? null : textLocalisedClause3, (i & 8) != 0 ? new BackUpCardInfoDialogConfig(new TextLocalisedClause(R$string.credit_management_backup_card, null, null, 14), new TextLocalisedClause(R$string.credit_card_back_up_card_add_popup_description, null, null, 14)) : backUpCardInfoDialogConfig);
    }
}
