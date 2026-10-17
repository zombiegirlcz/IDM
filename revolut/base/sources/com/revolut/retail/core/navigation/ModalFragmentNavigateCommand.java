package com.revolut.retail.core.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sri.g;
import yhm.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/core/navigation/ModalFragmentNavigateCommand;", "Lcom/revolut/retail/core/navigation/BaseFragmentNavigateCommand;", "", "toString", "()Ljava/lang/String;", "sri/g", "retail_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class ModalFragmentNavigateCommand extends BaseFragmentNavigateCommand {

    @NotNull
    public static final Parcelable.Creator<ModalFragmentNavigateCommand> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentDestination f98664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f98665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Parcelable f98666c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ModalFragmentNavigateCommand(FragmentDestination.CREATOR.createFromParcel(parcel), g.valueOf(parcel.readString()), parcel.readParcelable(ModalFragmentNavigateCommand.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ModalFragmentNavigateCommand[i];
        }
    }

    public ModalFragmentNavigateCommand(FragmentDestination destination, g attachMode, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(attachMode, "attachMode");
        this.f98664a = destination;
        this.f98665b = attachMode;
        this.f98666c = parcelable;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Parcelable getF98666c() {
        return this.f98666c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ModalFragmentNavigateCommand)) {
            return false;
        }
        ModalFragmentNavigateCommand modalFragmentNavigateCommand = (ModalFragmentNavigateCommand) obj2;
        return Intrinsics.f(this.f98664a, modalFragmentNavigateCommand.f98664a) && this.f98665b == modalFragmentNavigateCommand.f98665b && Intrinsics.f(this.f98666c, modalFragmentNavigateCommand.f98666c);
    }

    public final int hashCode() {
        int iHashCode = (this.f98665b.hashCode() + (this.f98664a.f98650a.hashCode() * 31)) * 31;
        Parcelable parcelable = this.f98666c;
        return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f98664a.writeToParcel(dest, i);
        dest.writeString(this.f98665b.name());
        dest.writeParcelable(this.f98666c, i);
    }
}
