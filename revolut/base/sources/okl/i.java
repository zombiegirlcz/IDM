package okl;

import com.revolut.feature.kyc.vendors.shared.api.uae_pass.UaePassFlowOutputData;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f226189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f226190b;

    public /* synthetic */ i(com.revolut.sso.impl.ui.auth.n nVar, int i) {
        this.f226189a = i;
        this.f226190b = nVar;
    }

    private final Object a(Object obj2, Object obj3) {
        oki.g onResult = (oki.g) obj2;
        UaePassFlowOutputData output = (UaePassFlowOutputData) obj3;
        Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
        Intrinsics.checkNotNullParameter(output, "output");
        if (output instanceof UaePassFlowOutputData.Completed) {
            com.revolut.sso.impl.ui.auth.n nVar = this.f226190b;
            List<String> queryParameters = ((f80.b) nVar.f106370d0).f(((UaePassFlowOutputData.Completed) output).f77914a).getQueryParameters("challengeId");
            Intrinsics.checkNotNullExpressionValue(queryParameters, "getQueryParameters(...)");
            String str = (String) zhm.d0.M0(queryParameters);
            Continuation continuation = null;
            if (str == null || str.length() <= 0) {
                str = null;
            }
            if (str == null) {
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "Revolut SSO", "UAE PASS terminal URL has no single non-empty challengeId", null, h0Var);
                nVar.y3();
            } else {
                nVar.l2(new e0(nVar, str, continuation, 1), new yi5.b(26));
            }
        } else if (!(output instanceof UaePassFlowOutputData.Cancelled) && !(output instanceof UaePassFlowOutputData.ApplicationUnavailable)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:257:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x09b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0140  */
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
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r43, java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 3404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okl.i.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
