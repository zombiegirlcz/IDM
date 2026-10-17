package com.revolut.chat.ui.transcript;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.chat.ui.transcript.ChatTranscriptPeriodCalendarBottomSheetController;
import com.revolut.chat_core.R$layout;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.calendar.CalendarPickerRangeView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import vc.s;
import w50.b;
import w50.c;
import w50.d;
import w50.f;
import w50.g;
import w50.i;
import xki.e;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/ui/transcript/ChatTranscriptPeriodCalendarBottomSheetController;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lw50/c;", "Lcli/w;", "Lw50/d;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatTranscriptPeriodCalendarBottomSheetController extends SimpleViewController<c> implements w {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(ChatTranscriptPeriodCalendarBottomSheetController.class, "binding", "getBinding()Lcom/revolut/chat_core/databinding/ScreenChatTranscriptPeriodCalendarBottomSheetBinding;", 0))};
    public final b N;
    public final int O;
    public final h P;
    public boolean Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public ChatTranscriptPeriodCalendarBottomSheetController(b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        this.O = R$layout.screen_chat_transcript_period_calendar_bottom_sheet;
        this.P = s.t(this, f.f);
        final int i = 0;
        this.R = te0.w.y0(new Function0(this) { // from class: w50.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatTranscriptPeriodCalendarBottomSheetController f294658b;

            {
                this.f294658b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ChatTranscriptPeriodCalendarBottomSheetController chatTranscriptPeriodCalendarBottomSheetController = this.f294658b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ChatTranscriptPeriodCalendarBottomSheetController.U;
                        phm.a aVar = (phm.a) ue0.e.j(chatTranscriptPeriodCalendarBottomSheetController.m2()).a().get(h30.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h30.a.class, " is not found"));
                        }
                        h30.n nVar = ((h30.n) ((h30.a) aVar2.b())).f148930w;
                        b bVar = chatTranscriptPeriodCalendarBottomSheetController.N;
                        bVar.getClass();
                        return new h30.s(nVar, bVar);
                    case 1:
                        KProperty[] kPropertyArr2 = ChatTranscriptPeriodCalendarBottomSheetController.U;
                        h30.s sVar = (h30.s) chatTranscriptPeriodCalendarBottomSheetController.R.getValue();
                        j jVar = (j) sVar.f148953b.get();
                        j jVar2 = (j) sVar.f148953b.get();
                        b inputData2 = sVar.f148952a;
                        x50.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(inputData2, "inputData");
                        LocalDate localDate = inputData2.f294652b;
                        vc.s.k(localDate);
                        return new i(jVar, new kxk.o(jVar2, localDate));
                    default:
                        KProperty[] kPropertyArr3 = ChatTranscriptPeriodCalendarBottomSheetController.U;
                        return n14.e.a(chatTranscriptPeriodCalendarBottomSheetController, (i) chatTranscriptPeriodCalendarBottomSheetController.S.getValue());
                }
            }
        });
        final int i2 = 1;
        this.S = te0.w.y0(new Function0(this) { // from class: w50.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatTranscriptPeriodCalendarBottomSheetController f294658b;

            {
                this.f294658b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ChatTranscriptPeriodCalendarBottomSheetController chatTranscriptPeriodCalendarBottomSheetController = this.f294658b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ChatTranscriptPeriodCalendarBottomSheetController.U;
                        phm.a aVar = (phm.a) ue0.e.j(chatTranscriptPeriodCalendarBottomSheetController.m2()).a().get(h30.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h30.a.class, " is not found"));
                        }
                        h30.n nVar = ((h30.n) ((h30.a) aVar2.b())).f148930w;
                        b bVar = chatTranscriptPeriodCalendarBottomSheetController.N;
                        bVar.getClass();
                        return new h30.s(nVar, bVar);
                    case 1:
                        KProperty[] kPropertyArr2 = ChatTranscriptPeriodCalendarBottomSheetController.U;
                        h30.s sVar = (h30.s) chatTranscriptPeriodCalendarBottomSheetController.R.getValue();
                        j jVar = (j) sVar.f148953b.get();
                        j jVar2 = (j) sVar.f148953b.get();
                        b inputData2 = sVar.f148952a;
                        x50.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(inputData2, "inputData");
                        LocalDate localDate = inputData2.f294652b;
                        vc.s.k(localDate);
                        return new i(jVar, new kxk.o(jVar2, localDate));
                    default:
                        KProperty[] kPropertyArr3 = ChatTranscriptPeriodCalendarBottomSheetController.U;
                        return n14.e.a(chatTranscriptPeriodCalendarBottomSheetController, (i) chatTranscriptPeriodCalendarBottomSheetController.S.getValue());
                }
            }
        });
        final int i3 = 2;
        this.T = te0.w.y0(new Function0(this) { // from class: w50.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatTranscriptPeriodCalendarBottomSheetController f294658b;

            {
                this.f294658b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ChatTranscriptPeriodCalendarBottomSheetController chatTranscriptPeriodCalendarBottomSheetController = this.f294658b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ChatTranscriptPeriodCalendarBottomSheetController.U;
                        phm.a aVar = (phm.a) ue0.e.j(chatTranscriptPeriodCalendarBottomSheetController.m2()).a().get(h30.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h30.a.class, " is not found"));
                        }
                        h30.n nVar = ((h30.n) ((h30.a) aVar2.b())).f148930w;
                        b bVar = chatTranscriptPeriodCalendarBottomSheetController.N;
                        bVar.getClass();
                        return new h30.s(nVar, bVar);
                    case 1:
                        KProperty[] kPropertyArr2 = ChatTranscriptPeriodCalendarBottomSheetController.U;
                        h30.s sVar = (h30.s) chatTranscriptPeriodCalendarBottomSheetController.R.getValue();
                        j jVar = (j) sVar.f148953b.get();
                        j jVar2 = (j) sVar.f148953b.get();
                        b inputData2 = sVar.f148952a;
                        x50.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(inputData2, "inputData");
                        LocalDate localDate = inputData2.f294652b;
                        vc.s.k(localDate);
                        return new i(jVar, new kxk.o(jVar2, localDate));
                    default:
                        KProperty[] kPropertyArr3 = ChatTranscriptPeriodCalendarBottomSheetController.U;
                        return n14.e.a(chatTranscriptPeriodCalendarBottomSheetController, (i) chatTranscriptPeriodCalendarBottomSheetController.S.getValue());
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        CalendarPickerRangeView chatTranscriptPeriodCalendarCalendar = d3().f1518c;
        Intrinsics.checkNotNullExpressionValue(chatTranscriptPeriodCalendarCalendar, "chatTranscriptPeriodCalendarCalendar");
        CalendarPickerRangeView.setCalendarData$default(chatTranscriptPeriodCalendarCalendar, uiState.f294654a, uiState.f294655b, null, null, uiState.f294656c, uiState.d, 12, null);
        d3().f1517b.setEnabled(uiState.e);
        if (this.Q) {
            return;
        }
        this.Q = true;
        d3().f1518c.c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h30.s) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.chat_transcript_select_period, null, null, 14);
        NavBarWithToolbar chatTranscriptPeriodCalendarNavBar = d3().d;
        Intrinsics.checkNotNullExpressionValue(chatTranscriptPeriodCalendarNavBar, "chatTranscriptPeriodCalendarNavBar");
        chatTranscriptPeriodCalendarNavBar.setToolbarTitle(textLocalisedClause);
        chatTranscriptPeriodCalendarNavBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        chatTranscriptPeriodCalendarNavBar.setAlwaysExpanded(true);
        chatTranscriptPeriodCalendarNavBar.j0(false);
        d3().f1517b.setText(new TextLocalisedClause(R$string.chat_transcript_confirm, null, null, 14));
        d3().f1517b.setEnabled(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        a.g2(this, rd0.e.b(d3().f1518c.b()), null, new g(this, (Continuation) null, 0), 3);
        a.g2(this, rd0.e.b(d3().f1517b.o), null, new w50.h(this, null, 0), 3);
        a.g2(this, rd0.e.b(d3().d.f59410q), null, new w50.h(this, null, 1), 3);
    }

    public final a60.e d3() {
        ViewBinding value = this.P.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (a60.e) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, oki.f
    public final pki.a k() {
        return (a0) this.T.getValue();
    }
}
