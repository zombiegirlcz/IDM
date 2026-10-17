package s8a;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pix.api.model.PixKey;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import n8a.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f260942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m8a.d f260943b;

    public c(o repository, m8a.d aliasCreationPushInterceptor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(aliasCreationPushInterceptor, "aliasCreationPushInterceptor");
        this.f260942a = repository;
        this.f260943b = aliasCreationPushInterceptor;
    }

    public final Object a(AccountId accountId, PixKey pixKey, gim.i iVar) {
        o oVar = this.f260942a;
        oVar.getClass();
        Object objF = oVar.f(accountId, pixKey, "cancel_alias_migration", new n8a.b(oVar, accountId, null, 1), iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objF != aVar) {
            objF = Unit.f186387a;
        }
        return objF == aVar ? objF : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.core.model.account.AccountId.Personal r12, com.revolut.feature.pix.api.model.AliasRegistrationType r13, gim.c r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof s8a.a
            if (r0 == 0) goto L13
            r0 = r14
            s8a.a r0 = (s8a.a) r0
            int r1 = r0.f260940x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f260940x = r1
            goto L18
        L13:
            s8a.a r0 = new s8a.a
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f260940x
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r14)     // Catch: java.lang.Throwable -> L2b
            return r14
        L2b:
            r0 = move-exception
            r12 = r0
            goto L75
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            com.revolut.core.model.account.AccountId$Personal r12 = r0.u
            yhm.o.b(r14)     // Catch: java.lang.Throwable -> L2b
            r8 = r12
            goto L5d
        L3d:
            yhm.o.b(r14)
            n8a.o r6 = r11.f260942a     // Catch: java.lang.Throwable -> L2b
            r0.u = r12     // Catch: java.lang.Throwable -> L2b
            r0.f260940x = r4     // Catch: java.lang.Throwable -> L2b
            r6.getClass()     // Catch: java.lang.Throwable -> L2b
            mll.c0 r5 = new mll.c0     // Catch: java.lang.Throwable -> L2b
            r10 = 26
            r8 = r12
            r7 = r13
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L2b
            skm.p0 r12 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L2b
            elm.f r12 = elm.f.f127540b     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r14 = skm.e0.J(r12, r5, r0)     // Catch: java.lang.Throwable -> L2b
            if (r14 != r1) goto L5d
            goto L73
        L5d:
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> L2b
            r0.u = r9     // Catch: java.lang.Throwable -> L2b
            r0.f260940x = r3     // Catch: java.lang.Throwable -> L2b
            qg7.p r5 = new qg7.p     // Catch: java.lang.Throwable -> L2b
            r6 = 23
            r7 = r11
            r10 = r9
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r12 = skm.e0.o(r5, r0)     // Catch: java.lang.Throwable -> L2b
            if (r12 != r1) goto L74
        L73:
            return r1
        L74:
            return r12
        L75:
            java.lang.String r13 = r12.getMessage()
            java.io.PrintStream r14 = java.lang.System.out
            r14.println(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: s8a.c.b(com.revolut.core.model.account.AccountId$Personal, com.revolut.feature.pix.api.model.AliasRegistrationType, gim.c):java.lang.Object");
    }

    public final Object c(AccountId accountId, PixKey pixKey, String str, gim.i iVar) {
        o oVar = this.f260942a;
        oVar.getClass();
        Object objF = oVar.f(accountId, pixKey, "deny_alias_migration", new n8a.e(oVar, accountId, pixKey, str, null, 0), iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objF != aVar) {
            objF = Unit.f186387a;
        }
        return objF == aVar ? objF : Unit.f186387a;
    }
}
