package com.revolut.feature.corporate_events.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import iel.e;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/corporate_events/navigation/CorporateEventsFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "CorporateEventsConfig", "Lcom/revolut/feature/corporate_events/navigation/CorporateEventsFeatureConfig$CorporateEventsConfig;", "feature_corporate_events_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CorporateEventsFeatureConfig extends FeatureConfig {

    /* JADX INFO: loaded from: classes21.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/corporate_events/navigation/CorporateEventsFeatureConfig$CorporateEventsConfig;", "Lcom/revolut/feature/corporate_events/navigation/CorporateEventsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_corporate_events_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CorporateEventsConfig implements CorporateEventsFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<CorporateEventsConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f66158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f66159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set f66160c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                LinkedHashSet linkedHashSet;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                boolean z = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet2.add(e.valueOf(parcel.readString()));
                    }
                    linkedHashSet = linkedHashSet2;
                }
                return new CorporateEventsConfig(string, linkedHashSet, z);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CorporateEventsConfig[i];
            }
        }

        public CorporateEventsConfig() {
            this(null, 7);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CorporateEventsConfig)) {
                return false;
            }
            CorporateEventsConfig corporateEventsConfig = (CorporateEventsConfig) obj2;
            return Intrinsics.f(this.f66158a, corporateEventsConfig.f66158a) && this.f66159b == corporateEventsConfig.f66159b && Intrinsics.f(this.f66160c, corporateEventsConfig.f66160c);
        }

        public final int hashCode() {
            String str = this.f66158a;
            int iC = j6.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f66159b);
            Set set = this.f66160c;
            return iC + (set != null ? set.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66158a);
            dest.writeInt(this.f66159b ? 1 : 0);
            Set set = this.f66160c;
            if (set == null) {
                dest.writeInt(0);
                return;
            }
            Iterator itQ = kii.e.q(dest, 1, set);
            while (itQ.hasNext()) {
                dest.writeString(((e) itQ.next()).name());
            }
        }

        public CorporateEventsConfig(String str, Set set, boolean z) {
            this.f66158a = str;
            this.f66159b = z;
            this.f66160c = set;
        }

        public /* synthetic */ CorporateEventsConfig(String str, int i) {
            this((i & 1) != 0 ? null : str, null, (i & 2) == 0);
        }
    }
}
