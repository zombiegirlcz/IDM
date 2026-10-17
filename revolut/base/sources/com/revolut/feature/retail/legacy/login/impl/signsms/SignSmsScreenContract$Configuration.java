package com.revolut.feature.retail.legacy.login.impl.signsms;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.login.ChannelType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sab.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/legacy/login/impl/signsms/SignSmsScreenContract$Configuration", "Lcom/revolut/feature/retail/legacy/login/impl/signsms/SignSmsScreenContract$SignSmsConfiguration;", "", "toString", "()Ljava/lang/String;", "feature_retail_legacy_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SignSmsScreenContract$Configuration implements SignSmsScreenContract$SignSmsConfiguration {

    @NotNull
    public static final Parcelable.Creator<SignSmsScreenContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChannelType f82702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f82703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f82704c;
    public final String d;
    public final String e;
    public final p61.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f82705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f82706h;
    public final boolean i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ChannelType channelTypeValueOf = ChannelType.valueOf(parcel.readString());
            b bVarValueOf = b.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            p61.b bVar = (p61.b) parcel.readSerializable();
            boolean z4 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
                z3 = true;
            } else {
                z = false;
                z3 = true;
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                z3 = z;
            }
            return new SignSmsScreenContract$Configuration(channelTypeValueOf, bVarValueOf, string, string2, string3, bVar, z4, arrayListCreateStringArrayList, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SignSmsScreenContract$Configuration[i];
        }
    }

    public SignSmsScreenContract$Configuration(ChannelType initialStep, b mode, String str, String str2, String str3, p61.b bVar, boolean z, ArrayList arrayList, boolean z3) {
        Intrinsics.checkNotNullParameter(initialStep, "initialStep");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f82702a = initialStep;
        this.f82703b = mode;
        this.f82704c = str;
        this.d = str2;
        this.e = str3;
        this.f = bVar;
        this.f82705g = z;
        this.f82706h = arrayList;
        this.i = z3;
    }

    @Override // com.revolut.feature.retail.legacy.login.impl.signsms.SignSmsScreenContract$SignSmsConfiguration
    /* JADX INFO: renamed from: F4, reason: from getter */
    public final boolean getI() {
        return this.i;
    }

    @Override // com.revolut.feature.retail.legacy.login.impl.signsms.SignSmsScreenContract$SignSmsConfiguration
    /* JADX INFO: renamed from: M, reason: from getter */
    public final b getF82722c() {
        return this.f82703b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SignSmsScreenContract$Configuration)) {
            return false;
        }
        SignSmsScreenContract$Configuration signSmsScreenContract$Configuration = (SignSmsScreenContract$Configuration) obj2;
        return this.f82702a == signSmsScreenContract$Configuration.f82702a && this.f82703b == signSmsScreenContract$Configuration.f82703b && Intrinsics.f(this.f82704c, signSmsScreenContract$Configuration.f82704c) && Intrinsics.f(this.d, signSmsScreenContract$Configuration.d) && Intrinsics.f(this.e, signSmsScreenContract$Configuration.e) && Intrinsics.f(this.f, signSmsScreenContract$Configuration.f) && this.f82705g == signSmsScreenContract$Configuration.f82705g && Intrinsics.f(this.f82706h, signSmsScreenContract$Configuration.f82706h) && this.i == signSmsScreenContract$Configuration.i;
    }

    @Override // com.revolut.feature.retail.legacy.login.impl.signsms.SignSmsScreenContract$SignSmsConfiguration
    /* JADX INFO: renamed from: getPhone, reason: from getter */
    public final String getE() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f82703b.hashCode() + (this.f82702a.hashCode() * 31)) * 31;
        String str = this.f82704c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        p61.b bVar = this.f;
        int iC = j6.a.c((iHashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f82705g);
        List list = this.f82706h;
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
        dest.writeString(this.f82702a.name());
        dest.writeString(this.f82703b.name());
        dest.writeString(this.f82704c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeSerializable(this.f);
        dest.writeInt(this.f82705g ? 1 : 0);
        dest.writeStringList(this.f82706h);
        dest.writeInt(this.i ? 1 : 0);
    }
}
