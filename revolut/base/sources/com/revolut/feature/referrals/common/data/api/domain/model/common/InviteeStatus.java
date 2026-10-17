package com.revolut.feature.referrals.common.data.api.domain.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/referrals/common/data/api/domain/model/common/InviteeStatus;", "Landroid/os/Parcelable;", "Companion", "a", "Absent", "Present", "Lcom/revolut/feature/referrals/common/data/api/domain/model/common/InviteeStatus$Absent;", "Lcom/revolut/feature/referrals/common/data/api/domain/model/common/InviteeStatus$Present;", "feature_shared_referrals_common_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InviteeStatus extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f81737a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/referrals/common/data/api/domain/model/common/InviteeStatus$Absent;", "Lcom/revolut/feature/referrals/common/data/api/domain/model/common/InviteeStatus;", "<init>", "()V", "feature_shared_referrals_common_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Absent implements InviteeStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Absent f81733a = new Absent();

        @NotNull
        public static final Parcelable.Creator<Absent> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Absent.f81733a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Absent[i];
            }
        }

        private Absent() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/referrals/common/data/api/domain/model/common/InviteeStatus$Present;", "Lcom/revolut/feature/referrals/common/data/api/domain/model/common/InviteeStatus;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_shared_referrals_common_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Present implements InviteeStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Referrer f81734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PromoContent f81735b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Instant f81736c;
        public final d d;
        public final pwa.d e;

        @NotNull
        public static final Parcelable.Creator<Present> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Present(Referrer.CREATOR.createFromParcel(parcel), PromoContent.CREATOR.createFromParcel(parcel), (Instant) parcel.readSerializable(), (d) parcel.readSerializable(), pwa.d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Present[i];
            }
        }

        public Present(Referrer referrer, PromoContent promoContent, Instant deadline, d dVar, pwa.d inviteState) {
            Intrinsics.checkNotNullParameter(referrer, "referrer");
            Intrinsics.checkNotNullParameter(promoContent, "promoContent");
            Intrinsics.checkNotNullParameter(deadline, "deadline");
            Intrinsics.checkNotNullParameter(inviteState, "inviteState");
            this.f81734a = referrer;
            this.f81735b = promoContent;
            this.f81736c = deadline;
            this.d = dVar;
            this.e = inviteState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Present)) {
                return false;
            }
            Present present = (Present) obj2;
            return Intrinsics.f(this.f81734a, present.f81734a) && Intrinsics.f(this.f81735b, present.f81735b) && Intrinsics.f(this.f81736c, present.f81736c) && Intrinsics.f(this.d, present.d) && this.e == present.e;
        }

        public final int hashCode() {
            int iC = r6.b.c(a.c(this.f81734a.hashCode() * 31, 31, this.f81735b.f81751a), 31, this.f81736c);
            d dVar = this.d;
            return this.e.hashCode() + ((iC + (dVar == null ? 0 : dVar.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f81734a.writeToParcel(dest, i);
            this.f81735b.writeToParcel(dest, i);
            dest.writeSerializable(this.f81736c);
            dest.writeSerializable(this.d);
            dest.writeString(this.e.name());
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.referrals.common.data.api.domain.model.common.InviteeStatus$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f81737a = new Companion();

        private Companion() {
        }
    }
}
