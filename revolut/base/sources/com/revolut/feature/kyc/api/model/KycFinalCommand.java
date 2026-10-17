package com.revolut.feature.kyc.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/kyc/api/model/KycFinalCommand;", "Landroid/os/Parcelable;", "<init>", "()V", "Next", "Success", "Lcom/revolut/feature/kyc/api/model/KycFinalCommand$Next;", "Lcom/revolut/feature/kyc/api/model/KycFinalCommand$Success;", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class KycFinalCommand implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/api/model/KycFinalCommand$Success;", "Lcom/revolut/feature/kyc/api/model/KycFinalCommand;", "", "toString", "()Ljava/lang/String;", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Success extends KycFinalCommand {

        @NotNull
        public static final Parcelable.Creator<Success> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NaviCommand f77476a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Success((NaviCommand) parcel.readParcelable(Success.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Success[i];
            }
        }

        public Success(NaviCommand naviCommand) {
            Intrinsics.checkNotNullParameter(naviCommand, "naviCommand");
            this.f77476a = naviCommand;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Success) && Intrinsics.f(this.f77476a, ((Success) obj2).f77476a);
        }

        public final int hashCode() {
            return this.f77476a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77476a, i);
        }
    }

    private KycFinalCommand() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/api/model/KycFinalCommand$Next;", "Lcom/revolut/feature/kyc/api/model/KycFinalCommand;", "", "toString", "()Ljava/lang/String;", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Next extends KycFinalCommand {

        @NotNull
        public static final Parcelable.Creator<Next> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NaviCommand f77475a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Next((NaviCommand) parcel.readParcelable(Next.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Next[i];
            }
        }

        public Next(NaviCommand naviCommand) {
            this.f77475a = naviCommand;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Next) && Intrinsics.f(this.f77475a, ((Next) obj2).f77475a);
        }

        public final int hashCode() {
            NaviCommand naviCommand = this.f77475a;
            if (naviCommand == null) {
                return 0;
            }
            return naviCommand.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77475a, i);
        }

        public Next() {
            this(null);
        }
    }
}
