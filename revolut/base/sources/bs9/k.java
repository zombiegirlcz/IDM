package bs9;

import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.feature.payments.api.PaymentsToggles$ChatMentions;
import com.revolut.feature.payments.api.PaymentsToggles$GiphySendIdInsteadOfUrl;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.impl.ui_chat.chat.GroupChatScreen;
import com.revolut.feature.payments.groups.impl.ui_chat.chat.GroupChatScreenContract$ModalSteps;
import com.revolut.feature.payments.messaging.data.api.model.Bill;
import com.revolut.feature.payments.messaging.data.api.model.GroupChatItem;
import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import com.revolut.feature.payments.messaging.data.api.model.MessageType;
import com.revolut.feature.payments.messaging.data.api.model.Reminder;
import com.revolut.feature.payments.messaging.data.api.model.Settlement;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import cu9.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ks9.n0;
import mx0.a4;
import mx0.b4;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ GroupChatScreen f18112w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(GroupChatScreen groupChatScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f18112w = groupChatScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k(this.f18112w, continuation, 0);
                kVar.v = obj2;
                return kVar;
            case 1:
                k kVar2 = new k(this.f18112w, continuation, 1);
                kVar2.v = obj2;
                return kVar2;
            case 2:
                k kVar3 = new k(this.f18112w, continuation, 2);
                kVar3.v = obj2;
                return kVar3;
            case 3:
                k kVar4 = new k(this.f18112w, continuation, 3);
                kVar4.v = obj2;
                return kVar4;
            case 4:
                k kVar5 = new k(this.f18112w, continuation, 4);
                kVar5.v = obj2;
                return kVar5;
            case 5:
                k kVar6 = new k(this.f18112w, continuation, 5);
                kVar6.v = obj2;
                return kVar6;
            case 6:
                k kVar7 = new k(this.f18112w, continuation, 6);
                kVar7.v = obj2;
                return kVar7;
            case 7:
                k kVar8 = new k(this.f18112w, continuation, 7);
                kVar8.v = obj2;
                return kVar8;
            case 8:
                k kVar9 = new k(this.f18112w, continuation, 8);
                kVar9.v = obj2;
                return kVar9;
            case 9:
                k kVar10 = new k(this.f18112w, continuation, 9);
                kVar10.v = obj2;
                return kVar10;
            case 10:
                k kVar11 = new k(this.f18112w, continuation, 10);
                kVar11.v = obj2;
                return kVar11;
            case 11:
                k kVar12 = new k(this.f18112w, continuation, 11);
                kVar12.v = obj2;
                return kVar12;
            case 12:
                k kVar13 = new k(this.f18112w, continuation, 12);
                kVar13.v = obj2;
                return kVar13;
            case 13:
                k kVar14 = new k(this.f18112w, continuation, 13);
                kVar14.v = obj2;
                return kVar14;
            case 14:
                k kVar15 = new k(this.f18112w, continuation, 14);
                kVar15.v = obj2;
                return kVar15;
            case 15:
                k kVar16 = new k(this.f18112w, continuation, 15);
                kVar16.v = obj2;
                return kVar16;
            default:
                k kVar17 = new k(this.f18112w, continuation, 16);
                kVar17.v = obj2;
                return kVar17;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k) create((b4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((k) create((a4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((k) create((h9i.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((k) create((u) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((k) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((k) create((GroupChatItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((k) create((GroupChatItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((k) create((GroupChatItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((k) create((cu9.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((k) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((k) create((vr9.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((k) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((k) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((k) create((oq9.o) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((k) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((k) create((eu9.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k) create((du9.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        List list;
        Integer numA;
        Object sticker;
        Integer numA2;
        int i = this.u;
        int i2 = 6;
        Continuation continuation = null;
        GroupChatScreen groupChatScreen = this.f18112w;
        switch (i) {
            case 0:
                b4 action = (b4) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarF3 = groupChatScreen.d();
                Intrinsics.h(action);
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar2 = (com.revolut.feature.payments.groups.impl.ui_chat.chat.a) vVarF3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(action, "action");
                int i3 = z.f18140a[action.ordinal()];
                if (i3 == 1) {
                    aVar2.l2(new be7.s(aVar2, new MessageType.Text(aVar2.J2().f.f209576a), null, 26), new yi5.b(26));
                } else if (i3 == 2) {
                    aVar2.K2();
                } else if (i3 != 3) {
                    hx7.e.n(new IllegalStateException(a0.d.r(o0.f186429a.b(b4.class).m(), " is not handled")));
                } else {
                    aVar2.H2(aVar2.W, new e(16));
                    aVar2.T.onNext(Boolean.TRUE);
                }
                return Unit.f186387a;
            case 1:
                a4 input = (a4) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarF32 = groupChatScreen.d();
                Intrinsics.h(input);
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar4 = (com.revolut.feature.payments.groups.impl.ui_chat.chat.a) vVarF32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(input, "input");
                d8k.f fVar = aVar4.Q;
                List members = aVar4.J2().f18116a.d;
                do3.n nVar = aVar4.J2().f18123m;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(members, "members");
                if (!((jte.d) fVar.f112294a).c(PaymentsToggles$ChatMentions.f79146c) || nVar == null) {
                    list = zhm.f0.f322471a;
                } else {
                    int i5 = input.f209578c;
                    String str = input.f209576a;
                    if (input.f209577b == i5 && (numA = d8k.f.a(i5, str)) != null) {
                        int iIntValue = numA.intValue();
                        String strSubstring = str.substring(iIntValue + 1, d8k.f.b(iIntValue, str));
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        ArrayList arrayListC = oi0.d.c(members);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : arrayListC) {
                            oq9.o oVar = (oq9.o) obj3;
                            String strT = oi0.d.t(oVar);
                            if (strT != null && strT.length() > 0 && oi0.d.F(oVar, nVar) && (strSubstring.length() == 0 || kotlin.text.d0.J(oi0.d.p(oVar), strSubstring, true) || kotlin.text.d0.J(strT, strSubstring, true))) {
                                arrayList.add(obj3);
                            }
                        }
                        list = arrayList;
                    } else {
                        list = zhm.f0.f322471a;
                    }
                }
                aVar4.H2(aVar4.W, new bnj.n(16, input, list));
                return Unit.f186387a;
            case 2:
                h9i.c reaction = (h9i.c) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarF33 = groupChatScreen.d();
                Intrinsics.h(reaction);
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar6 = (com.revolut.feature.payments.groups.impl.ui_chat.chat.a) vVarF33;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(reaction, "reaction");
                if (!(reaction instanceof h9i.a)) {
                    if (!(reaction instanceof h9i.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sticker = new MessageType.Sticker(((h9i.b) reaction).f150329a);
                } else if (((jte.d) aVar6.F).c(PaymentsToggles$GiphySendIdInsteadOfUrl.f79149c)) {
                    h9i.a aVar7 = (h9i.a) reaction;
                    sticker = new MessageType.GiphyGifId(aVar7.f150327a, aVar7.f150328b);
                } else {
                    sticker = new MessageType.Gif(((h9i.a) reaction).f150327a);
                }
                aVar6.l2(new be7.s(aVar6, sticker, null, 26), new yi5.b(26));
                return Unit.f186387a;
            case 3:
                u longClickData = (u) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarF34 = groupChatScreen.d();
                Intrinsics.h(longClickData);
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar9 = (com.revolut.feature.payments.groups.impl.ui_chat.chat.a) vVarF34;
                aVar9.getClass();
                Intrinsics.checkNotNullParameter(longClickData, "clickData");
                ks9.e eVar = aVar9.u;
                PaymentGroup group = aVar9.J2().f18116a;
                ks9.s sVar = (ks9.s) eVar;
                sVar.getClass();
                Intrinsics.checkNotNullParameter(longClickData, "longClickData");
                Intrinsics.checkNotNullParameter(group, "group");
                GroupChatItem groupChatItem = longClickData.f18130b;
                if (c8g.a.C(groupChatItem)) {
                    sVar.T2(new fc0.e(sVar, longClickData, group, (Continuation) null), new yi5.b(27));
                } else if (groupChatItem instanceof MessageItem) {
                    sVar.f189374l.x(new rp0.y(((ju9.a) sVar.f189375m).a((MessageItem) groupChatItem), null, null, null, null, null, 1022));
                } else {
                    if (!(groupChatItem instanceof Reminder) && !(groupChatItem instanceof Bill) && !(groupChatItem instanceof Settlement)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.DEBUG, "GroupMessageActionsExtensionImpl", "No action for " + groupChatItem, null, null, 16);
                }
                return Unit.f186387a;
            case 4:
                Boolean bool = (Boolean) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (bool.booleanValue()) {
                    KProperty[] kPropertyArr = GroupChatScreen.j0;
                    groupChatScreen.e3().f11257g.c0();
                }
                return Unit.f186387a;
            case 5:
                GroupChatItem chatItem = (GroupChatItem) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarF35 = groupChatScreen.d();
                Intrinsics.h(chatItem);
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar12 = (com.revolut.feature.payments.groups.impl.ui_chat.chat.a) vVarF35;
                aVar12.getClass();
                Intrinsics.checkNotNullParameter(chatItem, "chatItem");
                aVar12.l2(new g0(aVar12, chatItem, null), new yi5.b(26));
                return Unit.f186387a;
            case 6:
                GroupChatItem parcel = (GroupChatItem) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarF36 = groupChatScreen.d();
                Intrinsics.h(parcel);
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar14 = (com.revolut.feature.payments.groups.impl.ui_chat.chat.a) vVarF36;
                aVar14.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ks9.f fVar2 = aVar14.I;
                PaymentGroup group2 = ((o) ((j2) aVar14.W.f22677a).getValue()).f18116a;
                ks9.v vVar = (ks9.v) fVar2;
                vVar.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Intrinsics.checkNotNullParameter(group2, "group");
                vVar.T2(new knd.h0(vVar, parcel, group2, null, 7), new yi5.b(27));
                return Unit.f186387a;
            case 7:
                GroupChatItem chatItem2 = (GroupChatItem) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarF37 = groupChatScreen.d();
                Intrinsics.h(chatItem2);
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar16 = (com.revolut.feature.payments.groups.impl.ui_chat.chat.a) vVarF37;
                aVar16.getClass();
                Intrinsics.checkNotNullParameter(chatItem2, "groupChatItem");
                ks9.e eVar2 = aVar16.u;
                PaymentGroup group3 = aVar16.J2().f18116a;
                ks9.s sVar2 = (ks9.s) eVar2;
                sVar2.getClass();
                Intrinsics.checkNotNullParameter(chatItem2, "chatItem");
                Intrinsics.checkNotNullParameter(group3, "group");
                if (c8g.a.C(chatItem2)) {
                    sVar2.T2(new km2.n(sVar2, group3, chatItem2, (Continuation) null, 5), new yi5.b(27));
                }
                return Unit.f186387a;
            case 8:
                cu9.b parcel2 = (cu9.b) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarF38 = groupChatScreen.d();
                Intrinsics.h(parcel2);
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar18 = (com.revolut.feature.payments.groups.impl.ui_chat.chat.a) vVarF38;
                aVar18.getClass();
                Intrinsics.checkNotNullParameter(parcel2, "parcel");
                ks9.s sVar3 = (ks9.s) aVar18.u;
                sVar3.getClass();
                Intrinsics.checkNotNullParameter(parcel2, "parcel");
                if (parcel2 instanceof b.a) {
                    sVar3.A2(new ExternalDestination.Browser("https://revolut.com/get", null));
                } else if (parcel2 instanceof cu9.m) {
                    sVar3.T2(new kq5.d(sVar3, parcel2, continuation, 7), new yi5.b(27));
                } else {
                    Unit unit = Unit.f186387a;
                }
                return Unit.f186387a;
            case 9:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarF39 = groupChatScreen.d();
                Intrinsics.h(clickData);
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar20 = (com.revolut.feature.payments.groups.impl.ui_chat.chat.a) vVarF39;
                aVar20.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                aVar20.P.Z2(clickData);
                return Unit.f186387a;
            case 10:
                vr9.j parcel3 = (vr9.j) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarF310 = groupChatScreen.d();
                Intrinsics.h(parcel3);
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar22 = (com.revolut.feature.payments.groups.impl.ui_chat.chat.a) vVarF310;
                aVar22.getClass();
                Intrinsics.checkNotNullParameter(parcel3, "parcel");
                ((n0) aVar22.f79348r).e3(parcel3, aVar22.J2().f18116a);
                return Unit.f186387a;
            case 11:
                g6 selectedData = (g6) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarF311 = groupChatScreen.d();
                Intrinsics.h(selectedData);
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar24 = (com.revolut.feature.payments.groups.impl.ui_chat.chat.a) vVarF311;
                aVar24.getClass();
                Intrinsics.checkNotNullParameter(selectedData, "selectedData");
                aVar24.l2(new be7.s(aVar24, selectedData, null, 25), new yi5.b(26));
                return Unit.f186387a;
            case 12:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarF312 = groupChatScreen.d();
                Intrinsics.h(clickData2);
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar26 = (com.revolut.feature.payments.groups.impl.ui_chat.chat.a) vVarF312;
                aVar26.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                Object obj4 = clickData2.d;
                if (obj4 instanceof fs9.h) {
                    PaymentGroup paymentGroup = aVar26.J2().f18116a;
                    oki.h.v2(aVar26.X, new GroupChatScreenContract$ModalSteps.Qr(paymentGroup.f79287c, paymentGroup.f79286b, ((fs9.h) obj4).f137660a), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
                } else {
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, "GroupChatScreenModel", a0.d.m(obj4, "Unknown parcel "), null, null, 16);
                }
                return Unit.f186387a;
            case 13:
                oq9.o member = (oq9.o) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarF313 = groupChatScreen.d();
                Intrinsics.h(member);
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar28 = (com.revolut.feature.payments.groups.impl.ui_chat.chat.a) vVarF313;
                aVar28.getClass();
                Intrinsics.checkNotNullParameter(member, "member");
                d8k.f fVar3 = aVar28.Q;
                a4 input2 = aVar28.J2().f;
                fVar3.getClass();
                Intrinsics.checkNotNullParameter(input2, "input");
                Intrinsics.checkNotNullParameter(member, "member");
                int i6 = input2.f209578c;
                String str2 = input2.f209576a;
                if (input2.f209577b == i6 && (numA2 = d8k.f.a(i6, str2)) != null) {
                    int iIntValue2 = numA2.intValue();
                    String strT2 = oi0.d.t(member);
                    if (strT2 != null) {
                        String strP = p.a.p("@", strT2, " ");
                        int iB = d8k.f.b(iIntValue2, str2);
                        if (iB < str2.length()) {
                            iB++;
                        }
                        String string = kotlin.text.d0.j0(str2, iIntValue2, iB, strP).toString();
                        int length = strP.length() + iIntValue2;
                        input2 = new a4(string, length, length);
                    }
                }
                aVar28.H2(aVar28.W, new bq7.j(input2, 6));
                return Unit.f186387a;
            case 14:
                String messageId = (String) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gu9.a aVar30 = groupChatScreen.X;
                aVar30.getClass();
                Intrinsics.checkNotNullParameter(messageId, "messageId");
                aVar30.f146897b = messageId;
                return Unit.f186387a;
            case 15:
                eu9.e menuItem = (eu9.e) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarF314 = groupChatScreen.d();
                Intrinsics.h(menuItem);
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar32 = (com.revolut.feature.payments.groups.impl.ui_chat.chat.a) vVarF314;
                aVar32.getClass();
                Intrinsics.checkNotNullParameter(menuItem, "parcel");
                ks9.s sVar4 = (ks9.s) aVar32.u;
                sVar4.getClass();
                Intrinsics.checkNotNullParameter(menuItem, "menuItem");
                sVar4.T2(new kq5.d(menuItem, sVar4, continuation, i2), new yi5.b(27));
                return Unit.f186387a;
            default:
                du9.a option = (du9.a) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarF315 = groupChatScreen.d();
                Intrinsics.h(option);
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar34 = (com.revolut.feature.payments.groups.impl.ui_chat.chat.a) vVarF315;
                aVar34.getClass();
                Intrinsics.checkNotNullParameter(option, "option");
                ks9.a aVar35 = aVar34.z;
                aVar35.getClass();
                Intrinsics.checkNotNullParameter(option, "option");
                aVar35.T2(new kq5.d(aVar35, option, continuation, 4), new yi5.b(27));
                return Unit.f186387a;
        }
    }
}
