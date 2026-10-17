package com.revolut.feature.apm.core.models.alias;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zz1.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/alias/AliasAttributes;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AliasAttributes implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AliasAttributes> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f61882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f61883c;
    public final String d;
    public final b e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AliasAttributes(string, boolValueOf, (LocalDate) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0 ? b.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AliasAttributes[i];
        }
    }

    public AliasAttributes() {
        this((String) null, (Boolean) null, (LocalDate) null, (String) null, 31);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AliasAttributes)) {
            return false;
        }
        AliasAttributes aliasAttributes = (AliasAttributes) obj2;
        return Intrinsics.f(this.f61881a, aliasAttributes.f61881a) && Intrinsics.f(this.f61882b, aliasAttributes.f61882b) && Intrinsics.f(this.f61883c, aliasAttributes.f61883c) && Intrinsics.f(this.d, aliasAttributes.d) && this.e == aliasAttributes.e;
    }

    public final int hashCode() {
        String str = this.f61881a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f61882b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        LocalDate localDate = this.f61883c;
        int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        b bVar = this.e;
        return iHashCode4 + (bVar != null ? bVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61881a);
        Boolean bool = this.f61882b;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        dest.writeSerializable(this.f61883c);
        dest.writeString(this.d);
        b bVar = this.e;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
    }

    public AliasAttributes(String str, Boolean bool, LocalDate localDate, String str2, b bVar) {
        this.f61881a = str;
        this.f61882b = bool;
        this.f61883c = localDate;
        this.d = str2;
        this.e = bVar;
    }

    public /* synthetic */ AliasAttributes(String str, Boolean bool, LocalDate localDate, String str2, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : localDate, (i & 8) != 0 ? null : str2, (b) null);
    }
}
