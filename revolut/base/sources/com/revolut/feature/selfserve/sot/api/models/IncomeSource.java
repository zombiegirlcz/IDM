package com.revolut.feature.selfserve.sot.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/selfserve/sot/api/models/IncomeSource;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "feature_selfserve_sot_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IncomeSource implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<IncomeSource> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f85875c;
    public final String d;
    public final List e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            int i;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                i = 1;
                z = true;
            } else {
                z = false;
                i = 1;
            }
            String string3 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                int i5 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i5);
                int iA = 0;
                while (iA != i5) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(DocumentType.CREATOR, parcel, arrayList2, iA, i);
                }
                arrayList.add(arrayList2);
            }
            return new IncomeSource(string, string2, string3, arrayList, z);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IncomeSource[i];
        }
    }

    public IncomeSource(String type, String title, String description, List documentTypes, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(documentTypes, "documentTypes");
        this.f85873a = type;
        this.f85874b = title;
        this.f85875c = z;
        this.d = description;
        this.e = documentTypes;
    }

    public static IncomeSource a(IncomeSource incomeSource, List documentTypes) {
        String type = incomeSource.f85873a;
        String title = incomeSource.f85874b;
        boolean z = incomeSource.f85875c;
        String description = incomeSource.d;
        incomeSource.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(documentTypes, "documentTypes");
        return new IncomeSource(type, title, description, documentTypes, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IncomeSource)) {
            return false;
        }
        IncomeSource incomeSource = (IncomeSource) obj2;
        return Intrinsics.f(this.f85873a, incomeSource.f85873a) && Intrinsics.f(this.f85874b, incomeSource.f85874b) && this.f85875c == incomeSource.f85875c && Intrinsics.f(this.d, incomeSource.d) && Intrinsics.f(this.e, incomeSource.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(j6.a.c(p.a.c(this.f85873a.hashCode() * 31, 31, this.f85874b), 31, this.f85875c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85873a);
        dest.writeString(this.f85874b);
        dest.writeInt(this.f85875c ? 1 : 0);
        dest.writeString(this.d);
        Iterator itV = p.a.v(this.e, dest);
        while (itV.hasNext()) {
            Iterator itV2 = p.a.v((List) itV.next(), dest);
            while (itV2.hasNext()) {
                ((DocumentType) itV2.next()).writeToParcel(dest, i);
            }
        }
    }
}
