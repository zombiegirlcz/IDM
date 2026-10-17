package elf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import tof.a3;
import tof.p6;

/* JADX INFO: loaded from: classes8.dex */
public final class j1 extends gim.i implements Function1 {
    public int A;
    public final /* synthetic */ n1 B;
    public a3 u;
    public p6 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f127353w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f127354x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f127355y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(n1 n1Var, Continuation continuation) {
        super(1, continuation);
        this.B = n1Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j1(this.B, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j1) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0168  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.j1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
