package com.revolut.feature.retail.advanced_charts.models;

import android.os.Parcel;
import android.os.Parcelable;
import d1b.c;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/retail/advanced_charts/models/OverlayPolicy;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_retail_advanced_charts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OverlayPolicy implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f82091a;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<OverlayPolicy> CREATOR = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final OverlayPolicy f82090b = new OverlayPolicy(0);

    /* JADX INFO: renamed from: com.revolut.feature.retail.advanced_charts.models.OverlayPolicy$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(c.valueOf(parcel.readString()));
            }
            return new OverlayPolicy(linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OverlayPolicy[i];
        }
    }

    static {
        new OverlayPolicy(y0.b(c.VOLUME));
    }

    public OverlayPolicy() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof OverlayPolicy) && Intrinsics.f(this.f82091a, ((OverlayPolicy) obj2).f82091a);
    }

    public final int hashCode() {
        return this.f82091a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f82091a, dest);
        while (itV.hasNext()) {
            dest.writeString(((c) itV.next()).name());
        }
    }

    public OverlayPolicy(Set overlayIndicators) {
        Intrinsics.checkNotNullParameter(overlayIndicators, "overlayIndicators");
        this.f82091a = overlayIndicators;
    }

    public OverlayPolicy(int i) {
        this(h0.f322473a);
    }
}
