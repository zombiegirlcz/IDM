package com.revolut.analytics.tracking.v3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.w0;
import com.revolut.tracking.v3.ScreenMetadata;
import com.revolut.tracking.v3.UiInteraction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003\u0088\u0001\u0004\u0092\u0001\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/analytics/tracking/v3/AnalyticsMetadata;", "Landroid/os/Parcelable;", "Companion", "b", "proto", "Lcom/google/protobuf/w0;", "analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AnalyticsMetadata implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f50297a;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<AnalyticsMetadata> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel source) throws Throwable {
            Intrinsics.checkNotNullParameter(source, "source");
            Companion companion = AnalyticsMetadata.INSTANCE;
            w0 w0VarM = pd.b.m(source);
            companion.getClass();
            return new AnalyticsMetadata(Companion.a(w0VarM));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AnalyticsMetadata[i];
        }
    }

    /* JADX INFO: renamed from: com.revolut.analytics.tracking.v3.AnalyticsMetadata$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static w0 a(w0 w0Var) {
            AnalyticsMetadata analyticsMetadata = new AnalyticsMetadata(null);
            if (w0Var != null) {
                if (!(w0Var instanceof ScreenMetadata) && !(w0Var instanceof UiInteraction)) {
                    throw new UnsupportedMetadataType(w0Var);
                }
                analyticsMetadata = new AnalyticsMetadata(w0Var);
            }
            return analyticsMetadata.f50297a;
        }
    }

    public /* synthetic */ AnalyticsMetadata(w0 w0Var) {
        this.f50297a = w0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof AnalyticsMetadata) {
            return Intrinsics.f(this.f50297a, ((AnalyticsMetadata) obj2).f50297a);
        }
        return false;
    }

    public final int hashCode() {
        w0 w0Var = this.f50297a;
        if (w0Var == null) {
            return 0;
        }
        return w0Var.hashCode();
    }

    public final String toString() {
        return "AnalyticsMetadata(proto=" + this.f50297a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Intrinsics.checkNotNullParameter(dest, "dest");
        pd.b.x(this.f50297a, dest);
    }
}
