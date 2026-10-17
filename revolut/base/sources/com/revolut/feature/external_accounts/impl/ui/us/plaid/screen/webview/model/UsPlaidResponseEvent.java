package com.revolut.feature.external_accounts.impl.ui.us.plaid.screen.webview.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/us/plaid/screen/webview/model/UsPlaidResponseEvent;", "Landroid/os/Parcelable;", "<init>", "()V", "OpenExternalBrowser", "Connected", "Exit", "Error", "GlobalEvent", "Unknown", "Lcom/revolut/feature/external_accounts/impl/ui/us/plaid/screen/webview/model/UsPlaidResponseEvent$Connected;", "Lcom/revolut/feature/external_accounts/impl/ui/us/plaid/screen/webview/model/UsPlaidResponseEvent$Error;", "Lcom/revolut/feature/external_accounts/impl/ui/us/plaid/screen/webview/model/UsPlaidResponseEvent$Exit;", "Lcom/revolut/feature/external_accounts/impl/ui/us/plaid/screen/webview/model/UsPlaidResponseEvent$GlobalEvent;", "Lcom/revolut/feature/external_accounts/impl/ui/us/plaid/screen/webview/model/UsPlaidResponseEvent$OpenExternalBrowser;", "Lcom/revolut/feature/external_accounts/impl/ui/us/plaid/screen/webview/model/UsPlaidResponseEvent$Unknown;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class UsPlaidResponseEvent implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/us/plaid/screen/webview/model/UsPlaidResponseEvent$Connected;", "Lcom/revolut/feature/external_accounts/impl/ui/us/plaid/screen/webview/model/UsPlaidResponseEvent;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Connected extends UsPlaidResponseEvent {

        @NotNull
        public static final Parcelable.Creator<Connected> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f73085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f73086c;
        public final String d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Connected(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Connected[i];
            }
        }

        public Connected(String publicToken, String accountId, String accountName, String institutionId, String institutionName) {
            Intrinsics.checkNotNullParameter(publicToken, "publicToken");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(accountName, "accountName");
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(institutionName, "institutionName");
            this.f73084a = publicToken;
            this.f73085b = accountId;
            this.f73086c = accountName;
            this.d = institutionId;
            this.e = institutionName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Connected)) {
                return false;
            }
            Connected connected = (Connected) obj2;
            return Intrinsics.f(this.f73084a, connected.f73084a) && Intrinsics.f(this.f73085b, connected.f73085b) && Intrinsics.f(this.f73086c, connected.f73086c) && Intrinsics.f(this.d, connected.d) && Intrinsics.f(this.e, connected.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f73084a.hashCode() * 31, 31, this.f73085b), 31, this.f73086c), 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73084a);
            dest.writeString(this.f73085b);
            dest.writeString(this.f73086c);
            dest.writeString(this.d);
            dest.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/us/plaid/screen/webview/model/UsPlaidResponseEvent$Error;", "Lcom/revolut/feature/external_accounts/impl/ui/us/plaid/screen/webview/model/UsPlaidResponseEvent;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error extends UsPlaidResponseEvent {

        @NotNull
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f73088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f73089c;
        public final String d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f73090g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f73091h;
        public final String i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Error(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Error[i];
            }
        }

        public Error(String message, String displayMessage, String type, String linkSessionId, String code, String institutionName, String requestId, String institutionId, String status) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(displayMessage, "displayMessage");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(linkSessionId, "linkSessionId");
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(institutionName, "institutionName");
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(status, "status");
            this.f73087a = message;
            this.f73088b = displayMessage;
            this.f73089c = type;
            this.d = linkSessionId;
            this.e = code;
            this.f = institutionName;
            this.f73090g = requestId;
            this.f73091h = institutionId;
            this.i = status;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Error)) {
                return false;
            }
            Error error = (Error) obj2;
            return Intrinsics.f(this.f73087a, error.f73087a) && Intrinsics.f(this.f73088b, error.f73088b) && Intrinsics.f(this.f73089c, error.f73089c) && Intrinsics.f(this.d, error.d) && Intrinsics.f(this.e, error.e) && Intrinsics.f(this.f, error.f) && Intrinsics.f(this.f73090g, error.f73090g) && Intrinsics.f(this.f73091h, error.f73091h) && Intrinsics.f(this.i, error.i);
        }

        public final int hashCode() {
            return this.i.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f73087a.hashCode() * 31, 31, this.f73088b), 31, this.f73089c), 31, this.d), 31, this.e), 31, this.f), 31, this.f73090g), 31, this.f73091h);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73087a);
            dest.writeString(this.f73088b);
            dest.writeString(this.f73089c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
            dest.writeString(this.f73090g);
            dest.writeString(this.f73091h);
            dest.writeString(this.i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/us/plaid/screen/webview/model/UsPlaidResponseEvent$Exit;", "Lcom/revolut/feature/external_accounts/impl/ui/us/plaid/screen/webview/model/UsPlaidResponseEvent;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Exit extends UsPlaidResponseEvent {

        @NotNull
        public static final Parcelable.Creator<Exit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f73093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f73094c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Exit(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Exit[i];
            }
        }

        public Exit(String status, String linkRequestId, String plaidApiRequestId) {
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(linkRequestId, "linkRequestId");
            Intrinsics.checkNotNullParameter(plaidApiRequestId, "plaidApiRequestId");
            this.f73092a = status;
            this.f73093b = linkRequestId;
            this.f73094c = plaidApiRequestId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Exit)) {
                return false;
            }
            Exit exit = (Exit) obj2;
            return Intrinsics.f(this.f73092a, exit.f73092a) && Intrinsics.f(this.f73093b, exit.f73093b) && Intrinsics.f(this.f73094c, exit.f73094c);
        }

        public final int hashCode() {
            return this.f73094c.hashCode() + p.a.c(this.f73092a.hashCode() * 31, 31, this.f73093b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73092a);
            dest.writeString(this.f73093b);
            dest.writeString(this.f73094c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/us/plaid/screen/webview/model/UsPlaidResponseEvent$GlobalEvent;", "Lcom/revolut/feature/external_accounts/impl/ui/us/plaid/screen/webview/model/UsPlaidResponseEvent;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GlobalEvent extends UsPlaidResponseEvent {

        @NotNull
        public static final Parcelable.Creator<GlobalEvent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73095a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GlobalEvent(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GlobalEvent[i];
            }
        }

        public GlobalEvent(String eventName) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            this.f73095a = eventName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GlobalEvent) && Intrinsics.f(this.f73095a, ((GlobalEvent) obj2).f73095a);
        }

        public final int hashCode() {
            return this.f73095a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73095a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/us/plaid/screen/webview/model/UsPlaidResponseEvent$OpenExternalBrowser;", "Lcom/revolut/feature/external_accounts/impl/ui/us/plaid/screen/webview/model/UsPlaidResponseEvent;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenExternalBrowser extends UsPlaidResponseEvent {

        @NotNull
        public static final Parcelable.Creator<OpenExternalBrowser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f73096a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenExternalBrowser((Uri) parcel.readParcelable(OpenExternalBrowser.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenExternalBrowser[i];
            }
        }

        public OpenExternalBrowser(Uri externalUri) {
            Intrinsics.checkNotNullParameter(externalUri, "externalUri");
            this.f73096a = externalUri;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OpenExternalBrowser) && Intrinsics.f(this.f73096a, ((OpenExternalBrowser) obj2).f73096a);
        }

        public final int hashCode() {
            return this.f73096a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73096a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/us/plaid/screen/webview/model/UsPlaidResponseEvent$Unknown;", "Lcom/revolut/feature/external_accounts/impl/ui/us/plaid/screen/webview/model/UsPlaidResponseEvent;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Unknown extends UsPlaidResponseEvent {

        @NotNull
        public static final Parcelable.Creator<Unknown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73097a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Unknown(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unknown[i];
            }
        }

        public Unknown(String str) {
            this.f73097a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Unknown) && Intrinsics.f(this.f73097a, ((Unknown) obj2).f73097a);
        }

        public final int hashCode() {
            String str = this.f73097a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73097a);
        }
    }

    private UsPlaidResponseEvent() {
    }
}
