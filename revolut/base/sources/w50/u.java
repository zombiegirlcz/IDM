package w50;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1j.b f294674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j30.c f294675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f294676c;

    public u(t1j.b transcriptInteractor, j30.c chatFeatureToggles, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(transcriptInteractor, "transcriptInteractor");
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f294674a = transcriptInteractor;
        this.f294675b = chatFeatureToggles;
        this.f294676c = dateProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.UUID r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof w50.s
            if (r0 == 0) goto L13
            r0 = r6
            w50.s r0 = (w50.s) r0
            int r1 = r0.f294672w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f294672w = r1
            goto L18
        L13:
            w50.s r0 = new w50.s
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f294672w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L69
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.String r6 = "feedId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            t1j.b r2 = r4.f294674a
            java.lang.Object r2 = r2.f267380b
            c30.h r2 = (c30.h) r2
            r2.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            x4l.c r6 = r2.f20852h
            w4l.h r2 = w4l.h.f294642c
            vkm.d r5 = r6.b(r5, r2)
            c2d.n r6 = new c2d.n
            r2 = 25
            r6.<init>(r2)
            akg.n r5 = nim.a.v(r5, r6)
            w2.d r6 = new w2.d
            r6.<init>(r2)
            r2 = 0
            jhi.b r5 = mo3.a.g(r5, r2, r6, r3)
            r0.f294672w = r3
            java.lang.Object r6 = vkm.q.z(r5, r0)
            if (r6 != r1) goto L69
            return r1
        L69:
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L70
            zhm.f0 r5 = zhm.f0.f322471a
            return r5
        L70:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w50.u.a(java.util.UUID, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.chat.domain.model.ChatMode r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof w50.t
            if (r0 == 0) goto L13
            r0 = r7
            w50.t r0 = (w50.t) r0
            int r1 = r0.f294673w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f294673w = r1
            goto L18
        L13:
            w50.t r0 = new w50.t
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f294673w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L5f
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            boolean r7 = r6 instanceof com.revolut.chat.domain.model.ChatMode.Feed
            if (r7 != 0) goto L37
            goto L50
        L37:
            j30.c r7 = r5.f294675b
            rf3.d r7 = (rf3.d) r7
            gte.a r2 = r7.f253679a
            com.revolut.chat.ChatApi$Toggles$ChatDownloadTranscriptDateSelection r4 = com.revolut.chat.ChatApi$Toggles.ChatDownloadTranscriptDateSelection.f50974c
            jte.d r2 = (jte.d) r2
            boolean r2 = r2.c(r4)
            if (r2 != 0) goto L48
            goto L50
        L48:
            j30.b r7 = r7.b()
            j30.b r2 = j30.b.DISABLED
            if (r7 != r2) goto L52
        L50:
            r6 = 0
            return r6
        L52:
            com.revolut.chat.domain.model.ChatMode$Feed r6 = (com.revolut.chat.domain.model.ChatMode.Feed) r6
            java.util.UUID r6 = r6.f51044a
            r0.f294673w = r3
            java.lang.Object r7 = r5.a(r6, r0)
            if (r7 != r1) goto L5f
            return r1
        L5f:
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = zhm.d0.d0(r7)
            com.revolut.chat.domain.model.TranscriptDateRange r6 = (com.revolut.chat.domain.model.TranscriptDateRange) r6
            if (r6 == 0) goto Lae
            java.time.LocalDate r6 = r6.f51076a
            if (r6 != 0) goto L6e
            goto Lae
        L6e:
            r0 = r7
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L7f
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L7f
            goto Lae
        L7f:
            java.util.Iterator r0 = r0.iterator()
        L83:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lae
            java.lang.Object r1 = r0.next()
            com.revolut.chat.domain.model.TranscriptDateRange r1 = (com.revolut.chat.domain.model.TranscriptDateRange) r1
            java.time.LocalDate r2 = r1.f51076a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r6)
            if (r2 == 0) goto La0
            java.time.LocalDate r1 = r1.f51077b
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r6)
            if (r1 == 0) goto La0
            goto L83
        La0:
            w50.q r6 = new w50.q
            l80.e r0 = r5.f294676c
            l80.f r0 = (l80.f) r0
            java.time.LocalDate r0 = r0.e()
            r6.<init>(r0, r7)
            return r6
        Lae:
            w50.p r6 = w50.p.f294669a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w50.u.b(com.revolut.chat.domain.model.ChatMode, gim.c):java.lang.Object");
    }
}
