package rea;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card_order_new.api.CardOrderNewFeatureConfig;
import com.revolut.feature.pockets.impl.R$string;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import h93.l0;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class p {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f253582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l93.f f253583b;

    public p(n8b.a countryInteractor, l93.f revolutCardsInteractor) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        this.f253582a = countryInteractor;
        this.f253583b = revolutCardsInteractor;
    }

    public static BridgeDestination b() {
        return u0.b(new FeatureCommand(new CardOrderNewFeatureConfig(null, null, null, null, null, false, null, null, null, l0.INDIA_GLOBAL, null, null, 15359)));
    }

    public static y0 c() {
        return new y0("MCY_CARD_REQUIRED_DIALOG_ID", new z(new TextLocalisedClause(R$string.onboarding_mcy_card_required_prompt_title, null, null, 14), new TextLocalisedClause(R$string.onboarding_mcy_card_required_prompt_description, null, null, 14), new TextLocalisedClause(R$string.onboarding_mcy_card_required_prompt_primary_button_title, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof rea.o
            if (r0 == 0) goto L13
            r0 = r6
            rea.o r0 = (rea.o) r0
            int r1 = r0.f253581w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f253581w = r1
            goto L18
        L13:
            rea.o r0 = new rea.o
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f253581w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            l93.f r6 = r5.f253583b
            r2 = 3
            r4 = 0
            ufm.b r6 = l93.f.j(r6, r4, r2)
            r0.f253581w = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L58
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L58
            goto L75
        L58:
            java.util.Iterator r6 = r6.iterator()
        L5c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r0 = r6.next()
            h93.f0 r0 = (h93.f0) r0
            h93.l0 r1 = r0.G
            h93.l0 r2 = h93.l0.INDIA_GLOBAL
            if (r1 != r2) goto L5c
            boolean r0 = r0.w()
            if (r0 == 0) goto L5c
            r3 = 0
        L75:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rea.p.a(gim.c):java.lang.Object");
    }
}
