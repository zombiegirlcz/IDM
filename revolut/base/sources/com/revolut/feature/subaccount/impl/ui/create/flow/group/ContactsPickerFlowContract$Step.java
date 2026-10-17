package com.revolut.feature.subaccount.impl.ui.create.flow.group;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.core.navigation.NaviCommand;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/subaccount/impl/ui/create/flow/group/ContactsPickerFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Contacts", "Permissions", "Lcom/revolut/feature/subaccount/impl/ui/create/flow/group/ContactsPickerFlowContract$Step$Contacts;", "Lcom/revolut/feature/subaccount/impl/ui/create/flow/group/ContactsPickerFlowContract$Step$Permissions;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ContactsPickerFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/create/flow/group/ContactsPickerFlowContract$Step$Contacts;", "Lcom/revolut/feature/subaccount/impl/ui/create/flow/group/ContactsPickerFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Contacts extends ContactsPickerFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Contacts> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f89004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f89005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NaviCommand f89006c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Contacts((wi0.b) parcel.readSerializable(), parcel.readInt() != 0, (NaviCommand) parcel.readParcelable(Contacts.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Contacts[i];
            }
        }

        public Contacts(wi0.b userCountry, boolean z, NaviCommand naviCommand) {
            Intrinsics.checkNotNullParameter(userCountry, "userCountry");
            this.f89004a = userCountry;
            this.f89005b = z;
            this.f89006c = naviCommand;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Contacts)) {
                return false;
            }
            Contacts contacts = (Contacts) obj2;
            return Intrinsics.f(this.f89004a, contacts.f89004a) && this.f89005b == contacts.f89005b && Intrinsics.f(this.f89006c, contacts.f89006c);
        }

        public final int hashCode() {
            int iC = j6.a.c(this.f89004a.f297794a.hashCode() * 31, 31, this.f89005b);
            NaviCommand naviCommand = this.f89006c;
            return iC + (naviCommand == null ? 0 : naviCommand.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f89004a);
            dest.writeInt(this.f89005b ? 1 : 0);
            dest.writeParcelable(this.f89006c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/create/flow/group/ContactsPickerFlowContract$Step$Permissions;", "Lcom/revolut/feature/subaccount/impl/ui/create/flow/group/ContactsPickerFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Permissions extends ContactsPickerFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Permissions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f89007a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new Permissions(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Permissions[i];
            }
        }

        public Permissions(ArrayList contacts) {
            Intrinsics.checkNotNullParameter(contacts, "contacts");
            this.f89007a = contacts;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Permissions) && this.f89007a.equals(((Permissions) obj2).f89007a);
        }

        public final int hashCode() {
            return this.f89007a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f89007a, dest);
            while (itY.hasNext()) {
                dest.writeSerializable((Serializable) itY.next());
            }
        }
    }

    private ContactsPickerFlowContract$Step() {
    }
}
