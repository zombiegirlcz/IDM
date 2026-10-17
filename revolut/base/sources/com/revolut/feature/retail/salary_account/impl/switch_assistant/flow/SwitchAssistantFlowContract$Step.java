package com.revolut.feature.retail.salary_account.impl.switch_assistant.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.domain.model.Contact;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"com/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Entry", "PayrollManagerInput", "RequestSummary", "PayrollPlatformAccountDetails", "PayrollPlatformEmailInput", "PayrollPlatformEmailSent", "ReviewEmail", "StartOverConfirmation", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$Step$Entry;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$Step$PayrollManagerInput;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$Step$PayrollPlatformAccountDetails;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$Step$PayrollPlatformEmailInput;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$Step$PayrollPlatformEmailSent;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$Step$RequestSummary;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$Step$ReviewEmail;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$Step$StartOverConfirmation;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SwitchAssistantFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$Step$Entry;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$Step;", "<init>", "()V", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Entry implements SwitchAssistantFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Entry f83042a = new Entry();

        @NotNull
        public static final Parcelable.Creator<Entry> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Entry.f83042a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$Step$PayrollManagerInput;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$Step;", "<init>", "()V", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PayrollManagerInput implements SwitchAssistantFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PayrollManagerInput f83043a = new PayrollManagerInput();

        @NotNull
        public static final Parcelable.Creator<PayrollManagerInput> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PayrollManagerInput.f83043a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$Step$PayrollPlatformAccountDetails;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$Step;", "<init>", "()V", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PayrollPlatformAccountDetails implements SwitchAssistantFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PayrollPlatformAccountDetails f83044a = new PayrollPlatformAccountDetails();

        @NotNull
        public static final Parcelable.Creator<PayrollPlatformAccountDetails> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PayrollPlatformAccountDetails.f83044a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PayrollPlatformAccountDetails[i];
            }
        }

        private PayrollPlatformAccountDetails() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$Step$PayrollPlatformEmailInput;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$Step;", "<init>", "()V", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PayrollPlatformEmailInput implements SwitchAssistantFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PayrollPlatformEmailInput f83045a = new PayrollPlatformEmailInput();

        @NotNull
        public static final Parcelable.Creator<PayrollPlatformEmailInput> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PayrollPlatformEmailInput.f83045a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PayrollPlatformEmailInput[i];
            }
        }

        private PayrollPlatformEmailInput() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$Step$PayrollPlatformEmailSent;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PayrollPlatformEmailSent implements SwitchAssistantFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PayrollPlatformEmailSent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83046a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PayrollPlatformEmailSent(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PayrollPlatformEmailSent[i];
            }
        }

        public PayrollPlatformEmailSent(String workEmail) {
            Intrinsics.checkNotNullParameter(workEmail, "workEmail");
            this.f83046a = workEmail;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PayrollPlatformEmailSent) && Intrinsics.f(this.f83046a, ((PayrollPlatformEmailSent) obj2).f83046a);
        }

        public final int hashCode() {
            return this.f83046a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83046a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$Step$RequestSummary;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RequestSummary implements SwitchAssistantFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RequestSummary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f83047a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Contact.CREATOR, parcel, arrayList, iA, 1);
                }
                return new RequestSummary(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RequestSummary[i];
            }
        }

        public RequestSummary(ArrayList contacts) {
            Intrinsics.checkNotNullParameter(contacts, "contacts");
            this.f83047a = contacts;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RequestSummary) && this.f83047a.equals(((RequestSummary) obj2).f83047a);
        }

        public final int hashCode() {
            return this.f83047a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f83047a, dest);
            while (itY.hasNext()) {
                ((Contact) itY.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$Step$ReviewEmail;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReviewEmail implements SwitchAssistantFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ReviewEmail> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83048a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReviewEmail(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReviewEmail[i];
            }
        }

        public ReviewEmail(String requestId) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            this.f83048a = requestId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ReviewEmail) && Intrinsics.f(this.f83048a, ((ReviewEmail) obj2).f83048a);
        }

        public final int hashCode() {
            return this.f83048a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83048a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$Step$StartOverConfirmation;", "Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StartOverConfirmation implements SwitchAssistantFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<StartOverConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83049a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StartOverConfirmation(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StartOverConfirmation[i];
            }
        }

        public StartOverConfirmation(String requestId) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            this.f83049a = requestId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StartOverConfirmation) && Intrinsics.f(this.f83049a, ((StartOverConfirmation) obj2).f83049a);
        }

        public final int hashCode() {
            return this.f83049a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83049a);
        }
    }
}
