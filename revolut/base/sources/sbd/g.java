package sbd;

import gim.i;
import j8l.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends i implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f261577w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f261578x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f261579y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m8l.g gVar, j8l.h hVar, long j2, j8l.h hVar2, j8l.d dVar, String str, j jVar, Continuation continuation) {
        super(2, continuation);
        this.u = 2;
        this.f261577w = gVar;
        this.z = hVar;
        this.f261579y = j2;
        this.B = hVar2;
        this.C = dVar;
        this.f261578x = str;
        this.A = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g((h) this.f261577w, this.f261578x, this.f261579y, (String) this.z, (lcd.j) this.A, (String) this.B, (String) this.C, continuation, 0);
            case 1:
                return new g((h) this.f261577w, this.f261578x, this.f261579y, (String) this.z, (lcd.j) this.A, (String) this.B, (String) this.C, continuation, 1);
            default:
                return new g((m8l.g) this.f261577w, (j8l.h) this.z, this.f261579y, (j8l.h) this.B, (j8l.d) this.C, this.f261578x, (j) this.A, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00db, code lost:
    
        if (r8.c(r19, r6, true) == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0142, code lost:
    
        if (r8.c(r19, r6, true) == r0) goto L76;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sbd.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, String str, long j2, String str2, lcd.j jVar, String str3, String str4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f261577w = hVar;
        this.f261578x = str;
        this.f261579y = j2;
        this.z = str2;
        this.A = jVar;
        this.B = str3;
        this.C = str4;
    }
}
