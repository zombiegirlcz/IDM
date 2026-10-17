package com.revolut.feature.web_sign_in.ui.flow.web_sign_in;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/web_sign_in/ui/flow/web_sign_in/WebSignInFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Promo", "Permissions", "Scanner", "Loading", "Confirmation", "Lcom/revolut/feature/web_sign_in/ui/flow/web_sign_in/WebSignInFlowContract$Step$Confirmation;", "Lcom/revolut/feature/web_sign_in/ui/flow/web_sign_in/WebSignInFlowContract$Step$Loading;", "Lcom/revolut/feature/web_sign_in/ui/flow/web_sign_in/WebSignInFlowContract$Step$Permissions;", "Lcom/revolut/feature/web_sign_in/ui/flow/web_sign_in/WebSignInFlowContract$Step$Promo;", "Lcom/revolut/feature/web_sign_in/ui/flow/web_sign_in/WebSignInFlowContract$Step$Scanner;", "feature_web_sign_in_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class WebSignInFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/web_sign_in/ui/flow/web_sign_in/WebSignInFlowContract$Step$Confirmation;", "Lcom/revolut/feature/web_sign_in/ui/flow/web_sign_in/WebSignInFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_web_sign_in_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirmation extends WebSignInFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f96331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f96332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Long f96333c;
        public final String d;
        public final long e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Confirmation(parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirmation[i];
            }
        }

        public Confirmation(long j2, Long l2, String str, String ip2, String device) {
            Intrinsics.checkNotNullParameter(ip2, "ip");
            Intrinsics.checkNotNullParameter(device, "device");
            this.f96331a = str;
            this.f96332b = ip2;
            this.f96333c = l2;
            this.d = device;
            this.e = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Confirmation)) {
                return false;
            }
            Confirmation confirmation = (Confirmation) obj2;
            return Intrinsics.f(this.f96331a, confirmation.f96331a) && Intrinsics.f(this.f96332b, confirmation.f96332b) && Intrinsics.f(this.f96333c, confirmation.f96333c) && Intrinsics.f(this.d, confirmation.d) && this.e == confirmation.e;
        }

        public final int hashCode() {
            String str = this.f96331a;
            int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f96332b);
            Long l2 = this.f96333c;
            return Long.hashCode(this.e) + p.a.c((iC + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96331a);
            dest.writeString(this.f96332b);
            Long l2 = this.f96333c;
            if (l2 == null) {
                dest.writeInt(0);
            } else {
                b.A(dest, 1, l2);
            }
            dest.writeString(this.d);
            dest.writeLong(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/web_sign_in/ui/flow/web_sign_in/WebSignInFlowContract$Step$Loading;", "Lcom/revolut/feature/web_sign_in/ui/flow/web_sign_in/WebSignInFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_web_sign_in_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Loading extends WebSignInFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f96334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f96335b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Loading(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Loading[i];
            }
        }

        public Loading(String token, boolean z) {
            Intrinsics.checkNotNullParameter(token, "token");
            this.f96334a = token;
            this.f96335b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) obj2;
            return Intrinsics.f(this.f96334a, loading.f96334a) && this.f96335b == loading.f96335b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f96335b) + (this.f96334a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96334a);
            dest.writeInt(this.f96335b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/web_sign_in/ui/flow/web_sign_in/WebSignInFlowContract$Step$Permissions;", "Lcom/revolut/feature/web_sign_in/ui/flow/web_sign_in/WebSignInFlowContract$Step;", "<init>", "()V", "feature_web_sign_in_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Permissions extends WebSignInFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Permissions f96336a = new Permissions();

        @NotNull
        public static final Parcelable.Creator<Permissions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Permissions.f96336a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Permissions[i];
            }
        }

        private Permissions() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/web_sign_in/ui/flow/web_sign_in/WebSignInFlowContract$Step$Promo;", "Lcom/revolut/feature/web_sign_in/ui/flow/web_sign_in/WebSignInFlowContract$Step;", "<init>", "()V", "feature_web_sign_in_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Promo extends WebSignInFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Promo f96337a = new Promo();

        @NotNull
        public static final Parcelable.Creator<Promo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Promo.f96337a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Promo[i];
            }
        }

        private Promo() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/web_sign_in/ui/flow/web_sign_in/WebSignInFlowContract$Step$Scanner;", "Lcom/revolut/feature/web_sign_in/ui/flow/web_sign_in/WebSignInFlowContract$Step;", "<init>", "()V", "feature_web_sign_in_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Scanner extends WebSignInFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Scanner f96338a = new Scanner();

        @NotNull
        public static final Parcelable.Creator<Scanner> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Scanner.f96338a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Scanner[i];
            }
        }

        private Scanner() {
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

    private WebSignInFlowContract$Step() {
    }
}
