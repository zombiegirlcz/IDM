package aem;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final class l extends gim.i implements Function2 {
    public Object u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3743w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3744x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f3745y;

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(2, continuation);
        lVar.f3745y = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((hem.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(1:(1:(8:6|56|7|30|34|(2:39|(1:(1:48)(1:47))(1:43))(1:38)|49|50)(2:9|10))(1:11))(2:12|(2:14|15)(4:16|(2:18|(3:21|(1:24)|28))|51|52))|25|54|26|(6:29|30|34|(2:39|(1:(2:45|48)(0))(0))(0)|49|50)|28) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cb, code lost:
    
        r1 = r2;
        r2 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aem.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
