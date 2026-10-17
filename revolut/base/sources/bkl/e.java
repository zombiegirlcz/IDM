package bkl;

import java.io.IOException;
import java.util.Iterator;
import jkl.k;
import jkl.l;
import jkl.l2;
import jkl.m;
import jkl.n;
import jkl.o;
import jkl.p;
import jkl.q;
import jkl.r;
import jkl.s;
import jkl.t;
import jkl.u;
import jkl.v;
import jkl.w;
import kg.l0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f16421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f16422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f16423c;
    public final /* synthetic */ l0 d;
    public final /* synthetic */ l0 e;
    public final /* synthetic */ l0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l0 f16424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l0 f16425h;
    public final /* synthetic */ l0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l0 f16426j;
    public final /* synthetic */ l0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0 f16427l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0 f16428m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0 f16429n;

    public e(l0 l0Var, l0 l0Var2, l0 l0Var3, l0 l0Var4, l0 l0Var5, l0 l0Var6, l0 l0Var7, l0 l0Var8, l0 l0Var9, l0 l0Var10, l0 l0Var11, l0 l0Var12, l0 l0Var13, l0 l0Var14) {
        this.f16421a = l0Var;
        this.f16422b = l0Var2;
        this.f16423c = l0Var3;
        this.d = l0Var4;
        this.e = l0Var5;
        this.f = l0Var6;
        this.f16424g = l0Var7;
        this.f16425h = l0Var8;
        this.i = l0Var9;
        this.f16426j = l0Var10;
        this.k = l0Var11;
        this.f16427l = l0Var12;
        this.f16428m = l0Var13;
        this.f16429n = l0Var14;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0135  */
    @Override // kg.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(qg.a r8) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bkl.e.c(qg.a):java.lang.Object");
    }

    @Override // kg.l0
    public final void d(qg.c out, Object obj2) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        w wVar = obj2 instanceof w ? (w) obj2 : null;
        if (wVar == null) {
            return;
        }
        qg.c cVarK = out.g().k("method").s(wVar.getMethod().getValue()).k("id").s(wVar.getId()).k("state");
        w.a state = wVar.getState();
        qg.c cVarS = cVarK.s(state != null ? state.name() : null).k("hint").s(wVar.getHint()).k("expiresAt").r(wVar.getExpiresAt()).k("code").s(wVar.getCode());
        v details = wVar.getDetails();
        if (details != null) {
            qg.c cVarG = cVarS.k("details").g();
            Intrinsics.checkNotNullExpressionValue(cVarG, "beginObject(...)");
            if (details instanceof k) {
                cVarG.k("deepLink").s(((k) details).getDeeplink());
            } else if (details instanceof l) {
                cVarG.k("verificationToken").s(((l) details).getVerificationToken());
            } else if (details instanceof m) {
                cVarG.k("deepLink").s(((m) details).getDeeplink());
            } else if (details instanceof n) {
                n nVar = (n) details;
                cVarG.k("phone").s(nVar.getPhone()).k("text").s(nVar.getText());
            } else if (details instanceof o) {
                o oVar = (o) details;
                cVarG.k("authorizationUrl").s(oVar.getAuthorizationUrl()).k("callbackUrl").s(oVar.getCallbackUrl());
            } else if (details instanceof p) {
                cVarG.k("visible").w(((p) details).getVisible());
            } else if (details instanceof q) {
                cVarG.k("timeout_millis").r(((q) details).getTimeoutInMillis());
            } else if (details instanceof r) {
                r rVar = (r) details;
                cVarG.k("check_url").s(rVar.getCheckUrl()).k("timeout_millis").r(rVar.getTimeoutInMillis());
            } else if (details instanceof s) {
                s sVar = (s) details;
                cVarG.k("authorizationUrl").s(sVar.getAuthorizationUrl()).k("callbackUrl").s(sVar.getCallbackUrl());
            } else if (details instanceof u) {
                cVarG.k("timeout_millis").r(((u) details).getTimeoutInMillis());
            } else {
                if (!(details instanceof t)) {
                    throw new NoWhenBranchMatchedException();
                }
                qg.c cVarK2 = cVarG.k("algorithms");
                cVarK2.f();
                t tVar = (t) details;
                for (t.a aVar : tVar.getAlgorithms()) {
                    cVarK2.g();
                    cVarK2.k("name").s(aVar.getName());
                    cVarK2.k("value").r(Integer.valueOf(aVar.getValue()));
                    cVarK2.j();
                }
                cVarK2.i();
                qg.c cVarK3 = cVarK2.k("credentials");
                cVarK3.f();
                Iterator it8 = tVar.getCredentials().iterator();
                while (it8.hasNext()) {
                    cVarK3.s((String) it8.next());
                }
                cVarK3.i();
                cVarK3.k("relyingParty").s(tVar.getRelyingParty());
            }
            cVarG.j();
        }
        l2 operation = wVar.getOperation();
        if (operation != null) {
            qg.c cVarG2 = cVarS.k("operation").g();
            Intrinsics.checkNotNullExpressionValue(cVarG2, "beginObject(...)");
            cVarG2.k("title").s(operation.getTitle()).k("subtitle").s(operation.getSubtitle());
            cVarG2.j();
        }
        cVarS.j();
    }
}
