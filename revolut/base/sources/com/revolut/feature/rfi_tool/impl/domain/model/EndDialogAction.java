package com.revolut.feature.rfi_tool.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rfi_tool/impl/domain/model/EndDialogAction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rfi_tool_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EndDialogAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EndDialogAction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85007a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EndDialogAction(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EndDialogAction[i];
        }
    }

    public EndDialogAction(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f85007a = title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof EndDialogAction) && Intrinsics.f(this.f85007a, ((EndDialogAction) obj2).f85007a);
    }

    public final int hashCode() {
        return this.f85007a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85007a);
    }
}
