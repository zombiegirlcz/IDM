package com.revolut.feature.credit.application.plugins.api.models.cancel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/cancel/DropOutConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "FeedbackForm", "ConfirmationContent", "Button", "Action", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DropOutConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DropOutConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f66303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConfirmationContent f66304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FeedbackForm f66305c;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/cancel/DropOutConfig$Action;", "Landroid/os/Parcelable;", "Deeplink", "Close", "PostRequest", "Lcom/revolut/feature/credit/application/plugins/api/models/cancel/DropOutConfig$Action$Close;", "Lcom/revolut/feature/credit/application/plugins/api/models/cancel/DropOutConfig$Action$Deeplink;", "Lcom/revolut/feature/credit/application/plugins/api/models/cancel/DropOutConfig$Action$PostRequest;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Action extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/cancel/DropOutConfig$Action$Deeplink;", "Lcom/revolut/feature/credit/application/plugins/api/models/cancel/DropOutConfig$Action;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Deeplink implements Action {

            @NotNull
            public static final Parcelable.Creator<Deeplink> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f66307a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Action f66308b;

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
                this.f66307a = deeplink;
                this.f66308b = action;
            }

            @Override // com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig.Action
            /* JADX INFO: renamed from: O, reason: from getter */
            public final Action getF66310b() {
                return this.f66308b;
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
                return Intrinsics.f(this.f66307a, deeplink.f66307a) && Intrinsics.f(this.f66308b, deeplink.f66308b);
            }

            public final int hashCode() {
                int iHashCode = this.f66307a.hashCode() * 31;
                Action action = this.f66308b;
                return iHashCode + (action == null ? 0 : action.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f66307a);
                dest.writeParcelable(this.f66308b, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/cancel/DropOutConfig$Action$PostRequest;", "Lcom/revolut/feature/credit/application/plugins/api/models/cancel/DropOutConfig$Action;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PostRequest implements Action {

            @NotNull
            public static final Parcelable.Creator<PostRequest> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f66309a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Action f66310b;

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
                this.f66309a = postRequestPath;
                this.f66310b = action;
            }

            @Override // com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig.Action
            /* JADX INFO: renamed from: O, reason: from getter */
            public final Action getF66310b() {
                return this.f66310b;
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
                return Intrinsics.f(this.f66309a, postRequest.f66309a) && Intrinsics.f(this.f66310b, postRequest.f66310b);
            }

            public final int hashCode() {
                int iHashCode = this.f66309a.hashCode() * 31;
                Action action = this.f66310b;
                return iHashCode + (action == null ? 0 : action.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f66309a);
                dest.writeParcelable(this.f66310b, i);
            }
        }

        /* JADX INFO: renamed from: O */
        Action getF66310b();

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/cancel/DropOutConfig$Action$Close;", "Lcom/revolut/feature/credit/application/plugins/api/models/cancel/DropOutConfig$Action;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Close implements Action {

            @NotNull
            public static final Parcelable.Creator<Close> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Action f66306a;

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
                this.f66306a = action;
            }

            @Override // com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig.Action
            /* JADX INFO: renamed from: O, reason: from getter */
            public final Action getF66310b() {
                return this.f66306a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Close) && Intrinsics.f(this.f66306a, ((Close) obj2).f66306a);
            }

            public final int hashCode() {
                Action action = this.f66306a;
                if (action == null) {
                    return 0;
                }
                return action.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f66306a, i);
            }

            public Close() {
                this(null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/cancel/DropOutConfig$Button;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f66311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Action f66312b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Button(parcel.readString(), (Action) parcel.readParcelable(Button.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Button[i];
            }
        }

        public Button(String text, Action action) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f66311a = text;
            this.f66312b = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Button)) {
                return false;
            }
            Button button = (Button) obj2;
            return Intrinsics.f(this.f66311a, button.f66311a) && Intrinsics.f(this.f66312b, button.f66312b);
        }

        public final int hashCode() {
            return this.f66312b.hashCode() + (this.f66311a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66311a);
            dest.writeParcelable(this.f66312b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/cancel/DropOutConfig$ConfirmationContent;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmationContent implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ConfirmationContent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f66313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f66314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Button f66315c;
        public final Button d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                Parcelable.Creator<Button> creator = Button.CREATOR;
                return new ConfirmationContent(string, string2, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmationContent[i];
            }
        }

        public ConfirmationContent(String title, String description, Button primaryButton, Button secondaryButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
            Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
            this.f66313a = title;
            this.f66314b = description;
            this.f66315c = primaryButton;
            this.d = secondaryButton;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ConfirmationContent)) {
                return false;
            }
            ConfirmationContent confirmationContent = (ConfirmationContent) obj2;
            return Intrinsics.f(this.f66313a, confirmationContent.f66313a) && Intrinsics.f(this.f66314b, confirmationContent.f66314b) && Intrinsics.f(this.f66315c, confirmationContent.f66315c) && Intrinsics.f(this.d, confirmationContent.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f66315c.hashCode() + p.a.c(this.f66313a.hashCode() * 31, 31, this.f66314b)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66313a);
            dest.writeString(this.f66314b);
            this.f66315c.writeToParcel(dest, i);
            this.d.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/cancel/DropOutConfig$FeedbackForm;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FeedbackForm implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<FeedbackForm> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f66316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f66317b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.createStringArrayList());
                }
                return new FeedbackForm(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeedbackForm[i];
            }
        }

        public FeedbackForm(String formKey, Map formParams) {
            Intrinsics.checkNotNullParameter(formKey, "formKey");
            Intrinsics.checkNotNullParameter(formParams, "formParams");
            this.f66316a = formKey;
            this.f66317b = formParams;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FeedbackForm)) {
                return false;
            }
            FeedbackForm feedbackForm = (FeedbackForm) obj2;
            return Intrinsics.f(this.f66316a, feedbackForm.f66316a) && Intrinsics.f(this.f66317b, feedbackForm.f66317b);
        }

        public final int hashCode() {
            return this.f66317b.hashCode() + (this.f66316a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66316a);
            Iterator itZ = j6.a.z(this.f66317b, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeStringList((List) entry.getValue());
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DropOutConfig(parcel.readInt() != 0, parcel.readInt() == 0 ? null : ConfirmationContent.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FeedbackForm.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DropOutConfig[i];
        }
    }

    public DropOutConfig(boolean z, ConfirmationContent confirmationContent, FeedbackForm feedbackForm) {
        this.f66303a = z;
        this.f66304b = confirmationContent;
        this.f66305c = feedbackForm;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DropOutConfig)) {
            return false;
        }
        DropOutConfig dropOutConfig = (DropOutConfig) obj2;
        return this.f66303a == dropOutConfig.f66303a && Intrinsics.f(this.f66304b, dropOutConfig.f66304b) && Intrinsics.f(this.f66305c, dropOutConfig.f66305c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f66303a) * 31;
        ConfirmationContent confirmationContent = this.f66304b;
        int iHashCode2 = (iHashCode + (confirmationContent == null ? 0 : confirmationContent.hashCode())) * 31;
        FeedbackForm feedbackForm = this.f66305c;
        return iHashCode2 + (feedbackForm != null ? feedbackForm.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f66303a ? 1 : 0);
        ConfirmationContent confirmationContent = this.f66304b;
        if (confirmationContent == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            confirmationContent.writeToParcel(dest, i);
        }
        FeedbackForm feedbackForm = this.f66305c;
        if (feedbackForm == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            feedbackForm.writeToParcel(dest, i);
        }
    }
}
