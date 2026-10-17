package com.revolut.feature.apm.core.models.recipients;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmIdentifier;
import jli.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/recipients/PixContact;", "Lcom/revolut/feature/apm/core/models/recipients/ApmContact;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PixContact implements ApmContact {

    @NotNull
    public static final Parcelable.Creator<PixContact> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmIdentifier f62140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmDescriptor f62141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f62142c;
    public final String d;
    public final String e;
    public final ApmContact.SimpleState f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f62143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f62144h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f62145j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f62146l;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PixContact((ApmIdentifier) parcel.readParcelable(PixContact.class.getClassLoader()), (ApmDescriptor) parcel.readParcelable(PixContact.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), (ApmContact.SimpleState) parcel.readParcelable(PixContact.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixContact[i];
        }
    }

    public PixContact(ApmIdentifier id10, ApmDescriptor descriptor, String str, String str2, String str3, ApmContact.SimpleState state, String str4, String str5, String str6, String str7, String str8, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f62140a = id10;
        this.f62141b = descriptor;
        this.f62142c = str;
        this.d = str2;
        this.e = str3;
        this.f = state;
        this.f62143g = str4;
        this.f62144h = str5;
        this.i = str6;
        this.f62145j = str7;
        this.k = str8;
        this.f62146l = z;
    }

    public static PixContact a(PixContact pixContact, ApmIdentifier id10, String str, int i) {
        ApmDescriptor descriptor = pixContact.f62141b;
        String str2 = pixContact.f62142c;
        if ((i & 8) != 0) {
            str = pixContact.d;
        }
        String str3 = pixContact.e;
        ApmContact.SimpleState state = pixContact.f;
        String str4 = pixContact.f62143g;
        String str5 = pixContact.f62144h;
        String str6 = pixContact.i;
        String str7 = pixContact.f62145j;
        String str8 = pixContact.k;
        boolean z = pixContact.f62146l;
        pixContact.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(state, "state");
        return new PixContact(id10, descriptor, str2, str, str3, state, str4, str5, str6, str7, str8, z);
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    public final boolean E3() {
        return Intrinsics.f(this.f, ApmContact.State.ACTIVE.f62099a) && (this.f62140a instanceof ApmIdentifier.Uuid);
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    /* JADX INFO: renamed from: G0, reason: from getter */
    public final String getF62142c() {
        return this.f62142c;
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmContact
    /* JADX INFO: renamed from: S4, reason: from getter */
    public final String getE() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PixContact)) {
            return false;
        }
        PixContact pixContact = (PixContact) obj2;
        return Intrinsics.f(this.f62140a, pixContact.f62140a) && Intrinsics.f(this.f62141b, pixContact.f62141b) && Intrinsics.f(this.f62142c, pixContact.f62142c) && Intrinsics.f(this.d, pixContact.d) && Intrinsics.f(this.e, pixContact.e) && Intrinsics.f(this.f, pixContact.f) && Intrinsics.f(this.f62143g, pixContact.f62143g) && Intrinsics.f(this.f62144h, pixContact.f62144h) && Intrinsics.f(this.i, pixContact.i) && Intrinsics.f(this.f62145j, pixContact.f62145j) && Intrinsics.f(this.k, pixContact.k) && this.f62146l == pixContact.f62146l;
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    public final boolean g8(String str) {
        return str == null || d0.W(str) || g.d(this.d, str) || g.d(this.f62142c, str) || g.d(this.f62141b.getF62112a(), str);
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmContact
    /* JADX INFO: renamed from: getAlias, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmContact
    /* JADX INFO: renamed from: getDescriptor, reason: from getter */
    public final ApmDescriptor getF62141b() {
        return this.f62141b;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getDisplayName() {
        /*
            r3 = this;
            r0 = 0
            java.lang.String r1 = r3.f62142c
            if (r1 == 0) goto Le
            boolean r2 = kotlin.text.d0.W(r1)
            if (r2 == 0) goto Lc
            r1 = r0
        Lc:
            if (r1 != 0) goto L24
        Le:
            java.lang.String r1 = r3.d
            if (r1 == 0) goto L1a
            boolean r2 = kotlin.text.d0.W(r1)
            if (r2 == 0) goto L19
            goto L1a
        L19:
            r0 = r1
        L1a:
            if (r0 != 0) goto L23
            com.revolut.feature.apm.core.models.recipients.ApmDescriptor r0 = r3.f62141b
            java.lang.String r1 = r0.getF62112a()
            goto L24
        L23:
            r1 = r0
        L24:
            if (r1 == 0) goto L27
            return r1
        L27:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.core.models.recipients.PixContact.getDisplayName():java.lang.String");
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final ApmIdentifier getF62140a() {
        return this.f62140a;
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmContact
    public final ApmContact.State getState() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = (this.f62141b.hashCode() + (this.f62140a.hashCode() * 31)) * 31;
        String str = this.f62142c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode4 = (this.f.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.f62143g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f62144h;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f62145j;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.k;
        return Boolean.hashCode(this.f62146l) + ((iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f62140a, i);
        dest.writeParcelable(this.f62141b, i);
        dest.writeString(this.f62142c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeParcelable(this.f, i);
        dest.writeString(this.f62143g);
        dest.writeString(this.f62144h);
        dest.writeString(this.i);
        dest.writeString(this.f62145j);
        dest.writeString(this.k);
        dest.writeInt(this.f62146l ? 1 : 0);
    }
}
