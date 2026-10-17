package com.revolut.feature.statements.impl.ui.consolidated.customisation.all_categories;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/statements/impl/ui/consolidated/customisation/all_categories/AllCategoriesScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AllCategoriesScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AllCategoriesScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f88303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f88304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f88305c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Clause clause = (Clause) j6.a.f(parcel, "parcel", AllCategoriesScreenContract$InputData.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(AllCategoriesScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            int i2 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
            while (iA != i2) {
                iA = o.a(parcel, linkedHashSet, iA, 1);
            }
            return new AllCategoriesScreenContract$InputData(clause, arrayList, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AllCategoriesScreenContract$InputData[i];
        }
    }

    public AllCategoriesScreenContract$InputData(Clause title, List categories, Set selectedCategories) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
        this.f88303a = title;
        this.f88304b = categories;
        this.f88305c = selectedCategories;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AllCategoriesScreenContract$InputData)) {
            return false;
        }
        AllCategoriesScreenContract$InputData allCategoriesScreenContract$InputData = (AllCategoriesScreenContract$InputData) obj2;
        return Intrinsics.f(this.f88303a, allCategoriesScreenContract$InputData.f88303a) && Intrinsics.f(this.f88304b, allCategoriesScreenContract$InputData.f88304b) && Intrinsics.f(this.f88305c, allCategoriesScreenContract$InputData.f88305c);
    }

    public final int hashCode() {
        return this.f88305c.hashCode() + p.a.d(this.f88303a.hashCode() * 31, 31, this.f88304b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f88303a, i);
        Iterator itV = p.a.v(this.f88304b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Iterator itV2 = n.v(this.f88305c, dest);
        while (itV2.hasNext()) {
            dest.writeString((String) itV2.next());
        }
    }
}
