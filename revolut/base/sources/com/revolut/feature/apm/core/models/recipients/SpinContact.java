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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/recipients/SpinContact;", "Lcom/revolut/feature/apm/core/models/recipients/ApmContact;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SpinContact implements ApmContact {

    @NotNull
    public static final Parcelable.Creator<SpinContact> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmIdentifier f62153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmDescriptor f62154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f62155c;
    public final String d;
    public final String e;
    public final ApmContact.SimpleState f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f5j.a f62156g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SpinContact((ApmIdentifier) parcel.readParcelable(SpinContact.class.getClassLoader()), (ApmDescriptor) parcel.readParcelable(SpinContact.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), (ApmContact.SimpleState) parcel.readParcelable(SpinContact.class.getClassLoader()), (f5j.a) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SpinContact[i];
        }
    }

    public SpinContact(ApmIdentifier id10, ApmDescriptor descriptor, String str, String str2, String str3, ApmContact.SimpleState state, f5j.a aVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f62153a = id10;
        this.f62154b = descriptor;
        this.f62155c = str;
        this.d = str2;
        this.e = str3;
        this.f = state;
        this.f62156g = aVar;
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    public final boolean E3() {
        return Intrinsics.f(this.f, ApmContact.State.ACTIVE.f62099a) && (this.f62153a instanceof ApmIdentifier.Uuid);
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    /* JADX INFO: renamed from: G0, reason: from getter */
    public final String getF62155c() {
        return this.f62155c;
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
        if (!(obj2 instanceof SpinContact)) {
            return false;
        }
        SpinContact spinContact = (SpinContact) obj2;
        return Intrinsics.f(this.f62153a, spinContact.f62153a) && Intrinsics.f(this.f62154b, spinContact.f62154b) && Intrinsics.f(this.f62155c, spinContact.f62155c) && Intrinsics.f(this.d, spinContact.d) && Intrinsics.f(this.e, spinContact.e) && Intrinsics.f(this.f, spinContact.f) && Intrinsics.f(this.f62156g, spinContact.f62156g);
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    public final boolean g8(String str) {
        return str == null || d0.W(str) || g.d(this.f62155c, str) || g.d(this.d, str) || g.d(this.f62154b.getF62112a(), str);
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmContact
    /* JADX INFO: renamed from: getAlias, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmContact
    /* JADX INFO: renamed from: getDescriptor, reason: from getter */
    public final ApmDescriptor getF62154b() {
        return this.f62154b;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000d  */
    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getDisplayName() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f62155c
            if (r0 == 0) goto Ld
            boolean r1 = kotlin.text.d0.W(r0)
            if (r1 == 0) goto Lb
            r0 = 0
        Lb:
            if (r0 != 0) goto L13
        Ld:
            com.revolut.feature.apm.core.models.recipients.ApmDescriptor r0 = r2.f62154b
            java.lang.String r0 = r0.getF62112a()
        L13:
            if (r0 == 0) goto L16
            return r0
        L16:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.core.models.recipients.SpinContact.getDisplayName():java.lang.String");
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final ApmIdentifier getF62153a() {
        return this.f62153a;
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmContact
    /* JADX INFO: renamed from: getState */
    public final ApmContact.State getF() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = (this.f62154b.hashCode() + (this.f62153a.hashCode() * 31)) * 31;
        String str = this.f62155c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode4 = (this.f.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        f5j.a aVar = this.f62156g;
        return iHashCode4 + (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f62153a, i);
        dest.writeParcelable(this.f62154b, i);
        dest.writeString(this.f62155c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeParcelable(this.f, i);
        dest.writeSerializable(this.f62156g);
    }
}
