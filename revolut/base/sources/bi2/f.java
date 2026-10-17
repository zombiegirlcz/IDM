package bi2;

import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasType;
import com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vw1.b f15380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f15381b;

    public f(vw1.b aliasRepository, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(aliasRepository, "aliasRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f15380a = aliasRepository;
        this.f15381b = userInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(bi2.f r4, java.util.List r5, gim.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof bi2.e
            if (r0 == 0) goto L16
            r0 = r6
            bi2.e r0 = (bi2.e) r0
            int r1 = r0.f15379x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f15379x = r1
            goto L1b
        L16:
            bi2.e r0 = new bi2.e
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f15379x
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.util.List r4 = r0.u
            r5 = r4
            java.util.List r5 = (java.util.List) r5
            yhm.o.b(r6)
            goto L4f
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            yhm.o.b(r6)
            r6 = r5
            java.util.List r6 = (java.util.List) r6
            r0.u = r6
            r0.f15379x = r3
            ang.f r4 = r4.f15381b
            r6 = 0
            efm.d0 r4 = r4.f(r6)
            java.lang.Object r6 = nim.a.b(r4, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            do3.n r6 = (do3.n) r6
            java.lang.String r4 = r6.i
            java.lang.String r6 = r6.f116411g
            r0 = r5
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L67
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L67
            goto L81
        L67:
            java.util.Iterator r0 = r0.iterator()
        L6b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L81
            java.lang.Object r1 = r0.next()
            com.revolut.feature.apm.core.models.alias.Alias r1 = (com.revolut.feature.apm.core.models.alias.Alias) r1
            java.lang.String r1 = r1.f61879b
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r4)
            if (r1 == 0) goto L6b
            r4 = r2
            goto L87
        L81:
            com.revolut.feature.apm.core.models.alias.AliasType$PHONE r0 = com.revolut.feature.apm.core.models.alias.AliasType.PHONE.f61895b
            com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias r4 = b(r5, r4, r0)
        L87:
            if (r6 == 0) goto L8f
            com.revolut.feature.apm.core.models.alias.AliasType$EMAIL r0 = com.revolut.feature.apm.core.models.alias.AliasType.EMAIL.f61894b
            com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias r2 = b(r5, r6, r0)
        L8f:
            com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias[] r4 = new com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias[]{r4, r2}
            java.lang.String r5 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            java.util.List r4 = kotlin.collections.d.L(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: bi2.f.a(bi2.f, java.util.List, gim.c):java.lang.Object");
    }

    public static RegisterAlias$Alias b(List list, String str, AliasType aliasType) {
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (Intrinsics.f(((Alias) it8.next()).f61879b, str)) {
                    return null;
                }
            }
        }
        return new RegisterAlias$Alias(aliasType, str);
    }
}
