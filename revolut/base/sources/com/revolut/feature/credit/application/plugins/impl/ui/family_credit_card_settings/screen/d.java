package com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f67681w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f67682x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f67682x = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f67682x, continuation, 0);
                dVar.f67681w = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f67682x, continuation, 1);
                dVar2.f67681w = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((qy3.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((ax4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0110 A[Catch: all -> 0x00ad, TryCatch #0 {all -> 0x00ad, blocks: (B:23:0x00a7, B:36:0x00f3, B:37:0x010a, B:39:0x0110, B:41:0x011b, B:43:0x0123, B:47:0x012b, B:49:0x012f, B:52:0x0135, B:53:0x0154, B:33:0x00cc), top: B:60:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012f A[Catch: all -> 0x00ad, TryCatch #0 {all -> 0x00ad, blocks: (B:23:0x00a7, B:36:0x00f3, B:37:0x010a, B:39:0x0110, B:41:0x011b, B:43:0x0123, B:47:0x012b, B:49:0x012f, B:52:0x0135, B:53:0x0154, B:33:0x00cc), top: B:60:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135 A[Catch: all -> 0x00ad, TryCatch #0 {all -> 0x00ad, blocks: (B:23:0x00a7, B:36:0x00f3, B:37:0x010a, B:39:0x0110, B:41:0x011b, B:43:0x0123, B:47:0x012b, B:49:0x012f, B:52:0x0135, B:53:0x0154, B:33:0x00cc), top: B:60:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012a A[SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
