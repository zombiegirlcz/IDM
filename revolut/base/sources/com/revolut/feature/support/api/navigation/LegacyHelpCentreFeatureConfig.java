package com.revolut.feature.support.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/feature/support/api/navigation/LegacyHelpCentreFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "HelpCentre", "Search", "Community", "Blog", "Chat", "SystemStatus", "Lcom/revolut/feature/support/api/navigation/LegacyHelpCentreFeatureConfig$Blog;", "Lcom/revolut/feature/support/api/navigation/LegacyHelpCentreFeatureConfig$Chat;", "Lcom/revolut/feature/support/api/navigation/LegacyHelpCentreFeatureConfig$Community;", "Lcom/revolut/feature/support/api/navigation/LegacyHelpCentreFeatureConfig$HelpCentre;", "Lcom/revolut/feature/support/api/navigation/LegacyHelpCentreFeatureConfig$Search;", "Lcom/revolut/feature/support/api/navigation/LegacyHelpCentreFeatureConfig$SystemStatus;", "feature_support_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LegacyHelpCentreFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/support/api/navigation/LegacyHelpCentreFeatureConfig$Blog;", "Lcom/revolut/feature/support/api/navigation/LegacyHelpCentreFeatureConfig;", "<init>", "()V", "feature_support_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Blog extends LegacyHelpCentreFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Blog f89357a = new Blog();

        @NotNull
        public static final Parcelable.Creator<Blog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Blog.f89357a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Blog[i];
            }
        }

        private Blog() {
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

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/support/api/navigation/LegacyHelpCentreFeatureConfig$Chat;", "Lcom/revolut/feature/support/api/navigation/LegacyHelpCentreFeatureConfig;", "<init>", "()V", "feature_support_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Chat extends LegacyHelpCentreFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Chat f89358a = new Chat();

        @NotNull
        public static final Parcelable.Creator<Chat> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Chat.f89358a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Chat[i];
            }
        }

        private Chat() {
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

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/support/api/navigation/LegacyHelpCentreFeatureConfig$Community;", "Lcom/revolut/feature/support/api/navigation/LegacyHelpCentreFeatureConfig;", "<init>", "()V", "feature_support_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Community extends LegacyHelpCentreFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Community f89359a = new Community();

        @NotNull
        public static final Parcelable.Creator<Community> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Community.f89359a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Community[i];
            }
        }

        private Community() {
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

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/support/api/navigation/LegacyHelpCentreFeatureConfig$HelpCentre;", "Lcom/revolut/feature/support/api/navigation/LegacyHelpCentreFeatureConfig;", "<init>", "()V", "feature_support_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HelpCentre extends LegacyHelpCentreFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HelpCentre f89360a = new HelpCentre();

        @NotNull
        public static final Parcelable.Creator<HelpCentre> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HelpCentre.f89360a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HelpCentre[i];
            }
        }

        private HelpCentre() {
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

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/support/api/navigation/LegacyHelpCentreFeatureConfig$Search;", "Lcom/revolut/feature/support/api/navigation/LegacyHelpCentreFeatureConfig;", "<init>", "()V", "feature_support_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Search extends LegacyHelpCentreFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Search f89361a = new Search();

        @NotNull
        public static final Parcelable.Creator<Search> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Search.f89361a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Search[i];
            }
        }

        private Search() {
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

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/support/api/navigation/LegacyHelpCentreFeatureConfig$SystemStatus;", "Lcom/revolut/feature/support/api/navigation/LegacyHelpCentreFeatureConfig;", "<init>", "()V", "feature_support_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SystemStatus extends LegacyHelpCentreFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SystemStatus f89362a = new SystemStatus();

        @NotNull
        public static final Parcelable.Creator<SystemStatus> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SystemStatus.f89362a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SystemStatus[i];
            }
        }

        private SystemStatus() {
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

    private LegacyHelpCentreFeatureConfig() {
    }
}
