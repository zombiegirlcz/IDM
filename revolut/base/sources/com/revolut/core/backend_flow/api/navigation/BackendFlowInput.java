package com.revolut.core.backend_flow.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput.Source;
import com.revolut.feature.backend_flow.domain.endpoint.BackendFlowApiEndpoints;
import com.revolut.feature.backend_flow.domain.models.BackendFlowNavigationIcon;
import com.revolut.kompot.common.IOData$Input;
import j6.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u0007*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002\b\tJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/revolut/core/backend_flow/api/navigation/BackendFlowInput;", "Lcom/revolut/core/backend_flow/api/navigation/BackendFlowInput$Source;", "T", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "Companion", "Source", "a", "core_backend_flow_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BackendFlowInput<T extends Source> implements IOData$Input {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Source f51218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f51219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsContext f51220c;
    public final BackendFlowNavigationIcon d;
    public final boolean e;
    public final BackendFlowApiEndpoints f;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<BackendFlowInput<?>> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/core/backend_flow/api/navigation/BackendFlowInput$Source;", "Landroid/os/Parcelable;", "Remote", "Session", "Lcom/revolut/core/backend_flow/api/navigation/BackendFlowInput$Source$Remote;", "Lcom/revolut/core/backend_flow/api/navigation/BackendFlowInput$Source$Session;", "core_backend_flow_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Source extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/backend_flow/api/navigation/BackendFlowInput$Source$Remote;", "Lcom/revolut/core/backend_flow/api/navigation/BackendFlowInput$Source;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Remote implements Source {

            @NotNull
            public static final Parcelable.Creator<Remote> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f51221a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Map f51222b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    int i = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                    int iD = 0;
                    while (iD != i) {
                        iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                    }
                    return new Remote(string, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Remote[i];
                }
            }

            public Remote(String id10, Map params) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(params, "params");
                this.f51221a = id10;
                this.f51222b = params;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Remote)) {
                    return false;
                }
                Remote remote = (Remote) obj2;
                return Intrinsics.f(this.f51221a, remote.f51221a) && Intrinsics.f(this.f51222b, remote.f51222b);
            }

            public final int hashCode() {
                return this.f51222b.hashCode() + (this.f51221a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f51221a);
                Iterator itZ = j6.a.z(this.f51222b, dest);
                while (itZ.hasNext()) {
                    Map.Entry entry = (Map.Entry) itZ.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeString((String) entry.getValue());
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/backend_flow/api/navigation/BackendFlowInput$Source$Session;", "Lcom/revolut/core/backend_flow/api/navigation/BackendFlowInput$Source;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Session implements Source {

            @NotNull
            public static final Parcelable.Creator<Session> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UUID f51223a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Session((UUID) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Session[i];
                }
            }

            public Session(UUID id10) {
                Intrinsics.checkNotNullParameter(id10, "id");
                this.f51223a = id10;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Session) && Intrinsics.f(this.f51223a, ((Session) obj2).f51223a);
            }

            public final int hashCode() {
                return this.f51223a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f51223a);
            }
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.backend_flow.api.navigation.BackendFlowInput$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static BackendFlowInput a(Companion companion, String formId, Map params, AnalyticsProduct.Retail retail, int i) {
            if ((i & 2) != 0) {
                params = r0.g();
            }
            if ((i & 4) != 0) {
                retail = null;
            }
            companion.getClass();
            Intrinsics.checkNotNullParameter(formId, "formId");
            Intrinsics.checkNotNullParameter(params, "params");
            Source.Remote remote = new Source.Remote(formId, params);
            BackendFlowApiEndpoints.INSTANCE.getClass();
            return new BackendFlowInput(remote, retail, null, null, false, BackendFlowApiEndpoints.Companion.a(formId), 60);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Source source = (Source) parcel.readParcelable(BackendFlowInput.class.getClassLoader());
            AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(BackendFlowInput.class.getClassLoader());
            AnalyticsContext analyticsContext = (AnalyticsContext) parcel.readParcelable(BackendFlowInput.class.getClassLoader());
            BackendFlowNavigationIcon backendFlowNavigationIcon = (BackendFlowNavigationIcon) parcel.readParcelable(BackendFlowInput.class.getClassLoader());
            boolean z = parcel.readInt() != 0;
            return new BackendFlowInput(source, analyticsProduct, analyticsContext, backendFlowNavigationIcon, z, (BackendFlowApiEndpoints) parcel.readParcelable(BackendFlowInput.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BackendFlowInput[i];
        }
    }

    public BackendFlowInput(Source source, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, BackendFlowNavigationIcon startScreenNavigationIcon, boolean z, BackendFlowApiEndpoints backendFlowApiEndpoints) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(startScreenNavigationIcon, "startScreenNavigationIcon");
        Intrinsics.checkNotNullParameter(backendFlowApiEndpoints, "backendFlowApiEndpoints");
        this.f51218a = source;
        this.f51219b = analyticsProduct;
        this.f51220c = analyticsContext;
        this.d = startScreenNavigationIcon;
        this.e = z;
        this.f = backendFlowApiEndpoints;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Source getF51218a() {
        return this.f51218a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BackendFlowInput)) {
            return false;
        }
        BackendFlowInput backendFlowInput = (BackendFlowInput) obj2;
        return Intrinsics.f(this.f51218a, backendFlowInput.f51218a) && Intrinsics.f(this.f51219b, backendFlowInput.f51219b) && Intrinsics.f(this.f51220c, backendFlowInput.f51220c) && Intrinsics.f(this.d, backendFlowInput.d) && this.e == backendFlowInput.e && Intrinsics.f(this.f, backendFlowInput.f);
    }

    public final int hashCode() {
        int iHashCode = this.f51218a.hashCode() * 31;
        AnalyticsProduct analyticsProduct = this.f51219b;
        int iHashCode2 = (iHashCode + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.f51220c;
        return this.f.f63223a.hashCode() + a.c((this.d.hashCode() + ((iHashCode2 + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0)) * 31)) * 31, 961, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f51218a, i);
        dest.writeParcelable(this.f51219b, i);
        dest.writeParcelable(this.f51220c, i);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeParcelable(null, i);
        dest.writeParcelable(this.f, i);
    }

    public /* synthetic */ BackendFlowInput(Source source, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, BackendFlowNavigationIcon backendFlowNavigationIcon, boolean z, BackendFlowApiEndpoints backendFlowApiEndpoints, int i) {
        this(source, (i & 2) != 0 ? null : analyticsProduct, (i & 4) != 0 ? null : analyticsContext, (i & 8) != 0 ? BackendFlowNavigationIcon.BackArrow.f63285a : backendFlowNavigationIcon, (i & 16) != 0 ? true : z, backendFlowApiEndpoints);
    }
}
