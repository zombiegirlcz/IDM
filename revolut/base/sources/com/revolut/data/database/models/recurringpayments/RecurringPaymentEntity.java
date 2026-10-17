package com.revolut.data.database.models.recurringpayments;

import com.revolut.data.database.models.apm.UpiReceiverEmbeddedEntity;
import com.revolut.data.database.models.banktransfer.BankTransferTypeEmbeddedEntity;
import com.revolut.data.database.models.beneficiary.embeded.BeneficiaryEmbeddedEntity;
import com.revolut.data.database.models.credit.CreditReceiverEmbeddedEntity;
import com.revolut.data.database.models.credit.LoanReceiverEmbeddedEntity;
import com.revolut.data.database.models.credit.PayLaterReceiverEmbeddedEntity;
import com.revolut.data.database.models.creditor.CreditorEmbeddedEntity;
import com.revolut.data.database.models.endcriteria.RecurringPaymentEndCriteriaEmbeddedEntity;
import com.revolut.data.database.models.paymentcounterparty.PaymentCounterpartyReceiverInfoEntity;
import com.revolut.data.database.models.premium.RecurringPlanInfoEmbeddedEntity;
import com.revolut.data.database.models.recipient.RecipientEmbeddedEntity;
import com.revolut.data.database.models.recurringbuys.RecurringBuyReceiverInfoEmbeddedEntity;
import com.revolut.data.database.models.transfer.TransferReasonEmbeddedEntity;
import com.revolut.data.database.models.vaults.VaultReceiverInfoEmbeddedEntity;
import com.revolut.data.database.models.wallet.account.WalletAccountDetailsEntity;
import java.util.List;
import java.util.Set;
import jo3.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000é\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\bÍ\u0001\b\u0081\b\u0018\u00002\u00020\u0001Bë\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\b\u00101\u001a\u0004\u0018\u000100\u0012\b\u00103\u001a\u0004\u0018\u000102\u0012\b\u00104\u001a\u0004\u0018\u00010\u0002\u0012\b\u00106\u001a\u0004\u0018\u000105\u0012\b\u00108\u001a\u0004\u0018\u000107\u0012\b\u0010:\u001a\u0004\u0018\u000109\u0012\b\u0010;\u001a\u0004\u0018\u000102\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010?\u001a\u00020>\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010A\u0012\b\u0010D\u001a\u0004\u0018\u00010C\u0012\b\u0010E\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010F\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010G\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010H\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010J\u001a\u0004\u0018\u00010I\u0012\b\u0010L\u001a\u0004\u0018\u00010K\u0012\b\u0010M\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010N\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010P\u001a\u0004\u0018\u00010O\u0012\b\u0010R\u001a\u0004\u0018\u00010Q\u0012\b\u0010T\u001a\u0004\u0018\u00010S\u0012\u000e\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010U\u0012\b\u0010X\u001a\u0004\u0018\u00010W\u0012\b\u0010Z\u001a\u0004\u0018\u00010Y\u0012\b\u0010\\\u001a\u0004\u0018\u00010[\u0012\b\u0010]\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010^\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010_\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010`\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\ba\u0010bJ\u0010\u0010c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bc\u0010dJ\u0010\u0010e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\be\u0010fJ\u0010\u0010g\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bg\u0010hJ\u0012\u0010i\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bi\u0010dJ\u0012\u0010j\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bj\u0010kJ\u0012\u0010l\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bl\u0010mJ\u0012\u0010n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bn\u0010dJ\u0012\u0010o\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bo\u0010dJ\u0012\u0010p\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bp\u0010dJ\u0012\u0010q\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bq\u0010dJ\u0012\u0010r\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\br\u0010sJ\u0012\u0010t\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bt\u0010uJ\u0012\u0010v\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bv\u0010uJ\u0012\u0010w\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bw\u0010uJ\u0012\u0010x\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bx\u0010yJ\u0012\u0010z\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bz\u0010dJ\u0010\u0010{\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b{\u0010dJ\u0012\u0010|\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b|\u0010mJ\u0012\u0010}\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b}\u0010dJ\u0012\u0010~\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b~\u0010dJ\u0013\u0010\u007f\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0015\u0010\u0081\u0001\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0015\u0010\u0083\u0001\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0015\u0010\u0085\u0001\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0015\u0010\u0087\u0001\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0015\u0010\u0089\u0001\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0015\u0010\u008b\u0001\u001a\u0004\u0018\u00010*HÆ\u0003¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0015\u0010\u008d\u0001\u001a\u0004\u0018\u00010,HÆ\u0003¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0015\u0010\u008f\u0001\u001a\u0004\u0018\u00010.HÆ\u0003¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0015\u0010\u0091\u0001\u001a\u0004\u0018\u000100HÆ\u0003¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0015\u0010\u0093\u0001\u001a\u0004\u0018\u000102HÆ\u0003¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0014\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u0095\u0001\u0010dJ\u0015\u0010\u0096\u0001\u001a\u0004\u0018\u000105HÆ\u0003¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u0015\u0010\u0098\u0001\u001a\u0004\u0018\u000107HÆ\u0003¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u0015\u0010\u009a\u0001\u001a\u0004\u0018\u000109HÆ\u0003¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0015\u0010\u009c\u0001\u001a\u0004\u0018\u000102HÆ\u0003¢\u0006\u0006\b\u009c\u0001\u0010\u0094\u0001J\u0014\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u009d\u0001\u0010dJ\u0014\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u009e\u0001\u0010dJ\u0013\u0010\u009f\u0001\u001a\u00020>HÆ\u0003¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u0014\u0010¡\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b¡\u0001\u0010dJ\u001b\u0010¢\u0001\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010AHÆ\u0003¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u0015\u0010¤\u0001\u001a\u0004\u0018\u00010CHÆ\u0003¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u0014\u0010¦\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b¦\u0001\u0010dJ\u0014\u0010§\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b§\u0001\u0010dJ\u0014\u0010¨\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b¨\u0001\u0010dJ\u0014\u0010©\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b©\u0001\u0010dJ\u0015\u0010ª\u0001\u001a\u0004\u0018\u00010IHÆ\u0003¢\u0006\u0006\bª\u0001\u0010«\u0001J\u0015\u0010¬\u0001\u001a\u0004\u0018\u00010KHÆ\u0003¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J\u0014\u0010®\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b®\u0001\u0010dJ\u0014\u0010¯\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b¯\u0001\u0010dJ\u0015\u0010°\u0001\u001a\u0004\u0018\u00010OHÆ\u0003¢\u0006\u0006\b°\u0001\u0010±\u0001J\u0015\u0010²\u0001\u001a\u0004\u0018\u00010QHÆ\u0003¢\u0006\u0006\b²\u0001\u0010³\u0001J\u0015\u0010´\u0001\u001a\u0004\u0018\u00010SHÆ\u0003¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u001b\u0010¶\u0001\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010UHÆ\u0003¢\u0006\u0006\b¶\u0001\u0010·\u0001J\u0015\u0010¸\u0001\u001a\u0004\u0018\u00010WHÆ\u0003¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u0015\u0010º\u0001\u001a\u0004\u0018\u00010YHÆ\u0003¢\u0006\u0006\bº\u0001\u0010»\u0001J\u0015\u0010¼\u0001\u001a\u0004\u0018\u00010[HÆ\u0003¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u0014\u0010¾\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b¾\u0001\u0010dJ\u0014\u0010¿\u0001\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0005\b¿\u0001\u0010uJ\u0014\u0010À\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\bÀ\u0001\u0010dJ\u0014\u0010Á\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\bÁ\u0001\u0010dJñ\u0005\u0010Â\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\n\b\u0002\u00108\u001a\u0004\u0018\u0001072\n\b\u0002\u0010:\u001a\u0004\u0018\u0001092\n\b\u0002\u0010;\u001a\u0004\u0018\u0001022\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010?\u001a\u00020>2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010A2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010J\u001a\u0004\u0018\u00010I2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010K2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010P\u001a\u0004\u0018\u00010O2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010Q2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010S2\u0010\b\u0002\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010U2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010W2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010Y2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010[2\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\u0013\u0010Ä\u0001\u001a\u00020>HÖ\u0001¢\u0006\u0006\bÄ\u0001\u0010 \u0001J\u001e\u0010Æ\u0001\u001a\u00020\u00132\t\u0010Å\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J\u0012\u0010È\u0001\u001a\u00020\u0002HÖ\u0001¢\u0006\u0005\bÈ\u0001\u0010dR\u001c\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0003\u0010É\u0001\u001a\u0005\bÊ\u0001\u0010dR\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0005\u0010Ë\u0001\u001a\u0005\bÌ\u0001\u0010fR\u001c\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0007\u0010Í\u0001\u001a\u0005\bÎ\u0001\u0010hR\u001e\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\b\u0010É\u0001\u001a\u0005\bÏ\u0001\u0010dR\u001e\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\n\u0010Ð\u0001\u001a\u0005\bÑ\u0001\u0010kR\u001e\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\f\u0010Ò\u0001\u001a\u0005\bÓ\u0001\u0010mR\u001e\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\r\u0010É\u0001\u001a\u0005\bÔ\u0001\u0010dR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u000e\u0010É\u0001\u001a\u0005\bÕ\u0001\u0010dR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u000f\u0010É\u0001\u001a\u0005\bÖ\u0001\u0010dR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0010\u0010É\u0001\u001a\u0005\b×\u0001\u0010dR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0012\u0010Ø\u0001\u001a\u0005\bÙ\u0001\u0010sR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0014\u0010Ú\u0001\u001a\u0005\bÛ\u0001\u0010uR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0015\u0010Ú\u0001\u001a\u0005\bÜ\u0001\u0010uR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0016\u0010Ú\u0001\u001a\u0005\bÝ\u0001\u0010uR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0018\u0010Þ\u0001\u001a\u0005\bß\u0001\u0010yR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0019\u0010É\u0001\u001a\u0005\bà\u0001\u0010dR\u001c\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001a\u0010É\u0001\u001a\u0005\bá\u0001\u0010dR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001b\u0010Ò\u0001\u001a\u0005\bâ\u0001\u0010mR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001c\u0010É\u0001\u001a\u0005\bã\u0001\u0010dR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001d\u0010É\u0001\u001a\u0005\bä\u0001\u0010dR\u001f\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\u001f\u0010å\u0001\u001a\u0006\bæ\u0001\u0010\u0080\u0001R\u001f\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b!\u0010ç\u0001\u001a\u0006\bè\u0001\u0010\u0082\u0001R\u001f\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b#\u0010é\u0001\u001a\u0006\bê\u0001\u0010\u0084\u0001R\u001f\u0010%\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b%\u0010ë\u0001\u001a\u0006\bì\u0001\u0010\u0086\u0001R\u001f\u0010'\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b'\u0010í\u0001\u001a\u0006\bî\u0001\u0010\u0088\u0001R\u001f\u0010)\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b)\u0010ï\u0001\u001a\u0006\bð\u0001\u0010\u008a\u0001R\u001f\u0010+\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b+\u0010ñ\u0001\u001a\u0006\bò\u0001\u0010\u008c\u0001R\u001f\u0010-\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b-\u0010ó\u0001\u001a\u0006\bô\u0001\u0010\u008e\u0001R\u001f\u0010/\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b/\u0010õ\u0001\u001a\u0006\bö\u0001\u0010\u0090\u0001R\u001f\u00101\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b1\u0010÷\u0001\u001a\u0006\bø\u0001\u0010\u0092\u0001R\u001f\u00103\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b3\u0010ù\u0001\u001a\u0006\bú\u0001\u0010\u0094\u0001R\u001e\u00104\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b4\u0010É\u0001\u001a\u0005\bû\u0001\u0010dR\u001f\u00106\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b6\u0010ü\u0001\u001a\u0006\bý\u0001\u0010\u0097\u0001R\u001f\u00108\u001a\u0004\u0018\u0001078\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b8\u0010þ\u0001\u001a\u0006\bÿ\u0001\u0010\u0099\u0001R\u001f\u0010:\u001a\u0004\u0018\u0001098\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b:\u0010\u0080\u0002\u001a\u0006\b\u0081\u0002\u0010\u009b\u0001R\u001f\u0010;\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b;\u0010ù\u0001\u001a\u0006\b\u0082\u0002\u0010\u0094\u0001R\u001e\u0010<\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b<\u0010É\u0001\u001a\u0005\b\u0083\u0002\u0010dR\u001e\u0010=\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b=\u0010É\u0001\u001a\u0005\b\u0084\u0002\u0010dR\u001d\u0010?\u001a\u00020>8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b?\u0010\u0085\u0002\u001a\u0006\b\u0086\u0002\u0010 \u0001R\u001e\u0010@\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b@\u0010É\u0001\u001a\u0005\b\u0087\u0002\u0010dR%\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bB\u0010\u0088\u0002\u001a\u0006\b\u0089\u0002\u0010£\u0001R\u001f\u0010D\u001a\u0004\u0018\u00010C8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bD\u0010\u008a\u0002\u001a\u0006\b\u008b\u0002\u0010¥\u0001R\u001e\u0010E\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bE\u0010É\u0001\u001a\u0005\b\u008c\u0002\u0010dR\u001e\u0010F\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bF\u0010É\u0001\u001a\u0005\b\u008d\u0002\u0010dR\u001e\u0010G\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bG\u0010É\u0001\u001a\u0005\b\u008e\u0002\u0010dR\u001e\u0010H\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bH\u0010É\u0001\u001a\u0005\b\u008f\u0002\u0010dR\u001f\u0010J\u001a\u0004\u0018\u00010I8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bJ\u0010\u0090\u0002\u001a\u0006\b\u0091\u0002\u0010«\u0001R\u001f\u0010L\u001a\u0004\u0018\u00010K8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bL\u0010\u0092\u0002\u001a\u0006\b\u0093\u0002\u0010\u00ad\u0001R\u001e\u0010M\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bM\u0010É\u0001\u001a\u0005\b\u0094\u0002\u0010dR\u001e\u0010N\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bN\u0010É\u0001\u001a\u0005\b\u0095\u0002\u0010dR\u001f\u0010P\u001a\u0004\u0018\u00010O8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bP\u0010\u0096\u0002\u001a\u0006\b\u0097\u0002\u0010±\u0001R\u001f\u0010R\u001a\u0004\u0018\u00010Q8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bR\u0010\u0098\u0002\u001a\u0006\b\u0099\u0002\u0010³\u0001R\u001f\u0010T\u001a\u0004\u0018\u00010S8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bT\u0010\u009a\u0002\u001a\u0006\b\u009b\u0002\u0010µ\u0001R%\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010U8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bV\u0010\u009c\u0002\u001a\u0006\b\u009d\u0002\u0010·\u0001R\u001f\u0010X\u001a\u0004\u0018\u00010W8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bX\u0010\u009e\u0002\u001a\u0006\b\u009f\u0002\u0010¹\u0001R\u001f\u0010Z\u001a\u0004\u0018\u00010Y8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bZ\u0010 \u0002\u001a\u0006\b¡\u0002\u0010»\u0001R\u001f\u0010\\\u001a\u0004\u0018\u00010[8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\\\u0010¢\u0002\u001a\u0006\b£\u0002\u0010½\u0001R\u001e\u0010]\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b]\u0010É\u0001\u001a\u0005\b¤\u0002\u0010dR\u001e\u0010^\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b^\u0010Ú\u0001\u001a\u0005\b¥\u0002\u0010uR\u001e\u0010_\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b_\u0010É\u0001\u001a\u0005\b¦\u0002\u0010dR\u001e\u0010`\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b`\u0010É\u0001\u001a\u0005\b§\u0002\u0010d¨\u0006¨\u0002"}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentEntity;", "", "", "id", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentStateEmbeddedEntity;", "state", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentTypeEmbeddedEntity;", "type", "receiver", "Lcom/revolut/data/database/models/banktransfer/BankTransferTypeEmbeddedEntity;", "speed", "", "updatedDate", "startDate", "nextDate", "endDate", "period", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentFrequencyEmbeddedEntity;", "frequency", "", "recurring", "estimated", "autoExchangeEnabled", "Ljo3/b;", "fee", "sourceCurrency", "currency", "amount", "title", "description", "Lcom/revolut/data/database/models/transfer/TransferReasonEmbeddedEntity;", "transferReason", "Lcom/revolut/data/database/models/recurringbuys/RecurringBuyReceiverInfoEmbeddedEntity;", "receiverInfoRecurringBuy", "Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryEmbeddedEntity;", "recieverInfoBeneficiary", "Lcom/revolut/data/database/models/recipient/RecipientEmbeddedEntity;", "recieverInfoRecipient", "Lcom/revolut/data/database/models/creditor/CreditorEmbeddedEntity;", "recieverInfoCreditor", "Lcom/revolut/data/database/models/vaults/VaultReceiverInfoEmbeddedEntity;", "receiverInfoVault", "Lcom/revolut/data/database/models/recurringpayments/MerchantEmbeddedEntity;", "receiverInfoMerchant", "Lcom/revolut/data/database/models/credit/CreditReceiverEmbeddedEntity;", "receiverCreditEntity", "Lcom/revolut/data/database/models/credit/PayLaterReceiverEmbeddedEntity;", "receiverPayLaterEntity", "Lcom/revolut/data/database/models/credit/LoanReceiverEmbeddedEntity;", "receiverLoanEntity", "Lcom/revolut/data/database/models/wallet/account/WalletAccountDetailsEntity;", "receiverAccountInfo", "cobrandsLogo", "Lcom/revolut/data/database/models/paymentcounterparty/PaymentCounterpartyReceiverInfoEntity;", "receiverPaymentCounterpartyInfo", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentMethodDetailsEmbeddedEntity;", "receiverPaymentMethodDetails", "Lcom/revolut/data/database/models/apm/UpiReceiverEmbeddedEntity;", "receiverUpiInfo", "senderAccountInfo", "billMoneyBoxId", "side", "", "day", "gifUrl", "", "linkedTransactionsIds", "Lcom/revolut/data/database/models/premium/RecurringPlanInfoEmbeddedEntity;", "planInfo", "walletId", "initiatorId", "initiatorName", "name", "Lcom/revolut/data/database/models/recurringpayments/PendingRefundSenderInfoEmbeddedEntity;", "pendingRefundSenderInfo", "Lcom/revolut/data/database/models/recurringpayments/TransferReferencesEmbeddedEntity;", "referenceFields", "sourcePocketId", "sourcePocketScope", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentSchemeEmbeddedEntity;", "paymentScheme", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentMethodEmbeddedEntity;", "paymentMethod", "Lcom/revolut/data/database/models/endcriteria/RecurringPaymentEndCriteriaEmbeddedEntity;", "endCriteria", "", "availableActions", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentFundsSourceEmbeddedEntity;", "fundsSource", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentBillDetailsEntity;", "billDetails", "Lcom/revolut/data/database/models/recurringpayments/WalletAutomationEmbeddedEntity;", "walletAutomation", "initiationMethod", "requestFrequencyConfirmation", "deactivatedDate", "blockExpiryDate", "<init>", "(Ljava/lang/String;Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentStateEmbeddedEntity;Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentTypeEmbeddedEntity;Ljava/lang/String;Lcom/revolut/data/database/models/banktransfer/BankTransferTypeEmbeddedEntity;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentFrequencyEmbeddedEntity;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljo3/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/database/models/transfer/TransferReasonEmbeddedEntity;Lcom/revolut/data/database/models/recurringbuys/RecurringBuyReceiverInfoEmbeddedEntity;Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryEmbeddedEntity;Lcom/revolut/data/database/models/recipient/RecipientEmbeddedEntity;Lcom/revolut/data/database/models/creditor/CreditorEmbeddedEntity;Lcom/revolut/data/database/models/vaults/VaultReceiverInfoEmbeddedEntity;Lcom/revolut/data/database/models/recurringpayments/MerchantEmbeddedEntity;Lcom/revolut/data/database/models/credit/CreditReceiverEmbeddedEntity;Lcom/revolut/data/database/models/credit/PayLaterReceiverEmbeddedEntity;Lcom/revolut/data/database/models/credit/LoanReceiverEmbeddedEntity;Lcom/revolut/data/database/models/wallet/account/WalletAccountDetailsEntity;Ljava/lang/String;Lcom/revolut/data/database/models/paymentcounterparty/PaymentCounterpartyReceiverInfoEntity;Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentMethodDetailsEmbeddedEntity;Lcom/revolut/data/database/models/apm/UpiReceiverEmbeddedEntity;Lcom/revolut/data/database/models/wallet/account/WalletAccountDetailsEntity;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Set;Lcom/revolut/data/database/models/premium/RecurringPlanInfoEmbeddedEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/database/models/recurringpayments/PendingRefundSenderInfoEmbeddedEntity;Lcom/revolut/data/database/models/recurringpayments/TransferReferencesEmbeddedEntity;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentSchemeEmbeddedEntity;Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentMethodEmbeddedEntity;Lcom/revolut/data/database/models/endcriteria/RecurringPaymentEndCriteriaEmbeddedEntity;Ljava/util/List;Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentFundsSourceEmbeddedEntity;Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentBillDetailsEntity;Lcom/revolut/data/database/models/recurringpayments/WalletAutomationEmbeddedEntity;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentStateEmbeddedEntity;", "component3", "()Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentTypeEmbeddedEntity;", "component4", "component5", "()Lcom/revolut/data/database/models/banktransfer/BankTransferTypeEmbeddedEntity;", "component6", "()Ljava/lang/Long;", "component7", "component8", "component9", "component10", "component11", "()Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentFrequencyEmbeddedEntity;", "component12", "()Ljava/lang/Boolean;", "component13", "component14", "component15", "()Ljo3/b;", "component16", "component17", "component18", "component19", "component20", "component21", "()Lcom/revolut/data/database/models/transfer/TransferReasonEmbeddedEntity;", "component22", "()Lcom/revolut/data/database/models/recurringbuys/RecurringBuyReceiverInfoEmbeddedEntity;", "component23", "()Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryEmbeddedEntity;", "component24", "()Lcom/revolut/data/database/models/recipient/RecipientEmbeddedEntity;", "component25", "()Lcom/revolut/data/database/models/creditor/CreditorEmbeddedEntity;", "component26", "()Lcom/revolut/data/database/models/vaults/VaultReceiverInfoEmbeddedEntity;", "component27", "()Lcom/revolut/data/database/models/recurringpayments/MerchantEmbeddedEntity;", "component28", "()Lcom/revolut/data/database/models/credit/CreditReceiverEmbeddedEntity;", "component29", "()Lcom/revolut/data/database/models/credit/PayLaterReceiverEmbeddedEntity;", "component30", "()Lcom/revolut/data/database/models/credit/LoanReceiverEmbeddedEntity;", "component31", "()Lcom/revolut/data/database/models/wallet/account/WalletAccountDetailsEntity;", "component32", "component33", "()Lcom/revolut/data/database/models/paymentcounterparty/PaymentCounterpartyReceiverInfoEntity;", "component34", "()Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentMethodDetailsEmbeddedEntity;", "component35", "()Lcom/revolut/data/database/models/apm/UpiReceiverEmbeddedEntity;", "component36", "component37", "component38", "component39", "()I", "component40", "component41", "()Ljava/util/Set;", "component42", "()Lcom/revolut/data/database/models/premium/RecurringPlanInfoEmbeddedEntity;", "component43", "component44", "component45", "component46", "component47", "()Lcom/revolut/data/database/models/recurringpayments/PendingRefundSenderInfoEmbeddedEntity;", "component48", "()Lcom/revolut/data/database/models/recurringpayments/TransferReferencesEmbeddedEntity;", "component49", "component50", "component51", "()Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentSchemeEmbeddedEntity;", "component52", "()Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentMethodEmbeddedEntity;", "component53", "()Lcom/revolut/data/database/models/endcriteria/RecurringPaymentEndCriteriaEmbeddedEntity;", "component54", "()Ljava/util/List;", "component55", "()Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentFundsSourceEmbeddedEntity;", "component56", "()Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentBillDetailsEntity;", "component57", "()Lcom/revolut/data/database/models/recurringpayments/WalletAutomationEmbeddedEntity;", "component58", "component59", "component60", "component61", "copy", "(Ljava/lang/String;Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentStateEmbeddedEntity;Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentTypeEmbeddedEntity;Ljava/lang/String;Lcom/revolut/data/database/models/banktransfer/BankTransferTypeEmbeddedEntity;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentFrequencyEmbeddedEntity;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljo3/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/database/models/transfer/TransferReasonEmbeddedEntity;Lcom/revolut/data/database/models/recurringbuys/RecurringBuyReceiverInfoEmbeddedEntity;Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryEmbeddedEntity;Lcom/revolut/data/database/models/recipient/RecipientEmbeddedEntity;Lcom/revolut/data/database/models/creditor/CreditorEmbeddedEntity;Lcom/revolut/data/database/models/vaults/VaultReceiverInfoEmbeddedEntity;Lcom/revolut/data/database/models/recurringpayments/MerchantEmbeddedEntity;Lcom/revolut/data/database/models/credit/CreditReceiverEmbeddedEntity;Lcom/revolut/data/database/models/credit/PayLaterReceiverEmbeddedEntity;Lcom/revolut/data/database/models/credit/LoanReceiverEmbeddedEntity;Lcom/revolut/data/database/models/wallet/account/WalletAccountDetailsEntity;Ljava/lang/String;Lcom/revolut/data/database/models/paymentcounterparty/PaymentCounterpartyReceiverInfoEntity;Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentMethodDetailsEmbeddedEntity;Lcom/revolut/data/database/models/apm/UpiReceiverEmbeddedEntity;Lcom/revolut/data/database/models/wallet/account/WalletAccountDetailsEntity;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Set;Lcom/revolut/data/database/models/premium/RecurringPlanInfoEmbeddedEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/database/models/recurringpayments/PendingRefundSenderInfoEmbeddedEntity;Lcom/revolut/data/database/models/recurringpayments/TransferReferencesEmbeddedEntity;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentSchemeEmbeddedEntity;Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentMethodEmbeddedEntity;Lcom/revolut/data/database/models/endcriteria/RecurringPaymentEndCriteriaEmbeddedEntity;Ljava/util/List;Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentFundsSourceEmbeddedEntity;Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentBillDetailsEntity;Lcom/revolut/data/database/models/recurringpayments/WalletAutomationEmbeddedEntity;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentEntity;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getId", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentStateEmbeddedEntity;", "getState", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentTypeEmbeddedEntity;", "getType", "getReceiver", "Lcom/revolut/data/database/models/banktransfer/BankTransferTypeEmbeddedEntity;", "getSpeed", "Ljava/lang/Long;", "getUpdatedDate", "getStartDate", "getNextDate", "getEndDate", "getPeriod", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentFrequencyEmbeddedEntity;", "getFrequency", "Ljava/lang/Boolean;", "getRecurring", "getEstimated", "getAutoExchangeEnabled", "Ljo3/b;", "getFee", "getSourceCurrency", "getCurrency", "getAmount", "getTitle", "getDescription", "Lcom/revolut/data/database/models/transfer/TransferReasonEmbeddedEntity;", "getTransferReason", "Lcom/revolut/data/database/models/recurringbuys/RecurringBuyReceiverInfoEmbeddedEntity;", "getReceiverInfoRecurringBuy", "Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryEmbeddedEntity;", "getRecieverInfoBeneficiary", "Lcom/revolut/data/database/models/recipient/RecipientEmbeddedEntity;", "getRecieverInfoRecipient", "Lcom/revolut/data/database/models/creditor/CreditorEmbeddedEntity;", "getRecieverInfoCreditor", "Lcom/revolut/data/database/models/vaults/VaultReceiverInfoEmbeddedEntity;", "getReceiverInfoVault", "Lcom/revolut/data/database/models/recurringpayments/MerchantEmbeddedEntity;", "getReceiverInfoMerchant", "Lcom/revolut/data/database/models/credit/CreditReceiverEmbeddedEntity;", "getReceiverCreditEntity", "Lcom/revolut/data/database/models/credit/PayLaterReceiverEmbeddedEntity;", "getReceiverPayLaterEntity", "Lcom/revolut/data/database/models/credit/LoanReceiverEmbeddedEntity;", "getReceiverLoanEntity", "Lcom/revolut/data/database/models/wallet/account/WalletAccountDetailsEntity;", "getReceiverAccountInfo", "getCobrandsLogo", "Lcom/revolut/data/database/models/paymentcounterparty/PaymentCounterpartyReceiverInfoEntity;", "getReceiverPaymentCounterpartyInfo", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentMethodDetailsEmbeddedEntity;", "getReceiverPaymentMethodDetails", "Lcom/revolut/data/database/models/apm/UpiReceiverEmbeddedEntity;", "getReceiverUpiInfo", "getSenderAccountInfo", "getBillMoneyBoxId", "getSide", "I", "getDay", "getGifUrl", "Ljava/util/Set;", "getLinkedTransactionsIds", "Lcom/revolut/data/database/models/premium/RecurringPlanInfoEmbeddedEntity;", "getPlanInfo", "getWalletId", "getInitiatorId", "getInitiatorName", "getName", "Lcom/revolut/data/database/models/recurringpayments/PendingRefundSenderInfoEmbeddedEntity;", "getPendingRefundSenderInfo", "Lcom/revolut/data/database/models/recurringpayments/TransferReferencesEmbeddedEntity;", "getReferenceFields", "getSourcePocketId", "getSourcePocketScope", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentSchemeEmbeddedEntity;", "getPaymentScheme", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentMethodEmbeddedEntity;", "getPaymentMethod", "Lcom/revolut/data/database/models/endcriteria/RecurringPaymentEndCriteriaEmbeddedEntity;", "getEndCriteria", "Ljava/util/List;", "getAvailableActions", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentFundsSourceEmbeddedEntity;", "getFundsSource", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentBillDetailsEntity;", "getBillDetails", "Lcom/revolut/data/database/models/recurringpayments/WalletAutomationEmbeddedEntity;", "getWalletAutomation", "getInitiationMethod", "getRequestFrequencyConfirmation", "getDeactivatedDate", "getBlockExpiryDate", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecurringPaymentEntity {
    private final Long amount;
    private final Boolean autoExchangeEnabled;
    private final List<String> availableActions;
    private final RecurringPaymentBillDetailsEntity billDetails;
    private final String billMoneyBoxId;
    private final String blockExpiryDate;
    private final String cobrandsLogo;

    @NotNull
    private final String currency;
    private final int day;
    private final String deactivatedDate;
    private final String description;
    private final RecurringPaymentEndCriteriaEmbeddedEntity endCriteria;
    private final String endDate;
    private final Boolean estimated;
    private final b fee;
    private final RecurringPaymentFrequencyEmbeddedEntity frequency;
    private final RecurringPaymentFundsSourceEmbeddedEntity fundsSource;
    private final String gifUrl;

    @NotNull
    private final String id;
    private final String initiationMethod;
    private final String initiatorId;
    private final String initiatorName;
    private final Set<String> linkedTransactionsIds;
    private final String name;
    private final String nextDate;
    private final RecurringPaymentMethodEmbeddedEntity paymentMethod;
    private final RecurringPaymentSchemeEmbeddedEntity paymentScheme;
    private final PendingRefundSenderInfoEmbeddedEntity pendingRefundSenderInfo;
    private final String period;
    private final RecurringPlanInfoEmbeddedEntity planInfo;
    private final String receiver;
    private final WalletAccountDetailsEntity receiverAccountInfo;
    private final CreditReceiverEmbeddedEntity receiverCreditEntity;
    private final MerchantEmbeddedEntity receiverInfoMerchant;
    private final RecurringBuyReceiverInfoEmbeddedEntity receiverInfoRecurringBuy;
    private final VaultReceiverInfoEmbeddedEntity receiverInfoVault;
    private final LoanReceiverEmbeddedEntity receiverLoanEntity;
    private final PayLaterReceiverEmbeddedEntity receiverPayLaterEntity;
    private final PaymentCounterpartyReceiverInfoEntity receiverPaymentCounterpartyInfo;
    private final RecurringPaymentMethodDetailsEmbeddedEntity receiverPaymentMethodDetails;
    private final UpiReceiverEmbeddedEntity receiverUpiInfo;
    private final BeneficiaryEmbeddedEntity recieverInfoBeneficiary;
    private final CreditorEmbeddedEntity recieverInfoCreditor;
    private final RecipientEmbeddedEntity recieverInfoRecipient;
    private final Boolean recurring;
    private final TransferReferencesEmbeddedEntity referenceFields;
    private final Boolean requestFrequencyConfirmation;
    private final WalletAccountDetailsEntity senderAccountInfo;
    private final String side;
    private final String sourceCurrency;
    private final String sourcePocketId;
    private final String sourcePocketScope;
    private final BankTransferTypeEmbeddedEntity speed;
    private final String startDate;

    @NotNull
    private final RecurringPaymentStateEmbeddedEntity state;
    private final String title;
    private final TransferReasonEmbeddedEntity transferReason;

    @NotNull
    private final RecurringPaymentTypeEmbeddedEntity type;
    private final Long updatedDate;
    private final WalletAutomationEmbeddedEntity walletAutomation;
    private final String walletId;

    public RecurringPaymentEntity(@NotNull String id10, @NotNull RecurringPaymentStateEmbeddedEntity state, @NotNull RecurringPaymentTypeEmbeddedEntity type, String str, BankTransferTypeEmbeddedEntity bankTransferTypeEmbeddedEntity, Long l2, String str2, String str3, String str4, String str5, RecurringPaymentFrequencyEmbeddedEntity recurringPaymentFrequencyEmbeddedEntity, Boolean bool, Boolean bool2, Boolean bool3, b bVar, String str6, @NotNull String currency, Long l3, String str7, String str8, TransferReasonEmbeddedEntity transferReasonEmbeddedEntity, RecurringBuyReceiverInfoEmbeddedEntity recurringBuyReceiverInfoEmbeddedEntity, BeneficiaryEmbeddedEntity beneficiaryEmbeddedEntity, RecipientEmbeddedEntity recipientEmbeddedEntity, CreditorEmbeddedEntity creditorEmbeddedEntity, VaultReceiverInfoEmbeddedEntity vaultReceiverInfoEmbeddedEntity, MerchantEmbeddedEntity merchantEmbeddedEntity, CreditReceiverEmbeddedEntity creditReceiverEmbeddedEntity, PayLaterReceiverEmbeddedEntity payLaterReceiverEmbeddedEntity, LoanReceiverEmbeddedEntity loanReceiverEmbeddedEntity, WalletAccountDetailsEntity walletAccountDetailsEntity, String str9, PaymentCounterpartyReceiverInfoEntity paymentCounterpartyReceiverInfoEntity, RecurringPaymentMethodDetailsEmbeddedEntity recurringPaymentMethodDetailsEmbeddedEntity, UpiReceiverEmbeddedEntity upiReceiverEmbeddedEntity, WalletAccountDetailsEntity walletAccountDetailsEntity2, String str10, String str11, int i, String str12, Set<String> set, RecurringPlanInfoEmbeddedEntity recurringPlanInfoEmbeddedEntity, String str13, String str14, String str15, String str16, PendingRefundSenderInfoEmbeddedEntity pendingRefundSenderInfoEmbeddedEntity, TransferReferencesEmbeddedEntity transferReferencesEmbeddedEntity, String str17, String str18, RecurringPaymentSchemeEmbeddedEntity recurringPaymentSchemeEmbeddedEntity, RecurringPaymentMethodEmbeddedEntity recurringPaymentMethodEmbeddedEntity, RecurringPaymentEndCriteriaEmbeddedEntity recurringPaymentEndCriteriaEmbeddedEntity, List<String> list, RecurringPaymentFundsSourceEmbeddedEntity recurringPaymentFundsSourceEmbeddedEntity, RecurringPaymentBillDetailsEntity recurringPaymentBillDetailsEntity, WalletAutomationEmbeddedEntity walletAutomationEmbeddedEntity, String str19, Boolean bool4, String str20, String str21) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.id = id10;
        this.state = state;
        this.type = type;
        this.receiver = str;
        this.speed = bankTransferTypeEmbeddedEntity;
        this.updatedDate = l2;
        this.startDate = str2;
        this.nextDate = str3;
        this.endDate = str4;
        this.period = str5;
        this.frequency = recurringPaymentFrequencyEmbeddedEntity;
        this.recurring = bool;
        this.estimated = bool2;
        this.autoExchangeEnabled = bool3;
        this.fee = bVar;
        this.sourceCurrency = str6;
        this.currency = currency;
        this.amount = l3;
        this.title = str7;
        this.description = str8;
        this.transferReason = transferReasonEmbeddedEntity;
        this.receiverInfoRecurringBuy = recurringBuyReceiverInfoEmbeddedEntity;
        this.recieverInfoBeneficiary = beneficiaryEmbeddedEntity;
        this.recieverInfoRecipient = recipientEmbeddedEntity;
        this.recieverInfoCreditor = creditorEmbeddedEntity;
        this.receiverInfoVault = vaultReceiverInfoEmbeddedEntity;
        this.receiverInfoMerchant = merchantEmbeddedEntity;
        this.receiverCreditEntity = creditReceiverEmbeddedEntity;
        this.receiverPayLaterEntity = payLaterReceiverEmbeddedEntity;
        this.receiverLoanEntity = loanReceiverEmbeddedEntity;
        this.receiverAccountInfo = walletAccountDetailsEntity;
        this.cobrandsLogo = str9;
        this.receiverPaymentCounterpartyInfo = paymentCounterpartyReceiverInfoEntity;
        this.receiverPaymentMethodDetails = recurringPaymentMethodDetailsEmbeddedEntity;
        this.receiverUpiInfo = upiReceiverEmbeddedEntity;
        this.senderAccountInfo = walletAccountDetailsEntity2;
        this.billMoneyBoxId = str10;
        this.side = str11;
        this.day = i;
        this.gifUrl = str12;
        this.linkedTransactionsIds = set;
        this.planInfo = recurringPlanInfoEmbeddedEntity;
        this.walletId = str13;
        this.initiatorId = str14;
        this.initiatorName = str15;
        this.name = str16;
        this.pendingRefundSenderInfo = pendingRefundSenderInfoEmbeddedEntity;
        this.referenceFields = transferReferencesEmbeddedEntity;
        this.sourcePocketId = str17;
        this.sourcePocketScope = str18;
        this.paymentScheme = recurringPaymentSchemeEmbeddedEntity;
        this.paymentMethod = recurringPaymentMethodEmbeddedEntity;
        this.endCriteria = recurringPaymentEndCriteriaEmbeddedEntity;
        this.availableActions = list;
        this.fundsSource = recurringPaymentFundsSourceEmbeddedEntity;
        this.billDetails = recurringPaymentBillDetailsEntity;
        this.walletAutomation = walletAutomationEmbeddedEntity;
        this.initiationMethod = str19;
        this.requestFrequencyConfirmation = bool4;
        this.deactivatedDate = str20;
        this.blockExpiryDate = str21;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final RecurringPaymentFrequencyEmbeddedEntity getFrequency() {
        return this.frequency;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getRecurring() {
        return this.recurring;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getEstimated() {
        return this.estimated;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getAutoExchangeEnabled() {
        return this.autoExchangeEnabled;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final b getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getSourceCurrency() {
        return this.sourceCurrency;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RecurringPaymentStateEmbeddedEntity getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final TransferReasonEmbeddedEntity getTransferReason() {
        return this.transferReason;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final RecurringBuyReceiverInfoEmbeddedEntity getReceiverInfoRecurringBuy() {
        return this.receiverInfoRecurringBuy;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final BeneficiaryEmbeddedEntity getRecieverInfoBeneficiary() {
        return this.recieverInfoBeneficiary;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final RecipientEmbeddedEntity getRecieverInfoRecipient() {
        return this.recieverInfoRecipient;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final CreditorEmbeddedEntity getRecieverInfoCreditor() {
        return this.recieverInfoCreditor;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final VaultReceiverInfoEmbeddedEntity getReceiverInfoVault() {
        return this.receiverInfoVault;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final MerchantEmbeddedEntity getReceiverInfoMerchant() {
        return this.receiverInfoMerchant;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final CreditReceiverEmbeddedEntity getReceiverCreditEntity() {
        return this.receiverCreditEntity;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final PayLaterReceiverEmbeddedEntity getReceiverPayLaterEntity() {
        return this.receiverPayLaterEntity;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RecurringPaymentTypeEmbeddedEntity getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final LoanReceiverEmbeddedEntity getReceiverLoanEntity() {
        return this.receiverLoanEntity;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final WalletAccountDetailsEntity getReceiverAccountInfo() {
        return this.receiverAccountInfo;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getCobrandsLogo() {
        return this.cobrandsLogo;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final PaymentCounterpartyReceiverInfoEntity getReceiverPaymentCounterpartyInfo() {
        return this.receiverPaymentCounterpartyInfo;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final RecurringPaymentMethodDetailsEmbeddedEntity getReceiverPaymentMethodDetails() {
        return this.receiverPaymentMethodDetails;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final UpiReceiverEmbeddedEntity getReceiverUpiInfo() {
        return this.receiverUpiInfo;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final WalletAccountDetailsEntity getSenderAccountInfo() {
        return this.senderAccountInfo;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getBillMoneyBoxId() {
        return this.billMoneyBoxId;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final int getDay() {
        return this.day;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReceiver() {
        return this.receiver;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getGifUrl() {
        return this.gifUrl;
    }

    public final Set<String> component41() {
        return this.linkedTransactionsIds;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final RecurringPlanInfoEmbeddedEntity getPlanInfo() {
        return this.planInfo;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final String getInitiatorId() {
        return this.initiatorId;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final String getInitiatorName() {
        return this.initiatorName;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final PendingRefundSenderInfoEmbeddedEntity getPendingRefundSenderInfo() {
        return this.pendingRefundSenderInfo;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final TransferReferencesEmbeddedEntity getReferenceFields() {
        return this.referenceFields;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final String getSourcePocketId() {
        return this.sourcePocketId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BankTransferTypeEmbeddedEntity getSpeed() {
        return this.speed;
    }

    /* JADX INFO: renamed from: component50, reason: from getter */
    public final String getSourcePocketScope() {
        return this.sourcePocketScope;
    }

    /* JADX INFO: renamed from: component51, reason: from getter */
    public final RecurringPaymentSchemeEmbeddedEntity getPaymentScheme() {
        return this.paymentScheme;
    }

    /* JADX INFO: renamed from: component52, reason: from getter */
    public final RecurringPaymentMethodEmbeddedEntity getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX INFO: renamed from: component53, reason: from getter */
    public final RecurringPaymentEndCriteriaEmbeddedEntity getEndCriteria() {
        return this.endCriteria;
    }

    public final List<String> component54() {
        return this.availableActions;
    }

    /* JADX INFO: renamed from: component55, reason: from getter */
    public final RecurringPaymentFundsSourceEmbeddedEntity getFundsSource() {
        return this.fundsSource;
    }

    /* JADX INFO: renamed from: component56, reason: from getter */
    public final RecurringPaymentBillDetailsEntity getBillDetails() {
        return this.billDetails;
    }

    /* JADX INFO: renamed from: component57, reason: from getter */
    public final WalletAutomationEmbeddedEntity getWalletAutomation() {
        return this.walletAutomation;
    }

    /* JADX INFO: renamed from: component58, reason: from getter */
    public final String getInitiationMethod() {
        return this.initiationMethod;
    }

    /* JADX INFO: renamed from: component59, reason: from getter */
    public final Boolean getRequestFrequencyConfirmation() {
        return this.requestFrequencyConfirmation;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getUpdatedDate() {
        return this.updatedDate;
    }

    /* JADX INFO: renamed from: component60, reason: from getter */
    public final String getDeactivatedDate() {
        return this.deactivatedDate;
    }

    /* JADX INFO: renamed from: component61, reason: from getter */
    public final String getBlockExpiryDate() {
        return this.blockExpiryDate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getNextDate() {
        return this.nextDate;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    @NotNull
    public final RecurringPaymentEntity copy(@NotNull String id10, @NotNull RecurringPaymentStateEmbeddedEntity state, @NotNull RecurringPaymentTypeEmbeddedEntity type, String receiver, BankTransferTypeEmbeddedEntity speed, Long updatedDate, String startDate, String nextDate, String endDate, String period, RecurringPaymentFrequencyEmbeddedEntity frequency, Boolean recurring, Boolean estimated, Boolean autoExchangeEnabled, b fee2, String sourceCurrency, @NotNull String currency, Long amount, String title, String description, TransferReasonEmbeddedEntity transferReason, RecurringBuyReceiverInfoEmbeddedEntity receiverInfoRecurringBuy, BeneficiaryEmbeddedEntity recieverInfoBeneficiary, RecipientEmbeddedEntity recieverInfoRecipient, CreditorEmbeddedEntity recieverInfoCreditor, VaultReceiverInfoEmbeddedEntity receiverInfoVault, MerchantEmbeddedEntity receiverInfoMerchant, CreditReceiverEmbeddedEntity receiverCreditEntity, PayLaterReceiverEmbeddedEntity receiverPayLaterEntity, LoanReceiverEmbeddedEntity receiverLoanEntity, WalletAccountDetailsEntity receiverAccountInfo, String cobrandsLogo, PaymentCounterpartyReceiverInfoEntity receiverPaymentCounterpartyInfo, RecurringPaymentMethodDetailsEmbeddedEntity receiverPaymentMethodDetails, UpiReceiverEmbeddedEntity receiverUpiInfo, WalletAccountDetailsEntity senderAccountInfo, String billMoneyBoxId, String side, int day, String gifUrl, Set<String> linkedTransactionsIds, RecurringPlanInfoEmbeddedEntity planInfo, String walletId, String initiatorId, String initiatorName, String name, PendingRefundSenderInfoEmbeddedEntity pendingRefundSenderInfo, TransferReferencesEmbeddedEntity referenceFields, String sourcePocketId, String sourcePocketScope, RecurringPaymentSchemeEmbeddedEntity paymentScheme, RecurringPaymentMethodEmbeddedEntity paymentMethod, RecurringPaymentEndCriteriaEmbeddedEntity endCriteria, List<String> availableActions, RecurringPaymentFundsSourceEmbeddedEntity fundsSource, RecurringPaymentBillDetailsEntity billDetails, WalletAutomationEmbeddedEntity walletAutomation, String initiationMethod, Boolean requestFrequencyConfirmation, String deactivatedDate, String blockExpiryDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new RecurringPaymentEntity(id10, state, type, receiver, speed, updatedDate, startDate, nextDate, endDate, period, frequency, recurring, estimated, autoExchangeEnabled, fee2, sourceCurrency, currency, amount, title, description, transferReason, receiverInfoRecurringBuy, recieverInfoBeneficiary, recieverInfoRecipient, recieverInfoCreditor, receiverInfoVault, receiverInfoMerchant, receiverCreditEntity, receiverPayLaterEntity, receiverLoanEntity, receiverAccountInfo, cobrandsLogo, receiverPaymentCounterpartyInfo, receiverPaymentMethodDetails, receiverUpiInfo, senderAccountInfo, billMoneyBoxId, side, day, gifUrl, linkedTransactionsIds, planInfo, walletId, initiatorId, initiatorName, name, pendingRefundSenderInfo, referenceFields, sourcePocketId, sourcePocketScope, paymentScheme, paymentMethod, endCriteria, availableActions, fundsSource, billDetails, walletAutomation, initiationMethod, requestFrequencyConfirmation, deactivatedDate, blockExpiryDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringPaymentEntity)) {
            return false;
        }
        RecurringPaymentEntity recurringPaymentEntity = (RecurringPaymentEntity) other;
        return Intrinsics.f(this.id, recurringPaymentEntity.id) && this.state == recurringPaymentEntity.state && this.type == recurringPaymentEntity.type && Intrinsics.f(this.receiver, recurringPaymentEntity.receiver) && this.speed == recurringPaymentEntity.speed && Intrinsics.f(this.updatedDate, recurringPaymentEntity.updatedDate) && Intrinsics.f(this.startDate, recurringPaymentEntity.startDate) && Intrinsics.f(this.nextDate, recurringPaymentEntity.nextDate) && Intrinsics.f(this.endDate, recurringPaymentEntity.endDate) && Intrinsics.f(this.period, recurringPaymentEntity.period) && this.frequency == recurringPaymentEntity.frequency && Intrinsics.f(this.recurring, recurringPaymentEntity.recurring) && Intrinsics.f(this.estimated, recurringPaymentEntity.estimated) && Intrinsics.f(this.autoExchangeEnabled, recurringPaymentEntity.autoExchangeEnabled) && Intrinsics.f(this.fee, recurringPaymentEntity.fee) && Intrinsics.f(this.sourceCurrency, recurringPaymentEntity.sourceCurrency) && Intrinsics.f(this.currency, recurringPaymentEntity.currency) && Intrinsics.f(this.amount, recurringPaymentEntity.amount) && Intrinsics.f(this.title, recurringPaymentEntity.title) && Intrinsics.f(this.description, recurringPaymentEntity.description) && Intrinsics.f(this.transferReason, recurringPaymentEntity.transferReason) && Intrinsics.f(this.receiverInfoRecurringBuy, recurringPaymentEntity.receiverInfoRecurringBuy) && Intrinsics.f(this.recieverInfoBeneficiary, recurringPaymentEntity.recieverInfoBeneficiary) && Intrinsics.f(this.recieverInfoRecipient, recurringPaymentEntity.recieverInfoRecipient) && Intrinsics.f(this.recieverInfoCreditor, recurringPaymentEntity.recieverInfoCreditor) && Intrinsics.f(this.receiverInfoVault, recurringPaymentEntity.receiverInfoVault) && Intrinsics.f(this.receiverInfoMerchant, recurringPaymentEntity.receiverInfoMerchant) && Intrinsics.f(this.receiverCreditEntity, recurringPaymentEntity.receiverCreditEntity) && Intrinsics.f(this.receiverPayLaterEntity, recurringPaymentEntity.receiverPayLaterEntity) && Intrinsics.f(this.receiverLoanEntity, recurringPaymentEntity.receiverLoanEntity) && Intrinsics.f(this.receiverAccountInfo, recurringPaymentEntity.receiverAccountInfo) && Intrinsics.f(this.cobrandsLogo, recurringPaymentEntity.cobrandsLogo) && Intrinsics.f(this.receiverPaymentCounterpartyInfo, recurringPaymentEntity.receiverPaymentCounterpartyInfo) && Intrinsics.f(this.receiverPaymentMethodDetails, recurringPaymentEntity.receiverPaymentMethodDetails) && Intrinsics.f(this.receiverUpiInfo, recurringPaymentEntity.receiverUpiInfo) && Intrinsics.f(this.senderAccountInfo, recurringPaymentEntity.senderAccountInfo) && Intrinsics.f(this.billMoneyBoxId, recurringPaymentEntity.billMoneyBoxId) && Intrinsics.f(this.side, recurringPaymentEntity.side) && this.day == recurringPaymentEntity.day && Intrinsics.f(this.gifUrl, recurringPaymentEntity.gifUrl) && Intrinsics.f(this.linkedTransactionsIds, recurringPaymentEntity.linkedTransactionsIds) && Intrinsics.f(this.planInfo, recurringPaymentEntity.planInfo) && Intrinsics.f(this.walletId, recurringPaymentEntity.walletId) && Intrinsics.f(this.initiatorId, recurringPaymentEntity.initiatorId) && Intrinsics.f(this.initiatorName, recurringPaymentEntity.initiatorName) && Intrinsics.f(this.name, recurringPaymentEntity.name) && Intrinsics.f(this.pendingRefundSenderInfo, recurringPaymentEntity.pendingRefundSenderInfo) && Intrinsics.f(this.referenceFields, recurringPaymentEntity.referenceFields) && Intrinsics.f(this.sourcePocketId, recurringPaymentEntity.sourcePocketId) && Intrinsics.f(this.sourcePocketScope, recurringPaymentEntity.sourcePocketScope) && this.paymentScheme == recurringPaymentEntity.paymentScheme && this.paymentMethod == recurringPaymentEntity.paymentMethod && Intrinsics.f(this.endCriteria, recurringPaymentEntity.endCriteria) && Intrinsics.f(this.availableActions, recurringPaymentEntity.availableActions) && Intrinsics.f(this.fundsSource, recurringPaymentEntity.fundsSource) && Intrinsics.f(this.billDetails, recurringPaymentEntity.billDetails) && Intrinsics.f(this.walletAutomation, recurringPaymentEntity.walletAutomation) && Intrinsics.f(this.initiationMethod, recurringPaymentEntity.initiationMethod) && Intrinsics.f(this.requestFrequencyConfirmation, recurringPaymentEntity.requestFrequencyConfirmation) && Intrinsics.f(this.deactivatedDate, recurringPaymentEntity.deactivatedDate) && Intrinsics.f(this.blockExpiryDate, recurringPaymentEntity.blockExpiryDate);
    }

    public final Long getAmount() {
        return this.amount;
    }

    public final Boolean getAutoExchangeEnabled() {
        return this.autoExchangeEnabled;
    }

    public final List<String> getAvailableActions() {
        return this.availableActions;
    }

    public final RecurringPaymentBillDetailsEntity getBillDetails() {
        return this.billDetails;
    }

    public final String getBillMoneyBoxId() {
        return this.billMoneyBoxId;
    }

    public final String getBlockExpiryDate() {
        return this.blockExpiryDate;
    }

    public final String getCobrandsLogo() {
        return this.cobrandsLogo;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    public final int getDay() {
        return this.day;
    }

    public final String getDeactivatedDate() {
        return this.deactivatedDate;
    }

    public final String getDescription() {
        return this.description;
    }

    public final RecurringPaymentEndCriteriaEmbeddedEntity getEndCriteria() {
        return this.endCriteria;
    }

    public final String getEndDate() {
        return this.endDate;
    }

    public final Boolean getEstimated() {
        return this.estimated;
    }

    public final b getFee() {
        return this.fee;
    }

    public final RecurringPaymentFrequencyEmbeddedEntity getFrequency() {
        return this.frequency;
    }

    public final RecurringPaymentFundsSourceEmbeddedEntity getFundsSource() {
        return this.fundsSource;
    }

    public final String getGifUrl() {
        return this.gifUrl;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final String getInitiationMethod() {
        return this.initiationMethod;
    }

    public final String getInitiatorId() {
        return this.initiatorId;
    }

    public final String getInitiatorName() {
        return this.initiatorName;
    }

    public final Set<String> getLinkedTransactionsIds() {
        return this.linkedTransactionsIds;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNextDate() {
        return this.nextDate;
    }

    public final RecurringPaymentMethodEmbeddedEntity getPaymentMethod() {
        return this.paymentMethod;
    }

    public final RecurringPaymentSchemeEmbeddedEntity getPaymentScheme() {
        return this.paymentScheme;
    }

    public final PendingRefundSenderInfoEmbeddedEntity getPendingRefundSenderInfo() {
        return this.pendingRefundSenderInfo;
    }

    public final String getPeriod() {
        return this.period;
    }

    public final RecurringPlanInfoEmbeddedEntity getPlanInfo() {
        return this.planInfo;
    }

    public final String getReceiver() {
        return this.receiver;
    }

    public final WalletAccountDetailsEntity getReceiverAccountInfo() {
        return this.receiverAccountInfo;
    }

    public final CreditReceiverEmbeddedEntity getReceiverCreditEntity() {
        return this.receiverCreditEntity;
    }

    public final MerchantEmbeddedEntity getReceiverInfoMerchant() {
        return this.receiverInfoMerchant;
    }

    public final RecurringBuyReceiverInfoEmbeddedEntity getReceiverInfoRecurringBuy() {
        return this.receiverInfoRecurringBuy;
    }

    public final VaultReceiverInfoEmbeddedEntity getReceiverInfoVault() {
        return this.receiverInfoVault;
    }

    public final LoanReceiverEmbeddedEntity getReceiverLoanEntity() {
        return this.receiverLoanEntity;
    }

    public final PayLaterReceiverEmbeddedEntity getReceiverPayLaterEntity() {
        return this.receiverPayLaterEntity;
    }

    public final PaymentCounterpartyReceiverInfoEntity getReceiverPaymentCounterpartyInfo() {
        return this.receiverPaymentCounterpartyInfo;
    }

    public final RecurringPaymentMethodDetailsEmbeddedEntity getReceiverPaymentMethodDetails() {
        return this.receiverPaymentMethodDetails;
    }

    public final UpiReceiverEmbeddedEntity getReceiverUpiInfo() {
        return this.receiverUpiInfo;
    }

    public final BeneficiaryEmbeddedEntity getRecieverInfoBeneficiary() {
        return this.recieverInfoBeneficiary;
    }

    public final CreditorEmbeddedEntity getRecieverInfoCreditor() {
        return this.recieverInfoCreditor;
    }

    public final RecipientEmbeddedEntity getRecieverInfoRecipient() {
        return this.recieverInfoRecipient;
    }

    public final Boolean getRecurring() {
        return this.recurring;
    }

    public final TransferReferencesEmbeddedEntity getReferenceFields() {
        return this.referenceFields;
    }

    public final Boolean getRequestFrequencyConfirmation() {
        return this.requestFrequencyConfirmation;
    }

    public final WalletAccountDetailsEntity getSenderAccountInfo() {
        return this.senderAccountInfo;
    }

    public final String getSide() {
        return this.side;
    }

    public final String getSourceCurrency() {
        return this.sourceCurrency;
    }

    public final String getSourcePocketId() {
        return this.sourcePocketId;
    }

    public final String getSourcePocketScope() {
        return this.sourcePocketScope;
    }

    public final BankTransferTypeEmbeddedEntity getSpeed() {
        return this.speed;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    @NotNull
    public final RecurringPaymentStateEmbeddedEntity getState() {
        return this.state;
    }

    public final String getTitle() {
        return this.title;
    }

    public final TransferReasonEmbeddedEntity getTransferReason() {
        return this.transferReason;
    }

    @NotNull
    public final RecurringPaymentTypeEmbeddedEntity getType() {
        return this.type;
    }

    public final Long getUpdatedDate() {
        return this.updatedDate;
    }

    public final WalletAutomationEmbeddedEntity getWalletAutomation() {
        return this.walletAutomation;
    }

    public final String getWalletId() {
        return this.walletId;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + ((this.state.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31;
        String str = this.receiver;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BankTransferTypeEmbeddedEntity bankTransferTypeEmbeddedEntity = this.speed;
        int iHashCode3 = (iHashCode2 + (bankTransferTypeEmbeddedEntity == null ? 0 : bankTransferTypeEmbeddedEntity.hashCode())) * 31;
        Long l2 = this.updatedDate;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.startDate;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nextDate;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.endDate;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.period;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        RecurringPaymentFrequencyEmbeddedEntity recurringPaymentFrequencyEmbeddedEntity = this.frequency;
        int iHashCode9 = (iHashCode8 + (recurringPaymentFrequencyEmbeddedEntity == null ? 0 : recurringPaymentFrequencyEmbeddedEntity.hashCode())) * 31;
        Boolean bool = this.recurring;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.estimated;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.autoExchangeEnabled;
        int iHashCode12 = (iHashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        b bVar = this.fee;
        int iHashCode13 = (iHashCode12 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str6 = this.sourceCurrency;
        int iC = a.c((iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.currency);
        Long l3 = this.amount;
        int iHashCode14 = (iC + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str7 = this.title;
        int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.description;
        int iHashCode16 = (iHashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
        TransferReasonEmbeddedEntity transferReasonEmbeddedEntity = this.transferReason;
        int iHashCode17 = (iHashCode16 + (transferReasonEmbeddedEntity == null ? 0 : transferReasonEmbeddedEntity.hashCode())) * 31;
        RecurringBuyReceiverInfoEmbeddedEntity recurringBuyReceiverInfoEmbeddedEntity = this.receiverInfoRecurringBuy;
        int iHashCode18 = (iHashCode17 + (recurringBuyReceiverInfoEmbeddedEntity == null ? 0 : recurringBuyReceiverInfoEmbeddedEntity.hashCode())) * 31;
        BeneficiaryEmbeddedEntity beneficiaryEmbeddedEntity = this.recieverInfoBeneficiary;
        int iHashCode19 = (iHashCode18 + (beneficiaryEmbeddedEntity == null ? 0 : beneficiaryEmbeddedEntity.hashCode())) * 31;
        RecipientEmbeddedEntity recipientEmbeddedEntity = this.recieverInfoRecipient;
        int iHashCode20 = (iHashCode19 + (recipientEmbeddedEntity == null ? 0 : recipientEmbeddedEntity.hashCode())) * 31;
        CreditorEmbeddedEntity creditorEmbeddedEntity = this.recieverInfoCreditor;
        int iHashCode21 = (iHashCode20 + (creditorEmbeddedEntity == null ? 0 : creditorEmbeddedEntity.hashCode())) * 31;
        VaultReceiverInfoEmbeddedEntity vaultReceiverInfoEmbeddedEntity = this.receiverInfoVault;
        int iHashCode22 = (iHashCode21 + (vaultReceiverInfoEmbeddedEntity == null ? 0 : vaultReceiverInfoEmbeddedEntity.hashCode())) * 31;
        MerchantEmbeddedEntity merchantEmbeddedEntity = this.receiverInfoMerchant;
        int iHashCode23 = (iHashCode22 + (merchantEmbeddedEntity == null ? 0 : merchantEmbeddedEntity.hashCode())) * 31;
        CreditReceiverEmbeddedEntity creditReceiverEmbeddedEntity = this.receiverCreditEntity;
        int iHashCode24 = (iHashCode23 + (creditReceiverEmbeddedEntity == null ? 0 : creditReceiverEmbeddedEntity.hashCode())) * 31;
        PayLaterReceiverEmbeddedEntity payLaterReceiverEmbeddedEntity = this.receiverPayLaterEntity;
        int iHashCode25 = (iHashCode24 + (payLaterReceiverEmbeddedEntity == null ? 0 : payLaterReceiverEmbeddedEntity.hashCode())) * 31;
        LoanReceiverEmbeddedEntity loanReceiverEmbeddedEntity = this.receiverLoanEntity;
        int iHashCode26 = (iHashCode25 + (loanReceiverEmbeddedEntity == null ? 0 : loanReceiverEmbeddedEntity.hashCode())) * 31;
        WalletAccountDetailsEntity walletAccountDetailsEntity = this.receiverAccountInfo;
        int iHashCode27 = (iHashCode26 + (walletAccountDetailsEntity == null ? 0 : walletAccountDetailsEntity.hashCode())) * 31;
        String str9 = this.cobrandsLogo;
        int iHashCode28 = (iHashCode27 + (str9 == null ? 0 : str9.hashCode())) * 31;
        PaymentCounterpartyReceiverInfoEntity paymentCounterpartyReceiverInfoEntity = this.receiverPaymentCounterpartyInfo;
        int iHashCode29 = (iHashCode28 + (paymentCounterpartyReceiverInfoEntity == null ? 0 : paymentCounterpartyReceiverInfoEntity.hashCode())) * 31;
        RecurringPaymentMethodDetailsEmbeddedEntity recurringPaymentMethodDetailsEmbeddedEntity = this.receiverPaymentMethodDetails;
        int iHashCode30 = (iHashCode29 + (recurringPaymentMethodDetailsEmbeddedEntity == null ? 0 : recurringPaymentMethodDetailsEmbeddedEntity.hashCode())) * 31;
        UpiReceiverEmbeddedEntity upiReceiverEmbeddedEntity = this.receiverUpiInfo;
        int iHashCode31 = (iHashCode30 + (upiReceiverEmbeddedEntity == null ? 0 : upiReceiverEmbeddedEntity.hashCode())) * 31;
        WalletAccountDetailsEntity walletAccountDetailsEntity2 = this.senderAccountInfo;
        int iHashCode32 = (iHashCode31 + (walletAccountDetailsEntity2 == null ? 0 : walletAccountDetailsEntity2.hashCode())) * 31;
        String str10 = this.billMoneyBoxId;
        int iHashCode33 = (iHashCode32 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.side;
        int iB = j6.a.b(this.day, (iHashCode33 + (str11 == null ? 0 : str11.hashCode())) * 31, 31);
        String str12 = this.gifUrl;
        int iHashCode34 = (iB + (str12 == null ? 0 : str12.hashCode())) * 31;
        Set<String> set = this.linkedTransactionsIds;
        int iHashCode35 = (iHashCode34 + (set == null ? 0 : set.hashCode())) * 31;
        RecurringPlanInfoEmbeddedEntity recurringPlanInfoEmbeddedEntity = this.planInfo;
        int iHashCode36 = (iHashCode35 + (recurringPlanInfoEmbeddedEntity == null ? 0 : recurringPlanInfoEmbeddedEntity.hashCode())) * 31;
        String str13 = this.walletId;
        int iHashCode37 = (iHashCode36 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.initiatorId;
        int iHashCode38 = (iHashCode37 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.initiatorName;
        int iHashCode39 = (iHashCode38 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.name;
        int iHashCode40 = (iHashCode39 + (str16 == null ? 0 : str16.hashCode())) * 31;
        PendingRefundSenderInfoEmbeddedEntity pendingRefundSenderInfoEmbeddedEntity = this.pendingRefundSenderInfo;
        int iHashCode41 = (iHashCode40 + (pendingRefundSenderInfoEmbeddedEntity == null ? 0 : pendingRefundSenderInfoEmbeddedEntity.hashCode())) * 31;
        TransferReferencesEmbeddedEntity transferReferencesEmbeddedEntity = this.referenceFields;
        int iHashCode42 = (iHashCode41 + (transferReferencesEmbeddedEntity == null ? 0 : transferReferencesEmbeddedEntity.hashCode())) * 31;
        String str17 = this.sourcePocketId;
        int iHashCode43 = (iHashCode42 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.sourcePocketScope;
        int iHashCode44 = (iHashCode43 + (str18 == null ? 0 : str18.hashCode())) * 31;
        RecurringPaymentSchemeEmbeddedEntity recurringPaymentSchemeEmbeddedEntity = this.paymentScheme;
        int iHashCode45 = (iHashCode44 + (recurringPaymentSchemeEmbeddedEntity == null ? 0 : recurringPaymentSchemeEmbeddedEntity.hashCode())) * 31;
        RecurringPaymentMethodEmbeddedEntity recurringPaymentMethodEmbeddedEntity = this.paymentMethod;
        int iHashCode46 = (iHashCode45 + (recurringPaymentMethodEmbeddedEntity == null ? 0 : recurringPaymentMethodEmbeddedEntity.hashCode())) * 31;
        RecurringPaymentEndCriteriaEmbeddedEntity recurringPaymentEndCriteriaEmbeddedEntity = this.endCriteria;
        int iHashCode47 = (iHashCode46 + (recurringPaymentEndCriteriaEmbeddedEntity == null ? 0 : recurringPaymentEndCriteriaEmbeddedEntity.hashCode())) * 31;
        List<String> list = this.availableActions;
        int iHashCode48 = (iHashCode47 + (list == null ? 0 : list.hashCode())) * 31;
        RecurringPaymentFundsSourceEmbeddedEntity recurringPaymentFundsSourceEmbeddedEntity = this.fundsSource;
        int iHashCode49 = (iHashCode48 + (recurringPaymentFundsSourceEmbeddedEntity == null ? 0 : recurringPaymentFundsSourceEmbeddedEntity.hashCode())) * 31;
        RecurringPaymentBillDetailsEntity recurringPaymentBillDetailsEntity = this.billDetails;
        int iHashCode50 = (iHashCode49 + (recurringPaymentBillDetailsEntity == null ? 0 : recurringPaymentBillDetailsEntity.hashCode())) * 31;
        WalletAutomationEmbeddedEntity walletAutomationEmbeddedEntity = this.walletAutomation;
        int iHashCode51 = (iHashCode50 + (walletAutomationEmbeddedEntity == null ? 0 : walletAutomationEmbeddedEntity.hashCode())) * 31;
        String str19 = this.initiationMethod;
        int iHashCode52 = (iHashCode51 + (str19 == null ? 0 : str19.hashCode())) * 31;
        Boolean bool4 = this.requestFrequencyConfirmation;
        int iHashCode53 = (iHashCode52 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str20 = this.deactivatedDate;
        int iHashCode54 = (iHashCode53 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.blockExpiryDate;
        return iHashCode54 + (str21 != null ? str21.hashCode() : 0);
    }
}
