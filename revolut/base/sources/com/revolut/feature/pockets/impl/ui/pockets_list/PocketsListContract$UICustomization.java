package com.revolut.feature.pockets.impl.ui.pockets_list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pockets/impl/ui/pockets_list/PocketsListContract$UICustomization", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PocketsListContract$UICustomization implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PocketsListContract$UICustomization> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f80913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f80914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SlotContext f80915c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PocketsListContract$UICustomization((Clause) parcel.readParcelable(PocketsListContract$UICustomization.class.getClassLoader()), parcel.readInt() != 0, (SlotContext) parcel.readParcelable(PocketsListContract$UICustomization.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PocketsListContract$UICustomization[i];
        }
    }

    public PocketsListContract$UICustomization(Clause screenTitle, boolean z, SlotContext slotContext) {
        Intrinsics.checkNotNullParameter(screenTitle, "screenTitle");
        this.f80913a = screenTitle;
        this.f80914b = z;
        this.f80915c = slotContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PocketsListContract$UICustomization)) {
            return false;
        }
        PocketsListContract$UICustomization pocketsListContract$UICustomization = (PocketsListContract$UICustomization) obj2;
        return Intrinsics.f(this.f80913a, pocketsListContract$UICustomization.f80913a) && this.f80914b == pocketsListContract$UICustomization.f80914b && Intrinsics.f(this.f80915c, pocketsListContract$UICustomization.f80915c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f80913a.hashCode() * 31, 31, this.f80914b);
        SlotContext slotContext = this.f80915c;
        return iC + (slotContext == null ? 0 : slotContext.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f80913a, i);
        dest.writeInt(this.f80914b ? 1 : 0);
        dest.writeParcelable(this.f80915c, i);
    }
}
