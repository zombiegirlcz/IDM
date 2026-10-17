package com.revolut.feature.be_driven_design.models.domain;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.db;
import com.revolut.shared.feature.selfserve.entity.config.api.models.Tag;
import fr2.i;
import fr2.k;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/revolut/feature/be_driven_design/models/domain/SectionContent;", "Landroid/os/Parcelable;", "<init>", "()V", "TextWidget", "CounterWidget", "TextWarningWidget", "ErrorWidget", "ProgressionSteps", "RestrictionCell", "FaqCell", "FundsCell", "TransactionCell", "ActionCell", "NumberedActionCell", "ButtonCell", "Lcom/revolut/feature/be_driven_design/models/domain/SectionContent$ActionCell;", "Lcom/revolut/feature/be_driven_design/models/domain/SectionContent$ButtonCell;", "Lcom/revolut/feature/be_driven_design/models/domain/SectionContent$CounterWidget;", "Lcom/revolut/feature/be_driven_design/models/domain/SectionContent$ErrorWidget;", "Lcom/revolut/feature/be_driven_design/models/domain/SectionContent$FaqCell;", "Lcom/revolut/feature/be_driven_design/models/domain/SectionContent$FundsCell;", "Lcom/revolut/feature/be_driven_design/models/domain/SectionContent$NumberedActionCell;", "Lcom/revolut/feature/be_driven_design/models/domain/SectionContent$ProgressionSteps;", "Lcom/revolut/feature/be_driven_design/models/domain/SectionContent$RestrictionCell;", "Lcom/revolut/feature/be_driven_design/models/domain/SectionContent$TextWarningWidget;", "Lcom/revolut/feature/be_driven_design/models/domain/SectionContent$TextWidget;", "Lcom/revolut/feature/be_driven_design/models/domain/SectionContent$TransactionCell;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SectionContent implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/be_driven_design/models/domain/SectionContent$ActionCell;", "Lcom/revolut/feature/be_driven_design/models/domain/SectionContent;", "", "toString", "()Ljava/lang/String;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ActionCell extends SectionContent {

        @NotNull
        public static final Parcelable.Creator<ActionCell> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f64158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final aal.a f64159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f64160c;
        public final String d;
        public final Integer e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ArrayList f64161g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                aal.a aVarValueOf = parcel.readInt() == 0 ? null : aal.a.valueOf(parcel.readString());
                String string = parcel.readString();
                String string2 = parcel.readString();
                Integer numValueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                String string3 = parcel.readString();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iA = 0;
                while (iA != i2) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Tag.CREATOR, parcel, arrayList, iA, 1);
                }
                return new ActionCell(i, aVarValueOf, string, string2, numValueOf, string3, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActionCell[i];
            }
        }

        public ActionCell(int i, aal.a aVar, String title, String str, Integer num, String deepLink, ArrayList tags) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deepLink, "deepLink");
            Intrinsics.checkNotNullParameter(tags, "tags");
            this.f64158a = i;
            this.f64159b = aVar;
            this.f64160c = title;
            this.d = str;
            this.e = num;
            this.f = deepLink;
            this.f64161g = tags;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ActionCell)) {
                return false;
            }
            ActionCell actionCell = (ActionCell) obj2;
            return this.f64158a == actionCell.f64158a && this.f64159b == actionCell.f64159b && Intrinsics.f(this.f64160c, actionCell.f64160c) && Intrinsics.f(this.d, actionCell.d) && Intrinsics.f(this.e, actionCell.e) && Intrinsics.f(this.f, actionCell.f) && this.f64161g.equals(actionCell.f64161g);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f64158a) * 31;
            aal.a aVar = this.f64159b;
            int iC = p.a.c((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f64160c);
            String str = this.d;
            int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.e;
            return this.f64161g.hashCode() + p.a.c((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f64158a);
            aal.a aVar = this.f64159b;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
            dest.writeString(this.f64160c);
            dest.writeString(this.d);
            Integer num = this.e;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            dest.writeString(this.f);
            Iterator itY = j6.a.y(this.f64161g, dest);
            while (itY.hasNext()) {
                ((Tag) itY.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/be_driven_design/models/domain/SectionContent$ButtonCell;", "Lcom/revolut/feature/be_driven_design/models/domain/SectionContent;", "", "toString", "()Ljava/lang/String;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ButtonCell extends SectionContent {

        @NotNull
        public static final Parcelable.Creator<ButtonCell> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f64163b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ButtonCell(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ButtonCell[i];
            }
        }

        public ButtonCell(String title, String deepLink) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deepLink, "deepLink");
            this.f64162a = title;
            this.f64163b = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ButtonCell)) {
                return false;
            }
            ButtonCell buttonCell = (ButtonCell) obj2;
            return Intrinsics.f(this.f64162a, buttonCell.f64162a) && Intrinsics.f(this.f64163b, buttonCell.f64163b);
        }

        public final int hashCode() {
            return this.f64163b.hashCode() + (this.f64162a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64162a);
            dest.writeString(this.f64163b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/be_driven_design/models/domain/SectionContent$CounterWidget;", "Lcom/revolut/feature/be_driven_design/models/domain/SectionContent;", "", "toString", "()Ljava/lang/String;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CounterWidget extends SectionContent {

        @NotNull
        public static final Parcelable.Creator<CounterWidget> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f64165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f64166c;
        public final Integer d;
        public final db e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CounterWidget(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? db.valueOf(parcel.readString()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CounterWidget[i];
            }
        }

        public CounterWidget(String title, String str, String counterValue, Integer num, db dbVar) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(counterValue, "counterValue");
            this.f64164a = title;
            this.f64165b = str;
            this.f64166c = counterValue;
            this.d = num;
            this.e = dbVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CounterWidget)) {
                return false;
            }
            CounterWidget counterWidget = (CounterWidget) obj2;
            return Intrinsics.f(this.f64164a, counterWidget.f64164a) && Intrinsics.f(this.f64165b, counterWidget.f64165b) && Intrinsics.f(this.f64166c, counterWidget.f64166c) && Intrinsics.f(this.d, counterWidget.d) && this.e == counterWidget.e;
        }

        public final int hashCode() {
            int iHashCode = this.f64164a.hashCode() * 31;
            String str = this.f64165b;
            int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f64166c);
            Integer num = this.d;
            int iHashCode2 = (iC + (num == null ? 0 : num.hashCode())) * 31;
            db dbVar = this.e;
            return iHashCode2 + (dbVar != null ? dbVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64164a);
            dest.writeString(this.f64165b);
            dest.writeString(this.f64166c);
            Integer num = this.d;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            db dbVar = this.e;
            if (dbVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(dbVar.name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/be_driven_design/models/domain/SectionContent$ErrorWidget;", "Lcom/revolut/feature/be_driven_design/models/domain/SectionContent;", "", "toString", "()Ljava/lang/String;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ErrorWidget extends SectionContent {

        @NotNull
        public static final Parcelable.Creator<ErrorWidget> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f64168b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f64169c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ErrorWidget(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ErrorWidget[i];
            }
        }

        public ErrorWidget(String image, String title, String str) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f64167a = image;
            this.f64168b = title;
            this.f64169c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ErrorWidget)) {
                return false;
            }
            ErrorWidget errorWidget = (ErrorWidget) obj2;
            return Intrinsics.f(this.f64167a, errorWidget.f64167a) && Intrinsics.f(this.f64168b, errorWidget.f64168b) && Intrinsics.f(this.f64169c, errorWidget.f64169c);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f64167a.hashCode() * 31, 31, this.f64168b);
            String str = this.f64169c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64167a);
            dest.writeString(this.f64168b);
            dest.writeString(this.f64169c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/be_driven_design/models/domain/SectionContent$FaqCell;", "Lcom/revolut/feature/be_driven_design/models/domain/SectionContent;", "", "toString", "()Ljava/lang/String;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FaqCell extends SectionContent {

        @NotNull
        public static final Parcelable.Creator<FaqCell> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f64171b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FaqCell(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FaqCell[i];
            }
        }

        public FaqCell(String title, String faqKey) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(faqKey, "faqKey");
            this.f64170a = title;
            this.f64171b = faqKey;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FaqCell)) {
                return false;
            }
            FaqCell faqCell = (FaqCell) obj2;
            return Intrinsics.f(this.f64170a, faqCell.f64170a) && Intrinsics.f(this.f64171b, faqCell.f64171b);
        }

        public final int hashCode() {
            return this.f64171b.hashCode() + (this.f64170a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64170a);
            dest.writeString(this.f64171b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/be_driven_design/models/domain/SectionContent$FundsCell;", "Lcom/revolut/feature/be_driven_design/models/domain/SectionContent;", "", "toString", "()Ljava/lang/String;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FundsCell extends SectionContent {

        @NotNull
        public static final Parcelable.Creator<FundsCell> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f64173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f64174c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FundsCell(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FundsCell[i];
            }
        }

        public FundsCell(String title, String amount, String str, String str2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.f64172a = title;
            this.f64173b = amount;
            this.f64174c = str;
            this.d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FundsCell)) {
                return false;
            }
            FundsCell fundsCell = (FundsCell) obj2;
            return Intrinsics.f(this.f64172a, fundsCell.f64172a) && Intrinsics.f(this.f64173b, fundsCell.f64173b) && Intrinsics.f(this.f64174c, fundsCell.f64174c) && Intrinsics.f(this.d, fundsCell.d);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f64172a.hashCode() * 31, 31, this.f64173b);
            String str = this.f64174c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64172a);
            dest.writeString(this.f64173b);
            dest.writeString(this.f64174c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/be_driven_design/models/domain/SectionContent$NumberedActionCell;", "Lcom/revolut/feature/be_driven_design/models/domain/SectionContent;", "", "toString", "()Ljava/lang/String;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NumberedActionCell extends SectionContent {

        @NotNull
        public static final Parcelable.Creator<NumberedActionCell> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f64175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final aal.a f64176b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f64177c;
        public final String d;
        public final Integer e;
        public final String f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NumberedActionCell(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : aal.a.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NumberedActionCell[i];
            }
        }

        public NumberedActionCell(Integer num, aal.a aVar, String title, String str, Integer num2, String deepLink) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deepLink, "deepLink");
            this.f64175a = num;
            this.f64176b = aVar;
            this.f64177c = title;
            this.d = str;
            this.e = num2;
            this.f = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NumberedActionCell)) {
                return false;
            }
            NumberedActionCell numberedActionCell = (NumberedActionCell) obj2;
            return Intrinsics.f(this.f64175a, numberedActionCell.f64175a) && this.f64176b == numberedActionCell.f64176b && Intrinsics.f(this.f64177c, numberedActionCell.f64177c) && Intrinsics.f(this.d, numberedActionCell.d) && Intrinsics.f(this.e, numberedActionCell.e) && Intrinsics.f(this.f, numberedActionCell.f);
        }

        public final int hashCode() {
            Integer num = this.f64175a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            aal.a aVar = this.f64176b;
            int iC = p.a.c((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f64177c);
            String str = this.d;
            int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Integer num2 = this.e;
            return this.f.hashCode() + ((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Integer num = this.f64175a;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            aal.a aVar = this.f64176b;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
            dest.writeString(this.f64177c);
            dest.writeString(this.d);
            Integer num2 = this.e;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num2);
            }
            dest.writeString(this.f);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/be_driven_design/models/domain/SectionContent$ProgressionSteps;", "Lcom/revolut/feature/be_driven_design/models/domain/SectionContent;", "", "toString", "()Ljava/lang/String;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProgressionSteps extends SectionContent {

        @NotNull
        public static final Parcelable.Creator<ProgressionSteps> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FincrimeHomeScreenHeaderAction f64179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f64180c;
        public final int d;
        public final k e;
        public final i f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                FincrimeHomeScreenHeaderAction fincrimeHomeScreenHeaderActionCreateFromParcel = parcel.readInt() == 0 ? null : FincrimeHomeScreenHeaderAction.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Step.CREATOR, parcel, arrayList, iA, 1);
                }
                return new ProgressionSteps(string, fincrimeHomeScreenHeaderActionCreateFromParcel, arrayList, parcel.readInt(), k.valueOf(parcel.readString()), parcel.readInt() != 0 ? i.valueOf(parcel.readString()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProgressionSteps[i];
            }
        }

        public ProgressionSteps(String headerTitle, FincrimeHomeScreenHeaderAction fincrimeHomeScreenHeaderAction, ArrayList steps, int i, k color, i iVar) {
            Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
            Intrinsics.checkNotNullParameter(steps, "steps");
            Intrinsics.checkNotNullParameter(color, "color");
            this.f64178a = headerTitle;
            this.f64179b = fincrimeHomeScreenHeaderAction;
            this.f64180c = steps;
            this.d = i;
            this.e = color;
            this.f = iVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProgressionSteps)) {
                return false;
            }
            ProgressionSteps progressionSteps = (ProgressionSteps) obj2;
            return Intrinsics.f(this.f64178a, progressionSteps.f64178a) && Intrinsics.f(this.f64179b, progressionSteps.f64179b) && this.f64180c.equals(progressionSteps.f64180c) && this.d == progressionSteps.d && this.e == progressionSteps.e && this.f == progressionSteps.f;
        }

        public final int hashCode() {
            int iHashCode = this.f64178a.hashCode() * 31;
            FincrimeHomeScreenHeaderAction fincrimeHomeScreenHeaderAction = this.f64179b;
            int iHashCode2 = (this.e.hashCode() + j6.a.b(this.d, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f64180c, (iHashCode + (fincrimeHomeScreenHeaderAction == null ? 0 : fincrimeHomeScreenHeaderAction.hashCode())) * 31, 31), 31)) * 31;
            i iVar = this.f;
            return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64178a);
            FincrimeHomeScreenHeaderAction fincrimeHomeScreenHeaderAction = this.f64179b;
            if (fincrimeHomeScreenHeaderAction == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fincrimeHomeScreenHeaderAction.writeToParcel(dest, i);
            }
            Iterator itY = j6.a.y(this.f64180c, dest);
            while (itY.hasNext()) {
                ((Step) itY.next()).writeToParcel(dest, i);
            }
            dest.writeInt(this.d);
            dest.writeString(this.e.name());
            i iVar = this.f;
            if (iVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(iVar.name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/be_driven_design/models/domain/SectionContent$RestrictionCell;", "Lcom/revolut/feature/be_driven_design/models/domain/SectionContent;", "", "toString", "()Ljava/lang/String;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RestrictionCell extends SectionContent {

        @NotNull
        public static final Parcelable.Creator<RestrictionCell> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f64182b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RestrictionCell(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RestrictionCell[i];
            }
        }

        public RestrictionCell(String title, Integer num) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f64181a = title;
            this.f64182b = num;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RestrictionCell)) {
                return false;
            }
            RestrictionCell restrictionCell = (RestrictionCell) obj2;
            return Intrinsics.f(this.f64181a, restrictionCell.f64181a) && Intrinsics.f(this.f64182b, restrictionCell.f64182b);
        }

        public final int hashCode() {
            int iHashCode = this.f64181a.hashCode() * 31;
            Integer num = this.f64182b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64181a);
            Integer num = this.f64182b;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/be_driven_design/models/domain/SectionContent$TextWarningWidget;", "Lcom/revolut/feature/be_driven_design/models/domain/SectionContent;", "", "toString", "()Ljava/lang/String;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TextWarningWidget extends SectionContent {

        @NotNull
        public static final Parcelable.Creator<TextWarningWidget> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f64184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f64185c;
        public final String d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TextWarningWidget(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TextWarningWidget[i];
            }
        }

        public TextWarningWidget(String title, Integer num, String text, String str, String str2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(text, "text");
            this.f64183a = title;
            this.f64184b = text;
            this.f64185c = num;
            this.d = str;
            this.e = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TextWarningWidget)) {
                return false;
            }
            TextWarningWidget textWarningWidget = (TextWarningWidget) obj2;
            return Intrinsics.f(this.f64183a, textWarningWidget.f64183a) && Intrinsics.f(this.f64184b, textWarningWidget.f64184b) && Intrinsics.f(this.f64185c, textWarningWidget.f64185c) && Intrinsics.f(this.d, textWarningWidget.d) && Intrinsics.f(this.e, textWarningWidget.e);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f64183a.hashCode() * 31, 31, this.f64184b);
            Integer num = this.f64185c;
            int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.d;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64183a);
            dest.writeString(this.f64184b);
            Integer num = this.f64185c;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            dest.writeString(this.d);
            dest.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/be_driven_design/models/domain/SectionContent$TextWidget;", "Lcom/revolut/feature/be_driven_design/models/domain/SectionContent;", "", "toString", "()Ljava/lang/String;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TextWidget extends SectionContent {

        @NotNull
        public static final Parcelable.Creator<TextWidget> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f64187b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TextWidget(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TextWidget[i];
            }
        }

        public TextWidget(String str, String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f64186a = str;
            this.f64187b = text;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TextWidget)) {
                return false;
            }
            TextWidget textWidget = (TextWidget) obj2;
            return Intrinsics.f(this.f64186a, textWidget.f64186a) && Intrinsics.f(this.f64187b, textWidget.f64187b);
        }

        public final int hashCode() {
            String str = this.f64186a;
            return this.f64187b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64186a);
            dest.writeString(this.f64187b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/be_driven_design/models/domain/SectionContent$TransactionCell;", "Lcom/revolut/feature/be_driven_design/models/domain/SectionContent;", "", "toString", "()Ljava/lang/String;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionCell extends SectionContent {

        @NotNull
        public static final Parcelable.Creator<TransactionCell> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final zvl.a f64189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f64190c;
        public final aal.a d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final TransactionStatus f64191g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f64192h;
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f64193j;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionCell(parcel.readString(), parcel.readInt() == 0 ? null : zvl.a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : aal.a.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? TransactionStatus.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionCell[i];
            }
        }

        public TransactionCell(String str, zvl.a aVar, Integer num, aal.a aVar2, String title, String str2, TransactionStatus transactionStatus, String amount, String str3, String str4) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.f64188a = str;
            this.f64189b = aVar;
            this.f64190c = num;
            this.d = aVar2;
            this.e = title;
            this.f = str2;
            this.f64191g = transactionStatus;
            this.f64192h = amount;
            this.i = str3;
            this.f64193j = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TransactionCell)) {
                return false;
            }
            TransactionCell transactionCell = (TransactionCell) obj2;
            return Intrinsics.f(this.f64188a, transactionCell.f64188a) && this.f64189b == transactionCell.f64189b && Intrinsics.f(this.f64190c, transactionCell.f64190c) && this.d == transactionCell.d && Intrinsics.f(this.e, transactionCell.e) && Intrinsics.f(this.f, transactionCell.f) && Intrinsics.f(this.f64191g, transactionCell.f64191g) && Intrinsics.f(this.f64192h, transactionCell.f64192h) && Intrinsics.f(this.i, transactionCell.i) && Intrinsics.f(this.f64193j, transactionCell.f64193j);
        }

        public final int hashCode() {
            String str = this.f64188a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            zvl.a aVar = this.f64189b;
            int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            Integer num = this.f64190c;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            aal.a aVar2 = this.d;
            int iC = p.a.c((iHashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, 31, this.e);
            String str2 = this.f;
            int iHashCode4 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            TransactionStatus transactionStatus = this.f64191g;
            int iC2 = p.a.c((iHashCode4 + (transactionStatus == null ? 0 : transactionStatus.hashCode())) * 31, 31, this.f64192h);
            String str3 = this.i;
            int iHashCode5 = (iC2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f64193j;
            return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64188a);
            zvl.a aVar = this.f64189b;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
            Integer num = this.f64190c;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            aal.a aVar2 = this.d;
            if (aVar2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar2.name());
            }
            dest.writeString(this.e);
            dest.writeString(this.f);
            TransactionStatus transactionStatus = this.f64191g;
            if (transactionStatus == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transactionStatus.writeToParcel(dest, i);
            }
            dest.writeString(this.f64192h);
            dest.writeString(this.i);
            dest.writeString(this.f64193j);
        }
    }

    private SectionContent() {
    }
}
