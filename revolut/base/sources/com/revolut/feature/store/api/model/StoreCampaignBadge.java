package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t1e.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreCampaignBadge;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreCampaignBadge implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreCampaignBadge> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f88436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88437b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoreCampaignBadge(c.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreCampaignBadge[i];
        }
    }

    public StoreCampaignBadge(c type, String text) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f88436a = type;
        this.f88437b = text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreCampaignBadge)) {
            return false;
        }
        StoreCampaignBadge storeCampaignBadge = (StoreCampaignBadge) obj2;
        return this.f88436a == storeCampaignBadge.f88436a && Intrinsics.f(this.f88437b, storeCampaignBadge.f88437b);
    }

    public final int hashCode() {
        return this.f88437b.hashCode() + (this.f88436a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88436a.name());
        dest.writeString(this.f88437b);
    }
}
