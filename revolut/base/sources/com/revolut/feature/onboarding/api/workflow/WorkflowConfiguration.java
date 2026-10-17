package com.revolut.feature.onboarding.api.workflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/onboarding/api/workflow/WorkflowConfiguration;", "Landroid/os/Parcelable;", "<init>", "()V", "Product", "Workflow", "CreateWorkflow", "Extras", "Lcom/revolut/feature/onboarding/api/workflow/WorkflowConfiguration$CreateWorkflow;", "Lcom/revolut/feature/onboarding/api/workflow/WorkflowConfiguration$Product;", "Lcom/revolut/feature/onboarding/api/workflow/WorkflowConfiguration$Workflow;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class WorkflowConfiguration implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/api/workflow/WorkflowConfiguration$Extras;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Extras implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extras> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f78240a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Extras(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Extras[i];
            }
        }

        public Extras() {
            this(3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Extras) && this.f78240a == ((Extras) obj2).f78240a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f78240a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(null, i);
            dest.writeInt(this.f78240a ? 1 : 0);
        }

        public Extras(boolean z) {
            this.f78240a = z;
        }

        public /* synthetic */ Extras(int i) {
            this((i & 2) == 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/api/workflow/WorkflowConfiguration$Product;", "Lcom/revolut/feature/onboarding/api/workflow/WorkflowConfiguration;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Product extends WorkflowConfiguration {

        @NotNull
        public static final Parcelable.Creator<Product> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f78242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f78243c;
        public final NaviCommand d;
        public final AnalyticsProduct e;
        public final Extras f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Product(parcel.readString(), parcel.readString(), (b) parcel.readSerializable(), (NaviCommand) parcel.readParcelable(Product.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(Product.class.getClassLoader()), parcel.readInt() == 0 ? null : Extras.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Product[i];
            }
        }

        public Product() {
            this(null, null, null, null, 63);
        }

        @Override // com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration
        /* JADX INFO: renamed from: C0, reason: from getter */
        public final String getD() {
            return this.f78242b;
        }

        @Override // com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration
        /* JADX INFO: renamed from: P, reason: from getter */
        public final AnalyticsProduct getE() {
            return this.e;
        }

        @Override // com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Extras getF() {
            return this.f;
        }

        @Override // com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration
        /* JADX INFO: renamed from: b, reason: from getter */
        public final NaviCommand getF78246c() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Product)) {
                return false;
            }
            Product product = (Product) obj2;
            return Intrinsics.f(this.f78241a, product.f78241a) && Intrinsics.f(this.f78242b, product.f78242b) && Intrinsics.f(this.f78243c, product.f78243c) && Intrinsics.f(this.d, product.d) && Intrinsics.f(this.e, product.e) && Intrinsics.f(this.f, product.f);
        }

        @Override // com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration
        /* JADX INFO: renamed from: getCountryCode, reason: from getter */
        public final b getF78245b() {
            return this.f78243c;
        }

        public final int hashCode() {
            String str = this.f78241a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f78242b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            b bVar = this.f78243c;
            int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31;
            NaviCommand naviCommand = this.d;
            int iHashCode4 = (iHashCode3 + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
            AnalyticsProduct analyticsProduct = this.e;
            int iHashCode5 = (iHashCode4 + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
            Extras extras = this.f;
            return iHashCode5 + (extras != null ? Boolean.hashCode(extras.f78240a) : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78241a);
            dest.writeString(this.f78242b);
            dest.writeSerializable(this.f78243c);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
            Extras extras = this.f;
            if (extras == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                extras.writeToParcel(dest, i);
            }
        }

        public Product(String str, String str2, b bVar, NaviCommand naviCommand, AnalyticsProduct analyticsProduct, Extras extras) {
            this.f78241a = str;
            this.f78242b = str2;
            this.f78243c = bVar;
            this.d = naviCommand;
            this.e = analyticsProduct;
            this.f = extras;
        }

        public /* synthetic */ Product(String str, b bVar, NaviCommand naviCommand, AnalyticsProduct analyticsProduct, int i) {
            this((i & 1) != 0 ? null : str, null, (i & 4) != 0 ? null : bVar, (i & 8) != 0 ? null : naviCommand, (i & 16) != 0 ? null : analyticsProduct, null);
        }
    }

    private WorkflowConfiguration() {
    }

    /* JADX INFO: renamed from: C0 */
    public abstract String getD();

    /* JADX INFO: renamed from: P */
    public abstract AnalyticsProduct getE();

    /* JADX INFO: renamed from: a */
    public abstract Extras getF();

    /* JADX INFO: renamed from: b */
    public abstract NaviCommand getF78246c();

    /* JADX INFO: renamed from: getCountryCode */
    public abstract b getF78245b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/api/workflow/WorkflowConfiguration$CreateWorkflow;", "Lcom/revolut/feature/onboarding/api/workflow/WorkflowConfiguration;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreateWorkflow extends WorkflowConfiguration {

        @NotNull
        public static final Parcelable.Creator<CreateWorkflow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f78237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f78238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NaviCommand f78239c;
        public final String d;
        public final AnalyticsProduct e;
        public final Extras f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new CreateWorkflow(linkedHashMap, (b) parcel.readSerializable(), (NaviCommand) parcel.readParcelable(CreateWorkflow.class.getClassLoader()), parcel.readString(), (AnalyticsProduct) parcel.readParcelable(CreateWorkflow.class.getClassLoader()), parcel.readInt() == 0 ? null : Extras.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateWorkflow[i];
            }
        }

        public CreateWorkflow(Map workflowParams, b bVar, NaviCommand naviCommand, String str, AnalyticsProduct analyticsProduct, Extras extras) {
            Intrinsics.checkNotNullParameter(workflowParams, "workflowParams");
            this.f78237a = workflowParams;
            this.f78238b = bVar;
            this.f78239c = naviCommand;
            this.d = str;
            this.e = analyticsProduct;
            this.f = extras;
        }

        @Override // com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration
        /* JADX INFO: renamed from: C0, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration
        /* JADX INFO: renamed from: P, reason: from getter */
        public final AnalyticsProduct getE() {
            return this.e;
        }

        @Override // com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Extras getF() {
            return this.f;
        }

        @Override // com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration
        /* JADX INFO: renamed from: b, reason: from getter */
        public final NaviCommand getF78246c() {
            return this.f78239c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreateWorkflow)) {
                return false;
            }
            CreateWorkflow createWorkflow = (CreateWorkflow) obj2;
            return Intrinsics.f(this.f78237a, createWorkflow.f78237a) && Intrinsics.f(this.f78238b, createWorkflow.f78238b) && Intrinsics.f(this.f78239c, createWorkflow.f78239c) && Intrinsics.f(this.d, createWorkflow.d) && Intrinsics.f(this.e, createWorkflow.e) && Intrinsics.f(this.f, createWorkflow.f);
        }

        @Override // com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration
        /* JADX INFO: renamed from: getCountryCode, reason: from getter */
        public final b getF78245b() {
            return this.f78238b;
        }

        public final int hashCode() {
            int iHashCode = this.f78237a.hashCode() * 31;
            b bVar = this.f78238b;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31;
            NaviCommand naviCommand = this.f78239c;
            int iHashCode3 = (iHashCode2 + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
            String str = this.d;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            AnalyticsProduct analyticsProduct = this.e;
            int iHashCode5 = (iHashCode4 + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
            Extras extras = this.f;
            return iHashCode5 + (extras != null ? Boolean.hashCode(extras.f78240a) : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itZ = j6.a.z(this.f78237a, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
            dest.writeSerializable(this.f78238b);
            dest.writeParcelable(this.f78239c, i);
            dest.writeString(this.d);
            dest.writeParcelable(this.e, i);
            Extras extras = this.f;
            if (extras == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                extras.writeToParcel(dest, i);
            }
        }

        public /* synthetic */ CreateWorkflow(Map map, AnalyticsProduct analyticsProduct, int i) {
            this(map, null, null, null, (i & 16) != 0 ? null : analyticsProduct, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/api/workflow/WorkflowConfiguration$Workflow;", "Lcom/revolut/feature/onboarding/api/workflow/WorkflowConfiguration;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Workflow extends WorkflowConfiguration {

        @NotNull
        public static final Parcelable.Creator<Workflow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f78245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NaviCommand f78246c;
        public final String d;
        public final AnalyticsProduct e;
        public final Extras f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f78247g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Workflow(parcel.readString(), (b) parcel.readSerializable(), (NaviCommand) parcel.readParcelable(Workflow.class.getClassLoader()), parcel.readString(), (AnalyticsProduct) parcel.readParcelable(Workflow.class.getClassLoader()), parcel.readInt() == 0 ? null : Extras.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Workflow[i];
            }
        }

        public Workflow(String workflowId, b bVar, NaviCommand naviCommand, String str, AnalyticsProduct analyticsProduct, Extras extras, boolean z) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f78244a = workflowId;
            this.f78245b = bVar;
            this.f78246c = naviCommand;
            this.d = str;
            this.e = analyticsProduct;
            this.f = extras;
            this.f78247g = z;
        }

        @Override // com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration
        /* JADX INFO: renamed from: C0, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration
        /* JADX INFO: renamed from: P, reason: from getter */
        public final AnalyticsProduct getE() {
            return this.e;
        }

        @Override // com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Extras getF() {
            return this.f;
        }

        @Override // com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration
        /* JADX INFO: renamed from: b, reason: from getter */
        public final NaviCommand getF78246c() {
            return this.f78246c;
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
            return Intrinsics.f(this.f78244a, workflow.f78244a) && Intrinsics.f(this.f78245b, workflow.f78245b) && Intrinsics.f(this.f78246c, workflow.f78246c) && Intrinsics.f(this.d, workflow.d) && Intrinsics.f(this.e, workflow.e) && Intrinsics.f(this.f, workflow.f) && this.f78247g == workflow.f78247g;
        }

        @Override // com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration
        /* JADX INFO: renamed from: getCountryCode, reason: from getter */
        public final b getF78245b() {
            return this.f78245b;
        }

        public final int hashCode() {
            int iHashCode = this.f78244a.hashCode() * 31;
            b bVar = this.f78245b;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31;
            NaviCommand naviCommand = this.f78246c;
            int iHashCode3 = (iHashCode2 + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
            String str = this.d;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            AnalyticsProduct analyticsProduct = this.e;
            int iHashCode5 = (iHashCode4 + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
            Extras extras = this.f;
            return Boolean.hashCode(this.f78247g) + ((iHashCode5 + (extras != null ? Boolean.hashCode(extras.f78240a) : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78244a);
            dest.writeSerializable(this.f78245b);
            dest.writeParcelable(this.f78246c, i);
            dest.writeString(this.d);
            dest.writeParcelable(this.e, i);
            Extras extras = this.f;
            if (extras == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                extras.writeToParcel(dest, i);
            }
            dest.writeInt(this.f78247g ? 1 : 0);
        }

        public /* synthetic */ Workflow(String str, b bVar, NaviCommand naviCommand, String str2, AnalyticsProduct analyticsProduct, Extras extras, int i) {
            this(str, (i & 2) != 0 ? null : bVar, (i & 4) != 0 ? null : naviCommand, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : analyticsProduct, (i & 32) != 0 ? null : extras, (i & 64) == 0);
        }
    }
}
