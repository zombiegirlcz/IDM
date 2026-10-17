package com.revolut.feature.permissions.flow;

import com.revolut.feature.permissions.flow.PermissionsController;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r7a.d;
import r7a.i;
import te0.w;
import uki.c;
import vkm.j2;
import xki.e;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/permissions/flow/PermissionsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lr7a/i;", "Luki/c;", "feature_permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PermissionsController extends ViewController<i> implements c {
    public final PermissionsControllerContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public PermissionsController(PermissionsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: r7a.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PermissionsController f252053b;

            {
                this.f252053b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PermissionsController permissionsController = this.f252053b;
                        phm.a aVar = (phm.a) ue0.e.j(permissionsController.m2()).a().get(q7a.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", q7a.c.class, " is not found"));
                        }
                        q7a.b bVar = ((q7a.b) aVar2.b()).f242790b;
                        PermissionsControllerContract$InputData permissionsControllerContract$InputData = permissionsController.K;
                        permissionsControllerContract$InputData.getClass();
                        return new q7a.a(bVar, permissionsController, permissionsControllerContract$InputData);
                    case 1:
                        return (d) ((q7a.a) this.f252053b.M.getValue()).f242788c.get();
                    default:
                        PermissionsController permissionsController2 = this.f252053b;
                        return czi.c.a(R$id.screen_transparent_container, (d) permissionsController2.N.getValue(), permissionsController2);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: r7a.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PermissionsController f252053b;

            {
                this.f252053b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PermissionsController permissionsController = this.f252053b;
                        phm.a aVar = (phm.a) ue0.e.j(permissionsController.m2()).a().get(q7a.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", q7a.c.class, " is not found"));
                        }
                        q7a.b bVar = ((q7a.b) aVar2.b()).f242790b;
                        PermissionsControllerContract$InputData permissionsControllerContract$InputData = permissionsController.K;
                        permissionsControllerContract$InputData.getClass();
                        return new q7a.a(bVar, permissionsController, permissionsControllerContract$InputData);
                    case 1:
                        return (d) ((q7a.a) this.f252053b.M.getValue()).f242788c.get();
                    default:
                        PermissionsController permissionsController2 = this.f252053b;
                        return czi.c.a(R$id.screen_transparent_container, (d) permissionsController2.N.getValue(), permissionsController2);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: r7a.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PermissionsController f252053b;

            {
                this.f252053b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        PermissionsController permissionsController = this.f252053b;
                        phm.a aVar = (phm.a) ue0.e.j(permissionsController.m2()).a().get(q7a.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", q7a.c.class, " is not found"));
                        }
                        q7a.b bVar = ((q7a.b) aVar2.b()).f242790b;
                        PermissionsControllerContract$InputData permissionsControllerContract$InputData = permissionsController.K;
                        permissionsControllerContract$InputData.getClass();
                        return new q7a.a(bVar, permissionsController, permissionsControllerContract$InputData);
                    case 1:
                        return (d) ((q7a.a) this.f252053b.M.getValue()).f242788c.get();
                    default:
                        PermissionsController permissionsController2 = this.f252053b;
                        return czi.c.a(R$id.screen_transparent_container, (d) permissionsController2.N.getValue(), permissionsController2);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (q7a.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (q7a.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (d) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void X2(int i, String[] permissionsKeys, int[] grantResults) throws Throwable {
        Object next;
        Intrinsics.checkNotNullParameter(permissionsKeys, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.X2(i, permissionsKeys, grantResults);
        b bVar = (b) ((d) this.N.getValue());
        qki.d dVar = bVar.f80341s;
        Intrinsics.checkNotNullParameter(permissionsKeys, "permissionsKeys");
        if (i != 2008) {
            hx7.e.n(new IllegalStateException(a0.d.n("Your forgot to process requestCode: ", i)));
        }
        ArrayList arrayList = new ArrayList();
        for (String str : permissionsKeys) {
            Iterator it8 = ((PermissionsControllerContract$State) ((j2) dVar.f22677a).getValue()).f80333b.iterator();
            while (true) {
                if (it8.hasNext()) {
                    next = it8.next();
                    if (Intrinsics.f(((PermissionsControllerContract$Permission) next).f80329a, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            PermissionsControllerContract$Permission permissionsControllerContract$Permission = (PermissionsControllerContract$Permission) next;
            if (permissionsControllerContract$Permission != null) {
                arrayList.add(permissionsControllerContract$Permission);
            }
        }
        ArrayList arrayListF1 = d0.f1(((PermissionsControllerContract$State) ((j2) dVar.f22677a).getValue()).f80333b);
        arrayListF1.removeAll(d0.i1(arrayList));
        bVar.H2(dVar, new jeg.i(28, arrayListF1));
        qr0.i iVar = bVar.f80338p;
        PermissionsControllerContract$Permission[] permissionsControllerContract$PermissionArr = (PermissionsControllerContract$Permission[]) arrayList.toArray(new PermissionsControllerContract$Permission[0]);
        if (iVar.d((PermissionsControllerContract$Permission[]) Arrays.copyOf(permissionsControllerContract$PermissionArr, permissionsControllerContract$PermissionArr.length)) == r7a.b.EXPLANATION && bVar.K2(arrayList)) {
            return;
        }
        bVar.M2(false);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.O.getValue();
    }
}
