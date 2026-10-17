package com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.simple_selector;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared_separate_favourites/alerts/ui/screen/create_alert/simple_selector/SimpleSelectorControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SimpleSelectorControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SimpleSelectorControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f86755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f86756b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Clause clause = (Clause) j6.a.f(parcel, "parcel", SimpleSelectorControllerContract$InputData.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(SimpleSelectorControllerContract$SimpleSelectorItem.CREATOR, parcel, arrayList, iA, 1);
            }
            return new SimpleSelectorControllerContract$InputData(clause, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SimpleSelectorControllerContract$InputData[i];
        }
    }

    public SimpleSelectorControllerContract$InputData(Clause title, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f86755a = title;
        this.f86756b = items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SimpleSelectorControllerContract$InputData)) {
            return false;
        }
        SimpleSelectorControllerContract$InputData simpleSelectorControllerContract$InputData = (SimpleSelectorControllerContract$InputData) obj2;
        return Intrinsics.f(this.f86755a, simpleSelectorControllerContract$InputData.f86755a) && this.f86756b.equals(simpleSelectorControllerContract$InputData.f86756b);
    }

    public final int hashCode() {
        return this.f86756b.hashCode() + (this.f86755a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f86755a, i);
        Iterator itY = j6.a.y(this.f86756b, dest);
        while (itY.hasNext()) {
            ((SimpleSelectorControllerContract$SimpleSelectorItem) itY.next()).writeToParcel(dest, i);
        }
    }
}
