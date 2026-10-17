package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.l3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/models/FilterClause;", "Lcom/revolut/core/ui_kit/models/Clause;", "Law0/l3;", "", "toString", "()Ljava/lang/String;", "Filter", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FilterClause implements Clause, l3 {

    @NotNull
    public static final Parcelable.Creator<FilterClause> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f57776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f57777b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/models/FilterClause$Filter;", "Landroid/os/Parcelable;", "WithoutEmoji", "Lcom/revolut/core/ui_kit/models/FilterClause$Filter$WithoutEmoji;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Filter extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/FilterClause$Filter$WithoutEmoji;", "Lcom/revolut/core/ui_kit/models/FilterClause$Filter;", "<init>", "()V", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class WithoutEmoji implements Filter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final WithoutEmoji f57778a = new WithoutEmoji();

            @NotNull
            public static final Parcelable.Creator<WithoutEmoji> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return WithoutEmoji.f57778a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new WithoutEmoji[i];
                }
            }

            private WithoutEmoji() {
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
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Clause clause = (Clause) j6.a.f(parcel, "parcel", FilterClause.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(FilterClause.class, parcel, arrayList, iE, 1);
            }
            return new FilterClause(clause, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FilterClause[i];
        }
    }

    public FilterClause(Clause delegate, List filters) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f57776a = delegate;
        this.f57777b = filters;
    }

    @Override // aw0.l3
    public final Clause a(Clause delegate) {
        Intrinsics.checkNotNullParameter(delegate, "newDelegate");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        List filters = this.f57777b;
        Intrinsics.checkNotNullParameter(filters, "filters");
        return new FilterClause(delegate, filters);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getF57777b() {
        return this.f57777b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FilterClause)) {
            return false;
        }
        FilterClause filterClause = (FilterClause) obj2;
        return Intrinsics.f(this.f57776a, filterClause.f57776a) && Intrinsics.f(this.f57777b, filterClause.f57777b);
    }

    @Override // aw0.l3
    /* JADX INFO: renamed from: getDelegate, reason: from getter */
    public final Clause getF57776a() {
        return this.f57776a;
    }

    public final int hashCode() {
        return this.f57777b.hashCode() + (this.f57776a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f57776a, i);
        Iterator itV = p.a.v(this.f57777b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
