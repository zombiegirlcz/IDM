package zx0;

import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.documents.CreditApplicationDocumentsScreenContract$Configuration;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.PeerToPeerChatScreen;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.h0;
import java.util.List;
import kotlin.Function;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zmj.p0;
import zul.l0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b implements kfm.p, kfm.g, kfm.o, kfm.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f325980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f325981b;

    public /* synthetic */ b(Function function, int i) {
        this.f325980a = i;
        this.f325981b = function;
    }

    @Override // kfm.h
    public Object a(Object p0, Object p17, Object p2) {
        p0 p0Var = (p0) this.f325981b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        return (AccountWidgetItemModel.EmptyStateStories) p0Var.invoke(p0, p17, p2);
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f325980a;
        a aVar = (a) this.f325981b;
        switch (i) {
            case 1:
                ReactionsKeyboardView.Companion companion = ReactionsKeyboardView.INSTANCE;
                aVar.invoke(obj2);
                break;
            default:
                ReactionsKeyboardView.Companion companion2 = ReactionsKeyboardView.INSTANCE;
                aVar.invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f325980a;
        Function function = this.f325981b;
        switch (i) {
            case 3:
                ReactionsKeyboardView.Companion companion = ReactionsKeyboardView.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((zp5.f) function).invoke(p0);
            case 4:
            case 13:
            case 17:
            default:
                return (CreditApplicationDocumentsScreenContract$Configuration) ((zrd.q) function).invoke(p0);
            case 5:
                ReactionsKeyboardView.Companion companion2 = ReactionsKeyboardView.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) ((a) function).invoke(p0);
            case 6:
                ReactionsKeyboardView.Companion companion3 = ReactionsKeyboardView.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((g) function).invoke(p0);
            case 7:
                ReactionsKeyboardView.Companion companion4 = ReactionsKeyboardView.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((ua2.r) function).invoke(p0);
            case 8:
                ReactionsKeyboardView.Companion companion5 = ReactionsKeyboardView.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (yhm.r) ((zp5.f) function).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((zp5.f) function).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((l0) function).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((zx7.a) function).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((com.revolut.feature.insurance_pet.impl.ui.cancellation.a) function).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((zx7.m) function).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((yrk.e) function).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((zp5.f) function).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (AccountWidgetItemModel.EmptyStateStories) ((l0) function).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (AccountWidgetItemModel.EmptyStateStories) ((l0) function).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((zp5.f) function).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((zy5.b) function).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((zy5.b) function).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((l0) function).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((zy5.c) function).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((zyc.x) function).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((zyc.x) function).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((zp5.f) function).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f325980a;
        Function function = this.f325981b;
        switch (i) {
            case 0:
                ReactionsKeyboardView.Companion companion = ReactionsKeyboardView.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((l0) function).invoke(p0)).booleanValue();
            case 2:
                ReactionsKeyboardView.Companion companion2 = ReactionsKeyboardView.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((l0) function).invoke(p0)).booleanValue();
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((l0) function).invoke(p0)).booleanValue();
            default:
                KProperty[] kPropertyArr = PeerToPeerChatScreen.l0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((zz9.a) function).invoke(p0)).booleanValue();
        }
    }
}
