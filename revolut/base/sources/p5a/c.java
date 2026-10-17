package p5a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m3j.j f233054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3j.n f233055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aqa.a f233056c;
    public final fk3.a d;
    public final wsg.n e;
    public final dl3.f f;

    public c(m3j.j beneficiaryAvatarMapper, m3j.n beneficiaryItemViewMapper, aqa.c cardOwnerMapper, aqa.a cardOwnerAvatarMapper, fk3.a configurationInteractor, wsg.n walletInteractor, dl3.f contactsMapper) {
        Intrinsics.checkNotNullParameter(beneficiaryAvatarMapper, "beneficiaryAvatarMapper");
        Intrinsics.checkNotNullParameter(beneficiaryItemViewMapper, "beneficiaryItemViewMapper");
        Intrinsics.checkNotNullParameter(cardOwnerMapper, "cardOwnerMapper");
        Intrinsics.checkNotNullParameter(cardOwnerAvatarMapper, "cardOwnerAvatarMapper");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        this.f233054a = beneficiaryAvatarMapper;
        this.f233055b = beneficiaryItemViewMapper;
        this.f233056c = cardOwnerAvatarMapper;
        this.d = configurationInteractor;
        this.e = walletInteractor;
        this.f = contactsMapper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r9 == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e3, code lost:
    
        if (r9 == r1) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cf A[Catch: all -> 0x0030, TRY_ENTER, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002b, B:68:0x00e6, B:65:0x00cf), top: B:78:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(a97.e r7, jq9.b r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p5a.c.a(a97.e, jq9.b, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(xi0.b r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p5a.b
            if (r0 == 0) goto L13
            r0 = r7
            p5a.b r0 = (p5a.b) r0
            int r1 = r0.f233053x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f233053x = r1
            goto L18
        L13:
            p5a.b r0 = new p5a.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f233053x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            xi0.b r6 = r0.u
            yhm.o.b(r7)
            goto L53
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            w4l.h r7 = w4l.h.f294642c
            fk3.a r2 = r5.d
            ik3.c r2 = (ik3.c) r2
            e7l.g$b r4 = e7l.g.b.f123407a
            efm.r r7 = r2.l(r4, r7)
            efm.r r7 = zi0.c.J(r7)
            vkm.d r7 = rd0.e.b(r7)
            r0.u = r6
            r0.f233053x = r3
            java.lang.Object r7 = vkm.q.z(r7, r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            com.revolut.data.model.Data r7 = (com.revolut.data.model.Data) r7
            if (r7 == 0) goto L62
            java.lang.Object r7 = r7.getContent()
            e7l.f r7 = (e7l.f) r7
            if (r7 == 0) goto L62
            java.util.LinkedHashSet r7 = r7.M
            goto L64
        L62:
            zhm.h0 r7 = zhm.h0.f322473a
        L64:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L74
            java.lang.String r6 = r6.f306286a
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto L73
            goto L74
        L73:
            r3 = 0
        L74:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p5a.c.b(xi0.b, gim.c):java.lang.Object");
    }
}
