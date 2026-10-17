package l25;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.y0;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends gim.i implements Function1 {
    public y0 u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f191630w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f191631x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(u uVar, String str, Continuation continuation) {
        super(1, continuation);
        this.f191630w = uVar;
        this.f191631x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.f191630w, this.f191631x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l25.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
