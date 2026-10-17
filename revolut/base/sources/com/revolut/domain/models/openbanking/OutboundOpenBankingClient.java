package com.revolut.domain.models.openbanking;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.openbanking.OpenBankingConsent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/domain/models/openbanking/OutboundOpenBankingClient;", "Landroid/os/Parcelable;", "<init>", "()V", "Default", "Australia", "Lcom/revolut/domain/models/openbanking/OutboundOpenBankingClient$Australia;", "Lcom/revolut/domain/models/openbanking/OutboundOpenBankingClient$Default;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OutboundOpenBankingClient implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/openbanking/OutboundOpenBankingClient$Australia;", "Lcom/revolut/domain/models/openbanking/OutboundOpenBankingClient;", "", "toString", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Australia extends OutboundOpenBankingClient {

        @NotNull
        public static final Parcelable.Creator<Australia> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f60396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f60397c;
        public final List d;
        public final int e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(OpenBankingConsent.Australia.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Australia(parcel.readInt(), string, string2, string3, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Australia[i];
            }
        }

        public Australia(int i, String id10, String name, String str, List consents) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(consents, "consents");
            this.f60395a = id10;
            this.f60396b = name;
            this.f60397c = str;
            this.d = consents;
            this.e = i;
        }

        @Override // com.revolut.domain.models.openbanking.OutboundOpenBankingClient
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getD() {
            return this.d;
        }

        @Override // com.revolut.domain.models.openbanking.OutboundOpenBankingClient
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF60400c() {
            return this.f60397c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Australia)) {
                return false;
            }
            Australia australia = (Australia) obj2;
            return Intrinsics.f(this.f60395a, australia.f60395a) && Intrinsics.f(this.f60396b, australia.f60396b) && Intrinsics.f(this.f60397c, australia.f60397c) && Intrinsics.f(this.d, australia.d) && this.e == australia.e;
        }

        @Override // com.revolut.domain.models.openbanking.OutboundOpenBankingClient
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF60398a() {
            return this.f60395a;
        }

        @Override // com.revolut.domain.models.openbanking.OutboundOpenBankingClient
        /* JADX INFO: renamed from: getName, reason: from getter */
        public final String getF60399b() {
            return this.f60396b;
        }

        public final int hashCode() {
            int iC = p.a.c(this.f60395a.hashCode() * 31, 31, this.f60396b);
            String str = this.f60397c;
            return Integer.hashCode(this.e) + p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60395a);
            dest.writeString(this.f60396b);
            dest.writeString(this.f60397c);
            Iterator itV = p.a.v(this.d, dest);
            while (itV.hasNext()) {
                ((OpenBankingConsent.Australia) itV.next()).writeToParcel(dest, i);
            }
            dest.writeInt(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/openbanking/OutboundOpenBankingClient$Default;", "Lcom/revolut/domain/models/openbanking/OutboundOpenBankingClient;", "", "toString", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Default extends OutboundOpenBankingClient {

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f60399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f60400c;
        public final List d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(OpenBankingConsent.Default.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Default(string, string2, string3, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        public Default(String id10, String name, String str, List consents) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(consents, "consents");
            this.f60398a = id10;
            this.f60399b = name;
            this.f60400c = str;
            this.d = consents;
        }

        @Override // com.revolut.domain.models.openbanking.OutboundOpenBankingClient
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getD() {
            return this.d;
        }

        @Override // com.revolut.domain.models.openbanking.OutboundOpenBankingClient
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF60400c() {
            return this.f60400c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Default)) {
                return false;
            }
            Default r56 = (Default) obj2;
            return Intrinsics.f(this.f60398a, r56.f60398a) && Intrinsics.f(this.f60399b, r56.f60399b) && Intrinsics.f(this.f60400c, r56.f60400c) && Intrinsics.f(this.d, r56.d);
        }

        @Override // com.revolut.domain.models.openbanking.OutboundOpenBankingClient
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF60398a() {
            return this.f60398a;
        }

        @Override // com.revolut.domain.models.openbanking.OutboundOpenBankingClient
        /* JADX INFO: renamed from: getName, reason: from getter */
        public final String getF60399b() {
            return this.f60399b;
        }

        public final int hashCode() {
            int iC = p.a.c(this.f60398a.hashCode() * 31, 31, this.f60399b);
            String str = this.f60400c;
            return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60398a);
            dest.writeString(this.f60399b);
            dest.writeString(this.f60400c);
            Iterator itV = p.a.v(this.d, dest);
            while (itV.hasNext()) {
                ((OpenBankingConsent.Default) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    private OutboundOpenBankingClient() {
    }

    /* JADX INFO: renamed from: a */
    public abstract List getD();

    /* JADX INFO: renamed from: b */
    public abstract String getF60400c();

    /* JADX INFO: renamed from: getId */
    public abstract String getF60398a();

    /* JADX INFO: renamed from: getName */
    public abstract String getF60399b();
}
