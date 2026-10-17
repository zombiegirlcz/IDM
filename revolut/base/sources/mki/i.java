package mki;

import aii.n;
import aii.o;
import aii.u;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dki.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class i {
    public static final ViewController a(aii.e eVar, o eventsDispatcher) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(eventsDispatcher, "eventsDispatcher");
        n nVarM0 = eventsDispatcher.M0(new aii.h(eVar));
        if (nVarM0 instanceof aii.g) {
            return ((aii.g) nVarM0).f5285a;
        }
        throw new IllegalStateException(("Can't resolve controller for " + eVar).toString());
    }

    public static final n b(o eventsDispatcher, u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        Intrinsics.checkNotNullParameter(eventsDispatcher, "eventsDispatcher");
        return knm.b.j(eventsDispatcher, uVar);
    }

    public static final n c(o eventsDispatcher, InternalDestination internalDestination) {
        Intrinsics.checkNotNullParameter(eventsDispatcher, "eventsDispatcher");
        Intrinsics.checkNotNullParameter(internalDestination, "internalDestination");
        return b(eventsDispatcher, internalDestination);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(aii.x r4, aii.o r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof mki.h
            if (r0 == 0) goto L13
            r0 = r6
            mki.h r0 = (mki.h) r0
            int r1 = r0.f206473w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f206473w = r1
            goto L18
        L13:
            mki.h r0 = new mki.h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f206473w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            aii.o r5 = r0.u
            yhm.o.b(r6)
            goto L54
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            aii.y r6 = new aii.y
            r6.<init>(r4)
            aii.n r6 = r5.M0(r6)
            boolean r2 = r6 instanceof aii.z
            if (r2 == 0) goto L44
            aii.z r6 = (aii.z) r6
            goto L45
        L44:
            r6 = 0
        L45:
            if (r6 == 0) goto L5c
            w64.d r4 = r6.f5297a
            r0.u = r5
            r0.f206473w = r3
            java.lang.Object r6 = r4.invoke(r0)
            if (r6 != r1) goto L54
            return r1
        L54:
            aii.u r6 = (aii.u) r6
            b(r5, r6)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        L5c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Couldn't resolve request "
            r6.<init>(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mki.i.d(aii.x, aii.o, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final n e(BaseScreen baseScreen, o eventsDispatcher, ModalDestination.Style style, Function1 function1) {
        Intrinsics.checkNotNullParameter(baseScreen, "<this>");
        Intrinsics.checkNotNullParameter(eventsDispatcher, "eventsDispatcher");
        Intrinsics.checkNotNullParameter(style, "style");
        return knm.b.j(eventsDispatcher, new com.revolut.kompot.common.d(baseScreen, style, function1));
    }

    public static final n f(p pVar, o eventsDispatcher, ModalDestination.Style style, Function1 function1) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(eventsDispatcher, "eventsDispatcher");
        Intrinsics.checkNotNullParameter(style, "style");
        return knm.b.j(eventsDispatcher, new com.revolut.kompot.common.c(pVar, style, function1));
    }

    public static final void g(ViewController viewController, o eventsDispatcher, ModalDestination.Style style, Function1 block) {
        Intrinsics.checkNotNullParameter(viewController, "<this>");
        Intrinsics.checkNotNullParameter(eventsDispatcher, "eventsDispatcher");
        Intrinsics.checkNotNullParameter(style, "style");
        if (block != null) {
            viewController.getClass();
            Intrinsics.checkNotNullParameter(block, "block");
            viewController.H = block;
        }
        knm.b.j(eventsDispatcher, new com.revolut.kompot.common.b(viewController, style, 4));
    }
}
