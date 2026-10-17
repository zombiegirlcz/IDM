package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0006\u0007\bJ\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/EditableListItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "Lxl2/a;", "", "toString", "()Ljava/lang/String;", "EditableOptionsValue", "EditableOption", "ItemSourceTemplate", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EditableListItem implements InputItem, xl2.a {

    @NotNull
    public static final Parcelable.Creator<EditableListItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f63402c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f63403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final EditableOptionsValue f63404h;
    public final ArrayList i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/EditableListItem$EditableOption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/backend_flow/domain/models/d", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditableOption implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<EditableOption> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BackendFlowIcon f63406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f63407c;
        public final String d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final d f63408g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f63409h;
        public final boolean i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                BackendFlowIcon backendFlowIcon = (BackendFlowIcon) parcel.readParcelable(EditableOption.class.getClassLoader());
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                d dVarValueOf = d.valueOf(parcel.readString());
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                return new EditableOption(string, backendFlowIcon, string2, string3, string4, string5, dVarValueOf, z3, parcel.readInt() == 0 ? z : true);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditableOption[i];
            }
        }

        public EditableOption(String id10, BackendFlowIcon backendFlowIcon, String title, String str, String str2, String str3, d style, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(style, "style");
            this.f63405a = id10;
            this.f63406b = backendFlowIcon;
            this.f63407c = title;
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.f63408g = style;
            this.f63409h = z;
            this.i = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditableOption)) {
                return false;
            }
            EditableOption editableOption = (EditableOption) obj2;
            return Intrinsics.f(this.f63405a, editableOption.f63405a) && Intrinsics.f(this.f63406b, editableOption.f63406b) && Intrinsics.f(this.f63407c, editableOption.f63407c) && Intrinsics.f(this.d, editableOption.d) && Intrinsics.f(this.e, editableOption.e) && Intrinsics.f(this.f, editableOption.f) && this.f63408g == editableOption.f63408g && this.f63409h == editableOption.f63409h && this.i == editableOption.i;
        }

        public final int hashCode() {
            int iHashCode = this.f63405a.hashCode() * 31;
            BackendFlowIcon backendFlowIcon = this.f63406b;
            int iC = p.a.c((iHashCode + (backendFlowIcon == null ? 0 : backendFlowIcon.hashCode())) * 31, 31, this.f63407c);
            String str = this.d;
            int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            return Boolean.hashCode(this.i) + j6.a.c((this.f63408g.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31, 31, this.f63409h);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63405a);
            dest.writeParcelable(this.f63406b, i);
            dest.writeString(this.f63407c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
            dest.writeString(this.f63408g.name());
            dest.writeInt(this.f63409h ? 1 : 0);
            dest.writeInt(this.i ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/EditableListItem$EditableOptionsValue;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "EditableOptionValue", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditableOptionsValue implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<EditableOptionsValue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f63410a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/EditableListItem$EditableOptionsValue$EditableOptionValue;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class EditableOptionValue implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<EditableOptionValue> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f63411a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f63412b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f63413c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new EditableOptionValue(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new EditableOptionValue[i];
                }
            }

            public EditableOptionValue(String id10, String str, boolean z) {
                Intrinsics.checkNotNullParameter(id10, "id");
                this.f63411a = id10;
                this.f63412b = str;
                this.f63413c = z;
            }

            public static EditableOptionValue a(EditableOptionValue editableOptionValue, boolean z) {
                String id10 = editableOptionValue.f63411a;
                String str = editableOptionValue.f63412b;
                editableOptionValue.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                return new EditableOptionValue(id10, str, z);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof EditableOptionValue)) {
                    return false;
                }
                EditableOptionValue editableOptionValue = (EditableOptionValue) obj2;
                return Intrinsics.f(this.f63411a, editableOptionValue.f63411a) && Intrinsics.f(this.f63412b, editableOptionValue.f63412b) && this.f63413c == editableOptionValue.f63413c;
            }

            public final int hashCode() {
                int iHashCode = this.f63411a.hashCode() * 31;
                String str = this.f63412b;
                return Boolean.hashCode(this.f63413c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f63411a);
                dest.writeString(this.f63412b);
                dest.writeInt(this.f63413c ? 1 : 0);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(EditableOptionValue.CREATOR, parcel, arrayList, iA, 1);
                }
                return new EditableOptionsValue(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditableOptionsValue[i];
            }
        }

        public EditableOptionsValue(ArrayList items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.f63410a = items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EditableOptionsValue) && this.f63410a.equals(((EditableOptionsValue) obj2).f63410a);
        }

        public final int hashCode() {
            return this.f63410a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            ArrayList arrayList = this.f63410a;
            dest.writeInt(arrayList.size());
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                ((EditableOptionValue) it8.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/EditableListItem$ItemSourceTemplate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ItemSourceTemplate implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ItemSourceTemplate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f63415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f63416c;
        public final String d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f63417g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f63418h;
        public final BackendFlowIcon i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f63419j;
        public final boolean k;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                BackendFlowIcon backendFlowIcon = (BackendFlowIcon) parcel.readParcelable(ItemSourceTemplate.class.getClassLoader());
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                return new ItemSourceTemplate(string, string2, string3, string4, string5, string6, string7, string8, backendFlowIcon, z3, parcel.readInt() == 0 ? z : true);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ItemSourceTemplate[i];
            }
        }

        public ItemSourceTemplate(String id10, String sourceParam, String title, String style, String str, String str2, String str3, String str4, BackendFlowIcon backendFlowIcon, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(sourceParam, "sourceParam");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(style, "style");
            this.f63414a = id10;
            this.f63415b = sourceParam;
            this.f63416c = title;
            this.d = style;
            this.e = str;
            this.f = str2;
            this.f63417g = str3;
            this.f63418h = str4;
            this.i = backendFlowIcon;
            this.f63419j = z;
            this.k = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ItemSourceTemplate)) {
                return false;
            }
            ItemSourceTemplate itemSourceTemplate = (ItemSourceTemplate) obj2;
            return Intrinsics.f(this.f63414a, itemSourceTemplate.f63414a) && Intrinsics.f(this.f63415b, itemSourceTemplate.f63415b) && Intrinsics.f(this.f63416c, itemSourceTemplate.f63416c) && Intrinsics.f(this.d, itemSourceTemplate.d) && Intrinsics.f(this.e, itemSourceTemplate.e) && Intrinsics.f(this.f, itemSourceTemplate.f) && Intrinsics.f(this.f63417g, itemSourceTemplate.f63417g) && Intrinsics.f(this.f63418h, itemSourceTemplate.f63418h) && Intrinsics.f(this.i, itemSourceTemplate.i) && this.f63419j == itemSourceTemplate.f63419j && this.k == itemSourceTemplate.k;
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(p.a.c(this.f63414a.hashCode() * 31, 31, this.f63415b), 31, this.f63416c), 31, this.d);
            String str = this.e;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f63417g;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f63418h;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            BackendFlowIcon backendFlowIcon = this.i;
            return Boolean.hashCode(this.k) + j6.a.c((iHashCode4 + (backendFlowIcon != null ? backendFlowIcon.hashCode() : 0)) * 31, 31, this.f63419j);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63414a);
            dest.writeString(this.f63415b);
            dest.writeString(this.f63416c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
            dest.writeString(this.f63417g);
            dest.writeString(this.f63418h);
            dest.writeParcelable(this.i, i);
            dest.writeInt(this.f63419j ? 1 : 0);
            dest.writeInt(this.k ? 1 : 0);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            ArrayList arrayList;
            EditableOptionsValue editableOptionsValue;
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
            if (parcel.readInt() == 0) {
                arrayList = null;
                editableOptionsValue = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iE = 0;
                while (iE != i2) {
                    iE = j6.a.e(EditableListItem.class, parcel, arrayList2, iE, i);
                }
                arrayList = arrayList2;
                editableOptionsValue = null;
            }
            String string2 = parcel.readString();
            EditableOptionsValue editableOptionsValue2 = editableOptionsValue;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i3);
            int iA2 = 0;
            while (iA2 != i3) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(EditableOption.CREATOR, parcel, arrayList3, iA2, i);
            }
            EditableOptionsValue editableOptionsValueCreateFromParcel = parcel.readInt() == 0 ? editableOptionsValue2 : EditableOptionsValue.CREATOR.createFromParcel(parcel);
            int i5 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i5);
            while (iA != i5) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(ItemSourceTemplate.CREATOR, parcel, arrayList4, iA, i);
            }
            return new EditableListItem(string, z, arrayList, string2, string3, string4, arrayList3, editableOptionsValueCreateFromParcel, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EditableListItem[i];
        }
    }

    public EditableListItem(String id10, boolean z, List list, String str, String title, String str2, ArrayList items, EditableOptionsValue editableOptionsValue, ArrayList itemSourceTemplates) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemSourceTemplates, "itemSourceTemplates");
        this.f63400a = id10;
        this.f63401b = z;
        this.f63402c = list;
        this.d = str;
        this.e = title;
        this.f = str2;
        this.f63403g = items;
        this.f63404h = editableOptionsValue;
        this.i = itemSourceTemplates;
    }

    public static EditableListItem d(EditableListItem editableListItem, ArrayList arrayList, EditableOptionsValue editableOptionsValue, int i) {
        String id10 = editableListItem.f63400a;
        boolean z = editableListItem.f63401b;
        List list = arrayList;
        if ((i & 4) != 0) {
            list = editableListItem.f63402c;
        }
        String str = editableListItem.d;
        String title = editableListItem.e;
        String str2 = editableListItem.f;
        ArrayList items = editableListItem.f63403g;
        ArrayList itemSourceTemplates = editableListItem.i;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemSourceTemplates, "itemSourceTemplates");
        return new EditableListItem(id10, z, list, str, title, str2, items, editableOptionsValue, itemSourceTemplates);
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63400a() {
        return this.f63400a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF63401b() {
        return this.f63401b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EditableListItem)) {
            return false;
        }
        EditableListItem editableListItem = (EditableListItem) obj2;
        return Intrinsics.f(this.f63400a, editableListItem.f63400a) && this.f63401b == editableListItem.f63401b && Intrinsics.f(this.f63402c, editableListItem.f63402c) && Intrinsics.f(this.d, editableListItem.d) && Intrinsics.f(this.e, editableListItem.e) && Intrinsics.f(this.f, editableListItem.f) && this.f63403g.equals(editableListItem.f63403g) && Intrinsics.f(this.f63404h, editableListItem.f63404h) && this.i.equals(editableListItem.i);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63400a;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f63400a.hashCode() * 31, 31, this.f63401b);
        List list = this.f63402c;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.d;
        int iC2 = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        String str2 = this.f;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f63403g, (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        EditableOptionsValue editableOptionsValue = this.f63404h;
        return this.i.hashCode() + ((iB + (editableOptionsValue != null ? editableOptionsValue.f63410a.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63400a);
        dest.writeInt(this.f63401b ? 1 : 0);
        List list = this.f63402c;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeParcelable((Parcelable) itQ.next(), i);
            }
        }
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        Iterator itY = j6.a.y(this.f63403g, dest);
        while (itY.hasNext()) {
            ((EditableOption) itY.next()).writeToParcel(dest, i);
        }
        EditableOptionsValue editableOptionsValue = this.f63404h;
        if (editableOptionsValue == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            editableOptionsValue.writeToParcel(dest, i);
        }
        Iterator itY2 = j6.a.y(this.i, dest);
        while (itY2.hasNext()) {
            ((ItemSourceTemplate) itY2.next()).writeToParcel(dest, i);
        }
    }
}
