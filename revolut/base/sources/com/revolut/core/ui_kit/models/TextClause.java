package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.fa;
import aw0.n9;
import aw0.o9;
import aw0.s1;
import com.revolut.core.ui_kit.models.BidiStrategy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/models/TextClause;", "Lcom/revolut/core/ui_kit/models/Clause;", "Law0/fa;", "Law0/n9;", "Law0/s1;", "Lcom/revolut/core/ui_kit/models/BidiAwareClause;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TextClause implements Clause, fa, n9, s1, BidiAwareClause {

    @NotNull
    public static final Parcelable.Creator<TextClause> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Style f57937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f57938c;
    public final boolean d;
    public final o9 e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BidiStrategy f57939g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iE;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Style style = (Style) parcel.readParcelable(TextClause.class.getClassLoader());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z = false;
            if (parcel.readInt() != 0) {
                iE = 0;
                z = true;
            } else {
                iE = 0;
            }
            o9 o9VarValueOf = o9.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (iE != i) {
                iE = j6.a.e(TextClause.class, parcel, arrayList, iE, 1);
            }
            return new TextClause(string, style, numValueOf, z, o9VarValueOf, arrayList, (BidiStrategy) parcel.readParcelable(TextClause.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TextClause[i];
        }
    }

    public TextClause(String text, Style style, Integer num, boolean z, o9 sensitivity, List args, BidiStrategy bidiStrategy) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(bidiStrategy, "bidiStrategy");
        this.f57936a = text;
        this.f57937b = style;
        this.f57938c = num;
        this.d = z;
        this.e = sensitivity;
        this.f = args;
        this.f57939g = bidiStrategy;
    }

    public static TextClause c(TextClause textClause, String str, Custom custom, int i) {
        if ((i & 1) != 0) {
            str = textClause.f57936a;
        }
        String text = str;
        Style style = custom;
        if ((i & 2) != 0) {
            style = textClause.f57937b;
        }
        Integer num = textClause.f57938c;
        boolean z = textClause.d;
        o9 sensitivity = textClause.e;
        List args = textClause.f;
        BidiStrategy bidiStrategy = textClause.f57939g;
        textClause.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(bidiStrategy, "bidiStrategy");
        return new TextClause(text, style, num, z, sensitivity, args, bidiStrategy);
    }

    @Override // aw0.n9
    /* JADX INFO: renamed from: a, reason: from getter */
    public final o9 getD() {
        return this.e;
    }

    @Override // aw0.s1
    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getF57951c() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TextClause)) {
            return false;
        }
        TextClause textClause = (TextClause) obj2;
        return Intrinsics.f(this.f57936a, textClause.f57936a) && Intrinsics.f(this.f57937b, textClause.f57937b) && Intrinsics.f(this.f57938c, textClause.f57938c) && this.d == textClause.d && this.e == textClause.e && Intrinsics.f(this.f, textClause.f) && Intrinsics.f(this.f57939g, textClause.f57939g);
    }

    @Override // aw0.fa
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Style getF57754c() {
        return this.f57937b;
    }

    public final int hashCode() {
        int iHashCode = this.f57936a.hashCode() * 31;
        Style style = this.f57937b;
        int iHashCode2 = (iHashCode + (style == null ? 0 : style.hashCode())) * 31;
        Integer num = this.f57938c;
        return this.f57939g.hashCode() + p.a.d((this.e.hashCode() + j6.a.c((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.d)) * 31, 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f57936a);
        dest.writeParcelable(this.f57937b, i);
        Integer num = this.f57938c;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeInt(this.d ? 1 : 0);
        dest.writeString(this.e.name());
        Iterator itV = p.a.v(this.f, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.f57939g, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextClause(String str, Style style, Integer num, boolean z, o9 o9Var, List list, int i) {
        BidiStrategy bidiStrategy;
        Style style2 = (i & 2) != 0 ? null : style;
        Integer num2 = (i & 4) != 0 ? null : num;
        boolean z3 = (i & 8) != 0 ? false : z;
        o9 o9Var2 = (i & 16) != 0 ? o9.NON_SENSITIVE : o9Var;
        List list2 = (i & 32) != 0 ? zhm.f0.f322471a : list;
        if ((i & 64) != 0) {
            bidiStrategy = BidiStrategy.None.f57738a;
        } else {
            bidiStrategy = BidiStrategy.UnicodeWrap.f57739a;
        }
        this(str, style2, num2, z3, o9Var2, list2, bidiStrategy);
    }
}
