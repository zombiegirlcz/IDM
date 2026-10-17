package com.revolut.feature.contacts_chooser.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/contacts_chooser/api/navigation/ContactsChooserEmptyState;", "Landroid/os/Parcelable;", "Default", "Invite", "Lcom/revolut/feature/contacts_chooser/api/navigation/ContactsChooserEmptyState$Default;", "Lcom/revolut/feature/contacts_chooser/api/navigation/ContactsChooserEmptyState$Invite;", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ContactsChooserEmptyState extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/contacts_chooser/api/navigation/ContactsChooserEmptyState$Default;", "Lcom/revolut/feature/contacts_chooser/api/navigation/ContactsChooserEmptyState;", "", "toString", "()Ljava/lang/String;", "CustomContent", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Default implements ContactsChooserEmptyState {

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CustomContent f66054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f66055b;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/contacts_chooser/api/navigation/ContactsChooserEmptyState$Default$CustomContent;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CustomContent implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<CustomContent> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f66056a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Clause f66057b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CustomContent((Clause) parcel.readParcelable(CustomContent.class.getClassLoader()), (Clause) parcel.readParcelable(CustomContent.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CustomContent[i];
                }
            }

            public CustomContent(Clause title, Clause subtitle) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                this.f66056a = title;
                this.f66057b = subtitle;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof CustomContent)) {
                    return false;
                }
                CustomContent customContent = (CustomContent) obj2;
                return Intrinsics.f(this.f66056a, customContent.f66056a) && Intrinsics.f(this.f66057b, customContent.f66057b);
            }

            public final int hashCode() {
                return this.f66057b.hashCode() + (this.f66056a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f66056a, i);
                dest.writeParcelable(this.f66057b, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Default(parcel.readInt() == 0 ? null : CustomContent.CREATOR.createFromParcel(parcel), (Clause) parcel.readParcelable(Default.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        public Default() {
            this(null, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Default)) {
                return false;
            }
            Default r56 = (Default) obj2;
            return Intrinsics.f(this.f66054a, r56.f66054a) && Intrinsics.f(this.f66055b, r56.f66055b);
        }

        public final int hashCode() {
            CustomContent customContent = this.f66054a;
            int iHashCode = (customContent == null ? 0 : customContent.hashCode()) * 31;
            Clause clause = this.f66055b;
            return iHashCode + (clause != null ? clause.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            CustomContent customContent = this.f66054a;
            if (customContent == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                customContent.writeToParcel(dest, i);
            }
            dest.writeParcelable(this.f66055b, i);
        }

        public Default(CustomContent customContent, Clause clause) {
            this.f66054a = customContent;
            this.f66055b = clause;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/contacts_chooser/api/navigation/ContactsChooserEmptyState$Invite;", "Lcom/revolut/feature/contacts_chooser/api/navigation/ContactsChooserEmptyState;", "", "toString", "()Ljava/lang/String;", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Invite implements ContactsChooserEmptyState {

        @NotNull
        public static final Parcelable.Creator<Invite> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f66058a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Invite((Clause) parcel.readParcelable(Invite.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Invite[i];
            }
        }

        public Invite() {
            this(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Invite) && Intrinsics.f(this.f66058a, ((Invite) obj2).f66058a);
        }

        public final int hashCode() {
            Clause clause = this.f66058a;
            if (clause == null) {
                return 0;
            }
            return clause.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66058a, i);
        }

        public Invite(Clause clause) {
            this.f66058a = clause;
        }
    }
}
