package com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow;

import bz3.g;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function2 {
    public g u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f68197w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.f68197w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.f68197w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow.c r0 = r10.f68197w
            com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow.PhotosUploadFlowContract$InputData r1 = r0.f68198p
            wx3.c r2 = r0.f68200r
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r10.v
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L24
            if (r4 == r6) goto L20
            if (r4 != r5) goto L18
            bz3.g r1 = r10.u
            yhm.o.b(r11)
            goto L5c
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            yhm.o.b(r11)
            goto L44
        L24:
            yhm.o.b(r11)
            ft3.h1 r11 = r1.a9()
            r10.v = r6
            a44.d r4 = r2.f300751a
            r4.getClass()
            a1a.a r6 = new a1a.a
            r7 = 0
            r8 = 7
            r6.<init>(r4, r11, r7, r8)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r11, r6, r10)
            if (r11 != r3) goto L44
            goto L58
        L44:
            bz3.g r11 = (bz3.g) r11
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r1 = r1.f68189a
            java.lang.String r1 = r1.f66892b
            a44.c r1 = r2.a(r1)
            r10.u = r11
            r10.v = r5
            java.lang.Object r1 = vkm.q.x(r1, r10)
            if (r1 != r3) goto L59
        L58:
            return r3
        L59:
            r9 = r1
            r1 = r11
            r11 = r9
        L5c:
            java.util.List r11 = (java.util.List) r11
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L76
            r11 = r1
            yki.a r1 = r0.f68202t
            com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow.PhotosUploadFlowContract$Step$Intro r2 = new com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow.PhotosUploadFlowContract$Step$Intro
            r2.<init>(r11)
            com.revolut.kompot.navigable.TransitionAnimation$NONE r4 = com.revolut.kompot.navigable.TransitionAnimation.NONE.f98393a
            r5 = 0
            r6 = 8
            r3 = 0
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            goto L89
        L76:
            r11 = r1
            yki.a r1 = r0.f68202t
            com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow.PhotosUploadFlowContract$Step$Summary r2 = new com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow.PhotosUploadFlowContract$Step$Summary
            bz3.f r11 = r11.f19923b
            r2.<init>(r11)
            com.revolut.kompot.navigable.TransitionAnimation$NONE r4 = com.revolut.kompot.navigable.TransitionAnimation.NONE.f98393a
            r5 = 0
            r6 = 8
            r3 = 0
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
        L89:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
