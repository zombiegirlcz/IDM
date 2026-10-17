package com.revolut.feature.salary_switch.impl.models.v2;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kqc.e;
import kqc.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/models/v2/Institution;", "Lkqc/f;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Institution implements f, Parcelable {

    @NotNull
    public static final Parcelable.Creator<Institution> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f85245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85247c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Institution(e.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Institution[i];
        }
    }

    public Institution(e type, String value, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f85245a = type;
        this.f85246b = value;
        this.f85247c = str;
    }

    @Override // kqc.f
    /* JADX INFO: renamed from: F, reason: from getter */
    public final String getD() {
        return this.f85247c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Institution)) {
            return false;
        }
        Institution institution = (Institution) obj2;
        return this.f85245a == institution.f85245a && Intrinsics.f(this.f85246b, institution.f85246b) && Intrinsics.f(this.f85247c, institution.f85247c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f85245a.hashCode() * 31, 31, this.f85246b);
        String str = this.f85247c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85245a.name());
        dest.writeString(this.f85246b);
        dest.writeString(this.f85247c);
    }
}
