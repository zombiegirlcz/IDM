package zzd;

import com.revolut.feature.statements.api.navigation.DocumentsHubProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wxd.t f326700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wxd.s f326701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f326702c;

    public y(wxd.t content, wxd.s sVar, String str) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f326700a = content;
        this.f326701b = sVar;
        this.f326702c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
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
            boolean r1 = r5 instanceof zzd.y
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            zzd.y r5 = (zzd.y) r5
            wxd.t r1 = r4.f326700a
            wxd.t r3 = r5.f326700a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            wxd.s r1 = r4.f326701b
            wxd.s r3 = r5.f326701b
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r5 = r5.f326702c
            java.lang.String r1 = r4.f326702c
            if (r1 != 0) goto L2e
            if (r5 != 0) goto L2c
            r5 = r0
            goto L37
        L2c:
            r5 = r2
            goto L37
        L2e:
            if (r5 != 0) goto L31
            goto L2c
        L31:
            com.revolut.feature.statements.api.navigation.DocumentsHubProduct$a r3 = com.revolut.feature.statements.api.navigation.DocumentsHubProduct.INSTANCE
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
        L37:
            if (r5 != 0) goto L3a
            return r2
        L3a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zzd.y.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = this.f326700a.hashCode() * 31;
        int iHashCode2 = 0;
        wxd.s sVar = this.f326701b;
        int iHashCode3 = (iHashCode + (sVar == null ? 0 : sVar.hashCode())) * 31;
        String str = this.f326702c;
        if (str != null) {
            DocumentsHubProduct.Companion companion = DocumentsHubProduct.INSTANCE;
            iHashCode2 = str.hashCode();
        }
        return iHashCode3 + iHashCode2;
    }
}
