package com.revolut.feature.transactions.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import h30.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import k71.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/TransactionsFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "Details", "Lcom/revolut/feature/transactions/api/navigation/TransactionsFeatureConfig$Details;", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TransactionsFeatureConfig implements FeatureConfig {
    private TransactionsFeatureConfig() {
    }

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/TransactionsFeatureConfig$Details;", "Lcom/revolut/feature/transactions/api/navigation/TransactionsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/transactions/api/navigation/a", "com/revolut/feature/transactions/api/navigation/c", "com/revolut/feature/transactions/api/navigation/b", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details extends TransactionsFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f92003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.revolut.feature.transactions.api.navigation.a f92004b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f92005c;
        public final c d;
        public final b e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Map f92006g;

        public static final class a implements Parcelable.Creator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int i;
                LinkedHashMap linkedHashMap;
                b bVar;
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                i iVar = (i) parcel.readSerializable();
                com.revolut.feature.transactions.api.navigation.a aVarValueOf = com.revolut.feature.transactions.api.navigation.a.valueOf(parcel.readString());
                int iD = 0;
                boolean z3 = true;
                if (parcel.readInt() != 0) {
                    i = 1;
                } else {
                    i = 1;
                    z3 = false;
                }
                c cVarValueOf = parcel.readInt() == 0 ? null : c.valueOf(parcel.readString());
                b bVarValueOf = b.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    linkedHashMap = null;
                    bVar = bVarValueOf;
                    z = i;
                } else {
                    linkedHashMap = null;
                    bVar = bVarValueOf;
                    z = 0;
                }
                if (parcel.readInt() != 0) {
                    int i2 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i2);
                    while (iD != i2) {
                        iD = j6.a.d(parcel, linkedHashMap2, parcel.readString(), iD, i);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new Details(iVar, aVarValueOf, z3, cVarValueOf, bVar, z, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        public Details(i descriptor, com.revolut.feature.transactions.api.navigation.a entrypoint, boolean z, c cVar, b headerAmountSignShowingPolicy, boolean z3, Map map) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(entrypoint, "entrypoint");
            Intrinsics.checkNotNullParameter(headerAmountSignShowingPolicy, "headerAmountSignShowingPolicy");
            this.f92003a = descriptor;
            this.f92004b = entrypoint;
            this.f92005c = z;
            this.d = cVar;
            this.e = headerAmountSignShowingPolicy;
            this.f = z3;
            this.f92006g = map;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Details)) {
                return false;
            }
            Details details = (Details) obj2;
            return Intrinsics.f(this.f92003a, details.f92003a) && this.f92004b == details.f92004b && this.f92005c == details.f92005c && this.d == details.d && this.e == details.e && this.f == details.f && Intrinsics.f(this.f92006g, details.f92006g);
        }

        public final int hashCode() {
            int iC = j6.a.c((this.f92004b.hashCode() + (this.f92003a.hashCode() * 31)) * 31, 31, this.f92005c);
            c cVar = this.d;
            int iC2 = j6.a.c((this.e.hashCode() + ((iC + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31, 31, this.f);
            Map map = this.f92006g;
            return iC2 + (map != null ? map.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f92003a);
            dest.writeString(this.f92004b.name());
            dest.writeInt(this.f92005c ? 1 : 0);
            c cVar = this.d;
            if (cVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(cVar.name());
            }
            dest.writeString(this.e.name());
            dest.writeInt(this.f ? 1 : 0);
            Map map = this.f92006g;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            Iterator itV = l.v(dest, 1, map);
            while (itV.hasNext()) {
                Map.Entry entry = (Map.Entry) itV.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }

        public /* synthetic */ Details(i iVar, com.revolut.feature.transactions.api.navigation.a aVar, c cVar, Map map, int i) {
            this(iVar, (i & 2) != 0 ? com.revolut.feature.transactions.api.navigation.a.OTHER : aVar, (i & 4) == 0, (i & 8) != 0 ? null : cVar, b.ORIGINAL, (i & 32) == 0, (i & 64) != 0 ? null : map);
        }
    }
}
