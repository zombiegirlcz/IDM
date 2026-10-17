package com.revolut.sso.impl.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/sso/impl/domain/models/ClaimToManage;", "Landroid/os/Parcelable;", "WebAuthn", "Unknown", "gkl/n", "Lcom/revolut/sso/impl/domain/models/ClaimToManage$Unknown;", "Lcom/revolut/sso/impl/domain/models/ClaimToManage$WebAuthn;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ClaimToManage extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/domain/models/ClaimToManage$Unknown;", "Lcom/revolut/sso/impl/domain/models/ClaimToManage;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Unknown implements ClaimToManage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unknown f106140a = new Unknown();

        @NotNull
        public static final Parcelable.Creator<Unknown> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Unknown.f106140a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unknown[i];
            }
        }

        private Unknown() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/domain/models/ClaimToManage$WebAuthn;", "Lcom/revolut/sso/impl/domain/models/ClaimToManage;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WebAuthn implements ClaimToManage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f106142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ZonedDateTime f106143c;

        @NotNull
        public static final Parcelable.Creator<WebAuthn> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WebAuthn(parcel.readString(), parcel.readString(), (ZonedDateTime) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WebAuthn[i];
            }
        }

        public WebAuthn(String id10, String description, ZonedDateTime createdDate) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(createdDate, "createdDate");
            this.f106141a = id10;
            this.f106142b = description;
            this.f106143c = createdDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WebAuthn)) {
                return false;
            }
            WebAuthn webAuthn = (WebAuthn) obj2;
            return Intrinsics.f(this.f106141a, webAuthn.f106141a) && Intrinsics.f(this.f106142b, webAuthn.f106142b) && Intrinsics.f(this.f106143c, webAuthn.f106143c);
        }

        public final int hashCode() {
            return this.f106143c.hashCode() + p.a.c(this.f106141a.hashCode() * 31, 31, this.f106142b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106141a);
            dest.writeString(this.f106142b);
            dest.writeSerializable(this.f106143c);
        }
    }
}
