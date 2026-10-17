package loa;

import com.google.common.collect.ImmutableSet;
import com.revolut.chat.ChatApi$Toggles;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.profile.api.ProfileApi$Toggles$FincrimeTestingFlows;
import com.revolut.feature.toggles.models.PublicExperimentDefinition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends jki.g implements f {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gte.a f197439p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f197440q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Set f197441r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final jvh.a f197442s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final til.m f197443t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p stateMapper, gte.a toggleInteractor, ImmutableSet localFeatureDelegates, jvh.a workflowInteractor, til.m workflowFlowProvider) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(toggleInteractor, "toggleInteractor");
        Intrinsics.checkNotNullParameter(localFeatureDelegates, "localFeatureDelegates");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowDestinationProvider");
        List featureList = u.c(ChatApi$Toggles.MoneyAssistant.f50984c);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(toggleInteractor, "toggleInteractor");
        Intrinsics.checkNotNullParameter(featureList, "featureList");
        Intrinsics.checkNotNullParameter(localFeatureDelegates, "localFeatureDelegates");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        this.f197439p = toggleInteractor;
        this.f197440q = featureList;
        this.f197441r = localFeatureDelegates;
        this.f197442s = workflowInteractor;
        this.f197443t = workflowFlowProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(loa.l r21, com.revolut.feature.toggles.models.PublicExperimentDefinition r22, gim.c r23) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: loa.l.y2(loa.l, com.revolut.feature.toggles.models.PublicExperimentDefinition, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void T1(long j2) {
        Set set = this.f197441r;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        Iterator it8 = set.iterator();
        if (it8.hasNext()) {
            throw v0.a.e(it8);
        }
        boolean zIsEmpty = arrayList.isEmpty();
        Continuation continuation = null;
        List listC = arrayList;
        if (zIsEmpty) {
            listC = null;
        }
        if (listC == null) {
            listC = u.c(new go.g(f0.f322471a, 2));
        }
        yji.l.b1(this, new j23.b((Flow[]) d0.d1(listC).toArray(new Flow[0]), 6), null, new i(this, continuation, 0), 3);
        if (((jte.d) this.f197439p).c(ProfileApi$Toggles$FincrimeTestingFlows.f81313c)) {
            x2(new llb.e(27));
        }
    }

    @Override // jki.g
    public final jki.i r2() {
        return new d(0);
    }

    public final void z2(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.u;
        Continuation continuation = null;
        if (obj2 instanceof PublicExperimentDefinition) {
            l2(new ll6.i(this, (PublicExperimentDefinition) obj2, continuation, 14), new yi5.b(26));
        } else if (obj2 instanceof e) {
            l2(new j(this, null), new yi5.b(26));
        }
    }
}
