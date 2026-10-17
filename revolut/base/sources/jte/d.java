package jte;

import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.abexperiments.models.ReleaseFlagExperiment;
import com.revolut.feature.toggles.models.DevelopmentOnlyFeatureDefinition;
import com.revolut.feature.toggles.models.FeatureDefinition;
import com.revolut.feature.toggles.models.LocalFeatureState;
import com.revolut.feature.toggles.models.PublicExperimentDefinition;
import com.revolut.utils.tracking.ab_testing.experiments.FirebaseExperiment;
import h30.q;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements gte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m81.a f178499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lte.c f178500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final phm.a f178501c;
    public final phm.a d;
    public final q e;
    public final ConcurrentHashMap f;

    public d(m81.a skywalkerExperimentsInteractor, lte.c firebaseExperimentsRepository, e localToggleInteractor, phm.a mutableToggleRepositoryProvider, ibh.a personalisationStorageProvider, q featureRegistrationValidator) {
        Intrinsics.checkNotNullParameter(skywalkerExperimentsInteractor, "skywalkerExperimentsInteractor");
        Intrinsics.checkNotNullParameter(firebaseExperimentsRepository, "firebaseExperimentsRepository");
        Intrinsics.checkNotNullParameter(localToggleInteractor, "localToggleInteractor");
        Intrinsics.checkNotNullParameter(mutableToggleRepositoryProvider, "mutableToggleRepositoryProvider");
        Intrinsics.checkNotNullParameter(personalisationStorageProvider, "personalisationStorageProvider");
        Intrinsics.checkNotNullParameter(featureRegistrationValidator, "featureRegistrationValidator");
        this.f178499a = skywalkerExperimentsInteractor;
        this.f178500b = firebaseExperimentsRepository;
        this.f178501c = mutableToggleRepositoryProvider;
        this.d = personalisationStorageProvider;
        this.e = featureRegistrationValidator;
        this.f = new ConcurrentHashMap();
    }

    public final boolean b(FeatureDefinition featureDefinition) {
        Experiment experiment = featureDefinition.q8();
        if (experiment == null) {
            return featureDefinition.getF71625b();
        }
        m81.a aVar = this.f178499a;
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        p81.d dVar = (p81.d) ((q81.d) aVar.f203417a).b().get(experiment.getF60553a());
        r81.b bVar = dVar != null ? dVar.f233823c : null;
        return bVar == null ? featureDefinition.getF71625b() : bVar == r81.b.ON_NEXT_APP_LAUNCH;
    }

    public final boolean c(FeatureDefinition feature) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(feature, "feature");
        boolean zB = b(feature);
        ConcurrentHashMap concurrentHashMap = this.f;
        if (zB && (bool = (Boolean) concurrentHashMap.get(feature)) != null) {
            return bool.booleanValue();
        }
        boolean zD = d(feature);
        if (((q81.d) this.f178499a.f203417a).e.get()) {
            concurrentHashMap.put(feature, Boolean.valueOf(zD));
        }
        this.e.S0(feature, new ite.d(this, 5));
        return zD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(FeatureDefinition feature) {
        Boolean bool;
        PublicExperimentDefinition featureDefinition = feature.V2();
        if (featureDefinition == null) {
            Intrinsics.checkNotNullParameter(feature, "feature");
        }
        if (feature instanceof DevelopmentOnlyFeatureDefinition) {
            od0.a aVar = od0.a.f224253a;
            if (!od0.a.g() || od0.a.i()) {
                LocalFeatureState localFeatureStateS5 = feature.s5();
                LocalFeatureState.Binary binary = localFeatureStateS5 instanceof LocalFeatureState.Binary ? (LocalFeatureState.Binary) localFeatureStateS5 : null;
                if (binary != null) {
                    return binary.f90453a;
                }
            }
            return false;
        }
        Intrinsics.checkNotNullParameter(feature, "feature");
        LocalFeatureState localFeatureStateS52 = feature.s5();
        LocalFeatureState.Binary binary2 = localFeatureStateS52 instanceof LocalFeatureState.Binary ? (LocalFeatureState.Binary) localFeatureStateS52 : null;
        boolean z = binary2 != null && binary2.f90453a;
        if (feature.q8() instanceof FirebaseExperiment) {
            return e(feature, z);
        }
        Object[] objArr = !z && feature.getF90455b() == nte.b.ALL;
        boolean z3 = feature.q8() == null && feature.V2() == null;
        if (objArr == true || z3) {
            return z;
        }
        if (featureDefinition == null || !c(featureDefinition)) {
            return e(feature, z);
        }
        Intrinsics.checkNotNullParameter(featureDefinition, "feature");
        try {
            mk0.a aVar2 = (mk0.a) this.d.get();
            tk0.b.b("AIR_EXPERIMENT");
            bool = (Boolean) aVar2.a(tk0.b.a("AIR_EXPERIMENT"));
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            bool = null;
        }
        if (bool == null) {
            lte.d dVar = (lte.d) this.f178501c.get();
            dVar.getClass();
            Intrinsics.checkNotNullParameter(featureDefinition, "featureDefinition");
            Map mapA = dVar.a();
            String strR = ((ReleaseFlagExperiment) featureDefinition.q8()).f60553a;
            if (strR == null) {
                strR = a0.d.r(a0.D("moneyAssistantExperiment", "[^\\p{L}\\p{Nd}]+", "", false), "[name]");
            }
            Object obj2 = mapA.get(strR);
            bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return Intrinsics.f(this.f178499a.a(featureDefinition.a()), r81.e.ENABLED);
    }

    public final boolean e(FeatureDefinition featureDefinition, boolean z) {
        Experiment experimentQ8 = featureDefinition.q8();
        if (experimentQ8 == null) {
            return true;
        }
        r81.c cVarX1 = experimentQ8.X1();
        m81.a aVar = this.f178499a;
        lte.c cVar = this.f178500b;
        if (cVarX1 != null) {
            Experiment experimentQ82 = featureDefinition.q8();
            if (Intrinsics.f(experimentQ82 == null ? null : experimentQ82 instanceof FirebaseExperiment ? cVar.b((FirebaseExperiment) experimentQ82) : aVar.a(experimentQ82), experimentQ8.X1())) {
                return true;
            }
        }
        if (featureDefinition.getF90455b() != nte.b.PREFER_REMOTE) {
            return false;
        }
        Experiment experimentQ83 = featureDefinition.q8();
        return (experimentQ83 != null ? experimentQ83 instanceof FirebaseExperiment ? cVar.b((FirebaseExperiment) experimentQ83) : aVar.a(experimentQ83) : null) == null && z;
    }
}
