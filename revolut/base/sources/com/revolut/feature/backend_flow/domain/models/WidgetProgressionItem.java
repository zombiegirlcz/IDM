package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl2.t;
import xl2.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004J\u0010\u0010\u0005\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/WidgetProgressionItem;", "Lcom/revolut/feature/backend_flow/domain/models/BackendItem;", "Lxl2/t;", "", "Lxl2/u;", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WidgetProgressionItem implements BackendItem, t, u {

    @NotNull
    public static final Parcelable.Creator<WidgetProgressionItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BackendFlowWidgetProgression f63722c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WidgetProgressionItem(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BackendFlowWidgetProgression.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WidgetProgressionItem[i];
        }
    }

    public WidgetProgressionItem(String id10, String ticketId, BackendFlowWidgetProgression backendFlowWidgetProgression) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        this.f63720a = id10;
        this.f63721b = ticketId;
        this.f63722c = backendFlowWidgetProgression;
    }

    public static WidgetProgressionItem d(WidgetProgressionItem widgetProgressionItem, BackendFlowWidgetProgression backendFlowWidgetProgression) {
        String id10 = widgetProgressionItem.f63720a;
        String ticketId = widgetProgressionItem.f63721b;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        return new WidgetProgressionItem(id10, ticketId, backendFlowWidgetProgression);
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63720a() {
        return this.f63720a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WidgetProgressionItem)) {
            return false;
        }
        WidgetProgressionItem widgetProgressionItem = (WidgetProgressionItem) obj2;
        return Intrinsics.f(this.f63720a, widgetProgressionItem.f63720a) && Intrinsics.f(this.f63721b, widgetProgressionItem.f63721b) && Intrinsics.f(this.f63722c, widgetProgressionItem.f63722c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f63720a.hashCode() * 31, 31, this.f63721b);
        BackendFlowWidgetProgression backendFlowWidgetProgression = this.f63722c;
        return iC + (backendFlowWidgetProgression == null ? 0 : backendFlowWidgetProgression.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63720a);
        dest.writeString(this.f63721b);
        BackendFlowWidgetProgression backendFlowWidgetProgression = this.f63722c;
        if (backendFlowWidgetProgression == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            backendFlowWidgetProgression.writeToParcel(dest, i);
        }
    }
}
