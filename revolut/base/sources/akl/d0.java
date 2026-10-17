package akl;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class d0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ f0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f5998w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f0 f0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.v = f0Var;
        this.f5998w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d0(this.v, this.f5998w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        if (r1.f(r2, r8, r7) == r0) goto L27;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.u
            java.lang.String r2 = r7.f5998w
            r3 = 2
            r4 = 1
            akl.f0 r5 = r7.v
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            yhm.o.b(r8)
            goto L80
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            yhm.o.b(r8)
            goto L2e
        L20:
            yhm.o.b(r8)
            com.revolut.sso.impl.network.services.OAuthUserInfoService r8 = r5.f6013a
            r7.u = r4
            java.lang.Object r8 = r8.disconnectOAuthClient(r2, r7)
            if (r8 != r0) goto L2e
            goto L7f
        L2e:
            ne0.j r8 = r5.f6015c
            java.lang.String r1 = "OAUTH_USER_INFO"
            java.lang.Object r8 = r8.get(r1)
            com.revolut.sso.api.models.OAuthUserInfo r8 = (com.revolut.sso.api.models.OAuthUserInfo) r8
            if (r8 != 0) goto L43
            com.revolut.sso.api.models.OAuthUserInfo r8 = akl.f0.a(r5)
            if (r8 != 0) goto L43
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L43:
            java.util.ArrayList r8 = r8.f105947a
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L4e:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L69
            java.lang.Object r4 = r8.next()
            r6 = r4
            com.revolut.sso.api.models.OAuthUserInfo$ConnectedClient r6 = (com.revolut.sso.api.models.OAuthUserInfo.ConnectedClient) r6
            com.revolut.sso.api.models.OAuthUserInfo$Client r6 = r6.f105951a
            java.lang.String r6 = r6.f105948a
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r2)
            if (r6 != 0) goto L4e
            r1.add(r4)
            goto L4e
        L69:
            java.lang.String r8 = "connectedClients"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r8)
            com.revolut.sso.api.models.OAuthUserInfo r8 = new com.revolut.sso.api.models.OAuthUserInfo
            r8.<init>(r1)
            x4l.c r1 = r5.d
            kotlin.Unit r2 = kotlin.Unit.f186387a
            r7.u = r3
            java.lang.Object r8 = r1.f(r2, r8, r7)
            if (r8 != r0) goto L80
        L7f:
            return r0
        L80:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: akl.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
