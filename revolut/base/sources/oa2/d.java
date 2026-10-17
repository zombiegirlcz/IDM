package oa2;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.payid.impl.screen.createpayid.aliases.AliasesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AliasesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AliasesScreen aliasesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = aliasesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.u
            com.revolut.core.ui_kit.delegates.RowDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.RowDelegate.Model) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r4)
            com.revolut.feature.apm.payid.impl.screen.createpayid.aliases.AliasesScreen r4 = r3.v
            java.lang.Object r4 = r4.N
            java.lang.Object r4 = r4.getValue()
            oa2.i r4 = (oa2.i) r4
            oa2.j r1 = new oa2.j
            java.lang.String r0 = r0.f53228a
            r1.<init>(r0)
            oa2.m r4 = (oa2.m) r4
            r4.getClass()
            java.lang.String r2 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            int r1 = r0.hashCode()
            r2 = 96746826(0x5c43d4a, float:1.8454265E-35)
            if (r1 == r2) goto L50
            r2 = 106770204(0x65d2f1c, float:4.160009E-35)
            if (r1 == r2) goto L44
            r2 = 1222574733(0x48df028d, float:456724.4)
            if (r1 == r2) goto L38
            goto L58
        L38:
            java.lang.String r1 = "LIST_ID_ALIAS_REVOLUT"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            goto L58
        L41:
            com.revolut.feature.apm.core.models.alias.AliasType$REVTAG_EMAIL r0 = com.revolut.feature.apm.core.models.alias.AliasType.REVTAG_EMAIL.f61896b
            goto L5c
        L44:
            java.lang.String r1 = "LIST_ID_ALIAS_PHONE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4d
            goto L58
        L4d:
            com.revolut.feature.apm.core.models.alias.AliasType$PHONE r0 = com.revolut.feature.apm.core.models.alias.AliasType.PHONE.f61895b
            goto L5c
        L50:
            java.lang.String r1 = "LIST_ID_ALIAS_EMAIL"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5a
        L58:
            r0 = 0
            goto L5c
        L5a:
            com.revolut.feature.apm.core.models.alias.AliasType$EMAIL r0 = com.revolut.feature.apm.core.models.alias.AliasType.EMAIL.f61894b
        L5c:
            if (r0 == 0) goto L66
            oa2.g r1 = new oa2.g
            r1.<init>(r0)
            r4.C2(r1)
        L66:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: oa2.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
