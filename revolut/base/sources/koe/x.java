package koe;

import aw0.v9;
import com.revolut.core.ui_kit.delegates.chat.ChatAttachmentBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatAttachmentGridBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatAttachmentListBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleLoadingDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatCallBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatMessageActionsPanelDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatPaymentBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatQuickLinkBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatSmartTileSendMoneyDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatSmartTileSendMoneyLoadingDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatTableDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatUncontainedMessageDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatVoiceMessageBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.DefaultModeChatPaymentBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ShimmeringTextBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.TransparentModeChatPaymentBubbleDelegate;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.ReviewAccountDetailsContract$ModalStep;
import com.revolut.feature.salary_switch.impl.ui.mexico.screen.terms.TermsViewerContract$InputData;
import com.revolut.feature.salary_switch.impl.ui.mexico.screen.terms.TermsViewerController;
import ir2.d;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kp0.o0;
import ksk.i;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class x implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186334a;

    public /* synthetic */ x(int i) {
        this.f186334a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        switch (this.f186334a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new q((List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)), false, false);
            case 1:
                ((Integer) obj2).intValue();
                int i = ChatAttachmentBubbleDelegate.f53764l;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ChatAttachmentBubbleDelegate.Model);
            case 2:
                ((Integer) obj2).intValue();
                int i2 = ChatAttachmentGridBubbleDelegate.f53774n;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ChatAttachmentGridBubbleDelegate.Model);
            case 3:
                ((Integer) obj2).intValue();
                int i3 = ChatAttachmentListBubbleDelegate.f53787m;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ChatAttachmentListBubbleDelegate.Model);
            case 4:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ChatAttachmentListBubbleDelegate.AttachmentItem);
            case 5:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ChatBubbleDelegate.Model);
            case 6:
                ((Integer) obj2).intValue();
                int i5 = ChatBubbleLoadingDelegate.k;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ChatBubbleLoadingDelegate.Model);
            case 7:
                ((Integer) obj2).intValue();
                ChatCallBubbleDelegate.a aVar = ChatCallBubbleDelegate.Companion;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ChatCallBubbleDelegate.Model);
            case 8:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ChatMessageActionsPanelDelegate.Model);
            case 9:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof com.revolut.core.ui_kit.delegates.chat.h);
            case 10:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof com.revolut.core.ui_kit.delegates.chat.i);
            case 11:
                ((Integer) obj2).intValue();
                ChatQuickLinkBubbleDelegate.a aVar2 = ChatQuickLinkBubbleDelegate.Companion;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ChatQuickLinkBubbleDelegate.Model);
            case 12:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            case 13:
                ((Integer) obj2).intValue();
                int i6 = ChatSmartTileSendMoneyDelegate.f53892m;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ChatSmartTileSendMoneyDelegate.Model);
            case 14:
                CenteredAmountView field = (CenteredAmountView) data;
                int i21 = ChatSmartTileSendMoneyDelegate.f53892m;
                Intrinsics.checkNotNullParameter((v9) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(field, "field");
                return null;
            case 15:
                ((Integer) obj2).intValue();
                int i22 = ChatSmartTileSendMoneyLoadingDelegate.k;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ChatSmartTileSendMoneyLoadingDelegate.Model);
            case 16:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ChatTableDelegate.Model);
            case 17:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ChatUncontainedMessageDelegate.Model);
            case 18:
                ((Integer) obj2).intValue();
                int i32 = ChatVoiceMessageBubbleDelegate.f53926n;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ChatVoiceMessageBubbleDelegate.Model);
            case 19:
                ((Integer) obj2).intValue();
                int i33 = DefaultModeChatPaymentBubbleDelegate.f53943l;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf((data instanceof ChatPaymentBubbleDelegate.Model) && !(((ChatPaymentBubbleDelegate.Model) data).d instanceof o0));
            case 20:
                ((Integer) obj2).intValue();
                int i43 = ShimmeringTextBubbleDelegate.f53944l;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ShimmeringTextBubbleDelegate.Model);
            case 21:
                ((Integer) obj2).intValue();
                int i59 = TransparentModeChatPaymentBubbleDelegate.f53951l;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf((data instanceof ChatPaymentBubbleDelegate.Model) && (((ChatPaymentBubbleDelegate.Model) data).d instanceof o0));
            case 22:
                Function1 getDefaultErrorItems2 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new kpb.i((List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, true, null)), false);
            case 23:
                Throwable error = (Throwable) obj2;
                CategorisationFilter categorisationFilter = (CategorisationFilter) data;
                Intrinsics.checkNotNullParameter(error, "error");
                if (categorisationFilter == null) {
                    return error;
                }
                return null;
            case 24:
                Function1 getErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(getErrorItems, "getErrorItems");
                return (List) getErrorItems.invoke(new iii.d(12, null, true, true, null));
            case 25:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            case 26:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ReviewAccountDetailsContract$ModalStep it8 = (ReviewAccountDetailsContract$ModalStep) data;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8 instanceof ReviewAccountDetailsContract$ModalStep.ViewTerms) {
                    return new TermsViewerController(new TermsViewerContract$InputData(((ReviewAccountDetailsContract$ModalStep.ViewTerms) it8).f85326a));
                }
                throw new NoWhenBranchMatchedException();
            case 27:
                List transactions = (List) obj2;
                k71.q extraData = (k71.q) data;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                Intrinsics.checkNotNullParameter(extraData, "extraData");
                return new Pair(transactions, extraData);
            case 28:
                Function1 getDefaultErrorItemsProvider = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItemsProvider, "getDefaultErrorItemsProvider");
                ir2.g.Companion.getClass();
                return new ir2.c(ir2.g.d, (List) getDefaultErrorItemsProvider.invoke(new iii.d(12, null, true, true, null)), d.a.f167986a, null);
            default:
                i.a aVar3 = ksk.i.Companion;
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
        }
    }
}
