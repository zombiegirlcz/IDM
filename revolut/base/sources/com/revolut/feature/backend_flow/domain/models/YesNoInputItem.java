package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/YesNoInputItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class YesNoInputItem implements InputItem {

    @NotNull
    public static final Parcelable.Creator<YesNoInputItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63728c;
    public final String d;
    public final Boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            boolean z4 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
                z3 = true;
            } else {
                z = false;
                z3 = true;
            }
            String string2 = parcel.readString();
            boolean z6 = z3;
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = z6;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new YesNoInputItem(string, z4, string2, string3, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new YesNoInputItem[i];
        }
    }

    public YesNoInputItem(String id10, boolean z, String yesTitle, String noTitle, Boolean bool) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(yesTitle, "yesTitle");
        Intrinsics.checkNotNullParameter(noTitle, "noTitle");
        this.f63726a = id10;
        this.f63727b = z;
        this.f63728c = yesTitle;
        this.d = noTitle;
        this.e = bool;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63726a() {
        return this.f63726a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF63727b() {
        return this.f63727b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof YesNoInputItem)) {
            return false;
        }
        YesNoInputItem yesNoInputItem = (YesNoInputItem) obj2;
        return Intrinsics.f(this.f63726a, yesNoInputItem.f63726a) && this.f63727b == yesNoInputItem.f63727b && Intrinsics.f(this.f63728c, yesNoInputItem.f63728c) && Intrinsics.f(this.d, yesNoInputItem.d) && Intrinsics.f(this.e, yesNoInputItem.e);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63726a;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(j6.a.c(this.f63726a.hashCode() * 31, 31, this.f63727b), 31, this.f63728c), 31, this.d);
        Boolean bool = this.e;
        return iC + (bool == null ? 0 : bool.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63726a);
        dest.writeInt(this.f63727b ? 1 : 0);
        dest.writeString(this.f63728c);
        dest.writeString(this.d);
        Boolean bool = this.e;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
    }
}
