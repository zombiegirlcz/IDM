package com.revolut.feature.workflow.engine.sdk_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.common.IOData$Input;
import ip0.v7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Predefined", "Workflow", "PennyTopUp", "Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$InputData$PennyTopUp;", "Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$InputData$Predefined;", "Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$InputData$Workflow;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SdkFlowContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$InputData$PennyTopUp;", "Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PennyTopUp extends SdkFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<PennyTopUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f96577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f96578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dj0.d f96579c;
        public final List d;
        public final boolean e;
        public final String f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                dj0.d dVar = (dj0.d) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (true) {
                    if (iC == i) {
                        break;
                    }
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new PennyTopUp(dVar, string, string2, parcel.readString(), arrayList, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PennyTopUp[i];
            }
        }

        public PennyTopUp(dj0.d amount, String stepId, String workflowId, String str, List applicableCountries, boolean z) {
            Intrinsics.checkNotNullParameter(stepId, "stepId");
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(applicableCountries, "applicableCountries");
            this.f96577a = stepId;
            this.f96578b = workflowId;
            this.f96579c = amount;
            this.d = applicableCountries;
            this.e = z;
            this.f = str;
        }

        @Override // com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract$InputData
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF96583a() {
            return this.f96577a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PennyTopUp)) {
                return false;
            }
            PennyTopUp pennyTopUp = (PennyTopUp) obj2;
            return Intrinsics.f(this.f96577a, pennyTopUp.f96577a) && Intrinsics.f(this.f96578b, pennyTopUp.f96578b) && Intrinsics.f(this.f96579c, pennyTopUp.f96579c) && Intrinsics.f(this.d, pennyTopUp.d) && this.e == pennyTopUp.e && Intrinsics.f(this.f, pennyTopUp.f);
        }

        public final int hashCode() {
            int iC = j6.a.c(p.a.d(v7.c(p.a.c(this.f96577a.hashCode() * 31, 31, this.f96578b), 31, this.f96579c), 31, this.d), 31, this.e);
            String str = this.f;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96577a);
            dest.writeString(this.f96578b);
            dest.writeSerializable(this.f96579c);
            Iterator itV = p.a.v(this.d, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            dest.writeInt(this.e ? 1 : 0);
            dest.writeString(this.f);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$InputData$Predefined;", "Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Predefined extends SdkFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Predefined> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f96580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f96581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f96582c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Predefined(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Predefined[i];
            }
        }

        public Predefined(String stepId, String str, String str2) {
            Intrinsics.checkNotNullParameter(stepId, "stepId");
            this.f96580a = stepId;
            this.f96581b = str;
            this.f96582c = str2;
        }

        @Override // com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract$InputData
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF96583a() {
            return this.f96580a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Predefined)) {
                return false;
            }
            Predefined predefined = (Predefined) obj2;
            return Intrinsics.f(this.f96580a, predefined.f96580a) && Intrinsics.f(this.f96581b, predefined.f96581b) && Intrinsics.f(this.f96582c, predefined.f96582c);
        }

        public final int hashCode() {
            int iHashCode = this.f96580a.hashCode() * 31;
            String str = this.f96581b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f96582c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96580a);
            dest.writeString(this.f96581b);
            dest.writeString(this.f96582c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$InputData$Workflow;", "Lcom/revolut/feature/workflow/engine/sdk_flow/SdkFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Workflow extends SdkFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Workflow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f96583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AnalyticsProduct f96584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f96585c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Workflow((AnalyticsProduct) parcel.readParcelable(Workflow.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Workflow[i];
            }
        }

        public Workflow(AnalyticsProduct analyticsProduct, String stepId, boolean z) {
            Intrinsics.checkNotNullParameter(stepId, "stepId");
            this.f96583a = stepId;
            this.f96584b = analyticsProduct;
            this.f96585c = z;
        }

        @Override // com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract$InputData
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF96583a() {
            return this.f96583a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Workflow)) {
                return false;
            }
            Workflow workflow = (Workflow) obj2;
            return Intrinsics.f(this.f96583a, workflow.f96583a) && Intrinsics.f(this.f96584b, workflow.f96584b) && this.f96585c == workflow.f96585c;
        }

        public final int hashCode() {
            int iHashCode = this.f96583a.hashCode() * 31;
            AnalyticsProduct analyticsProduct = this.f96584b;
            return Boolean.hashCode(this.f96585c) + ((iHashCode + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96583a);
            dest.writeParcelable(this.f96584b, i);
            dest.writeInt(this.f96585c ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: H1 */
    public abstract String getF96583a();
}
