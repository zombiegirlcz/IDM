package com.revolut.feature.pix.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import ip0.v7;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/pix/api/model/PixKeyStatus;", "Landroid/os/Parcelable;", "Pending", "Active", "UnderPortability", "Lcom/revolut/feature/pix/api/model/PixKeyStatus$Active;", "Lcom/revolut/feature/pix/api/model/PixKeyStatus$Pending;", "Lcom/revolut/feature/pix/api/model/PixKeyStatus$UnderPortability;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PixKeyStatus extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/api/model/PixKeyStatus$Active;", "Lcom/revolut/feature/pix/api/model/PixKeyStatus;", "<init>", "()V", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Active implements PixKeyStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Active f80407a = new Active();

        @NotNull
        public static final Parcelable.Creator<Active> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Active.f80407a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Active[i];
            }
        }

        private Active() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/api/model/PixKeyStatus$Pending;", "Lcom/revolut/feature/pix/api/model/PixKeyStatus;", "<init>", "()V", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Pending implements PixKeyStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Pending f80408a = new Pending();

        @NotNull
        public static final Parcelable.Creator<Pending> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Pending.f80408a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pending[i];
            }
        }

        private Pending() {
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/pix/api/model/PixKeyStatus$UnderPortability;", "Lcom/revolut/feature/pix/api/model/PixKeyStatus;", "SameOwnership", "DifferentOwnership", "com/revolut/feature/pix/api/model/a", "Lcom/revolut/feature/pix/api/model/PixKeyStatus$UnderPortability$DifferentOwnership;", "Lcom/revolut/feature/pix/api/model/PixKeyStatus$UnderPortability$SameOwnership;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class UnderPortability implements PixKeyStatus {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/PixKeyStatus$UnderPortability$DifferentOwnership;", "Lcom/revolut/feature/pix/api/model/PixKeyStatus$UnderPortability;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DifferentOwnership extends UnderPortability {

            @NotNull
            public static final Parcelable.Creator<DifferentOwnership> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f80409a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final LocalDateTime f80410b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final LocalDateTime f80411c;
            public final com.revolut.feature.pix.api.model.a d;
            public final String e;
            public final boolean f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final LocalDateTime f80412g;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DifferentOwnership(parcel.readString(), (LocalDateTime) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable(), com.revolut.feature.pix.api.model.a.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, (LocalDateTime) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DifferentOwnership[i];
                }
            }

            public DifferentOwnership(String operationId, LocalDateTime expirationDate, LocalDateTime creationDate, com.revolut.feature.pix.api.model.a role, String institutionName, boolean z, LocalDateTime acceptClaimDeadlineDate) {
                Intrinsics.checkNotNullParameter(operationId, "operationId");
                Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
                Intrinsics.checkNotNullParameter(creationDate, "creationDate");
                Intrinsics.checkNotNullParameter(role, "role");
                Intrinsics.checkNotNullParameter(institutionName, "institutionName");
                Intrinsics.checkNotNullParameter(acceptClaimDeadlineDate, "acceptClaimDeadlineDate");
                this.f80409a = operationId;
                this.f80410b = expirationDate;
                this.f80411c = creationDate;
                this.d = role;
                this.e = institutionName;
                this.f = z;
                this.f80412g = acceptClaimDeadlineDate;
            }

            @Override // com.revolut.feature.pix.api.model.PixKeyStatus.UnderPortability
            /* JADX INFO: renamed from: a, reason: from getter */
            public final LocalDateTime getF80415c() {
                return this.f80411c;
            }

            @Override // com.revolut.feature.pix.api.model.PixKeyStatus.UnderPortability
            /* JADX INFO: renamed from: b, reason: from getter */
            public final LocalDateTime getF80414b() {
                return this.f80410b;
            }

            @Override // com.revolut.feature.pix.api.model.PixKeyStatus.UnderPortability
            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getE() {
                return this.e;
            }

            @Override // com.revolut.feature.pix.api.model.PixKeyStatus.UnderPortability
            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getF80413a() {
                return this.f80409a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.revolut.feature.pix.api.model.PixKeyStatus.UnderPortability
            /* JADX INFO: renamed from: e, reason: from getter */
            public final com.revolut.feature.pix.api.model.a getD() {
                return this.d;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof DifferentOwnership)) {
                    return false;
                }
                DifferentOwnership differentOwnership = (DifferentOwnership) obj2;
                return Intrinsics.f(this.f80409a, differentOwnership.f80409a) && Intrinsics.f(this.f80410b, differentOwnership.f80410b) && Intrinsics.f(this.f80411c, differentOwnership.f80411c) && this.d == differentOwnership.d && Intrinsics.f(this.e, differentOwnership.e) && this.f == differentOwnership.f && Intrinsics.f(this.f80412g, differentOwnership.f80412g);
            }

            public final int hashCode() {
                return this.f80412g.hashCode() + j6.a.c(p.a.c((this.d.hashCode() + v7.i(this.f80411c, v7.i(this.f80410b, this.f80409a.hashCode() * 31, 31), 31)) * 31, 31, this.e), 31, this.f);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f80409a);
                dest.writeSerializable(this.f80410b);
                dest.writeSerializable(this.f80411c);
                dest.writeString(this.d.name());
                dest.writeString(this.e);
                dest.writeInt(this.f ? 1 : 0);
                dest.writeSerializable(this.f80412g);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/PixKeyStatus$UnderPortability$SameOwnership;", "Lcom/revolut/feature/pix/api/model/PixKeyStatus$UnderPortability;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SameOwnership extends UnderPortability {

            @NotNull
            public static final Parcelable.Creator<SameOwnership> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f80413a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final LocalDateTime f80414b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final LocalDateTime f80415c;
            public final com.revolut.feature.pix.api.model.a d;
            public final String e;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SameOwnership(parcel.readString(), (LocalDateTime) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable(), com.revolut.feature.pix.api.model.a.valueOf(parcel.readString()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SameOwnership[i];
                }
            }

            public SameOwnership(String operationId, LocalDateTime expirationDate, LocalDateTime creationDate, com.revolut.feature.pix.api.model.a role, String institutionName) {
                Intrinsics.checkNotNullParameter(operationId, "operationId");
                Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
                Intrinsics.checkNotNullParameter(creationDate, "creationDate");
                Intrinsics.checkNotNullParameter(role, "role");
                Intrinsics.checkNotNullParameter(institutionName, "institutionName");
                this.f80413a = operationId;
                this.f80414b = expirationDate;
                this.f80415c = creationDate;
                this.d = role;
                this.e = institutionName;
            }

            @Override // com.revolut.feature.pix.api.model.PixKeyStatus.UnderPortability
            /* JADX INFO: renamed from: a, reason: from getter */
            public final LocalDateTime getF80415c() {
                return this.f80415c;
            }

            @Override // com.revolut.feature.pix.api.model.PixKeyStatus.UnderPortability
            /* JADX INFO: renamed from: b, reason: from getter */
            public final LocalDateTime getF80414b() {
                return this.f80414b;
            }

            @Override // com.revolut.feature.pix.api.model.PixKeyStatus.UnderPortability
            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getE() {
                return this.e;
            }

            @Override // com.revolut.feature.pix.api.model.PixKeyStatus.UnderPortability
            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getF80413a() {
                return this.f80413a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.revolut.feature.pix.api.model.PixKeyStatus.UnderPortability
            /* JADX INFO: renamed from: e, reason: from getter */
            public final com.revolut.feature.pix.api.model.a getD() {
                return this.d;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof SameOwnership)) {
                    return false;
                }
                SameOwnership sameOwnership = (SameOwnership) obj2;
                return Intrinsics.f(this.f80413a, sameOwnership.f80413a) && Intrinsics.f(this.f80414b, sameOwnership.f80414b) && Intrinsics.f(this.f80415c, sameOwnership.f80415c) && this.d == sameOwnership.d && Intrinsics.f(this.e, sameOwnership.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + ((this.d.hashCode() + v7.i(this.f80415c, v7.i(this.f80414b, this.f80413a.hashCode() * 31, 31), 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f80413a);
                dest.writeSerializable(this.f80414b);
                dest.writeSerializable(this.f80415c);
                dest.writeString(this.d.name());
                dest.writeString(this.e);
            }
        }

        /* JADX INFO: renamed from: a */
        public abstract LocalDateTime getF80415c();

        /* JADX INFO: renamed from: b */
        public abstract LocalDateTime getF80414b();

        /* JADX INFO: renamed from: c */
        public abstract String getE();

        /* JADX INFO: renamed from: d */
        public abstract String getF80413a();

        /* JADX INFO: renamed from: e */
        public abstract a getD();
    }
}
