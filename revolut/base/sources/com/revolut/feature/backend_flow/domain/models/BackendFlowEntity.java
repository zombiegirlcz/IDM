package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/BackendFlowEntity;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BackendFlowEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BackendFlowEntity> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63274c;
    public final String d;
    public final BackendFlowIcon e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f63275g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BackendFlowEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (BackendFlowIcon) parcel.readParcelable(BackendFlowEntity.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BackendFlowEntity[i];
        }
    }

    public BackendFlowEntity(String id10, String title, String str, String str2, BackendFlowIcon backendFlowIcon, String str3, String str4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f63272a = id10;
        this.f63273b = title;
        this.f63274c = str;
        this.d = str2;
        this.e = backendFlowIcon;
        this.f = str3;
        this.f63275g = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BackendFlowEntity)) {
            return false;
        }
        BackendFlowEntity backendFlowEntity = (BackendFlowEntity) obj2;
        return Intrinsics.f(this.f63272a, backendFlowEntity.f63272a) && Intrinsics.f(this.f63273b, backendFlowEntity.f63273b) && Intrinsics.f(this.f63274c, backendFlowEntity.f63274c) && Intrinsics.f(this.d, backendFlowEntity.d) && Intrinsics.f(this.e, backendFlowEntity.e) && Intrinsics.f(this.f, backendFlowEntity.f) && Intrinsics.f(this.f63275g, backendFlowEntity.f63275g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f63272a.hashCode() * 31, 31, this.f63273b);
        String str = this.f63274c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BackendFlowIcon backendFlowIcon = this.e;
        int iHashCode3 = (iHashCode2 + (backendFlowIcon == null ? 0 : backendFlowIcon.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f63275g;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63272a);
        dest.writeString(this.f63273b);
        dest.writeString(this.f63274c);
        dest.writeString(this.d);
        dest.writeParcelable(this.e, i);
        dest.writeString(this.f);
        dest.writeString(this.f63275g);
    }
}
