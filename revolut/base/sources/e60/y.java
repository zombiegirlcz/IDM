package e60;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.revolut.core.ui_kit.delegates.PhotoDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Explanation;
import e60.l;
import ip0.u00;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class y extends t {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final aii.o f122873l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y80.a f122874m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u96.b f122875n;
    public final Optional o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f122876p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h f122877q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f122878r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a2 f122879s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a2 f122880t;
    public final ihm.j u;
    public final ihm.j v;

    public y(aii.o eventsDispatcher, y80.a permissionProvider, u96.b documentScannerSupportInteractor, Optional documentScannerInstallerOptional) {
        Intrinsics.checkNotNullParameter(eventsDispatcher, "eventsDispatcher");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(documentScannerSupportInteractor, "documentScannerSupportInteractor");
        Intrinsics.checkNotNullParameter(documentScannerInstallerOptional, "documentScannerInstallerOptional");
        this.f122873l = eventsDispatcher;
        this.f122874m = permissionProvider;
        this.f122875n = documentScannerSupportInteractor;
        this.o = documentScannerInstallerOptional;
        this.f122876p = jo0.g.B;
        this.u = p.a.D("toSerialized(...)");
        this.v = p.a.D("toSerialized(...)");
    }

    @Override // e60.t
    public final String Z2() {
        return this.f122878r;
    }

    @Override // e60.t
    public final efm.r b3() {
        return this.u;
    }

    @Override // e60.t
    public final void c3(IntentSender.SendIntentException e) {
        Intrinsics.checkNotNullParameter(e, "e");
        IllegalStateException illegalStateException = new IllegalStateException("Unable to start user confirmation dialog for downloading document scanner", e);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        h hVar = this.f122877q;
        k3(new d(hVar != null ? hVar.a() : null));
    }

    @Override // e60.t
    public final void d3(String listId) {
        List list;
        i iVarA;
        List list2;
        i iVarA2;
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        if (iHashCode != -2068337567) {
            if (iHashCode != -1089932683) {
                if (iHashCode == -842922968 && listId.equals("id_remove")) {
                    h hVar = this.f122877q;
                    k3(new c(hVar != null ? hVar.a() : null, new l.a(this.f122878r)));
                    return;
                }
            } else if (listId.equals("id_upload_document")) {
                h hVar2 = this.f122877q;
                if (hVar2 == null || (iVarA2 = hVar2.a()) == null || (list2 = iVarA2.f122851g) == null) {
                    o.Companion.getClass();
                    list2 = b.f122838c;
                }
                l3(list2);
                return;
            }
        } else if (listId.equals("id_from_gallery")) {
            h hVar3 = this.f122877q;
            if (hVar3 == null || (iVarA = hVar3.a()) == null || (list = iVarA.f122852h) == null) {
                o.Companion.getClass();
                list = b.f122837b;
            }
            l3(list);
            return;
        }
        h hVar4 = this.f122877q;
        k3(new c(hVar4 != null ? hVar4.a() : null, new k(listId, this.f122878r)));
    }

    @Override // yji.r
    public final void e(Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f122878r = state.getString("MEDIA_PICKER_ID_KEY");
    }

    @Override // e60.t
    public final void e3() {
        a2 a2Var = this.f122879s;
        if (a2Var != null) {
            a2Var.f(null);
        }
        a2 a2Var2 = this.f122880t;
        if (a2Var2 != null) {
            a2Var2.f(null);
        }
    }

    @Override // e60.t
    public final void f3(i inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        aim.e eVarB = zhm.u.b();
        if (inputData.f122853j != null) {
            eVarB.add(new v(PermissionsFlowContract$Explanation.None.f98339a));
        }
        v[] vVarArr = (v[]) zhm.u.a(eVarB).toArray(new v[0]);
        j3((v[]) Arrays.copyOf(vVarArr, vVarArr.length), new e1.b(this, inputData, 21));
    }

    @Override // yji.r
    public final void g(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putString("MEDIA_PICKER_ID_KEY", this.f122878r);
    }

    @Override // e60.t
    public final void g3(PhotoDelegate.a.C0417a source) {
        i iVarA;
        Intrinsics.checkNotNullParameter(source, "source");
        h hVar = this.f122877q;
        n nVar = (hVar == null || (iVarA = hVar.a()) == null) ? null : iVarA.f122854l;
        if (!v.class.equals(v.class)) {
            throw new IllegalStateException(a0.d.l(v.class, "Unsupported by media picker permission "));
        }
        PermissionsFlowContract$Explanation permissionsFlowContract$Explanation = nVar != null ? nVar.f122865a : null;
        if (permissionsFlowContract$Explanation == null) {
            permissionsFlowContract$Explanation = PermissionsFlowContract$Explanation.None.f98339a;
        }
        j3(new v[]{new v(permissionsFlowContract$Explanation)}, new e2j.j(this, 18));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean h3() {
        return ((Boolean) this.f122876p.getValue()).booleanValue() && this.f122875n.a();
    }

    public final void i3() {
        i iVarA;
        h hVar = this.f122877q;
        if (hVar == null || (iVarA = hVar.a()) == null) {
            iVarA = null;
        } else if (iVarA.f122856n == oli.m.DOCUMENT_SCANNER && !h3()) {
            oli.m cameraHandlerType = oli.m.DEFAULT;
            String str = iVarA.f122848a;
            Clause clause = iVarA.f122849b;
            Clause clause2 = iVarA.f122850c;
            boolean z = iVarA.d;
            int i = iVarA.e;
            int i2 = iVarA.f;
            List documentFileTypes = iVarA.f122851g;
            List imageFileTypes = iVarA.f122852h;
            boolean z3 = iVarA.i;
            u00 u00Var = iVarA.f122853j;
            List customItems = iVarA.k;
            n denialExplanations = iVarA.f122854l;
            boolean z4 = iVarA.f122855m;
            Intrinsics.checkNotNullParameter(documentFileTypes, "documentFileTypes");
            Intrinsics.checkNotNullParameter(imageFileTypes, "imageFileTypes");
            Intrinsics.checkNotNullParameter(customItems, "customItems");
            Intrinsics.checkNotNullParameter(denialExplanations, "denialExplanations");
            Intrinsics.checkNotNullParameter(cameraHandlerType, "cameraHandlerType");
            iVarA = new i(str, clause, clause2, z, i, i2, documentFileTypes, imageFileTypes, z3, u00Var, customItems, denialExplanations, z4, cameraHandlerType);
        }
        k3(new d(iVarA));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j3(e60.v[] r8, kotlin.jvm.functions.Function1 r9) {
        /*
            r7 = this;
            int r0 = r8.length
            r1 = 1
            r2 = 0
            r4 = r1
            r3 = r2
        L5:
            java.lang.String r5 = "android.permission.CAMERA"
            if (r3 >= r0) goto L23
            r6 = r8[r3]
            if (r4 == 0) goto L1f
            if (r6 == 0) goto L19
            y80.a r4 = r7.f122874m
            boolean r4 = r4.c(r5)
            if (r4 == 0) goto L1f
            r4 = r1
            goto L20
        L19:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L1f:
            r4 = r2
        L20:
            int r3 = r3 + 1
            goto L5
        L23:
            if (r4 != 0) goto L5c
            int r0 = r8.length
            int r0 = zhm.q0.b(r0)
            r1 = 16
            if (r0 >= r1) goto L2f
            r0 = r1
        L2f:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            int r0 = r8.length
        L35:
            if (r2 >= r0) goto L44
            r3 = r8[r2]
            r3.getClass()
            com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Explanation r3 = r3.f122870a
            r1.put(r5, r3)
            int r2 = r2 + 1
            goto L35
        L44:
            com.revolut.kompot.common.flow.permissions.PermissionsFlow r8 = new com.revolut.kompot.common.flow.permissions.PermissionsFlow
            r8.<init>(r1)
            com.revolut.kompot.common.c r0 = new com.revolut.kompot.common.c
            a31.k r1 = new a31.k
            r2 = 14
            r1.<init>(r2, r9)
            r9 = 2
            r0.<init>(r8, r1, r9)
            aii.o r8 = r7.f122873l
            knm.b.j(r8, r0)
            return
        L5c:
            com.revolut.kompot.common.flow.permissions.a$a r8 = com.revolut.kompot.common.flow.permissions.a.C0596a.f98352a
            r9.invoke(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e60.y.j3(e60.v[], kotlin.jvm.functions.Function1):void");
    }

    public final void k3(h hVar) {
        this.f122877q = hVar;
        this.u.onNext(hVar);
    }

    public final void l3(List list) {
        i iVarA;
        h hVar = this.f122877q;
        i iVarA2 = hVar != null ? hVar.a() : null;
        h hVar2 = this.f122877q;
        k3(new e(iVarA2, list, (hVar2 == null || (iVarA = hVar2.a()) == null) ? false : iVarA.f122855m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e60.t
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 8765) {
            return;
        }
        Object[] objArr = 0;
        if (i2 != -1) {
            if (i2 != 0) {
                return;
            }
            h hVar = this.f122877q;
            k3(new d(hVar != null ? hVar.a() : null));
            return;
        }
        a2 a2Var = this.f122880t;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f122880t = T2(new w(this, objArr == true ? 1 : 0, 2), new yi5.b(27));
    }
}
