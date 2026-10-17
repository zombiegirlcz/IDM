package yie;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import ibb.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vge.r;
import vie.h;
import vie.i;
import vkm.v1;
import vkm.y;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements ftb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f314321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f314322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ftb.a f314323c;

    public b(h availabilityInteractor, i preferencesInteractor) {
        Intrinsics.checkNotNullParameter(availabilityInteractor, "availabilityInteractor");
        Intrinsics.checkNotNullParameter(preferencesInteractor, "preferencesInteractor");
        this.f314321a = availabilityInteractor;
        this.f314322b = preferencesInteractor;
        this.f314323c = new ftb.a(c.f, new TextLocalisedClause(R$string.profileHome_settings_item_credit_tab_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_credit, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.profileHome_settings_item_credit_tab_visible, null, null, 14), new TextLocalisedClause(R$string.profileHome_settings_item_credit_tab_hidden, null, null, 14));
    }

    @Override // ftb.b
    public final Flow a() {
        return new v1(new r(this.f314321a, null, 14));
    }

    @Override // ftb.b
    public final ftb.a b() {
        return this.f314323c;
    }

    @Override // ftb.b
    public final y c() {
        return this.f314322b.f289583a.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (r3.c(r8, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ftb.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(boolean r8, kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof yie.a
            if (r0 == 0) goto L13
            r0 = r9
            yie.a r0 = (yie.a) r0
            int r1 = r0.f314320x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f314320x = r1
            goto L1a
        L13:
            yie.a r0 = new yie.a
            gim.c r9 = (gim.c) r9
            r0.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f314320x
            vie.i r3 = r7.f314322b
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            yhm.o.b(r9)
            goto L6d
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            boolean r8 = r0.u
            yhm.o.b(r9)
            goto L62
        L3c:
            yhm.o.b(r9)
            if (r8 == 0) goto L62
            r0.u = r8
            r0.f314320x = r5
            qie.f r9 = r3.f289583a
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            qie.e r5 = new qie.e
            r6 = 0
            r5.<init>(r9, r6)
            java.lang.Object r9 = skm.e0.J(r2, r5, r0)
            if (r9 != r1) goto L58
            goto L5a
        L58:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L5a:
            if (r9 != r1) goto L5d
            goto L5f
        L5d:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L5f:
            if (r9 != r1) goto L62
            goto L6c
        L62:
            r0.u = r8
            r0.f314320x = r4
            java.lang.Object r8 = r3.c(r8, r0)
            if (r8 != r1) goto L6d
        L6c:
            return r1
        L6d:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yie.b.d(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
