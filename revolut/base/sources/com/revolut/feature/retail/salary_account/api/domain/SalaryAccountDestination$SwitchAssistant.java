package com.revolut.feature.retail.salary_account.api.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/retail/salary_account/api/domain/SalaryAccountDestination$SwitchAssistant", "", "", "toString", "()Ljava/lang/String;", "SwitchAssistantDestination", "feature_retail_salary_account_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SalaryAccountDestination$SwitchAssistant implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<SalaryAccountDestination$SwitchAssistant> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SwitchAssistantDestination f82954a;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/salary_account/api/domain/SalaryAccountDestination$SwitchAssistant$SwitchAssistantDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Entry", "OpenEmailApp", "PayrollManagerInput", "UpdatePayroll", "EnterWorkEmail", "SendFollowUp", "MarkCompleted", "StartOver", "Tracker", "Lcom/revolut/feature/retail/salary_account/api/domain/SalaryAccountDestination$SwitchAssistant$SwitchAssistantDestination$EnterWorkEmail;", "Lcom/revolut/feature/retail/salary_account/api/domain/SalaryAccountDestination$SwitchAssistant$SwitchAssistantDestination$Entry;", "Lcom/revolut/feature/retail/salary_account/api/domain/SalaryAccountDestination$SwitchAssistant$SwitchAssistantDestination$MarkCompleted;", "Lcom/revolut/feature/retail/salary_account/api/domain/SalaryAccountDestination$SwitchAssistant$SwitchAssistantDestination$OpenEmailApp;", "Lcom/revolut/feature/retail/salary_account/api/domain/SalaryAccountDestination$SwitchAssistant$SwitchAssistantDestination$PayrollManagerInput;", "Lcom/revolut/feature/retail/salary_account/api/domain/SalaryAccountDestination$SwitchAssistant$SwitchAssistantDestination$SendFollowUp;", "Lcom/revolut/feature/retail/salary_account/api/domain/SalaryAccountDestination$SwitchAssistant$SwitchAssistantDestination$StartOver;", "Lcom/revolut/feature/retail/salary_account/api/domain/SalaryAccountDestination$SwitchAssistant$SwitchAssistantDestination$Tracker;", "Lcom/revolut/feature/retail/salary_account/api/domain/SalaryAccountDestination$SwitchAssistant$SwitchAssistantDestination$UpdatePayroll;", "feature_retail_salary_account_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface SwitchAssistantDestination extends KompotDestination {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/salary_account/api/domain/SalaryAccountDestination$SwitchAssistant$SwitchAssistantDestination$EnterWorkEmail;", "Lcom/revolut/feature/retail/salary_account/api/domain/SalaryAccountDestination$SwitchAssistant$SwitchAssistantDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_account_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class EnterWorkEmail implements SwitchAssistantDestination {

            @NotNull
            public static final Parcelable.Creator<EnterWorkEmail> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f82955a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new EnterWorkEmail(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new EnterWorkEmail[i];
                }
            }

            public EnterWorkEmail(String requestId) {
                Intrinsics.checkNotNullParameter(requestId, "requestId");
                this.f82955a = requestId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof EnterWorkEmail) && Intrinsics.f(this.f82955a, ((EnterWorkEmail) obj2).f82955a);
            }

            public final int hashCode() {
                return this.f82955a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f82955a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/api/domain/SalaryAccountDestination$SwitchAssistant$SwitchAssistantDestination$Entry;", "Lcom/revolut/feature/retail/salary_account/api/domain/SalaryAccountDestination$SwitchAssistant$SwitchAssistantDestination;", "<init>", "()V", "feature_retail_salary_account_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Entry implements SwitchAssistantDestination {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Entry f82956a = new Entry();

            @NotNull
            public static final Parcelable.Creator<Entry> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Entry.f82956a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Entry[i];
                }
            }

            private Entry() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/salary_account/api/domain/SalaryAccountDestination$SwitchAssistant$SwitchAssistantDestination$MarkCompleted;", "Lcom/revolut/feature/retail/salary_account/api/domain/SalaryAccountDestination$SwitchAssistant$SwitchAssistantDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_account_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class MarkCompleted implements SwitchAssistantDestination {

            @NotNull
            public static final Parcelable.Creator<MarkCompleted> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f82957a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new MarkCompleted(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new MarkCompleted[i];
                }
            }

            public MarkCompleted(String requestId) {
                Intrinsics.checkNotNullParameter(requestId, "requestId");
                this.f82957a = requestId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof MarkCompleted) && Intrinsics.f(this.f82957a, ((MarkCompleted) obj2).f82957a);
            }

            public final int hashCode() {
                return this.f82957a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f82957a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/api/domain/SalaryAccountDestination$SwitchAssistant$SwitchAssistantDestination$OpenEmailApp;", "Lcom/revolut/feature/retail/salary_account/api/domain/SalaryAccountDestination$SwitchAssistant$SwitchAssistantDestination;", "<init>", "()V", "feature_retail_salary_account_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class OpenEmailApp implements SwitchAssistantDestination {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final OpenEmailApp f82958a = new OpenEmailApp();

            @NotNull
            public static final Parcelable.Creator<OpenEmailApp> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return OpenEmailApp.f82958a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OpenEmailApp[i];
                }
            }

            private OpenEmailApp() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/api/domain/SalaryAccountDestination$SwitchAssistant$SwitchAssistantDestination$PayrollManagerInput;", "Lcom/revolut/feature/retail/salary_account/api/domain/SalaryAccountDestination$SwitchAssistant$SwitchAssistantDestination;", "<init>", "()V", "feature_retail_salary_account_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class PayrollManagerInput implements SwitchAssistantDestination {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final PayrollManagerInput f82959a = new PayrollManagerInput();

            @NotNull
            public static final Parcelable.Creator<PayrollManagerInput> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PayrollManagerInput.f82959a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PayrollManagerInput[i];
                }
            }

            private PayrollManagerInput() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/salary_account/api/domain/SalaryAccountDestination$SwitchAssistant$SwitchAssistantDestination$SendFollowUp;", "Lcom/revolut/feature/retail/salary_account/api/domain/SalaryAccountDestination$SwitchAssistant$SwitchAssistantDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_account_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SendFollowUp implements SwitchAssistantDestination {

            @NotNull
            public static final Parcelable.Creator<SendFollowUp> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f82960a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SendFollowUp(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SendFollowUp[i];
                }
            }

            public SendFollowUp(String requestId) {
                Intrinsics.checkNotNullParameter(requestId, "requestId");
                this.f82960a = requestId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof SendFollowUp) && Intrinsics.f(this.f82960a, ((SendFollowUp) obj2).f82960a);
            }

            public final int hashCode() {
                return this.f82960a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f82960a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/salary_account/api/domain/SalaryAccountDestination$SwitchAssistant$SwitchAssistantDestination$StartOver;", "Lcom/revolut/feature/retail/salary_account/api/domain/SalaryAccountDestination$SwitchAssistant$SwitchAssistantDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_account_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class StartOver implements SwitchAssistantDestination {

            @NotNull
            public static final Parcelable.Creator<StartOver> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f82961a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new StartOver(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new StartOver[i];
                }
            }

            public StartOver(String requestId) {
                Intrinsics.checkNotNullParameter(requestId, "requestId");
                this.f82961a = requestId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof StartOver) && Intrinsics.f(this.f82961a, ((StartOver) obj2).f82961a);
            }

            public final int hashCode() {
                return this.f82961a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f82961a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/api/domain/SalaryAccountDestination$SwitchAssistant$SwitchAssistantDestination$Tracker;", "Lcom/revolut/feature/retail/salary_account/api/domain/SalaryAccountDestination$SwitchAssistant$SwitchAssistantDestination;", "<init>", "()V", "feature_retail_salary_account_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Tracker implements SwitchAssistantDestination {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Tracker f82962a = new Tracker();

            @NotNull
            public static final Parcelable.Creator<Tracker> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Tracker.f82962a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Tracker[i];
                }
            }

            private Tracker() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/api/domain/SalaryAccountDestination$SwitchAssistant$SwitchAssistantDestination$UpdatePayroll;", "Lcom/revolut/feature/retail/salary_account/api/domain/SalaryAccountDestination$SwitchAssistant$SwitchAssistantDestination;", "<init>", "()V", "feature_retail_salary_account_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class UpdatePayroll implements SwitchAssistantDestination {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final UpdatePayroll f82963a = new UpdatePayroll();

            @NotNull
            public static final Parcelable.Creator<UpdatePayroll> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return UpdatePayroll.f82963a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new UpdatePayroll[i];
                }
            }

            private UpdatePayroll() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SalaryAccountDestination$SwitchAssistant((SwitchAssistantDestination) parcel.readParcelable(SalaryAccountDestination$SwitchAssistant.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SalaryAccountDestination$SwitchAssistant[i];
        }
    }

    public SalaryAccountDestination$SwitchAssistant(SwitchAssistantDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f82954a = destination;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof SalaryAccountDestination$SwitchAssistant) && Intrinsics.f(this.f82954a, ((SalaryAccountDestination$SwitchAssistant) obj2).f82954a);
    }

    public final int hashCode() {
        return this.f82954a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f82954a, i);
    }
}
