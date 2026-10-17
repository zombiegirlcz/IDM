package com.revolut.retail.core.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/core/navigation/FinishFragmentNavigateCommand;", "Lcom/revolut/retail/core/navigation/NaviCommand;", "", "toString", "()Ljava/lang/String;", "retail_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class FinishFragmentNavigateCommand extends NaviCommand {

    @NotNull
    public static final Parcelable.Creator<FinishFragmentNavigateCommand> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f98648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f98649b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FinishFragmentNavigateCommand(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FinishFragmentNavigateCommand[i];
        }
    }

    public FinishFragmentNavigateCommand() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FinishFragmentNavigateCommand)) {
            return false;
        }
        FinishFragmentNavigateCommand finishFragmentNavigateCommand = (FinishFragmentNavigateCommand) obj2;
        return this.f98648a == finishFragmentNavigateCommand.f98648a && this.f98649b == finishFragmentNavigateCommand.f98649b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f98649b) + (Boolean.hashCode(this.f98648a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f98648a ? 1 : 0);
        dest.writeInt(this.f98649b ? 1 : 0);
    }

    public FinishFragmentNavigateCommand(boolean z, boolean z3) {
        this.f98648a = z;
        this.f98649b = z3;
    }

    public /* synthetic */ FinishFragmentNavigateCommand(int i) {
        this(true, false);
    }
}
