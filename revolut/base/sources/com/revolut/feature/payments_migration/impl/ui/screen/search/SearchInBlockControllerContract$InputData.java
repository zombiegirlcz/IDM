package com.revolut.feature.payments_migration.impl.ui.screen.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments_migration.impl.models.providers.BlockId;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments_migration/impl/ui/screen/search/SearchInBlockControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SearchInBlockControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SearchInBlockControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f80286c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String str = BlockId.CREATOR.createFromParcel(parcel).f80208a;
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(SearchInBlockControllerContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new SearchInBlockControllerContract$InputData(arrayList, parcel.readInt() != 0, str, string);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SearchInBlockControllerContract$InputData[i];
        }
    }

    public SearchInBlockControllerContract$InputData(List blocks, boolean z, String blockId, String title) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.f80284a = blockId;
        this.f80285b = title;
        this.f80286c = blocks;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SearchInBlockControllerContract$InputData)) {
            return false;
        }
        SearchInBlockControllerContract$InputData searchInBlockControllerContract$InputData = (SearchInBlockControllerContract$InputData) obj2;
        return Intrinsics.f(this.f80284a, searchInBlockControllerContract$InputData.f80284a) && Intrinsics.f(this.f80285b, searchInBlockControllerContract$InputData.f80285b) && Intrinsics.f(this.f80286c, searchInBlockControllerContract$InputData.f80286c) && this.d == searchInBlockControllerContract$InputData.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.d(p.a.c(this.f80284a.hashCode() * 31, 31, this.f80285b), 31, this.f80286c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        BlockId.a(this.f80284a, dest);
        dest.writeString(this.f80285b);
        Iterator itV = p.a.v(this.f80286c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeInt(this.d ? 1 : 0);
    }
}
