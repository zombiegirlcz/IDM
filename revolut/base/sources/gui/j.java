package gui;

import ald.m;
import android.os.Parcelable;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.e0;
import nii.y0;
import nii.z;
import vkm.q;
import vkm.v1;
import vkm.z1;
import yji.n;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zsi.e f146955l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r39.a f146956m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final mti.c f146957n;
    public oki.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z1 f146958p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f146959q;

    public j(zsi.e passesInteractor, r39.a dialogsMapper, mti.c idempotencyInteractor) {
        Intrinsics.checkNotNullParameter(passesInteractor, "passesInteractor");
        Intrinsics.checkNotNullParameter(dialogsMapper, "dialogsMapper");
        Intrinsics.checkNotNullParameter(idempotencyInteractor, "idempotencyInteractor");
        this.f146955l = passesInteractor;
        this.f146956m = dialogsMapper;
        this.f146957n = idempotencyInteractor;
        z1 z1VarB = q.b(1, 5, null);
        this.f146958p = z1VarB;
        this.f146959q = z1VarB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
    
        if (r2.emit(r4, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(gui.j r6, java.lang.String r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof gui.h
            if (r0 == 0) goto L13
            r0 = r8
            gui.h r0 = (gui.h) r0
            int r1 = r0.f146953x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f146953x = r1
            goto L18
        L13:
            gui.h r0 = new gui.h
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f146953x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L7f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L54
        L38:
            yhm.o.b(r8)
            zsi.e r8 = r6.f146955l
            w4l.h r2 = w4l.h.f294642c
            mti.g r8 = (mti.g) r8
            vkm.d r8 = r8.b(r7, r2)
            zfd.e r8 = zi0.c.w(r8)
            r0.u = r7
            r0.f146953x = r4
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L54
            goto L7e
        L54:
            com.revolut.data.model.Data r8 = (com.revolut.data.model.Data) r8
            java.lang.Object r8 = r8.getContent()
            com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPass r8 = (com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPass) r8
            vkm.z1 r2 = r6.f146958p
            gui.d r4 = new gui.d
            gui.g r5 = r6.c3()
            int r5 = r5.d()
            gui.g r6 = r6.c3()
            boolean r6 = r6.s0()
            r4.<init>(r7, r8, r5, r6)
            r6 = 0
            r0.u = r6
            r0.f146953x = r3
            java.lang.Object r6 = r2.emit(r4, r0)
            if (r6 != r1) goto L7f
        L7e:
            return r1
        L7f:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: gui.j.Z2(gui.j, java.lang.String, gim.c):java.lang.Object");
    }

    public static final void b3(j jVar, boolean z) {
        y0 y0Var;
        r39.a aVar = jVar.f146956m;
        Continuation continuation = null;
        if (z) {
            aVar.getClass();
            y0Var = new y0(null, new e0((Clause) new TextLocalisedClause(R$string.asft_common_network_error_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.asft_common_network_error_subtitle, null, null, 14), new TextLocalisedClause(R$string.asft_common_network_error_action_confirm, null, null, 14), (Parcelable) null, false, (AnalyticsProduct) null, 1012), false, 5);
        } else {
            aVar.getClass();
            y0Var = new y0(null, new z(new TextLocalisedClause(R$string.asft_common_state_error_title, null, null, 14), new TextLocalisedClause(R$string.asft_common_state_error_subtitle, null, null, 14), new TextLocalisedClause(R$string.asft_common_state_error_action_try_again, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5);
        }
        n.j2(jVar, jVar.L2(y0Var), null, new m(jVar, z, continuation, 22), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gui.g, oki.h] */
    public final g c3() {
        ?? r06 = this.o;
        if (r06 != 0) {
            return r06;
        }
        throw new IllegalStateException("Delegate must be set before calling purchase");
    }

    public final void d3(bti.i createPassData) {
        Intrinsics.checkNotNullParameter(createPassData, "createPassData");
        String idempotencyKey = this.f146957n.f208846b;
        mti.g gVar = (mti.g) this.f146955l;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(createPassData, "createPassData");
        n.j2(this, rd0.e.e(t1.E(new v1(new mti.e(gVar, idempotencyKey, createPassData, null))), h0.f322473a, new a0e.n(this, (Continuation) null, 5)), null, new i(this, null), 3);
    }
}
