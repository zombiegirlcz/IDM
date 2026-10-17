package com.revolut.shared.feature.suspicious_transaction.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/models/Action;", "Landroid/os/Parcelable;", "<init>", "()V", "Deeplink", "Screen", "Request", "Lcom/revolut/shared/feature/suspicious_transaction/api/models/Action$Deeplink;", "Lcom/revolut/shared/feature/suspicious_transaction/api/models/Action$Request;", "Lcom/revolut/shared/feature/suspicious_transaction/api/models/Action$Screen;", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class Action implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/models/Action$Deeplink;", "Lcom/revolut/shared/feature/suspicious_transaction/api/models/Action;", "", "toString", "()Ljava/lang/String;", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Deeplink extends Action {

        @NotNull
        public static final Parcelable.Creator<Deeplink> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104895a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Deeplink(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Deeplink[i];
            }
        }

        public Deeplink(String deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.f104895a = deeplink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Deeplink) && Intrinsics.f(this.f104895a, ((Deeplink) obj2).f104895a);
        }

        public final int hashCode() {
            return this.f104895a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104895a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/models/Action$Request;", "Lcom/revolut/shared/feature/suspicious_transaction/api/models/Action;", "", "toString", "()Ljava/lang/String;", "com/revolut/shared/feature/suspicious_transaction/api/models/a", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Request extends Action {

        @NotNull
        public static final Parcelable.Creator<Request> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.revolut.shared.feature.suspicious_transaction.api.models.a f104896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f104897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RequestSuccessDialog f104898c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Request(com.revolut.shared.feature.suspicious_transaction.api.models.a.valueOf(parcel.readString()), parcel.readString(), RequestSuccessDialog.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Request[i];
            }
        }

        public Request(com.revolut.shared.feature.suspicious_transaction.api.models.a method, String path, RequestSuccessDialog successDialog) {
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(successDialog, "successDialog");
            this.f104896a = method;
            this.f104897b = path;
            this.f104898c = successDialog;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Request)) {
                return false;
            }
            Request request = (Request) obj2;
            return this.f104896a == request.f104896a && Intrinsics.f(this.f104897b, request.f104897b) && Intrinsics.f(this.f104898c, request.f104898c);
        }

        public final int hashCode() {
            return this.f104898c.hashCode() + p.a.c(this.f104896a.hashCode() * 31, 31, this.f104897b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104896a.name());
            dest.writeString(this.f104897b);
            this.f104898c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/models/Action$Screen;", "Lcom/revolut/shared/feature/suspicious_transaction/api/models/Action;", "", "toString", "()Ljava/lang/String;", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Screen extends Action {

        @NotNull
        public static final Parcelable.Creator<Screen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SuspiciousTransactionDialog.Screen f104899a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Screen((SuspiciousTransactionDialog.Screen) parcel.readParcelable(Screen.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Screen[i];
            }
        }

        public Screen(SuspiciousTransactionDialog.Screen screen) {
            Intrinsics.checkNotNullParameter(screen, "screen");
            this.f104899a = screen;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Screen) && Intrinsics.f(this.f104899a, ((Screen) obj2).f104899a);
        }

        public final int hashCode() {
            return this.f104899a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f104899a, i);
        }
    }

    private Action() {
    }
}
