package ih7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import mh7.c;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f161297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f161298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f161299c;
    public final CoroutineDispatcher d;
    public final kh4.b e;
    public final AtomicReference f;

    public b(Context appContext, c installDataMediator, CoroutineScope scope, CoroutineDispatcher dispatcher, kh4.b clientFactory) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(installDataMediator, "installDataMediator");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(clientFactory, "clientFactory");
        this.f161297a = appContext;
        this.f161298b = installDataMediator;
        this.f161299c = scope;
        this.d = dispatcher;
        this.e = clientFactory;
        this.f = new AtomicReference(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ih7.a
            if (r0 == 0) goto L13
            r0 = r8
            ih7.a r0 = (ih7.a) r0
            int r1 = r0.f161296w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f161296w = r1
            goto L18
        L13:
            ih7.a r0 = new ih7.a
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f161296w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r8)
            goto L5a
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L30:
            yhm.o.b(r8)
            mh7.c r8 = r7.f161298b
            vkm.j2 r2 = r8.d
        L37:
            java.lang.Object r5 = r2.getValue()
            r6 = r5
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.getClass()
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r5 = r2.h(r5, r6)
            if (r5 == 0) goto L37
            r0.f161296w = r4
            kotlinx.coroutines.CoroutineDispatcher r2 = r8.f205423c
            mh7.b r4 = new mh7.b
            r5 = 0
            r4.<init>(r8, r3, r5)
            java.lang.Object r8 = skm.e0.J(r2, r4, r0)
            if (r8 != r1) goto L5a
            return r1
        L5a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L85
            kh4.b r8 = r7.e
            android.content.Context r0 = r7.f161297a
            java.lang.Object r8 = r8.invoke(r0)
            com.android.installreferrer.api.InstallReferrerClient r8 = (com.android.installreferrer.api.InstallReferrerClient) r8
        L6c:
            java.util.concurrent.atomic.AtomicReference r0 = r7.f
            boolean r1 = r0.compareAndSet(r3, r8)
            if (r1 == 0) goto L7f
            a61.a r0 = new a61.a
            r1 = 24
            r0.<init>(r7, r8, r1)
            r8.startConnection(r0)
            goto L85
        L7f:
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L6c
        L85:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ih7.b.a(gim.c):java.lang.Object");
    }
}
