package com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.net.SyslogConstants;
import foa.x;
import foa.y;
import foa.z;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import soa.b;
import soa.c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/profile/screens/notification_setting_details/NotificationSettingsDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NotificationSettingsDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NotificationSettingsDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f81462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f81463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f81464c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f81465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f81466h;
    public final Boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f81467j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Boolean boolValueOf6;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            z zVarValueOf = z.valueOf(parcel.readString());
            boolean z4 = false;
            boolean z6 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z6 = z;
            }
            Boolean boolValueOf7 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0 ? z3 : z);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0 ? z3 : z);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0 ? z3 : z);
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0 ? z3 : z);
            }
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0 ? z3 : z);
            }
            if (parcel.readInt() == 0) {
                boolValueOf6 = null;
            } else {
                boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0 ? z3 : z);
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = z3;
                }
                boolValueOf7 = Boolean.valueOf(z);
            }
            return new NotificationSettingsDetails(zVarValueOf, z4, z6, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, boolValueOf6, boolValueOf7);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NotificationSettingsDetails[i];
        }
    }

    public NotificationSettingsDetails(z type, boolean z, boolean z3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f81462a = type;
        this.f81463b = z;
        this.f81464c = z3;
        this.d = bool;
        this.e = bool2;
        this.f = bool3;
        this.f81465g = bool4;
        this.f81466h = bool5;
        this.i = bool6;
        this.f81467j = bool7;
    }

    public static NotificationSettingsDetails a(NotificationSettingsDetails notificationSettingsDetails, boolean z, boolean z3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, int i) {
        z type = notificationSettingsDetails.f81462a;
        if ((i & 2) != 0) {
            z = notificationSettingsDetails.f81463b;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z3 = notificationSettingsDetails.f81464c;
        }
        boolean z6 = z3;
        if ((i & 8) != 0) {
            bool = notificationSettingsDetails.d;
        }
        Boolean bool7 = bool;
        Boolean bool8 = (i & 16) != 0 ? notificationSettingsDetails.e : bool2;
        Boolean bool9 = (i & 32) != 0 ? notificationSettingsDetails.f : bool3;
        Boolean bool10 = notificationSettingsDetails.f81465g;
        Boolean bool11 = (i & 128) != 0 ? notificationSettingsDetails.f81466h : bool4;
        Boolean bool12 = (i & 256) != 0 ? notificationSettingsDetails.i : bool5;
        Boolean bool13 = (i & 512) != 0 ? notificationSettingsDetails.f81467j : bool6;
        notificationSettingsDetails.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        return new NotificationSettingsDetails(type, z4, z6, bool7, bool8, bool9, bool10, bool11, bool12, bool13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NotificationSettingsDetails)) {
            return false;
        }
        NotificationSettingsDetails notificationSettingsDetails = (NotificationSettingsDetails) obj2;
        return this.f81462a == notificationSettingsDetails.f81462a && this.f81463b == notificationSettingsDetails.f81463b && this.f81464c == notificationSettingsDetails.f81464c && Intrinsics.f(this.d, notificationSettingsDetails.d) && Intrinsics.f(this.e, notificationSettingsDetails.e) && Intrinsics.f(this.f, notificationSettingsDetails.f) && Intrinsics.f(this.f81465g, notificationSettingsDetails.f81465g) && Intrinsics.f(this.f81466h, notificationSettingsDetails.f81466h) && Intrinsics.f(this.i, notificationSettingsDetails.i) && Intrinsics.f(this.f81467j, notificationSettingsDetails.f81467j);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(this.f81462a.hashCode() * 31, 31, this.f81463b), 31, this.f81464c);
        Boolean bool = this.d;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f81465g;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f81466h;
        int iHashCode5 = (iHashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.i;
        int iHashCode6 = (iHashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.f81467j;
        return iHashCode6 + (bool7 != null ? bool7.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81462a.name());
        dest.writeInt(this.f81463b ? 1 : 0);
        dest.writeInt(this.f81464c ? 1 : 0);
        Boolean bool = this.d;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        Boolean bool2 = this.e;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool2);
        }
        Boolean bool3 = this.f;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool3);
        }
        Boolean bool4 = this.f81465g;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool4);
        }
        Boolean bool5 = this.f81466h;
        if (bool5 == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool5);
        }
        Boolean bool6 = this.i;
        if (bool6 == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool6);
        }
        Boolean bool7 = this.f81467j;
        if (bool7 == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool7);
        }
    }

    public /* synthetic */ NotificationSettingsDetails(z zVar, boolean z, boolean z3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, int i) {
        this(zVar, z, z3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : bool4, (i & 128) != 0 ? null : bool5, (i & 256) != 0 ? null : bool6, (i & 512) != 0 ? null : bool7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NotificationSettingsDetails(b setting) {
        z zVar;
        Intrinsics.checkNotNullParameter(setting, "setting");
        y yVar = z.Companion;
        c type = setting.f264801a;
        yVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        switch (x.f136883a[type.ordinal()]) {
            case 1:
                zVar = z.MARKETING;
                break;
            case 2:
                zVar = z.REVOLUT_X_MARKETING;
                break;
            case 3:
                zVar = z.PERSONALIZED_THIRD_PARTY;
                break;
            case 4:
                zVar = z.TRADING_STOCKS_VOLATILITY;
                break;
            case 5:
                zVar = z.COMMODITY_VOLATILITY;
                break;
            case 6:
                zVar = z.CRYPTOCURRENCY_VOLATILITY;
                break;
            case 7:
                zVar = z.REVOLUT_PAY_DELIVERY_TRACKING;
                break;
            case 8:
                zVar = z.REVOLUT_PAY_FLIGHT_TRACKING;
                break;
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(type + " is not supported on details screen");
            default:
                throw new NoWhenBranchMatchedException();
        }
        this(zVar, setting.f264803c, setting.f264802b, null, null, null, setting.d, null, setting.e, setting.f, SyslogConstants.LOG_LOCAL7);
    }
}
