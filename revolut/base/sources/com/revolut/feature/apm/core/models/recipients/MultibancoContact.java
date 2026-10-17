package com.revolut.feature.apm.core.models.recipients;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.ApmIdentifier;
import jli.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/recipients/MultibancoContact;", "Lcom/revolut/feature/apm/core/models/recipients/ApmContact;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultibancoContact implements ApmContact {

    @NotNull
    public static final Parcelable.Creator<MultibancoContact> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmIdentifier f62131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmDescriptor.Phone f62132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f62133c;
    public final String d;
    public final String e;
    public final ApmContact.SimpleState f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MultibancoContact((ApmIdentifier) parcel.readParcelable(MultibancoContact.class.getClassLoader()), ApmDescriptor.Phone.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), (ApmContact.SimpleState) parcel.readParcelable(MultibancoContact.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MultibancoContact[i];
        }
    }

    public MultibancoContact(ApmIdentifier id10, ApmDescriptor.Phone descriptor, String str, String str2, String str3, ApmContact.SimpleState state) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f62131a = id10;
        this.f62132b = descriptor;
        this.f62133c = str;
        this.d = str2;
        this.e = str3;
        this.f = state;
    }

    public static MultibancoContact a(MultibancoContact multibancoContact, ApmIdentifier id10, String str, int i) {
        ApmDescriptor.Phone descriptor = multibancoContact.f62132b;
        String str2 = multibancoContact.f62133c;
        if ((i & 8) != 0) {
            str = multibancoContact.d;
        }
        String str3 = multibancoContact.e;
        ApmContact.SimpleState state = multibancoContact.f;
        multibancoContact.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(state, "state");
        return new MultibancoContact(id10, descriptor, str2, str, str3, state);
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    public final boolean E3() {
        return Intrinsics.f(this.f, ApmContact.State.ACTIVE.f62099a) && (this.f62131a instanceof ApmIdentifier.Uuid);
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    /* JADX INFO: renamed from: G0, reason: from getter */
    public final String getF62133c() {
        return this.f62133c;
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
        if (!(obj2 instanceof MultibancoContact)) {
            return false;
        }
        MultibancoContact multibancoContact = (MultibancoContact) obj2;
        return Intrinsics.f(this.f62131a, multibancoContact.f62131a) && Intrinsics.f(this.f62132b, multibancoContact.f62132b) && Intrinsics.f(this.f62133c, multibancoContact.f62133c) && Intrinsics.f(this.d, multibancoContact.d) && Intrinsics.f(this.e, multibancoContact.e) && Intrinsics.f(this.f, multibancoContact.f);
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    public final boolean g8(String str) {
        return str == null || d0.W(str) || g.d(this.f62133c, str) || g.d(this.d, str) || g.d(this.f62132b.f62110b, str);
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmContact
    /* JADX INFO: renamed from: getAlias, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmContact
    /* JADX INFO: renamed from: getDescriptor */
    public final ApmDescriptor getF62158b() {
        return this.f62132b;
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
            java.lang.String r1 = r3.f62133c
            if (r1 == 0) goto Le
            boolean r2 = kotlin.text.d0.W(r1)
            if (r2 == 0) goto Lc
            r1 = r0
        Lc:
            if (r1 != 0) goto L22
        Le:
            java.lang.String r1 = r3.d
            if (r1 == 0) goto L1a
            boolean r2 = kotlin.text.d0.W(r1)
            if (r2 == 0) goto L19
            goto L1a
        L19:
            r0 = r1
        L1a:
            if (r0 != 0) goto L21
            com.revolut.feature.apm.core.models.recipients.ApmDescriptor$Phone r0 = r3.f62132b
            java.lang.String r1 = r0.f62110b
            goto L22
        L21:
            r1 = r0
        L22:
            if (r1 == 0) goto L25
            return r1
        L25:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.core.models.recipients.MultibancoContact.getDisplayName():java.lang.String");
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmRecipient
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final ApmIdentifier getF62131a() {
        return this.f62131a;
    }

    @Override // com.revolut.feature.apm.core.models.recipients.ApmContact
    /* JADX INFO: renamed from: getState */
    public final ApmContact.State getF() {
        return this.f;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f62131a.hashCode() * 31, 31, this.f62132b.f62110b);
        String str = this.f62133c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return this.f.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f62131a, i);
        this.f62132b.writeToParcel(dest, i);
        dest.writeString(this.f62133c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeParcelable(this.f, i);
    }
}
