package com.revolut.feature.tax_residency.impl.v2.ui.tin_input;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.tax_residency.api.BackNavigationType;
import com.revolut.feature.tax_residency.impl.v2.models.Checkmark;
import com.revolut.feature.tax_residency.impl.v2.models.TinInputFormat;
import com.revolut.feature.tax_residency.impl.v2.models.WhereToFindTinHint;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;
import ype.i;
import ype.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tax_residency/impl/v2/ui/tin_input/TinInputScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TinInputScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TinInputScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f90307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f90309c;
    public final String d;
    public final String e;
    public final TinInputFormat f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f90310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f90311h;
    public final k i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f90312j;
    public final WhereToFindTinHint k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AnalyticsProduct f90313l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final BackNavigationType f90314m;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVar = (b) parcel.readSerializable();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            TinInputFormat tinInputFormatCreateFromParcel = TinInputFormat.CREATOR.createFromParcel(parcel);
            String string5 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Checkmark.CREATOR, parcel, arrayList, iA, 1);
            }
            return new TinInputScreenContract$InputData(bVar, string, string2, string3, string4, tinInputFormatCreateFromParcel, string5, arrayList, k.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : i.valueOf(parcel.readString()), parcel.readInt() != 0 ? WhereToFindTinHint.CREATOR.createFromParcel(parcel) : null, (AnalyticsProduct) parcel.readParcelable(TinInputScreenContract$InputData.class.getClassLoader()), (BackNavigationType) parcel.readParcelable(TinInputScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TinInputScreenContract$InputData[i];
        }
    }

    public TinInputScreenContract$InputData(b countryCode, String tinName, String tinAcronym, String tinInputTitle, String tinInputSubtitle, TinInputFormat tinFormat, String initialTinValue, List checkmarks, k useCase, i iVar, WhereToFindTinHint whereToFindTinHint, AnalyticsProduct analyticsProduct, BackNavigationType backNavigationType) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(tinName, "tinName");
        Intrinsics.checkNotNullParameter(tinAcronym, "tinAcronym");
        Intrinsics.checkNotNullParameter(tinInputTitle, "tinInputTitle");
        Intrinsics.checkNotNullParameter(tinInputSubtitle, "tinInputSubtitle");
        Intrinsics.checkNotNullParameter(tinFormat, "tinFormat");
        Intrinsics.checkNotNullParameter(initialTinValue, "initialTinValue");
        Intrinsics.checkNotNullParameter(checkmarks, "checkmarks");
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
        this.f90307a = countryCode;
        this.f90308b = tinName;
        this.f90309c = tinAcronym;
        this.d = tinInputTitle;
        this.e = tinInputSubtitle;
        this.f = tinFormat;
        this.f90310g = initialTinValue;
        this.f90311h = checkmarks;
        this.i = useCase;
        this.f90312j = iVar;
        this.k = whereToFindTinHint;
        this.f90313l = analyticsProduct;
        this.f90314m = backNavigationType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TinInputScreenContract$InputData)) {
            return false;
        }
        TinInputScreenContract$InputData tinInputScreenContract$InputData = (TinInputScreenContract$InputData) obj2;
        return Intrinsics.f(this.f90307a, tinInputScreenContract$InputData.f90307a) && Intrinsics.f(this.f90308b, tinInputScreenContract$InputData.f90308b) && Intrinsics.f(this.f90309c, tinInputScreenContract$InputData.f90309c) && Intrinsics.f(this.d, tinInputScreenContract$InputData.d) && Intrinsics.f(this.e, tinInputScreenContract$InputData.e) && Intrinsics.f(this.f, tinInputScreenContract$InputData.f) && Intrinsics.f(this.f90310g, tinInputScreenContract$InputData.f90310g) && Intrinsics.f(this.f90311h, tinInputScreenContract$InputData.f90311h) && this.i == tinInputScreenContract$InputData.i && this.f90312j == tinInputScreenContract$InputData.f90312j && Intrinsics.f(this.k, tinInputScreenContract$InputData.k) && Intrinsics.f(this.f90313l, tinInputScreenContract$InputData.f90313l) && this.f90314m == tinInputScreenContract$InputData.f90314m;
    }

    public final int hashCode() {
        int iHashCode = (this.i.hashCode() + p.a.d(p.a.c((this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f90307a.f297794a.hashCode() * 31, 31, this.f90308b), 31, this.f90309c), 31, this.d), 31, this.e)) * 31, 31, this.f90310g), 31, this.f90311h)) * 31;
        i iVar = this.f90312j;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        WhereToFindTinHint whereToFindTinHint = this.k;
        return this.f90314m.hashCode() + l.a((iHashCode2 + (whereToFindTinHint != null ? whereToFindTinHint.hashCode() : 0)) * 31, 31, this.f90313l);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f90307a);
        dest.writeString(this.f90308b);
        dest.writeString(this.f90309c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        this.f.writeToParcel(dest, i);
        dest.writeString(this.f90310g);
        Iterator itV = p.a.v(this.f90311h, dest);
        while (itV.hasNext()) {
            ((Checkmark) itV.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.i.name());
        i iVar = this.f90312j;
        if (iVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(iVar.name());
        }
        WhereToFindTinHint whereToFindTinHint = this.k;
        if (whereToFindTinHint == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            whereToFindTinHint.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f90313l, i);
        dest.writeParcelable(this.f90314m, i);
    }
}
