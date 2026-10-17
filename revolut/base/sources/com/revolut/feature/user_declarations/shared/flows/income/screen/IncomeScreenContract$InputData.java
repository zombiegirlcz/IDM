package com.revolut.feature.user_declarations.shared.flows.income.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sil.c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/user_declarations/shared/flows/income/screen/IncomeScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IncomeScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<IncomeScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f94625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f94626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f94627c;
    public final Clause d;
    public final Image e;
    public final xi0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f94628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f94629h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Clause clause = (Clause) j6.a.f(parcel, "parcel", IncomeScreenContract$InputData.class);
            Clause clause2 = (Clause) parcel.readParcelable(IncomeScreenContract$InputData.class.getClassLoader());
            Clause clause3 = (Clause) parcel.readParcelable(IncomeScreenContract$InputData.class.getClassLoader());
            Clause clause4 = (Clause) parcel.readParcelable(IncomeScreenContract$InputData.class.getClassLoader());
            Image image = (Image) parcel.readParcelable(IncomeScreenContract$InputData.class.getClassLoader());
            xi0.b bVar = (xi0.b) parcel.readSerializable();
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(c.valueOf(parcel.readString()));
            }
            return new IncomeScreenContract$InputData(clause, clause2, clause3, clause4, image, bVar, z, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IncomeScreenContract$InputData[i];
        }
    }

    public IncomeScreenContract$InputData(Clause title, Clause clause, Clause clause2, Clause buttonClause, Image image, xi0.b bVar, boolean z, List frequencies) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonClause, "buttonClause");
        Intrinsics.checkNotNullParameter(frequencies, "frequencies");
        this.f94625a = title;
        this.f94626b = clause;
        this.f94627c = clause2;
        this.d = buttonClause;
        this.e = image;
        this.f = bVar;
        this.f94628g = z;
        this.f94629h = frequencies;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IncomeScreenContract$InputData)) {
            return false;
        }
        IncomeScreenContract$InputData incomeScreenContract$InputData = (IncomeScreenContract$InputData) obj2;
        return Intrinsics.f(this.f94625a, incomeScreenContract$InputData.f94625a) && Intrinsics.f(this.f94626b, incomeScreenContract$InputData.f94626b) && Intrinsics.f(this.f94627c, incomeScreenContract$InputData.f94627c) && Intrinsics.f(this.d, incomeScreenContract$InputData.d) && Intrinsics.f(this.e, incomeScreenContract$InputData.e) && Intrinsics.f(this.f, incomeScreenContract$InputData.f) && this.f94628g == incomeScreenContract$InputData.f94628g && Intrinsics.f(this.f94629h, incomeScreenContract$InputData.f94629h);
    }

    public final int hashCode() {
        int iHashCode = this.f94625a.hashCode() * 31;
        Clause clause = this.f94626b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f94627c;
        int iA = p.a.a((iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31, this.d);
        Image image = this.e;
        int iHashCode3 = (iA + (image == null ? 0 : image.hashCode())) * 31;
        xi0.b bVar = this.f;
        return this.f94629h.hashCode() + j6.a.c((iHashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31, 31, this.f94628g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94625a, i);
        dest.writeParcelable(this.f94626b, i);
        dest.writeParcelable(this.f94627c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeSerializable(this.f);
        dest.writeInt(this.f94628g ? 1 : 0);
        Iterator itV = p.a.v(this.f94629h, dest);
        while (itV.hasNext()) {
            dest.writeString(((c) itV.next()).name());
        }
    }
}
