package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.ga;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/models/HtmlClause;", "Lcom/revolut/core/ui_kit/models/Clause;", "Law0/ga;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HtmlClause implements Clause, ga {

    @NotNull
    public static final Parcelable.Creator<HtmlClause> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f57781c;
    public final boolean d;
    public final Object e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HtmlClause(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readValue(HtmlClause.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HtmlClause[i];
        }
    }

    public HtmlClause(int i, Integer num, Object obj2, String text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f57779a = text;
        this.f57780b = i;
        this.f57781c = num;
        this.d = z;
        this.e = obj2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF57780b() {
        return this.f57780b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HtmlClause)) {
            return false;
        }
        HtmlClause htmlClause = (HtmlClause) obj2;
        return Intrinsics.f(this.f57779a, htmlClause.f57779a) && this.f57780b == htmlClause.f57780b && Intrinsics.f(this.f57781c, htmlClause.f57781c) && this.d == htmlClause.d && Intrinsics.f(this.e, htmlClause.e);
    }

    /* JADX INFO: renamed from: getText, reason: from getter */
    public final String getF57779a() {
        return this.f57779a;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f57780b, this.f57779a.hashCode() * 31, 31);
        Integer num = this.f57781c;
        int iC = j6.a.c((iB + (num == null ? 0 : num.hashCode())) * 31, 31, this.d);
        Object obj2 = this.e;
        return iC + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f57779a);
        dest.writeInt(this.f57780b);
        Integer num = this.f57781c;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeInt(this.d ? 1 : 0);
        dest.writeValue(this.e);
    }

    public /* synthetic */ HtmlClause(int i, int i2, Integer num, Object obj2, String str) {
        this((i2 & 2) != 0 ? 15 : i, (i2 & 4) != 0 ? null : num, (i2 & 16) != 0 ? null : obj2, str, false);
    }
}
