package k50;

import com.revolut.chat.ChatApi$Toggles;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a0 extends yji.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y20.g0 f181018l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f181019m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public skm.a2 f181020n;

    public a0(y20.g0 messagesRepository, j30.c chatFeatureToggles) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        this.f181018l = messagesRepository;
        this.f181019m = ((jte.d) ((rf3.d) chatFeatureToggles).f253679a).c(ChatApi$Toggles.ChatHistoryEagerLoading.f50975c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(y20.p r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof k50.z
            if (r0 == 0) goto L13
            r0 = r6
            k50.z r0 = (k50.z) r0
            int r1 = r0.f181302x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f181302x = r1
            goto L18
        L13:
            k50.z r0 = new k50.z
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f181302x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            y20.p r5 = r0.u
            yhm.o.b(r6)
            goto L4a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            boolean r6 = r4.f181019m
            if (r6 != 0) goto L3b
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L3b:
            skm.a2 r6 = r4.f181020n
            if (r6 == 0) goto L4a
            r0.u = r5
            r0.f181302x = r3
            java.lang.Object r6 = skm.e0.m(r6, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            k37.s r6 = new k37.s
            r0 = 23
            r6.<init>(r0)
            k3k.q0 r0 = new k3k.q0
            r1 = 0
            r2 = 7
            r0.<init>(r4, r5, r1, r2)
            skm.a2 r5 = r4.T2(r0, r6)
            r4.f181020n = r5
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.a0.Z2(y20.p, gim.c):java.lang.Object");
    }
}
