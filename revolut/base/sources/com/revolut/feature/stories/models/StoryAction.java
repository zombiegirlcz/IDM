package com.revolut.feature.stories.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/stories/models/StoryAction;", "Landroid/os/Parcelable;", "<init>", "()V", "Dialog", "Url", "NavigationCommand", "Lcom/revolut/feature/stories/models/StoryAction$Dialog;", "Lcom/revolut/feature/stories/models/StoryAction$NavigationCommand;", "Lcom/revolut/feature/stories/models/StoryAction$Url;", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StoryAction implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/stories/models/StoryAction$Dialog;", "Lcom/revolut/feature/stories/models/StoryAction;", "", "toString", "()Ljava/lang/String;", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Dialog extends StoryAction {

        @NotNull
        public static final Parcelable.Creator<Dialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f88790b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f88791c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Dialog(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Dialog[i];
            }
        }

        public Dialog(String title, String description, String confirmationText) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(confirmationText, "confirmationText");
            this.f88789a = title;
            this.f88790b = description;
            this.f88791c = confirmationText;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Dialog)) {
                return false;
            }
            Dialog dialog = (Dialog) obj2;
            return Intrinsics.f(this.f88789a, dialog.f88789a) && Intrinsics.f(this.f88790b, dialog.f88790b) && Intrinsics.f(this.f88791c, dialog.f88791c);
        }

        public final int hashCode() {
            return this.f88791c.hashCode() + p.a.c(this.f88789a.hashCode() * 31, 31, this.f88790b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88789a);
            dest.writeString(this.f88790b);
            dest.writeString(this.f88791c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/stories/models/StoryAction$NavigationCommand;", "Lcom/revolut/feature/stories/models/StoryAction;", "", "toString", "()Ljava/lang/String;", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NavigationCommand extends StoryAction {

        @NotNull
        public static final Parcelable.Creator<NavigationCommand> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NaviCommand f88792a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NavigationCommand((NaviCommand) parcel.readParcelable(NavigationCommand.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NavigationCommand[i];
            }
        }

        public NavigationCommand(NaviCommand command) {
            Intrinsics.checkNotNullParameter(command, "command");
            this.f88792a = command;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NavigationCommand) && Intrinsics.f(this.f88792a, ((NavigationCommand) obj2).f88792a);
        }

        public final int hashCode() {
            return this.f88792a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f88792a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/stories/models/StoryAction$Url;", "Lcom/revolut/feature/stories/models/StoryAction;", "", "toString", "()Ljava/lang/String;", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Url extends StoryAction {

        @NotNull
        public static final Parcelable.Creator<Url> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88793a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Url(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Url[i];
            }
        }

        public Url(String url2) {
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f88793a = url2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Url) && Intrinsics.f(this.f88793a, ((Url) obj2).f88793a);
        }

        public final int hashCode() {
            return this.f88793a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88793a);
        }
    }

    private StoryAction() {
    }
}
