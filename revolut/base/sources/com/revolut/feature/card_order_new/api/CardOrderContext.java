package com.revolut.feature.card_order_new.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/card_order_new/api/CardOrderContext;", "Landroid/os/Parcelable;", "Default", "CreditCardApplication", "Lcom/revolut/feature/card_order_new/api/CardOrderContext$CreditCardApplication;", "Lcom/revolut/feature/card_order_new/api/CardOrderContext$Default;", "feature_card_order_new_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CardOrderContext extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/api/CardOrderContext$CreditCardApplication;", "Lcom/revolut/feature/card_order_new/api/CardOrderContext;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreditCardApplication implements CardOrderContext {

        @NotNull
        public static final Parcelable.Creator<CreditCardApplication> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f64937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f64938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BackConfirmationDialog f64939c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreditCardApplication(parcel.readInt(), parcel.readInt() != 0, BackConfirmationDialog.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditCardApplication[i];
            }
        }

        public CreditCardApplication(int i, boolean z, BackConfirmationDialog backConfirmationDialog) {
            Intrinsics.checkNotNullParameter(backConfirmationDialog, "backConfirmationDialog");
            this.f64937a = i;
            this.f64938b = z;
            this.f64939c = backConfirmationDialog;
        }

        @Override // com.revolut.feature.card_order_new.api.CardOrderContext
        /* JADX INFO: renamed from: X7, reason: from getter */
        public final boolean getF64941b() {
            return this.f64938b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreditCardApplication)) {
                return false;
            }
            CreditCardApplication creditCardApplication = (CreditCardApplication) obj2;
            return this.f64937a == creditCardApplication.f64937a && this.f64938b == creditCardApplication.f64938b && Intrinsics.f(this.f64939c, creditCardApplication.f64939c);
        }

        @Override // com.revolut.feature.card_order_new.api.CardOrderContext
        /* JADX INFO: renamed from: h0, reason: from getter */
        public final int getF64940a() {
            return this.f64937a;
        }

        public final int hashCode() {
            return this.f64939c.hashCode() + j6.a.c(Integer.hashCode(this.f64937a) * 31, 31, this.f64938b);
        }

        @Override // com.revolut.feature.card_order_new.api.CardOrderContext
        /* JADX INFO: renamed from: j5, reason: from getter */
        public final BackConfirmationDialog getF64942c() {
            return this.f64939c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f64937a);
            dest.writeInt(this.f64938b ? 1 : 0);
            this.f64939c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/api/CardOrderContext$Default;", "Lcom/revolut/feature/card_order_new/api/CardOrderContext;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Default implements CardOrderContext {

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f64940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f64941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BackConfirmationDialog f64942c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Default(parcel.readInt(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : BackConfirmationDialog.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        public Default() {
            this(0);
        }

        @Override // com.revolut.feature.card_order_new.api.CardOrderContext
        /* JADX INFO: renamed from: X7, reason: from getter */
        public final boolean getF64941b() {
            return this.f64941b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Default)) {
                return false;
            }
            Default r56 = (Default) obj2;
            return this.f64940a == r56.f64940a && this.f64941b == r56.f64941b && Intrinsics.f(this.f64942c, r56.f64942c);
        }

        @Override // com.revolut.feature.card_order_new.api.CardOrderContext
        /* JADX INFO: renamed from: h0, reason: from getter */
        public final int getF64940a() {
            return this.f64940a;
        }

        public final int hashCode() {
            int iC = j6.a.c(Integer.hashCode(this.f64940a) * 31, 31, this.f64941b);
            BackConfirmationDialog backConfirmationDialog = this.f64942c;
            return iC + (backConfirmationDialog == null ? 0 : backConfirmationDialog.hashCode());
        }

        @Override // com.revolut.feature.card_order_new.api.CardOrderContext
        /* JADX INFO: renamed from: j5, reason: from getter */
        public final BackConfirmationDialog getF64942c() {
            return this.f64942c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f64940a);
            dest.writeInt(this.f64941b ? 1 : 0);
            BackConfirmationDialog backConfirmationDialog = this.f64942c;
            if (backConfirmationDialog == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                backConfirmationDialog.writeToParcel(dest, i);
            }
        }

        public Default(int i, boolean z, BackConfirmationDialog backConfirmationDialog) {
            this.f64940a = i;
            this.f64941b = z;
            this.f64942c = backConfirmationDialog;
        }

        public /* synthetic */ Default(int i) {
            this(R$drawable.uikit_icn_24_back_button_arrow, true, null);
        }
    }

    /* JADX INFO: renamed from: X7 */
    boolean getF64941b();

    /* JADX INFO: renamed from: h0 */
    int getF64940a();

    /* JADX INFO: renamed from: j5 */
    BackConfirmationDialog getF64942c();
}
