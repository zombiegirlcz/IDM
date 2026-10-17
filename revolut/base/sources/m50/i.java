package m50;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ Integer v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f202779w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ v20.c f202780x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Integer num, k kVar, v20.c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = num;
        this.f202779w = kVar;
        this.f202780x = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.v, this.f202779w, this.f202780x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r13.u
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            if (r1 != r2) goto Le
            yhm.o.b(r14)
            goto L2f
        Le:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L16:
            yhm.o.b(r14)
            lpl.c r14 = new lpl.c
            v20.c r1 = r13.f202780x
            r4 = 19
            r14.<init>(r1, r3, r4)
            skm.p0 r1 = skm.p0.f264001a
            elm.f r1 = elm.f.f127540b
            r13.u = r2
            java.lang.Object r14 = skm.e0.J(r1, r14, r13)
            if (r14 != r0) goto L2f
            return r0
        L2f:
            java.util.List r14 = (java.util.List) r14
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L3a
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        L3a:
            r0 = r14
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = zhm.w.t(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L4c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L60
            java.lang.Object r2 = r0.next()
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r2 = r2.f186386b
            rd7.h r2 = (rd7.h) r2
            r1.add(r2)
            goto L4c
        L60:
            java.lang.Integer r0 = r13.v
            if (r0 == 0) goto L94
            java.util.Iterator r14 = r14.iterator()
            r2 = 0
        L69:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto L87
            java.lang.Object r4 = r14.next()
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r4 = r4.f186385a
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            int r5 = r0.intValue()
            if (r4 != r5) goto L84
            goto L88
        L84:
            int r2 = r2 + 1
            goto L69
        L87:
            r2 = -1
        L88:
            java.lang.Integer r14 = new java.lang.Integer
            r14.<init>(r2)
            int r0 = r14.intValue()
            if (r0 < 0) goto L94
            goto L95
        L94:
            r14 = r3
        L95:
            com.revolut.feature.image_gallery.ImageGalleryController r0 = new com.revolut.feature.image_gallery.ImageGalleryController
            rd7.j r2 = new rd7.j
            r4 = 4
            r2.<init>(r1, r14, r4)
            k50.b2 r5 = new k50.b2
            r11 = 0
            r12 = 6
            r6 = 2
            m50.k r7 = r13.f202779w
            java.lang.Class<m50.k> r8 = m50.k.class
            java.lang.String r9 = "shareGalleryImage"
            java.lang.String r10 = "shareGalleryImage(Lcom/revolut/feature/image_gallery/ImageGalleryImageItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r0.<init>(r2, r5, r3, r4)
            r14 = 3
            m50.k r1 = r13.f202779w
            yji.n.P2(r1, r0, r3, r3, r14)
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: m50.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
