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
import xl2.b0;
import xl2.h0;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SelectionItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "Lxl2/b0;", "Lxl2/h0;", "<init>", "()V", "Option", "Label", "CustomOption", "CustomAnswer", "Group", "Lcom/revolut/feature/backend_flow/domain/models/MultiSelectionItem;", "Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SelectionItem implements InputItem, b0, h0 {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SelectionItem$CustomAnswer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomAnswer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CustomAnswer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f63608b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomAnswer(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustomAnswer[i];
            }
        }

        public CustomAnswer(String str, boolean z) {
            this.f63607a = str;
            this.f63608b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CustomAnswer)) {
                return false;
            }
            CustomAnswer customAnswer = (CustomAnswer) obj2;
            return Intrinsics.f(this.f63607a, customAnswer.f63607a) && this.f63608b == customAnswer.f63608b;
        }

        public final int hashCode() {
            String str = this.f63607a;
            return Boolean.hashCode(this.f63608b) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63607a);
            dest.writeInt(this.f63608b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SelectionItem$CustomOption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomOption implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CustomOption> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f63610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f63611c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(CustomOption.class, parcel, arrayList, iE, 1);
                }
                return new CustomOption(string, string2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustomOption[i];
            }
        }

        public CustomOption(String id10, String hint, List validations) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(hint, "hint");
            Intrinsics.checkNotNullParameter(validations, "validations");
            this.f63609a = id10;
            this.f63610b = hint;
            this.f63611c = validations;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CustomOption)) {
                return false;
            }
            CustomOption customOption = (CustomOption) obj2;
            return Intrinsics.f(this.f63609a, customOption.f63609a) && Intrinsics.f(this.f63610b, customOption.f63610b) && Intrinsics.f(this.f63611c, customOption.f63611c);
        }

        public final int hashCode() {
            return this.f63611c.hashCode() + p.a.c(this.f63609a.hashCode() * 31, 31, this.f63610b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63609a);
            dest.writeString(this.f63610b);
            Iterator itV = p.a.v(this.f63611c, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SelectionItem$Group;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Group implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Group> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f63613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set f63614c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iA = 0;
                while (iA != i) {
                    iA = o.a(parcel, linkedHashSet, iA, 1);
                }
                return new Group(string, string2, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Group[i];
            }
        }

        public Group(String id10, String str, Set optionIds) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(optionIds, "optionIds");
            this.f63612a = id10;
            this.f63613b = str;
            this.f63614c = optionIds;
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
            return Intrinsics.f(this.f63612a, group.f63612a) && Intrinsics.f(this.f63613b, group.f63613b) && Intrinsics.f(this.f63614c, group.f63614c);
        }

        public final int hashCode() {
            int iHashCode = this.f63612a.hashCode() * 31;
            String str = this.f63613b;
            return this.f63614c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63612a);
            dest.writeString(this.f63613b);
            Iterator itV = n.v(this.f63614c, dest);
            while (itV.hasNext()) {
                dest.writeString((String) itV.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SelectionItem$Label;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Label implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Label> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BackendFlowIcon f63616b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Label(parcel.readString(), (BackendFlowIcon) parcel.readParcelable(Label.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Label[i];
            }
        }

        public Label(String title, BackendFlowIcon icon) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.f63615a = title;
            this.f63616b = icon;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Label)) {
                return false;
            }
            Label label = (Label) obj2;
            return Intrinsics.f(this.f63615a, label.f63615a) && Intrinsics.f(this.f63616b, label.f63616b);
        }

        public final int hashCode() {
            return this.f63616b.hashCode() + (this.f63615a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63615a);
            dest.writeParcelable(this.f63616b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SelectionItem$Option;", "Landroid/os/Parcelable;", "Image", "WithTitle", "WithLabels", "Lcom/revolut/feature/backend_flow/domain/models/SelectionItem$Option$WithLabels;", "Lcom/revolut/feature/backend_flow/domain/models/SelectionItem$Option$WithTitle;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Option extends Parcelable {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SelectionItem$Option$Image;", "Landroid/os/Parcelable;", "Asset", "Icon", "Lcom/revolut/feature/backend_flow/domain/models/SelectionItem$Option$Image$Asset;", "Lcom/revolut/feature/backend_flow/domain/models/SelectionItem$Option$Image$Icon;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface Image extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SelectionItem$Option$Image$Asset;", "Lcom/revolut/feature/backend_flow/domain/models/SelectionItem$Option$Image;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Asset implements Image {

                @NotNull
                public static final Parcelable.Creator<Asset> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f63617a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Asset(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Asset[i];
                    }
                }

                public Asset(String assetUrl) {
                    Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
                    this.f63617a = assetUrl;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Asset) && Intrinsics.f(this.f63617a, ((Asset) obj2).f63617a);
                }

                public final int hashCode() {
                    return this.f63617a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f63617a);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SelectionItem$Option$Image$Icon;", "Lcom/revolut/feature/backend_flow/domain/models/SelectionItem$Option$Image;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Icon implements Image {

                @NotNull
                public static final Parcelable.Creator<Icon> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BackendFlowIcon f63618a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Icon((BackendFlowIcon) parcel.readParcelable(Icon.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Icon[i];
                    }
                }

                public Icon(BackendFlowIcon icon) {
                    Intrinsics.checkNotNullParameter(icon, "icon");
                    this.f63618a = icon;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Icon) && Intrinsics.f(this.f63618a, ((Icon) obj2).f63618a);
                }

                public final int hashCode() {
                    return this.f63618a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f63618a, i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SelectionItem$Option$WithLabels;", "Lcom/revolut/feature/backend_flow/domain/models/SelectionItem$Option;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class WithLabels implements Option {

            @NotNull
            public static final Parcelable.Creator<WithLabels> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f63619a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Image.Asset f63620b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ArrayList f63621c;
            public final boolean d;
            public final boolean e;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    Image.Asset assetCreateFromParcel = parcel.readInt() == 0 ? null : Image.Asset.CREATOR.createFromParcel(parcel);
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iA = 0;
                    while (true) {
                        if (iA == i) {
                            break;
                        }
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(Label.CREATOR, parcel, arrayList, iA, 1);
                    }
                    return new WithLabels(string, assetCreateFromParcel, arrayList, parcel.readInt() != 0, parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new WithLabels[i];
                }
            }

            public WithLabels(String id10, Image.Asset asset, ArrayList labels, boolean z, boolean z3) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(labels, "labels");
                this.f63619a = id10;
                this.f63620b = asset;
                this.f63621c = labels;
                this.d = z;
                this.e = z3;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof WithLabels)) {
                    return false;
                }
                WithLabels withLabels = (WithLabels) obj2;
                return Intrinsics.f(this.f63619a, withLabels.f63619a) && Intrinsics.f(this.f63620b, withLabels.f63620b) && this.f63621c.equals(withLabels.f63621c) && this.d == withLabels.d && this.e == withLabels.e;
            }

            @Override // com.revolut.feature.backend_flow.domain.models.SelectionItem.Option
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF63622a() {
                return this.f63619a;
            }

            public final int hashCode() {
                int iHashCode = this.f63619a.hashCode() * 31;
                Image.Asset asset = this.f63620b;
                return Boolean.hashCode(this.e) + j6.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f63621c, (iHashCode + (asset == null ? 0 : asset.f63617a.hashCode())) * 31, 31), 31, this.d);
            }

            @Override // com.revolut.feature.backend_flow.domain.models.SelectionItem.Option
            /* JADX INFO: renamed from: w6, reason: from getter */
            public final boolean getE() {
                return this.d;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f63619a);
                Image.Asset asset = this.f63620b;
                if (asset == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    asset.writeToParcel(dest, i);
                }
                Iterator itY = j6.a.y(this.f63621c, dest);
                while (itY.hasNext()) {
                    ((Label) itY.next()).writeToParcel(dest, i);
                }
                dest.writeInt(this.d ? 1 : 0);
                dest.writeInt(this.e ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SelectionItem$Option$WithTitle;", "Lcom/revolut/feature/backend_flow/domain/models/SelectionItem$Option;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class WithTitle implements Option {

            @NotNull
            public static final Parcelable.Creator<WithTitle> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f63622a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Image f63623b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f63624c;
            public final HtmlStringItem d;
            public final boolean e;
            public final boolean f;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    boolean z;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    Image image = (Image) parcel.readParcelable(WithTitle.class.getClassLoader());
                    String string2 = parcel.readString();
                    HtmlStringItem htmlStringItemCreateFromParcel = parcel.readInt() == 0 ? null : HtmlStringItem.CREATOR.createFromParcel(parcel);
                    boolean z3 = false;
                    if (parcel.readInt() != 0) {
                        z = false;
                        z3 = true;
                    } else {
                        z = false;
                    }
                    return new WithTitle(string, image, string2, htmlStringItemCreateFromParcel, z3, parcel.readInt() == 0 ? z : true);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new WithTitle[i];
                }
            }

            public WithTitle(String id10, Image image, String title, HtmlStringItem htmlStringItem, boolean z, boolean z3) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                this.f63622a = id10;
                this.f63623b = image;
                this.f63624c = title;
                this.d = htmlStringItem;
                this.e = z;
                this.f = z3;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof WithTitle)) {
                    return false;
                }
                WithTitle withTitle = (WithTitle) obj2;
                return Intrinsics.f(this.f63622a, withTitle.f63622a) && Intrinsics.f(this.f63623b, withTitle.f63623b) && Intrinsics.f(this.f63624c, withTitle.f63624c) && Intrinsics.f(this.d, withTitle.d) && this.e == withTitle.e && this.f == withTitle.f;
            }

            @Override // com.revolut.feature.backend_flow.domain.models.SelectionItem.Option
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF63622a() {
                return this.f63622a;
            }

            public final int hashCode() {
                int iHashCode = this.f63622a.hashCode() * 31;
                Image image = this.f63623b;
                int iC = p.a.c((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f63624c);
                HtmlStringItem htmlStringItem = this.d;
                return Boolean.hashCode(this.f) + j6.a.c((iC + (htmlStringItem != null ? htmlStringItem.hashCode() : 0)) * 31, 31, this.e);
            }

            @Override // com.revolut.feature.backend_flow.domain.models.SelectionItem.Option
            /* JADX INFO: renamed from: w6, reason: from getter */
            public final boolean getE() {
                return this.e;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f63622a);
                dest.writeParcelable(this.f63623b, i);
                dest.writeString(this.f63624c);
                HtmlStringItem htmlStringItem = this.d;
                if (htmlStringItem == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    htmlStringItem.writeToParcel(dest, i);
                }
                dest.writeInt(this.e ? 1 : 0);
                dest.writeInt(this.f ? 1 : 0);
            }
        }

        /* JADX INFO: renamed from: getId */
        String getF63622a();

        /* JADX INFO: renamed from: w6 */
        boolean getE();
    }

    private SelectionItem() {
    }

    public abstract CustomAnswer J();

    public abstract CustomOption T();

    public abstract List W();

    @Override // xl2.h0
    public final String getValue() {
        CustomAnswer customAnswerJ = J();
        if (customAnswerJ != null) {
            return customAnswerJ.f63607a;
        }
        return null;
    }

    @Override // xl2.b0
    public final int j() {
        return W().size();
    }

    public abstract Set p4();

    @Override // xl2.h0
    public final List z() {
        CustomOption customOptionT = T();
        List list = customOptionT != null ? customOptionT.f63611c : null;
        return list == null ? f0.f322471a : list;
    }
}
