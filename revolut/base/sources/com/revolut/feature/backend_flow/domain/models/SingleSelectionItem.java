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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem;", "Lcom/revolut/feature/backend_flow/domain/models/SelectionItem;", "", "toString", "()Ljava/lang/String;", "Style", "AssetStyle", "SeparationStyle", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SingleSelectionItem extends SelectionItem {

    @NotNull
    public static final Parcelable.Creator<SingleSelectionItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f63639c;
    public final String d;
    public final SelectionItem.CustomOption e;
    public final SelectionItem.CustomAnswer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f63640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f63641h;
    public final Style i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f63642j;
    public final AssetStyle k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SeparationStyle f63643l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ValidationResult f63644m;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$AssetStyle;", "Landroid/os/Parcelable;", "RoundedSquare", "Square", "Unknown", "Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$AssetStyle$RoundedSquare;", "Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$AssetStyle$Square;", "Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$AssetStyle$Unknown;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface AssetStyle extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$AssetStyle$RoundedSquare;", "Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$AssetStyle;", "<init>", "()V", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class RoundedSquare implements AssetStyle {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final RoundedSquare f63645a = new RoundedSquare();

            @NotNull
            public static final Parcelable.Creator<RoundedSquare> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RoundedSquare.f63645a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new RoundedSquare[i];
                }
            }

            private RoundedSquare() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$AssetStyle$Square;", "Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$AssetStyle;", "<init>", "()V", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Square implements AssetStyle {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Square f63646a = new Square();

            @NotNull
            public static final Parcelable.Creator<Square> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Square.f63646a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Square[i];
                }
            }

            private Square() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$AssetStyle$Unknown;", "Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$AssetStyle;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Unknown implements AssetStyle {

            @NotNull
            public static final Parcelable.Creator<Unknown> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f63647a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Unknown(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Unknown[i];
                }
            }

            public Unknown(String style) {
                Intrinsics.checkNotNullParameter(style, "style");
                this.f63647a = style;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Unknown) && Intrinsics.f(this.f63647a, ((Unknown) obj2).f63647a);
            }

            public final int hashCode() {
                return this.f63647a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f63647a);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$SeparationStyle;", "Landroid/os/Parcelable;", "Joint", "Spaced", "Unknown", "Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$SeparationStyle$Joint;", "Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$SeparationStyle$Spaced;", "Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$SeparationStyle$Unknown;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface SeparationStyle extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$SeparationStyle$Joint;", "Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$SeparationStyle;", "<init>", "()V", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Joint implements SeparationStyle {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Joint f63648a = new Joint();

            @NotNull
            public static final Parcelable.Creator<Joint> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Joint.f63648a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Joint[i];
                }
            }

            private Joint() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$SeparationStyle$Spaced;", "Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$SeparationStyle;", "<init>", "()V", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Spaced implements SeparationStyle {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Spaced f63649a = new Spaced();

            @NotNull
            public static final Parcelable.Creator<Spaced> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Spaced.f63649a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Spaced[i];
                }
            }

            private Spaced() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$SeparationStyle$Unknown;", "Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$SeparationStyle;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Unknown implements SeparationStyle {

            @NotNull
            public static final Parcelable.Creator<Unknown> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f63650a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Unknown(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Unknown[i];
                }
            }

            public Unknown(String style) {
                Intrinsics.checkNotNullParameter(style, "style");
                this.f63650a = style;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Unknown) && Intrinsics.f(this.f63650a, ((Unknown) obj2).f63650a);
            }

            public final int hashCode() {
                return this.f63650a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f63650a);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$Style;", "Landroid/os/Parcelable;", "<init>", "()V", "RadioButton", "ContinueButton", "CellSelection", "Unknown", "Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$Style$CellSelection;", "Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$Style$ContinueButton;", "Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$Style$RadioButton;", "Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$Style$Unknown;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Style implements Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$Style$CellSelection;", "Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$Style;", "<init>", "()V", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class CellSelection extends Style {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final CellSelection f63651a = new CellSelection();

            @NotNull
            public static final Parcelable.Creator<CellSelection> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CellSelection.f63651a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CellSelection[i];
                }
            }

            private CellSelection() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$Style$ContinueButton;", "Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$Style;", "<init>", "()V", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ContinueButton extends Style {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ContinueButton f63652a = new ContinueButton();

            @NotNull
            public static final Parcelable.Creator<ContinueButton> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ContinueButton.f63652a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ContinueButton[i];
                }
            }

            private ContinueButton() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$Style$RadioButton;", "Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$Style;", "<init>", "()V", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class RadioButton extends Style {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final RadioButton f63653a = new RadioButton();

            @NotNull
            public static final Parcelable.Creator<RadioButton> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RadioButton.f63653a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new RadioButton[i];
                }
            }

            private RadioButton() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$Style$Unknown;", "Lcom/revolut/feature/backend_flow/domain/models/SingleSelectionItem$Style;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Unknown extends Style {

            @NotNull
            public static final Parcelable.Creator<Unknown> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f63654a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Unknown(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Unknown[i];
                }
            }

            public Unknown(String style) {
                Intrinsics.checkNotNullParameter(style, "style");
                this.f63654a = style;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Unknown) && Intrinsics.f(this.f63654a, ((Unknown) obj2).f63654a);
            }

            public final int hashCode() {
                return this.f63654a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f63654a);
            }
        }

        private Style() {
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(SingleSelectionItem.class, parcel, arrayList, iE, 1);
            }
            String string2 = parcel.readString();
            SelectionItem.CustomOption customOptionCreateFromParcel = parcel.readInt() == 0 ? null : SelectionItem.CustomOption.CREATOR.createFromParcel(parcel);
            SelectionItem.CustomAnswer customAnswerCreateFromParcel = parcel.readInt() == 0 ? null : SelectionItem.CustomAnswer.CREATOR.createFromParcel(parcel);
            int i2 = parcel.readInt();
            Boolean boolValueOf = null;
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
            Style style = (Style) parcel.readParcelable(SingleSelectionItem.class.getClassLoader());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SingleSelectionItem(string, z, arrayList, string2, customOptionCreateFromParcel, customAnswerCreateFromParcel, linkedHashSet, arrayList2, style, boolValueOf, (AssetStyle) parcel.readParcelable(SingleSelectionItem.class.getClassLoader()), (SeparationStyle) parcel.readParcelable(SingleSelectionItem.class.getClassLoader()), (ValidationResult) parcel.readParcelable(SingleSelectionItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SingleSelectionItem[i];
        }
    }

    public SingleSelectionItem(String id10, boolean z, List options, String str, SelectionItem.CustomOption customOption, SelectionItem.CustomAnswer customAnswer, Set selected, List groups, Style style, Boolean bool, AssetStyle assetStyle, SeparationStyle separationStyle, ValidationResult validationResult) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f63637a = id10;
        this.f63638b = z;
        this.f63639c = options;
        this.d = str;
        this.e = customOption;
        this.f = customAnswer;
        this.f63640g = selected;
        this.f63641h = groups;
        this.i = style;
        this.f63642j = bool;
        this.k = assetStyle;
        this.f63643l = separationStyle;
        this.f63644m = validationResult;
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
    public final List getF63639c() {
        return this.f63639c;
    }

    @Override // xl2.h0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ValidationResult getF63644m() {
        return this.f63644m;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63637a() {
        return this.f63637a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF63638b() {
        return this.f63638b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SingleSelectionItem)) {
            return false;
        }
        SingleSelectionItem singleSelectionItem = (SingleSelectionItem) obj2;
        return Intrinsics.f(this.f63637a, singleSelectionItem.f63637a) && this.f63638b == singleSelectionItem.f63638b && Intrinsics.f(this.f63639c, singleSelectionItem.f63639c) && Intrinsics.f(this.d, singleSelectionItem.d) && Intrinsics.f(this.e, singleSelectionItem.e) && Intrinsics.f(this.f, singleSelectionItem.f) && Intrinsics.f(this.f63640g, singleSelectionItem.f63640g) && Intrinsics.f(this.f63641h, singleSelectionItem.f63641h) && Intrinsics.f(this.i, singleSelectionItem.i) && Intrinsics.f(this.f63642j, singleSelectionItem.f63642j) && Intrinsics.f(this.k, singleSelectionItem.k) && Intrinsics.f(this.f63643l, singleSelectionItem.f63643l) && Intrinsics.f(this.f63644m, singleSelectionItem.f63644m);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63637a;
    }

    public final int hashCode() {
        int iD = p.a.d(j6.a.c(this.f63637a.hashCode() * 31, 31, this.f63638b), 31, this.f63639c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        SelectionItem.CustomOption customOption = this.e;
        int iHashCode2 = (iHashCode + (customOption == null ? 0 : customOption.hashCode())) * 31;
        SelectionItem.CustomAnswer customAnswer = this.f;
        int iHashCode3 = (this.i.hashCode() + p.a.d(p.a.f((iHashCode2 + (customAnswer == null ? 0 : customAnswer.hashCode())) * 31, 31, this.f63640g), 31, this.f63641h)) * 31;
        Boolean bool = this.f63642j;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        AssetStyle assetStyle = this.k;
        int iHashCode5 = (iHashCode4 + (assetStyle == null ? 0 : assetStyle.hashCode())) * 31;
        SeparationStyle separationStyle = this.f63643l;
        int iHashCode6 = (iHashCode5 + (separationStyle == null ? 0 : separationStyle.hashCode())) * 31;
        ValidationResult validationResult = this.f63644m;
        return iHashCode6 + (validationResult != null ? validationResult.hashCode() : 0);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.SelectionItem
    /* JADX INFO: renamed from: p4, reason: from getter */
    public final Set getF63640g() {
        return this.f63640g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63637a);
        dest.writeInt(this.f63638b ? 1 : 0);
        Iterator itV = p.a.v(this.f63639c, dest);
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
        Iterator itV2 = n.v(this.f63640g, dest);
        while (itV2.hasNext()) {
            dest.writeString((String) itV2.next());
        }
        Iterator itV3 = p.a.v(this.f63641h, dest);
        while (itV3.hasNext()) {
            ((SelectionItem.Group) itV3.next()).writeToParcel(dest, i);
        }
        dest.writeParcelable(this.i, i);
        Boolean bool = this.f63642j;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        dest.writeParcelable(this.k, i);
        dest.writeParcelable(this.f63643l, i);
        dest.writeParcelable(this.f63644m, i);
    }
}
