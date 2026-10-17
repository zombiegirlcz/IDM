package com.revolut.feature.apm.core.models.recipients;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmIdentifier;
import f5j.a;
import jli.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/core/models/recipients/QvikContact;", "Lcom/revolut/feature/apm/core/models/recipients/ApmContact;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class QvikContact implements ApmContact {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmIdentifier f62147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmDescriptor f62148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f62149c;
    public final String d;
    public final String e;
    public final ApmContact.SimpleState f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f62150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ApmRecipientSettings f62151h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f62152j;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<QvikContact> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.apm.core.models.recipients.QvikContact$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new QvikContact((ApmIdentifier) parcel.readParcelable(QvikContact.class.getClassLoader()), (ApmDescriptor) parcel.readParcelable(QvikContact.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), (ApmContact.SimpleState) parcel.readParcelable(QvikContact.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : ApmRecipientSettings.CREATOR.createFromParcel(parcel), parcel.readString(), (a) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new QvikContact[i];
        }
    }

    public QvikContact(ApmIdentifier id10, ApmDescriptor descriptor, String str, String str2, String str3, ApmContact.SimpleState state, boolean z, ApmRecipientSettings apmRecipientSettings, String str4, a aVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f62147a = id10;
        this.f62148b = descriptor;
        this.f62149c = str;
        this.d = str2;
        this.e = str3;
        this.f = state;
        this.f62150g = z;
        this.f62151h = apmRecipientSettings;
        this.i = str4;
        this.f62152j = aVar;
    }

    public static QvikContact a(QvikContact qvikContact, ApmIdentifier apmIdentifier, String str, ApmRecipientSettings apmRecipientSettings, String str2, int i) {
        if ((i & 1) != 0) {
            apmIdentifier = qvikContact.f62147a;
        }
        ApmIdentifier id10 = apmIdentifier;
        ApmDescriptor descriptor = qvikContact.f62148b;
        String str3 = qvikContact.f62149c;
        String str4 = (i & 8) != 0 ? qvikContact.d : str;
        String str5 = qvikContact.e;
        ApmContact.SimpleState state = qvikContact.f;
        boolean z = qvikContact.f62150g;
        ApmRecipientSettings apmRecipientSettings2 = (i & 128) != 0 ? qvikContact.f62151h : apmRecipientSettings;
        String str6 = (i & 256) != 0 ? qvikContact.i : str2;
        a aVar = qvikContact.f62152j;
        qvikContact.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(state, "state");
        return new QvikContact(id10, descriptor, str3, str4, str5, state, z, apmRecipientSettings2, str6, aVar);
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    public final boolean E3() {
        return Intrinsics.f(this.f, ApmContact.State.ACTIVE.f62099a) && (this.f62147a instanceof ApmIdentifier.Uuid);
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    /* JADX INFO: renamed from: G0, reason: from getter */
    public final String getF62133c() {
        return this.f62149c;
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmContact
    /* JADX INFO: renamed from: S4, reason: from getter */
    public final String getE() {
        return this.e;
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    /* JADX INFO: renamed from: V, reason: from getter */
    public final ApmRecipientSettings getF62151h() {
        return this.f62151h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof QvikContact)) {
            return false;
        }
        QvikContact qvikContact = (QvikContact) obj2;
        return Intrinsics.f(this.f62147a, qvikContact.f62147a) && Intrinsics.f(this.f62148b, qvikContact.f62148b) && Intrinsics.f(this.f62149c, qvikContact.f62149c) && Intrinsics.f(this.d, qvikContact.d) && Intrinsics.f(this.e, qvikContact.e) && Intrinsics.f(this.f, qvikContact.f) && this.f62150g == qvikContact.f62150g && Intrinsics.f(this.f62151h, qvikContact.f62151h) && Intrinsics.f(this.i, qvikContact.i) && Intrinsics.f(this.f62152j, qvikContact.f62152j);
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    public final boolean g8(String str) {
        return str == null || d0.W(str) || g.d(this.d, str) || g.d(this.f62149c, str) || g.d(this.f62148b.getF62112a(), str);
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmContact
    /* JADX INFO: renamed from: getAlias, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmContact
    /* JADX INFO: renamed from: getDescriptor, reason: from getter */
    public final ApmDescriptor getF62158b() {
        return this.f62148b;
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
            java.lang.String r1 = r3.f62149c
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
            com.revolut.feature.apm.core.models.recipients.ApmDescriptor r0 = r3.f62148b
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
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.core.models.recipients.QvikContact.getDisplayName():java.lang.String");
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final ApmIdentifier getF62131a() {
        return this.f62147a;
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmContact
    /* JADX INFO: renamed from: getState */
    public final ApmContact.State getF() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = (this.f62148b.hashCode() + (this.f62147a.hashCode() * 31)) * 31;
        String str = this.f62149c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iC = j6.a.c((this.f.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31, this.f62150g);
        ApmRecipientSettings apmRecipientSettings = this.f62151h;
        int iHashCode4 = (iC + (apmRecipientSettings == null ? 0 : apmRecipientSettings.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        a aVar = this.f62152j;
        return iHashCode5 + (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f62147a, i);
        dest.writeParcelable(this.f62148b, i);
        dest.writeString(this.f62149c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeParcelable(this.f, i);
        dest.writeInt(this.f62150g ? 1 : 0);
        ApmRecipientSettings apmRecipientSettings = this.f62151h;
        if (apmRecipientSettings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            apmRecipientSettings.writeToParcel(dest, i);
        }
        dest.writeString(this.i);
        dest.writeSerializable(this.f62152j);
    }

    public /* synthetic */ QvikContact(ApmIdentifier apmIdentifier, ApmDescriptor apmDescriptor, String str, String str2, String str3, ApmContact.SimpleState simpleState, boolean z, ApmRecipientSettings apmRecipientSettings, a aVar, int i) {
        this(apmIdentifier, apmDescriptor, str, str2, str3, simpleState, z, apmRecipientSettings, (String) null, (i & 512) != 0 ? null : aVar);
    }
}
