package com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.backgroundpicker.api.Preselection;
import com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/backgroundpicker/impl/flow/theme_customisation_v2/ThemeCustomisationContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_background_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ThemeCustomisationContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ThemeCustomisationContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThemedBackgroundKey f63758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Preselection f63759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThemeCustomisationContract$Page f63760c;
    public final ThemeCustomisationContract$SandboxAppearance d;
    public final ThemeCustomisationContract$SavedState e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f63761g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ThemedBackgroundKey themedBackgroundKey = (ThemedBackgroundKey) j6.a.f(parcel, "parcel", ThemeCustomisationContract$InputData.class);
            Preselection preselection = (Preselection) parcel.readParcelable(ThemeCustomisationContract$InputData.class.getClassLoader());
            ThemeCustomisationContract$Page themeCustomisationContract$PageCreateFromParcel = parcel.readInt() == 0 ? null : ThemeCustomisationContract$Page.CREATOR.createFromParcel(parcel);
            ThemeCustomisationContract$SandboxAppearance themeCustomisationContract$SandboxAppearanceCreateFromParcel = parcel.readInt() == 0 ? null : ThemeCustomisationContract$SandboxAppearance.CREATOR.createFromParcel(parcel);
            ThemeCustomisationContract$SavedState themeCustomisationContract$SavedStateCreateFromParcel = parcel.readInt() != 0 ? ThemeCustomisationContract$SavedState.CREATOR.createFromParcel(parcel) : null;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(em2.b.valueOf(parcel.readString()));
            }
            return new ThemeCustomisationContract$InputData(themedBackgroundKey, preselection, themeCustomisationContract$PageCreateFromParcel, themeCustomisationContract$SandboxAppearanceCreateFromParcel, themeCustomisationContract$SavedStateCreateFromParcel, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ThemeCustomisationContract$InputData[i];
        }
    }

    public ThemeCustomisationContract$InputData(ThemedBackgroundKey themedBackgroundKey, Preselection preselection, ThemeCustomisationContract$Page themeCustomisationContract$Page, ThemeCustomisationContract$SandboxAppearance themeCustomisationContract$SandboxAppearance, ThemeCustomisationContract$SavedState themeCustomisationContract$SavedState, List scopes, boolean z) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        this.f63758a = themedBackgroundKey;
        this.f63759b = preselection;
        this.f63760c = themeCustomisationContract$Page;
        this.d = themeCustomisationContract$SandboxAppearance;
        this.e = themeCustomisationContract$SavedState;
        this.f = scopes;
        this.f63761g = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ThemeCustomisationContract$InputData)) {
            return false;
        }
        ThemeCustomisationContract$InputData themeCustomisationContract$InputData = (ThemeCustomisationContract$InputData) obj2;
        return Intrinsics.f(this.f63758a, themeCustomisationContract$InputData.f63758a) && Intrinsics.f(this.f63759b, themeCustomisationContract$InputData.f63759b) && this.f63760c == themeCustomisationContract$InputData.f63760c && Intrinsics.f(this.d, themeCustomisationContract$InputData.d) && Intrinsics.f(this.e, themeCustomisationContract$InputData.e) && Intrinsics.f(this.f, themeCustomisationContract$InputData.f) && this.f63761g == themeCustomisationContract$InputData.f63761g;
    }

    public final int hashCode() {
        ThemedBackgroundKey themedBackgroundKey = this.f63758a;
        int iHashCode = (themedBackgroundKey == null ? 0 : themedBackgroundKey.hashCode()) * 31;
        Preselection preselection = this.f63759b;
        int iHashCode2 = (iHashCode + (preselection == null ? 0 : preselection.hashCode())) * 31;
        ThemeCustomisationContract$Page themeCustomisationContract$Page = this.f63760c;
        int iHashCode3 = (iHashCode2 + (themeCustomisationContract$Page == null ? 0 : themeCustomisationContract$Page.hashCode())) * 31;
        ThemeCustomisationContract$SandboxAppearance themeCustomisationContract$SandboxAppearance = this.d;
        int iHashCode4 = (iHashCode3 + (themeCustomisationContract$SandboxAppearance == null ? 0 : themeCustomisationContract$SandboxAppearance.hashCode())) * 31;
        ThemeCustomisationContract$SavedState themeCustomisationContract$SavedState = this.e;
        return Boolean.hashCode(this.f63761g) + p.a.d((iHashCode4 + (themeCustomisationContract$SavedState != null ? themeCustomisationContract$SavedState.hashCode() : 0)) * 31, 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f63758a, i);
        dest.writeParcelable(this.f63759b, i);
        ThemeCustomisationContract$Page themeCustomisationContract$Page = this.f63760c;
        if (themeCustomisationContract$Page == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            themeCustomisationContract$Page.writeToParcel(dest, i);
        }
        ThemeCustomisationContract$SandboxAppearance themeCustomisationContract$SandboxAppearance = this.d;
        if (themeCustomisationContract$SandboxAppearance == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            themeCustomisationContract$SandboxAppearance.writeToParcel(dest, i);
        }
        ThemeCustomisationContract$SavedState themeCustomisationContract$SavedState = this.e;
        if (themeCustomisationContract$SavedState == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            themeCustomisationContract$SavedState.writeToParcel(dest, i);
        }
        Iterator itV = p.a.v(this.f, dest);
        while (itV.hasNext()) {
            dest.writeString(((em2.b) itV.next()).name());
        }
        dest.writeInt(this.f63761g ? 1 : 0);
    }
}
