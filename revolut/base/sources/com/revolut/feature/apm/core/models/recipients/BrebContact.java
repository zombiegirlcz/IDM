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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/core/models/recipients/BrebContact;", "Lcom/revolut/feature/apm/core/models/recipients/ApmContact;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BrebContact implements ApmContact {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmIdentifier f62122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmDescriptor f62123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f62124c;
    public final String d;
    public final String e;
    public final ApmContact.SimpleState f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f62125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f62126h;

    @NotNull
    public static final Parcelable.Creator<BrebContact> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BrebContact((ApmIdentifier) parcel.readParcelable(BrebContact.class.getClassLoader()), (ApmDescriptor) parcel.readParcelable(BrebContact.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), (ApmContact.SimpleState) parcel.readParcelable(BrebContact.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BrebContact[i];
        }
    }

    public BrebContact(ApmIdentifier id10, ApmDescriptor descriptor, String str, String str2, String str3, ApmContact.SimpleState state, String str4, String str5) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f62122a = id10;
        this.f62123b = descriptor;
        this.f62124c = str;
        this.d = str2;
        this.e = str3;
        this.f = state;
        this.f62125g = str4;
        this.f62126h = str5;
    }

    public static BrebContact a(BrebContact brebContact, ApmIdentifier id10, String str, int i) {
        ApmDescriptor descriptor = brebContact.f62123b;
        String str2 = brebContact.f62124c;
        if ((i & 8) != 0) {
            str = brebContact.d;
        }
        String str3 = brebContact.e;
        ApmContact.SimpleState state = brebContact.f;
        String str4 = brebContact.f62125g;
        String str5 = brebContact.f62126h;
        brebContact.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(state, "state");
        return new BrebContact(id10, descriptor, str2, str, str3, state, str4, str5);
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    public final boolean E3() {
        return Intrinsics.f(this.f, ApmContact.State.ACTIVE.f62099a) && (this.f62122a instanceof ApmIdentifier.Uuid);
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    /* JADX INFO: renamed from: G0, reason: from getter */
    public final String getF62124c() {
        return this.f62124c;
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
        if (!(obj2 instanceof BrebContact)) {
            return false;
        }
        BrebContact brebContact = (BrebContact) obj2;
        return Intrinsics.f(this.f62122a, brebContact.f62122a) && Intrinsics.f(this.f62123b, brebContact.f62123b) && Intrinsics.f(this.f62124c, brebContact.f62124c) && Intrinsics.f(this.d, brebContact.d) && Intrinsics.f(this.e, brebContact.e) && Intrinsics.f(this.f, brebContact.f) && Intrinsics.f(this.f62125g, brebContact.f62125g) && Intrinsics.f(this.f62126h, brebContact.f62126h);
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    public final boolean g8(String str) {
        return str == null || d0.W(str) || g.d(this.d, str) || g.d(this.f62124c, str) || g.d(this.f62123b.getF62112a(), str);
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmContact
    /* JADX INFO: renamed from: getAlias, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmContact
    /* JADX INFO: renamed from: getDescriptor, reason: from getter */
    public final ApmDescriptor getF62123b() {
        return this.f62123b;
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
            java.lang.String r1 = r3.f62124c
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
            com.revolut.feature.apm.core.models.recipients.ApmDescriptor r0 = r3.f62123b
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
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.core.models.recipients.BrebContact.getDisplayName():java.lang.String");
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final ApmIdentifier getF62122a() {
        return this.f62122a;
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmContact
    public final ApmContact.State getState() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = (this.f62123b.hashCode() + (this.f62122a.hashCode() * 31)) * 31;
        String str = this.f62124c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode4 = (this.f.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.f62125g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f62126h;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f62122a, i);
        dest.writeParcelable(this.f62123b, i);
        dest.writeString(this.f62124c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeParcelable(this.f, i);
        dest.writeString(this.f62125g);
        dest.writeString(this.f62126h);
    }
}
