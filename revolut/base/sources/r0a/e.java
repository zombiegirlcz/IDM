package r0a;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.feature.apm.core.models.recipients.ApmBeneficiary;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.apm.core.models.recipients.PayIdBeneficiary;
import com.revolut.feature.apm.core.models.recipients.PixBeneficiary;
import com.revolut.feature.apm.payid.api.navigation.PayIdDestination;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawLimits;
import com.revolut.feature.payments.messaging.data.api.model.ChatItem;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.screen.TransferOnlyChatScreen;
import com.revolut.feature.pix.api.navigation.PixAreaNavigation$Destination;
import com.revolut.feature.push_to_card.api.feature_config.PushToCardAddCardFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationDestination;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import vkm.j2;
import zh9.u0;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransferOnlyChatScreen f250728w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(TransferOnlyChatScreen transferOnlyChatScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f250728w = transferOnlyChatScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f250728w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f250728w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            case 2:
                e eVar3 = new e(this.f250728w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
            case 3:
                e eVar4 = new e(this.f250728w, continuation, 3);
                eVar4.v = obj2;
                return eVar4;
            case 4:
                e eVar5 = new e(this.f250728w, continuation, 4);
                eVar5.v = obj2;
                return eVar5;
            default:
                e eVar6 = new e(this.f250728w, continuation, 5);
                eVar6.v = obj2;
                return eVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((e) create((AppTipUIModel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        NaviCommand featureCommand;
        wi0.b bVarA;
        xi0.b bVarA2;
        KompotDestination pixAreaNavigation$Destination;
        int i = this.u;
        TransferOnlyChatScreen transferOnlyChatScreen = this.f250728w;
        switch (i) {
            case 0:
                ChatItem chatItem = (ChatItem) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarD = transferOnlyChatScreen.d();
                Intrinsics.h(chatItem);
                y yVar = (y) oVarD;
                yVar.getClass();
                Intrinsics.checkNotNullParameter(chatItem, "chatItem");
                m0a.g gVar = yVar.f250758q;
                ChatTransferRecipient chatTransferRecipient = ((i) ((j2) yVar.E.f22677a).getValue()).f250735b;
                m0a.k kVar = (m0a.k) gVar;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(chatTransferRecipient, "chatTransferRecipient");
                Intrinsics.checkNotNullParameter(chatItem, "chatItem");
                kVar.V2(new m0a.j(kVar, chatItem, chatTransferRecipient, (Continuation) null), new yi5.b(29));
                return Unit.f186387a;
            case 1:
                com.revolut.core.ui_kit.delegates.t data = (com.revolut.core.ui_kit.delegates.t) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarD2 = transferOnlyChatScreen.d();
                Intrinsics.h(data);
                y yVar2 = (y) oVarD2;
                yVar2.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                m0a.g gVar2 = yVar2.f250758q;
                ChatTransferRecipient contact = ((i) ((j2) yVar2.E.f22677a).getValue()).f250735b;
                m0a.k kVar2 = (m0a.k) gVar2;
                kVar2.getClass();
                Intrinsics.checkNotNullParameter(contact, "chatTransferRecipient");
                Intrinsics.checkNotNullParameter(data, "data");
                ActionWidgetDelegate.Model model = data.f54722b;
                if (Intrinsics.f(model.f51590a, "OUTDATED_ITEM_ID")) {
                    kVar2.f201124l.getClass();
                    Intrinsics.checkNotNullParameter(contact, "contact");
                    if (contact instanceof ChatTransferRecipient.BeneficiaryRecipient) {
                        f5j.a aVar3 = ((ChatTransferRecipient.BeneficiaryRecipient) contact).f79716a;
                        String strB = f5j.c.b(aVar3);
                        if (strB != null) {
                            wi0.b.Companion.getClass();
                            bVarA = wi0.a.a(strB);
                        } else {
                            bVarA = null;
                        }
                        String str = aVar3.f132337n;
                        if (str != null) {
                            xi0.b.Companion.getClass();
                            bVarA2 = xi0.a.a(str);
                        } else {
                            bVarA2 = null;
                        }
                        featureCommand = u0.f(new BeneficiaryCreationDestination((bVarA == null || bVarA2 == null) ? new BeneficiaryCreationKompotInputData.CreationConfiguration.DefaultCreation(null, null, null, null, null, null, y0.b(new BeneficiaryCreationKompotInputData.CreationConfiguration.SuggestionBannerContext(f5j.l.BENEFICIARY)), 60) : new BeneficiaryCreationKompotInputData.CreationConfiguration.LockedCountryCurrency(bVarA, bVarA2, null, y0.b(new BeneficiaryCreationKompotInputData.CreationConfiguration.SuggestionBannerContext(f5j.l.INTERNATIONAL_BENEFICIARY)))));
                    } else if (contact instanceof ChatTransferRecipient.CardRecipient) {
                        featureCommand = new FeatureCommand(new PushToCardAddCardFeatureConfig(0));
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException(a0.d.l(contact.getClass(), "Outdated recipient command is not supported for "));
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        featureCommand = DummyCommand.f98635a;
                    }
                    kVar2.A2(u0.b(featureCommand));
                } else {
                    NotImplementedError notImplementedError = new NotImplementedError(p.a.p("Implementation for ", model.f51590a, " click handling is not done"));
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.WARNING, null, null, notImplementedError, h0Var2);
                }
                return Unit.f186387a;
            case 2:
                ty0.a data2 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarD3 = transferOnlyChatScreen.d();
                Intrinsics.h(data2);
                y yVar3 = (y) oVarD3;
                yVar3.getClass();
                Intrinsics.checkNotNullParameter(data2, "data");
                m0a.g gVar3 = yVar3.f250758q;
                ChatTransferRecipient recipient = ((i) ((j2) yVar3.E.f22677a).getValue()).f250735b;
                m0a.k kVar3 = (m0a.k) gVar3;
                kVar3.getClass();
                Intrinsics.checkNotNullParameter(recipient, "chatTransferRecipient");
                Intrinsics.checkNotNullParameter(data2, "data");
                if (Intrinsics.f(data2.f275445a, "APM_DISCLAIMER_REGISTER_CLAUSE")) {
                    q0a.b bVar = kVar3.f201124l;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(recipient, "recipient");
                    if (!(recipient instanceof ChatTransferRecipient.ApmTransferRecipient)) {
                        throw new IllegalStateException(("Recipient is not supported, type=" + o0.f186429a.b(recipient.getClass()).m() + ", name=" + recipient.getName()).toString());
                    }
                    oy1.b bVar2 = bVar.f241222c;
                    ApmRecipient recipient2 = ((ChatTransferRecipient.ApmTransferRecipient) recipient).f79715a;
                    Intrinsics.checkNotNullParameter(recipient2, "recipient");
                    if (recipient2 instanceof ApmContact) {
                        pixAreaNavigation$Destination = bVar2.e((ApmContact) recipient2).l(null);
                    } else {
                        if (!(recipient2 instanceof ApmBeneficiary)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ApmBeneficiary apmBeneficiary = (ApmBeneficiary) recipient2;
                        if (apmBeneficiary instanceof PayIdBeneficiary) {
                            pixAreaNavigation$Destination = PayIdDestination.f62693a;
                        } else {
                            if (!(apmBeneficiary instanceof PixBeneficiary)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            pixAreaNavigation$Destination = new PixAreaNavigation$Destination(0);
                        }
                    }
                    kVar3.A2(u0.b(u0.e(pixAreaNavigation$Destination)));
                }
                return Unit.f186387a;
            case 3:
                ty0.a data3 = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarD4 = transferOnlyChatScreen.d();
                Intrinsics.h(data3);
                y yVar4 = (y) oVarD4;
                yVar4.getClass();
                Intrinsics.checkNotNullParameter(data3, "data");
                m0a.l lVar = yVar4.v;
                ChatTransferRecipient chatTransferRecipient2 = ((i) ((j2) yVar4.E.f22677a).getValue()).f250735b;
                m0a.n nVar = (m0a.n) lVar;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(chatTransferRecipient2, "chatTransferRecipient");
                Intrinsics.checkNotNullParameter(data3, "data");
                if (Intrinsics.f(data3.f275445a, "TRANSFER_ONLY_CRYPTO_ADDRESS_VIEW_LIMITS_CLICK_ID")) {
                    ChatTransferRecipient.CryptoAddressRecipient cryptoAddressRecipient = chatTransferRecipient2 instanceof ChatTransferRecipient.CryptoAddressRecipient ? (ChatTransferRecipient.CryptoAddressRecipient) chatTransferRecipient2 : null;
                    CryptoAddress cryptoAddress = cryptoAddressRecipient != null ? cryptoAddressRecipient.f79721a : null;
                    CryptoWithdrawLimits cryptoWithdrawLimits = cryptoAddress != null ? cryptoAddress.f71067n : null;
                    if (cryptoAddress != null && cryptoWithdrawLimits != null) {
                        nVar.V2(new lr.l(nVar, cryptoAddress, cryptoWithdrawLimits, (Continuation) null, 9), new yi5.b(29));
                    }
                }
                return Unit.f186387a;
            case 4:
                AppTipUIModel appTipUIModel = (AppTipUIModel) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarD5 = transferOnlyChatScreen.d();
                Object obj3 = appTipUIModel.i;
                y yVar5 = (y) oVarD5;
                if (obj3 instanceof f5j.k) {
                    a aVar7 = yVar5.A;
                    f5j.k suggestionData = (f5j.k) obj3;
                    aVar7.getClass();
                    Intrinsics.checkNotNullParameter(suggestionData, "suggestionData");
                    yVar5.C1(aVar7.f250725a.a(suggestionData));
                } else {
                    yVar5.getClass();
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a0.d.m(obj3, "Unknown parcel "));
                    h0 h0Var3 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var3);
                }
                return Unit.f186387a;
            default:
                AppTipUIModel appTipUIModel2 = (AppTipUIModel) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarD6 = transferOnlyChatScreen.d();
                Object obj4 = appTipUIModel2.i;
                y yVar6 = (y) oVarD6;
                yVar6.getClass();
                if (obj4 instanceof f5j.k) {
                    yVar6.l2(new t(yVar6, obj4, (Continuation) null), new yi5.b(26));
                } else {
                    IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(a0.d.m(obj4, "Unknown parcel "));
                    h0 h0Var4 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var4);
                }
                return Unit.f186387a;
        }
    }
}
