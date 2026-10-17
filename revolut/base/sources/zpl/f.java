package zpl;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ String A;
    public int u;
    public jn0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f324327w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f324328x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f324329y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.f324328x = gVar;
        this.f324329y = str;
        this.z = str2;
        this.A = str3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.f324328x, this.f324329y, this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0124, code lost:
    
        if (zpl.g.c3(r12, r8, r9, r21) == r7) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00da A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:8:0x001c, B:15:0x0030, B:47:0x00d4, B:49:0x00da, B:50:0x00ec, B:52:0x00f0, B:54:0x00f4, B:57:0x00f9, B:58:0x00fe, B:59:0x00ff, B:18:0x003c, B:40:0x00b4, B:42:0x00b8, B:44:0x00c0), top: B:68:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ec A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:8:0x001c, B:15:0x0030, B:47:0x00d4, B:49:0x00da, B:50:0x00ec, B:52:0x00f0, B:54:0x00f4, B:57:0x00f9, B:58:0x00fe, B:59:0x00ff, B:18:0x003c, B:40:0x00b4, B:42:0x00b8, B:44:0x00c0), top: B:68:0x0012 }] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [jn0.c] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v0, types: [jn0.d] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zpl.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
