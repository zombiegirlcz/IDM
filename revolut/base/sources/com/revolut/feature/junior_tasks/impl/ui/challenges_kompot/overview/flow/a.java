package com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow;

import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zp8.e;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements Function1 {
    public List u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f77394w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f77395x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, e eVar, Continuation continuation) {
        super(1, continuation);
        this.f77394w = bVar;
        this.f77395x = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f77394w, this.f77395x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
