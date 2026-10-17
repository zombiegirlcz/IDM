package t40;

/* JADX INFO: loaded from: classes19.dex */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List a(java.util.List r4, com.revolut.chat.domain.model.ChatListFilter r5) {
        /*
            java.lang.String r0 = "allItems"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "filter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r5 instanceof com.revolut.chat.domain.model.ChatListFilter.None
            if (r0 == 0) goto Lf
            return r4
        Lf:
            boolean r0 = r5 instanceof com.revolut.chat.domain.model.ChatListFilter.PastRequests
            if (r0 == 0) goto L36
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L1e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r4.next()
            r1 = r0
            u40.d r1 = (u40.d) r1
            boolean r1 = r1.c()
            if (r1 != 0) goto L1e
            r5.add(r0)
            goto L1e
        L35:
            return r5
        L36:
            boolean r0 = r5 instanceof com.revolut.chat.domain.model.ChatListFilter.Tickets
            if (r0 == 0) goto L75
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L45:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L74
            java.lang.Object r1 = r4.next()
            r2 = r1
            u40.d r2 = (u40.d) r2
            boolean r3 = r2 instanceof u40.c
            if (r3 == 0) goto L6d
            u40.c r2 = (u40.c) r2
            boolean r2 = r2.c()
            if (r2 == 0) goto L64
            r2 = r5
            com.revolut.chat.domain.model.ChatListFilter$Tickets r2 = (com.revolut.chat.domain.model.ChatListFilter.Tickets) r2
            boolean r2 = r2.f51038a
            goto L69
        L64:
            r2 = r5
            com.revolut.chat.domain.model.ChatListFilter$Tickets r2 = (com.revolut.chat.domain.model.ChatListFilter.Tickets) r2
            boolean r2 = r2.f51039b
        L69:
            if (r2 == 0) goto L6d
            r2 = 1
            goto L6e
        L6d:
            r2 = 0
        L6e:
            if (r2 == 0) goto L45
            r0.add(r1)
            goto L45
        L74:
            return r0
        L75:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t40.a.a(java.util.List, com.revolut.chat.domain.model.ChatListFilter):java.util.List");
    }
}
