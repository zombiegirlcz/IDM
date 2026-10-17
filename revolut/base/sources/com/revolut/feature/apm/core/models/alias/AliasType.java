package com.revolut.feature.apm.core.models.alias;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/feature/apm/core/models/alias/AliasType;", "Landroid/os/Parcelable;", "Companion", "PHONE", "EMAIL", "REVTAG_EMAIL", "TAX_NUMBER", "ALPHANUMERIC", "DOCUMENT_ID", "a", "Lcom/revolut/feature/apm/core/models/alias/AliasType$ALPHANUMERIC;", "Lcom/revolut/feature/apm/core/models/alias/AliasType$DOCUMENT_ID;", "Lcom/revolut/feature/apm/core/models/alias/AliasType$EMAIL;", "Lcom/revolut/feature/apm/core/models/alias/AliasType$PHONE;", "Lcom/revolut/feature/apm/core/models/alias/AliasType$REVTAG_EMAIL;", "Lcom/revolut/feature/apm/core/models/alias/AliasType$TAX_NUMBER;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AliasType implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61891a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/alias/AliasType$ALPHANUMERIC;", "Lcom/revolut/feature/apm/core/models/alias/AliasType;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ALPHANUMERIC extends AliasType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ALPHANUMERIC f61892b = new ALPHANUMERIC();

        @NotNull
        public static final Parcelable.Creator<ALPHANUMERIC> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ALPHANUMERIC.f61892b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ALPHANUMERIC[i];
            }
        }

        private ALPHANUMERIC() {
            super("ALPHANUMERIC");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/alias/AliasType$DOCUMENT_ID;", "Lcom/revolut/feature/apm/core/models/alias/AliasType;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DOCUMENT_ID extends AliasType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final DOCUMENT_ID f61893b = new DOCUMENT_ID();

        @NotNull
        public static final Parcelable.Creator<DOCUMENT_ID> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DOCUMENT_ID.f61893b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DOCUMENT_ID[i];
            }
        }

        private DOCUMENT_ID() {
            super("DOCUMENT_ID");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/alias/AliasType$EMAIL;", "Lcom/revolut/feature/apm/core/models/alias/AliasType;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EMAIL extends AliasType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final EMAIL f61894b = new EMAIL();

        @NotNull
        public static final Parcelable.Creator<EMAIL> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EMAIL.f61894b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EMAIL[i];
            }
        }

        private EMAIL() {
            super("EMAIL");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/alias/AliasType$PHONE;", "Lcom/revolut/feature/apm/core/models/alias/AliasType;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PHONE extends AliasType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final PHONE f61895b = new PHONE();

        @NotNull
        public static final Parcelable.Creator<PHONE> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PHONE.f61895b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PHONE[i];
            }
        }

        private PHONE() {
            super("PHONE");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/alias/AliasType$REVTAG_EMAIL;", "Lcom/revolut/feature/apm/core/models/alias/AliasType;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class REVTAG_EMAIL extends AliasType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final REVTAG_EMAIL f61896b = new REVTAG_EMAIL();

        @NotNull
        public static final Parcelable.Creator<REVTAG_EMAIL> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return REVTAG_EMAIL.f61896b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new REVTAG_EMAIL[i];
            }
        }

        private REVTAG_EMAIL() {
            super("REVTAG_EMAIL");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/alias/AliasType$TAX_NUMBER;", "Lcom/revolut/feature/apm/core/models/alias/AliasType;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TAX_NUMBER extends AliasType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final TAX_NUMBER f61897b = new TAX_NUMBER();

        @NotNull
        public static final Parcelable.Creator<TAX_NUMBER> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TAX_NUMBER.f61897b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TAX_NUMBER[i];
            }
        }

        private TAX_NUMBER() {
            super("TAX_NUMBER");
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

    /* JADX INFO: renamed from: com.revolut.feature.apm.core.models.alias.AliasType$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static AliasType a(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            switch (name.hashCode()) {
                case -1635298625:
                    if (name.equals("DOCUMENT_ID")) {
                        return DOCUMENT_ID.f61893b;
                    }
                    return null;
                case -1371765123:
                    if (name.equals("TAX_NUMBER")) {
                        return TAX_NUMBER.f61897b;
                    }
                    return null;
                case 29302100:
                    if (name.equals("REVTAG_EMAIL")) {
                        return REVTAG_EMAIL.f61896b;
                    }
                    return null;
                case 66081660:
                    if (name.equals("EMAIL")) {
                        return EMAIL.f61894b;
                    }
                    return null;
                case 76105038:
                    if (name.equals("PHONE")) {
                        return PHONE.f61895b;
                    }
                    return null;
                case 1173269487:
                    if (name.equals("ALPHANUMERIC")) {
                        return ALPHANUMERIC.f61892b;
                    }
                    return null;
                default:
                    return null;
            }
        }
    }

    public AliasType(String str) {
        this.f61891a = str;
    }
}
