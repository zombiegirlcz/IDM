package com.revolut.feature.retail.salary_account.impl.switch_assistant.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"com/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Empty", "OpenEmailApp", "PayrollManagerInput", "UpdatePayroll", "EnterWorkEmail", "SendFollowUp", "MarkCompleted", "StartOver", "Tracker", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$InputData$Empty;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$InputData$EnterWorkEmail;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$InputData$MarkCompleted;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$InputData$OpenEmailApp;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$InputData$PayrollManagerInput;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$InputData$SendFollowUp;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$InputData$StartOver;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$InputData$Tracker;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$InputData$UpdatePayroll;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SwitchAssistantFlowContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$InputData$Empty;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$InputData;", "<init>", "()V", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Empty implements SwitchAssistantFlowContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Empty f83033a = new Empty();

        @NotNull
        public static final Parcelable.Creator<Empty> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Empty.f83033a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Empty[i];
            }
        }

        private Empty() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$InputData$EnterWorkEmail;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EnterWorkEmail implements SwitchAssistantFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<EnterWorkEmail> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83034a;

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
            this.f83034a = requestId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EnterWorkEmail) && Intrinsics.f(this.f83034a, ((EnterWorkEmail) obj2).f83034a);
        }

        public final int hashCode() {
            return this.f83034a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83034a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$InputData$MarkCompleted;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MarkCompleted implements SwitchAssistantFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<MarkCompleted> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83035a;

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
            this.f83035a = requestId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MarkCompleted) && Intrinsics.f(this.f83035a, ((MarkCompleted) obj2).f83035a);
        }

        public final int hashCode() {
            return this.f83035a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83035a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$InputData$OpenEmailApp;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$InputData;", "<init>", "()V", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OpenEmailApp implements SwitchAssistantFlowContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OpenEmailApp f83036a = new OpenEmailApp();

        @NotNull
        public static final Parcelable.Creator<OpenEmailApp> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OpenEmailApp.f83036a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$InputData$PayrollManagerInput;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$InputData;", "<init>", "()V", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PayrollManagerInput implements SwitchAssistantFlowContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PayrollManagerInput f83037a = new PayrollManagerInput();

        @NotNull
        public static final Parcelable.Creator<PayrollManagerInput> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PayrollManagerInput.f83037a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$InputData$SendFollowUp;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SendFollowUp implements SwitchAssistantFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<SendFollowUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83038a;

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
            this.f83038a = requestId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SendFollowUp) && Intrinsics.f(this.f83038a, ((SendFollowUp) obj2).f83038a);
        }

        public final int hashCode() {
            return this.f83038a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83038a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$InputData$StartOver;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StartOver implements SwitchAssistantFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<StartOver> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83039a;

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
            this.f83039a = requestId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StartOver) && Intrinsics.f(this.f83039a, ((StartOver) obj2).f83039a);
        }

        public final int hashCode() {
            return this.f83039a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83039a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$InputData$Tracker;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$InputData;", "<init>", "()V", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Tracker implements SwitchAssistantFlowContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Tracker f83040a = new Tracker();

        @NotNull
        public static final Parcelable.Creator<Tracker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Tracker.f83040a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$InputData$UpdatePayroll;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$InputData;", "<init>", "()V", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UpdatePayroll implements SwitchAssistantFlowContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UpdatePayroll f83041a = new UpdatePayroll();

        @NotNull
        public static final Parcelable.Creator<UpdatePayroll> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UpdatePayroll.f83041a;
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
