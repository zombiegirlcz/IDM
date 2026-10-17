package lzc;

import gzc.h;
import gzc.m;
import jzc.g;
import jzc.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static gzc.a a(jzc.a aVar) {
        String id10 = aVar.getId();
        String message = aVar.getMessage();
        String action = aVar.getAction();
        gzc.b bVar = Intrinsics.f(action, "NEW") ? gzc.b.NEW : Intrinsics.f(action, "REPLACE") ? gzc.b.REPLACE : gzc.b.UNKNOWN;
        String entityVariant = aVar.getEntityVariant();
        g entityVariantDetails = aVar.getEntityVariantDetails();
        return new gzc.a(id10, message, bVar, entityVariant, entityVariantDetails != null ? new h(entityVariantDetails.getTitle(), entityVariantDetails.getDescription()) : null);
    }

    public static m b(k kVar) {
        return new m(kVar.getType(), kVar.getTitle(), kVar.getAdverb());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static gzc.s c(jzc.q r3) {
        /*
            gzc.s r0 = new gzc.s
            java.lang.String r1 = r3.getType()
            int r2 = r1.hashCode()
            switch(r2) {
                case -1987808683: goto L3e;
                case -1948348832: goto L32;
                case 174130302: goto L26;
                case 1024499391: goto L1a;
                case 1967871671: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L46
        Le:
            java.lang.String r2 = "APPROVED"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L17
            goto L46
        L17:
            gzc.t r1 = gzc.t.APPROVED
            goto L4b
        L1a:
            java.lang.String r2 = "UNDER_REVIEW"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L23
            goto L46
        L23:
            gzc.t r1 = gzc.t.UNDER_REVIEW
            goto L4b
        L26:
            java.lang.String r2 = "REJECTED"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L2f
            goto L46
        L2f:
            gzc.t r1 = gzc.t.REJECTED
            goto L4b
        L32:
            java.lang.String r2 = "UPLOADED"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3b
            goto L46
        L3b:
            gzc.t r1 = gzc.t.UPLOADED
            goto L4b
        L3e:
            java.lang.String r2 = "UPDATE_REQUIRED"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L49
        L46:
            gzc.t r1 = gzc.t.UNKNOWN
            goto L4b
        L49:
            gzc.t r1 = gzc.t.UPDATE_REQUIRED
        L4b:
            java.lang.String r3 = r3.getTitle()
            r0.<init>(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lzc.a.c(jzc.q):gzc.s");
    }
}
