package zc0;

import aw0.f4;
import aw0.o9;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.backend_flow.R$string;
import com.revolut.core.backend_flow.photo.selfserve.selfie.common.selfiewithcard.selfiecamera.SelfieCameraContract$Configuration;
import com.revolut.core.backend_flow.ui.card_photo.BackendFlowCardPhotoCameraActivity;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.backend_flow.domain.models.Action;
import com.revolut.feature.backend_flow.domain.models.BackendCardPhotoItem;
import com.revolut.feature.backend_flow.domain.models.BackendEntityItem;
import com.revolut.feature.backend_flow.domain.models.BackendFlowFile;
import com.revolut.feature.backend_flow.domain.models.BackendFlowUploadItem;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.BottomPromptScreen;
import com.revolut.feature.backend_flow.domain.models.DeeplinkScreen;
import com.revolut.feature.backend_flow.domain.models.DocumentItem;
import com.revolut.feature.backend_flow.domain.models.EntitiesListItem;
import com.revolut.feature.backend_flow.domain.models.EntitiesSelectionItem;
import com.revolut.feature.backend_flow.domain.models.EntityType;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.HtmlPromptScreen;
import com.revolut.feature.backend_flow.domain.models.InfoListItemSubitem;
import com.revolut.feature.backend_flow.domain.models.MailItem;
import com.revolut.feature.backend_flow.domain.models.ProductSelectionItem;
import com.revolut.feature.backend_flow.domain.models.PromptScreen;
import com.revolut.feature.backend_flow.domain.models.SelectionStyle;
import com.revolut.feature.backend_flow.domain.models.StatusDialogScreen;
import com.revolut.feature.backend_flow.domain.models.StoriesScreen;
import com.revolut.feature.backend_flow.domain.models.SummaryScreen;
import com.revolut.feature.backend_flow.domain.models.SummarySectionItem;
import com.revolut.feature.backend_flow.domain.models.TransactionCellItem;
import com.revolut.feature.backend_flow.domain.models.TransactionsSelectionItem;
import com.revolut.feature.backend_flow.domain.models.TutorialScreen;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.retail.operation_status.modal_status.SuccessType;
import ip0.az;
import ip0.kx;
import ip0.sp0;
import ip0.up0;
import ip0.vd;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f321158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y2 f321159b;

    public /* synthetic */ y(y2 y2Var, int i) {
        this.f321158a = i;
        this.f321159b = y2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        pfm.a aVarW;
        Object success;
        int i = this.f321158a;
        efm.b bVarL = pfm.m.f235744a;
        int i2 = 4;
        int i3 = 3;
        y2 y2Var = this.f321159b;
        switch (i) {
            case 0:
                f4 f4Var = (f4) obj2;
                return y2Var.f321162h.t(f4Var.f10303a, f4Var.f10304b);
            case 1:
                Pair pair = (Pair) obj2;
                Date date = (Date) pair.f186385a;
                return y2Var.f321162h.A2((String) pair.f186386b, date != null ? ebm.a.N(date) : null);
            case 2:
                AmountEditDelegate.Model model = (AmountEditDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                return ((qc0.f1) y2Var.i).s(model.f51624a);
            case 3:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return y2Var.f321162h.d3((String) pair2.f186385a, (String) pair2.f186386b);
            case 4:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return y2Var.i.goBack();
            case 5:
                PhoneEditorDelegate.PhoneData phoneData = (PhoneEditorDelegate.PhoneData) obj2;
                Intrinsics.checkNotNullParameter(phoneData, "<destruct>");
                return y2Var.f321162h.X0(phoneData.f52895a, phoneData.f52896b);
            case 6:
                g gVar = y2Var.f321162h;
                ProductSelectionDelegate.Model it8 = (ProductSelectionDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Object obj3 = it8.i;
                if (obj3 instanceof s3) {
                    s3 s3Var = (s3) obj3;
                    aVarW = gVar.j2(s3Var.f321122a, s3Var.f321123b);
                } else {
                    if (!(obj3 instanceof ProductSelectionItem)) {
                        throw new IllegalStateException(v0.a.h(obj3, "Unsupported parcel type: ", " for product selections clicks"));
                    }
                    aVarW = gVar.w(it8.f52973a);
                }
                pfm.a aVarE = aVarW.e(((qc0.f1) y2Var.i).l());
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE;
            case 7:
                g gVar2 = y2Var.f321162h;
                d parcel = (d) obj2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel instanceof u3) {
                    u3 u3Var = (u3) parcel;
                    pfm.a aVarN2 = gVar2.n2(u3Var.f321136a);
                    if (!u3Var.f321137b) {
                        bVarL = ((qc0.f1) y2Var.i).l();
                    }
                    pfm.a aVarE2 = aVarN2.e(bVarL);
                    Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
                    return aVarE2;
                }
                if (parcel instanceof y3) {
                    y3 y3Var = (y3) parcel;
                    return gVar2.Y0(y3Var.f321175a, y3Var.f321176b);
                }
                if (parcel instanceof q3) {
                    return gVar2.c2(((q3) parcel).f321111a);
                }
                if (parcel instanceof z2) {
                    z2 z2Var = (z2) parcel;
                    return gVar2.R0(z2Var.f321180a, z2Var.f321181b);
                }
                if (parcel instanceof s3) {
                    s3 s3Var2 = (s3) parcel;
                    return gVar2.j2(s3Var2.f321122a, s3Var2.f321123b);
                }
                if (parcel instanceof l3) {
                    l3 l3Var = (l3) parcel;
                    return gVar2.N0(l3Var.f321081a.getId(), l3Var.f321082b);
                }
                throw new IllegalArgumentException("Unsupported parcel type: " + parcel);
            case 8:
                SelectableDelegate.Model delegate = (SelectableDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(delegate, "it");
                g gVar3 = y2Var.f321162h;
                ((nc0.f) y2Var.f321171t).getClass();
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                Object obj4 = ((RowDelegate.Model) delegate.f53305b).u;
                Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.shared.feature.transaction.models.SharedTransaction");
                return gVar3.N(nc0.f.b((v9l.a) obj4));
            case 9:
                ty0.a it9 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return ((qc0.f1) y2Var.i).u(it9.f275445a);
            case 10:
                ty0.a it10 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return ((qc0.f1) y2Var.i).u(it10.f275445a);
            case 11:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                return y2Var.f321162h.K2(((Number) pair3.f186386b).intValue(), (String) pair3.f186385a);
            case 12:
                String link = (String) obj2;
                Intrinsics.checkNotNullParameter(link, "link");
                return ((qc0.f1) y2Var.i).u(link);
            case 13:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return y2Var.i.goBack();
            case 14:
                ListSubheaderDelegate.Model model2 = (ListSubheaderDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model2, "model");
                Object obj5 = model2.f52715m;
                Action action = obj5 instanceof Action ? (Action) obj5 : null;
                if (action != null) {
                    return ((qc0.f1) y2Var.i).m(action);
                }
                IllegalStateException illegalStateException = new IllegalStateException("Action is not provided");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                return bVarL;
            case 15:
                az clickData = (az) obj2;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj6 = clickData.f163509c;
                if (obj6 instanceof InfoListItemSubitem.Link) {
                    return ((qc0.f1) y2Var.i).u(((InfoListItemSubitem.Link) obj6).d);
                }
                return new pfm.h(new z6l.a(obj6, 1), 2);
            case 16:
                g gVar4 = y2Var.f321162h;
                qc0.j jVar = y2Var.i;
                RowDelegate.Model delegate2 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(delegate2, "model");
                Object obj7 = delegate2.u;
                if (obj7 instanceof BackendFlowUploadItem) {
                    if (!(((BackendFlowUploadItem) obj7) instanceof BackendCardPhotoItem)) {
                        pfm.h hVar = new pfm.h(new r(y2Var, 4), 2);
                        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                        return hVar;
                    }
                    BackendCardPhotoItem item = (BackendCardPhotoItem) obj7;
                    qc0.f1 f1Var = (qc0.f1) jVar;
                    f1Var.getClass();
                    Intrinsics.checkNotNullParameter(item, "item");
                    ExplicitActivityDestination explicitActivityDestination = new ExplicitActivityDestination(BackendFlowCardPhotoCameraActivity.class);
                    String str = item.f63257a;
                    m70.a.c(kotlin.jvm.internal.t0.f186434a);
                    return f1Var.p(new ActivityNavigateCommand(explicitActivityDestination, new SelfieCameraContract$Configuration(str, "", false, kc0.d.CARD, f1Var.e), null, Integer.valueOf(SyslogConstants.LOG_LOCAL2), 0, null, null, null, null, false, 1012));
                }
                if (obj7 instanceof b3) {
                    b3 b3Var = (b3) obj7;
                    return gVar4.H(b3Var.f321013a, b3Var.f321014b).e(((qc0.f1) jVar).l());
                }
                if (obj7 instanceof DocumentItem) {
                    DocumentItem documentItem = (DocumentItem) obj7;
                    qc0.f1 f1Var2 = (qc0.f1) jVar;
                    f1Var2.getClass();
                    Intrinsics.checkNotNullParameter(documentItem, "documentItem");
                    pfm.a aVarE3 = f1Var2.h().Q0(documentItem).e(f1Var2.u(documentItem.f63396g));
                    Intrinsics.checkNotNullExpressionValue(aVarE3, "andThen(...)");
                    return aVarE3;
                }
                if (obj7 instanceof SummarySectionItem) {
                    return ((qc0.f1) jVar).n(((SummarySectionItem) obj7).e);
                }
                if (obj7 instanceof MailItem) {
                    return ((qc0.f1) jVar).u(((MailItem) obj7).f63518c);
                }
                if (obj7 instanceof s3) {
                    s3 s3Var3 = (s3) obj7;
                    return gVar4.j2(s3Var3.f321122a, s3Var3.f321123b).e(((qc0.f1) jVar).l());
                }
                if (obj7 instanceof u3) {
                    return gVar4.n2(((u3) obj7).f321136a).e(((qc0.f1) jVar).l());
                }
                if (obj7 instanceof l3) {
                    l3 l3Var2 = (l3) obj7;
                    BackendEntityItem backendEntityItem = l3Var2.f321081a;
                    if ((backendEntityItem instanceof EntitiesSelectionItem) && (((EntitiesSelectionItem) backendEntityItem).e instanceof SelectionStyle.SingleSelection)) {
                        return gVar4.N0(backendEntityItem.getId(), l3Var2.f321082b).e(((qc0.f1) jVar).l());
                    }
                    return new pfm.a(new rfm.o(new s2i.i(new eki.e(0, 9, xl2.r.class, l3Var2.f321082b, "moreInfoDeeplink", "getMoreInfoDeeplink()Ljava/lang/String;"), 27)), new b0(new zab.s(1, y2Var.i, qc0.j.class, "openLink", "openLink(Ljava/lang/String;)Lio/reactivex/Completable;", 0, 18), i3), 3);
                }
                if (obj7 instanceof TransactionCellItem) {
                    return new pfm.a(new rfm.o(new s2i.i(new eki.e(0, 10, TransactionCellItem.class, obj7, "deeplink", "getDeeplink()Ljava/lang/String;"), 28)), new b0(new zab.s(1, y2Var.i, qc0.j.class, "openLink", "openLink(Ljava/lang/String;)Lio/reactivex/Completable;", 0, 19), i2), 3);
                }
                if (obj7 instanceof h3) {
                    h3 h3Var = (h3) obj7;
                    return gVar4.W1(h3Var.f321061b, h3Var.f321060a.f63400a).e(((qc0.f1) jVar).l());
                }
                if (obj7 instanceof v9l.a) {
                    ((nc0.f) y2Var.f321171t).getClass();
                    Intrinsics.checkNotNullParameter(delegate2, "delegate");
                    Object obj8 = delegate2.u;
                    Intrinsics.i(obj8, "null cannot be cast to non-null type com.revolut.shared.feature.transaction.models.SharedTransaction");
                    return gVar4.N(nc0.f.b((v9l.a) obj8)).e(((qc0.f1) jVar).l());
                }
                if (obj7 instanceof o3) {
                    return ((qc0.f1) jVar).u(((o3) obj7).f321099b);
                }
                if (!(obj7 instanceof k3)) {
                    if (!(obj7 instanceof t3)) {
                        return obj7 instanceof x3 ? bVarL : new pfm.h(new bji.a(12), 2);
                    }
                    t3 t3Var = (t3) obj7;
                    return gVar4.v1(t3Var.f321129a, t3Var.f321130b);
                }
                k3 k3Var = (k3) obj7;
                if (k3Var instanceof i3) {
                    return ((qc0.f1) jVar).m(((i3) obj7).f321065b);
                }
                if (!(k3Var instanceof j3)) {
                    throw new NoWhenBranchMatchedException();
                }
                j3 j3Var = (j3) obj7;
                String str2 = j3Var.f321069a;
                EntityType entityType = j3Var.f321070b;
                TextLocalisedClause textLocalisedClauseB = uc0.b.B(entityType);
                return ((qc0.f1) jVar).t(new EntitiesListItem(str2, entityType, textLocalisedClauseB != null ? y2Var.z.b(textLocalisedClauseB).toString() : null, null, null));
            case 17:
                StatusViewConfiguration it11 = (StatusViewConfiguration) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                ((k3l.d) y2Var.f321166n).O(it11);
                return Unit.f186387a;
            case 18:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                TransactionsSelectionItem transactionsSelectionItem = (TransactionsSelectionItem) pair4.f186385a;
                od0.i iVar = (od0.i) pair4.f186386b;
                efm.d0 d0VarP = y2Var.P();
                b0 b0Var = new b0(new yrk.e(y2Var, 15, transactionsSelectionItem, iVar), 9);
                d0VarP.getClass();
                return new sfm.b(d0VarP, b0Var, 2);
            case 19:
                RowDelegate.Model model3 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model3, "model");
                Object obj9 = model3.u;
                x3 x3Var = obj9 instanceof x3 ? (x3) obj9 : null;
                if (x3Var != null) {
                    String str3 = model3.f53228a;
                    BackendFlowFile backendFlowFile = x3Var.f321157b;
                    String str4 = backendFlowFile.d;
                    if (str4 != null) {
                        efm.b bVarU = mo3.a.u(y2Var.f321162h.m1(str3, str4), y2Var.f321168q, true);
                        Intrinsics.checkNotNullExpressionValue(bVarU, "withProgress$default(...)");
                        Function1 function1K = y2Var.K();
                        pfm.a aVar = new pfm.a(bVarU, new nii.o0(28, new x1(new BreadcrumbException(), 23)), 2);
                        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                        te0.w.j0(y2Var.f239031a, z9h.n.k(function1K, aVar, new yzc.p(7, p2.f321104a), "subscribe(...)"));
                    } else {
                        ((npi.c) y2Var.f321164l).R(new rp0.b("RETRY_DIALOG_ID", new TextLocalisedClause(R$string.form_builder_uploading_failed_title, null, null, 14), new TextLocalisedClause(R$string.form_builder_uploading_failed_message, null, null, 14), new TextLocalisedClause(R$string.form_builder_uploading_failed_retry, null, null, 14), null, new TextLocalisedClause(R$string.form_builder_uploading_failed_remove, null, null, 14), backendFlowFile, false, 784));
                    }
                } else {
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "BackendScreenPresenter", "Model doesn't contain binary", null, h0Var2);
                }
                return Unit.f186387a;
            case 20:
                qc0.j jVar2 = y2Var.i;
                ty0.a model4 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(model4, "model");
                Object obj10 = model4.d;
                if (obj10 instanceof InfoListItemSubitem.Link) {
                    return ((qc0.f1) jVar2).u(((InfoListItemSubitem.Link) obj10).d);
                }
                if (obj10 instanceof n3) {
                    return ((qc0.f1) jVar2).u(model4.f275445a);
                }
                return new pfm.h(new bji.a(11), 2);
            case 21:
                rp0.z clickData2 = (rp0.z) obj2;
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                return ((qc0.f1) y2Var.i).u(clickData2.f256227a);
            case 22:
                vd it12 = (vd) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return y2Var.f321162h.x0(it12.f166806a.f54184a, it12.f166807b);
            case 23:
                kx it13 = (kx) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                g gVar5 = y2Var.f321162h;
                String str5 = it13.f165092a.f165423a;
                LocalDate localDateAtDay = it13.f165093b.atDay(1);
                Intrinsics.checkNotNullExpressionValue(localDateAtDay, "atDay(...)");
                return gVar5.b2(str5, localDateAtDay);
            case 24:
                y2Var.f321163j.setEnabled(((Boolean) obj2).booleanValue());
                return Unit.f186387a;
            case 25:
                sp0 it14 = (sp0) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                g gVar6 = y2Var.f321162h;
                up0 up0Var = it14.f166383a;
                return gVar6.p0(up0Var.f166712a, new ba0.j(it14.f166384b, up0Var.f166713b));
            case 26:
                InputTextDelegate.Model it15 = (InputTextDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return y2Var.f321162h.b1(it15.f52580a);
            case 27:
                a3 it16 = (a3) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return y2Var.f321162h.f3(it16.f321003a, it16.f321004b);
            case 28:
                m3 it17 = (m3) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return y2Var.f321162h.e3(it17.f321086a, it17.f321087b);
            default:
                BackendScreen screen = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(screen, "screen");
                if (!(screen instanceof StatusDialogScreen)) {
                    if ((screen instanceof DeeplinkScreen) || (screen instanceof FormScreen) || (screen instanceof SummaryScreen) || (screen instanceof StoriesScreen) || (screen instanceof BottomPromptScreen) || (screen instanceof PromptScreen) || (screen instanceof HtmlPromptScreen) || (screen instanceof TutorialScreen)) {
                        return rfm.h.f253943a;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                StatusDialogScreen screen2 = (StatusDialogScreen) screen;
                y2Var.k.getClass();
                Intrinsics.checkNotNullParameter(screen2, "screen");
                xl2.d0 d0Var = screen2.d;
                String str6 = screen2.e;
                String str7 = screen2.f63660c;
                int i5 = b.f321005a[d0Var.ordinal()];
                if (i5 == 1 || i5 == 2 || i5 == 3) {
                    success = new StatusViewConfiguration.Success(screen2.f63658a, new TextClause(screen2.f63659b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), str7 != null ? new TextClause(str7, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, str6 == null ? SuccessType.Simple.f104398a : new SuccessType.OptionalAction(new TextClause(str6, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, true), 1912);
                } else {
                    if (i5 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    success = new StatusViewConfiguration.Pending(screen2.f63658a, new TextClause(screen2.f63659b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), str7 != null ? new TextClause(str7, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, str6 != null ? new TextClause(str6, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, false, 8176);
                }
                return efm.k.g(success);
        }
    }
}
