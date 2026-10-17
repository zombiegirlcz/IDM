package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.backend_flow.domain.models.SelectionItem;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/MultiSelectionItem;", "Lcom/revolut/feature/backend_flow/domain/models/SelectionItem;", "", "toString", "()Ljava/lang/String;", "NoneApplyOption", "AllApplyOption", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultiSelectionItem extends SelectionItem {

    @NotNull
    public static final Parcelable.Creator<MultiSelectionItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f63543c;
    public final String d;
    public final SelectionItem.CustomOption e;
    public final SelectionItem.CustomAnswer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f63544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f63545h;
    public final NoneApplyOption i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AllApplyOption f63546j;
    public final Boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ValidationResult f63547l;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/MultiSelectionItem$AllApplyOption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AllApplyOption implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<AllApplyOption> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f63549b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AllApplyOption(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AllApplyOption[i];
            }
        }

        public AllApplyOption(String id10, String title) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f63548a = id10;
            this.f63549b = title;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AllApplyOption)) {
                return false;
            }
            AllApplyOption allApplyOption = (AllApplyOption) obj2;
            return Intrinsics.f(this.f63548a, allApplyOption.f63548a) && Intrinsics.f(this.f63549b, allApplyOption.f63549b);
        }

        public final int hashCode() {
            return this.f63549b.hashCode() + (this.f63548a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63548a);
            dest.writeString(this.f63549b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/MultiSelectionItem$NoneApplyOption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NoneApplyOption implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<NoneApplyOption> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f63551b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NoneApplyOption(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoneApplyOption[i];
            }
        }

        public NoneApplyOption(String id10, String title) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f63550a = id10;
            this.f63551b = title;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NoneApplyOption)) {
                return false;
            }
            NoneApplyOption noneApplyOption = (NoneApplyOption) obj2;
            return Intrinsics.f(this.f63550a, noneApplyOption.f63550a) && Intrinsics.f(this.f63551b, noneApplyOption.f63551b);
        }

        public final int hashCode() {
            return this.f63551b.hashCode() + (this.f63550a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63550a);
            dest.writeString(this.f63551b);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(MultiSelectionItem.class, parcel, arrayList, iE, 1);
            }
            String string2 = parcel.readString();
            SelectionItem.CustomOption customOptionCreateFromParcel = parcel.readInt() == 0 ? null : SelectionItem.CustomOption.CREATOR.createFromParcel(parcel);
            SelectionItem.CustomAnswer customAnswerCreateFromParcel = parcel.readInt() == 0 ? null : SelectionItem.CustomAnswer.CREATOR.createFromParcel(parcel);
            int i2 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
            int iA = 0;
            while (iA != i2) {
                iA = o.a(parcel, linkedHashSet, iA, 1);
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            int iA2 = 0;
            while (iA2 != i3) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(SelectionItem.Group.CREATOR, parcel, arrayList2, iA2, 1);
            }
            NoneApplyOption noneApplyOptionCreateFromParcel = parcel.readInt() == 0 ? null : NoneApplyOption.CREATOR.createFromParcel(parcel);
            AllApplyOption allApplyOptionCreateFromParcel = parcel.readInt() == 0 ? null : AllApplyOption.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MultiSelectionItem(string, z, arrayList, string2, customOptionCreateFromParcel, customAnswerCreateFromParcel, linkedHashSet, arrayList2, noneApplyOptionCreateFromParcel, allApplyOptionCreateFromParcel, boolValueOf, (ValidationResult) parcel.readParcelable(MultiSelectionItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MultiSelectionItem[i];
        }
    }

    public MultiSelectionItem(String id10, boolean z, List options, String str, SelectionItem.CustomOption customOption, SelectionItem.CustomAnswer customAnswer, Set selected, List groups, NoneApplyOption noneApplyOption, AllApplyOption allApplyOption, Boolean bool, ValidationResult validationResult) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.f63541a = id10;
        this.f63542b = z;
        this.f63543c = options;
        this.d = str;
        this.e = customOption;
        this.f = customAnswer;
        this.f63544g = selected;
        this.f63545h = groups;
        this.i = noneApplyOption;
        this.f63546j = allApplyOption;
        this.k = bool;
        this.f63547l = validationResult;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.SelectionItem
    /* JADX INFO: renamed from: J, reason: from getter */
    public final SelectionItem.CustomAnswer getF() {
        return this.f;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.SelectionItem
    /* JADX INFO: renamed from: T, reason: from getter */
    public final SelectionItem.CustomOption getE() {
        return this.e;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.SelectionItem
    /* JADX INFO: renamed from: W, reason: from getter */
    public final List getF63543c() {
        return this.f63543c;
    }

    @Override // xl2.h0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ValidationResult getF63547l() {
        return this.f63547l;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63541a() {
        return this.f63541a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF63542b() {
        return this.f63542b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MultiSelectionItem)) {
            return false;
        }
        MultiSelectionItem multiSelectionItem = (MultiSelectionItem) obj2;
        return Intrinsics.f(this.f63541a, multiSelectionItem.f63541a) && this.f63542b == multiSelectionItem.f63542b && Intrinsics.f(this.f63543c, multiSelectionItem.f63543c) && Intrinsics.f(this.d, multiSelectionItem.d) && Intrinsics.f(this.e, multiSelectionItem.e) && Intrinsics.f(this.f, multiSelectionItem.f) && Intrinsics.f(this.f63544g, multiSelectionItem.f63544g) && Intrinsics.f(this.f63545h, multiSelectionItem.f63545h) && Intrinsics.f(this.i, multiSelectionItem.i) && Intrinsics.f(this.f63546j, multiSelectionItem.f63546j) && Intrinsics.f(this.k, multiSelectionItem.k) && Intrinsics.f(this.f63547l, multiSelectionItem.f63547l);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63541a;
    }

    public final int hashCode() {
        int iD = p.a.d(j6.a.c(this.f63541a.hashCode() * 31, 31, this.f63542b), 31, this.f63543c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        SelectionItem.CustomOption customOption = this.e;
        int iHashCode2 = (iHashCode + (customOption == null ? 0 : customOption.hashCode())) * 31;
        SelectionItem.CustomAnswer customAnswer = this.f;
        int iD2 = p.a.d(p.a.f((iHashCode2 + (customAnswer == null ? 0 : customAnswer.hashCode())) * 31, 31, this.f63544g), 31, this.f63545h);
        NoneApplyOption noneApplyOption = this.i;
        int iHashCode3 = (iD2 + (noneApplyOption == null ? 0 : noneApplyOption.hashCode())) * 31;
        AllApplyOption allApplyOption = this.f63546j;
        int iHashCode4 = (iHashCode3 + (allApplyOption == null ? 0 : allApplyOption.hashCode())) * 31;
        Boolean bool = this.k;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        ValidationResult validationResult = this.f63547l;
        return iHashCode5 + (validationResult != null ? validationResult.hashCode() : 0);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.SelectionItem
    /* JADX INFO: renamed from: p4, reason: from getter */
    public final Set getF63544g() {
        return this.f63544g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63541a);
        dest.writeInt(this.f63542b ? 1 : 0);
        Iterator itV = p.a.v(this.f63543c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeString(this.d);
        SelectionItem.CustomOption customOption = this.e;
        if (customOption == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            customOption.writeToParcel(dest, i);
        }
        SelectionItem.CustomAnswer customAnswer = this.f;
        if (customAnswer == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            customAnswer.writeToParcel(dest, i);
        }
        Iterator itV2 = n.v(this.f63544g, dest);
        while (itV2.hasNext()) {
            dest.writeString((String) itV2.next());
        }
        Iterator itV3 = p.a.v(this.f63545h, dest);
        while (itV3.hasNext()) {
            ((SelectionItem.Group) itV3.next()).writeToParcel(dest, i);
        }
        NoneApplyOption noneApplyOption = this.i;
        if (noneApplyOption == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            noneApplyOption.writeToParcel(dest, i);
        }
        AllApplyOption allApplyOption = this.f63546j;
        if (allApplyOption == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            allApplyOption.writeToParcel(dest, i);
        }
        Boolean bool = this.k;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        dest.writeParcelable(this.f63547l, i);
    }
}
