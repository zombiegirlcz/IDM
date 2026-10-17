package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/NoneApplyItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NoneApplyItem implements InputItem {

    @NotNull
    public static final Parcelable.Creator<NoneApplyItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f63554c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NoneApplyItem(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NoneApplyItem[i];
        }
    }

    public NoneApplyItem(String id10, String text, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f63552a = id10;
        this.f63553b = text;
        this.f63554c = z;
        this.d = z3;
    }

    public static NoneApplyItem d(NoneApplyItem noneApplyItem, boolean z) {
        String id10 = noneApplyItem.f63552a;
        String text = noneApplyItem.f63553b;
        boolean z3 = noneApplyItem.d;
        noneApplyItem.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        return new NoneApplyItem(id10, text, z, z3);
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63667a() {
        return this.f63552a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NoneApplyItem)) {
            return false;
        }
        NoneApplyItem noneApplyItem = (NoneApplyItem) obj2;
        return Intrinsics.f(this.f63552a, noneApplyItem.f63552a) && Intrinsics.f(this.f63553b, noneApplyItem.f63553b) && this.f63554c == noneApplyItem.f63554c && this.d == noneApplyItem.d;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63552a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(p.a.c(this.f63552a.hashCode() * 31, 31, this.f63553b), 31, this.f63554c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63552a);
        dest.writeString(this.f63553b);
        dest.writeInt(this.f63554c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
    }
}
