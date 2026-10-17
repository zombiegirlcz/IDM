package zzd;

import com.revolut.data.model.Data;
import com.revolut.feature.statements.api.navigation.DocumentsHubProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f326688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wxd.s f326689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f326690c;
    public final String d;
    public final a0e.r e;
    public final do3.n f;

    public q(Data contentData, wxd.s sVar, String str, String str2, a0e.r rVar, do3.n nVar) {
        Intrinsics.checkNotNullParameter(contentData, "contentData");
        this.f326688a = contentData;
        this.f326689b = sVar;
        this.f326690c = str;
        this.d = str2;
        this.e = rVar;
        this.f = nVar;
    }

    public static q a(q qVar, Data data, wxd.s sVar, String str, String str2, a0e.r rVar, do3.n nVar, int i) {
        if ((i & 1) != 0) {
            data = qVar.f326688a;
        }
        Data contentData = data;
        if ((i & 2) != 0) {
            sVar = qVar.f326689b;
        }
        wxd.s sVar2 = sVar;
        if ((i & 4) != 0) {
            str = qVar.f326690c;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = qVar.d;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            rVar = qVar.e;
        }
        a0e.r rVar2 = rVar;
        if ((i & 32) != 0) {
            nVar = qVar.f;
        }
        qVar.getClass();
        Intrinsics.checkNotNullParameter(contentData, "contentData");
        return new q(contentData, sVar2, str3, str4, rVar2, nVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof zzd.q
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            zzd.q r6 = (zzd.q) r6
            com.revolut.data.model.Data r1 = r5.f326688a
            com.revolut.data.model.Data r3 = r6.f326688a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            wxd.s r1 = r5.f326689b
            wxd.s r3 = r6.f326689b
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r6.f326690c
            java.lang.String r3 = r5.f326690c
            if (r3 != 0) goto L2e
            if (r1 != 0) goto L2c
            r1 = r0
            goto L37
        L2c:
            r1 = r2
            goto L37
        L2e:
            if (r1 != 0) goto L31
            goto L2c
        L31:
            com.revolut.feature.statements.api.navigation.DocumentsHubProduct$a r4 = com.revolut.feature.statements.api.navigation.DocumentsHubProduct.INSTANCE
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
        L37:
            if (r1 != 0) goto L3a
            return r2
        L3a:
            java.lang.String r1 = r5.d
            java.lang.String r3 = r6.d
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L45
            return r2
        L45:
            a0e.r r1 = r5.e
            a0e.r r3 = r6.e
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L50
            return r2
        L50:
            do3.n r1 = r5.f
            do3.n r6 = r6.f
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r1, r6)
            if (r6 != 0) goto L5b
            return r2
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zzd.q.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.f326688a.hashCode() * 31;
        wxd.s sVar = this.f326689b;
        int iHashCode3 = (iHashCode2 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        String str = this.f326690c;
        if (str == null) {
            iHashCode = 0;
        } else {
            DocumentsHubProduct.Companion companion = DocumentsHubProduct.INSTANCE;
            iHashCode = str.hashCode();
        }
        int i = (iHashCode3 + iHashCode) * 31;
        String str2 = this.d;
        int iHashCode4 = (i + (str2 == null ? 0 : str2.hashCode())) * 31;
        a0e.r rVar = this.e;
        int iHashCode5 = (iHashCode4 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        do3.n nVar = this.f;
        return iHashCode5 + (nVar != null ? nVar.hashCode() : 0);
    }
}
