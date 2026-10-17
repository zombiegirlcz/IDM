package com.revolut.retail.operation_status.modal_screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/operation_status/modal_screen/StatusViewScreenContract$ClauseClickCommand", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "retail_operation_status_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StatusViewScreenContract$ClauseClickCommand implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StatusViewScreenContract$ClauseClickCommand> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NaviCommand f104331b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StatusViewScreenContract$ClauseClickCommand((NaviCommand) parcel.readParcelable(StatusViewScreenContract$ClauseClickCommand.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StatusViewScreenContract$ClauseClickCommand[i];
        }
    }

    public StatusViewScreenContract$ClauseClickCommand(NaviCommand command, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(command, "command");
        this.f104330a = id10;
        this.f104331b = command;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StatusViewScreenContract$ClauseClickCommand)) {
            return false;
        }
        StatusViewScreenContract$ClauseClickCommand statusViewScreenContract$ClauseClickCommand = (StatusViewScreenContract$ClauseClickCommand) obj2;
        return Intrinsics.f(this.f104330a, statusViewScreenContract$ClauseClickCommand.f104330a) && Intrinsics.f(this.f104331b, statusViewScreenContract$ClauseClickCommand.f104331b);
    }

    public final int hashCode() {
        return this.f104331b.hashCode() + (this.f104330a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104330a);
        dest.writeParcelable(this.f104331b, i);
    }
}
