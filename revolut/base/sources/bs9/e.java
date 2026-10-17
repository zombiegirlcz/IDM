package bs9;

import android.content.Context;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.payments.groups.impl.ui_chat.chat.GroupChatScreen;
import com.revolut.feature.payments.groups.impl.ui_new.details_bill.GroupDetailsBillScreen;
import com.revolut.feature.payments.messaging.data.api.model.GroupChatItem;
import com.revolut.recyclerkit.layoutmanager.UIKitLinearLayoutManager;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.um0;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import mx0.a4;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18098a;

    public /* synthetic */ e(int i) {
        this.f18098a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it8) {
        switch (this.f18098a) {
            case 0:
                RowDelegate.Model it9 = (RowDelegate.Model) it8;
                KProperty[] kPropertyArr = GroupChatScreen.j0;
                Intrinsics.checkNotNullParameter(it9, "it");
                Object obj2 = it9.u;
                if (obj2 instanceof vr9.j) {
                    return (vr9.j) obj2;
                }
                return null;
            case 1:
                TextDelegate.Model model = (TextDelegate.Model) it8;
                KProperty[] kPropertyArr2 = GroupChatScreen.j0;
                Intrinsics.checkNotNullParameter(model, "model");
                return Boolean.valueOf(Intrinsics.f(model.f53531a, "CHAT_PRIVACY_DISCLAIMER_LIST_ID"));
            case 2:
                RowDelegate.Model it10 = (RowDelegate.Model) it8;
                KProperty[] kPropertyArr3 = GroupChatScreen.j0;
                Intrinsics.checkNotNullParameter(it10, "it");
                Object obj3 = it10.u;
                if (obj3 instanceof oq9.o) {
                    return (oq9.o) obj3;
                }
                return null;
            case 3:
                RowDelegate.Model it11 = (RowDelegate.Model) it8;
                KProperty[] kPropertyArr4 = GroupChatScreen.j0;
                Intrinsics.checkNotNullParameter(it11, "it");
                Object obj4 = it11.u;
                if (obj4 instanceof du9.a) {
                    return (du9.a) obj4;
                }
                return null;
            case 4:
                zx0.i it12 = (zx0.i) it8;
                KProperty[] kPropertyArr5 = GroupChatScreen.j0;
                Intrinsics.checkNotNullParameter(it12, "it");
                Object obj5 = it12.f326000g;
                if (obj5 instanceof h9i.c) {
                    return (h9i.c) obj5;
                }
                return null;
            case 5:
                KProperty[] kPropertyArr6 = GroupChatScreen.j0;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(((qv0.p) it8).getD() instanceof GroupChatItem);
            case 6:
                KProperty[] kPropertyArr7 = GroupChatScreen.j0;
                Intrinsics.checkNotNullParameter(it8, "it");
                String f52269a = ((koi.j) it8).getF53293a();
                Object f52276m = ((qv0.p) it8).getD();
                Intrinsics.i(f52276m, "null cannot be cast to non-null type com.revolut.feature.payments.messaging.data.api.model.GroupChatItem");
                return new u(f52269a, (GroupChatItem) f52276m);
            case 7:
                KProperty[] kPropertyArr8 = GroupChatScreen.j0;
                Object f52276m2 = ((qv0.p) it8).getD();
                if (f52276m2 instanceof GroupChatItem) {
                    return (GroupChatItem) f52276m2;
                }
                return null;
            case 8:
                Context it13 = (Context) it8;
                KProperty[] kPropertyArr9 = GroupChatScreen.j0;
                Intrinsics.checkNotNullParameter(it13, "it");
                UIKitLinearLayoutManager uIKitLinearLayoutManager = new UIKitLinearLayoutManager(it13);
                uIKitLinearLayoutManager.f98539c = true;
                uIKitLinearLayoutManager.setReverseLayout(true);
                return uIKitLinearLayoutManager;
            case 9:
                RowDelegate.Model it14 = (RowDelegate.Model) it8;
                KProperty[] kPropertyArr10 = GroupChatScreen.j0;
                Intrinsics.checkNotNullParameter(it14, "it");
                Object obj6 = it14.u;
                if (obj6 instanceof eu9.e) {
                    return (eu9.e) obj6;
                }
                return null;
            case 10:
                KProperty[] kPropertyArr11 = GroupChatScreen.j0;
                Object f52276m3 = ((qv0.p) it8).getD();
                if (f52276m3 instanceof GroupChatItem) {
                    return (GroupChatItem) f52276m3;
                }
                return null;
            case 11:
                KProperty[] kPropertyArr12 = GroupChatScreen.j0;
                Object f52276m4 = ((qv0.p) it8).getD();
                if (f52276m4 instanceof GroupChatItem) {
                    return (GroupChatItem) f52276m4;
                }
                return null;
            case 12:
                ChatBubbleDelegate.ButtonModel it15 = (ChatBubbleDelegate.ButtonModel) it8;
                KProperty[] kPropertyArr13 = GroupChatScreen.j0;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(it15.d instanceof cu9.b);
            case 13:
                Throwable it16 = (Throwable) it8;
                Intrinsics.checkNotNullParameter(it16, "it");
                return new Data(null, it16, false, 5, null);
            case 14:
                o it17 = (o) it8;
                Intrinsics.checkNotNullParameter(it17, "it");
                return new yhm.r(Boolean.valueOf(it17.e), it17.f.f209576a, it17.f18121j.getContent());
            case 15:
                o update = (o) it8;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return o.a(update, null, null, false, false, false, null, cs9.b.SOFT_KEYBOARD, 0, null, null, null, 8127);
            case 16:
                o update2 = (o) it8;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return o.a(update2, null, null, false, false, false, null, cs9.b.REACTIONS_KEYBOARD, 0, null, null, null, 8127);
            case 17:
                return o.a((o) it8, null, null, false, false, false, null, cs9.b.REACTIONS_KEYBOARD, 0, null, null, null, 8127);
            case 18:
                return o.a((o) it8, null, null, false, false, false, null, cs9.b.REACTIONS_KEYBOARD, 0, null, null, null, 8127);
            case 19:
                m70.a.c(t0.f186434a);
                return o.a((o) it8, null, null, false, false, false, new a4("", 0, 0), null, 0, null, null, null, 8159);
            case 20:
                bse.g update3 = (bse.g) it8;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return bse.g.a(update3, null, !update3.f18183c, 3);
            case 21:
                Intrinsics.checkNotNullParameter((Function0) it8, "<unused var>");
                gu guVar = new gu("SUBHEADER_LOADING_LIST_ID_1", 0, 0, 30);
                nb0 nb0Var = pb0.Companion;
                pb0 pb0VarB = nb0.b(nb0Var, "ROW_LOADING_LIST_ID_1", false, 0, false, 30);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                gu guVar2 = new gu("SUBHEADER_LOADING_LIST_ID_2", 0, 0, 30);
                pb0 pb0VarB2 = nb0.b(nb0Var, "ROW_LOADING_LIST_ID_2", false, 0, false, 30);
                yp0.b.l(pb0VarB2, 0, 0, 0, 0, null, false, 63);
                return zhm.v.k(guVar, pb0VarB, guVar2, pb0VarB2);
            case 22:
                Function0 getDefaultLoadingItems = (Function0) it8;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 23:
                Function0 getDefaultLoadingItems2 = (Function0) it8;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems2.invoke();
            case 24:
                Intrinsics.checkNotNullParameter((Function0) it8, "it");
                return new bt9.n(bt9.d.b(), null);
            case 25:
                ip0.y it18 = (ip0.y) it8;
                KProperty[] kPropertyArr14 = GroupDetailsBillScreen.f79404k0;
                Intrinsics.checkNotNullParameter(it18, "it");
                Object obj7 = it18.f167226b.f58324n;
                if (obj7 instanceof bt9.b) {
                    return (bt9.b) obj7;
                }
                return null;
            case 26:
                RowDelegate.Model it19 = (RowDelegate.Model) it8;
                KProperty[] kPropertyArr15 = GroupDetailsBillScreen.f79404k0;
                Intrinsics.checkNotNullParameter(it19, "it");
                Object obj8 = it19.u;
                if (obj8 instanceof oq9.j) {
                    return (oq9.j) obj8;
                }
                return null;
            case 27:
                um0 it20 = (um0) it8;
                KProperty[] kPropertyArr16 = GroupDetailsBillScreen.f79404k0;
                Intrinsics.checkNotNullParameter(it20, "it");
                return Boolean.valueOf(Intrinsics.f(it20.f166695a, "ID_BOTTOM_DIALOG_ACTION_REMOVE"));
            case 28:
                um0 it21 = (um0) it8;
                KProperty[] kPropertyArr17 = GroupDetailsBillScreen.f79404k0;
                Intrinsics.checkNotNullParameter(it21, "it");
                return Boolean.valueOf(Intrinsics.f(it21.f166695a, "ID_BOTTOM_DIALOG_ACTION_REMOVE"));
            default:
                return bt9.j.a((bt9.j) it8, null, true, 1);
        }
    }
}
