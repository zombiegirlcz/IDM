package lx2;

/* JADX INFO: loaded from: classes21.dex */
public abstract class e {
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList a(java.util.List r11, boolean r12, java.util.List r13) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "challenges"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L15:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto Lad
            java.lang.Object r1 = r11.next()
            e93.q r1 = (e93.q) r1
            java.util.List r2 = r1.d
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L2e:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L8b
            java.lang.Object r4 = r2.next()
            r6 = r4
            e93.f r6 = (e93.f) r6
            r7 = 0
            r8 = 1
            if (r12 == 0) goto L5d
            boolean r9 = r6 instanceof e93.e
            if (r9 == 0) goto L47
            r5 = r6
            e93.e r5 = (e93.e) r5
        L47:
            if (r5 == 0) goto L5d
            com.revolut.feature.cards.models.design.CardDesignUnlockRequirement r5 = r5.f123856x
            if (r5 == 0) goto L5d
            e93.t r9 = r5.f65536a
            e93.t r10 = e93.t.REVPOINTS
            if (r9 != r10) goto L5d
            java.lang.String r9 = r5.f65538c
            if (r9 == 0) goto L5d
            dj0.d r5 = r5.d
            if (r5 == 0) goto L5d
            r5 = r8
            goto L5e
        L5d:
            r5 = r7
        L5e:
            boolean r9 = r6.u()
            if (r9 == 0) goto L6e
            e93.t r9 = r6.n()
            e93.t r10 = e93.t.REVPOINTS
            if (r9 != r10) goto L6e
            r7 = r5
            goto L85
        L6e:
            boolean r9 = r6.u()
            if (r9 == 0) goto L84
            e93.t r9 = r6.n()
            e93.t r10 = e93.t.CHALLENGE
            if (r9 != r10) goto L84
            if (r5 != 0) goto L84
            com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge r5 = lx2.h.a(r6, r13)
            if (r5 == 0) goto L85
        L84:
            r7 = r8
        L85:
            if (r7 == 0) goto L2e
            r3.add(r4)
            goto L2e
        L8b:
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L93
            r1 = r5
            goto La6
        L93:
            java.util.List r2 = r1.d
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto La6
            e93.p r2 = r1.f123887a
            e93.p r2 = e93.p.a(r2, r3)
            r3 = 2
            e93.q r1 = e93.q.a(r1, r2, r5, r3)
        La6:
            if (r1 == 0) goto L15
            r0.add(r1)
            goto L15
        Lad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lx2.e.a(java.util.List, boolean, java.util.List):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList b(java.util.AbstractList r9, java.util.List r10, boolean r11, kotlin.jvm.functions.Function2 r12) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "challenges"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "createChallengeLockInfo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
        L18:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L9a
            java.lang.Object r1 = r9.next()
            e93.q r1 = (e93.q) r1
            java.util.List r1 = r1.d
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L31:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L95
            java.lang.Object r3 = r1.next()
            e93.f r3 = (e93.f) r3
            r4 = 0
            if (r11 == 0) goto L68
            boolean r5 = r3 instanceof e93.e
            if (r5 == 0) goto L48
            r5 = r3
            e93.e r5 = (e93.e) r5
            goto L49
        L48:
            r5 = r4
        L49:
            if (r5 == 0) goto L68
            com.revolut.feature.cards.models.design.CardDesignUnlockRequirement r5 = r5.f123856x
            if (r5 == 0) goto L68
            java.lang.String r6 = r5.f65538c
            dj0.d r7 = r5.d
            e93.t r5 = r5.f65536a
            e93.t r8 = e93.t.REVPOINTS
            if (r5 != r8) goto L68
            if (r6 == 0) goto L68
            if (r7 == 0) goto L68
            com.revolut.feature.cards.models.design.CardDesignLockInfo$RevPoints r5 = new com.revolut.feature.cards.models.design.CardDesignLockInfo$RevPoints
            r8 = r3
            e93.e r8 = (e93.e) r8
            b93.b r8 = r8.f123843c
            r5.<init>(r8, r6, r7)
            goto L69
        L68:
            r5 = r4
        L69:
            if (r5 == 0) goto L6c
            goto L8f
        L6c:
            com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge r5 = lx2.h.a(r3, r10)
            if (r5 == 0) goto L79
            java.lang.Object r5 = r12.invoke(r3, r5)
            com.revolut.feature.cards.models.design.CardDesignLockInfo$Challenge r5 = (com.revolut.feature.cards.models.design.CardDesignLockInfo.Challenge) r5
            goto L7a
        L79:
            r5 = r4
        L7a:
            e93.t r6 = r3.n()
            e93.t r7 = e93.t.AUM_CHECK
            if (r6 != r7) goto L8b
            com.revolut.feature.cards.models.design.CardDesignLockInfo$AssetUnderManagement r4 = new com.revolut.feature.cards.models.design.CardDesignLockInfo$AssetUnderManagement
            b93.b r3 = r3.c()
            r4.<init>(r3)
        L8b:
            if (r5 == 0) goto L8e
            goto L8f
        L8e:
            r5 = r4
        L8f:
            if (r5 == 0) goto L31
            r2.add(r5)
            goto L31
        L95:
            zhm.a0.x(r2, r0)
            goto L18
        L9a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lx2.e.b(java.util.AbstractList, java.util.List, boolean, kotlin.jvm.functions.Function2):java.util.ArrayList");
    }
}
