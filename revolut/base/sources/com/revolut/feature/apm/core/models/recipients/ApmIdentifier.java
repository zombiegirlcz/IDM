package com.revolut.feature.apm.core.models.recipients;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/models/recipients/ApmIdentifier;", "Landroid/os/Parcelable;", "Companion", "Uuid", "a", "Lcom/revolut/feature/apm/core/models/recipients/ApmDescriptor;", "Lcom/revolut/feature/apm/core/models/recipients/ApmIdentifier$Uuid;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ApmIdentifier extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f62113a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/recipients/ApmIdentifier$Uuid;", "Lcom/revolut/feature/apm/core/models/recipients/ApmIdentifier;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Uuid implements ApmIdentifier {

        @NotNull
        public static final Parcelable.Creator<Uuid> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62112a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Uuid(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Uuid[i];
            }
        }

        public Uuid(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f62112a = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Uuid) && Intrinsics.f(this.f62112a, ((Uuid) obj2).f62112a);
        }

        @Override // com.revolut.feature.apm.core.models.recipients.ApmIdentifier
        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final String getF62111b() {
            return this.f62112a;
        }

        public final int hashCode() {
            return this.f62112a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62112a);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.apm.core.models.recipients.ApmIdentifier$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f62113a = new Companion();

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: getValue */
    String getF62111b();
}
