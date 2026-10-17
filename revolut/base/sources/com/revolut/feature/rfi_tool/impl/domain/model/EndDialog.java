package com.revolut.feature.rfi_tool.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rfi_tool/impl/domain/model/EndDialog;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rfi_tool_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EndDialog implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EndDialog> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EndDialogType f85004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85006c;
    public final EndDialogAction d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EndDialog(EndDialogType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EndDialogAction.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EndDialog[i];
        }
    }

    public EndDialog(EndDialogType type, String title, String str, EndDialogAction endDialogAction) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f85004a = type;
        this.f85005b = title;
        this.f85006c = str;
        this.d = endDialogAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EndDialog)) {
            return false;
        }
        EndDialog endDialog = (EndDialog) obj2;
        return this.f85004a == endDialog.f85004a && Intrinsics.f(this.f85005b, endDialog.f85005b) && Intrinsics.f(this.f85006c, endDialog.f85006c) && Intrinsics.f(this.d, endDialog.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f85004a.hashCode() * 31, 31, this.f85005b);
        String str = this.f85006c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        EndDialogAction endDialogAction = this.d;
        return iHashCode + (endDialogAction != null ? endDialogAction.f85007a.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f85004a.writeToParcel(dest, i);
        dest.writeString(this.f85005b);
        dest.writeString(this.f85006c);
        EndDialogAction endDialogAction = this.d;
        if (endDialogAction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            endDialogAction.writeToParcel(dest, i);
        }
    }
}
