package l10;

import com.revolut.domain.models.transfers.PeerToPeerTransferDescriptor;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import q97.a2;
import s8h.r0;

/* JADX INFO: loaded from: classes16.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f191383w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f191384x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f191385y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f191384x = obj2;
        this.f191385y = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m((n) this.f191384x, (n10.b) this.f191385y, this.f191383w, continuation, 0);
            case 1:
                return new m((lw5.b) this.f191384x, (jf0.c) this.f191385y, this.f191383w, continuation, 1);
            case 2:
                return new m((mf7.g) this.f191384x, (jf0.c) this.f191385y, this.f191383w, continuation, 2);
            case 3:
                return new m((mn1.b0) this.f191384x, this.f191383w, (String) this.f191385y, continuation, 3);
            case 4:
                return new m((n8a.s) this.f191384x, (String) this.f191385y, this.f191383w, continuation, 4);
            case 5:
                return new m((ne5.c) this.f191384x, (jf0.c) this.f191385y, this.f191383w, continuation, 5);
            case 6:
                return new m((com.revolut.sso.impl.ui.country_selection.b) this.f191384x, (wi0.b) this.f191385y, continuation, 6);
            case 7:
                return new m((o9k.y) this.f191384x, this.f191383w, (PeerToPeerTransferDescriptor) this.f191385y, continuation, 7);
            case 8:
                return new m((ocb.x) this.f191384x, (String) this.f191385y, this.f191383w, continuation, 8);
            case 9:
                return new m((ojd.g) this.f191384x, (String) this.f191385y, this.f191383w, continuation, 9);
            case 10:
                return new m((ok7.l) this.f191384x, (String) this.f191385y, this.f191383w, continuation, 10);
            case 11:
                m mVar = new m(this.f191383w, (p26.n) this.f191385y, continuation);
                mVar.f191384x = obj2;
                return mVar;
            case 12:
                m mVar2 = new m((a2) this.f191385y, continuation, 12);
                mVar2.f191384x = obj2;
                return mVar2;
            case 13:
                m mVar3 = new m((q97.c0) this.f191385y, continuation, 13);
                mVar3.f191384x = obj2;
                return mVar3;
            case 14:
                return new m((qac.b) this.f191384x, (String) this.f191385y, this.f191383w, continuation, 14);
            case 15:
                return new m((jid.z) this.f191384x, this.f191383w, (io3.d) this.f191385y, continuation, 15);
            case 16:
                return new m((rf5.b) this.f191384x, (jf0.c) this.f191385y, this.f191383w, continuation, 16);
            case 17:
                return new m((rv7.j) this.f191384x, (String) this.f191385y, this.f191383w, continuation, 17);
            case 18:
                return new m((s8h.x) this.f191384x, (jf0.c) this.f191385y, this.f191383w, continuation, 18);
            case 19:
                return new m((s8h.b0) this.f191384x, this.f191383w, (String) this.f191385y, continuation, 19);
            case 20:
                return new m((r0) this.f191384x, (jf0.c) this.f191385y, this.f191383w, continuation, 20);
            case 21:
                return new m(this.f191383w, (sm6.p) this.f191384x, (String) this.f191385y, continuation, 21);
            case 22:
                return new m((sxi.q) this.f191384x, this.f191383w, (String) this.f191385y, continuation, 22);
            case 23:
                return new m((szb.j) this.f191384x, (String) this.f191385y, this.f191383w, continuation, 23);
            case 24:
                return new m((tob.i) this.f191384x, (String) this.f191385y, this.f191383w, continuation, 24);
            case 25:
                return new m((com.revolut.feature.tax_residency.impl.v2.ui.fatca_flow.a) this.f191384x, (Function0) this.f191385y, this.f191383w, continuation, 25);
            case 26:
                m mVar4 = new m((ui9.z) this.f191384x, (ai9.h) this.f191385y, continuation, 26);
                mVar4.f191383w = ((Boolean) obj2).booleanValue();
                return mVar4;
            case 27:
                m mVar5 = new m((vvh.l) this.f191385y, this.f191383w, continuation);
                mVar5.f191384x = obj2;
                return mVar5;
            case 28:
                return new m(this.f191383w, (w4k.k) this.f191384x, (kq2.b) this.f191385y, continuation, 28);
            default:
                return new m((wvd.b) this.f191384x, (xi0.b) this.f191385y, this.f191383w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 26:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                break;
        }
        return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:544:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:569:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0115  */
    /* JADX WARN: Type inference failed for: r1v71, types: [x4l.c] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l10.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj2, Object obj3, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f191384x = obj2;
        this.f191385y = obj3;
        this.f191383w = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj2, boolean z, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f191384x = obj2;
        this.f191383w = z;
        this.f191385y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(r97.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f191385y = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(vvh.l lVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.u = 27;
        this.f191385y = lVar;
        this.f191383w = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(boolean z, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f191383w = z;
        this.f191384x = obj2;
        this.f191385y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(boolean z, p26.n nVar, Continuation continuation) {
        super(2, continuation);
        this.u = 11;
        this.f191383w = z;
        this.f191385y = nVar;
    }
}
