package com.revolut.feature.backend_flow.domain.endpoint;

import android.os.Parcel;
import android.os.Parcelable;
import j6.a;
import java.net.URLEncoder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/endpoint/BackendFlowApiEndpoints;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BackendFlowApiEndpoints implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63223a;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<BackendFlowApiEndpoints> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.backend_flow.domain.endpoint.BackendFlowApiEndpoints$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static BackendFlowApiEndpoints a(String formId) {
            Intrinsics.checkNotNullParameter(formId, "formId");
            return new BackendFlowApiEndpoints(a.q("forms/", URLEncoder.encode(formId, "UTF-8")));
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BackendFlowApiEndpoints(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BackendFlowApiEndpoints[i];
        }
    }

    public BackendFlowApiEndpoints(String formItemValidationPath) {
        Intrinsics.checkNotNullParameter(formItemValidationPath, "formItemValidationPath");
        this.f63223a = formItemValidationPath;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof BackendFlowApiEndpoints) && Intrinsics.f(this.f63223a, ((BackendFlowApiEndpoints) obj2).f63223a);
    }

    public final int hashCode() {
        return this.f63223a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63223a);
    }
}
