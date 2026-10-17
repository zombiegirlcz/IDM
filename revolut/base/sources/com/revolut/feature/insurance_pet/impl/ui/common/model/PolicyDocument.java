package com.revolut.feature.insurance_pet.impl.ui.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import zw7.n;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/common/model/PolicyDocument;", "Landroid/os/Parcelable;", "<init>", "()V", "Pdf", "Text", "Custom", "ExternalLink", "Lcom/revolut/feature/insurance_pet/impl/ui/common/model/PolicyDocument$Custom;", "Lcom/revolut/feature/insurance_pet/impl/ui/common/model/PolicyDocument$ExternalLink;", "Lcom/revolut/feature/insurance_pet/impl/ui/common/model/PolicyDocument$Pdf;", "Lcom/revolut/feature/insurance_pet/impl/ui/common/model/PolicyDocument$Text;", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PolicyDocument implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/common/model/PolicyDocument$Custom;", "Lcom/revolut/feature/insurance_pet/impl/ui/common/model/PolicyDocument;", "", "toString", "()Ljava/lang/String;", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Custom extends PolicyDocument {

        @NotNull
        public static final Parcelable.Creator<Custom> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f76265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NaviCommand f76266b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Custom((Clause) parcel.readParcelable(Custom.class.getClassLoader()), (NaviCommand) parcel.readParcelable(Custom.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Custom[i];
            }
        }

        public Custom(Clause name, NaviCommand destination) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.f76265a = name;
            this.f76266b = destination;
        }

        @Override // com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Clause getF76273a() {
            return this.f76265a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Custom)) {
                return false;
            }
            Custom custom = (Custom) obj2;
            return Intrinsics.f(this.f76265a, custom.f76265a) && Intrinsics.f(this.f76266b, custom.f76266b);
        }

        public final int hashCode() {
            return this.f76266b.hashCode() + (this.f76265a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f76265a, i);
            dest.writeParcelable(this.f76266b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/common/model/PolicyDocument$ExternalLink;", "Lcom/revolut/feature/insurance_pet/impl/ui/common/model/PolicyDocument;", "", "toString", "()Ljava/lang/String;", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExternalLink extends PolicyDocument {

        @NotNull
        public static final Parcelable.Creator<ExternalLink> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f76267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f76268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f76269c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExternalLink((Clause) parcel.readParcelable(ExternalLink.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExternalLink[i];
            }
        }

        public ExternalLink(Clause name, String url2, boolean z) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f76267a = name;
            this.f76268b = url2;
            this.f76269c = z;
        }

        @Override // com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Clause getF76273a() {
            return this.f76267a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ExternalLink)) {
                return false;
            }
            ExternalLink externalLink = (ExternalLink) obj2;
            return Intrinsics.f(this.f76267a, externalLink.f76267a) && Intrinsics.f(this.f76268b, externalLink.f76268b) && this.f76269c == externalLink.f76269c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f76269c) + p.a.c(this.f76267a.hashCode() * 31, 31, this.f76268b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f76267a, i);
            dest.writeString(this.f76268b);
            dest.writeInt(this.f76269c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/common/model/PolicyDocument$Text;", "Lcom/revolut/feature/insurance_pet/impl/ui/common/model/PolicyDocument;", "", "toString", "()Ljava/lang/String;", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Text extends PolicyDocument {

        @NotNull
        public static final Parcelable.Creator<Text> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f76273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f76274b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Clause clause = (Clause) j6.a.f(parcel, "parcel", Text.class);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Text.class, parcel, arrayList, iE, 1);
                }
                return new Text(clause, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Text[i];
            }
        }

        public Text(Clause name, List paragraphs) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(paragraphs, "paragraphs");
            this.f76273a = name;
            this.f76274b = paragraphs;
        }

        @Override // com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Clause getF76273a() {
            return this.f76273a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Text)) {
                return false;
            }
            Text text = (Text) obj2;
            return Intrinsics.f(this.f76273a, text.f76273a) && Intrinsics.f(this.f76274b, text.f76274b);
        }

        public final int hashCode() {
            return this.f76274b.hashCode() + (this.f76273a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f76273a, i);
            Iterator itV = p.a.v(this.f76274b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    private PolicyDocument() {
    }

    /* JADX INFO: renamed from: a */
    public abstract Clause getF76273a();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/common/model/PolicyDocument$Pdf;", "Lcom/revolut/feature/insurance_pet/impl/ui/common/model/PolicyDocument;", "", "toString", "()Ljava/lang/String;", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pdf extends PolicyDocument {

        @NotNull
        public static final Parcelable.Creator<Pdf> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f76270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f76271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f76272c;
        public final n d;
        public final Integer e;
        public final LocalDate f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pdf((Clause) parcel.readParcelable(Pdf.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, n.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pdf[i];
            }
        }

        public Pdf(Clause name, String url2, boolean z, n documentType, Integer num, LocalDate localDate) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(url2, "url");
            Intrinsics.checkNotNullParameter(documentType, "documentType");
            this.f76270a = name;
            this.f76271b = url2;
            this.f76272c = z;
            this.d = documentType;
            this.e = num;
            this.f = localDate;
        }

        @Override // com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Clause getF76273a() {
            return this.f76270a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Pdf)) {
                return false;
            }
            Pdf pdf2 = (Pdf) obj2;
            return Intrinsics.f(this.f76270a, pdf2.f76270a) && Intrinsics.f(this.f76271b, pdf2.f76271b) && this.f76272c == pdf2.f76272c && this.d == pdf2.d && Intrinsics.f(this.e, pdf2.e) && Intrinsics.f(this.f, pdf2.f);
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + j6.a.c(p.a.c(this.f76270a.hashCode() * 31, 31, this.f76271b), 31, this.f76272c)) * 31;
            Integer num = this.e;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            LocalDate localDate = this.f;
            return iHashCode2 + (localDate != null ? localDate.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f76270a, i);
            dest.writeString(this.f76271b);
            dest.writeInt(this.f76272c ? 1 : 0);
            dest.writeString(this.d.name());
            Integer num = this.e;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            dest.writeSerializable(this.f);
        }

        public /* synthetic */ Pdf(TextLocalisedClause textLocalisedClause, String str, boolean z, n nVar) {
            this(textLocalisedClause, str, z, nVar, null, null);
        }
    }
}
