package com.revolut.appupdate.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/appupdate/ui/AppUpdateContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "SoftUpdate", "ForceUpdate", "Lcom/revolut/appupdate/ui/AppUpdateContract$Step$ForceUpdate;", "Lcom/revolut/appupdate/ui/AppUpdateContract$Step$SoftUpdate;", "appupdate_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AppUpdateContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/appupdate/ui/AppUpdateContract$Step$ForceUpdate;", "Lcom/revolut/appupdate/ui/AppUpdateContract$Step;", "<init>", "()V", "appupdate_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ForceUpdate extends AppUpdateContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ForceUpdate f50362a = new ForceUpdate();

        @NotNull
        public static final Parcelable.Creator<ForceUpdate> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ForceUpdate.f50362a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ForceUpdate[i];
            }
        }

        private ForceUpdate() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/appupdate/ui/AppUpdateContract$Step$SoftUpdate;", "Lcom/revolut/appupdate/ui/AppUpdateContract$Step;", "<init>", "()V", "appupdate_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SoftUpdate extends AppUpdateContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SoftUpdate f50363a = new SoftUpdate();

        @NotNull
        public static final Parcelable.Creator<SoftUpdate> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SoftUpdate.f50363a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SoftUpdate[i];
            }
        }

        private SoftUpdate() {
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

    private AppUpdateContract$Step() {
    }
}
