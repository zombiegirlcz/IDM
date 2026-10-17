package wf0;

import com.revolut.core.faq.data.network.AiSearchService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AiSearchService f296880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f296881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f296882c;
    public final x4l.c d;

    public f(AiSearchService aiSearchService, ne0.d memoryCache) {
        Intrinsics.checkNotNullParameter(aiSearchService, "aiSearchService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f296880a = aiSearchService;
        this.f296881b = memoryCache;
        Continuation continuation = null;
        int i = 2;
        int i2 = 3;
        this.f296882c = new x4l.c(new d(this, continuation, 1), new wdb.b(this, 7), new wde.f(this, 2), new rp1.c(i, 26, continuation), new uyd.e0(i2, 13, continuation));
        this.d = new x4l.c(new d(this, continuation, 0), new wd3.a(13), new b(0), new rp1.c(i, 25, continuation), new uyd.e0(i2, 12, continuation));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof wf0.e
            if (r0 == 0) goto L13
            r0 = r10
            wf0.e r0 = (wf0.e) r0
            int r1 = r0.f296878x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f296878x = r1
            goto L18
        L13:
            wf0.e r0 = new wf0.e
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f296878x
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            java.lang.String r9 = r0.u
            yhm.o.b(r10)
        L28:
            r3 = r9
            goto L42
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            yhm.o.b(r10)
            r0.u = r9
            r0.f296878x = r3
            com.revolut.core.faq.data.network.AiSearchService r10 = r8.f296880a
            java.lang.Object r10 = r10.getSearchResults(r9, r0)
            if (r10 != r1) goto L28
            return r1
        L42:
            dg0.d r10 = (dg0.d) r10
            java.lang.String r9 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r9)
            java.lang.String r0 = "searchRequestId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = r10.getState()
            jg0.b r4 = jg0.b.valueOf(r0)
            java.util.List r0 = r10.getScoredFaqs()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r5 = new java.util.ArrayList
            r1 = 10
            int r1 = zhm.w.t(r0, r1)
            r5.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L6b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8b
            java.lang.Object r1 = r0.next()
            cg0.l r1 = (cg0.l) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r9)
            com.revolut.core.model.faq.FaqMetaData r2 = new com.revolut.core.model.faq.FaqMetaData
            java.lang.String r6 = r1.getKey()
            java.lang.String r1 = r1.getTitle()
            r2.<init>(r6, r1)
            r5.add(r2)
            goto L6b
        L8b:
            dg0.e r0 = r10.getSummarisation()
            if (r0 == 0) goto La3
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r9)
            com.revolut.core.faq.domain.model.ai.Summarisation r9 = new com.revolut.core.faq.domain.model.ai.Summarisation
            java.lang.String r1 = r0.getShortAnswer()
            java.lang.String r0 = r0.getAnswerExplainer()
            r9.<init>(r1, r0)
        La1:
            r6 = r9
            goto La5
        La3:
            r9 = 0
            goto La1
        La5:
            java.lang.Integer r9 = r10.getPollingTime()
            if (r9 == 0) goto Lb1
            int r9 = r9.intValue()
        Laf:
            r7 = r9
            goto Lb3
        Lb1:
            r9 = -1
            goto Laf
        Lb3:
            com.revolut.core.faq.domain.model.ai.SearchResult r2 = new com.revolut.core.faq.domain.model.ai.SearchResult
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wf0.f.a(java.lang.String, gim.c):java.lang.Object");
    }
}
