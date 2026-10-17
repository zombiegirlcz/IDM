package gw1;

import afa.u;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasStatus;
import com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasRegistrationMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rv1.r;
import yji.n;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends n implements com.revolut.feature.apm.core.ui.api.navigation.a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zu1.a f147264l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f147265m;

    public e(zu1.a brebInteractor, b aliasOperationErrorParser) {
        Intrinsics.checkNotNullParameter(brebInteractor, "brebInteractor");
        Intrinsics.checkNotNullParameter(aliasOperationErrorParser, "aliasOperationErrorParser");
        this.f147264l = brebInteractor;
        this.f147265m = aliasOperationErrorParser;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(gw1.e r4, com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias r5, com.revolut.feature.apm.core.ui.api.navigation.ApmAliasRegistrationMode r6, java.lang.String r7, a5b.a r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof gw1.d
            if (r0 == 0) goto L13
            r0 = r9
            gw1.d r0 = (gw1.d) r0
            int r1 = r0.f147263y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f147263y = r1
            goto L18
        L13:
            gw1.d r0 = new gw1.d
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.f147261w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f147263y
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            a5b.a r8 = r0.v
            a5b.a r5 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L2b
            goto L47
        L2b:
            r6 = move-exception
            r8 = r5
            goto L50
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            yhm.o.b(r9)
            r0.u = r8     // Catch: java.lang.Throwable -> L4f
            r0.v = r8     // Catch: java.lang.Throwable -> L4f
            r0.f147263y = r3     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r9 = r4.b3(r6, r5, r7, r0)     // Catch: java.lang.Throwable -> L4f
            if (r9 != r1) goto L46
            return r1
        L46:
            r5 = r8
        L47:
            zz1.e r9 = (zz1.e) r9     // Catch: java.lang.Throwable -> L2b
            gw1.h r6 = new gw1.h     // Catch: java.lang.Throwable -> L2b
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L2b
            goto L5d
        L4f:
            r6 = move-exception
        L50:
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            skm.e0.p(r5)
            gw1.b r4 = r4.f147265m
            gw1.j r6 = r4.a(r6)
        L5d:
            r8.invoke(r6)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: gw1.e.Z2(gw1.e, com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias, com.revolut.feature.apm.core.ui.api.navigation.ApmAliasRegistrationMode, java.lang.String, a5b.a, gim.c):java.lang.Object");
    }

    @Override // com.revolut.feature.apm.core.ui.api.navigation.a
    public final Object b1(Alias alias, gim.i iVar) {
        return pu7.a.B(this.e, "ALIAS_OPERATION_TASK_ID", new gi2.i(this, alias, null, 14), iVar);
    }

    public final Object b3(ApmAliasRegistrationMode apmAliasRegistrationMode, RegisterAlias$Alias registerAlias$Alias, String str, gim.c cVar) {
        boolean z = apmAliasRegistrationMode instanceof ApmAliasRegistrationMode.Add;
        AliasStatus.AVAILABLE available = AliasStatus.AVAILABLE.f61886b;
        zu1.a aVar = this.f147264l;
        if (z) {
            return ((r) aVar).a(new Alias(registerAlias$Alias.f61898a, registerAlias$Alias.f61899b, available), str, cVar);
        }
        if (!(apmAliasRegistrationMode instanceof ApmAliasRegistrationMode.AddAndReplace)) {
            throw new NoWhenBranchMatchedException();
        }
        return ((r) aVar).b(((ApmAliasRegistrationMode.AddAndReplace) apmAliasRegistrationMode).f62241b, new Alias(registerAlias$Alias.f61898a, registerAlias$Alias.f61899b, available), str, cVar);
    }

    @Override // com.revolut.feature.apm.core.ui.api.navigation.a
    public final Object s0(RegisterAlias$Alias registerAlias$Alias, ApmAliasRegistrationMode apmAliasRegistrationMode, Function1 function1, Continuation continuation) {
        return pu7.a.B(this.e, "ALIAS_OPERATION_TASK_ID", new u(20, this, registerAlias$Alias, apmAliasRegistrationMode, function1, (Continuation) null), continuation);
    }
}
