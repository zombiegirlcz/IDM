package com.revolut.feature.retail.legacy.login.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p61.b;
import tjg.e;
import yhm.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/legacy/login/api/TwoFaFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "Sms", "Lcom/revolut/feature/retail/legacy/login/api/TwoFaFeatureConfig$Sms;", "feature_retail_legacy_login_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public abstract class TwoFaFeatureConfig implements FeatureConfig {
    private TwoFaFeatureConfig() {
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/legacy/login/api/TwoFaFeatureConfig$Sms;", "Lcom/revolut/feature/retail/legacy/login/api/TwoFaFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_legacy_login_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Sms extends TwoFaFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Sms> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f82668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f82669c;
        public final b d;
        public final boolean e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f82670g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                e eVarValueOf = e.valueOf(parcel.readString());
                b bVar = (b) parcel.readSerializable();
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
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                return new Sms(string, arrayListCreateStringArrayList, eVarValueOf, bVar, z4, z6, z3);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Sms[i];
            }
        }

        public Sms(String str, ArrayList arrayList, e channelType, b bVar, boolean z, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(channelType, "channelType");
            this.f82667a = str;
            this.f82668b = arrayList;
            this.f82669c = channelType;
            this.d = bVar;
            this.e = z;
            this.f = z3;
            this.f82670g = z4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Sms)) {
                return false;
            }
            Sms sms = (Sms) obj2;
            return Intrinsics.f(this.f82667a, sms.f82667a) && Intrinsics.f(this.f82668b, sms.f82668b) && this.f82669c == sms.f82669c && Intrinsics.f(this.d, sms.d) && this.e == sms.e && this.f == sms.f && this.f82670g == sms.f82670g;
        }

        public final int hashCode() {
            String str = this.f82667a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List list = this.f82668b;
            int iHashCode2 = (this.f82669c.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
            b bVar = this.d;
            return Boolean.hashCode(this.f82670g) + j6.a.c(j6.a.c((iHashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82667a);
            dest.writeStringList(this.f82668b);
            dest.writeString(this.f82669c.name());
            dest.writeSerializable(this.d);
            dest.writeInt(this.e ? 1 : 0);
            dest.writeInt(this.f ? 1 : 0);
            dest.writeInt(this.f82670g ? 1 : 0);
        }

        public /* synthetic */ Sms(String str, e eVar, boolean z, boolean z3, int i) {
            this((i & 1) != 0 ? null : str, null, eVar, null, false, z, z3);
        }
    }
}
