package c66;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f21684w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto.e eVar, gim.c cVar) {
        super(cVar);
        this.v = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) throws java.lang.Throwable {
        /*
            r3 = this;
            r3.u = r4
            int r4 = r3.f21684w
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 | r0
            r3.f21684w = r4
            com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto.e r4 = r3.v
            r4.getClass()
            boolean r1 = r3 instanceof c66.g
            if (r1 == 0) goto L1d
            int r1 = r3.f21684w
            r2 = r1 & r0
            if (r2 == 0) goto L1d
            int r1 = r1 - r0
            r3.f21684w = r1
            r0 = r3
            goto L22
        L1d:
            c66.g r0 = new c66.g
            r0.<init>(r4, r3)
        L22:
            java.lang.Object r4 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r0 = r0.f21684w
            r1 = 0
            if (r0 == 0) goto L43
            r2 = 1
            if (r0 != r2) goto L3b
            yhm.o.b(r4)     // Catch: java.lang.Throwable -> L37 com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto.SeedPhraseExportDecryptionException -> L39 java.lang.Exception -> L5c
            java.lang.String r0 = "withSharedSecret(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)     // Catch: java.lang.Throwable -> L37 com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto.SeedPhraseExportDecryptionException -> L39 java.lang.Exception -> L5c
            throw r1
        L37:
            r4 = move-exception
            goto L62
        L39:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L37
        L3b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L43:
            yhm.o.b(r4)
            int r4 = r1.length
            r0 = 16
            if (r4 >= r0) goto L51
            com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto.SeedPhraseExportDecryptionException$InvalidResponse r4 = new com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto.SeedPhraseExportDecryptionException$InvalidResponse
            r4.<init>()
            throw r4
        L51:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            throw r1     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5b
        L57:
            r0 = move-exception
            r1 = r4
            r4 = r0
            goto L62
        L5b:
            r1 = r4
        L5c:
            com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto.SeedPhraseExportDecryptionException$DecryptionFailed r4 = new com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto.SeedPhraseExportDecryptionException$DecryptionFailed     // Catch: java.lang.Throwable -> L37
            r4.<init>()     // Catch: java.lang.Throwable -> L37
            throw r4     // Catch: java.lang.Throwable -> L37
        L62:
            java.util.Iterator r0 = r1.iterator()
        L66:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L76
            java.lang.Object r1 = r0.next()
            byte[] r1 = (byte[]) r1
            zhm.p.r(r1)
            goto L66
        L76:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c66.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
