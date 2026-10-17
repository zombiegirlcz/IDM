package ip0;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.chat.ui.messageslist.MessagesScreen;
import com.revolut.core.backend_flow.photo.ui.screen.card_photo.CardPhotoScreen;
import com.revolut.core.ui_kit.delegates.AmountDualEditDelegate;
import com.revolut.core.ui_kit.delegates.DialogHeaderDelegate;
import com.revolut.core.ui_kit.delegates.ImageAttachmentDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatReactionDelegate;
import com.revolut.core.ui_kit.internal.views.ContextualSegmentedBarView;
import com.revolut.core.ui_kit.internal.views.ProductIntroView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.SocialProofView;
import com.revolut.core.ui_kit.internal.views.TinyActionButton;
import com.revolut.core.ui_kit.internal.views.reactionskeyboard.ReactionsKeyboardBottomBarView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.BubbleTooltipView;
import com.revolut.core.ui_kit.views.DialogHeaderView;
import com.revolut.core.ui_kit.views.ExpandableTextView;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit.views.video.ZoomableFullScreenVideoView;
import com.revolut.feature.cashback.impl.ui.pocket.details.CashbackPocketDetailsScreen;
import com.revolut.feature.in_app_calls.screen.in_progress.InProgressScreen;
import com.revolut.feature.notification_centre.impl.ui.revolut_feed.screens.feed.RevolutFeedScreen;
import com.revolut.feature.revolutpay.shared.ui.terminal_payment.TerminalPaymentScreen;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import jec.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class g0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f164321b;

    public /* synthetic */ g0(Object obj2, int i) {
        this.f164320a = i;
        this.f164321b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f164320a;
        int i2 = 1;
        int i3 = 0;
        Object obj2 = this.f164321b;
        switch (i) {
            case 0:
                ((AmountDualEditDelegate) obj2).f51620q.onNext(Unit.f186387a);
                return;
            case 1:
                ((ijg.c) obj2).invoke(view);
                return;
            case 2:
                ((DialogHeaderDelegate) obj2).f52188c.onNext(Unit.f186387a);
                return;
            case 3:
                ((xi) obj2).f.setSelectedPosition(-1);
                return;
            case 4:
                ((ad) obj2).invoke(view);
                return;
            case 5:
                ((ImageAttachmentDelegate) obj2).f52515c.onNext(Unit.f186387a);
                return;
            case 6:
                ((SimpleMediaDelegate) obj2).f53322c.onNext(Unit.f186387a);
                return;
            case 7:
                int i5 = ZoomableFullScreenVideoView.C;
                ((ZoomableFullScreenVideoView) obj2).f(false);
                return;
            case 8:
                KProperty[] kPropertyArr = TerminalPaymentScreen.Q;
                jec.q qVar = (jec.q) ((jec.k) ((TerminalPaymentScreen) obj2).L.getValue());
                jec.j jVar = ((jec.c) ((vkm.j2) qVar.f173270q.f22677a).getValue()).f173258a;
                if (jVar instanceof jec.i) {
                    qVar.C2(new jec.f(((jec.i) jVar).f173264a));
                    return;
                } else if (jVar instanceof jec.g) {
                    qVar.C2(new d.a(((jec.g) jVar).f173262a));
                    return;
                } else {
                    if (!(jVar instanceof jec.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            case 9:
                MessagesScreen messagesScreen = (MessagesScreen) obj2;
                MessagesScreen.a aVar = MessagesScreen.Companion;
                RecyclerView.Adapter adapter = messagesScreen.f3().f1528l.getAdapter();
                koi.h hVar = adapter instanceof koi.h ? (koi.h) adapter : null;
                if (hVar == null) {
                    return;
                }
                if (messagesScreen.q0 > 0) {
                    RecyclerView.LayoutManager layoutManager = messagesScreen.f3().f1528l.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null) {
                        linearLayoutManager.scrollToPositionWithOffset(messagesScreen.q0, 0);
                    }
                } else {
                    messagesScreen.f3().f1528l.scrollToPosition(hVar.getItemCount() - 1);
                }
                messagesScreen.f3().f1528l.post(new k50.x1(messagesScreen, i3));
                return;
            case 10:
                RevolutFeedScreen revolutFeedScreen = (RevolutFeedScreen) obj2;
                RevolutFeedScreen.Companion aVar2 = RevolutFeedScreen.INSTANCE;
                k79.r rVar = (k79.r) revolutFeedScreen.R2();
                cli.y yVar = rVar.f181939r;
                if (!((k79.g) ((vkm.j2) yVar.f22677a).getValue()).f181920c) {
                    rVar.H2(yVar, new k50.a4(28));
                }
                RevolutFeedScreen.g3(((dli.c) revolutFeedScreen.M.getValue()).w().getItemCount() - 1, revolutFeedScreen.f3());
                return;
            case 11:
                KProperty[] kPropertyArr2 = CashbackPocketDetailsScreen.g0;
                ((kd3.m) ((CashbackPocketDetailsScreen) obj2).T2()).f182796s.Z2();
                return;
            case 12:
                KProperty[] kPropertyArr3 = InProgressScreen.R;
                ((ke7.w) ((InProgressScreen) obj2).f3()).B2();
                return;
            case 13:
                ((ChatReactionDelegate) obj2).f53891c.onNext(null);
                throw null;
            case 14:
                CardPhotoScreen cardPhotoScreen = (CardPhotoScreen) obj2;
                CardPhotoScreen.Companion aVar3 = CardPhotoScreen.INSTANCE;
                cardPhotoScreen.l3().setContentDescription(null);
                cardPhotoScreen.l3().setEnabled(false);
                iam.e eVarH3 = cardPhotoScreen.h3();
                nd.k logger = eVarH3.f160065b;
                logger.getClass();
                nd.k.k();
                Future future = eVarH3.f160064a.B(new mam.a(true, new ht0.b0(0, eVarH3.d, ebm.a.class, "takePhoto", "takePhoto(Lio/fotoapparat/hardware/Device;)Lio/fotoapparat/result/Photo;", 1, 1)));
                abm.j.Companion.getClass();
                Intrinsics.checkNotNullParameter(future, "photoFuture");
                Intrinsics.checkNotNullParameter(logger, "logger");
                abm.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(future, "future");
                Intrinsics.checkNotNullParameter(logger, "logger");
                ExecutorService pendingResultExecutor = qam.f.f244074c;
                Intrinsics.checkNotNullExpressionValue(pendingResultExecutor, "pendingResultExecutor");
                abm.e pendingResult = new abm.e(future, logger, pendingResultExecutor);
                Intrinsics.checkNotNullParameter(pendingResult, "pendingResult");
                bbm.b sizeTransformer = bbm.b.f;
                Intrinsics.checkNotNullParameter(sizeTransformer, "sizeTransformer");
                bbm.a transformer = new bbm.a(0, sizeTransformer);
                Intrinsics.checkNotNullParameter(transformer, "transformer");
                FutureTask futureTask = new FutureTask(new a09.r(transformer, pendingResult, 3));
                pendingResultExecutor.execute(futureTask);
                abm.e eVar = new abm.e(futureTask, logger, pendingResultExecutor);
                laj.b callback = new laj.b(cardPhotoScreen, 5);
                Intrinsics.checkNotNullParameter(callback, "callback");
                pendingResultExecutor.execute(new a4.a(eVar, callback, i2));
                return;
            case 15:
                ReactionsKeyboardBottomBarView.a((ReactionsKeyboardBottomBarView) obj2);
                return;
            case 16:
                ((ms0.g0) obj2).f208254b.onNext(Unit.f186387a);
                return;
            case 17:
                int i6 = ContextualSegmentedBarView.f56146g;
                Function1<Integer, Unit> selectionListener = ((ContextualSegmentedBarView) obj2).getSelectionListener();
                if (selectionListener != null) {
                    selectionListener.invoke(-1);
                    return;
                }
                return;
            case 18:
                ((ms0.b2) obj2).f208182b.onNext(Unit.f186387a);
                return;
            case 19:
                ((ProductIntroView) obj2).f56313y.onNext(Unit.f186387a);
                return;
            case 20:
                SmallActionButton smallActionButton = (SmallActionButton) obj2;
                SmallActionButton.Companion companion = SmallActionButton.INSTANCE;
                Intrinsics.h(view);
                smallActionButton.m(view);
                smallActionButton.i.onNext(Unit.f186387a);
                return;
            case 21:
                SocialProofView socialProofView = (SocialProofView) obj2;
                socialProofView.f56412a.onNext(socialProofView.f56413b);
                return;
            case 22:
                TinyActionButton tinyActionButton = (TinyActionButton) obj2;
                Clause clause = tinyActionButton.f56456m;
                py0.c cVar = clause != null ? new py0.c(clause) : null;
                py0.f fVarN0 = or0.u.k(tinyActionButton).n0();
                Intrinsics.h(view);
                fVarN0.a(view, tinyActionButton, cVar);
                View.OnClickListener onClickListener = tinyActionButton.f56453h;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 23:
                ((com.revolut.core.ui_kit.views.e) obj2).f59057m.onNext(Unit.f186387a);
                return;
            case 24:
                ((BubbleTooltipView) obj2).f58365b.onNext(Unit.f186387a);
                return;
            case 25:
                Function0 function0 = ((mx0.m4) obj2).f209833n;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            case 26:
                ((mx0.q4) obj2).f209952b.onNext(Unit.f186387a);
                return;
            case 27:
                DialogHeaderView dialogHeaderView = (DialogHeaderView) obj2;
                DialogHeaderView.b bVar = dialogHeaderView.f58515m;
                if (bVar != null) {
                    dialogHeaderView.f58514l.onNext(bVar);
                    return;
                }
                return;
            case 28:
                ((ExpandableTextView) obj2).f58531g.onNext(Unit.f186387a);
                return;
            default:
                FloatingBottomBarView.h((FloatingBottomBarView) obj2);
                return;
        }
    }
}
