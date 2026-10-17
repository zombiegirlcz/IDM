package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/FiltersInputItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "", "toString", "()Ljava/lang/String;", "Group", "Option", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FiltersInputItem implements InputItem {

    @NotNull
    public static final Parcelable.Creator<FiltersInputItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f63461c;
    public final List d;
    public final List e;
    public final Set f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/FiltersInputItem$Group;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Group implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Group> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f63463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f63464c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Group(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Group[i];
            }
        }

        public Group(String id10, String title, List itemIds) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(itemIds, "itemIds");
            this.f63462a = id10;
            this.f63463b = title;
            this.f63464c = itemIds;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Group)) {
                return false;
            }
            Group group = (Group) obj2;
            return Intrinsics.f(this.f63462a, group.f63462a) && Intrinsics.f(this.f63463b, group.f63463b) && Intrinsics.f(this.f63464c, group.f63464c);
        }

        public final int hashCode() {
            return this.f63464c.hashCode() + p.a.c(this.f63462a.hashCode() * 31, 31, this.f63463b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63462a);
            dest.writeString(this.f63463b);
            dest.writeStringList(this.f63464c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/FiltersInputItem$Option;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Option implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Option> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f63466b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Option(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Option[i];
            }
        }

        public Option(String id10, String label) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(label, "label");
            this.f63465a = id10;
            this.f63466b = label;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Option)) {
                return false;
            }
            Option option = (Option) obj2;
            return Intrinsics.f(this.f63465a, option.f63465a) && Intrinsics.f(this.f63466b, option.f63466b);
        }

        public final int hashCode() {
            return this.f63466b.hashCode() + (this.f63465a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63465a);
            dest.writeString(this.f63466b);
        }
    }

    public static final class a implements Parcelable.Creator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int iA = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            boolean z3 = parcel.readInt() != 0 ? i : 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iA2 = 0;
                while (iA2 != i2) {
                    iA2 = org.bouncycastle.jcajce.provider.digest.a.a(Group.CREATOR, parcel, arrayList2, iA2, i);
                }
                arrayList = arrayList2;
            }
            int i3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i3);
            int iA3 = 0;
            while (iA3 != i3) {
                iA3 = org.bouncycastle.jcajce.provider.digest.a.a(Option.CREATOR, parcel, arrayList3, iA3, i);
            }
            int i5 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i5);
            while (iA != i5) {
                iA = o.a(parcel, linkedHashSet, iA, i);
            }
            return new FiltersInputItem(string, z, z3, arrayList, arrayList3, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FiltersInputItem[i];
        }
    }

    public FiltersInputItem(String id10, boolean z, boolean z3, List list, List items, Set selected) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f63459a = id10;
        this.f63460b = z;
        this.f63461c = z3;
        this.d = list;
        this.e = items;
        this.f = selected;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63459a() {
        return this.f63459a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF63460b() {
        return this.f63460b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FiltersInputItem)) {
            return false;
        }
        FiltersInputItem filtersInputItem = (FiltersInputItem) obj2;
        return Intrinsics.f(this.f63459a, filtersInputItem.f63459a) && this.f63460b == filtersInputItem.f63460b && this.f63461c == filtersInputItem.f63461c && Intrinsics.f(this.d, filtersInputItem.d) && Intrinsics.f(this.e, filtersInputItem.e) && Intrinsics.f(this.f, filtersInputItem.f);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63459a;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(this.f63459a.hashCode() * 31, 31, this.f63460b), 31, this.f63461c);
        List list = this.d;
        return this.f.hashCode() + p.a.d((iC + (list == null ? 0 : list.hashCode())) * 31, 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63459a);
        dest.writeInt(this.f63460b ? 1 : 0);
        dest.writeInt(this.f63461c ? 1 : 0);
        List list = this.d;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((Group) itQ.next()).writeToParcel(dest, i);
            }
        }
        Iterator itV = p.a.v(this.e, dest);
        while (itV.hasNext()) {
            ((Option) itV.next()).writeToParcel(dest, i);
        }
        Iterator itV2 = n.v(this.f, dest);
        while (itV2.hasNext()) {
            dest.writeString((String) itV2.next());
        }
    }
}
