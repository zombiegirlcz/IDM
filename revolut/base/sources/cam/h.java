package cam;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f22679w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(t tVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f22679w = tVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f22679w, continuation, 0);
            default:
                return new h(this.f22679w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.u
            switch(r0) {
                case 0: goto L78;
                default: goto L5;
            }
        L5:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.v
            r2 = 3
            r3 = 2
            r4 = 1
            cam.t r5 = r7.f22679w
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L26
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            yhm.o.b(r8)
            goto L75
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L22:
            yhm.o.b(r8)
            goto L5d
        L26:
            yhm.o.b(r8)
            goto L45
        L2a:
            yhm.o.b(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "window.addEventListener('DOMContentLoaded', (e) => "
            r8.<init>(r1)
            java.lang.String r1 = r5.e
            java.lang.String r6 = ".event(e.type.toLowerCase()))"
            java.lang.String r8 = v0.a.i(r8, r1, r6)
            r7.v = r4
            java.lang.Object r8 = r5.K(r8, r7)
            if (r8 != r0) goto L45
            goto L77
        L45:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "window.addEventListener('load', (e) => "
            r8.<init>(r1)
            java.lang.String r1 = r5.e
            java.lang.String r4 = ".event(e.type))"
            java.lang.String r8 = v0.a.i(r8, r1, r4)
            r7.v = r3
            java.lang.Object r8 = r5.K(r8, r7)
            if (r8 != r0) goto L5d
            goto L77
        L5d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "\n\t\t\t\t[\n                    'DOMSubtreeModified', 'DOMNodeInserted', 'DOMNodeRemoved',\n                    'DOMNodeRemovedFromDocument', 'DOMNodeInsertedIntoDocument',\n                    'DOMAttrModified', 'DOMCharacterDataModified'\n                ].forEach(event =>\n\t\t\t\t    document.addEventListener(event, () => "
            r8.<init>(r1)
            java.lang.String r1 = r5.e
            java.lang.String r3 = ".event('domchange'))\n\t\t\t\t)\n\t\t\t"
            java.lang.String r8 = v0.a.i(r8, r1, r3)
            r7.v = r2
            java.lang.Object r8 = r5.K(r8, r7)
            if (r8 != r0) goto L75
            goto L77
        L75:
            kotlin.Unit r0 = kotlin.Unit.f186387a
        L77:
            return r0
        L78:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.v
            cam.t r2 = r7.f22679w
            r3 = 1
            if (r1 == 0) goto L8f
            if (r1 != r3) goto L87
            yhm.o.b(r8)
            goto L9b
        L87:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L8f:
            yhm.o.b(r8)
            r7.v = r3
            java.lang.Object r8 = cam.t.H(r2, r7)
            if (r8 != r0) goto L9b
            goto La2
        L9b:
            skm.r r8 = r2.f
            r8.U(r2)
            kotlin.Unit r0 = kotlin.Unit.f186387a
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cam.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
