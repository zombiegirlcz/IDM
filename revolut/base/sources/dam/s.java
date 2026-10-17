package dam;

import android.content.Intent;
import financial.atomic.transact.Config$Theme;
import financial.atomic.transact.activity.TransactActivity;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes20.dex */
public final class s extends cam.f {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransactActivity f112589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f112590c;
    public final i d;
    public final Lazy e;
    public final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f112591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f112592h;
    public final y9m.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zkm.d f112593j;
    public final Lazy k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(TransactActivity context, i config) {
        super(0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f112589b = context;
        this.f112590c = "Transact";
        Config$Theme config$Theme = config.f112568h;
        this.d = i.a(config, config$Theme == null ? new Config$Theme(Boolean.valueOf(hb9.b.t(context))) : config$Theme);
        this.e = yhm.j.b(new p(this, 2));
        this.f = yhm.j.b(new p(this, 1));
        this.f112591g = yhm.j.b(new p(this, 4));
        this.f112592h = yhm.j.b(new p(this, 0));
        this.i = new y9m.g(this);
        zkm.d dVarC = e0.c(p0.f264002b);
        this.f112593j = dVarC;
        this.k = yhm.j.b(new p(this, 3));
        e0.C(dVarC, zkm.o.f323119a, null, new o(this, null, 0), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0118, code lost:
    
        if (cam.t.M(r10, r2, r0) != r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G(dam.s r10, dam.i r11, gim.c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dam.s.G(dam.s, dam.i, gim.c):java.lang.Object");
    }

    public final void F(cam.c cVar) {
        m.valueOf(cVar.f22669a);
        JSONObject jSONObject = (JSONObject) cVar.f22670b;
        Intent intent = new Intent("financial.atomic.transact.EVENT");
        TransactActivity transactActivity = this.f112589b;
        intent.setPackage(transactActivity.getApplicationContext().getPackageName());
        intent.putExtra("type", cVar.f22669a);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        intent.putExtra("data", jSONObject.toString());
        transactActivity.sendBroadcast(intent);
    }

    public final void H(String type, JSONObject payload) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(payload, "payload");
        cam.t tVar = (cam.t) this.f112591g.getValue();
        StringBuilder sb6 = new StringBuilder("\n            document.body.dispatchEvent(\n                new CustomEvent('");
        j6.a.D(sb6, m.NATIVE_EVENT.f112581a, "', {\n                    detail: { name: '", type, "', payload: ");
        sb6.append(payload);
        sb6.append(" }\n                })\n            )\n        ");
        String js = sb6.toString();
        q handler = q.f112586h;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(js, "js");
        Intrinsics.checkNotNullParameter(handler, "handler");
        e0.C(tVar.d, null, null, new c34.d(tVar, js, handler, (Continuation) null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        if (skm.e0.J(zkm.o.f323119a, new cam.j(r8, null, 0), r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof dam.r
            if (r0 == 0) goto L13
            r0 = r8
            dam.r r0 = (dam.r) r0
            int r1 = r0.f112588x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112588x = r1
            goto L18
        L13:
            dam.r r0 = new dam.r
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f112588x
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r8)
            goto L7e
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            dam.s r2 = r0.u
            yhm.o.b(r8)
            goto L5e
        L39:
            yhm.o.b(r8)
            kotlin.Lazy r8 = r7.f112592h
            java.lang.Object r8 = r8.getValue()
            z9m.k r8 = (z9m.k) r8
            r0.u = r7
            r0.f112588x = r5
            r8.getClass()
            skm.p0 r2 = skm.p0.f264001a
            tkm.e r2 = zkm.o.f323119a
            yv1.k r5 = new yv1.k
            r6 = 25
            r5.<init>(r8, r3, r6)
            java.lang.Object r8 = skm.e0.J(r2, r5, r0)
            if (r8 != r1) goto L5d
            goto L7d
        L5d:
            r2 = r7
        L5e:
            kotlin.Lazy r8 = r2.f112591g
            java.lang.Object r8 = r8.getValue()
            cam.t r8 = (cam.t) r8
            r0.u = r3
            r0.f112588x = r4
            r8.getClass()
            skm.p0 r2 = skm.p0.f264001a
            tkm.e r2 = zkm.o.f323119a
            cam.j r4 = new cam.j
            r5 = 0
            r4.<init>(r8, r3, r5)
            java.lang.Object r8 = skm.e0.J(r2, r4, r0)
            if (r8 != r1) goto L7e
        L7d:
            return r1
        L7e:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dam.s.I(gim.c):java.lang.Object");
    }
}
