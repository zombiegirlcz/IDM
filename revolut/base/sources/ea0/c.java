package ea0;

import aii.g;
import aii.p;
import aii.u;
import com.revolut.core.backend_flow.api.NewBackendFlowApi$Toggles;
import com.revolut.core.backend_flow.api.navigation.BackendFlowDestination;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.core.backend_flow.impl.flow.BackendFlow;
import com.revolut.core.backend_flow.impl.internal_flow.InternalBackendFlow;
import com.revolut.core.backend_flow.ui.BackendFlowPermissionDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oa0.e;
import ra0.h;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f124046a;

    public c(h repository, e permissionBackendFlowControllerFactory) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(permissionBackendFlowControllerFactory, "permissionBackendFlowControllerFactory");
        this.f124046a = permissionBackendFlowControllerFactory;
    }

    public static ViewController a(BackendFlowInput backendFlowInput) {
        BackendFlowInput.Source f51218a = backendFlowInput.getF51218a();
        if (f51218a instanceof BackendFlowInput.Source.Remote) {
            return new BackendFlow(backendFlowInput);
        }
        if (f51218a instanceof BackendFlowInput.Source.Session) {
            return new InternalBackendFlow(backendFlowInput);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // nhi.f
    public final g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof n90.a)) {
            return null;
        }
        n90.a aVar = (n90.a) descriptor;
        return aVar.a(a(aVar.b()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // nhi.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(aii.x r4, kotlin.coroutines.Continuation r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof ea0.b
            if (r4 == 0) goto L13
            r4 = r5
            ea0.b r4 = (ea0.b) r4
            int r0 = r4.f124045w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f124045w = r0
            goto L1a
        L13:
            ea0.b r4 = new ea0.b
            gim.c r5 = (gim.c) r5
            r4.<init>(r3, r5)
        L1a:
            java.lang.Object r5 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r4 = r4.f124045w
            r0 = 0
            if (r4 == 0) goto L39
            r1 = 1
            if (r4 == r1) goto L2e
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2e:
            yhm.o.b(r5)
            java.util.UUID r5 = (java.util.UUID) r5
            com.revolut.core.backend_flow.api.navigation.BackendFlowInput$Source$Session r4 = new com.revolut.core.backend_flow.api.navigation.BackendFlowInput$Source$Session
            r4.<init>(r5)
            throw r0
        L39:
            yhm.o.b(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ea0.c.d(aii.x, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // nte.a
    public final List e() {
        return NewBackendFlowApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof BackendFlowDestination) {
            return gc0.c.b(a(((BackendFlowDestination) destination).getF51217b()), new a(this, 0));
        }
        if (!(destination instanceof BackendFlowPermissionDestination)) {
            return null;
        }
        return gc0.c.b(((oa0.h) this.f124046a).a(((BackendFlowPermissionDestination) destination).getF51311a(), new o95.b(21)), new aab.b(12));
    }
}
