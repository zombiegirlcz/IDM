package com.revolut.core.ui_kit.dialogs;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.a2;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/core/ui_kit/dialogs/ToolboxDialogDisplayer$Configuration$Cell", "Lcom/revolut/core/ui_kit/dialogs/ToolboxDialogDisplayer$Configuration$Item;", "", "toString", "()Ljava/lang/String;", "rp0/a2", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ToolboxDialogDisplayer$Configuration$Cell extends ToolboxDialogDisplayer$Configuration$Item {

    @NotNull
    public static final Parcelable.Creator<ToolboxDialogDisplayer$Configuration$Cell> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f55722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f55723c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a2 f55724g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Image image = (Image) parcel.readParcelable(ToolboxDialogDisplayer$Configuration$Cell.class.getClassLoader());
            Clause clause = (Clause) parcel.readParcelable(ToolboxDialogDisplayer$Configuration$Cell.class.getClassLoader());
            boolean z4 = false;
            boolean z6 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z6 = z;
            }
            if (parcel.readInt() == 0) {
                z3 = z;
            }
            return new ToolboxDialogDisplayer$Configuration$Cell(string, image, clause, z4, z6, z3, a2.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ToolboxDialogDisplayer$Configuration$Cell[i];
        }
    }

    public ToolboxDialogDisplayer$Configuration$Cell(String listId, Image image, Clause clause, boolean z, boolean z3, boolean z4, a2 style) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f55721a = listId;
        this.f55722b = image;
        this.f55723c = clause;
        this.d = z;
        this.e = z3;
        this.f = z4;
        this.f55724g = style;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF55721a() {
        return this.f55721a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ToolboxDialogDisplayer$Configuration$Cell)) {
            return false;
        }
        ToolboxDialogDisplayer$Configuration$Cell toolboxDialogDisplayer$Configuration$Cell = (ToolboxDialogDisplayer$Configuration$Cell) obj2;
        return Intrinsics.f(this.f55721a, toolboxDialogDisplayer$Configuration$Cell.f55721a) && Intrinsics.f(this.f55722b, toolboxDialogDisplayer$Configuration$Cell.f55722b) && Intrinsics.f(this.f55723c, toolboxDialogDisplayer$Configuration$Cell.f55723c) && this.d == toolboxDialogDisplayer$Configuration$Cell.d && this.e == toolboxDialogDisplayer$Configuration$Cell.e && this.f == toolboxDialogDisplayer$Configuration$Cell.f && this.f55724g == toolboxDialogDisplayer$Configuration$Cell.f55724g;
    }

    public final int hashCode() {
        int iHashCode = this.f55721a.hashCode() * 31;
        Image image = this.f55722b;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        Clause clause = this.f55723c;
        return this.f55724g.hashCode() + j6.a.c(j6.a.c(j6.a.c((iHashCode2 + (clause != null ? clause.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f55721a);
        dest.writeParcelable(this.f55722b, i);
        dest.writeParcelable(this.f55723c, i);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeString(this.f55724g.name());
    }
}
