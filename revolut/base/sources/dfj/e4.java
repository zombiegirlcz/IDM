package dfj;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes11.dex */
public final class e4 extends gim.i implements Function1 {
    public Ref$ObjectRef u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f113952w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f113953x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f113954y;
    public final /* synthetic */ k4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(Ref$ObjectRef ref$ObjectRef, String str, long j2, k4 k4Var, Continuation continuation) {
        super(1, continuation);
        this.f113952w = ref$ObjectRef;
        this.f113953x = str;
        this.f113954y = j2;
        this.z = k4Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e4(this.f113952w, this.f113953x, this.f113954y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e4) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0050 -> B:20:0x0051). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.v
            kotlin.jvm.internal.Ref$ObjectRef r2 = r7.f113952w
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            kotlin.jvm.internal.Ref$ObjectRef r1 = r7.u
            yhm.o.b(r8)
            goto L51
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            yhm.o.b(r8)
            goto L3d
        L20:
            yhm.o.b(r8)
        L23:
            java.lang.Object r8 = r2.f186409a
            dej.t1 r8 = (dej.t1) r8
            java.lang.String r1 = r7.f113953x
            boolean r8 = gj7.b.D(r8, r1)
            if (r8 != 0) goto L54
            r8 = 0
            r7.u = r8
            r7.v = r4
            long r5 = r7.f113954y
            java.lang.Object r8 = skm.k0.c(r5, r7)
            if (r8 != r0) goto L3d
            goto L4f
        L3d:
            java.lang.Object r8 = r2.f186409a
            dej.t1 r8 = (dej.t1) r8
            java.lang.String r8 = r8.f113650a
            r7.u = r2
            r7.v = r3
            dfj.k4 r1 = r7.z
            java.lang.Object r8 = dfj.k4.a(r1, r8, r7)
            if (r8 != r0) goto L50
        L4f:
            return r0
        L50:
            r1 = r2
        L51:
            r1.f186409a = r8
            goto L23
        L54:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.e4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
