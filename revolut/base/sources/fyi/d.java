package fyi;

import dv5.n;
import dwi.h;
import efm.r;
import fjd.g0;
import java.util.concurrent.TimeUnit;
import jhi.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fkg.a f139018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f139019b;

    public d(fkg.a qrCodeGenerator, h loungePassQrCodeInteractor) {
        Intrinsics.checkNotNullParameter(qrCodeGenerator, "qrCodeGenerator");
        Intrinsics.checkNotNullParameter(loungePassQrCodeInteractor, "loungePassQrCodeInteractor");
        this.f139018a = qrCodeGenerator;
        this.f139019b = loungePassQrCodeInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable a(fyi.d r4, svi.t r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof fyi.c
            if (r0 == 0) goto L13
            r0 = r6
            fyi.c r0 = (fyi.c) r0
            int r1 = r0.f139017w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f139017w = r1
            goto L18
        L13:
            fyi.c r0 = new fyi.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f139017w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L40
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            java.lang.String r5 = r5.f265987a     // Catch: java.lang.Throwable -> L40
            r0.f139017w = r3     // Catch: java.lang.Throwable -> L40
            java.io.Serializable r6 = r4.c(r5, r0)     // Catch: java.lang.Throwable -> L40
            if (r6 != r1) goto L3d
            return r1
        L3d:
            i80.a r6 = (i80.a) r6     // Catch: java.lang.Throwable -> L40
            goto L4e
        L40:
            r4 = move-exception
            zhm.h0 r5 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r6 = rd0.d.f253311a
            rd0.c r6 = rd0.c.ERROR
            java.lang.String r0 = "AirportLoungePassDetailsQrCodeGenerator"
            r1 = 0
            rd0.d.a(r6, r0, r1, r4, r5)
            r6 = r1
        L4e:
            if (r6 != 0) goto L53
            fyi.e$a r4 = fyi.e.a.f139020a
            goto L58
        L53:
            fyi.f r4 = new fyi.f
            r4.<init>(r6)
        L58:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fyi.d.a(fyi.d, svi.t, gim.c):java.io.Serializable");
    }

    public final k b() {
        h hVar = this.f139019b;
        r rVarDistinctUntilChanged = zi0.c.u(hVar.f120424a.a(false, false), new dwi.f(2)).distinctUntilChanged(new n(new dwi.f(0), 5));
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        r rVarDoOnSubscribe = pd.b.r(rVarDistinctUntilChanged, new dwi.e(hVar, 0)).map(new n(new dwi.e(hVar, 2), 7)).distinctUntilChanged().doOnSubscribe(new n(new dwi.e(hVar, 3), 8));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnSubscribe, "doOnSubscribe(...)");
        efm.b bVarSwitchMapCompletable = hVar.f120425b.throttleLatest(30L, TimeUnit.SECONDS).switchMapCompletable(new n(new dwi.e(hVar, 1), 6));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        r rVarMergeWith = rVarDoOnSubscribe.mergeWith(bVarSwitchMapCompletable.g(r.never()));
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        r rVarFlatMap = rVarMergeWith.flatMap(new n(new dwi.e(hVar, 4), 10));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        r rVarDoOnNext = rVarFlatMap.doOnNext(new n(new dwi.f(hVar, 1), 9));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        return nim.a.u(new g0(this, (Continuation) null, 25), rd0.e.b(rVarDoOnNext));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof fyi.b
            if (r0 == 0) goto L13
            r0 = r8
            fyi.b r0 = (fyi.b) r0
            int r1 = r0.f139016w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f139016w = r1
            goto L18
        L13:
            fyi.b r0 = new fyi.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f139016w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L72
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            int r8 = r7.length()
            r2 = 30
            if (r8 < r2) goto L3b
            goto L58
        L3b:
            int r8 = r7.length()
            int r2 = r2 - r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r4 = 0
        L46:
            if (r4 >= r2) goto L50
            r5 = 32
            r8.append(r5)
            int r4 = r4 + 1
            goto L46
        L50:
            java.lang.String r8 = r8.toString()
            java.lang.String r7 = a0.d.r(r7, r8)
        L58:
            h90.a r8 = new h90.a
            r2 = 33
            r8.<init>(r2, r2)
            i80.c r2 = i80.c.H
            r4 = 20
            fkg.a r5 = r6.f139018a
            ufm.c r7 = fkg.a.m(r5, r7, r8, r2, r4)
            r0.f139016w = r3
            java.lang.Object r8 = nim.a.b(r7, r0)
            if (r8 != r1) goto L72
            return r1
        L72:
            java.lang.String r7 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            i80.a r8 = (i80.a) r8
            i80.a r7 = mif.a.Z(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: fyi.d.c(java.lang.String, gim.c):java.io.Serializable");
    }
}
