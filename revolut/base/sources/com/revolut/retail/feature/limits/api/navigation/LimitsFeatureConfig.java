package com.revolut.retail.feature.limits.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/limits/api/navigation/LimitsFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "Limits", "LimitPrompt", "Lcom/revolut/retail/feature/limits/api/navigation/LimitsFeatureConfig$LimitPrompt;", "Lcom/revolut/retail/feature/limits/api/navigation/LimitsFeatureConfig$Limits;", "feature_retail_limits_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LimitsFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/limits/api/navigation/LimitsFeatureConfig$Limits;", "Lcom/revolut/retail/feature/limits/api/navigation/LimitsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "com/revolut/retail/feature/limits/api/navigation/b", "feature_retail_limits_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Limits extends LimitsFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Limits> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f101778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AccountId f101779b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(b.valueOf(parcel.readString()));
                }
                return new Limits((AccountId) parcel.readParcelable(Limits.class.getClassLoader()), linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Limits[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Limits() {
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
            if (!(obj2 instanceof Limits)) {
                return false;
            }
            Limits limits = (Limits) obj2;
            return Intrinsics.f(this.f101778a, limits.f101778a) && Intrinsics.f(this.f101779b, limits.f101779b);
        }

        public final int hashCode() {
            return this.f101779b.hashCode() + (this.f101778a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f101778a, dest);
            while (itV.hasNext()) {
                dest.writeString(((b) itV.next()).name());
            }
            dest.writeParcelable(this.f101779b, i);
        }

        public Limits(AccountId accountId, Set limitTypes) {
            Intrinsics.checkNotNullParameter(limitTypes, "limitTypes");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f101778a = limitTypes;
            this.f101779b = accountId;
        }

        public /* synthetic */ Limits(Set set, AccountId.Joint joint, int i) {
            this((i & 2) != 0 ? AccountId.Personal.f51414a : joint, (i & 1) != 0 ? d.y0(b.values()) : set);
        }
    }

    private LimitsFeatureConfig() {
    }

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/limits/api/navigation/LimitsFeatureConfig$LimitPrompt;", "Lcom/revolut/retail/feature/limits/api/navigation/LimitsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "com/revolut/retail/feature/limits/api/navigation/a", "feature_retail_limits_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LimitPrompt extends LimitsFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<LimitPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.revolut.retail.feature.limits.api.navigation.a f101776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AccountId f101777b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LimitPrompt(com.revolut.retail.feature.limits.api.navigation.a.valueOf(parcel.readString()), (AccountId) parcel.readParcelable(LimitPrompt.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LimitPrompt[i];
            }
        }

        public LimitPrompt(com.revolut.retail.feature.limits.api.navigation.a limitType, AccountId accountId) {
            Intrinsics.checkNotNullParameter(limitType, "limitType");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f101776a = limitType;
            this.f101777b = accountId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LimitPrompt)) {
                return false;
            }
            LimitPrompt limitPrompt = (LimitPrompt) obj2;
            return this.f101776a == limitPrompt.f101776a && Intrinsics.f(this.f101777b, limitPrompt.f101777b);
        }

        public final int hashCode() {
            return this.f101777b.hashCode() + (this.f101776a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101776a.name());
            dest.writeParcelable(this.f101777b, i);
        }

        public /* synthetic */ LimitPrompt(com.revolut.retail.feature.limits.api.navigation.a aVar) {
            this(aVar, AccountId.Personal.f51414a);
        }
    }
}
