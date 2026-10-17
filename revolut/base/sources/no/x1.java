package no;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes17.dex */
public final class x1 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ y1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f217867w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AnalyticsContext f217868x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(y1 y1Var, Object obj2, AnalyticsContext analyticsContext, Continuation continuation) {
        super(2, continuation);
        this.v = y1Var;
        this.f217867w = obj2;
        this.f217868x = analyticsContext;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new x1(this.v, this.f217867w, this.f217868x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016e  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: no.x1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
