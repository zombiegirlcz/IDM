package nyd;

import com.revolut.feature.statements.api.navigation.DocumentsHubProduct;
import com.revolut.feature.statements.api.navigation.DocumentsHubType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f220849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f220850b;

    public f(String type, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f220849a = type;
        this.f220850b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
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
            boolean r1 = r5 instanceof nyd.f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            nyd.f r5 = (nyd.f) r5
            java.lang.String r1 = r5.f220849a
            com.revolut.feature.statements.api.navigation.DocumentsHubType$a r3 = com.revolut.feature.statements.api.navigation.DocumentsHubType.INSTANCE
            java.lang.String r3 = r4.f220849a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
            if (r1 != 0) goto L19
            return r2
        L19:
            java.lang.String r5 = r5.f220850b
            java.lang.String r1 = r4.f220850b
            if (r1 != 0) goto L25
            if (r5 != 0) goto L23
            r5 = r0
            goto L2e
        L23:
            r5 = r2
            goto L2e
        L25:
            if (r5 != 0) goto L28
            goto L23
        L28:
            com.revolut.feature.statements.api.navigation.DocumentsHubProduct$a r3 = com.revolut.feature.statements.api.navigation.DocumentsHubProduct.INSTANCE
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
        L2e:
            if (r5 != 0) goto L31
            return r2
        L31:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nyd.f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        DocumentsHubType.Companion companion = DocumentsHubType.INSTANCE;
        int iHashCode2 = this.f220849a.hashCode() * 31;
        String str = this.f220850b;
        if (str == null) {
            iHashCode = 0;
        } else {
            DocumentsHubProduct.Companion companion2 = DocumentsHubProduct.INSTANCE;
            iHashCode = str.hashCode();
        }
        return iHashCode2 + iHashCode;
    }
}
