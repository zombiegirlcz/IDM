package com.revolut.feature.wealth.ui.api.actions;

import android.os.Parcel;
import android.os.Parcelable;
import hih.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000e\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/actions/WealthAction;", "Landroid/os/Parcelable;", "hih/a", "Trade", "AddMoney", "Withdraw", "MoveMoney", "Documents", "Settings", "Theme", "HoldingsInformation", "TradingAddOns", "TransferInvestments", "Analytics", "StartOnboarding", "TeenJisaStartOnboarding", "InviteFriends", "Lcom/revolut/feature/wealth/ui/api/actions/WealthAction$AddMoney;", "Lcom/revolut/feature/wealth/ui/api/actions/WealthAction$Analytics;", "Lcom/revolut/feature/wealth/ui/api/actions/WealthAction$Documents;", "Lcom/revolut/feature/wealth/ui/api/actions/WealthAction$HoldingsInformation;", "Lcom/revolut/feature/wealth/ui/api/actions/WealthAction$InviteFriends;", "Lcom/revolut/feature/wealth/ui/api/actions/WealthAction$MoveMoney;", "Lcom/revolut/feature/wealth/ui/api/actions/WealthAction$Settings;", "Lcom/revolut/feature/wealth/ui/api/actions/WealthAction$StartOnboarding;", "Lcom/revolut/feature/wealth/ui/api/actions/WealthAction$TeenJisaStartOnboarding;", "Lcom/revolut/feature/wealth/ui/api/actions/WealthAction$Theme;", "Lcom/revolut/feature/wealth/ui/api/actions/WealthAction$Trade;", "Lcom/revolut/feature/wealth/ui/api/actions/WealthAction$TradingAddOns;", "Lcom/revolut/feature/wealth/ui/api/actions/WealthAction$TransferInvestments;", "Lcom/revolut/feature/wealth/ui/api/actions/WealthAction$Withdraw;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WealthAction extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/actions/WealthAction$AddMoney;", "Lcom/revolut/feature/wealth/ui/api/actions/WealthAction;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddMoney implements WealthAction {

        @NotNull
        public static final Parcelable.Creator<AddMoney> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f95867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hih.a f95868b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddMoney(parcel.readInt() != 0, parcel.readInt() == 0 ? null : hih.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddMoney[i];
            }
        }

        public AddMoney(boolean z, hih.a aVar) {
            this.f95867a = z;
            this.f95868b = aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AddMoney)) {
                return false;
            }
            AddMoney addMoney = (AddMoney) obj2;
            return this.f95867a == addMoney.f95867a && this.f95868b == addMoney.f95868b;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f95867a) * 31;
            hih.a aVar = this.f95868b;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        @Override // com.revolut.feature.wealth.ui.api.actions.WealthAction
        /* JADX INFO: renamed from: l, reason: from getter */
        public final hih.a getF95897b() {
            return this.f95868b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f95867a ? 1 : 0);
            hih.a aVar = this.f95868b;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
        }

        @Override // com.revolut.feature.wealth.ui.api.actions.WealthAction
        /* JADX INFO: renamed from: x, reason: from getter */
        public final boolean getF95896a() {
            return this.f95867a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/actions/WealthAction$Analytics;", "Lcom/revolut/feature/wealth/ui/api/actions/WealthAction;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Analytics implements WealthAction {

        @NotNull
        public static final Parcelable.Creator<Analytics> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f95869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hih.a f95870b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Analytics(parcel.readInt() != 0, parcel.readInt() == 0 ? null : hih.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Analytics[i];
            }
        }

        public Analytics(boolean z, hih.a aVar) {
            this.f95869a = z;
            this.f95870b = aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Analytics)) {
                return false;
            }
            Analytics analytics = (Analytics) obj2;
            return this.f95869a == analytics.f95869a && this.f95870b == analytics.f95870b;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f95869a) * 31;
            hih.a aVar = this.f95870b;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        @Override // com.revolut.feature.wealth.ui.api.actions.WealthAction
        /* JADX INFO: renamed from: l, reason: from getter */
        public final hih.a getF95897b() {
            return this.f95870b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f95869a ? 1 : 0);
            hih.a aVar = this.f95870b;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
        }

        @Override // com.revolut.feature.wealth.ui.api.actions.WealthAction
        /* JADX INFO: renamed from: x, reason: from getter */
        public final boolean getF95896a() {
            return this.f95869a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/actions/WealthAction$Documents;", "Lcom/revolut/feature/wealth/ui/api/actions/WealthAction;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Documents implements WealthAction {

        @NotNull
        public static final Parcelable.Creator<Documents> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f95871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hih.a f95872b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Documents(parcel.readInt() != 0, parcel.readInt() == 0 ? null : hih.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Documents[i];
            }
        }

        public /* synthetic */ Documents() {
            this(true, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Documents)) {
                return false;
            }
            Documents documents = (Documents) obj2;
            return this.f95871a == documents.f95871a && this.f95872b == documents.f95872b;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f95871a) * 31;
            hih.a aVar = this.f95872b;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        @Override // com.revolut.feature.wealth.ui.api.actions.WealthAction
        /* JADX INFO: renamed from: l, reason: from getter */
        public final hih.a getF95897b() {
            return this.f95872b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f95871a ? 1 : 0);
            hih.a aVar = this.f95872b;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
        }

        @Override // com.revolut.feature.wealth.ui.api.actions.WealthAction
        /* JADX INFO: renamed from: x, reason: from getter */
        public final boolean getF95896a() {
            return this.f95871a;
        }

        public Documents(boolean z, hih.a aVar) {
            this.f95871a = z;
            this.f95872b = aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/actions/WealthAction$HoldingsInformation;", "Lcom/revolut/feature/wealth/ui/api/actions/WealthAction;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HoldingsInformation implements WealthAction {

        @NotNull
        public static final Parcelable.Creator<HoldingsInformation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f95873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hih.a f95874b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HoldingsInformation(parcel.readInt() != 0, parcel.readInt() == 0 ? null : hih.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HoldingsInformation[i];
            }
        }

        public HoldingsInformation(boolean z, hih.a aVar) {
            this.f95873a = z;
            this.f95874b = aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof HoldingsInformation)) {
                return false;
            }
            HoldingsInformation holdingsInformation = (HoldingsInformation) obj2;
            return this.f95873a == holdingsInformation.f95873a && this.f95874b == holdingsInformation.f95874b;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f95873a) * 31;
            hih.a aVar = this.f95874b;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        @Override // com.revolut.feature.wealth.ui.api.actions.WealthAction
        /* JADX INFO: renamed from: l, reason: from getter */
        public final hih.a getF95897b() {
            return this.f95874b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f95873a ? 1 : 0);
            hih.a aVar = this.f95874b;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
        }

        @Override // com.revolut.feature.wealth.ui.api.actions.WealthAction
        /* JADX INFO: renamed from: x, reason: from getter */
        public final boolean getF95896a() {
            return this.f95873a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/actions/WealthAction$InviteFriends;", "Lcom/revolut/feature/wealth/ui/api/actions/WealthAction;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InviteFriends implements WealthAction {

        @NotNull
        public static final Parcelable.Creator<InviteFriends> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f95875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hih.a f95876b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InviteFriends(parcel.readInt() != 0, parcel.readInt() == 0 ? null : hih.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InviteFriends[i];
            }
        }

        public InviteFriends(boolean z, hih.a aVar) {
            this.f95875a = z;
            this.f95876b = aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InviteFriends)) {
                return false;
            }
            InviteFriends inviteFriends = (InviteFriends) obj2;
            return this.f95875a == inviteFriends.f95875a && this.f95876b == inviteFriends.f95876b;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f95875a) * 31;
            hih.a aVar = this.f95876b;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        @Override // com.revolut.feature.wealth.ui.api.actions.WealthAction
        /* JADX INFO: renamed from: l, reason: from getter */
        public final hih.a getF95897b() {
            return this.f95876b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f95875a ? 1 : 0);
            hih.a aVar = this.f95876b;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
        }

        @Override // com.revolut.feature.wealth.ui.api.actions.WealthAction
        /* JADX INFO: renamed from: x, reason: from getter */
        public final boolean getF95896a() {
            return this.f95875a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/actions/WealthAction$MoveMoney;", "Lcom/revolut/feature/wealth/ui/api/actions/WealthAction;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoveMoney implements WealthAction {

        @NotNull
        public static final Parcelable.Creator<MoveMoney> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f95877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f95878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final hih.a f95879c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MoveMoney(parcel.readInt() == 0 ? null : hih.a.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveMoney[i];
            }
        }

        public MoveMoney(hih.a aVar, boolean z, boolean z3) {
            this.f95877a = z;
            this.f95878b = z3;
            this.f95879c = aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MoveMoney)) {
                return false;
            }
            MoveMoney moveMoney = (MoveMoney) obj2;
            return this.f95877a == moveMoney.f95877a && this.f95878b == moveMoney.f95878b && this.f95879c == moveMoney.f95879c;
        }

        public final int hashCode() {
            int iC = j6.a.c(Boolean.hashCode(this.f95877a) * 31, 31, this.f95878b);
            hih.a aVar = this.f95879c;
            return iC + (aVar == null ? 0 : aVar.hashCode());
        }

        @Override // com.revolut.feature.wealth.ui.api.actions.WealthAction
        /* JADX INFO: renamed from: l, reason: from getter */
        public final hih.a getF95897b() {
            return this.f95879c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f95877a ? 1 : 0);
            dest.writeInt(this.f95878b ? 1 : 0);
            hih.a aVar = this.f95879c;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
        }

        @Override // com.revolut.feature.wealth.ui.api.actions.WealthAction
        /* JADX INFO: renamed from: x */
        public final boolean getF95896a() {
            return this.f95877a || this.f95878b;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/actions/WealthAction$Settings;", "Lcom/revolut/feature/wealth/ui/api/actions/WealthAction;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Settings implements WealthAction {

        @NotNull
        public static final Parcelable.Creator<Settings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f95880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hih.a f95881b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Settings(parcel.readInt() != 0, parcel.readInt() == 0 ? null : hih.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Settings[i];
            }
        }

        public /* synthetic */ Settings() {
            this(true, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Settings)) {
                return false;
            }
            Settings settings = (Settings) obj2;
            return this.f95880a == settings.f95880a && this.f95881b == settings.f95881b;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f95880a) * 31;
            hih.a aVar = this.f95881b;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        @Override // com.revolut.feature.wealth.ui.api.actions.WealthAction
        /* JADX INFO: renamed from: l, reason: from getter */
        public final hih.a getF95897b() {
            return this.f95881b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f95880a ? 1 : 0);
            hih.a aVar = this.f95881b;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
        }

        @Override // com.revolut.feature.wealth.ui.api.actions.WealthAction
        /* JADX INFO: renamed from: x, reason: from getter */
        public final boolean getF95896a() {
            return this.f95880a;
        }

        public Settings(boolean z, hih.a aVar) {
            this.f95880a = z;
            this.f95881b = aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/actions/WealthAction$StartOnboarding;", "Lcom/revolut/feature/wealth/ui/api/actions/WealthAction;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StartOnboarding implements WealthAction {

        @NotNull
        public static final Parcelable.Creator<StartOnboarding> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f95882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hih.a f95883b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StartOnboarding(parcel.readInt() != 0, parcel.readInt() == 0 ? null : hih.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StartOnboarding[i];
            }
        }

        public StartOnboarding() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof StartOnboarding)) {
                return false;
            }
            StartOnboarding startOnboarding = (StartOnboarding) obj2;
            return this.f95882a == startOnboarding.f95882a && this.f95883b == startOnboarding.f95883b;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f95882a) * 31;
            hih.a aVar = this.f95883b;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        @Override // com.revolut.feature.wealth.ui.api.actions.WealthAction
        /* JADX INFO: renamed from: l, reason: from getter */
        public final hih.a getF95897b() {
            return this.f95883b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f95882a ? 1 : 0);
            hih.a aVar = this.f95883b;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
        }

        @Override // com.revolut.feature.wealth.ui.api.actions.WealthAction
        /* JADX INFO: renamed from: x, reason: from getter */
        public final boolean getF95896a() {
            return this.f95882a;
        }

        public /* synthetic */ StartOnboarding(int i) {
            this(true, null);
        }

        public StartOnboarding(boolean z, hih.a aVar) {
            this.f95882a = z;
            this.f95883b = aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/actions/WealthAction$TeenJisaStartOnboarding;", "Lcom/revolut/feature/wealth/ui/api/actions/WealthAction;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TeenJisaStartOnboarding implements WealthAction {

        @NotNull
        public static final Parcelable.Creator<TeenJisaStartOnboarding> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f95884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hih.a f95885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f95886c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TeenJisaStartOnboarding(parcel.readInt() == 0 ? null : hih.a.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TeenJisaStartOnboarding[i];
            }
        }

        public TeenJisaStartOnboarding(hih.a aVar, boolean z, boolean z3) {
            this.f95884a = z;
            this.f95885b = aVar;
            this.f95886c = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TeenJisaStartOnboarding)) {
                return false;
            }
            TeenJisaStartOnboarding teenJisaStartOnboarding = (TeenJisaStartOnboarding) obj2;
            return this.f95884a == teenJisaStartOnboarding.f95884a && this.f95885b == teenJisaStartOnboarding.f95885b && this.f95886c == teenJisaStartOnboarding.f95886c;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f95884a) * 31;
            hih.a aVar = this.f95885b;
            return Boolean.hashCode(this.f95886c) + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31);
        }

        @Override // com.revolut.feature.wealth.ui.api.actions.WealthAction
        /* JADX INFO: renamed from: l, reason: from getter */
        public final hih.a getF95897b() {
            return this.f95885b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f95884a ? 1 : 0);
            hih.a aVar = this.f95885b;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
            dest.writeInt(this.f95886c ? 1 : 0);
        }

        @Override // com.revolut.feature.wealth.ui.api.actions.WealthAction
        /* JADX INFO: renamed from: x, reason: from getter */
        public final boolean getF95896a() {
            return this.f95884a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/actions/WealthAction$Theme;", "Lcom/revolut/feature/wealth/ui/api/actions/WealthAction;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Theme implements WealthAction {

        @NotNull
        public static final Parcelable.Creator<Theme> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f95887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hih.a f95888b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Theme(parcel.readInt() != 0, parcel.readInt() == 0 ? null : hih.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Theme[i];
            }
        }

        public Theme(boolean z, hih.a aVar) {
            this.f95887a = z;
            this.f95888b = aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Theme)) {
                return false;
            }
            Theme theme = (Theme) obj2;
            return this.f95887a == theme.f95887a && this.f95888b == theme.f95888b;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f95887a) * 31;
            hih.a aVar = this.f95888b;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        @Override // com.revolut.feature.wealth.ui.api.actions.WealthAction
        /* JADX INFO: renamed from: l, reason: from getter */
        public final hih.a getF95897b() {
            return this.f95888b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f95887a ? 1 : 0);
            hih.a aVar = this.f95888b;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
        }

        @Override // com.revolut.feature.wealth.ui.api.actions.WealthAction
        /* JADX INFO: renamed from: x, reason: from getter */
        public final boolean getF95896a() {
            return this.f95887a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/actions/WealthAction$Trade;", "Lcom/revolut/feature/wealth/ui/api/actions/WealthAction;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Trade implements WealthAction {

        @NotNull
        public static final Parcelable.Creator<Trade> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f95889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hih.a f95890b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Trade(parcel.readInt() != 0, parcel.readInt() == 0 ? null : hih.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Trade[i];
            }
        }

        public /* synthetic */ Trade() {
            this(true, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Trade)) {
                return false;
            }
            Trade trade = (Trade) obj2;
            return this.f95889a == trade.f95889a && this.f95890b == trade.f95890b;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f95889a) * 31;
            hih.a aVar = this.f95890b;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        @Override // com.revolut.feature.wealth.ui.api.actions.WealthAction
        /* JADX INFO: renamed from: l, reason: from getter */
        public final hih.a getF95897b() {
            return this.f95890b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f95889a ? 1 : 0);
            hih.a aVar = this.f95890b;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
        }

        @Override // com.revolut.feature.wealth.ui.api.actions.WealthAction
        /* JADX INFO: renamed from: x, reason: from getter */
        public final boolean getF95896a() {
            return this.f95889a;
        }

        public Trade(boolean z, hih.a aVar) {
            this.f95889a = z;
            this.f95890b = aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/actions/WealthAction$TradingAddOns;", "Lcom/revolut/feature/wealth/ui/api/actions/WealthAction;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TradingAddOns implements WealthAction {

        @NotNull
        public static final Parcelable.Creator<TradingAddOns> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f95891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hih.a f95892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f95893c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TradingAddOns(parcel.readInt() == 0 ? null : hih.a.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TradingAddOns[i];
            }
        }

        public TradingAddOns(hih.a aVar, boolean z, boolean z3) {
            this.f95891a = z;
            this.f95892b = aVar;
            this.f95893c = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TradingAddOns)) {
                return false;
            }
            TradingAddOns tradingAddOns = (TradingAddOns) obj2;
            return this.f95891a == tradingAddOns.f95891a && this.f95892b == tradingAddOns.f95892b && this.f95893c == tradingAddOns.f95893c;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f95891a) * 31;
            hih.a aVar = this.f95892b;
            return Boolean.hashCode(this.f95893c) + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31);
        }

        @Override // com.revolut.feature.wealth.ui.api.actions.WealthAction
        /* JADX INFO: renamed from: l, reason: from getter */
        public final hih.a getF95897b() {
            return this.f95892b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f95891a ? 1 : 0);
            hih.a aVar = this.f95892b;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
            dest.writeInt(this.f95893c ? 1 : 0);
        }

        @Override // com.revolut.feature.wealth.ui.api.actions.WealthAction
        /* JADX INFO: renamed from: x, reason: from getter */
        public final boolean getF95896a() {
            return this.f95891a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/actions/WealthAction$TransferInvestments;", "Lcom/revolut/feature/wealth/ui/api/actions/WealthAction;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransferInvestments implements WealthAction {

        @NotNull
        public static final Parcelable.Creator<TransferInvestments> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f95894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hih.a f95895b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransferInvestments(parcel.readInt() != 0, parcel.readInt() == 0 ? null : hih.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransferInvestments[i];
            }
        }

        public TransferInvestments(boolean z, hih.a aVar) {
            this.f95894a = z;
            this.f95895b = aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TransferInvestments)) {
                return false;
            }
            TransferInvestments transferInvestments = (TransferInvestments) obj2;
            return this.f95894a == transferInvestments.f95894a && this.f95895b == transferInvestments.f95895b;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f95894a) * 31;
            hih.a aVar = this.f95895b;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        @Override // com.revolut.feature.wealth.ui.api.actions.WealthAction
        /* JADX INFO: renamed from: l, reason: from getter */
        public final hih.a getF95897b() {
            return this.f95895b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f95894a ? 1 : 0);
            hih.a aVar = this.f95895b;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
        }

        @Override // com.revolut.feature.wealth.ui.api.actions.WealthAction
        /* JADX INFO: renamed from: x, reason: from getter */
        public final boolean getF95896a() {
            return this.f95894a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/actions/WealthAction$Withdraw;", "Lcom/revolut/feature/wealth/ui/api/actions/WealthAction;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Withdraw implements WealthAction {

        @NotNull
        public static final Parcelable.Creator<Withdraw> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f95896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hih.a f95897b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Withdraw(parcel.readInt() != 0, parcel.readInt() == 0 ? null : hih.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Withdraw[i];
            }
        }

        public Withdraw(boolean z, hih.a aVar) {
            this.f95896a = z;
            this.f95897b = aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Withdraw)) {
                return false;
            }
            Withdraw withdraw = (Withdraw) obj2;
            return this.f95896a == withdraw.f95896a && this.f95897b == withdraw.f95897b;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f95896a) * 31;
            hih.a aVar = this.f95897b;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        @Override // com.revolut.feature.wealth.ui.api.actions.WealthAction
        /* JADX INFO: renamed from: l, reason: from getter */
        public final hih.a getF95897b() {
            return this.f95897b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f95896a ? 1 : 0);
            hih.a aVar = this.f95897b;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
        }

        @Override // com.revolut.feature.wealth.ui.api.actions.WealthAction
        /* JADX INFO: renamed from: x, reason: from getter */
        public final boolean getF95896a() {
            return this.f95896a;
        }
    }

    /* JADX INFO: renamed from: l */
    a getF95897b();

    /* JADX INFO: renamed from: x */
    boolean getF95896a();
}
