package com.revolut.sso.impl.ui.consolidation.continue_with_revolut;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.sso.impl.domain.models.UserInfoPicture;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/sso/impl/ui/consolidation/continue_with_revolut/ContinueWithRevolutScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Anonymous", "Identified", "Lcom/revolut/sso/impl/ui/consolidation/continue_with_revolut/ContinueWithRevolutScreenContract$InputData$Anonymous;", "Lcom/revolut/sso/impl/ui/consolidation/continue_with_revolut/ContinueWithRevolutScreenContract$InputData$Identified;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ContinueWithRevolutScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/consolidation/continue_with_revolut/ContinueWithRevolutScreenContract$InputData$Anonymous;", "Lcom/revolut/sso/impl/ui/consolidation/continue_with_revolut/ContinueWithRevolutScreenContract$InputData;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Anonymous implements ContinueWithRevolutScreenContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Anonymous f106488a = new Anonymous();

        @NotNull
        public static final Parcelable.Creator<Anonymous> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Anonymous.f106488a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Anonymous[i];
            }
        }

        private Anonymous() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/consolidation/continue_with_revolut/ContinueWithRevolutScreenContract$InputData$Identified;", "Lcom/revolut/sso/impl/ui/consolidation/continue_with_revolut/ContinueWithRevolutScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Identified implements ContinueWithRevolutScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Identified> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f106490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final UserInfoPicture f106491c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Identified(parcel.readString(), (Clause) parcel.readParcelable(Identified.class.getClassLoader()), parcel.readInt() == 0 ? null : UserInfoPicture.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Identified[i];
            }
        }

        public Identified(String name, Clause welcomeMessage, UserInfoPicture userInfoPicture) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(welcomeMessage, "welcomeMessage");
            this.f106489a = name;
            this.f106490b = welcomeMessage;
            this.f106491c = userInfoPicture;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Identified)) {
                return false;
            }
            Identified identified = (Identified) obj2;
            return Intrinsics.f(this.f106489a, identified.f106489a) && Intrinsics.f(this.f106490b, identified.f106490b) && Intrinsics.f(this.f106491c, identified.f106491c);
        }

        public final int hashCode() {
            int iA = p.a.a(this.f106489a.hashCode() * 31, 31, this.f106490b);
            UserInfoPicture userInfoPicture = this.f106491c;
            return iA + (userInfoPicture == null ? 0 : userInfoPicture.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106489a);
            dest.writeParcelable(this.f106490b, i);
            UserInfoPicture userInfoPicture = this.f106491c;
            if (userInfoPicture == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                userInfoPicture.writeToParcel(dest, i);
            }
        }
    }
}
