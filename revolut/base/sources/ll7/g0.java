package ll7;

import java.io.Serializable;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends gim.i implements Function2 {
    public final /* synthetic */ Serializable A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f196627w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f196628x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f196629y;
    public final /* synthetic */ Serializable z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Ref$BooleanRef ref$BooleanRef, long j2, Ref$ObjectRef ref$ObjectRef, Function1 function1, Ref$ObjectRef ref$ObjectRef2, Function1 function12, Function1 function13, Continuation continuation) {
        super(2, continuation);
        this.A = ref$BooleanRef;
        this.f196627w = j2;
        this.f196629y = ref$ObjectRef;
        this.B = function1;
        this.z = ref$ObjectRef2;
        this.C = function12;
        this.D = function13;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g0((Ref$BooleanRef) this.A, this.f196627w, (Ref$ObjectRef) this.f196629y, (Function1) this.B, (Ref$ObjectRef) this.z, (Function1) this.C, (Function1) this.D, continuation);
            case 1:
                return new g0((m8l.g) this.f196628x, (j8l.h) this.f196629y, this.f196627w, (String) this.z, (j8l.d) this.A, (String) this.B, (j8l.h) this.C, (j8l.j) this.D, continuation);
            default:
                return new g0((oc0.n) this.f196629y, (String) this.z, (String) this.A, this.f196627w, (String) this.B, (String) this.C, (Set) this.D, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ab, code lost:
    
        if (((java.lang.Boolean) ((kotlin.jvm.functions.Function1) r12.D).invoke(r13)).booleanValue() != false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0159 A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:56:0x013b, B:75:0x017b, B:65:0x0151, B:67:0x0159, B:71:0x016b, B:68:0x015d, B:62:0x014a), top: B:89:0x0131 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015d A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:56:0x013b, B:75:0x017b, B:65:0x0151, B:67:0x0159, B:71:0x016b, B:68:0x015d, B:62:0x014a), top: B:89:0x0131 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x017a -> B:75:0x017b). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ll7.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(m8l.g gVar, j8l.h hVar, long j2, String str, j8l.d dVar, String str2, j8l.h hVar2, j8l.j jVar, Continuation continuation) {
        super(2, continuation);
        this.f196628x = gVar;
        this.f196629y = hVar;
        this.f196627w = j2;
        this.z = str;
        this.A = dVar;
        this.B = str2;
        this.C = hVar2;
        this.D = jVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(oc0.n nVar, String str, String str2, long j2, String str3, String str4, Set set, Continuation continuation) {
        super(2, continuation);
        this.f196629y = nVar;
        this.z = str;
        this.A = str2;
        this.f196627w = j2;
        this.B = str3;
        this.C = str4;
        this.D = set;
    }
}
