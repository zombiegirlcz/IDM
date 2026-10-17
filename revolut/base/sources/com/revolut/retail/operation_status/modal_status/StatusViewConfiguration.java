package com.revolut.retail.operation_status.modal_status;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.retail.operation_status.modal_status.SuccessType;
import ix0.b2;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/revolut/retail/operation_status/modal_status/StatusViewConfiguration;", "Landroid/os/Parcelable;", "<init>", "()V", "Success", "Error", "Pending", "Warning", "LoadingFinite", "LoadingIndefinite", "NoConnection", "ContextualAlert", "Lcom/revolut/retail/operation_status/modal_status/StatusViewConfiguration$ContextualAlert;", "Lcom/revolut/retail/operation_status/modal_status/StatusViewConfiguration$Error;", "Lcom/revolut/retail/operation_status/modal_status/StatusViewConfiguration$LoadingFinite;", "Lcom/revolut/retail/operation_status/modal_status/StatusViewConfiguration$LoadingIndefinite;", "Lcom/revolut/retail/operation_status/modal_status/StatusViewConfiguration$NoConnection;", "Lcom/revolut/retail/operation_status/modal_status/StatusViewConfiguration$Pending;", "Lcom/revolut/retail/operation_status/modal_status/StatusViewConfiguration$Success;", "Lcom/revolut/retail/operation_status/modal_status/StatusViewConfiguration$Warning;", "retail_operation_status_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StatusViewConfiguration implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/operation_status/modal_status/StatusViewConfiguration$ContextualAlert;", "Lcom/revolut/retail/operation_status/modal_status/StatusViewConfiguration;", "", "toString", "()Ljava/lang/String;", "retail_operation_status_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ContextualAlert extends StatusViewConfiguration {

        @NotNull
        public static final Parcelable.Creator<ContextualAlert> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f104342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f104343c;
        public final Image d;
        public final Clause e;
        public final Clause f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final StatusViewDescriptionProgress f104344g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final b2 f104345h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Parcelable f104346j;
        public final AnalyticsProduct k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final AnalyticsContext f104347l;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ContextualAlert(parcel.readString(), (Clause) parcel.readParcelable(ContextualAlert.class.getClassLoader()), (Clause) parcel.readParcelable(ContextualAlert.class.getClassLoader()), (Image) parcel.readParcelable(ContextualAlert.class.getClassLoader()), (Clause) parcel.readParcelable(ContextualAlert.class.getClassLoader()), (Clause) parcel.readParcelable(ContextualAlert.class.getClassLoader()), parcel.readInt() == 0 ? null : StatusViewDescriptionProgress.CREATOR.createFromParcel(parcel), null, parcel.readInt() != 0, parcel.readParcelable(ContextualAlert.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(ContextualAlert.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(ContextualAlert.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ContextualAlert[i];
            }
        }

        public ContextualAlert(String id10, Clause title, Clause description, Image titleImage, Clause primaryButtonText, Clause secondaryButtonText, StatusViewDescriptionProgress statusViewDescriptionProgress, b2 b2Var, boolean z, Parcelable parcelable, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(titleImage, "titleImage");
            Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
            Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
            this.f104341a = id10;
            this.f104342b = title;
            this.f104343c = description;
            this.d = titleImage;
            this.e = primaryButtonText;
            this.f = secondaryButtonText;
            this.f104344g = statusViewDescriptionProgress;
            this.f104345h = b2Var;
            this.i = z;
            this.f104346j = parcelable;
            this.k = analyticsProduct;
            this.f104347l = analyticsContext;
        }

        @Override // com.revolut.retail.operation_status.modal_status.StatusViewConfiguration
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Parcelable getF() {
            return this.f104346j;
        }

        @Override // com.revolut.retail.operation_status.modal_status.StatusViewConfiguration
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF104390j() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ContextualAlert)) {
                return false;
            }
            ContextualAlert contextualAlert = (ContextualAlert) obj2;
            return Intrinsics.f(this.f104341a, contextualAlert.f104341a) && Intrinsics.f(this.f104342b, contextualAlert.f104342b) && Intrinsics.f(this.f104343c, contextualAlert.f104343c) && Intrinsics.f(this.d, contextualAlert.d) && Intrinsics.f(this.e, contextualAlert.e) && Intrinsics.f(this.f, contextualAlert.f) && Intrinsics.f(this.f104344g, contextualAlert.f104344g) && Intrinsics.f(this.f104345h, contextualAlert.f104345h) && this.i == contextualAlert.i && Intrinsics.f(this.f104346j, contextualAlert.f104346j) && Intrinsics.f(this.k, contextualAlert.k) && Intrinsics.f(this.f104347l, contextualAlert.f104347l);
        }

        @Override // com.revolut.retail.operation_status.modal_status.StatusViewConfiguration
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF104385a() {
            return this.f104341a;
        }

        public final int hashCode() {
            int iA = p.a.a(p.a.a(a10.b.c(this.d, p.a.a(p.a.a(this.f104341a.hashCode() * 31, 31, this.f104342b), 31, this.f104343c), 31), 31, this.e), 31, this.f);
            StatusViewDescriptionProgress statusViewDescriptionProgress = this.f104344g;
            int iHashCode = (iA + (statusViewDescriptionProgress == null ? 0 : statusViewDescriptionProgress.hashCode())) * 31;
            b2 b2Var = this.f104345h;
            int iC = j6.a.c((iHashCode + (b2Var == null ? 0 : b2Var.hashCode())) * 31, 31, this.i);
            Parcelable parcelable = this.f104346j;
            int iHashCode2 = (iC + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            AnalyticsProduct analyticsProduct = this.k;
            int iHashCode3 = (iHashCode2 + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
            AnalyticsContext analyticsContext = this.f104347l;
            return iHashCode3 + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104341a);
            dest.writeParcelable(this.f104342b, i);
            dest.writeParcelable(this.f104343c, i);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
            dest.writeParcelable(this.f, i);
            StatusViewDescriptionProgress statusViewDescriptionProgress = this.f104344g;
            if (statusViewDescriptionProgress == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                statusViewDescriptionProgress.writeToParcel(dest, i);
            }
            dest.writeInt(this.i ? 1 : 0);
            dest.writeParcelable(this.f104346j, i);
            dest.writeParcelable(this.k, i);
            dest.writeParcelable(this.f104347l, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/operation_status/modal_status/StatusViewConfiguration$LoadingFinite;", "Lcom/revolut/retail/operation_status/modal_status/StatusViewConfiguration;", "", "toString", "()Ljava/lang/String;", "retail_operation_status_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoadingFinite extends StatusViewConfiguration {

        @NotNull
        public static final Parcelable.Creator<LoadingFinite> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f104357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f104358c;
        public final Parcelable d;
        public final AnalyticsProduct e;
        public final AnalyticsContext f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final StatusViewDescriptionProgress f104359g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f104360h;
        public final boolean i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                Clause clause = (Clause) parcel.readParcelable(LoadingFinite.class.getClassLoader());
                Clause clause2 = (Clause) parcel.readParcelable(LoadingFinite.class.getClassLoader());
                Parcelable parcelable = parcel.readParcelable(LoadingFinite.class.getClassLoader());
                AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(LoadingFinite.class.getClassLoader());
                AnalyticsContext analyticsContext = (AnalyticsContext) parcel.readParcelable(LoadingFinite.class.getClassLoader());
                StatusViewDescriptionProgress statusViewDescriptionProgressCreateFromParcel = StatusViewDescriptionProgress.CREATOR.createFromParcel(parcel);
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                return new LoadingFinite(string, clause, clause2, parcelable, analyticsProduct, analyticsContext, statusViewDescriptionProgressCreateFromParcel, z3, parcel.readInt() == 0 ? z : true);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoadingFinite[i];
            }
        }

        public LoadingFinite(String id10, Clause title, Clause clause, Parcelable parcelable, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, StatusViewDescriptionProgress descriptionProgress, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(descriptionProgress, "descriptionProgress");
            this.f104356a = id10;
            this.f104357b = title;
            this.f104358c = clause;
            this.d = parcelable;
            this.e = analyticsProduct;
            this.f = analyticsContext;
            this.f104359g = descriptionProgress;
            this.f104360h = z;
            this.i = z3;
        }

        @Override // com.revolut.retail.operation_status.modal_status.StatusViewConfiguration
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Parcelable getF() {
            return this.d;
        }

        @Override // com.revolut.retail.operation_status.modal_status.StatusViewConfiguration
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF104390j() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LoadingFinite)) {
                return false;
            }
            LoadingFinite loadingFinite = (LoadingFinite) obj2;
            return Intrinsics.f(this.f104356a, loadingFinite.f104356a) && Intrinsics.f(this.f104357b, loadingFinite.f104357b) && Intrinsics.f(this.f104358c, loadingFinite.f104358c) && Intrinsics.f(this.d, loadingFinite.d) && Intrinsics.f(this.e, loadingFinite.e) && Intrinsics.f(this.f, loadingFinite.f) && Intrinsics.f(this.f104359g, loadingFinite.f104359g) && this.f104360h == loadingFinite.f104360h && this.i == loadingFinite.i;
        }

        @Override // com.revolut.retail.operation_status.modal_status.StatusViewConfiguration
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF104385a() {
            return this.f104356a;
        }

        public final int hashCode() {
            int iA = p.a.a(this.f104356a.hashCode() * 31, 31, this.f104357b);
            Clause clause = this.f104358c;
            int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
            Parcelable parcelable = this.d;
            int iHashCode2 = (iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            AnalyticsProduct analyticsProduct = this.e;
            int iHashCode3 = (iHashCode2 + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
            AnalyticsContext analyticsContext = this.f;
            return Boolean.hashCode(this.i) + j6.a.c((this.f104359g.hashCode() + ((iHashCode3 + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0)) * 31)) * 31, 31, this.f104360h);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104356a);
            dest.writeParcelable(this.f104357b, i);
            dest.writeParcelable(this.f104358c, i);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
            dest.writeParcelable(this.f, i);
            this.f104359g.writeToParcel(dest, i);
            dest.writeInt(this.f104360h ? 1 : 0);
            dest.writeInt(this.i ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/operation_status/modal_status/StatusViewConfiguration$NoConnection;", "Lcom/revolut/retail/operation_status/modal_status/StatusViewConfiguration;", "", "toString", "()Ljava/lang/String;", "retail_operation_status_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NoConnection extends StatusViewConfiguration {

        @NotNull
        public static final Parcelable.Creator<NoConnection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f104368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f104369c;
        public final Parcelable d;
        public final AnalyticsProduct e;
        public final AnalyticsContext f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f104370g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NoConnection(parcel.readString(), (Clause) parcel.readParcelable(NoConnection.class.getClassLoader()), (Clause) parcel.readParcelable(NoConnection.class.getClassLoader()), parcel.readParcelable(NoConnection.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(NoConnection.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(NoConnection.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoConnection[i];
            }
        }

        public NoConnection(String id10, Clause title, Clause clause, Parcelable parcelable, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, boolean z) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f104367a = id10;
            this.f104368b = title;
            this.f104369c = clause;
            this.d = parcelable;
            this.e = analyticsProduct;
            this.f = analyticsContext;
            this.f104370g = z;
        }

        @Override // com.revolut.retail.operation_status.modal_status.StatusViewConfiguration
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Parcelable getF() {
            return this.d;
        }

        @Override // com.revolut.retail.operation_status.modal_status.StatusViewConfiguration
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF104390j() {
            return this.f104370g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NoConnection)) {
                return false;
            }
            NoConnection noConnection = (NoConnection) obj2;
            return Intrinsics.f(this.f104367a, noConnection.f104367a) && Intrinsics.f(this.f104368b, noConnection.f104368b) && Intrinsics.f(this.f104369c, noConnection.f104369c) && Intrinsics.f(this.d, noConnection.d) && Intrinsics.f(this.e, noConnection.e) && Intrinsics.f(this.f, noConnection.f) && this.f104370g == noConnection.f104370g;
        }

        @Override // com.revolut.retail.operation_status.modal_status.StatusViewConfiguration
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF104385a() {
            return this.f104367a;
        }

        public final int hashCode() {
            int iA = p.a.a(this.f104367a.hashCode() * 31, 31, this.f104368b);
            Clause clause = this.f104369c;
            int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
            Parcelable parcelable = this.d;
            int iHashCode2 = (iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            AnalyticsProduct analyticsProduct = this.e;
            int iHashCode3 = (iHashCode2 + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
            AnalyticsContext analyticsContext = this.f;
            return Boolean.hashCode(this.f104370g) + ((iHashCode3 + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104367a);
            dest.writeParcelable(this.f104368b, i);
            dest.writeParcelable(this.f104369c, i);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
            dest.writeParcelable(this.f, i);
            dest.writeInt(this.f104370g ? 1 : 0);
        }
    }

    private StatusViewConfiguration() {
    }

    /* JADX INFO: renamed from: a */
    public abstract Parcelable getF();

    /* JADX INFO: renamed from: b */
    public abstract boolean getF104390j();

    /* JADX INFO: renamed from: getId */
    public abstract String getF104385a();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/operation_status/modal_status/StatusViewConfiguration$LoadingIndefinite;", "Lcom/revolut/retail/operation_status/modal_status/StatusViewConfiguration;", "", "toString", "()Ljava/lang/String;", "retail_operation_status_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoadingIndefinite extends StatusViewConfiguration {

        @NotNull
        public static final Parcelable.Creator<LoadingIndefinite> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f104362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f104363c;
        public final Parcelable d;
        public final AnalyticsProduct e;
        public final AnalyticsContext f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Clause f104364g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f104365h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f104366j;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                Clause clause = (Clause) parcel.readParcelable(LoadingIndefinite.class.getClassLoader());
                Clause clause2 = (Clause) parcel.readParcelable(LoadingIndefinite.class.getClassLoader());
                Parcelable parcelable = parcel.readParcelable(LoadingIndefinite.class.getClassLoader());
                AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(LoadingIndefinite.class.getClassLoader());
                AnalyticsContext analyticsContext = (AnalyticsContext) parcel.readParcelable(LoadingIndefinite.class.getClassLoader());
                Clause clause3 = (Clause) parcel.readParcelable(LoadingIndefinite.class.getClassLoader());
                boolean z4 = false;
                boolean z6 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = true;
                    z6 = z;
                }
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                return new LoadingIndefinite(string, clause, clause2, parcelable, analyticsProduct, analyticsContext, clause3, z4, z6, z3);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoadingIndefinite[i];
            }
        }

        public LoadingIndefinite(String id10, Clause clause, Clause clause2, Parcelable parcelable, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, Clause clause3, boolean z, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f104361a = id10;
            this.f104362b = clause;
            this.f104363c = clause2;
            this.d = parcelable;
            this.e = analyticsProduct;
            this.f = analyticsContext;
            this.f104364g = clause3;
            this.f104365h = z;
            this.i = z3;
            this.f104366j = z4;
        }

        public static LoadingIndefinite c(LoadingIndefinite loadingIndefinite, int i) {
            String id10 = loadingIndefinite.f104361a;
            Clause clause = loadingIndefinite.f104362b;
            Clause clause2 = loadingIndefinite.f104363c;
            Parcelable parcelable = loadingIndefinite.d;
            AnalyticsProduct analyticsProduct = loadingIndefinite.e;
            AnalyticsContext analyticsContext = loadingIndefinite.f;
            Clause clause3 = loadingIndefinite.f104364g;
            boolean z = loadingIndefinite.f104365h;
            boolean z3 = (i & 256) != 0 ? loadingIndefinite.i : false;
            loadingIndefinite.getClass();
            Intrinsics.checkNotNullParameter(id10, "id");
            return new LoadingIndefinite(id10, clause, clause2, parcelable, analyticsProduct, analyticsContext, clause3, z, z3, false);
        }

        @Override // com.revolut.retail.operation_status.modal_status.StatusViewConfiguration
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Parcelable getF() {
            return this.d;
        }

        @Override // com.revolut.retail.operation_status.modal_status.StatusViewConfiguration
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF104390j() {
            return this.f104366j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LoadingIndefinite)) {
                return false;
            }
            LoadingIndefinite loadingIndefinite = (LoadingIndefinite) obj2;
            return Intrinsics.f(this.f104361a, loadingIndefinite.f104361a) && Intrinsics.f(this.f104362b, loadingIndefinite.f104362b) && Intrinsics.f(this.f104363c, loadingIndefinite.f104363c) && Intrinsics.f(this.d, loadingIndefinite.d) && Intrinsics.f(this.e, loadingIndefinite.e) && Intrinsics.f(this.f, loadingIndefinite.f) && Intrinsics.f(this.f104364g, loadingIndefinite.f104364g) && this.f104365h == loadingIndefinite.f104365h && this.i == loadingIndefinite.i && this.f104366j == loadingIndefinite.f104366j;
        }

        @Override // com.revolut.retail.operation_status.modal_status.StatusViewConfiguration
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF104385a() {
            return this.f104361a;
        }

        public final int hashCode() {
            int iHashCode = this.f104361a.hashCode() * 31;
            Clause clause = this.f104362b;
            int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.f104363c;
            int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
            Parcelable parcelable = this.d;
            int iHashCode4 = (iHashCode3 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            AnalyticsProduct analyticsProduct = this.e;
            int iHashCode5 = (iHashCode4 + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
            AnalyticsContext analyticsContext = this.f;
            int iA = (iHashCode5 + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31;
            Clause clause3 = this.f104364g;
            return Boolean.hashCode(this.f104366j) + j6.a.c(j6.a.c((iA + (clause3 != null ? clause3.hashCode() : 0)) * 31, 31, this.f104365h), 31, this.i);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104361a);
            dest.writeParcelable(this.f104362b, i);
            dest.writeParcelable(this.f104363c, i);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
            dest.writeParcelable(this.f, i);
            dest.writeParcelable(this.f104364g, i);
            dest.writeInt(this.f104365h ? 1 : 0);
            dest.writeInt(this.i ? 1 : 0);
            dest.writeInt(this.f104366j ? 1 : 0);
        }

        public /* synthetic */ LoadingIndefinite(int i, TextLocalisedClause textLocalisedClause, String str) {
            this(str, (i & 2) != 0 ? null : textLocalisedClause, null, null, null, null, null, true, false, (i & 512) != 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/operation_status/modal_status/StatusViewConfiguration$Warning;", "Lcom/revolut/retail/operation_status/modal_status/StatusViewConfiguration;", "", "toString", "()Ljava/lang/String;", "retail_operation_status_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Warning extends StatusViewConfiguration {

        @NotNull
        public static final Parcelable.Creator<Warning> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f104386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f104387c;
        public final Clause d;
        public final Clause e;
        public final Parcelable f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AnalyticsProduct f104388g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AnalyticsContext f104389h;
        public final StatusViewDescriptionProgress i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f104390j;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Warning(parcel.readString(), (Clause) parcel.readParcelable(Warning.class.getClassLoader()), (Clause) parcel.readParcelable(Warning.class.getClassLoader()), (Clause) parcel.readParcelable(Warning.class.getClassLoader()), (Clause) parcel.readParcelable(Warning.class.getClassLoader()), parcel.readParcelable(Warning.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(Warning.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(Warning.class.getClassLoader()), parcel.readInt() == 0 ? null : StatusViewDescriptionProgress.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Warning[i];
            }
        }

        public Warning(String id10, Clause title, Clause clause, Clause clause2, Clause clause3, Parcelable parcelable, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, StatusViewDescriptionProgress statusViewDescriptionProgress, boolean z) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f104385a = id10;
            this.f104386b = title;
            this.f104387c = clause;
            this.d = clause2;
            this.e = clause3;
            this.f = parcelable;
            this.f104388g = analyticsProduct;
            this.f104389h = analyticsContext;
            this.i = statusViewDescriptionProgress;
            this.f104390j = z;
        }

        @Override // com.revolut.retail.operation_status.modal_status.StatusViewConfiguration
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Parcelable getF() {
            return this.f;
        }

        @Override // com.revolut.retail.operation_status.modal_status.StatusViewConfiguration
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF104390j() {
            return this.f104390j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Warning)) {
                return false;
            }
            Warning warning = (Warning) obj2;
            return Intrinsics.f(this.f104385a, warning.f104385a) && Intrinsics.f(this.f104386b, warning.f104386b) && Intrinsics.f(this.f104387c, warning.f104387c) && Intrinsics.f(this.d, warning.d) && Intrinsics.f(this.e, warning.e) && Intrinsics.f(this.f, warning.f) && Intrinsics.f(this.f104388g, warning.f104388g) && Intrinsics.f(this.f104389h, warning.f104389h) && Intrinsics.f(this.i, warning.i) && this.f104390j == warning.f104390j;
        }

        @Override // com.revolut.retail.operation_status.modal_status.StatusViewConfiguration
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF104385a() {
            return this.f104385a;
        }

        public final int hashCode() {
            int iA = p.a.a(this.f104385a.hashCode() * 31, 31, this.f104386b);
            Clause clause = this.f104387c;
            int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.d;
            int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
            Clause clause3 = this.e;
            int iHashCode3 = (iHashCode2 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
            Parcelable parcelable = this.f;
            int iHashCode4 = (iHashCode3 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            AnalyticsProduct analyticsProduct = this.f104388g;
            int iHashCode5 = (iHashCode4 + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
            AnalyticsContext analyticsContext = this.f104389h;
            int iA2 = (iHashCode5 + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31;
            StatusViewDescriptionProgress statusViewDescriptionProgress = this.i;
            return Boolean.hashCode(this.f104390j) + ((iA2 + (statusViewDescriptionProgress != null ? statusViewDescriptionProgress.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104385a);
            dest.writeParcelable(this.f104386b, i);
            dest.writeParcelable(this.f104387c, i);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
            dest.writeParcelable(this.f, i);
            dest.writeParcelable(this.f104388g, i);
            dest.writeParcelable(this.f104389h, i);
            StatusViewDescriptionProgress statusViewDescriptionProgress = this.i;
            if (statusViewDescriptionProgress == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                statusViewDescriptionProgress.writeToParcel(dest, i);
            }
            dest.writeInt(this.f104390j ? 1 : 0);
        }

        public /* synthetic */ Warning(String str, Clause clause, Clause clause2, Clause clause3, TextLocalisedClause textLocalisedClause, Parcelable parcelable, int i) {
            this(str, clause, (i & 4) != 0 ? null : clause2, clause3, (i & 16) != 0 ? null : textLocalisedClause, (i & 32) != 0 ? null : parcelable, null, null, null, true);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/operation_status/modal_status/StatusViewConfiguration$Success;", "Lcom/revolut/retail/operation_status/modal_status/StatusViewConfiguration;", "", "toString", "()Ljava/lang/String;", "retail_operation_status_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Success extends StatusViewConfiguration {

        @NotNull
        public static final Parcelable.Creator<Success> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f104380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f104381c;
        public final Parcelable d;
        public final AnalyticsProduct e;
        public final AnalyticsContext f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f104382g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final SuccessType f104383h;
        public final k3l.a i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final StatusViewDescriptionProgress f104384j;
        public final StatusViewContract$Duration k;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Success(parcel.readString(), (Clause) parcel.readParcelable(Success.class.getClassLoader()), (Clause) parcel.readParcelable(Success.class.getClassLoader()), parcel.readParcelable(Success.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(Success.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(Success.class.getClassLoader()), parcel.readInt() != 0, (SuccessType) parcel.readParcelable(Success.class.getClassLoader()), k3l.a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : StatusViewDescriptionProgress.CREATOR.createFromParcel(parcel), (StatusViewContract$Duration) parcel.readParcelable(Success.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Success[i];
            }
        }

        public Success(String id10, Clause title, Clause clause, Parcelable parcelable, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, boolean z, SuccessType successType, k3l.a overlayAnimation, StatusViewDescriptionProgress statusViewDescriptionProgress, StatusViewContract$Duration duration) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(successType, "successType");
            Intrinsics.checkNotNullParameter(overlayAnimation, "overlayAnimation");
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.f104379a = id10;
            this.f104380b = title;
            this.f104381c = clause;
            this.d = parcelable;
            this.e = analyticsProduct;
            this.f = analyticsContext;
            this.f104382g = z;
            this.f104383h = successType;
            this.i = overlayAnimation;
            this.f104384j = statusViewDescriptionProgress;
            this.k = duration;
        }

        @Override // com.revolut.retail.operation_status.modal_status.StatusViewConfiguration
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Parcelable getF() {
            return this.d;
        }

        @Override // com.revolut.retail.operation_status.modal_status.StatusViewConfiguration
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF104390j() {
            return this.f104382g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Success)) {
                return false;
            }
            Success success = (Success) obj2;
            return Intrinsics.f(this.f104379a, success.f104379a) && Intrinsics.f(this.f104380b, success.f104380b) && Intrinsics.f(this.f104381c, success.f104381c) && Intrinsics.f(this.d, success.d) && Intrinsics.f(this.e, success.e) && Intrinsics.f(this.f, success.f) && this.f104382g == success.f104382g && Intrinsics.f(this.f104383h, success.f104383h) && this.i == success.i && Intrinsics.f(this.f104384j, success.f104384j) && Intrinsics.f(this.k, success.k);
        }

        @Override // com.revolut.retail.operation_status.modal_status.StatusViewConfiguration
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF104385a() {
            return this.f104379a;
        }

        public final int hashCode() {
            int iA = p.a.a(this.f104379a.hashCode() * 31, 31, this.f104380b);
            Clause clause = this.f104381c;
            int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
            Parcelable parcelable = this.d;
            int iHashCode2 = (iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            AnalyticsProduct analyticsProduct = this.e;
            int iHashCode3 = (iHashCode2 + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
            AnalyticsContext analyticsContext = this.f;
            int iHashCode4 = (this.i.hashCode() + ((this.f104383h.hashCode() + j6.a.c((iHashCode3 + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31, 31, this.f104382g)) * 31)) * 31;
            StatusViewDescriptionProgress statusViewDescriptionProgress = this.f104384j;
            return this.k.hashCode() + ((iHashCode4 + (statusViewDescriptionProgress != null ? statusViewDescriptionProgress.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104379a);
            dest.writeParcelable(this.f104380b, i);
            dest.writeParcelable(this.f104381c, i);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
            dest.writeParcelable(this.f, i);
            dest.writeInt(this.f104382g ? 1 : 0);
            dest.writeParcelable(this.f104383h, i);
            dest.writeString(this.i.name());
            StatusViewDescriptionProgress statusViewDescriptionProgress = this.f104384j;
            if (statusViewDescriptionProgress == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                statusViewDescriptionProgress.writeToParcel(dest, i);
            }
            dest.writeParcelable(this.k, i);
        }

        public /* synthetic */ Success(String str, Clause clause, Clause clause2, Parcelable parcelable, SuccessType successType, int i) {
            this(str, clause, (i & 4) != 0 ? null : clause2, (i & 8) != 0 ? null : parcelable, null, null, true, (i & 128) != 0 ? SuccessType.Simple.f104398a : successType, k3l.a.NONE, null, StatusViewContract$Duration.Long.f59733a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/operation_status/modal_status/StatusViewConfiguration$Error;", "Lcom/revolut/retail/operation_status/modal_status/StatusViewConfiguration;", "", "toString", "()Ljava/lang/String;", "retail_operation_status_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error extends StatusViewConfiguration {

        @NotNull
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f104349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f104350c;
        public final Clause d;
        public final Clause e;
        public final Image f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Parcelable f104351g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AnalyticsProduct f104352h;
        public final AnalyticsContext i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f104353j;
        public final Integer k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f104354l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f104355m;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Error(parcel.readString(), (Clause) parcel.readParcelable(Error.class.getClassLoader()), (Clause) parcel.readParcelable(Error.class.getClassLoader()), (Clause) parcel.readParcelable(Error.class.getClassLoader()), (Clause) parcel.readParcelable(Error.class.getClassLoader()), (Image) parcel.readParcelable(Error.class.getClassLoader()), parcel.readParcelable(Error.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(Error.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(Error.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Error[i];
            }
        }

        public Error(String id10, Clause title, Clause clause, Clause clause2, Clause clause3, Image image, Parcelable parcelable, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, boolean z, Integer num, String str, String dialogBreadcrumb) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(dialogBreadcrumb, "dialogBreadcrumb");
            this.f104348a = id10;
            this.f104349b = title;
            this.f104350c = clause;
            this.d = clause2;
            this.e = clause3;
            this.f = image;
            this.f104351g = parcelable;
            this.f104352h = analyticsProduct;
            this.i = analyticsContext;
            this.f104353j = z;
            this.k = num;
            this.f104354l = str;
            this.f104355m = dialogBreadcrumb;
        }

        @Override // com.revolut.retail.operation_status.modal_status.StatusViewConfiguration
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Parcelable getF() {
            return this.f104351g;
        }

        @Override // com.revolut.retail.operation_status.modal_status.StatusViewConfiguration
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF104390j() {
            return this.f104353j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!Error.class.equals(obj2 != null ? obj2.getClass() : null)) {
                return false;
            }
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.retail.operation_status.modal_status.StatusViewConfiguration.Error");
            Error error = (Error) obj2;
            return this.f104353j == error.f104353j && Intrinsics.f(this.k, error.k) && Intrinsics.f(this.f104348a, error.f104348a) && Intrinsics.f(this.f104349b, error.f104349b) && Intrinsics.f(this.f104350c, error.f104350c) && Intrinsics.f(this.d, error.d) && Intrinsics.f(this.e, error.e) && Intrinsics.f(this.f, error.f) && Intrinsics.f(this.f104351g, error.f104351g) && Intrinsics.f(this.f104352h, error.f104352h) && Intrinsics.f(this.i, error.i) && Intrinsics.f(this.f104354l, error.f104354l);
        }

        @Override // com.revolut.retail.operation_status.modal_status.StatusViewConfiguration
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF104385a() {
            return this.f104348a;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f104353j) * 31;
            Integer num = this.k;
            int iA = p.a.a(p.a.c((iHashCode + (num != null ? num.intValue() : 0)) * 31, 31, this.f104348a), 31, this.f104349b);
            Clause clause = this.f104350c;
            int iHashCode2 = (iA + (clause != null ? clause.hashCode() : 0)) * 31;
            Clause clause2 = this.d;
            int iHashCode3 = (iHashCode2 + (clause2 != null ? clause2.hashCode() : 0)) * 31;
            Clause clause3 = this.e;
            int iHashCode4 = (iHashCode3 + (clause3 != null ? clause3.hashCode() : 0)) * 31;
            Image image = this.f;
            int iHashCode5 = (iHashCode4 + (image != null ? image.hashCode() : 0)) * 31;
            Parcelable parcelable = this.f104351g;
            int iHashCode6 = (iHashCode5 + (parcelable != null ? parcelable.hashCode() : 0)) * 31;
            AnalyticsProduct analyticsProduct = this.f104352h;
            int iHashCode7 = (iHashCode6 + (analyticsProduct != null ? analyticsProduct.hashCode() : 0)) * 31;
            AnalyticsContext analyticsContext = this.i;
            int iA2 = (iHashCode7 + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0)) * 31;
            String str = this.f104354l;
            return iA2 + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104348a);
            dest.writeParcelable(this.f104349b, i);
            dest.writeParcelable(this.f104350c, i);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
            dest.writeParcelable(this.f, i);
            dest.writeParcelable(this.f104351g, i);
            dest.writeParcelable(this.f104352h, i);
            dest.writeParcelable(this.i, i);
            dest.writeInt(this.f104353j ? 1 : 0);
            Integer num = this.k;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            dest.writeString(this.f104354l);
            dest.writeString(this.f104355m);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Error(String str, Clause clause, Clause clause2, Clause clause3, TextLocalisedClause textLocalisedClause, Parcelable parcelable, AnalyticsProduct analyticsProduct, int i) {
            Clause clause4 = (i & 4) != 0 ? null : clause2;
            Clause clause5 = (i & 8) != 0 ? null : clause3;
            TextLocalisedClause textLocalisedClause2 = (i & 16) != 0 ? null : textLocalisedClause;
            Parcelable parcelable2 = (i & 64) != 0 ? null : parcelable;
            AnalyticsProduct analyticsProduct2 = (i & 128) != 0 ? null : analyticsProduct;
            StackTraceElement[] stackTrace = new BreadcrumbException().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            this(str, clause, clause4, clause5, textLocalisedClause2, null, parcelable2, analyticsProduct2, null, true, null, null, d0.k0(d0.V0(d.K(1, stackTrace), 3), null, null, null, 0, null, 63));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/operation_status/modal_status/StatusViewConfiguration$Pending;", "Lcom/revolut/retail/operation_status/modal_status/StatusViewConfiguration;", "", "toString", "()Ljava/lang/String;", "retail_operation_status_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pending extends StatusViewConfiguration {

        @NotNull
        public static final Parcelable.Creator<Pending> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f104372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f104373c;
        public final Clause d;
        public final Clause e;
        public final Image f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Parcelable f104374g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AnalyticsProduct f104375h;
        public final AnalyticsContext i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f104376j;
        public final StatusViewDescriptionProgress k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f104377l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f104378m;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                StatusViewDescriptionProgress statusViewDescriptionProgress;
                boolean z4;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                Clause clause = (Clause) parcel.readParcelable(Pending.class.getClassLoader());
                Clause clause2 = (Clause) parcel.readParcelable(Pending.class.getClassLoader());
                Clause clause3 = (Clause) parcel.readParcelable(Pending.class.getClassLoader());
                Clause clause4 = (Clause) parcel.readParcelable(Pending.class.getClassLoader());
                Image image = (Image) parcel.readParcelable(Pending.class.getClassLoader());
                Parcelable parcelable = parcel.readParcelable(Pending.class.getClassLoader());
                AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(Pending.class.getClassLoader());
                AnalyticsContext analyticsContext = (AnalyticsContext) parcel.readParcelable(Pending.class.getClassLoader());
                boolean z6 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z6 = true;
                } else {
                    z = false;
                }
                StatusViewDescriptionProgress statusViewDescriptionProgressCreateFromParcel = parcel.readInt() == 0 ? null : StatusViewDescriptionProgress.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    z3 = true;
                    statusViewDescriptionProgress = statusViewDescriptionProgressCreateFromParcel;
                    z4 = true;
                } else {
                    z3 = true;
                    statusViewDescriptionProgress = statusViewDescriptionProgressCreateFromParcel;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                return new Pending(string, clause, clause2, clause3, clause4, image, parcelable, analyticsProduct, analyticsContext, z6, statusViewDescriptionProgress, z4, z3);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pending[i];
            }
        }

        public Pending(String id10, Clause title, Clause clause, Clause clause2, Clause clause3, Image image, Parcelable parcelable, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, boolean z, StatusViewDescriptionProgress statusViewDescriptionProgress, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f104371a = id10;
            this.f104372b = title;
            this.f104373c = clause;
            this.d = clause2;
            this.e = clause3;
            this.f = image;
            this.f104374g = parcelable;
            this.f104375h = analyticsProduct;
            this.i = analyticsContext;
            this.f104376j = z;
            this.k = statusViewDescriptionProgress;
            this.f104377l = z3;
            this.f104378m = z4;
        }

        @Override // com.revolut.retail.operation_status.modal_status.StatusViewConfiguration
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Parcelable getF() {
            return this.f104374g;
        }

        @Override // com.revolut.retail.operation_status.modal_status.StatusViewConfiguration
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF104390j() {
            return this.f104377l;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Pending)) {
                return false;
            }
            Pending pending = (Pending) obj2;
            return Intrinsics.f(this.f104371a, pending.f104371a) && Intrinsics.f(this.f104372b, pending.f104372b) && Intrinsics.f(this.f104373c, pending.f104373c) && Intrinsics.f(this.d, pending.d) && Intrinsics.f(this.e, pending.e) && Intrinsics.f(this.f, pending.f) && Intrinsics.f(this.f104374g, pending.f104374g) && Intrinsics.f(this.f104375h, pending.f104375h) && Intrinsics.f(this.i, pending.i) && this.f104376j == pending.f104376j && Intrinsics.f(this.k, pending.k) && this.f104377l == pending.f104377l && this.f104378m == pending.f104378m;
        }

        @Override // com.revolut.retail.operation_status.modal_status.StatusViewConfiguration
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF104385a() {
            return this.f104371a;
        }

        public final int hashCode() {
            int iA = p.a.a(this.f104371a.hashCode() * 31, 31, this.f104372b);
            Clause clause = this.f104373c;
            int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.d;
            int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
            Clause clause3 = this.e;
            int iHashCode3 = (iHashCode2 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
            Image image = this.f;
            int iHashCode4 = (iHashCode3 + (image == null ? 0 : image.hashCode())) * 31;
            Parcelable parcelable = this.f104374g;
            int iHashCode5 = (iHashCode4 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            AnalyticsProduct analyticsProduct = this.f104375h;
            int iHashCode6 = (iHashCode5 + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
            AnalyticsContext analyticsContext = this.i;
            int iC = j6.a.c((iHashCode6 + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31, 31, this.f104376j);
            StatusViewDescriptionProgress statusViewDescriptionProgress = this.k;
            return Boolean.hashCode(this.f104378m) + j6.a.c((iC + (statusViewDescriptionProgress != null ? statusViewDescriptionProgress.hashCode() : 0)) * 31, 31, this.f104377l);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104371a);
            dest.writeParcelable(this.f104372b, i);
            dest.writeParcelable(this.f104373c, i);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
            dest.writeParcelable(this.f, i);
            dest.writeParcelable(this.f104374g, i);
            dest.writeParcelable(this.f104375h, i);
            dest.writeParcelable(this.i, i);
            dest.writeInt(this.f104376j ? 1 : 0);
            StatusViewDescriptionProgress statusViewDescriptionProgress = this.k;
            if (statusViewDescriptionProgress == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                statusViewDescriptionProgress.writeToParcel(dest, i);
            }
            dest.writeInt(this.f104377l ? 1 : 0);
            dest.writeInt(this.f104378m ? 1 : 0);
        }

        public /* synthetic */ Pending(String str, Clause clause, Clause clause2, Clause clause3, TextLocalisedClause textLocalisedClause, Parcelable parcelable, boolean z, int i) {
            this(str, clause, clause2, (i & 8) != 0 ? null : clause3, (i & 16) != 0 ? null : textLocalisedClause, null, (i & 64) != 0 ? null : parcelable, null, null, (i & 512) != 0 ? true : z, null, true, (i & 4096) != 0);
        }
    }
}
