package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_common.data.model.Document;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/FurtherAction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "FurtherActionDescriptor", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FurtherAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FurtherAction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f75220c;
    public final Contact d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/FurtherAction$FurtherActionDescriptor;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FurtherActionDescriptor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<FurtherActionDescriptor> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Document f75222b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FurtherActionDescriptor(parcel.readString(), (Document) parcel.readParcelable(FurtherActionDescriptor.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FurtherActionDescriptor[i];
            }
        }

        public FurtherActionDescriptor(String text, Document document) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f75221a = text;
            this.f75222b = document;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FurtherActionDescriptor)) {
                return false;
            }
            FurtherActionDescriptor furtherActionDescriptor = (FurtherActionDescriptor) obj2;
            return Intrinsics.f(this.f75221a, furtherActionDescriptor.f75221a) && Intrinsics.f(this.f75222b, furtherActionDescriptor.f75222b);
        }

        public final int hashCode() {
            int iHashCode = this.f75221a.hashCode() * 31;
            Document document = this.f75222b;
            return iHashCode + (document == null ? 0 : document.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75221a);
            dest.writeParcelable(this.f75222b, i);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(FurtherActionDescriptor.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new FurtherAction(string, string2, arrayList, parcel.readInt() != 0 ? Contact.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FurtherAction[i];
        }
    }

    public FurtherAction(String title, String description, ArrayList arrayList, Contact contact) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f75218a = title;
        this.f75219b = description;
        this.f75220c = arrayList;
        this.d = contact;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FurtherAction)) {
            return false;
        }
        FurtherAction furtherAction = (FurtherAction) obj2;
        return Intrinsics.f(this.f75218a, furtherAction.f75218a) && Intrinsics.f(this.f75219b, furtherAction.f75219b) && Intrinsics.f(this.f75220c, furtherAction.f75220c) && Intrinsics.f(this.d, furtherAction.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f75218a.hashCode() * 31, 31, this.f75219b);
        List list = this.f75220c;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        Contact contact = this.d;
        return iHashCode + (contact != null ? contact.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75218a);
        dest.writeString(this.f75219b);
        List list = this.f75220c;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((FurtherActionDescriptor) itQ.next()).writeToParcel(dest, i);
            }
        }
        Contact contact = this.d;
        if (contact == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            contact.writeToParcel(dest, i);
        }
    }
}
