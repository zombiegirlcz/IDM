package com.revolut.feature.retail.privacy.impl.ui.flow.screen.extensions.discoverability;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ocb.a0;
import ocb.y;
import ocb.z;
import org.jetbrains.annotations.NotNull;
import qv0.i;

/* JADX INFO: loaded from: classes6.dex */
public final class MakeMeDiscoverableDialogMapper {

    @NotNull
    public static final a Companion = new a();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/privacy/impl/ui/flow/screen/extensions/discoverability/MakeMeDiscoverableDialogMapper$SwitchState;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_privacy_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SwitchState implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SwitchState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f82785a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SwitchState(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SwitchState[i];
            }
        }

        public SwitchState(boolean z) {
            this.f82785a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SwitchState) && this.f82785a == ((SwitchState) obj2).f82785a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f82785a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f82785a ? 1 : 0);
        }
    }

    public static final class a {
        private a() {
        }
    }

    public static i a(a0 a0Var, Function1 function1) {
        if (a0Var instanceof y) {
            return null;
        }
        if (a0Var instanceof z) {
            return (i) function1.invoke(Boolean.valueOf(((z) a0Var).f224205a));
        }
        throw new NoWhenBranchMatchedException();
    }

    public static RowDelegate.Model b(String str, int i, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, boolean z) {
        boolean z3 = false;
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image24(new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), z3, z3, 6), textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, new vf(z, true), false, null, false, null, null, null, null, null, null, new SwitchState(z), null, 0, 0, 0, 0, 532673496);
    }
}
