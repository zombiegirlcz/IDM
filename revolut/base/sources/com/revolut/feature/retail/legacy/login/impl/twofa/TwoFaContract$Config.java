package com.revolut.feature.retail.legacy.login.impl.twofa;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.login.ChannelType;
import com.revolut.feature.retail.legacy.login.impl.signsms.SignSmsScreenContract$SignSmsConfiguration;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sab.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/legacy/login/impl/twofa/TwoFaContract$Config", "Lcom/revolut/feature/retail/legacy/login/impl/signsms/SignSmsScreenContract$SignSmsConfiguration;", "", "toString", "()Ljava/lang/String;", "feature_retail_legacy_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TwoFaContract$Config implements SignSmsScreenContract$SignSmsConfiguration {

    @NotNull
    public static final Parcelable.Creator<TwoFaContract$Config> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f82720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChannelType f82721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f82722c;
    public final String d;
    public final String e;
    public final p61.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f82723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f82724h;
    public final boolean i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            p61.b bVar;
            boolean z4;
            ArrayList<String> arrayList;
            boolean z6;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z11 = true;
            } else {
                z = false;
            }
            ChannelType channelTypeValueOf = ChannelType.valueOf(parcel.readString());
            b bVarValueOf = b.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            p61.b bVar2 = (p61.b) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                z3 = true;
                bVar = bVar2;
                z4 = true;
            } else {
                z3 = true;
                bVar = bVar2;
                z4 = z;
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                z6 = z3;
                arrayList = arrayListCreateStringArrayList;
            } else {
                arrayList = arrayListCreateStringArrayList;
                z6 = z;
            }
            return new TwoFaContract$Config(z11, channelTypeValueOf, bVarValueOf, string, string2, bVar, z4, arrayList, z6);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TwoFaContract$Config[i];
        }
    }

    public TwoFaContract$Config(boolean z, ChannelType initialStep, b mode, String str, String str2, p61.b bVar, boolean z3, List list, boolean z4) {
        Intrinsics.checkNotNullParameter(initialStep, "initialStep");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f82720a = z;
        this.f82721b = initialStep;
        this.f82722c = mode;
        this.d = str;
        this.e = str2;
        this.f = bVar;
        this.f82723g = z3;
        this.f82724h = list;
        this.i = z4;
    }

    @Override // com.revolut.feature.retail.legacy.login.impl.signsms.SignSmsScreenContract$SignSmsConfiguration
    /* JADX INFO: renamed from: F4, reason: from getter */
    public final boolean getI() {
        return this.i;
    }

    @Override // com.revolut.feature.retail.legacy.login.impl.signsms.SignSmsScreenContract$SignSmsConfiguration
    /* JADX INFO: renamed from: M, reason: from getter */
    public final b getF82722c() {
        return this.f82722c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TwoFaContract$Config)) {
            return false;
        }
        TwoFaContract$Config twoFaContract$Config = (TwoFaContract$Config) obj2;
        return this.f82720a == twoFaContract$Config.f82720a && this.f82721b == twoFaContract$Config.f82721b && this.f82722c == twoFaContract$Config.f82722c && Intrinsics.f(this.d, twoFaContract$Config.d) && Intrinsics.f(this.e, twoFaContract$Config.e) && Intrinsics.f(this.f, twoFaContract$Config.f) && this.f82723g == twoFaContract$Config.f82723g && Intrinsics.f(this.f82724h, twoFaContract$Config.f82724h) && this.i == twoFaContract$Config.i;
    }

    @Override // com.revolut.feature.retail.legacy.login.impl.signsms.SignSmsScreenContract$SignSmsConfiguration
    /* JADX INFO: renamed from: getPhone, reason: from getter */
    public final String getE() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = (this.f82722c.hashCode() + ((this.f82721b.hashCode() + (Boolean.hashCode(this.f82720a) * 31)) * 31)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        p61.b bVar = this.f;
        int iC = j6.a.c((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f82723g);
        List list = this.f82724h;
        return Boolean.hashCode(this.i) + ((iC + (list != null ? list.hashCode() : 0)) * 31);
    }

    @Override // com.revolut.feature.retail.legacy.login.impl.signsms.SignSmsScreenContract$SignSmsConfiguration
    /* JADX INFO: renamed from: n7, reason: from getter */
    public final p61.b getF() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f82720a ? 1 : 0);
        dest.writeString(this.f82721b.name());
        dest.writeString(this.f82722c.name());
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeSerializable(this.f);
        dest.writeInt(this.f82723g ? 1 : 0);
        dest.writeStringList(this.f82724h);
        dest.writeInt(this.i ? 1 : 0);
    }
}
