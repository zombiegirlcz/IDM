package g23;

import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import ft3.a1;
import ft3.q0;
import ft3.z0;
import grl.r2;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends yji.n implements j23.m {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l0 f139778l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gte.a f139779m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final bm4.a f139780n;
    public final al4.j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final al4.p f139781p;

    public d(l0 itemBuilder, gte.a featureToggleInteractor, bm4.a creditCardEntryPointUiInteractor, al4.j creditCardEntryPointDetailsInteractor, al4.p creditCardProductFeatureTogglesInteractor) {
        Intrinsics.checkNotNullParameter(itemBuilder, "itemBuilder");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(creditCardEntryPointUiInteractor, "creditCardEntryPointUiInteractor");
        Intrinsics.checkNotNullParameter(creditCardEntryPointDetailsInteractor, "creditCardEntryPointDetailsInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductFeatureTogglesInteractor, "creditCardProductFeatureTogglesInteractor");
        this.f139778l = itemBuilder;
        this.f139779m = featureToggleInteractor;
        this.f139780n = creditCardEntryPointUiInteractor;
        this.o = creditCardEntryPointDetailsInteractor;
        this.f139781p = creditCardProductFeatureTogglesInteractor;
    }

    @Override // j23.m
    public final Object c(Object obj2, String str, Continuation continuation) {
        int iHashCode = str.hashCode();
        if (iHashCode == 680360088) {
            if (str.equals("DISCOVER_BALANCE_TRANSFER_CREDIT_CARD_LIST_ID")) {
                A2(u0.c(new CreditApplicationFeatureConfig.StartApplication(new a1(r2.CARD_ORDERING, null, z0.BALANCE_TRANSFER, null, null, 26), new ft3.g(null, null, 3), null, null, null, null, null, null, null, null, 2044)));
                return j23.f.f170665a;
            }
            return j23.g.f170666a;
        }
        if (iHashCode == 1514352733) {
            if (str.equals("DISCOVER_CREDIT_CARD_LIST_ID")) {
                A2(u0.c(new CreditApplicationFeatureConfig.StartApplication(new a1(r2.CARD_ORDERING, null, null, null, null, 30), new ft3.g(null, null, 3), null, null, null, null, null, null, null, null, 2044)));
                return j23.f.f170665a;
            }
            return j23.g.f170666a;
        }
        if (iHashCode == 1717980337 && str.equals("DISCOVER_ADDITIONAL_CREDIT_CARD_LIST_ID")) {
            q0 q0Var = obj2 instanceof q0 ? (q0) obj2 : null;
            if (q0Var != null) {
                A2(u0.c(new CreditApplicationFeatureConfig.StartApplication(new a1(r2.CARD_ORDERING, null, null, null, null, 30), q0Var, null, null, null, null, null, null, null, null, 2044)));
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Couldn't open Additional Credit Card application. CreditApplicationProduct is null");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                Unit unit = Unit.f186387a;
            }
            return j23.f.f170665a;
        }
        return j23.g.f170666a;
    }
}
