package che;

import bn2.p;
import cm2.f;
import gim.i;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vge.b1;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements zfe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f24202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f24203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f24204c;

    public c(b1 enhancedProductDescriptorProvider, f backgroundsLoader, p backgroundsInteractor) {
        Intrinsics.checkNotNullParameter(enhancedProductDescriptorProvider, "enhancedProductDescriptorProvider");
        Intrinsics.checkNotNullParameter(backgroundsLoader, "backgroundsLoader");
        Intrinsics.checkNotNullParameter(backgroundsInteractor, "backgroundsInteractor");
        this.f24202a = enhancedProductDescriptorProvider;
        this.f24203b = backgroundsLoader;
        this.f24204c = backgroundsInteractor;
    }

    @Override // zfe.b
    public final Object a(i iVar) {
        Object objC = c(iVar);
        return objC == fim.a.COROUTINE_SUSPENDED ? objC : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // zfe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof che.b
            if (r0 == 0) goto L13
            r0 = r6
            che.b r0 = (che.b) r0
            int r1 = r0.f24201w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24201w = r1
            goto L1a
        L13:
            che.b r0 = new che.b
            gim.c r6 = (gim.c) r6
            r0.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f24201w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r6)
            goto L5f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            yhm.o.b(r6)
            goto L46
        L38:
            yhm.o.b(r6)
            r0.f24201w = r4
            vge.b1 r6 = r5.f24202a
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L46
            goto L5e
        L46:
            sfe.b r6 = (sfe.b) r6
            if (r6 != 0) goto L4c
            r6 = 0
            return r6
        L4c:
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r2 = r6.f262403a
            com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata r6 = r6.f262404b
            com.revolut.feature.backgroundpicker.models.RetailBackgroundKey r6 = age.b.e(r2, r6)
            r0.f24201w = r3
            bn2.p r2 = r5.f24204c
            java.lang.Object r6 = r2.c(r6, r0)
            if (r6 != r1) goto L5f
        L5e:
            return r1
        L5f:
            com.revolut.feature.backgroundpicker.api.model.PersistedBackground r6 = (com.revolut.feature.backgroundpicker.api.model.PersistedBackground) r6
            com.revolut.feature.backgroundpicker.api.model.ChosenBackground r6 = r6.f63743a
            com.revolut.core.ui_kit.models.NavBarWithContainerBackground r6 = r6.f63742b
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: che.c.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (((bn2.r) r5.f24203b).a(r6, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof che.a
            if (r0 == 0) goto L13
            r0 = r6
            che.a r0 = (che.a) r0
            int r1 = r0.f24200w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24200w = r1
            goto L18
        L13:
            che.a r0 = new che.a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f24200w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L60
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L44
        L36:
            yhm.o.b(r6)
            r0.f24200w = r4
            vge.b1 r6 = r5.f24202a
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L44
            goto L5f
        L44:
            sfe.b r6 = (sfe.b) r6
            if (r6 != 0) goto L4b
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L4b:
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r2 = r6.f262403a
            com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata r6 = r6.f262404b
            com.revolut.feature.backgroundpicker.models.RetailBackgroundKey r6 = age.b.e(r2, r6)
            r0.f24200w = r3
            cm2.f r2 = r5.f24203b
            bn2.r r2 = (bn2.r) r2
            java.lang.Object r6 = r2.a(r6, r0)
            if (r6 != r1) goto L60
        L5f:
            return r1
        L60:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: che.c.c(gim.c):java.lang.Object");
    }
}
