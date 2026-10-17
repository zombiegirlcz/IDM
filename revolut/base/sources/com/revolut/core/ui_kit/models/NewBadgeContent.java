package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/models/NewBadgeContent;", "Landroid/os/Parcelable;", "Dot", "WithText", "WithNumber", "WithClause", "Lcom/revolut/core/ui_kit/models/NewBadgeContent$Dot;", "Lcom/revolut/core/ui_kit/models/NewBadgeContent$WithClause;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface NewBadgeContent extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/models/NewBadgeContent$Dot;", "Lcom/revolut/core/ui_kit/models/NewBadgeContent;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/models/n", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Dot implements NewBadgeContent {

        @NotNull
        public static final Parcelable.Creator<Dot> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.revolut.core.ui.models.Color f57886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n f57887b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Dot((com.revolut.core.ui.models.Color) parcel.readParcelable(Dot.class.getClassLoader()), n.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Dot[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Dot() {
            this(null, 0 == true ? 1 : 0, 3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Dot)) {
                return false;
            }
            Dot dot = (Dot) obj2;
            return Intrinsics.f(this.f57886a, dot.f57886a) && this.f57887b == dot.f57887b;
        }

        public final int hashCode() {
            return this.f57887b.hashCode() + (this.f57886a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f57886a, i);
            dest.writeString(this.f57887b.name());
        }

        public Dot(com.revolut.core.ui.models.Color dotColor, n size) {
            Intrinsics.checkNotNullParameter(dotColor, "dotColor");
            Intrinsics.checkNotNullParameter(size, "size");
            this.f57886a = dotColor;
            this.f57887b = size;
        }

        public /* synthetic */ Dot(Color.Solid solid, n nVar, int i) {
            this((i & 1) != 0 ? new Color.Solid(R$attr.uikit_colorStatusDanger) : solid, (i & 2) != 0 ? n.BIG : nVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/models/NewBadgeContent$WithClause;", "Lcom/revolut/core/ui_kit/models/NewBadgeContent;", "Lcom/revolut/core/ui_kit/models/NewBadgeContent$WithNumber;", "Lcom/revolut/core/ui_kit/models/NewBadgeContent$WithText;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface WithClause extends NewBadgeContent {
        /* JADX INFO: renamed from: B4 */
        com.revolut.core.ui.models.Color getD();

        /* JADX INFO: renamed from: M1 */
        com.revolut.core.ui.models.Color getF57892b();

        /* JADX INFO: renamed from: aa */
        com.revolut.core.ui.models.Color getF57893c();

        /* JADX INFO: renamed from: getValue */
        Clause getF57891a();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/NewBadgeContent$WithNumber;", "Lcom/revolut/core/ui_kit/models/NewBadgeContent$WithClause;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithNumber implements WithClause {

        @NotNull
        public static final Parcelable.Creator<WithNumber> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NumberClause f57888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.revolut.core.ui.models.Color f57889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.revolut.core.ui.models.Color f57890c;
        public final com.revolut.core.ui.models.Color d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithNumber((NumberClause) parcel.readParcelable(WithNumber.class.getClassLoader()), (com.revolut.core.ui.models.Color) parcel.readParcelable(WithNumber.class.getClassLoader()), (com.revolut.core.ui.models.Color) parcel.readParcelable(WithNumber.class.getClassLoader()), (com.revolut.core.ui.models.Color) parcel.readParcelable(WithNumber.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithNumber[i];
            }
        }

        public WithNumber(NumberClause value, com.revolut.core.ui.models.Color textColor, com.revolut.core.ui.models.Color backgroundColor, com.revolut.core.ui.models.Color backgroundStrokeColor) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(textColor, "textColor");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(backgroundStrokeColor, "backgroundStrokeColor");
            this.f57888a = value;
            this.f57889b = textColor;
            this.f57890c = backgroundColor;
            this.d = backgroundStrokeColor;
        }

        @Override // com.revolut.core.ui_kit.models.NewBadgeContent.WithClause
        /* JADX INFO: renamed from: B4, reason: from getter */
        public final com.revolut.core.ui.models.Color getD() {
            return this.d;
        }

        @Override // com.revolut.core.ui_kit.models.NewBadgeContent.WithClause
        /* JADX INFO: renamed from: M1, reason: from getter */
        public final com.revolut.core.ui.models.Color getF57892b() {
            return this.f57889b;
        }

        @Override // com.revolut.core.ui_kit.models.NewBadgeContent.WithClause
        /* JADX INFO: renamed from: aa, reason: from getter */
        public final com.revolut.core.ui.models.Color getF57893c() {
            return this.f57890c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WithNumber)) {
                return false;
            }
            WithNumber withNumber = (WithNumber) obj2;
            return Intrinsics.f(this.f57888a, withNumber.f57888a) && Intrinsics.f(this.f57889b, withNumber.f57889b) && Intrinsics.f(this.f57890c, withNumber.f57890c) && Intrinsics.f(this.d, withNumber.d);
        }

        @Override // com.revolut.core.ui_kit.models.NewBadgeContent.WithClause
        /* JADX INFO: renamed from: getValue */
        public final Clause getF57891a() {
            return this.f57888a;
        }

        public final int hashCode() {
            return this.d.hashCode() + ehe.n.d(this.f57890c, ehe.n.d(this.f57889b, this.f57888a.hashCode() * 31, 31), 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f57888a, i);
            dest.writeParcelable(this.f57889b, i);
            dest.writeParcelable(this.f57890c, i);
            dest.writeParcelable(this.d, i);
        }

        public /* synthetic */ WithNumber(NumberClause numberClause) {
            Color.Solid solid = new Color.Solid(R$attr.uikit_colorWhite);
            int i = R$attr.uikit_colorStatusDanger;
            this(numberClause, solid, new Color.Solid(i), new Color.Solid(i));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/NewBadgeContent$WithText;", "Lcom/revolut/core/ui_kit/models/NewBadgeContent$WithClause;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithText implements WithClause {

        @NotNull
        public static final Parcelable.Creator<WithText> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f57891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.revolut.core.ui.models.Color f57892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.revolut.core.ui.models.Color f57893c;
        public final com.revolut.core.ui.models.Color d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithText((Clause) parcel.readParcelable(WithText.class.getClassLoader()), (com.revolut.core.ui.models.Color) parcel.readParcelable(WithText.class.getClassLoader()), (com.revolut.core.ui.models.Color) parcel.readParcelable(WithText.class.getClassLoader()), (com.revolut.core.ui.models.Color) parcel.readParcelable(WithText.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithText[i];
            }
        }

        public WithText(Clause value, com.revolut.core.ui.models.Color textColor, com.revolut.core.ui.models.Color backgroundColor, com.revolut.core.ui.models.Color backgroundStrokeColor) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(textColor, "textColor");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(backgroundStrokeColor, "backgroundStrokeColor");
            this.f57891a = value;
            this.f57892b = textColor;
            this.f57893c = backgroundColor;
            this.d = backgroundStrokeColor;
        }

        @Override // com.revolut.core.ui_kit.models.NewBadgeContent.WithClause
        /* JADX INFO: renamed from: B4, reason: from getter */
        public final com.revolut.core.ui.models.Color getD() {
            return this.d;
        }

        @Override // com.revolut.core.ui_kit.models.NewBadgeContent.WithClause
        /* JADX INFO: renamed from: M1, reason: from getter */
        public final com.revolut.core.ui.models.Color getF57892b() {
            return this.f57892b;
        }

        @Override // com.revolut.core.ui_kit.models.NewBadgeContent.WithClause
        /* JADX INFO: renamed from: aa, reason: from getter */
        public final com.revolut.core.ui.models.Color getF57893c() {
            return this.f57893c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WithText)) {
                return false;
            }
            WithText withText = (WithText) obj2;
            return Intrinsics.f(this.f57891a, withText.f57891a) && Intrinsics.f(this.f57892b, withText.f57892b) && Intrinsics.f(this.f57893c, withText.f57893c) && Intrinsics.f(this.d, withText.d);
        }

        @Override // com.revolut.core.ui_kit.models.NewBadgeContent.WithClause
        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final Clause getF57891a() {
            return this.f57891a;
        }

        public final int hashCode() {
            return this.d.hashCode() + ehe.n.d(this.f57893c, ehe.n.d(this.f57892b, this.f57891a.hashCode() * 31, 31), 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f57891a, i);
            dest.writeParcelable(this.f57892b, i);
            dest.writeParcelable(this.f57893c, i);
            dest.writeParcelable(this.d, i);
        }

        public /* synthetic */ WithText(Clause clause) {
            Color.Solid solid = new Color.Solid(R$attr.uikit_colorWhite);
            int i = R$attr.uikit_colorStatusDanger;
            this(clause, solid, new Color.Solid(i), new Color.Solid(i));
        }
    }
}
