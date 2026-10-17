package com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/backgroundpicker/impl/flow/theme_customisation_v2/ThemeCustomisationContract$RetainedState", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "", "toString", "()Ljava/lang/String;", "feature_background_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ThemeCustomisationContract$RetainedState implements States$PersistentDomain {

    @NotNull
    public static final Parcelable.Creator<ThemeCustomisationContract$RetainedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThemeCustomisationContract$Page f63771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThemedBackgroundKey f63772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimationRequest f63773c;
    public final Set d;
    public final ThemeCustomisationContract$ThemeInfo e;
    public final boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ThemeCustomisationContract$Page themeCustomisationContract$PageCreateFromParcel = parcel.readInt() == 0 ? null : ThemeCustomisationContract$Page.CREATOR.createFromParcel(parcel);
            ThemedBackgroundKey themedBackgroundKey = (ThemedBackgroundKey) parcel.readParcelable(ThemeCustomisationContract$RetainedState.class.getClassLoader());
            AnimationRequest animationRequest = (AnimationRequest) parcel.readParcelable(ThemeCustomisationContract$RetainedState.class.getClassLoader());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            while (iE != i) {
                iE = d.e(ThemeCustomisationContract$RetainedState.class, parcel, linkedHashSet, iE, 1);
            }
            return new ThemeCustomisationContract$RetainedState(themeCustomisationContract$PageCreateFromParcel, themedBackgroundKey, animationRequest, linkedHashSet, parcel.readInt() != 0 ? ThemeCustomisationContract$ThemeInfo.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ThemeCustomisationContract$RetainedState[i];
        }
    }

    public ThemeCustomisationContract$RetainedState(ThemeCustomisationContract$Page themeCustomisationContract$Page, ThemedBackgroundKey themedBackgroundKey, AnimationRequest iconSelectorPreselectionAnimationRequest, Set postRecreationActions, ThemeCustomisationContract$ThemeInfo themeCustomisationContract$ThemeInfo, boolean z) {
        Intrinsics.checkNotNullParameter(iconSelectorPreselectionAnimationRequest, "iconSelectorPreselectionAnimationRequest");
        Intrinsics.checkNotNullParameter(postRecreationActions, "postRecreationActions");
        this.f63771a = themeCustomisationContract$Page;
        this.f63772b = themedBackgroundKey;
        this.f63773c = iconSelectorPreselectionAnimationRequest;
        this.d = postRecreationActions;
        this.e = themeCustomisationContract$ThemeInfo;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ThemeCustomisationContract$RetainedState)) {
            return false;
        }
        ThemeCustomisationContract$RetainedState themeCustomisationContract$RetainedState = (ThemeCustomisationContract$RetainedState) obj2;
        return this.f63771a == themeCustomisationContract$RetainedState.f63771a && Intrinsics.f(this.f63772b, themeCustomisationContract$RetainedState.f63772b) && Intrinsics.f(this.f63773c, themeCustomisationContract$RetainedState.f63773c) && Intrinsics.f(this.d, themeCustomisationContract$RetainedState.d) && Intrinsics.f(this.e, themeCustomisationContract$RetainedState.e) && this.f == themeCustomisationContract$RetainedState.f;
    }

    public final int hashCode() {
        ThemeCustomisationContract$Page themeCustomisationContract$Page = this.f63771a;
        int iHashCode = (themeCustomisationContract$Page == null ? 0 : themeCustomisationContract$Page.hashCode()) * 31;
        ThemedBackgroundKey themedBackgroundKey = this.f63772b;
        int iF = p.a.f((this.f63773c.hashCode() + ((iHashCode + (themedBackgroundKey == null ? 0 : themedBackgroundKey.hashCode())) * 31)) * 31, 31, this.d);
        ThemeCustomisationContract$ThemeInfo themeCustomisationContract$ThemeInfo = this.e;
        return Boolean.hashCode(this.f) + ((iF + (themeCustomisationContract$ThemeInfo != null ? themeCustomisationContract$ThemeInfo.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        ThemeCustomisationContract$Page themeCustomisationContract$Page = this.f63771a;
        if (themeCustomisationContract$Page == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            themeCustomisationContract$Page.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f63772b, i);
        dest.writeParcelable(this.f63773c, i);
        Iterator itV = n.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        ThemeCustomisationContract$ThemeInfo themeCustomisationContract$ThemeInfo = this.e;
        if (themeCustomisationContract$ThemeInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            themeCustomisationContract$ThemeInfo.writeToParcel(dest, i);
        }
        dest.writeInt(this.f ? 1 : 0);
    }
}
