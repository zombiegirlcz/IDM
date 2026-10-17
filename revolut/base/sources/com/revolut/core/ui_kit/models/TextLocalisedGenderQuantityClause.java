package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.e7;
import aw0.fa;
import aw0.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/models/TextLocalisedGenderQuantityClause;", "Lcom/revolut/core/ui_kit/models/Clause;", "Law0/e7;", "Law0/fa;", "Law0/s1;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TextLocalisedGenderQuantityClause implements Clause, e7, fa, s1 {

    @NotNull
    public static final Parcelable.Creator<TextLocalisedGenderQuantityClause> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bj0.b f57946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceId f57947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57948c;
    public final ArrayList d;
    public final Clause e;
    public final Style f;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            bj0.b bVarValueOf = bj0.b.valueOf(parcel.readString());
            ResourceId resourceId = (ResourceId) parcel.readParcelable(TextLocalisedGenderQuantityClause.class.getClassLoader());
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(parcel.readValue(TextLocalisedGenderQuantityClause.class.getClassLoader()));
            }
            return new TextLocalisedGenderQuantityClause(bVarValueOf, resourceId, i, arrayList, (Clause) parcel.readParcelable(TextLocalisedGenderQuantityClause.class.getClassLoader()), (Style) parcel.readParcelable(TextLocalisedGenderQuantityClause.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TextLocalisedGenderQuantityClause[i];
        }
    }

    public TextLocalisedGenderQuantityClause(bj0.b gender, ResourceId resId, int i, ArrayList args, Clause clause, Style style) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(resId, "resId");
        Intrinsics.checkNotNullParameter(args, "args");
        this.f57946a = gender;
        this.f57947b = resId;
        this.f57948c = i;
        this.d = args;
        this.e = clause;
        this.f = style;
    }

    @Override // aw0.e7
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ResourceId getF57947b() {
        return this.f57947b;
    }

    @Override // aw0.s1
    /* JADX INFO: renamed from: b */
    public final List getF57945c() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TextLocalisedGenderQuantityClause)) {
            return false;
        }
        TextLocalisedGenderQuantityClause textLocalisedGenderQuantityClause = (TextLocalisedGenderQuantityClause) obj2;
        return this.f57946a == textLocalisedGenderQuantityClause.f57946a && Intrinsics.f(this.f57947b, textLocalisedGenderQuantityClause.f57947b) && this.f57948c == textLocalisedGenderQuantityClause.f57948c && this.d.equals(textLocalisedGenderQuantityClause.d) && Intrinsics.f(this.e, textLocalisedGenderQuantityClause.e) && Intrinsics.f(this.f, textLocalisedGenderQuantityClause.f);
    }

    @Override // aw0.fa
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Style getF() {
        return this.f;
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, j6.a.b(this.f57948c, (this.f57947b.hashCode() + (this.f57946a.hashCode() * 31)) * 31, 31), 31);
        Clause clause = this.e;
        int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
        Style style = this.f;
        return iHashCode + (style != null ? style.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f57946a.name());
        dest.writeParcelable(this.f57947b, i);
        dest.writeInt(this.f57948c);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            dest.writeValue(itY.next());
        }
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
    }
}
