package sal;

import com.revolut.shared.feature.suspicious_transaction.api.models.Action;
import com.revolut.shared.feature.suspicious_transaction.api.models.ActionButton;
import com.revolut.shared.feature.suspicious_transaction.api.models.Agreement;
import com.revolut.shared.feature.suspicious_transaction.api.models.Answer;
import com.revolut.shared.feature.suspicious_transaction.api.models.RequestSuccessDialog;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionBannerPrompt;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionBannerPromptAction;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialogAnswer;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialogLink;
import com.revolut.shared.feature.suspicious_transaction.api.models.TransactionCell;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import ral.b;
import ral.c;
import ral.d;
import ral.e;
import ral.f;
import ral.g;
import ral.k;
import ral.l;
import ral.p;
import ral.q;
import ral.r;
import ral.s;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f261455a = r0.k(new Pair("POST", com.revolut.shared.feature.suspicious_transaction.api.models.a.POST), new Pair("PUT", com.revolut.shared.feature.suspicious_transaction.api.models.a.PUT), new Pair("PATCH", com.revolut.shared.feature.suspicious_transaction.api.models.a.PATCH), new Pair("DELETE", com.revolut.shared.feature.suspicious_transaction.api.models.a.DELETE));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f261456b = r0.k(new Pair("PRIMARY", gal.a.PRIMARY), new Pair("SECONDARY", gal.a.SECONDARY));

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    public static final ActionButton a(ral.a aVar) {
        RequestSuccessDialog.Button button;
        Action request;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        gal.a aVar2 = (gal.a) u1.u(aVar.getType(), f261456b);
        String title = aVar.getTitle();
        b action = aVar.getAction();
        Intrinsics.checkNotNullParameter(action, "<this>");
        if (action.getDeeplink() != null) {
            request = new Action.Deeplink(action.getDeeplink());
        } else if (action.getIb.b.Screen java.lang.String() != null) {
            request = new Action.Screen(c(action.getIb.b.Screen java.lang.String()));
        } else {
            if (action.getRequest() == null) {
                throw new IllegalArgumentException("One of [screen, deepLink, request] must be present");
            }
            e request2 = action.getRequest();
            Intrinsics.checkNotNullParameter(request2, "<this>");
            com.revolut.shared.feature.suspicious_transaction.api.models.a aVar3 = (com.revolut.shared.feature.suspicious_transaction.api.models.a) u1.u(request2.getMethod(), f261455a);
            String path = request2.getPath();
            g successDialog = request2.getSuccessDialog();
            Intrinsics.checkNotNullParameter(successDialog, "<this>");
            String title2 = successDialog.getTitle();
            String subtitle = successDialog.getSubtitle();
            f button2 = successDialog.getButton();
            if (button2 != null) {
                Intrinsics.checkNotNullParameter(button2, "<this>");
                button = new RequestSuccessDialog.Button(button2.getTitle(), button2.getDeeplink());
            } else {
                button = null;
            }
            request = new Action.Request(aVar3, path, new RequestSuccessDialog(title2, subtitle, button));
        }
        return new ActionButton(aVar2, title, request);
    }

    public static final SuspiciousTransactionBannerPrompt b(l lVar) {
        String id10 = lVar.getId();
        String title = lVar.getTitle();
        String description = lVar.getDescription();
        List bulletList = lVar.getBulletList();
        k primaryAction = lVar.getPrimaryAction();
        SuspiciousTransactionBannerPromptAction suspiciousTransactionBannerPromptAction = primaryAction != null ? new SuspiciousTransactionBannerPromptAction(primaryAction.getTitle(), primaryAction.getDeeplink()) : null;
        k secondaryAction = lVar.getSecondaryAction();
        return new SuspiciousTransactionBannerPrompt(id10, title, description, bulletList, suspiciousTransactionBannerPromptAction, secondaryAction != null ? new SuspiciousTransactionBannerPromptAction(secondaryAction.getTitle(), secondaryAction.getDeeplink()) : null);
    }

    public static final SuspiciousTransactionDialog.Screen c(q.e eVar) {
        SuspiciousTransactionDialog.Screen.Cancel.Survey survey;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (eVar instanceof q.e.C1395e) {
            q.e.C1395e c1395e = (q.e.C1395e) eVar;
            Intrinsics.checkNotNullParameter(c1395e, "<this>");
            return new SuspiciousTransactionDialog.Screen.SimpleWarning(c1395e.getTitle(), c1395e.getTitleIcon(), c1395e.getTrackingId(), c1395e.getSubtitle(), c1395e.getImage(), e(c1395e.getButtons()));
        }
        if (eVar instanceof q.e.b) {
            q.e.b bVar = (q.e.b) eVar;
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            return new SuspiciousTransactionDialog.Screen.CircleWarning(bVar.getTitle(), bVar.getTitleIcon(), e(bVar.getButtons()), bVar.getTrackingId(), bVar.getSubtitle(), bVar.getRiskHeader(), bVar.getRiskValue(), bVar.getRiskSubtitle());
        }
        if (eVar instanceof q.e.d) {
            q.e.d dVar = (q.e.d) eVar;
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            String title = dVar.getTitle();
            String titleIcon = dVar.getTitleIcon();
            ArrayList arrayListE = e(dVar.getButtons());
            String trackingId = dVar.getTrackingId();
            List tips = dVar.getTips();
            if (tips == null) {
                tips = f0.f322471a;
            }
            return new SuspiciousTransactionDialog.Screen.SimpleConfirmation(title, titleIcon, arrayListE, trackingId, tips, dVar.getGuide());
        }
        if (eVar instanceof q.e.c) {
            q.e.c cVar = (q.e.c) eVar;
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            String title2 = cVar.getTitle();
            String titleIcon2 = cVar.getTitleIcon();
            ArrayList arrayListE2 = e(cVar.getButtons());
            String trackingId2 = cVar.getTrackingId();
            s transaction = cVar.getTransaction();
            Intrinsics.checkNotNullParameter(transaction, "<this>");
            TransactionCell transactionCell = new TransactionCell(transaction.getInitials(), transaction.getCreationDate(), transaction.getTitle(), transaction.getAmount());
            c agreement = cVar.getAgreement();
            Intrinsics.checkNotNullParameter(agreement, "<this>");
            return new SuspiciousTransactionDialog.Screen.RiskAgreement(title2, titleIcon2, arrayListE2, trackingId2, transactionCell, new Agreement(agreement.getDescription(), agreement.getInputHeader(), agreement.getInputHint(), agreement.getUsername()));
        }
        if (!(eVar instanceof q.e.a)) {
            throw new NoWhenBranchMatchedException();
        }
        q.e.a aVar = (q.e.a) eVar;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String title3 = aVar.getTitle();
        String titleIcon3 = aVar.getTitleIcon();
        ArrayList arrayListE3 = e(aVar.getButtons());
        String trackingId3 = aVar.getTrackingId();
        String subtitle = aVar.getSubtitle();
        s transaction2 = aVar.getTransaction();
        Intrinsics.checkNotNullParameter(transaction2, "<this>");
        TransactionCell transactionCell2 = new TransactionCell(transaction2.getInitials(), transaction2.getCreationDate(), transaction2.getTitle(), transaction2.getAmount());
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar.getQuestionType() == null || aVar.getAnswers() == null) {
            survey = null;
        } else {
            String questionType = aVar.getQuestionType();
            List<d> answers = aVar.getAnswers();
            ArrayList arrayList = new ArrayList(w.t(answers, 10));
            for (d dVar2 : answers) {
                Intrinsics.checkNotNullParameter(dVar2, "<this>");
                arrayList.add(new Answer(dVar2.getId(), dVar2.getTitle()));
            }
            survey = new SuspiciousTransactionDialog.Screen.Cancel.Survey(questionType, arrayList);
        }
        return new SuspiciousTransactionDialog.Screen.Cancel(title3, titleIcon3, arrayListE3, trackingId3, subtitle, transactionCell2, survey);
    }

    public static final SuspiciousTransactionDialog d(q qVar) {
        Map mapG;
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        if (qVar instanceof q.a) {
            q.a aVar = (q.a) qVar;
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            String title = aVar.getTitle();
            String titleIcon = aVar.getTitleIcon();
            String str = titleIcon == null ? "" : titleIcon;
            boolean isFinalDialog = aVar.getIsFinalDialog();
            String guideTitle = aVar.getGuideTitle();
            List guideSteps = aVar.getGuideSteps();
            String actionsTitle = aVar.getActionsTitle();
            List<r> actionsLinks = aVar.getActionsLinks();
            ArrayList arrayList = new ArrayList(w.t(actionsLinks, 10));
            for (r rVar : actionsLinks) {
                Intrinsics.checkNotNullParameter(rVar, "<this>");
                arrayList.add(new SuspiciousTransactionDialogLink(rVar.getIcon(), rVar.getTitle(), rVar.getLink()));
            }
            return new SuspiciousTransactionDialog.Action(isFinalDialog, title, str, guideTitle, guideSteps, actionsTitle, arrayList, aVar.getDisclaimer(), aVar.getCancelButtonTitle(), aVar.getConfirmButtonTitle());
        }
        if (!(qVar instanceof q.c)) {
            if (qVar instanceof q.f) {
                q.f fVar = (q.f) qVar;
                Intrinsics.checkNotNullParameter(fVar, "<this>");
                String title2 = fVar.getTitle();
                String titleIcon2 = fVar.getTitleIcon();
                return new SuspiciousTransactionDialog.Warning(fVar.getIsFinalDialog(), title2, titleIcon2 == null ? "" : titleIcon2, fVar.getDescription(), fVar.getRiskBoxTopLine(), fVar.getRiskPercentage(), fVar.getRiskBoxBottomLine(), fVar.getCancelButtonTitle(), fVar.getConfirmButtonTitle(), d(fVar.getNextDialog()));
            }
            if (qVar instanceof q.d) {
                q.d dVar = (q.d) qVar;
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                return new SuspiciousTransactionDialog.Redirection(dVar.getIsFinalDialog(), dVar.getDeeplink());
            }
            if (qVar instanceof q.b) {
                q.b bVar = (q.b) qVar;
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                return new SuspiciousTransactionDialog.DeeplinkRedirection(bVar.getDeeplink());
            }
            if (qVar instanceof q.e) {
                return c((q.e) qVar);
            }
            throw new NoWhenBranchMatchedException();
        }
        q.c cVar = (q.c) qVar;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String title3 = cVar.getTitle();
        String titleIcon3 = cVar.getTitleIcon();
        String str2 = titleIcon3 == null ? "" : titleIcon3;
        boolean isFinalDialog2 = cVar.getIsFinalDialog();
        String questionTitle = cVar.getQuestionTitle();
        String questionType = cVar.getQuestionType();
        List<p> answers = cVar.getAnswers();
        ArrayList arrayList2 = new ArrayList(w.t(answers, 10));
        for (p pVar : answers) {
            Intrinsics.checkNotNullParameter(pVar, "<this>");
            arrayList2.add(new SuspiciousTransactionDialogAnswer(pVar.getId(), pVar.getTitle()));
        }
        Map nextDialog = cVar.getNextDialog();
        if (nextDialog == null) {
            mapG = r0.g();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(nextDialog.size()));
            for (Map.Entry entry : nextDialog.entrySet()) {
                linkedHashMap.put(entry.getKey(), d((q) entry.getValue()));
            }
            mapG = linkedHashMap;
        }
        return new SuspiciousTransactionDialog.Question(isFinalDialog2, title3, str2, questionTitle, questionType, arrayList2, mapG);
    }

    public static final ArrayList e(List list) {
        Object objA;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            ral.a aVar = (ral.a) it8.next();
            try {
                m.Companion companion = m.INSTANCE;
                objA = a(aVar);
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                objA = o.a(th10);
            }
            Throwable thA = m.a(objA);
            if (thA != null) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, thA, h0Var);
            }
            if (objA instanceof n) {
                objA = null;
            }
            ActionButton actionButton = (ActionButton) objA;
            if (actionButton != null) {
                arrayList.add(actionButton);
            }
        }
        return arrayList;
    }
}
