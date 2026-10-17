package com.revolut.sso.impl.ui.consent.qr;

import android.os.Parcel;
import android.os.Parcelable;
import cjl.n;
import com.revolut.feature.identity.auth.domain.model.IndividualIdentityId;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/sso/impl/ui/consent/qr/QrConsentFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class QrConsentFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<QrConsentFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f106466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f106467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f106468c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            n nVarValueOf = n.valueOf(parcel.readString());
            String string = parcel.readString();
            IndividualIdentityId individualIdentityId = (IndividualIdentityId) parcel.readParcelable(QrConsentFlowContract$InputData.class.getClassLoader());
            return new QrConsentFlowContract$InputData(nVarValueOf, string, individualIdentityId != null ? individualIdentityId.f74763a : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new QrConsentFlowContract$InputData[i];
        }
    }

    public QrConsentFlowContract$InputData(n qrType, String challengeId, String str) {
        Intrinsics.checkNotNullParameter(qrType, "qrType");
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        this.f106466a = qrType;
        this.f106467b = challengeId;
        this.f106468c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.revolut.sso.impl.ui.consent.qr.QrConsentFlowContract$InputData
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.revolut.sso.impl.ui.consent.qr.QrConsentFlowContract$InputData r5 = (com.revolut.sso.impl.ui.consent.qr.QrConsentFlowContract$InputData) r5
            cjl.n r1 = r4.f106466a
            cjl.n r3 = r5.f106466a
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r4.f106467b
            java.lang.String r3 = r5.f106467b
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.lang.String r5 = r5.f106468c
            java.lang.String r1 = r4.f106468c
            if (r1 != 0) goto L2a
            if (r5 != 0) goto L28
            r5 = r0
            goto L31
        L28:
            r5 = r2
            goto L31
        L2a:
            if (r5 != 0) goto L2d
            goto L28
        L2d:
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
        L31:
            if (r5 != 0) goto L34
            return r2
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.consent.qr.QrConsentFlowContract$InputData.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iC = p.a.c(this.f106466a.hashCode() * 31, 31, this.f106467b);
        String str = this.f106468c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f106466a.name());
        dest.writeString(this.f106467b);
        String str = this.f106468c;
        dest.writeParcelable(str != null ? new IndividualIdentityId(str) : null, i);
    }
}
