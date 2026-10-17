package com.revolut.core.ui_kit.dialogs;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/core/ui_kit/dialogs/ToolboxDialogDisplayer$Configuration$Divider", "Lcom/revolut/core/ui_kit/dialogs/ToolboxDialogDisplayer$Configuration$Item;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ToolboxDialogDisplayer$Configuration$Divider extends ToolboxDialogDisplayer$Configuration$Item {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ToolboxDialogDisplayer$Configuration$Divider f55725a = new ToolboxDialogDisplayer$Configuration$Divider();

    @NotNull
    public static final Parcelable.Creator<ToolboxDialogDisplayer$Configuration$Divider> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return ToolboxDialogDisplayer$Configuration$Divider.f55725a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ToolboxDialogDisplayer$Configuration$Divider[i];
        }
    }

    private ToolboxDialogDisplayer$Configuration$Divider() {
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53082a() {
        return "DIVIDER_ID";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
