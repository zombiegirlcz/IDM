package com.revolut.feature.vaults.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import pcd.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/vaults/api/navigation/VaultsFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "EditRecurringTransfer", "Withdraw", "OneTimeFunding", "Lcom/revolut/feature/vaults/api/navigation/VaultsFeatureConfig$EditRecurringTransfer;", "Lcom/revolut/feature/vaults/api/navigation/VaultsFeatureConfig$OneTimeFunding;", "Lcom/revolut/feature/vaults/api/navigation/VaultsFeatureConfig$Withdraw;", "feature_vaults_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class VaultsFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/vaults/api/navigation/VaultsFeatureConfig$OneTimeFunding;", "Lcom/revolut/feature/vaults/api/navigation/VaultsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_vaults_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OneTimeFunding extends VaultsFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<OneTimeFunding> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f94706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f94707b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OneTimeFunding((s) parcel.readSerializable(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OneTimeFunding[i];
            }
        }

        public OneTimeFunding(s vault, d dVar) {
            Intrinsics.checkNotNullParameter(vault, "vault");
            this.f94706a = vault;
            this.f94707b = dVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OneTimeFunding)) {
                return false;
            }
            OneTimeFunding oneTimeFunding = (OneTimeFunding) obj2;
            return Intrinsics.f(this.f94706a, oneTimeFunding.f94706a) && Intrinsics.f(this.f94707b, oneTimeFunding.f94707b);
        }

        public final int hashCode() {
            int iHashCode = this.f94706a.hashCode() * 31;
            d dVar = this.f94707b;
            return iHashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f94706a);
            dest.writeSerializable(this.f94707b);
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/vaults/api/navigation/VaultsFeatureConfig$Withdraw;", "Lcom/revolut/feature/vaults/api/navigation/VaultsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_vaults_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Withdraw extends VaultsFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Withdraw> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f94708a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Withdraw((s) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Withdraw[i];
            }
        }

        public Withdraw(s vault) {
            Intrinsics.checkNotNullParameter(vault, "vault");
            this.f94708a = vault;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Withdraw) && Intrinsics.f(this.f94708a, ((Withdraw) obj2).f94708a);
        }

        public final int hashCode() {
            return this.f94708a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f94708a);
        }
    }

    private VaultsFeatureConfig() {
    }

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/vaults/api/navigation/VaultsFeatureConfig$EditRecurringTransfer;", "Lcom/revolut/feature/vaults/api/navigation/VaultsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_vaults_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditRecurringTransfer extends VaultsFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<EditRecurringTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f94704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f94705c;
        public final Integer d;
        public final TransferScheduleData e;
        public final Long f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditRecurringTransfer(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (TransferScheduleData) parcel.readParcelable(EditRecurringTransfer.class.getClassLoader()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditRecurringTransfer[i];
            }
        }

        public EditRecurringTransfer(String vaultId, String currencyCode, boolean z, Integer num, TransferScheduleData transferScheduleData, Long l2) {
            Intrinsics.checkNotNullParameter(vaultId, "vaultId");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            this.f94703a = vaultId;
            this.f94704b = currencyCode;
            this.f94705c = z;
            this.d = num;
            this.e = transferScheduleData;
            this.f = l2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditRecurringTransfer)) {
                return false;
            }
            EditRecurringTransfer editRecurringTransfer = (EditRecurringTransfer) obj2;
            return Intrinsics.f(this.f94703a, editRecurringTransfer.f94703a) && Intrinsics.f(this.f94704b, editRecurringTransfer.f94704b) && this.f94705c == editRecurringTransfer.f94705c && Intrinsics.f(this.d, editRecurringTransfer.d) && Intrinsics.f(this.e, editRecurringTransfer.e) && Intrinsics.f(this.f, editRecurringTransfer.f);
        }

        public final int hashCode() {
            int iC = j6.a.c(p.a.c(this.f94703a.hashCode() * 31, 31, this.f94704b), 31, this.f94705c);
            Integer num = this.d;
            int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
            TransferScheduleData transferScheduleData = this.e;
            int iHashCode2 = (iHashCode + (transferScheduleData == null ? 0 : transferScheduleData.hashCode())) * 31;
            Long l2 = this.f;
            return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94703a);
            dest.writeString(this.f94704b);
            dest.writeInt(this.f94705c ? 1 : 0);
            Integer num = this.d;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            dest.writeParcelable(this.e, i);
            Long l2 = this.f;
            if (l2 == null) {
                dest.writeInt(0);
            } else {
                b.A(dest, 1, l2);
            }
        }

        public /* synthetic */ EditRecurringTransfer(String str, String str2, TransferScheduleData transferScheduleData, Long l2, int i) {
            this(str, str2, true, null, (i & 16) != 0 ? null : transferScheduleData, (i & 32) != 0 ? null : l2);
        }
    }
}
