package oyc;

import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.feature.selfserve.sot.api.models.SubmissionState;
import hyc.e;
import hyc.f;
import hyc.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kyc.i;
import kyc.k;
import kyc.m;
import kyc.p;
import kyc.q;
import kyc.r;
import kyc.t;
import le.u1;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f230935b;

    public /* synthetic */ a(c cVar, int i) {
        this.f230934a = i;
        this.f230935b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ?? arrayList;
        switch (this.f230934a) {
            case 0:
                t config = (t) obj2;
                Intrinsics.checkNotNullParameter(config, "it");
                myc.a aVar = this.f230935b.f230940c;
                Intrinsics.checkNotNullParameter(config, "config");
                List payers = config.getPayers();
                if (payers != null) {
                    List<k> list = payers;
                    arrayList = new ArrayList(w.t(list, 10));
                    for (k kVar : list) {
                        arrayList.add(new hyc.b(kVar.getPayerId(), kVar.getPayerName(), kVar.getTransactionId()));
                    }
                } else {
                    arrayList = f0.f322471a;
                }
                return new g(arrayList);
            case 1:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (q) this.f230935b.f230939b.get("MEMORY_CACHE_FLOW_STATES_KEY");
            case 2:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return (t) this.f230935b.f230939b.get("MEMORY_CACHE_SUBMISSIONS_CONFIG_KEY");
            case 3:
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (r) this.f230935b.f230939b.get("MEMORY_CACHE_SUBMISSIONS_STATE_KEY");
            case 4:
                Unit it11 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return (List) this.f230935b.f230939b.get("MEMORY_CACHE_INCOME_SOURCES_KEY");
            case 5:
                r state = (r) obj2;
                Intrinsics.checkNotNullParameter(state, "it");
                myc.a aVar2 = this.f230935b.f230940c;
                Intrinsics.checkNotNullParameter(state, "state");
                String id10 = state.getId();
                String state2 = state.getState();
                List evidences = state.getEvidences();
                ArrayList arrayList2 = new ArrayList(w.t(evidences, 10));
                Iterator it12 = evidences.iterator();
                while (it12.hasNext()) {
                    arrayList2.add(aVar2.b((m) it12.next()));
                }
                return new SubmissionState(id10, state2, arrayList2, aVar2.c(state.getReviewState()), aVar2.a(state.getActionToDoId()), state.getCanAddSource(), state.getSubmittedDate(), state.getReviewStartedDate(), state.getApprovedDate());
            case 6:
                q flowStates = (q) obj2;
                Intrinsics.checkNotNullParameter(flowStates, "it");
                myc.a aVar3 = this.f230935b.f230940c;
                Intrinsics.checkNotNullParameter(flowStates, "flowStates");
                p sourceOfTransactions = flowStates.getSourceOfTransactions();
                String type = sourceOfTransactions.getType();
                hyc.a aVar4 = (hyc.a) u1.v(sourceOfTransactions.getState(), aVar3.f210449b);
                if (aVar4 == null) {
                    aVar4 = hyc.a.NONE;
                }
                List restrictions = sourceOfTransactions.getRestrictions();
                if (restrictions == null) {
                    restrictions = f0.f322471a;
                }
                Boolean isRestricted = sourceOfTransactions.getIsRestricted();
                return new f(new e(type, aVar4, restrictions, isRestricted != null ? isRestricted.booleanValue() : false));
            default:
                List it13 = (List) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                List<i> list2 = it13;
                int i = 10;
                ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                for (i sources : list2) {
                    myc.a aVar5 = this.f230935b.f230940c;
                    Intrinsics.checkNotNullParameter(sources, "sources");
                    String type2 = sources.getType();
                    String title = sources.getTitle();
                    boolean primary = sources.getPrimary();
                    String description = sources.getDescription();
                    List<List> documentTypes = sources.getDocumentTypes();
                    ArrayList arrayList4 = new ArrayList(w.t(documentTypes, i));
                    for (List<kyc.a> list3 : documentTypes) {
                        ArrayList arrayList5 = new ArrayList(w.t(list3, i));
                        for (kyc.a aVar6 : list3) {
                            arrayList5.add(new DocumentType(aVar6.getType(), aVar6.getTitle(), aVar6.getDescription(), null));
                        }
                        arrayList4.add(arrayList5);
                        i = 10;
                    }
                    arrayList3.add(new IncomeSource(type2, title, description, arrayList4, primary));
                    i = 10;
                }
                return arrayList3;
        }
    }
}
