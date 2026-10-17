package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/CardInputItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardInputItem implements InputItem {

    @NotNull
    public static final Parcelable.Creator<CardInputItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63344c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardInputItem(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardInputItem[i];
        }
    }

    public CardInputItem(String id10, String str, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f63342a = id10;
        this.f63343b = z;
        this.f63344c = str;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63342a() {
        return this.f63342a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF63343b() {
        return this.f63343b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardInputItem)) {
            return false;
        }
        CardInputItem cardInputItem = (CardInputItem) obj2;
        return Intrinsics.f(this.f63342a, cardInputItem.f63342a) && this.f63343b == cardInputItem.f63343b && Intrinsics.f(this.f63344c, cardInputItem.f63344c);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63342a;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f63342a.hashCode() * 31, 31, this.f63343b);
        String str = this.f63344c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63342a);
        dest.writeInt(this.f63343b ? 1 : 0);
        dest.writeString(this.f63344c);
    }
}
