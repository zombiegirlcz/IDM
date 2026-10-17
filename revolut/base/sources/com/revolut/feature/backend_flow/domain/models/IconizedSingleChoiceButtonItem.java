package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl2.l;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/IconizedSingleChoiceButtonItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "Lxl2/l;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final /* data */ class IconizedSingleChoiceButtonItem implements InputItem, l {

    @NotNull
    public static final Parcelable.Creator<IconizedSingleChoiceButtonItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f63484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63485c;
    public final String d;
    public final BackendIconType e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f63486g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            BackendIconType backendIconType = (BackendIconType) parcel.readParcelable(IconizedSingleChoiceButtonItem.class.getClassLoader());
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new IconizedSingleChoiceButtonItem(string, numValueOf, string2, string3, backendIconType, z3, parcel.readInt() == 0 ? z : true);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IconizedSingleChoiceButtonItem[i];
        }
    }

    public IconizedSingleChoiceButtonItem(String id10, Integer num, String str, String text, BackendIconType backendIconType, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f63483a = id10;
        this.f63484b = num;
        this.f63485c = str;
        this.d = text;
        this.e = backendIconType;
        this.f = z;
        this.f63486g = z3;
    }

    public static IconizedSingleChoiceButtonItem J(IconizedSingleChoiceButtonItem iconizedSingleChoiceButtonItem, boolean z) {
        String id10 = iconizedSingleChoiceButtonItem.f63483a;
        Integer num = iconizedSingleChoiceButtonItem.f63484b;
        String str = iconizedSingleChoiceButtonItem.f63485c;
        String text = iconizedSingleChoiceButtonItem.d;
        BackendIconType backendIconType = iconizedSingleChoiceButtonItem.e;
        boolean z3 = iconizedSingleChoiceButtonItem.f63486g;
        iconizedSingleChoiceButtonItem.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        return new IconizedSingleChoiceButtonItem(id10, num, str, text, backendIconType, z, z3);
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63483a() {
        return this.f63483a;
    }

    @Override // xl2.l
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getF63484b() {
        return this.f63484b;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF63486g() {
        return this.f63486g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IconizedSingleChoiceButtonItem)) {
            return false;
        }
        IconizedSingleChoiceButtonItem iconizedSingleChoiceButtonItem = (IconizedSingleChoiceButtonItem) obj2;
        return Intrinsics.f(this.f63483a, iconizedSingleChoiceButtonItem.f63483a) && Intrinsics.f(this.f63484b, iconizedSingleChoiceButtonItem.f63484b) && Intrinsics.f(this.f63485c, iconizedSingleChoiceButtonItem.f63485c) && Intrinsics.f(this.d, iconizedSingleChoiceButtonItem.d) && Intrinsics.f(this.e, iconizedSingleChoiceButtonItem.e) && this.f == iconizedSingleChoiceButtonItem.f && this.f63486g == iconizedSingleChoiceButtonItem.f63486g;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63483a;
    }

    public final int hashCode() {
        int iHashCode = this.f63483a.hashCode() * 31;
        Integer num = this.f63484b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f63485c;
        int iC = p.a.c((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        BackendIconType backendIconType = this.e;
        return Boolean.hashCode(this.f63486g) + j6.a.c((iC + (backendIconType != null ? backendIconType.hashCode() : 0)) * 31, 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63483a);
        Integer num = this.f63484b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeString(this.f63485c);
        dest.writeString(this.d);
        dest.writeParcelable(this.e, i);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f63486g ? 1 : 0);
    }
}
