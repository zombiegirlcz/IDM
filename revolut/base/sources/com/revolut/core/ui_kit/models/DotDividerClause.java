package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.fa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/models/DotDividerClause;", "Lcom/revolut/core/ui_kit/models/Clause;", "Law0/fa;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DotDividerClause implements Clause, fa {

    @NotNull
    public static final Parcelable.Creator<DotDividerClause> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Style f57775a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DotDividerClause((Style) parcel.readParcelable(DotDividerClause.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DotDividerClause[i];
        }
    }

    public DotDividerClause(Style style) {
        this.f57775a = style;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof DotDividerClause) && Intrinsics.f(this.f57775a, ((DotDividerClause) obj2).f57775a);
    }

    @Override // aw0.fa
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Style getF57775a() {
        return this.f57775a;
    }

    public final int hashCode() {
        Style style = this.f57775a;
        if (style == null) {
            return 0;
        }
        return style.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f57775a, i);
    }

    public /* synthetic */ DotDividerClause() {
        this((Integer) null);
    }

    public DotDividerClause(Integer num) {
        this(new Custom(num, false, null, false, null, 254));
    }
}
