package com.revolut.feature.transfer.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transfer/core/models/CurrencyFilteringPolicy;", "Landroid/os/Parcelable;", "IncludeAll", "IncludeOnly", "Exclude", "Lcom/revolut/feature/transfer/core/models/CurrencyFilteringPolicy$Exclude;", "Lcom/revolut/feature/transfer/core/models/CurrencyFilteringPolicy$IncludeAll;", "Lcom/revolut/feature/transfer/core/models/CurrencyFilteringPolicy$IncludeOnly;", "feature_transfer_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CurrencyFilteringPolicy extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/models/CurrencyFilteringPolicy$Exclude;", "Lcom/revolut/feature/transfer/core/models/CurrencyFilteringPolicy;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Exclude implements CurrencyFilteringPolicy {

        @NotNull
        public static final Parcelable.Creator<Exclude> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f92234a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iA = 0;
                while (iA != i) {
                    iA = o.a(parcel, linkedHashSet, iA, 1);
                }
                return new Exclude(linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Exclude[i];
            }
        }

        public Exclude(Set currencies) {
            Intrinsics.checkNotNullParameter(currencies, "currencies");
            this.f92234a = currencies;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Exclude) && Intrinsics.f(this.f92234a, ((Exclude) obj2).f92234a);
        }

        public final int hashCode() {
            return this.f92234a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f92234a, dest);
            while (itV.hasNext()) {
                dest.writeString((String) itV.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transfer/core/models/CurrencyFilteringPolicy$IncludeAll;", "Lcom/revolut/feature/transfer/core/models/CurrencyFilteringPolicy;", "<init>", "()V", "feature_transfer_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IncludeAll implements CurrencyFilteringPolicy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final IncludeAll f92235a = new IncludeAll();

        @NotNull
        public static final Parcelable.Creator<IncludeAll> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IncludeAll.f92235a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IncludeAll[i];
            }
        }

        private IncludeAll() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/models/CurrencyFilteringPolicy$IncludeOnly;", "Lcom/revolut/feature/transfer/core/models/CurrencyFilteringPolicy;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IncludeOnly implements CurrencyFilteringPolicy {

        @NotNull
        public static final Parcelable.Creator<IncludeOnly> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f92236a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iA = 0;
                while (iA != i) {
                    iA = o.a(parcel, linkedHashSet, iA, 1);
                }
                return new IncludeOnly(linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IncludeOnly[i];
            }
        }

        public IncludeOnly(Set currencies) {
            Intrinsics.checkNotNullParameter(currencies, "currencies");
            this.f92236a = currencies;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof IncludeOnly) && Intrinsics.f(this.f92236a, ((IncludeOnly) obj2).f92236a);
        }

        public final int hashCode() {
            return this.f92236a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f92236a, dest);
            while (itV.hasNext()) {
                dest.writeString((String) itV.next());
            }
        }
    }
}
