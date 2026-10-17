package com.revolut.feature.apm.core.models.alias;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/feature/apm/core/models/alias/AliasStatus;", "Landroid/os/Parcelable;", "Companion", "AVAILABLE", "ACTIVE", "PENDING", "DISABLED", "BLOCKED", "OCCUPIED", "a", "Lcom/revolut/feature/apm/core/models/alias/AliasStatus$ACTIVE;", "Lcom/revolut/feature/apm/core/models/alias/AliasStatus$AVAILABLE;", "Lcom/revolut/feature/apm/core/models/alias/AliasStatus$BLOCKED;", "Lcom/revolut/feature/apm/core/models/alias/AliasStatus$DISABLED;", "Lcom/revolut/feature/apm/core/models/alias/AliasStatus$OCCUPIED;", "Lcom/revolut/feature/apm/core/models/alias/AliasStatus$PENDING;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AliasStatus implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61884a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/alias/AliasStatus$ACTIVE;", "Lcom/revolut/feature/apm/core/models/alias/AliasStatus;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ACTIVE extends AliasStatus {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ACTIVE f61885b = new ACTIVE();

        @NotNull
        public static final Parcelable.Creator<ACTIVE> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ACTIVE.f61885b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ACTIVE[i];
            }
        }

        private ACTIVE() {
            super("ACTIVE");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/alias/AliasStatus$AVAILABLE;", "Lcom/revolut/feature/apm/core/models/alias/AliasStatus;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AVAILABLE extends AliasStatus {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final AVAILABLE f61886b = new AVAILABLE();

        @NotNull
        public static final Parcelable.Creator<AVAILABLE> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AVAILABLE.f61886b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AVAILABLE[i];
            }
        }

        private AVAILABLE() {
            super("AVAILABLE");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/alias/AliasStatus$BLOCKED;", "Lcom/revolut/feature/apm/core/models/alias/AliasStatus;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BLOCKED extends AliasStatus {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final BLOCKED f61887b = new BLOCKED();

        @NotNull
        public static final Parcelable.Creator<BLOCKED> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BLOCKED.f61887b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BLOCKED[i];
            }
        }

        private BLOCKED() {
            super("BLOCKED");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/alias/AliasStatus$DISABLED;", "Lcom/revolut/feature/apm/core/models/alias/AliasStatus;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DISABLED extends AliasStatus {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final DISABLED f61888b = new DISABLED();

        @NotNull
        public static final Parcelable.Creator<DISABLED> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DISABLED.f61888b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DISABLED[i];
            }
        }

        private DISABLED() {
            super("DISABLED");
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/alias/AliasStatus$OCCUPIED;", "Lcom/revolut/feature/apm/core/models/alias/AliasStatus;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OCCUPIED extends AliasStatus {

        @NotNull
        public static final Parcelable.Creator<OCCUPIED> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f61889b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OCCUPIED(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OCCUPIED[i];
            }
        }

        public OCCUPIED(String str) {
            super("OCCUPIED");
            this.f61889b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OCCUPIED) && Intrinsics.f(this.f61889b, ((OCCUPIED) obj2).f61889b);
        }

        public final int hashCode() {
            String str = this.f61889b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61889b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/alias/AliasStatus$PENDING;", "Lcom/revolut/feature/apm/core/models/alias/AliasStatus;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PENDING extends AliasStatus {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final PENDING f61890b = new PENDING();

        @NotNull
        public static final Parcelable.Creator<PENDING> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PENDING.f61890b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PENDING[i];
            }
        }

        private PENDING() {
            super("PENDING");
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

    /* JADX INFO: renamed from: com.revolut.feature.apm.core.models.alias.AliasStatus$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static AliasStatus a(String statusName, String str) {
            Intrinsics.checkNotNullParameter(statusName, "statusName");
            switch (statusName.hashCode()) {
                case 35394935:
                    if (statusName.equals("PENDING")) {
                        return PENDING.f61890b;
                    }
                    return null;
                case 696544716:
                    if (statusName.equals("BLOCKED")) {
                        return BLOCKED.f61887b;
                    }
                    return null;
                case 1053567612:
                    if (statusName.equals("DISABLED")) {
                        return DISABLED.f61888b;
                    }
                    return null;
                case 1575375518:
                    if (statusName.equals("OCCUPIED")) {
                        return new OCCUPIED(str);
                    }
                    return null;
                case 1925346054:
                    if (statusName.equals("ACTIVE")) {
                        return ACTIVE.f61885b;
                    }
                    return null;
                case 2052692649:
                    if (statusName.equals("AVAILABLE")) {
                        return AVAILABLE.f61886b;
                    }
                    return null;
                default:
                    return null;
            }
        }
    }

    public AliasStatus(String str) {
        this.f61884a = str;
    }
}
