package com.revolut.feature.shops.impl.ui.fullscreen_opt_in;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shops/impl/ui/fullscreen_opt_in/ShopsPromptScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShopsPromptScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ShopsPromptScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f87177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87178b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(ShopsPromptScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new ShopsPromptScreenContract$InputData(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShopsPromptScreenContract$InputData[i];
        }
    }

    public ShopsPromptScreenContract$InputData(List promptTypes, String source) {
        Intrinsics.checkNotNullParameter(promptTypes, "promptTypes");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f87177a = promptTypes;
        this.f87178b = source;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ShopsPromptScreenContract$InputData)) {
            return false;
        }
        ShopsPromptScreenContract$InputData shopsPromptScreenContract$InputData = (ShopsPromptScreenContract$InputData) obj2;
        return Intrinsics.f(this.f87177a, shopsPromptScreenContract$InputData.f87177a) && Intrinsics.f(this.f87178b, shopsPromptScreenContract$InputData.f87178b);
    }

    public final int hashCode() {
        return this.f87178b.hashCode() + (this.f87177a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f87177a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeString(this.f87178b);
    }
}
