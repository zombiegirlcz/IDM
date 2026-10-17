package j34;

import ft3.h1;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f170963w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h1 f170964x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(g gVar, h1 h1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f170963w = gVar;
        this.f170964x = h1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f170963w, this.f170964x, continuation, 0);
            default:
                return new c(this.f170963w, this.f170964x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x028d  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 1520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j34.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
