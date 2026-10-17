package com.revolut.feature.credit.application.plugins.api.models.action_button;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0006\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/action_button/Action;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "Deeplink", "Close", "PostRequest", "ProceedApplication", "Accept", "Upgrade", "Lcom/revolut/feature/credit/application/plugins/api/models/action_button/Action$Accept;", "Lcom/revolut/feature/credit/application/plugins/api/models/action_button/Action$Close;", "Lcom/revolut/feature/credit/application/plugins/api/models/action_button/Action$Deeplink;", "Lcom/revolut/feature/credit/application/plugins/api/models/action_button/Action$PostRequest;", "Lcom/revolut/feature/credit/application/plugins/api/models/action_button/Action$ProceedApplication;", "Lcom/revolut/feature/credit/application/plugins/api/models/action_button/Action$Upgrade;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface Action extends Parcelable, Serializable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/action_button/Action$Deeplink;", "Lcom/revolut/feature/credit/application/plugins/api/models/action_button/Action;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Deeplink implements Action {

        @NotNull
        public static final Parcelable.Creator<Deeplink> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f66291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Action f66292b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Deeplink(parcel.readString(), (Action) parcel.readParcelable(Deeplink.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Deeplink[i];
            }
        }

        public Deeplink(String deeplink, Action action) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.f66291a = deeplink;
            this.f66292b = action;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.action_button.Action
        /* JADX INFO: renamed from: O, reason: from getter */
        public final Action getF66297a() {
            return this.f66292b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Deeplink)) {
                return false;
            }
            Deeplink deeplink = (Deeplink) obj2;
            return Intrinsics.f(this.f66291a, deeplink.f66291a) && Intrinsics.f(this.f66292b, deeplink.f66292b);
        }

        public final int hashCode() {
            int iHashCode = this.f66291a.hashCode() * 31;
            Action action = this.f66292b;
            return iHashCode + (action == null ? 0 : action.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66291a);
            dest.writeParcelable(this.f66292b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/action_button/Action$PostRequest;", "Lcom/revolut/feature/credit/application/plugins/api/models/action_button/Action;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PostRequest implements Action {

        @NotNull
        public static final Parcelable.Creator<PostRequest> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f66293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Action f66294b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PostRequest(parcel.readString(), (Action) parcel.readParcelable(PostRequest.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PostRequest[i];
            }
        }

        public PostRequest(String postRequestPath, Action action) {
            Intrinsics.checkNotNullParameter(postRequestPath, "postRequestPath");
            this.f66293a = postRequestPath;
            this.f66294b = action;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.action_button.Action
        /* JADX INFO: renamed from: O, reason: from getter */
        public final Action getF66297a() {
            return this.f66294b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PostRequest)) {
                return false;
            }
            PostRequest postRequest = (PostRequest) obj2;
            return Intrinsics.f(this.f66293a, postRequest.f66293a) && Intrinsics.f(this.f66294b, postRequest.f66294b);
        }

        public final int hashCode() {
            int iHashCode = this.f66293a.hashCode() * 31;
            Action action = this.f66294b;
            return iHashCode + (action == null ? 0 : action.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66293a);
            dest.writeParcelable(this.f66294b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/action_button/Action$ProceedApplication;", "Lcom/revolut/feature/credit/application/plugins/api/models/action_button/Action;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProceedApplication implements Action {

        @NotNull
        public static final Parcelable.Creator<ProceedApplication> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f66295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Action f66296b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProceedApplication(parcel.readString(), (Action) parcel.readParcelable(ProceedApplication.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProceedApplication[i];
            }
        }

        public ProceedApplication(String postRequestPath, Action action) {
            Intrinsics.checkNotNullParameter(postRequestPath, "postRequestPath");
            this.f66295a = postRequestPath;
            this.f66296b = action;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.action_button.Action
        /* JADX INFO: renamed from: O, reason: from getter */
        public final Action getF66297a() {
            return this.f66296b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProceedApplication)) {
                return false;
            }
            ProceedApplication proceedApplication = (ProceedApplication) obj2;
            return Intrinsics.f(this.f66295a, proceedApplication.f66295a) && Intrinsics.f(this.f66296b, proceedApplication.f66296b);
        }

        public final int hashCode() {
            int iHashCode = this.f66295a.hashCode() * 31;
            Action action = this.f66296b;
            return iHashCode + (action == null ? 0 : action.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66295a);
            dest.writeParcelable(this.f66296b, i);
        }
    }

    /* JADX INFO: renamed from: O */
    Action getF66297a();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/action_button/Action$Accept;", "Lcom/revolut/feature/credit/application/plugins/api/models/action_button/Action;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Accept implements Action {

        @NotNull
        public static final Parcelable.Creator<Accept> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Action f66289a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Accept((Action) parcel.readParcelable(Accept.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Accept[i];
            }
        }

        public Accept(Action action) {
            this.f66289a = action;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.action_button.Action
        /* JADX INFO: renamed from: O, reason: from getter */
        public final Action getF66297a() {
            return this.f66289a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Accept) && Intrinsics.f(this.f66289a, ((Accept) obj2).f66289a);
        }

        public final int hashCode() {
            Action action = this.f66289a;
            if (action == null) {
                return 0;
            }
            return action.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66289a, i);
        }

        public Accept() {
            this(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/action_button/Action$Close;", "Lcom/revolut/feature/credit/application/plugins/api/models/action_button/Action;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Close implements Action {

        @NotNull
        public static final Parcelable.Creator<Close> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Action f66290a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Close((Action) parcel.readParcelable(Close.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Close[i];
            }
        }

        public Close(Action action) {
            this.f66290a = action;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.action_button.Action
        /* JADX INFO: renamed from: O, reason: from getter */
        public final Action getF66297a() {
            return this.f66290a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Close) && Intrinsics.f(this.f66290a, ((Close) obj2).f66290a);
        }

        public final int hashCode() {
            Action action = this.f66290a;
            if (action == null) {
                return 0;
            }
            return action.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66290a, i);
        }

        public Close() {
            this(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/action_button/Action$Upgrade;", "Lcom/revolut/feature/credit/application/plugins/api/models/action_button/Action;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Upgrade implements Action {

        @NotNull
        public static final Parcelable.Creator<Upgrade> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Action f66297a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Upgrade((Action) parcel.readParcelable(Upgrade.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Upgrade[i];
            }
        }

        public Upgrade(Action action) {
            this.f66297a = action;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.action_button.Action
        /* JADX INFO: renamed from: O, reason: from getter */
        public final Action getF66297a() {
            return this.f66297a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Upgrade) && Intrinsics.f(this.f66297a, ((Upgrade) obj2).f66297a);
        }

        public final int hashCode() {
            Action action = this.f66297a;
            if (action == null) {
                return 0;
            }
            return action.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66297a, i);
        }

        public Upgrade() {
            this(null);
        }
    }
}
