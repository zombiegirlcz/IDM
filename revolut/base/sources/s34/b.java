package s34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import p14.i;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f259416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f259417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditPluginsService f259418c;

    public b(i mortgageRefinancingDetailsQuestionnaireDtoMapper, p14.a mortgageRefinancingDetailsQuestionnaireAnswersDtoMapper, p creditApplicationDtoMapper, CreditPluginsService creditPluginsService) {
        Intrinsics.checkNotNullParameter(mortgageRefinancingDetailsQuestionnaireDtoMapper, "mortgageRefinancingDetailsQuestionnaireDtoMapper");
        Intrinsics.checkNotNullParameter(mortgageRefinancingDetailsQuestionnaireAnswersDtoMapper, "mortgageRefinancingDetailsQuestionnaireAnswersDtoMapper");
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        this.f259416a = mortgageRefinancingDetailsQuestionnaireDtoMapper;
        this.f259417b = creditApplicationDtoMapper;
        this.f259418c = creditPluginsService;
    }
}
