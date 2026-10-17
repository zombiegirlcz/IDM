package vy5;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function1 {
    public ArrayList u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f293159w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f293160x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(w wVar, String str, Continuation continuation) {
        super(1, continuation);
        this.f293159w = wVar;
        this.f293160x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.f293159w, this.f293160x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vy5.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
