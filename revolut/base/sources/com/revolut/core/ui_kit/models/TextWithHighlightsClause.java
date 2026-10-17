package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.fa;
import aw0.ia;
import aw0.l3;
import aw0.o9;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\b\tJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/models/TextWithHighlightsClause;", "Lcom/revolut/core/ui_kit/models/Clause;", "Law0/fa;", "Law0/l3;", "", "toString", "()Ljava/lang/String;", "Companion", "aw0/ia", "a", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TextWithHighlightsClause implements Clause, fa, l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f57953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ia f57955c;
    public final Style d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<TextWithHighlightsClause> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.models.TextWithHighlightsClause$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static TextWithHighlightsClause a(Companion companion, String text) {
            ia highlightStyle = ia.BOLD;
            companion.getClass();
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(highlightStyle, "highlightStyle");
            return new TextWithHighlightsClause(new TextClause(text, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, highlightStyle, null);
        }

        public static Clause b(Companion companion, Clause delegate, String str) {
            ia highlightStyle = ia.BACKGROUND;
            companion.getClass();
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            Intrinsics.checkNotNullParameter(highlightStyle, "highlightStyle");
            return (str == null || kotlin.text.d0.W(str)) ? delegate : new TextWithHighlightsClause(delegate, str, highlightStyle, null);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TextWithHighlightsClause((Clause) parcel.readParcelable(TextWithHighlightsClause.class.getClassLoader()), parcel.readString(), ia.valueOf(parcel.readString()), (Style) parcel.readParcelable(TextWithHighlightsClause.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TextWithHighlightsClause[i];
        }
    }

    public TextWithHighlightsClause(Clause delegate, String str, ia highlightStyle, Style style) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(highlightStyle, "highlightStyle");
        this.f57953a = delegate;
        this.f57954b = str;
        this.f57955c = highlightStyle;
        this.d = style;
    }

    @Override // aw0.l3
    public final Clause a(Clause delegate) {
        Intrinsics.checkNotNullParameter(delegate, "newDelegate");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        ia highlightStyle = this.f57955c;
        Intrinsics.checkNotNullParameter(highlightStyle, "highlightStyle");
        return new TextWithHighlightsClause(delegate, this.f57954b, highlightStyle, this.d);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ia getF57955c() {
        return this.f57955c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF57954b() {
        return this.f57954b;
    }

    public final boolean d() {
        return this.f57954b == null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TextWithHighlightsClause)) {
            return false;
        }
        TextWithHighlightsClause textWithHighlightsClause = (TextWithHighlightsClause) obj2;
        return Intrinsics.f(this.f57953a, textWithHighlightsClause.f57953a) && Intrinsics.f(this.f57954b, textWithHighlightsClause.f57954b) && this.f57955c == textWithHighlightsClause.f57955c && Intrinsics.f(this.d, textWithHighlightsClause.d);
    }

    @Override // aw0.l3
    /* JADX INFO: renamed from: getDelegate, reason: from getter */
    public final Clause getF57953a() {
        return this.f57953a;
    }

    @Override // aw0.fa
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Style getD() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = this.f57953a.hashCode() * 31;
        String str = this.f57954b;
        int iHashCode2 = (this.f57955c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Style style = this.d;
        return iHashCode2 + (style != null ? style.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f57953a, i);
        dest.writeString(this.f57954b);
        dest.writeString(this.f57955c.name());
        dest.writeParcelable(this.d, i);
    }
}
