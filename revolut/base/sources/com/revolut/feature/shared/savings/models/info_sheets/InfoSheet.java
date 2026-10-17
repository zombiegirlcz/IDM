package com.revolut.feature.shared.savings.models.info_sheets;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Section", "Action", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InfoSheet implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InfoSheet> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f86471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f86472c;
    public final ArrayList d;
    public final ArrayList e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Action;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Action implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Action> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86474b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Action(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Action[i];
            }
        }

        public Action(String name, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f86473a = name;
            this.f86474b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Action)) {
                return false;
            }
            Action action = (Action) obj2;
            return Intrinsics.f(this.f86473a, action.f86473a) && Intrinsics.f(this.f86474b, action.f86474b);
        }

        public final int hashCode() {
            int iHashCode = this.f86473a.hashCode() * 31;
            String str = this.f86474b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86473a);
            dest.writeString(this.f86474b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0007\u0005\u0006\u0007\b\t\n\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Header", "Item", "PlainText", "Row", "CellDetails", "CellProgress", "PieChart", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Section implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Section> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Header f86475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f86476b;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section$CellDetails;", "Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section$Item;", "", "toString", "()Ljava/lang/String;", "Value", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CellDetails implements Item {

            @NotNull
            public static final Parcelable.Creator<CellDetails> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f86477a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Value f86478b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f86479c;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section$CellDetails$Value;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Value implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<Value> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f86480a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final mcd.a f86481b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final StyledText f86482c;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Value(parcel.readString(), parcel.readInt() == 0 ? null : mcd.a.valueOf(parcel.readString()), parcel.readInt() != 0 ? StyledText.CREATOR.createFromParcel(parcel) : null);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Value[i];
                    }
                }

                public Value(String text, mcd.a aVar, StyledText styledText) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    this.f86480a = text;
                    this.f86481b = aVar;
                    this.f86482c = styledText;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Value)) {
                        return false;
                    }
                    Value value = (Value) obj2;
                    return Intrinsics.f(this.f86480a, value.f86480a) && this.f86481b == value.f86481b && Intrinsics.f(this.f86482c, value.f86482c);
                }

                public final int hashCode() {
                    int iHashCode = this.f86480a.hashCode() * 31;
                    mcd.a aVar = this.f86481b;
                    int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                    StyledText styledText = this.f86482c;
                    return iHashCode2 + (styledText != null ? styledText.hashCode() : 0);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f86480a);
                    mcd.a aVar = this.f86481b;
                    if (aVar == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        dest.writeString(aVar.name());
                    }
                    StyledText styledText = this.f86482c;
                    if (styledText == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        styledText.writeToParcel(dest, i);
                    }
                }
            }

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CellDetails(parcel.readString(), Value.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CellDetails[i];
                }
            }

            public CellDetails(String title, Value value, String str) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(value, "value");
                this.f86477a = title;
                this.f86478b = value;
                this.f86479c = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof CellDetails)) {
                    return false;
                }
                CellDetails cellDetails = (CellDetails) obj2;
                return Intrinsics.f(this.f86477a, cellDetails.f86477a) && Intrinsics.f(this.f86478b, cellDetails.f86478b) && Intrinsics.f(this.f86479c, cellDetails.f86479c);
            }

            public final int hashCode() {
                int iHashCode = (this.f86478b.hashCode() + (this.f86477a.hashCode() * 31)) * 31;
                String str = this.f86479c;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f86477a);
                this.f86478b.writeToParcel(dest, i);
                dest.writeString(this.f86479c);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section$CellProgress;", "Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section$Item;", "", "toString", "()Ljava/lang/String;", "Value", "Progress", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CellProgress implements Item {

            @NotNull
            public static final Parcelable.Creator<CellProgress> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f86483a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Progress f86484b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Value f86485c;
            public final String d;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section$CellProgress$Progress;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Progress implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<Progress> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f86486a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f86487b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final mcd.a f86488c;
                public final mcd.a d;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Progress(parcel.readInt(), parcel.readInt(), mcd.a.valueOf(parcel.readString()), mcd.a.valueOf(parcel.readString()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Progress[i];
                    }
                }

                public Progress(int i, int i2, mcd.a backgroundColor, mcd.a progressColor) {
                    Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                    Intrinsics.checkNotNullParameter(progressColor, "progressColor");
                    this.f86486a = i;
                    this.f86487b = i2;
                    this.f86488c = backgroundColor;
                    this.d = progressColor;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Progress)) {
                        return false;
                    }
                    Progress progress = (Progress) obj2;
                    return this.f86486a == progress.f86486a && this.f86487b == progress.f86487b && this.f86488c == progress.f86488c && this.d == progress.d;
                }

                public final int hashCode() {
                    return this.d.hashCode() + ((this.f86488c.hashCode() + j6.a.b(this.f86487b, Integer.hashCode(this.f86486a) * 31, 31)) * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(this.f86486a);
                    dest.writeInt(this.f86487b);
                    dest.writeString(this.f86488c.name());
                    dest.writeString(this.d.name());
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section$CellProgress$Value;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Value implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<Value> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f86489a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final mcd.a f86490b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Value(parcel.readString(), parcel.readInt() == 0 ? null : mcd.a.valueOf(parcel.readString()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Value[i];
                    }
                }

                public Value(String text, mcd.a aVar) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    this.f86489a = text;
                    this.f86490b = aVar;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Value)) {
                        return false;
                    }
                    Value value = (Value) obj2;
                    return Intrinsics.f(this.f86489a, value.f86489a) && this.f86490b == value.f86490b;
                }

                public final int hashCode() {
                    int iHashCode = this.f86489a.hashCode() * 31;
                    mcd.a aVar = this.f86490b;
                    return iHashCode + (aVar == null ? 0 : aVar.hashCode());
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f86489a);
                    mcd.a aVar = this.f86490b;
                    if (aVar == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        dest.writeString(aVar.name());
                    }
                }
            }

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CellProgress(parcel.readString(), Progress.CREATOR.createFromParcel(parcel), Value.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CellProgress[i];
                }
            }

            public CellProgress(String title, Progress progress, Value value, String str) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(progress, "progress");
                Intrinsics.checkNotNullParameter(value, "value");
                this.f86483a = title;
                this.f86484b = progress;
                this.f86485c = value;
                this.d = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof CellProgress)) {
                    return false;
                }
                CellProgress cellProgress = (CellProgress) obj2;
                return Intrinsics.f(this.f86483a, cellProgress.f86483a) && Intrinsics.f(this.f86484b, cellProgress.f86484b) && Intrinsics.f(this.f86485c, cellProgress.f86485c) && Intrinsics.f(this.d, cellProgress.d);
            }

            public final int hashCode() {
                int iHashCode = (this.f86485c.hashCode() + ((this.f86484b.hashCode() + (this.f86483a.hashCode() * 31)) * 31)) * 31;
                String str = this.d;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f86483a);
                this.f86484b.writeToParcel(dest, i);
                this.f86485c.writeToParcel(dest, i);
                dest.writeString(this.d);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section$Header;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Header implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Header> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f86491a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f86492b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f86493c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Header(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Header[i];
                }
            }

            public Header(String title, String str, String str2) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.f86491a = title;
                this.f86492b = str;
                this.f86493c = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Header)) {
                    return false;
                }
                Header header = (Header) obj2;
                return Intrinsics.f(this.f86491a, header.f86491a) && Intrinsics.f(this.f86492b, header.f86492b) && Intrinsics.f(this.f86493c, header.f86493c);
            }

            public final int hashCode() {
                int iHashCode = this.f86491a.hashCode() * 31;
                String str = this.f86492b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f86493c;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f86491a);
                dest.writeString(this.f86492b);
                dest.writeString(this.f86493c);
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001\u0082\u0001\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section$Item;", "Landroid/os/Parcelable;", "Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section$CellDetails;", "Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section$CellProgress;", "Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section$PieChart;", "Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section$PlainText;", "Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section$Row;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface Item extends Parcelable {
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section$PieChart;", "Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section$Item;", "", "toString", "()Ljava/lang/String;", "Slice", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PieChart implements Item {

            @NotNull
            public static final Parcelable.Creator<PieChart> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ArrayList f86494a;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section$PieChart$Slice;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Slice implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<Slice> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f86495a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final mcd.a f86496b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f86497c;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Slice(parcel.readInt(), mcd.a.valueOf(parcel.readString()), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Slice[i];
                    }
                }

                public Slice(int i, mcd.a color, String str) {
                    Intrinsics.checkNotNullParameter(color, "color");
                    this.f86495a = i;
                    this.f86496b = color;
                    this.f86497c = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Slice)) {
                        return false;
                    }
                    Slice slice = (Slice) obj2;
                    return this.f86495a == slice.f86495a && this.f86496b == slice.f86496b && Intrinsics.f(this.f86497c, slice.f86497c);
                }

                public final int hashCode() {
                    int iHashCode = (this.f86496b.hashCode() + (Integer.hashCode(this.f86495a) * 31)) * 31;
                    String str = this.f86497c;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(this.f86495a);
                    dest.writeString(this.f86496b.name());
                    dest.writeString(this.f86497c);
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
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(Slice.CREATOR, parcel, arrayList, iA, 1);
                    }
                    return new PieChart(arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PieChart[i];
                }
            }

            public PieChart(ArrayList slices) {
                Intrinsics.checkNotNullParameter(slices, "slices");
                this.f86494a = slices;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof PieChart) && this.f86494a.equals(((PieChart) obj2).f86494a);
            }

            public final int hashCode() {
                return this.f86494a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itY = j6.a.y(this.f86494a, dest);
                while (itY.hasNext()) {
                    ((Slice) itY.next()).writeToParcel(dest, i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section$PlainText;", "Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section$Item;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/shared/savings/models/info_sheets/a", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PlainText implements Item {

            @NotNull
            public static final Parcelable.Creator<PlainText> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f86498a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final com.revolut.feature.shared.savings.models.info_sheets.a f86499b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final mcd.a f86500c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PlainText(parcel.readString(), parcel.readInt() == 0 ? null : com.revolut.feature.shared.savings.models.info_sheets.a.valueOf(parcel.readString()), parcel.readInt() != 0 ? mcd.a.valueOf(parcel.readString()) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PlainText[i];
                }
            }

            public PlainText(String text, com.revolut.feature.shared.savings.models.info_sheets.a aVar, mcd.a aVar2) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.f86498a = text;
                this.f86499b = aVar;
                this.f86500c = aVar2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof PlainText)) {
                    return false;
                }
                PlainText plainText = (PlainText) obj2;
                return Intrinsics.f(this.f86498a, plainText.f86498a) && this.f86499b == plainText.f86499b && this.f86500c == plainText.f86500c;
            }

            public final int hashCode() {
                int iHashCode = this.f86498a.hashCode() * 31;
                com.revolut.feature.shared.savings.models.info_sheets.a aVar = this.f86499b;
                int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                mcd.a aVar2 = this.f86500c;
                return iHashCode2 + (aVar2 != null ? aVar2.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f86498a);
                com.revolut.feature.shared.savings.models.info_sheets.a aVar = this.f86499b;
                if (aVar == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(aVar.name());
                }
                mcd.a aVar2 = this.f86500c;
                if (aVar2 == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(aVar2.name());
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section$Row;", "Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section$Item;", "", "toString", "()Ljava/lang/String;", "Title", "Value", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Row implements Item {

            @NotNull
            public static final Parcelable.Creator<Row> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Title f86501a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f86502b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Value f86503c;
            public final String d;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section$Row$Title;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Title implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<Title> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f86504a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Icon f86505b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Title(parcel.readString(), parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Title[i];
                    }
                }

                public Title(String text, Icon icon) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    this.f86504a = text;
                    this.f86505b = icon;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Title)) {
                        return false;
                    }
                    Title title = (Title) obj2;
                    return Intrinsics.f(this.f86504a, title.f86504a) && Intrinsics.f(this.f86505b, title.f86505b);
                }

                public final int hashCode() {
                    int iHashCode = this.f86504a.hashCode() * 31;
                    Icon icon = this.f86505b;
                    return iHashCode + (icon == null ? 0 : icon.hashCode());
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f86504a);
                    Icon icon = this.f86505b;
                    if (icon == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        icon.writeToParcel(dest, i);
                    }
                }
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section$Row$Value;", "Landroid/os/Parcelable;", "Text", "Image", "Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section$Row$Value$Image;", "Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section$Row$Value$Text;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public interface Value extends Parcelable {

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section$Row$Value$Image;", "Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section$Row$Value;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class Image implements Value {

                    @NotNull
                    public static final Parcelable.Creator<Image> CREATOR = new a();

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Icon f86506a;

                    public static final class a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new Image(Icon.CREATOR.createFromParcel(parcel));
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new Image[i];
                        }
                    }

                    public Image(Icon icon) {
                        Intrinsics.checkNotNullParameter(icon, "icon");
                        this.f86506a = icon;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        return (obj2 instanceof Image) && Intrinsics.f(this.f86506a, ((Image) obj2).f86506a);
                    }

                    public final int hashCode() {
                        return this.f86506a.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int i) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        this.f86506a.writeToParcel(dest, i);
                    }
                }

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section$Row$Value$Text;", "Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheet$Section$Row$Value;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class Text implements Value {

                    @NotNull
                    public static final Parcelable.Creator<Text> CREATOR = new a();

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final String f86507a;

                    public static final class a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new Text(parcel.readString());
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new Text[i];
                        }
                    }

                    public Text(String text) {
                        Intrinsics.checkNotNullParameter(text, "text");
                        this.f86507a = text;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        return (obj2 instanceof Text) && Intrinsics.f(this.f86507a, ((Text) obj2).f86507a);
                    }

                    public final int hashCode() {
                        return this.f86507a.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int i) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeString(this.f86507a);
                    }
                }
            }

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Row(Title.CREATOR.createFromParcel(parcel), parcel.readString(), (Value) parcel.readParcelable(Row.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Row[i];
                }
            }

            public Row(Title title, String str, Value value, String str2) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.f86501a = title;
                this.f86502b = str;
                this.f86503c = value;
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
                if (!(obj2 instanceof Row)) {
                    return false;
                }
                Row row = (Row) obj2;
                return Intrinsics.f(this.f86501a, row.f86501a) && Intrinsics.f(this.f86502b, row.f86502b) && Intrinsics.f(this.f86503c, row.f86503c) && Intrinsics.f(this.d, row.d);
            }

            public final int hashCode() {
                int iHashCode = this.f86501a.hashCode() * 31;
                String str = this.f86502b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                Value value = this.f86503c;
                int iHashCode3 = (iHashCode2 + (value == null ? 0 : value.hashCode())) * 31;
                String str2 = this.d;
                return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f86501a.writeToParcel(dest, i);
                dest.writeString(this.f86502b);
                dest.writeParcelable(this.f86503c, i);
                dest.writeString(this.d);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Header headerCreateFromParcel = parcel.readInt() == 0 ? null : Header.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Section.class, parcel, arrayList, iE, 1);
                }
                return new Section(headerCreateFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Section[i];
            }
        }

        public Section(Header header, ArrayList items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.f86475a = header;
            this.f86476b = items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Section)) {
                return false;
            }
            Section section = (Section) obj2;
            return Intrinsics.f(this.f86475a, section.f86475a) && this.f86476b.equals(section.f86476b);
        }

        public final int hashCode() {
            Header header = this.f86475a;
            return this.f86476b.hashCode() + ((header == null ? 0 : header.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Header header = this.f86475a;
            if (header == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                header.writeToParcel(dest, i);
            }
            Iterator itY = j6.a.y(this.f86476b, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(Section.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Action.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new InfoSheet(string, string2, string3, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InfoSheet[i];
        }
    }

    public InfoSheet(String key, String title, String str, ArrayList sections, ArrayList actions) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f86470a = key;
        this.f86471b = title;
        this.f86472c = str;
        this.d = sections;
        this.e = actions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InfoSheet)) {
            return false;
        }
        InfoSheet infoSheet = (InfoSheet) obj2;
        return Intrinsics.f(this.f86470a, infoSheet.f86470a) && Intrinsics.f(this.f86471b, infoSheet.f86471b) && Intrinsics.f(this.f86472c, infoSheet.f86472c) && this.d.equals(infoSheet.d) && this.e.equals(infoSheet.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f86470a.hashCode() * 31, 31, this.f86471b);
        String str = this.f86472c;
        return this.e.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86470a);
        dest.writeString(this.f86471b);
        dest.writeString(this.f86472c);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            ((Section) itY.next()).writeToParcel(dest, i);
        }
        Iterator itY2 = j6.a.y(this.e, dest);
        while (itY2.hasNext()) {
            ((Action) itY2.next()).writeToParcel(dest, i);
        }
    }
}
