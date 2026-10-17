package com.revolut.feature.extension_auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;
import zd6.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/extension_auth/api/model/ExtensionAuthRequestData;", "Landroid/os/Parcelable;", "<init>", "()V", "Verification", "AppChallenge", "Lcom/revolut/feature/extension_auth/api/model/ExtensionAuthRequestData$AppChallenge;", "Lcom/revolut/feature/extension_auth/api/model/ExtensionAuthRequestData$Verification;", "feature_extension_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ExtensionAuthRequestData implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/extension_auth/api/model/ExtensionAuthRequestData$AppChallenge;", "Lcom/revolut/feature/extension_auth/api/model/ExtensionAuthRequestData;", "", "toString", "()Ljava/lang/String;", "feature_extension_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @d
    public static final /* data */ class AppChallenge extends ExtensionAuthRequestData {

        @NotNull
        public static final Parcelable.Creator<AppChallenge> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f72179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f72180c;
        public final long d;
        public final AppChallengeDevice e;
        public final AppConsentClient f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f72181g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AppChallengeOperation f72182h;
        public final String i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AppChallenge(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong(), AppChallengeDevice.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AppConsentClient.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? AppChallengeOperation.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AppChallenge[i];
            }
        }

        public AppChallenge(String id10, long j2, long j3, long j5, AppChallengeDevice device, AppConsentClient appConsentClient, String codeOrId, AppChallengeOperation appChallengeOperation, String hint) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(device, "device");
            Intrinsics.checkNotNullParameter(codeOrId, "codeOrId");
            Intrinsics.checkNotNullParameter(hint, "hint");
            this.f72178a = id10;
            this.f72179b = j2;
            this.f72180c = j3;
            this.d = j5;
            this.e = device;
            this.f = appConsentClient;
            this.f72181g = codeOrId;
            this.f72182h = appChallengeOperation;
            this.i = hint;
        }

        @Override // com.revolut.feature.extension_auth.api.model.ExtensionAuthRequestData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF72187h() {
            return this.f72181g;
        }

        @Override // com.revolut.feature.extension_auth.api.model.ExtensionAuthRequestData
        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getF72185c() {
            return this.f72179b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AppChallenge)) {
                return false;
            }
            AppChallenge appChallenge = (AppChallenge) obj2;
            return Intrinsics.f(this.f72178a, appChallenge.f72178a) && this.f72179b == appChallenge.f72179b && this.f72180c == appChallenge.f72180c && this.d == appChallenge.d && Intrinsics.f(this.e, appChallenge.e) && Intrinsics.f(this.f, appChallenge.f) && Intrinsics.f(this.f72181g, appChallenge.f72181g) && Intrinsics.f(this.f72182h, appChallenge.f72182h) && Intrinsics.f(this.i, appChallenge.i);
        }

        public final int hashCode() {
            int iHashCode = (this.e.hashCode() + a0.d.c(a0.d.c(a0.d.c(this.f72178a.hashCode() * 31, 31, this.f72179b), 31, this.f72180c), 31, this.d)) * 31;
            AppConsentClient appConsentClient = this.f;
            int iC = p.a.c((iHashCode + (appConsentClient == null ? 0 : appConsentClient.hashCode())) * 31, 31, this.f72181g);
            AppChallengeOperation appChallengeOperation = this.f72182h;
            return this.i.hashCode() + ((iC + (appChallengeOperation != null ? appChallengeOperation.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72178a);
            dest.writeLong(this.f72179b);
            dest.writeLong(this.f72180c);
            dest.writeLong(this.d);
            this.e.writeToParcel(dest, i);
            AppConsentClient appConsentClient = this.f;
            if (appConsentClient == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                appConsentClient.writeToParcel(dest, i);
            }
            dest.writeString(this.f72181g);
            AppChallengeOperation appChallengeOperation = this.f72182h;
            if (appChallengeOperation == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                appChallengeOperation.writeToParcel(dest, i);
            }
            dest.writeString(this.i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/extension_auth/api/model/ExtensionAuthRequestData$Verification;", "Lcom/revolut/feature/extension_auth/api/model/ExtensionAuthRequestData;", "", "toString", "()Ljava/lang/String;", "feature_extension_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Verification extends ExtensionAuthRequestData {

        @NotNull
        public static final Parcelable.Creator<Verification> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f72185c;
        public final long d;
        public final long e;
        public final ExtensionAuthRequestDataDevice f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AppConsentClient f72186g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f72187h;
        public final b i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final List f72188j;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                Intrinsics.checkNotNullParameter(parcel2, "parcel");
                String string = parcel2.readString();
                String string2 = parcel2.readString();
                long j2 = parcel2.readLong();
                long j3 = parcel2.readLong();
                long j5 = parcel2.readLong();
                ExtensionAuthRequestDataDevice extensionAuthRequestDataDeviceCreateFromParcel = parcel2.readInt() == 0 ? null : ExtensionAuthRequestDataDevice.CREATOR.createFromParcel(parcel2);
                AppConsentClient appConsentClientCreateFromParcel = parcel2.readInt() == 0 ? null : AppConsentClient.CREATOR.createFromParcel(parcel2);
                String string3 = parcel2.readString();
                b bVarValueOf = parcel2.readInt() != 0 ? b.valueOf(parcel2.readString()) : null;
                int i = parcel2.readInt();
                ArrayList arrayList = new ArrayList(i);
                int i2 = 0;
                while (i2 != i) {
                    arrayList.add(zd6.a.valueOf(parcel2.readString()));
                    i2++;
                    parcel2 = parcel;
                }
                return new Verification(string, string2, j2, j3, j5, extensionAuthRequestDataDeviceCreateFromParcel, appConsentClientCreateFromParcel, string3, bVarValueOf, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Verification[i];
            }
        }

        public Verification(String code, String tokenId, long j2, long j3, long j5, ExtensionAuthRequestDataDevice extensionAuthRequestDataDevice, AppConsentClient appConsentClient, String codeOrId, b bVar, List scopes) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(tokenId, "tokenId");
            Intrinsics.checkNotNullParameter(codeOrId, "codeOrId");
            Intrinsics.checkNotNullParameter(scopes, "scopes");
            this.f72183a = code;
            this.f72184b = tokenId;
            this.f72185c = j2;
            this.d = j3;
            this.e = j5;
            this.f = extensionAuthRequestDataDevice;
            this.f72186g = appConsentClient;
            this.f72187h = codeOrId;
            this.i = bVar;
            this.f72188j = scopes;
        }

        @Override // com.revolut.feature.extension_auth.api.model.ExtensionAuthRequestData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF72187h() {
            return this.f72187h;
        }

        @Override // com.revolut.feature.extension_auth.api.model.ExtensionAuthRequestData
        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getF72185c() {
            return this.f72185c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Verification)) {
                return false;
            }
            Verification verification = (Verification) obj2;
            return Intrinsics.f(this.f72183a, verification.f72183a) && Intrinsics.f(this.f72184b, verification.f72184b) && this.f72185c == verification.f72185c && this.d == verification.d && this.e == verification.e && Intrinsics.f(this.f, verification.f) && Intrinsics.f(this.f72186g, verification.f72186g) && Intrinsics.f(this.f72187h, verification.f72187h) && this.i == verification.i && Intrinsics.f(this.f72188j, verification.f72188j);
        }

        public final int hashCode() {
            int iC = a0.d.c(a0.d.c(a0.d.c(p.a.c(this.f72183a.hashCode() * 31, 31, this.f72184b), 31, this.f72185c), 31, this.d), 31, this.e);
            ExtensionAuthRequestDataDevice extensionAuthRequestDataDevice = this.f;
            int iHashCode = (iC + (extensionAuthRequestDataDevice == null ? 0 : extensionAuthRequestDataDevice.hashCode())) * 31;
            AppConsentClient appConsentClient = this.f72186g;
            int iC2 = p.a.c((iHashCode + (appConsentClient == null ? 0 : appConsentClient.hashCode())) * 31, 31, this.f72187h);
            b bVar = this.i;
            return this.f72188j.hashCode() + ((iC2 + (bVar != null ? bVar.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72183a);
            dest.writeString(this.f72184b);
            dest.writeLong(this.f72185c);
            dest.writeLong(this.d);
            dest.writeLong(this.e);
            ExtensionAuthRequestDataDevice extensionAuthRequestDataDevice = this.f;
            if (extensionAuthRequestDataDevice == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                extensionAuthRequestDataDevice.writeToParcel(dest, i);
            }
            AppConsentClient appConsentClient = this.f72186g;
            if (appConsentClient == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                appConsentClient.writeToParcel(dest, i);
            }
            dest.writeString(this.f72187h);
            b bVar = this.i;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
            Iterator itV = p.a.v(this.f72188j, dest);
            while (itV.hasNext()) {
                dest.writeString(((zd6.a) itV.next()).name());
            }
        }
    }

    private ExtensionAuthRequestData() {
    }

    /* JADX INFO: renamed from: a */
    public abstract String getF72187h();

    /* JADX INFO: renamed from: b */
    public abstract long getF72185c();
}
