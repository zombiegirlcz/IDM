package com.revolut.feature.faq.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/faq/api/navigation/FaqFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "Categories", "Entry", "Starter", "Lcom/revolut/feature/faq/api/navigation/FaqFeatureConfig$Categories;", "Lcom/revolut/feature/faq/api/navigation/FaqFeatureConfig$Entry;", "Lcom/revolut/feature/faq/api/navigation/FaqFeatureConfig$Starter;", "feature_faq_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FaqFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/faq/api/navigation/FaqFeatureConfig$Categories;", "Lcom/revolut/feature/faq/api/navigation/FaqFeatureConfig;", "<init>", "()V", "feature_faq_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Categories extends FaqFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Categories f73117a = new Categories();

        @NotNull
        public static final Parcelable.Creator<Categories> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Categories.f73117a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Categories[i];
            }
        }

        private Categories() {
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

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/faq/api/navigation/FaqFeatureConfig$Entry;", "Lcom/revolut/feature/faq/api/navigation/FaqFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_faq_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Entry extends FaqFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Entry> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f73119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f73120c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Entry(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Entry[i];
            }
        }

        public Entry() {
            this(7);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj2;
            return Intrinsics.f(this.f73118a, entry.f73118a) && Intrinsics.f(this.f73119b, entry.f73119b) && Intrinsics.f(this.f73120c, entry.f73120c);
        }

        public final int hashCode() {
            return this.f73120c.hashCode() + p.a.c(this.f73118a.hashCode() * 31, 31, this.f73119b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73118a);
            dest.writeString(this.f73119b);
            dest.writeString(this.f73120c);
        }

        public Entry(String key, String title, String placement) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(placement, "placement");
            this.f73118a = key;
            this.f73119b = title;
            this.f73120c = placement;
        }

        public /* synthetic */ Entry(int i) {
            this((i & 1) != 0 ? "" : "be6943c1-47aa-494c-958c-bdb2e3acd657", "", "");
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/faq/api/navigation/FaqFeatureConfig$Starter;", "Lcom/revolut/feature/faq/api/navigation/FaqFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_faq_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Starter extends FaqFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Starter> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f73122b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Starter(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Starter[i];
            }
        }

        public Starter() {
            this((String) null, 3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Starter)) {
                return false;
            }
            Starter starter = (Starter) obj2;
            return Intrinsics.f(this.f73121a, starter.f73121a) && this.f73122b == starter.f73122b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f73122b) + (this.f73121a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73121a);
            dest.writeInt(this.f73122b ? 1 : 0);
        }

        public Starter(String key, boolean z) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f73121a = key;
            this.f73122b = z;
        }

        public /* synthetic */ Starter(String str, int i) {
            this((i & 1) != 0 ? "" : str, false);
        }
    }

    private FaqFeatureConfig() {
    }
}
