package lem;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nkm.o;

/* JADX INFO: loaded from: classes23.dex */
public final class b extends gim.h implements Function2 {
    public final /* synthetic */ c A;
    public Iterator u;
    public int[] v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f194595w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f194596x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f194597y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.A = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.A, continuation);
        bVar.z = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((o) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0034 -> B:12:0x003d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0045 -> B:21:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005f -> B:20:0x0060). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.z
            nkm.o r0 = (nkm.o) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r10.f194597y
            lem.c r3 = r10.A
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L24
            if (r2 != r5) goto L1c
            int r2 = r10.f194596x
            int r6 = r10.f194595w
            int[] r7 = r10.v
            java.util.Iterator r8 = r10.u
            yhm.o.b(r11)
            goto L60
        L1c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L24:
            yhm.o.b(r11)
            java.util.ArrayList r11 = r3.f194598a
            java.util.Iterator r11 = r11.iterator()
            r2 = r4
        L2e:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L68
            java.lang.Object r6 = r11.next()
            int[] r6 = (int[]) r6
            r7 = r6
            r6 = r2
            r2 = r4
        L3d:
            int r8 = r7.length
            if (r2 >= r8) goto L66
            int r8 = r3.a(r6)
            r9 = -1
            if (r8 == r9) goto L61
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r6)
            r10.z = r0
            r10.u = r11
            r10.v = r7
            r10.f194595w = r6
            r10.f194596x = r2
            r10.f194597y = r5
            fim.a r8 = r0.b(r8, r10)
            if (r8 != r1) goto L5f
            return r1
        L5f:
            r8 = r11
        L60:
            r11 = r8
        L61:
            int r2 = r2 + 6
            int r6 = r6 + 6
            goto L3d
        L66:
            r2 = r6
            goto L2e
        L68:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: lem.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
