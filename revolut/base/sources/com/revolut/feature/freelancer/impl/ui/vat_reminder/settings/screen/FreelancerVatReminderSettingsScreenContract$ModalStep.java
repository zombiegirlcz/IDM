package com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import ehe.n;
import fs6.b;
import java.time.Month;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/vat_reminder/settings/screen/FreelancerVatReminderSettingsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AssessmentPeriod", "AccountingPeriod", "Lcom/revolut/feature/freelancer/impl/ui/vat_reminder/settings/screen/FreelancerVatReminderSettingsScreenContract$ModalStep$AccountingPeriod;", "Lcom/revolut/feature/freelancer/impl/ui/vat_reminder/settings/screen/FreelancerVatReminderSettingsScreenContract$ModalStep$AssessmentPeriod;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerVatReminderSettingsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/vat_reminder/settings/screen/FreelancerVatReminderSettingsScreenContract$ModalStep$AccountingPeriod;", "Lcom/revolut/feature/freelancer/impl/ui/vat_reminder/settings/screen/FreelancerVatReminderSettingsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountingPeriod implements FreelancerVatReminderSettingsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AccountingPeriod> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Month f74440a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountingPeriod(parcel.readInt() == 0 ? null : Month.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountingPeriod[i];
            }
        }

        public AccountingPeriod(Month month) {
            this.f74440a = month;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AccountingPeriod) && this.f74440a == ((AccountingPeriod) obj2).f74440a;
        }

        public final int hashCode() {
            Month month = this.f74440a;
            if (month == null) {
                return 0;
            }
            return month.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Month month = this.f74440a;
            if (month == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(month.name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/vat_reminder/settings/screen/FreelancerVatReminderSettingsScreenContract$ModalStep$AssessmentPeriod;", "Lcom/revolut/feature/freelancer/impl/ui/vat_reminder/settings/screen/FreelancerVatReminderSettingsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AssessmentPeriod implements FreelancerVatReminderSettingsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AssessmentPeriod> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f74441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f74442b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(b.valueOf(parcel.readString()));
                }
                return new AssessmentPeriod(linkedHashSet, parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AssessmentPeriod[i];
            }
        }

        public AssessmentPeriod(Set assessmentPeriods, b bVar) {
            Intrinsics.checkNotNullParameter(assessmentPeriods, "assessmentPeriods");
            this.f74441a = assessmentPeriods;
            this.f74442b = bVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AssessmentPeriod)) {
                return false;
            }
            AssessmentPeriod assessmentPeriod = (AssessmentPeriod) obj2;
            return Intrinsics.f(this.f74441a, assessmentPeriod.f74441a) && this.f74442b == assessmentPeriod.f74442b;
        }

        public final int hashCode() {
            int iHashCode = this.f74441a.hashCode() * 31;
            b bVar = this.f74442b;
            return iHashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f74441a, dest);
            while (itV.hasNext()) {
                dest.writeString(((b) itV.next()).name());
            }
            b bVar = this.f74442b;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
        }
    }
}
