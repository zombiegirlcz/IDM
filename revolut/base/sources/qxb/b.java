package qxb;

import com.revolut.feature.rev_points.models.RevPointsPersonalisationTargetingOnboardingCta;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationTargetingOnboardingPrompt;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationTargetingOnboardingResponse;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationTargetingOnboardingStep;
import com.revolut.feature.rev_points.models.RevPointsTextWithLinks;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import m1c.z0;
import vxb.q;
import vxb.r;
import vxb.s;
import vxb.t;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        z0 z0Var;
        int i = this.u;
        c cVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                s sVar = (s) j6.a.k(s.class, cVar.f250060b, "TARGETING_ONBOARDING_STORAGE_KEY");
                RevPointsPersonalisationTargetingOnboardingPrompt revPointsPersonalisationTargetingOnboardingPrompt = null;
                RevPointsPersonalisationTargetingOnboardingCta revPointsPersonalisationTargetingOnboardingCta = null;
                if (sVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(sVar, "<this>");
                String status = sVar.getStatus();
                z0[] z0VarArrValues = z0.values();
                int length = z0VarArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        z0Var = z0VarArrValues[i2];
                        if (!a0.z(z0Var.name(), status, true)) {
                            i2++;
                        }
                    } else {
                        z0Var = null;
                    }
                }
                if (z0Var == null) {
                    z0Var = z0.COMPLETED;
                }
                r prompt = sVar.getPrompt();
                if (prompt != null) {
                    Intrinsics.checkNotNullParameter(prompt, "<this>");
                    String title = prompt.getTitle();
                    String subtitle = prompt.getSubtitle();
                    String assetUrl = prompt.getAssetUrl();
                    List steps = prompt.getSteps();
                    Intrinsics.checkNotNullParameter(steps, "<this>");
                    List<t> list = steps;
                    ArrayList arrayList = new ArrayList(w.t(list, 10));
                    for (t tVar : list) {
                        Intrinsics.checkNotNullParameter(tVar, "<this>");
                        arrayList.add(new RevPointsPersonalisationTargetingOnboardingStep(tVar.getTitle(), tVar.getSubtitle(), tVar.getIcon()));
                    }
                    RevPointsTextWithLinks revPointsTextWithLinksB = qvb.b.b(prompt.getDisclaimer());
                    q personalisedOffersCta = prompt.getPersonalisedOffersCta();
                    Intrinsics.checkNotNullParameter(personalisedOffersCta, "<this>");
                    RevPointsPersonalisationTargetingOnboardingCta revPointsPersonalisationTargetingOnboardingCta2 = new RevPointsPersonalisationTargetingOnboardingCta(personalisedOffersCta.getText(), personalisedOffersCta.getDeeplink());
                    q genericOffersCta = prompt.getGenericOffersCta();
                    if (genericOffersCta != null) {
                        Intrinsics.checkNotNullParameter(genericOffersCta, "<this>");
                        revPointsPersonalisationTargetingOnboardingCta = new RevPointsPersonalisationTargetingOnboardingCta(genericOffersCta.getText(), genericOffersCta.getDeeplink());
                    }
                    revPointsPersonalisationTargetingOnboardingPrompt = new RevPointsPersonalisationTargetingOnboardingPrompt(title, subtitle, assetUrl, arrayList, revPointsTextWithLinksB, revPointsPersonalisationTargetingOnboardingCta2, revPointsPersonalisationTargetingOnboardingCta);
                }
                return new RevPointsPersonalisationTargetingOnboardingResponse(z0Var, revPointsPersonalisationTargetingOnboardingPrompt);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                cVar.f250061c.remove("TARGETING_ONBOARDING_MEM_KEY");
                cVar.f250060b.I0("TARGETING_ONBOARDING_STORAGE_KEY");
                return Unit.f186387a;
        }
    }
}
