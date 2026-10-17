package sy1;

import com.revolut.feature.apm.core.gateway.impl.common.UnsupportedApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmBeneficiary;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f266572a;

    public d(Set set) {
        Intrinsics.checkNotNullParameter(set, "set");
        this.f266572a = set;
    }

    public final my1.a a(ApmContact apmContact) {
        Object next;
        Iterator it8 = this.f266572a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((my1.a) next).b(apmContact)) {
                break;
            }
        }
        my1.a aVar = (my1.a) next;
        if (aVar != null) {
            return aVar;
        }
        throw new UnsupportedApmContact("ApmProductInteractor", apmContact);
    }

    public final Object b(ApmRecipient apmRecipient, gim.c cVar) {
        if (apmRecipient instanceof ApmContact) {
            ApmContact apmContact = (ApmContact) apmRecipient;
            return d(a(apmContact), apmContact, new b(3, 0, null), cVar);
        }
        if (apmRecipient instanceof ApmBeneficiary) {
            return Boolean.FALSE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Object c(ApmRecipient apmRecipient, gim.c cVar) {
        if (apmRecipient instanceof ApmContact) {
            ApmContact apmContact = (ApmContact) apmRecipient;
            return d(a(apmContact), apmContact, new b(3, 1, null), cVar);
        }
        if (apmRecipient instanceof ApmBeneficiary) {
            return Boolean.TRUE;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(my1.a r5, com.revolut.feature.apm.core.models.recipients.ApmContact r6, kotlin.jvm.functions.Function3 r7, gim.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof sy1.c
            if (r0 == 0) goto L13
            r0 = r8
            sy1.c r0 = (sy1.c) r0
            int r1 = r0.f266571x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f266571x = r1
            goto L18
        L13:
            sy1.c r0 = new sy1.c
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f266571x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.apm.core.models.recipients.ApmContact r6 = r0.u
            yhm.o.b(r8)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r8)
            if (r6 == 0) goto L38
            r8 = r6
            goto L39
        L38:
            r8 = 0
        L39:
            if (r8 == 0) goto L49
            r0.u = r6
            r0.f266571x = r3
            java.lang.Object r8 = r7.invoke(r5, r8, r0)
            if (r8 != r1) goto L46
            return r1
        L46:
            if (r8 == 0) goto L49
            return r8
        L49:
            com.revolut.feature.apm.core.gateway.impl.common.WrongProviderForApmContact r5 = new com.revolut.feature.apm.core.gateway.impl.common.WrongProviderForApmContact
            java.lang.String r7 = "provider"
            java.lang.String r8 = "ApmProductInteractor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r7)
            java.lang.String r7 = "contact"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Check that you registered "
            r7.<init>(r0)
            r7.append(r8)
            java.lang.String r8 = " for: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sy1.d.d(my1.a, com.revolut.feature.apm.core.models.recipients.ApmContact, kotlin.jvm.functions.Function3, gim.c):java.lang.Object");
    }
}
