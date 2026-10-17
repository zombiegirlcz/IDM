package c30;

import com.revolut.chat.domain.model.TranscriptDateRange;
import com.revolut.chat.domain.model.TranscriptIdentifier;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends i implements Function2 {
    public int u;
    public final /* synthetic */ TranscriptIdentifier v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f20846w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TranscriptDateRange f20847x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TranscriptIdentifier transcriptIdentifier, h hVar, TranscriptDateRange transcriptDateRange, Continuation continuation) {
        super(2, continuation);
        this.v = transcriptIdentifier;
        this.f20846w = hVar;
        this.f20847x = transcriptDateRange;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.v, this.f20846w, this.f20847x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r8 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r8 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r8 == r1) goto L36;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            c30.h r0 = r7.f20846w
            com.revolut.chat.data.network.TranscriptApi r0 = r0.f20848a
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r7.u
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L27
            if (r2 == r5) goto L23
            if (r2 == r4) goto L1f
            if (r2 != r3) goto L17
            yhm.o.b(r8)
            goto L7e
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            yhm.o.b(r8)
            goto L5f
        L23:
            yhm.o.b(r8)
            goto L4b
        L27:
            yhm.o.b(r8)
            com.revolut.chat.domain.model.TranscriptIdentifier$AllChats r8 = com.revolut.chat.domain.model.TranscriptIdentifier.AllChats.f51078a
            com.revolut.chat.domain.model.TranscriptIdentifier r2 = r7.v
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r2, r8)
            com.revolut.chat.domain.model.TranscriptDateRange r6 = r7.f20847x
            if (r8 == 0) goto L4e
            r7.u = r5
            r8 = 0
            if (r6 == 0) goto L44
            n20.c r2 = mif.a.V(r6)
            java.lang.Object r8 = r0.requestTranscriptWithRange(r8, r2, r7)
            goto L48
        L44:
            java.lang.Object r8 = r0.requestTranscript(r8, r7)
        L48:
            if (r8 != r1) goto L4b
            goto L7d
        L4b:
            n20.d r8 = (n20.d) r8
            return r8
        L4e:
            boolean r8 = r2 instanceof com.revolut.chat.domain.model.TranscriptIdentifier.ChatId
            if (r8 == 0) goto L62
            com.revolut.chat.domain.model.TranscriptIdentifier$ChatId r2 = (com.revolut.chat.domain.model.TranscriptIdentifier.ChatId) r2
            java.util.UUID r8 = r2.f51079a
            r7.u = r4
            java.lang.Object r8 = r0.requestTranscriptForTicket(r8, r7)
            if (r8 != r1) goto L5f
            goto L7d
        L5f:
            n20.d r8 = (n20.d) r8
            return r8
        L62:
            boolean r8 = r2 instanceof com.revolut.chat.domain.model.TranscriptIdentifier.FeedId
            if (r8 == 0) goto L81
            com.revolut.chat.domain.model.TranscriptIdentifier$FeedId r2 = (com.revolut.chat.domain.model.TranscriptIdentifier.FeedId) r2
            java.util.UUID r8 = r2.f51080a
            r7.u = r3
            if (r6 == 0) goto L77
            n20.c r2 = mif.a.V(r6)
            java.lang.Object r8 = r0.requestTranscriptWithRange(r8, r2, r7)
            goto L7b
        L77:
            java.lang.Object r8 = r0.requestTranscript(r8, r7)
        L7b:
            if (r8 != r1) goto L7e
        L7d:
            return r1
        L7e:
            n20.d r8 = (n20.d) r8
            return r8
        L81:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c30.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
