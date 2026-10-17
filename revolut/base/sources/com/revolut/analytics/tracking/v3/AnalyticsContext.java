package com.revolut.analytics.tracking.v3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003\u0088\u0001\u0004\u0092\u0001\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/analytics/tracking/v3/AnalyticsContext;", "Landroid/os/Parcelable;", "Companion", "b", "context", "Lcom/google/protobuf/w0;", "analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AnalyticsContext implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f50296a;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<AnalyticsContext> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel source) throws Throwable {
            Intrinsics.checkNotNullParameter(source, "source");
            Companion companion = AnalyticsContext.INSTANCE;
            w0 w0VarM = pd.b.m(source);
            companion.getClass();
            return new AnalyticsContext(Companion.a(w0VarM));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AnalyticsContext[i];
        }
    }

    /* JADX INFO: renamed from: com.revolut.analytics.tracking.v3.AnalyticsContext$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static w0 a(Object obj2) {
            AnalyticsContext analyticsContext = new AnalyticsContext(null);
            if (obj2 == null) {
                obj2 = analyticsContext;
            } else if (!(obj2 instanceof AnalyticsContext)) {
                if (!(obj2 instanceof w0)) {
                    throw new IllegalArgumentException(obj2.getClass() + " is not a protobuf generated model");
                }
                analyticsContext = new AnalyticsContext((w0) obj2);
                obj2 = analyticsContext;
            }
            return ((AnalyticsContext) obj2).f50296a;
        }
    }

    public /* synthetic */ AnalyticsContext(w0 w0Var) {
        this.f50296a = w0Var;
    }

    public static int a(w0 w0Var) {
        if (w0Var == null) {
            return 0;
        }
        return w0Var.hashCode();
    }

    public static String b(w0 w0Var) {
        return "AnalyticsContext(context=" + w0Var + ")";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof AnalyticsContext) {
            return Intrinsics.f(this.f50296a, ((AnalyticsContext) obj2).f50296a);
        }
        return false;
    }

    public final int hashCode() {
        return a(this.f50296a);
    }

    public final String toString() {
        return b(this.f50296a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Intrinsics.checkNotNullParameter(dest, "dest");
        pd.b.x(this.f50296a, dest);
    }
}
