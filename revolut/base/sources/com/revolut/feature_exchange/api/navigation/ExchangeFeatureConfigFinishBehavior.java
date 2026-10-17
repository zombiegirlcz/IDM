package com.revolut.feature_exchange.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfigFinishBehavior;", "Landroid/os/Parcelable;", "<init>", "()V", "Navigate", "Default", "Finish", "Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfigFinishBehavior$Default;", "Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfigFinishBehavior$Finish;", "Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfigFinishBehavior$Navigate;", "feature_exchange_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ExchangeFeatureConfigFinishBehavior implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfigFinishBehavior$Default;", "Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfigFinishBehavior;", "<init>", "()V", "feature_exchange_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Default extends ExchangeFeatureConfigFinishBehavior {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Default f96860a = new Default();

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Default.f96860a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        private Default() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfigFinishBehavior$Finish;", "Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfigFinishBehavior;", "<init>", "()V", "feature_exchange_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Finish extends ExchangeFeatureConfigFinishBehavior {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Finish f96861a = new Finish();

        @NotNull
        public static final Parcelable.Creator<Finish> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Finish.f96861a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Finish[i];
            }
        }

        private Finish() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfigFinishBehavior$Navigate;", "Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfigFinishBehavior;", "", "toString", "()Ljava/lang/String;", "feature_exchange_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Navigate extends ExchangeFeatureConfigFinishBehavior {

        @NotNull
        public static final Parcelable.Creator<Navigate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NaviCommand f96862a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Navigate((NaviCommand) parcel.readParcelable(Navigate.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Navigate[i];
            }
        }

        public Navigate(NaviCommand command) {
            Intrinsics.checkNotNullParameter(command, "command");
            this.f96862a = command;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Navigate) && Intrinsics.f(this.f96862a, ((Navigate) obj2).f96862a);
        }

        public final int hashCode() {
            return this.f96862a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96862a, i);
        }
    }

    private ExchangeFeatureConfigFinishBehavior() {
    }
}
