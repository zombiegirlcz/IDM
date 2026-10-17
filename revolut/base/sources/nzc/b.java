package nzc;

import gzc.f;
import gzc.g;
import gzc.m;
import gzc.p;
import gzc.q;
import gzc.u;
import gzc.v;
import gzc.w;
import gzc.x;
import gzc.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jzc.e;
import jzc.i;
import jzc.n;
import jzc.o;
import jzc.r;
import jzc.s;
import jzc.t;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Months;
import pfm.h;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f221014b;

    public /* synthetic */ b(d dVar, int i) {
        this.f221013a = i;
        this.f221014b = dVar;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f221013a) {
            case 0:
                t submissionsSowConfigDto = (t) obj2;
                Intrinsics.checkNotNullParameter(submissionsSowConfigDto, "submissionsDto");
                lzc.a aVar = this.f221014b.f221019c;
                Intrinsics.checkNotNullParameter(submissionsSowConfigDto, "submissionsSowConfigDto");
                String totalTopup = submissionsSowConfigDto.getTotalTopup();
                String defaultCurrency = submissionsSowConfigDto.getDefaultCurrency();
                int declaredTotalTopUpInPercentage = submissionsSowConfigDto.getDeclaredTotalTopUpInPercentage();
                boolean hasEnoughTopUp = submissionsSowConfigDto.getHasEnoughTopUp();
                boolean hasEnoughDeclaredTopUp = submissionsSowConfigDto.getHasEnoughDeclaredTopUp();
                boolean submissionExists = submissionsSowConfigDto.getSubmissionExists();
                long reviewStartDate = submissionsSowConfigDto.getReviewStartDate();
                DateTimeZone dateTimeZone = DateTimeZone.UTC;
                return new y(Months.monthsBetween(new DateTime(reviewStartDate, dateTimeZone), new DateTime(submissionsSowConfigDto.getReviewEndDate(), dateTimeZone)).getMonths(), totalTopup, defaultCurrency, declaredTotalTopUpInPercentage, hasEnoughTopUp, hasEnoughDeclaredTopUp, submissionExists);
            case 1:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (o) this.f221014b.f221018b.get("MEMORY_CACHE_LATEST_SUBMISSION_KEY");
            case 2:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return (t) this.f221014b.f221018b.get("MEMORY_CACHE_SUBMISSIONS_CONFIG_KEY");
            case 3:
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (s) this.f221014b.f221018b.get("MEMORY_CACHE_SOW_STATE_KEY");
            case 4:
                Unit it11 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return (List) this.f221014b.f221018b.get("MEMORY_CACHE_EVIDENCE_TYPES_KEY");
            case 5:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new h(new ly2.d(this.f221014b, 14, (t) pair.f186385a, (o) pair.f186386b), 2);
            case 6:
                s sowStateDto = (s) obj2;
                Intrinsics.checkNotNullParameter(sowStateDto, "sowStateDto");
                lzc.a aVar2 = this.f221014b.f221019c;
                Intrinsics.checkNotNullParameter(sowStateDto, "sowStateDto");
                n sourceOfWealth = sowStateDto.getSourceOfWealth();
                String flowType = sourceOfWealth.getFlowType();
                v vVar = (v) u1.v(sourceOfWealth.getState(), lzc.b.f200962a);
                if (vVar == null) {
                    vVar = v.NONE;
                }
                List restrictions = sourceOfWealth.getRestrictions();
                if (restrictions == null) {
                    restrictions = f0.f322471a;
                }
                Boolean isRestricted = sourceOfWealth.getIsRestricted();
                return new w(flowType, vVar, restrictions, isRestricted != null ? isRestricted.booleanValue() : false);
            default:
                o latestSubmissionDto = (o) obj2;
                Intrinsics.checkNotNullParameter(latestSubmissionDto, "submissionDto");
                lzc.a aVar3 = this.f221014b.f221019c;
                Intrinsics.checkNotNullParameter(latestSubmissionDto, "latestSubmissionDto");
                x xVar = (!Intrinsics.f(latestSubmissionDto.getReviewState().getType(), "UPLOADED") || Intrinsics.f(latestSubmissionDto.getState(), "PENDING_USER")) ? (Intrinsics.f(latestSubmissionDto.getReviewState().getType(), "UNDER_REVIEW") && Intrinsics.f(latestSubmissionDto.getState(), "PENDING_USER")) ? x.ACTION_REQUIRED : (Intrinsics.f(latestSubmissionDto.getReviewState().getType(), "UNDER_REVIEW") || Intrinsics.f(latestSubmissionDto.getReviewState().getType(), "REJECTED")) ? x.IN_REVIEW : Intrinsics.f(latestSubmissionDto.getReviewState().getType(), "UPDATE_REQUIRED") ? x.ACTION_REQUIRED : Intrinsics.f(latestSubmissionDto.getReviewState().getType(), "APPROVED") ? x.VERIFIED : x.UNKNOWN : x.SUBMITTED;
                gzc.s sVarC = lzc.a.c(latestSubmissionDto.getReviewState());
                boolean canAddSource = latestSubmissionDto.getCanAddSource();
                List evidences = latestSubmissionDto.getEvidences();
                int i = 10;
                ArrayList arrayList = new ArrayList(zhm.w.t(evidences, 10));
                Iterator it12 = evidences.iterator();
                while (it12.hasNext()) {
                    i iVar = (i) it12.next();
                    String id10 = iVar.getId();
                    String amount = iVar.getAmount();
                    String title = iVar.getTitle();
                    String description = iVar.getDescription();
                    m mVarB = lzc.a.b(iVar.getIncomeFrequency());
                    gzc.s sVarC2 = lzc.a.c(iVar.getReviewState());
                    List documents = iVar.getDocuments();
                    o oVar = latestSubmissionDto;
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(documents, i));
                    Iterator it13 = documents.iterator();
                    while (it13.hasNext()) {
                        jzc.d dVar = (jzc.d) it13.next();
                        String id11 = dVar.getId();
                        String type = dVar.getType().getType();
                        String title2 = dVar.getType().getTitle();
                        String description2 = dVar.getType().getDescription();
                        gzc.s sVarC3 = lzc.a.c(dVar.getReviewState());
                        jzc.a actionToDo = dVar.getActionToDo();
                        gzc.a aVarA = actionToDo != null ? lzc.a.a(actionToDo) : null;
                        List<e> pages = dVar.getPages();
                        Iterator it14 = it13;
                        Iterator it15 = it12;
                        x xVar2 = xVar;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(pages, 10));
                        for (e eVar : pages) {
                            String id12 = eVar.getId();
                            String mimeType = eVar.getMimeType();
                            String fileName = eVar.getFileName();
                            String fileUrl = eVar.getFileUrl();
                            gzc.s sVarC4 = lzc.a.c(eVar.getReviewState());
                            jzc.a actionToDo2 = eVar.getActionToDo();
                            arrayList3.add(new g(id12, mimeType, fileName, fileUrl, sVarC4, actionToDo2 != null ? lzc.a.a(actionToDo2) : null));
                        }
                        arrayList2.add(new f(id11, new gzc.o(type, title2, description2, sVarC3, arrayList3, aVarA)));
                        i = 10;
                        it13 = it14;
                        xVar = xVar2;
                        it12 = it15;
                    }
                    Iterator it16 = it12;
                    int i2 = i;
                    x xVar3 = xVar;
                    r incomeSource = iVar.getIncomeSource();
                    u uVar = new u(incomeSource.getTitle(), incomeSource.getType(), incomeSource.getDescription(), incomeSource.getPrimary(), lzc.a.b(incomeSource.getIncomeFrequency()));
                    jzc.a actionToDo3 = iVar.getActionToDo();
                    arrayList.add(new p(id10, amount, title, description, sVarC2, mVarB, arrayList2, uVar, actionToDo3 != null ? lzc.a.a(actionToDo3) : null));
                    i = i2;
                    latestSubmissionDto = oVar;
                    xVar = xVar3;
                    it12 = it16;
                }
                o oVar2 = latestSubmissionDto;
                x xVar4 = xVar;
                jzc.a actionToDo4 = oVar2.getActionToDo();
                return new q(xVar4, sVarC, canAddSource, arrayList, oVar2.getSubmittedDate(), oVar2.getReviewStartedDate(), oVar2.getApprovedDate(), actionToDo4 != null ? lzc.a.a(actionToDo4) : null);
        }
    }
}
