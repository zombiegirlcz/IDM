package q34;

import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.DocumentValidationConfig;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.Keyword;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.TicketProgression;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.credit.application.plugins.impl.network.TicketorService;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import m14.d;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ String f241792w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f241793x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f241793x = dVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        String str = (String) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                b bVar = new b(this.f241793x, continuation, 0);
                bVar.f241792w = str;
                return bVar.invokeSuspend(Unit.f186387a);
            default:
                b bVar2 = new b(this.f241793x, continuation, 1);
                bVar2.f241792w = str;
                return bVar2.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object documentValidationConfig;
        Object ticketProgression;
        com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.c cVar;
        com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.b bVar;
        m14.d dVar;
        com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.a aVar;
        com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.a aVar2;
        com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.b bVar2;
        com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.c cVar2;
        switch (this.u) {
            case 0:
                String str = this.f241792w;
                Object arrayList = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService = this.f241793x.f241797b;
                    this.f241792w = null;
                    this.v = 1;
                    documentValidationConfig = creditPluginsService.getDocumentValidationConfig(str, this);
                    if (documentValidationConfig != arrayList) {
                    }
                    return arrayList;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                documentValidationConfig = obj2;
                List<m14.a> documents = ((m14.b) documentValidationConfig).getDocuments();
                arrayList = new ArrayList(w.t(documents, 10));
                for (m14.a aVar3 : documents) {
                    Intrinsics.checkNotNullParameter(aVar3, "<this>");
                    String referralFlagName = aVar3.getReferralFlagName();
                    List<m14.c> keywords = aVar3.getKeywords();
                    ArrayList arrayList2 = new ArrayList(w.t(keywords, 10));
                    for (m14.c cVar3 : keywords) {
                        Intrinsics.checkNotNullParameter(cVar3, "<this>");
                        arrayList2.add(new Keyword(cVar3.getKeyword(), jv3.a.valueOf(cVar3.getMatchType()), cVar3.getError()));
                    }
                    arrayList.add(new DocumentValidationConfig(referralFlagName, arrayList2));
                }
                return arrayList;
            default:
                String str2 = this.f241792w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                TicketProgression.Step.Action action = null;
                if (i2 == 0) {
                    o.b(obj2);
                    TicketorService ticketorService = this.f241793x.f241798c;
                    this.f241792w = null;
                    this.v = 1;
                    ticketProgression = ticketorService.getTicketProgression(str2, this);
                    if (ticketProgression == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    ticketProgression = obj2;
                }
                m14.d dVar2 = (m14.d) ticketProgression;
                Intrinsics.checkNotNullParameter(dVar2, "<this>");
                String headerTitle = dVar2.getHeaderTitle();
                List<d.a> steps = dVar2.getSteps();
                ArrayList arrayList3 = new ArrayList(w.t(steps, 10));
                for (d.a aVar5 : steps) {
                    d.a.C1143a action2 = aVar5.getAction();
                    TicketProgression.Step.Action action3 = aVar5.getActionTitle() != null ? action2 != null ? new TicketProgression.Step.Action(action2.getDeeplink()) : action : action;
                    String title = aVar5.getTitle();
                    String description = aVar5.getDescription();
                    Long date = aVar5.getDate();
                    String lineStyle = aVar5.getLineStyle();
                    if (lineStyle != null) {
                        com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.c[] cVarArrValues = com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.c.values();
                        int length = cVarArrValues.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                cVar2 = cVarArrValues[i3];
                                if (!a0.z(cVar2.name(), lineStyle, true)) {
                                    i3++;
                                }
                            } else {
                                cVar2 = null;
                            }
                        }
                        cVar = cVar2;
                    } else {
                        cVar = null;
                    }
                    String stepColor = aVar5.getStepColor();
                    if (stepColor != null) {
                        com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.b[] bVarArrValues = com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.b.values();
                        int length2 = bVarArrValues.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length2) {
                                bVar2 = bVarArrValues[i5];
                                if (!a0.z(bVar2.name(), stepColor, true)) {
                                    i5++;
                                }
                            } else {
                                bVar2 = null;
                            }
                        }
                        bVar = bVar2;
                    } else {
                        bVar = null;
                    }
                    String actionTitle = aVar5.getActionTitle();
                    String actionStyle = aVar5.getActionStyle();
                    if (actionStyle != null) {
                        com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.a[] aVarArrValues = com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.a.values();
                        int length3 = aVarArrValues.length;
                        int i6 = 0;
                        while (true) {
                            if (i6 < length3) {
                                aVar2 = aVarArrValues[i6];
                                dVar = dVar2;
                                if (!a0.z(aVar2.name(), actionStyle, true)) {
                                    i6++;
                                    dVar2 = dVar;
                                }
                            } else {
                                dVar = dVar2;
                                aVar2 = null;
                            }
                        }
                        aVar = aVar2;
                    } else {
                        dVar = dVar2;
                        aVar = null;
                    }
                    arrayList3.add(new TicketProgression.Step(title, description, date, cVar, bVar, actionTitle, action3, aVar));
                    dVar2 = dVar;
                    action = null;
                }
                return new TicketProgression(dVar2.getCurrentStepIndex(), headerTitle, arrayList3);
        }
    }
}
