package com.revolut.sso.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/api/models/UserInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserInfo implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f105990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f105991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f105992c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f105993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f105994h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f105995j;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<UserInfo> CREATOR = new b();
    public static final UserInfo k = new UserInfo((UUID) null, (LinkedHashSet) null, (UUID) null, (String) null, (String) null, (String) null, (Boolean) null, (Integer) null, (Integer) null, 1023);

    /* JADX INFO: renamed from: com.revolut.sso.api.models.UserInfo$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static void a() {
            Companion companion = UserInfo.INSTANCE;
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashSet linkedHashSet;
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            UUID uuid = (UUID) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int i = parcel.readInt();
                linkedHashSet = new LinkedHashSet(i);
                int iE = 0;
                while (iE != i) {
                    iE = d.e(UserInfo.class, parcel, linkedHashSet, iE, 1);
                }
            }
            UUID uuid2 = (UUID) parcel.readSerializable();
            LinkedHashSet linkedHashSet2 = linkedHashSet;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UserInfo(uuid, linkedHashSet2, uuid2, string, string2, string3, boolValueOf, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, 256);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UserInfo[i];
        }
    }

    public UserInfo() {
        this((UUID) null, (LinkedHashSet) null, (UUID) null, (String) null, (String) null, (String) null, (Boolean) null, (Integer) null, (Integer) null, 1023);
    }

    /* JADX INFO: renamed from: D5, reason: from getter */
    public final Integer getF105995j() {
        return this.f105995j;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getF105993g() {
        return this.f105993g;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final UUID getF105992c() {
        return this.f105992c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final UUID getF105990a() {
        return this.f105990a;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getF105994h() {
        return this.f105994h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) obj2;
        return Intrinsics.f(this.f105990a, userInfo.f105990a) && Intrinsics.f(this.f105991b, userInfo.f105991b) && Intrinsics.f(this.f105992c, userInfo.f105992c) && Intrinsics.f(this.d, userInfo.d) && Intrinsics.f(this.e, userInfo.e) && Intrinsics.f(this.f, userInfo.f) && Intrinsics.f(this.f105993g, userInfo.f105993g) && Intrinsics.f(this.f105994h, userInfo.f105994h) && Intrinsics.f(this.i, userInfo.i) && Intrinsics.f(this.f105995j, userInfo.f105995j);
    }

    /* JADX INFO: renamed from: getEmail, reason: from getter */
    public final String getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: getPhone, reason: from getter */
    public final String getE() {
        return this.e;
    }

    public final int hashCode() {
        UUID uuid = this.f105990a;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        Set set = this.f105991b;
        int iHashCode2 = (iHashCode + (set == null ? 0 : set.hashCode())) * 31;
        UUID uuid2 = this.f105992c;
        int iHashCode3 = (iHashCode2 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f105993g;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f105994h;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.f105995j;
        return iHashCode9 + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getI() {
        return this.i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f105990a);
        Set set = this.f105991b;
        if (set == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = e.q(dest, 1, set);
            while (itQ.hasNext()) {
                dest.writeParcelable((Parcelable) itQ.next(), i);
            }
        }
        dest.writeSerializable(this.f105992c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        Boolean bool = this.f105993g;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        Integer num = this.f105994h;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Integer num2 = this.f105995j;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final Set getF105991b() {
        return this.f105991b;
    }

    public UserInfo(UUID uuid, Set set, UUID uuid2, String str, String str2, String str3, Boolean bool, Integer num, String str4, Integer num2) {
        this.f105990a = uuid;
        this.f105991b = set;
        this.f105992c = uuid2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.f105993g = bool;
        this.f105994h = num;
        this.i = str4;
        this.f105995j = num2;
    }

    public /* synthetic */ UserInfo(UUID uuid, LinkedHashSet linkedHashSet, UUID uuid2, String str, String str2, String str3, Boolean bool, Integer num, Integer num2, int i) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : linkedHashSet, (i & 4) != 0 ? null : uuid2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : num, (String) null, (i & 512) != 0 ? null : num2);
    }
}
