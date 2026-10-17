package com.revolut.sso.impl.ui.auth_rejected;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import ehe.n;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import jkl.a3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/sso/impl/ui/auth_rejected/AuthenticationRejectedFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "NoActionsAvailable", "PrimaryActionAvailable", "FallbackActionsAvailable", "PrimaryAndFallbackActionsAvailable", "Lcom/revolut/sso/impl/ui/auth_rejected/AuthenticationRejectedFlowContract$Step$FallbackActionsAvailable;", "Lcom/revolut/sso/impl/ui/auth_rejected/AuthenticationRejectedFlowContract$Step$NoActionsAvailable;", "Lcom/revolut/sso/impl/ui/auth_rejected/AuthenticationRejectedFlowContract$Step$PrimaryActionAvailable;", "Lcom/revolut/sso/impl/ui/auth_rejected/AuthenticationRejectedFlowContract$Step$PrimaryAndFallbackActionsAvailable;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AuthenticationRejectedFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/auth_rejected/AuthenticationRejectedFlowContract$Step$FallbackActionsAvailable;", "Lcom/revolut/sso/impl/ui/auth_rejected/AuthenticationRejectedFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FallbackActionsAvailable extends AuthenticationRejectedFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FallbackActionsAvailable> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ZonedDateTime f106385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f106386b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ZonedDateTime zonedDateTime = (ZonedDateTime) parcel.readSerializable();
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(a3.valueOf(parcel.readString()));
                }
                return new FallbackActionsAvailable(zonedDateTime, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FallbackActionsAvailable[i];
            }
        }

        public FallbackActionsAvailable(ZonedDateTime cooldown, Set actions) {
            Intrinsics.checkNotNullParameter(cooldown, "cooldown");
            Intrinsics.checkNotNullParameter(actions, "actions");
            this.f106385a = cooldown;
            this.f106386b = actions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FallbackActionsAvailable)) {
                return false;
            }
            FallbackActionsAvailable fallbackActionsAvailable = (FallbackActionsAvailable) obj2;
            return Intrinsics.f(this.f106385a, fallbackActionsAvailable.f106385a) && Intrinsics.f(this.f106386b, fallbackActionsAvailable.f106386b);
        }

        public final int hashCode() {
            return this.f106386b.hashCode() + (this.f106385a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f106385a);
            Iterator itV = n.v(this.f106386b, dest);
            while (itV.hasNext()) {
                dest.writeString(((a3) itV.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/auth_rejected/AuthenticationRejectedFlowContract$Step$NoActionsAvailable;", "Lcom/revolut/sso/impl/ui/auth_rejected/AuthenticationRejectedFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NoActionsAvailable extends AuthenticationRejectedFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<NoActionsAvailable> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ZonedDateTime f106387a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NoActionsAvailable((ZonedDateTime) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoActionsAvailable[i];
            }
        }

        public NoActionsAvailable(ZonedDateTime cooldown) {
            Intrinsics.checkNotNullParameter(cooldown, "cooldown");
            this.f106387a = cooldown;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NoActionsAvailable) && Intrinsics.f(this.f106387a, ((NoActionsAvailable) obj2).f106387a);
        }

        public final int hashCode() {
            return this.f106387a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f106387a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/auth_rejected/AuthenticationRejectedFlowContract$Step$PrimaryActionAvailable;", "Lcom/revolut/sso/impl/ui/auth_rejected/AuthenticationRejectedFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PrimaryActionAvailable extends AuthenticationRejectedFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PrimaryActionAvailable> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f106388a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PrimaryActionAvailable(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrimaryActionAvailable[i];
            }
        }

        public PrimaryActionAvailable(int i) {
            this.f106388a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PrimaryActionAvailable) && this.f106388a == ((PrimaryActionAvailable) obj2).f106388a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f106388a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f106388a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/auth_rejected/AuthenticationRejectedFlowContract$Step$PrimaryAndFallbackActionsAvailable;", "Lcom/revolut/sso/impl/ui/auth_rejected/AuthenticationRejectedFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PrimaryAndFallbackActionsAvailable extends AuthenticationRejectedFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PrimaryAndFallbackActionsAvailable> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f106389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f106390b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(a3.valueOf(parcel.readString()));
                }
                return new PrimaryAndFallbackActionsAvailable(parcel.readInt(), linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrimaryAndFallbackActionsAvailable[i];
            }
        }

        public PrimaryAndFallbackActionsAvailable(int i, Set actions) {
            Intrinsics.checkNotNullParameter(actions, "actions");
            this.f106389a = actions;
            this.f106390b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PrimaryAndFallbackActionsAvailable)) {
                return false;
            }
            PrimaryAndFallbackActionsAvailable primaryAndFallbackActionsAvailable = (PrimaryAndFallbackActionsAvailable) obj2;
            return Intrinsics.f(this.f106389a, primaryAndFallbackActionsAvailable.f106389a) && this.f106390b == primaryAndFallbackActionsAvailable.f106390b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f106390b) + (this.f106389a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f106389a, dest);
            while (itV.hasNext()) {
                dest.writeString(((a3) itV.next()).name());
            }
            dest.writeInt(this.f106390b);
        }
    }

    private AuthenticationRejectedFlowContract$Step() {
    }
}
