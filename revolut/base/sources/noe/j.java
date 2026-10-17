package noe;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements Function1 {
    public Object A;
    public Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f218014w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f218015x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f218016y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Ref$IntRef ref$IntRef, q30.h hVar, String str, String str2, String str3, String str4, String str5, String str6, Continuation continuation) {
        super(1, continuation);
        this.f218014w = ref$IntRef;
        this.f218015x = hVar;
        this.f218016y = str;
        this.z = str2;
        this.A = str3;
        this.B = str4;
        this.C = str5;
        this.D = str6;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j((CoroutineScope) this.C, (k) this.D, continuation);
            default:
                return new j((Ref$IntRef) this.f218014w, (q30.h) this.f218015x, (String) this.f218016y, (String) this.z, (String) this.A, (String) this.B, (String) this.C, (String) this.D, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ad A[SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: noe.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CoroutineScope coroutineScope, k kVar, Continuation continuation) {
        super(1, continuation);
        this.C = coroutineScope;
        this.D = kVar;
    }
}
