package com.revolut.feature.contacts_chooser.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zm3.k;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/contacts_chooser/api/navigation/ContactType;", "Landroid/os/Parcelable;", "RevolutContact", "UsernameContact", "VirtualContact", "Group", "Lcom/revolut/feature/contacts_chooser/api/navigation/ContactType$Group;", "Lcom/revolut/feature/contacts_chooser/api/navigation/ContactType$RevolutContact;", "Lcom/revolut/feature/contacts_chooser/api/navigation/ContactType$UsernameContact;", "Lcom/revolut/feature/contacts_chooser/api/navigation/ContactType$VirtualContact;", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ContactType extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/contacts_chooser/api/navigation/ContactType$Group;", "Lcom/revolut/feature/contacts_chooser/api/navigation/ContactType;", "<init>", "()V", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Group implements ContactType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Group f66037a = new Group();

        @NotNull
        public static final Parcelable.Creator<Group> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Group.f66037a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Group[i];
            }
        }

        private Group() {
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/contacts_chooser/api/navigation/ContactType$RevolutContact;", "Lcom/revolut/feature/contacts_chooser/api/navigation/ContactType;", "Local", "Remote", "Lcom/revolut/feature/contacts_chooser/api/navigation/ContactType$RevolutContact$Local;", "Lcom/revolut/feature/contacts_chooser/api/navigation/ContactType$RevolutContact$Remote;", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface RevolutContact extends ContactType {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/contacts_chooser/api/navigation/ContactType$RevolutContact$Local;", "Lcom/revolut/feature/contacts_chooser/api/navigation/ContactType$RevolutContact;", "<init>", "()V", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Local implements RevolutContact {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Local f66038a = new Local();

            @NotNull
            public static final Parcelable.Creator<Local> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Local.f66038a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Local[i];
                }
            }

            private Local() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/contacts_chooser/api/navigation/ContactType$RevolutContact$Remote;", "Lcom/revolut/feature/contacts_chooser/api/navigation/ContactType$RevolutContact;", "", "toString", "()Ljava/lang/String;", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Remote implements RevolutContact {

            @NotNull
            public static final Parcelable.Creator<Remote> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Set f66039a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet.add(k.valueOf(parcel.readString()));
                    }
                    return new Remote(linkedHashSet);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Remote[i];
                }
            }

            public Remote() {
                this(0);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Remote) && Intrinsics.f(this.f66039a, ((Remote) obj2).f66039a);
            }

            public final int hashCode() {
                return this.f66039a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itV = n.v(this.f66039a, dest);
                while (itV.hasNext()) {
                    dest.writeString(((k) itV.next()).name());
                }
            }

            public /* synthetic */ Remote(int i) {
                this(d0.i1(k.a()));
            }

            public Remote(Set allowedTypes) {
                Intrinsics.checkNotNullParameter(allowedTypes, "allowedTypes");
                this.f66039a = allowedTypes;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/contacts_chooser/api/navigation/ContactType$UsernameContact;", "Lcom/revolut/feature/contacts_chooser/api/navigation/ContactType;", "<init>", "()V", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UsernameContact implements ContactType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UsernameContact f66040a = new UsernameContact();

        @NotNull
        public static final Parcelable.Creator<UsernameContact> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UsernameContact.f66040a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UsernameContact[i];
            }
        }

        private UsernameContact() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/contacts_chooser/api/navigation/ContactType$VirtualContact;", "Lcom/revolut/feature/contacts_chooser/api/navigation/ContactType;", "<init>", "()V", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class VirtualContact implements ContactType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final VirtualContact f66041a = new VirtualContact();

        @NotNull
        public static final Parcelable.Creator<VirtualContact> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return VirtualContact.f66041a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VirtualContact[i];
            }
        }

        private VirtualContact() {
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
}
