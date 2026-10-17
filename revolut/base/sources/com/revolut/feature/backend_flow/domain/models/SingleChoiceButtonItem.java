package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl2.l;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SingleChoiceButtonItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "Lxl2/l;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final /* data */ class SingleChoiceButtonItem implements InputItem, l {

    @NotNull
    public static final Parcelable.Creator<SingleChoiceButtonItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f63634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63635c;
    public final boolean d;
    public final boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f63636g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new SingleChoiceButtonItem(string, numValueOf, string2, z3, parcel.readInt() == 0 ? z : true, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SingleChoiceButtonItem[i];
        }
    }

    public SingleChoiceButtonItem(String id10, Integer num, String text, boolean z, boolean z3, String str, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f63633a = id10;
        this.f63634b = num;
        this.f63635c = text;
        this.d = z;
        this.e = z3;
        this.f = str;
        this.f63636g = str2;
    }

    public static SingleChoiceButtonItem J(SingleChoiceButtonItem singleChoiceButtonItem, boolean z) {
        String id10 = singleChoiceButtonItem.f63633a;
        Integer num = singleChoiceButtonItem.f63634b;
        String text = singleChoiceButtonItem.f63635c;
        boolean z3 = singleChoiceButtonItem.e;
        String str = singleChoiceButtonItem.f;
        String str2 = singleChoiceButtonItem.f63636g;
        singleChoiceButtonItem.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        return new SingleChoiceButtonItem(id10, num, text, z, z3, str, str2);
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63633a() {
        return this.f63633a;
    }

    @Override // xl2.l
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getF63634b() {
        return this.f63634b;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getE() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SingleChoiceButtonItem)) {
            return false;
        }
        SingleChoiceButtonItem singleChoiceButtonItem = (SingleChoiceButtonItem) obj2;
        return Intrinsics.f(this.f63633a, singleChoiceButtonItem.f63633a) && Intrinsics.f(this.f63634b, singleChoiceButtonItem.f63634b) && Intrinsics.f(this.f63635c, singleChoiceButtonItem.f63635c) && this.d == singleChoiceButtonItem.d && this.e == singleChoiceButtonItem.e && Intrinsics.f(this.f, singleChoiceButtonItem.f) && Intrinsics.f(this.f63636g, singleChoiceButtonItem.f63636g);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63633a;
    }

    public final int hashCode() {
        int iHashCode = this.f63633a.hashCode() * 31;
        Integer num = this.f63634b;
        int iC = j6.a.c(j6.a.c(p.a.c((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f63635c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f63636g;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63633a);
        Integer num = this.f63634b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeString(this.f63635c);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeString(this.f);
        dest.writeString(this.f63636g);
    }
}
