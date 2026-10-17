package com.revolut.retail.feature.balance.picker.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/models/SupportedTargetCurrencies;", "Landroid/os/Parcelable;", "<init>", "()V", "Unordered", "Ordered", "Lcom/revolut/retail/feature/balance/picker/api/models/SupportedTargetCurrencies$Ordered;", "Lcom/revolut/retail/feature/balance/picker/api/models/SupportedTargetCurrencies$Unordered;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SupportedTargetCurrencies implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/models/SupportedTargetCurrencies$Ordered;", "Lcom/revolut/retail/feature/balance/picker/api/models/SupportedTargetCurrencies;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Ordered extends SupportedTargetCurrencies {

        @NotNull
        public static final Parcelable.Creator<Ordered> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f99458a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Ordered(parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Ordered[i];
            }
        }

        public Ordered(List targetCurrencies) {
            Intrinsics.checkNotNullParameter(targetCurrencies, "targetCurrencies");
            this.f99458a = targetCurrencies;
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.SupportedTargetCurrencies
        public final Collection a() {
            return this.f99458a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Ordered) && Intrinsics.f(this.f99458a, ((Ordered) obj2).f99458a);
        }

        public final int hashCode() {
            return this.f99458a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeStringList(this.f99458a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/models/SupportedTargetCurrencies$Unordered;", "Lcom/revolut/retail/feature/balance/picker/api/models/SupportedTargetCurrencies;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Unordered extends SupportedTargetCurrencies {

        @NotNull
        public static final Parcelable.Creator<Unordered> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f99459a;

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
                return new Unordered(linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unordered[i];
            }
        }

        public Unordered(Set targetCurrencies) {
            Intrinsics.checkNotNullParameter(targetCurrencies, "targetCurrencies");
            this.f99459a = targetCurrencies;
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.SupportedTargetCurrencies
        public final Collection a() {
            return this.f99459a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Unordered) && Intrinsics.f(this.f99459a, ((Unordered) obj2).f99459a);
        }

        public final int hashCode() {
            return this.f99459a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f99459a, dest);
            while (itV.hasNext()) {
                dest.writeString((String) itV.next());
            }
        }
    }

    private SupportedTargetCurrencies() {
    }

    public abstract Collection a();
}
