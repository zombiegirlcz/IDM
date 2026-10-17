package com.revolut.feature.backgroundpicker.impl.ui.flow.theme_customisation;

import android.os.Parcel;
import android.os.Parcelable;
import cm2.i;
import com.revolut.feature.backgroundpicker.api.Preselection;
import com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey;
import com.revolut.kompot.common.IOData$Input;
import em2.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/backgroundpicker/impl/ui/flow/theme_customisation/ThemeCustomisationFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_background_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ThemeCustomisationFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ThemeCustomisationFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThemedBackgroundKey f63807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f63808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f63809c;
    public final Preselection d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ThemedBackgroundKey themedBackgroundKey = (ThemedBackgroundKey) j6.a.f(parcel, "parcel", ThemeCustomisationFlowContract$InputData.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(b.valueOf(parcel.readString()));
            }
            return new ThemeCustomisationFlowContract$InputData(themedBackgroundKey, arrayList, parcel.readInt() == 0 ? null : i.valueOf(parcel.readString()), (Preselection) parcel.readParcelable(ThemeCustomisationFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ThemeCustomisationFlowContract$InputData[i];
        }
    }

    public ThemeCustomisationFlowContract$InputData(ThemedBackgroundKey themedBackgroundKey, List scopes, i iVar, Preselection preselection, boolean z) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        this.f63807a = themedBackgroundKey;
        this.f63808b = scopes;
        this.f63809c = iVar;
        this.d = preselection;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ThemeCustomisationFlowContract$InputData)) {
            return false;
        }
        ThemeCustomisationFlowContract$InputData themeCustomisationFlowContract$InputData = (ThemeCustomisationFlowContract$InputData) obj2;
        return Intrinsics.f(this.f63807a, themeCustomisationFlowContract$InputData.f63807a) && Intrinsics.f(this.f63808b, themeCustomisationFlowContract$InputData.f63808b) && this.f63809c == themeCustomisationFlowContract$InputData.f63809c && Intrinsics.f(this.d, themeCustomisationFlowContract$InputData.d) && this.e == themeCustomisationFlowContract$InputData.e;
    }

    public final int hashCode() {
        ThemedBackgroundKey themedBackgroundKey = this.f63807a;
        int iD = p.a.d((themedBackgroundKey == null ? 0 : themedBackgroundKey.hashCode()) * 31, 31, this.f63808b);
        i iVar = this.f63809c;
        int iHashCode = (iD + (iVar == null ? 0 : iVar.hashCode())) * 31;
        Preselection preselection = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (preselection != null ? preselection.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f63807a, i);
        Iterator itV = p.a.v(this.f63808b, dest);
        while (itV.hasNext()) {
            dest.writeString(((b) itV.next()).name());
        }
        i iVar = this.f63809c;
        if (iVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(iVar.name());
        }
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
    }
}
