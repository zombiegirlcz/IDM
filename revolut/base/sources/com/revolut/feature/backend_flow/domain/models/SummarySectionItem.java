package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SummarySectionItem;", "Lcom/revolut/feature/backend_flow/domain/models/BackendItem;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SummarySectionItem implements BackendItem {

    @NotNull
    public static final Parcelable.Creator<SummarySectionItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BackendIconType f63672c;
    public final String d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SummarySectionItem(parcel.readString(), parcel.readString(), (BackendIconType) parcel.readParcelable(SummarySectionItem.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SummarySectionItem[i];
        }
    }

    public SummarySectionItem(String title, String subtitle, BackendIconType iconType, String section, String nextViewId) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(iconType, "iconType");
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(nextViewId, "nextViewId");
        this.f63670a = title;
        this.f63671b = subtitle;
        this.f63672c = iconType;
        this.d = section;
        this.e = nextViewId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SummarySectionItem)) {
            return false;
        }
        SummarySectionItem summarySectionItem = (SummarySectionItem) obj2;
        return Intrinsics.f(this.f63670a, summarySectionItem.f63670a) && Intrinsics.f(this.f63671b, summarySectionItem.f63671b) && Intrinsics.f(this.f63672c, summarySectionItem.f63672c) && Intrinsics.f(this.d, summarySectionItem.d) && Intrinsics.f(this.e, summarySectionItem.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c((this.f63672c.hashCode() + p.a.c(this.f63670a.hashCode() * 31, 31, this.f63671b)) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63670a);
        dest.writeString(this.f63671b);
        dest.writeParcelable(this.f63672c, i);
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
