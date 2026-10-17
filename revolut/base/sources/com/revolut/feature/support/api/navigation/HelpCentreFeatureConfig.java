package com.revolut.feature.support.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/support/api/navigation/HelpCentreFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "Topic", "TransactionTroubleshooting", "Lcom/revolut/feature/support/api/navigation/HelpCentreFeatureConfig$Topic;", "Lcom/revolut/feature/support/api/navigation/HelpCentreFeatureConfig$TransactionTroubleshooting;", "feature_support_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class HelpCentreFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/support/api/navigation/HelpCentreFeatureConfig$Topic;", "Lcom/revolut/feature/support/api/navigation/HelpCentreFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_support_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Topic extends HelpCentreFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Topic> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f89351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f89352b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Topic(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Topic[i];
            }
        }

        public Topic(String key, String sourceTracking) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(sourceTracking, "sourceTracking");
            this.f89351a = key;
            this.f89352b = sourceTracking;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Topic)) {
                return false;
            }
            Topic topic = (Topic) obj2;
            return Intrinsics.f(this.f89351a, topic.f89351a) && Intrinsics.f(this.f89352b, topic.f89352b);
        }

        public final int hashCode() {
            return this.f89352b.hashCode() + (this.f89351a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f89351a);
            dest.writeString(this.f89352b);
        }
    }

    private HelpCentreFeatureConfig() {
    }

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/support/api/navigation/HelpCentreFeatureConfig$TransactionTroubleshooting;", "Lcom/revolut/feature/support/api/navigation/HelpCentreFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_support_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionTroubleshooting extends HelpCentreFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<TransactionTroubleshooting> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f89353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f89354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f89355c;
        public final List d;
        public final String e;
        public final boolean f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionTroubleshooting(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionTroubleshooting[i];
            }
        }

        public TransactionTroubleshooting(String str, String transactionGroupId, List list, String str2, String str3, boolean z) {
            Intrinsics.checkNotNullParameter(transactionGroupId, "transactionGroupId");
            this.f89353a = str;
            this.f89354b = transactionGroupId;
            this.f89355c = str2;
            this.d = list;
            this.e = str3;
            this.f = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TransactionTroubleshooting)) {
                return false;
            }
            TransactionTroubleshooting transactionTroubleshooting = (TransactionTroubleshooting) obj2;
            return Intrinsics.f(this.f89353a, transactionTroubleshooting.f89353a) && Intrinsics.f(this.f89354b, transactionTroubleshooting.f89354b) && Intrinsics.f(this.f89355c, transactionTroubleshooting.f89355c) && Intrinsics.f(this.d, transactionTroubleshooting.d) && Intrinsics.f(this.e, transactionTroubleshooting.e) && this.f == transactionTroubleshooting.f;
        }

        public final int hashCode() {
            String str = this.f89353a;
            int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f89354b);
            String str2 = this.f89355c;
            int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            List list = this.d;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str3 = this.e;
            return Boolean.hashCode(this.f) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f89353a);
            dest.writeString(this.f89354b);
            dest.writeString(this.f89355c);
            dest.writeStringList(this.d);
            dest.writeString(this.e);
            dest.writeInt(this.f ? 1 : 0);
        }

        public /* synthetic */ TransactionTroubleshooting(int i, String str, String str2, String str3, List list) {
            this(null, str, (i & 8) != 0 ? null : list, (i & 4) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) == 0);
        }
    }
}
