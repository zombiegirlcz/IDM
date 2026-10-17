package xd2;

import com.revolut.feature.apm.core.code.ui.ApmCodeControllerContract$CodeDescriptor;
import com.revolut.feature.apm.core.models.alias.AliasType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.i implements Function1 {
    public final /* synthetic */ Function1 A;
    public ApmCodeControllerContract$CodeDescriptor u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AliasType f304232w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f304233x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f304234y;
    public final /* synthetic */ zz1.j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AliasType aliasType, String str, f fVar, zz1.j jVar, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.f304232w = aliasType;
        this.f304233x = str;
        this.f304234y = fVar;
        this.z = jVar;
        this.A = function1;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.f304232w, this.f304233x, this.f304234y, this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r15 == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xd2.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
