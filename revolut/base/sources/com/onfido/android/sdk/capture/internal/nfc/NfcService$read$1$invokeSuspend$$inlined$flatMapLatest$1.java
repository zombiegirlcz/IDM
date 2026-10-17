package com.onfido.android.sdk.capture.internal.nfc;

import android.nfc.Tag;
import com.onfido.android.sdk.capture.nfc.MRTDAccessControl;
import com.onfido.android.sdk.capture.nfc.MRTDDataGroup;
import com.onfido.android.sdk.capture.nfc.MRTDDocumentInfo;
import com.youTransactor.uCube.rpc.Constants;
import gim.i;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.BACKey;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
@gim.d(c = "com.onfido.android.sdk.capture.internal.nfc.NfcService$read$1$invokeSuspend$$inlined$flatMapLatest$1", f = "NfcService.kt", l = {Constants.TAG_ATMEL_SERIAL}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class NfcService$read$1$invokeSuspend$$inlined$flatMapLatest$1 extends i implements Function3 {
    final /* synthetic */ byte[] $activeAuthenticationChallenge$inlined;
    final /* synthetic */ MRTDDataGroup[] $dataGroups$inlined;
    final /* synthetic */ MRTDDocumentInfo $documentInfo$inlined;
    final /* synthetic */ Ref$ObjectRef $extractedValues$inlined;
    final /* synthetic */ MRTDAccessControl $preferredAccessControl$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ NfcService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NfcService$read$1$invokeSuspend$$inlined$flatMapLatest$1(Continuation continuation, NfcService nfcService, MRTDDocumentInfo mRTDDocumentInfo, MRTDDataGroup[] mRTDDataGroupArr, MRTDAccessControl mRTDAccessControl, byte[] bArr, Ref$ObjectRef ref$ObjectRef) {
        super(3, continuation);
        this.this$0 = nfcService;
        this.$documentInfo$inlined = mRTDDocumentInfo;
        this.$dataGroups$inlined = mRTDDataGroupArr;
        this.$preferredAccessControl$inlined = mRTDAccessControl;
        this.$activeAuthenticationChallenge$inlined = bArr;
        this.$extractedValues$inlined = ref$ObjectRef;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
        return invoke((FlowCollector) obj2, (Tag) obj3, (Continuation<? super Unit>) obj4);
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        List<? extends MRTDDataGroup> listV0;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Tag tag2 = (Tag) this.L$1;
            NfcReader nfcReader = this.this$0.reader;
            BACKey bACKey = new BACKey(this.$documentInfo$inlined.getDocumentNumber(), this.$documentInfo$inlined.getBirthDate(), this.$documentInfo$inlined.getExpiryDate());
            MRTDDataGroup[] mRTDDataGroupArr = this.$dataGroups$inlined;
            if (mRTDDataGroupArr == null || (listV0 = kotlin.collections.d.v0(mRTDDataGroupArr)) == null) {
                listV0 = kotlin.collections.d.v0(MRTDDataGroup.INSTANCE.all());
            }
            List<? extends MRTDDataGroup> list = listV0;
            MRTDAccessControl mRTDAccessControl = this.$preferredAccessControl$inlined;
            if (mRTDAccessControl == null) {
                mRTDAccessControl = MRTDAccessControl.PACE;
            }
            Flow flow = nfcReader.read(tag2, bACKey, list, mRTDAccessControl, this.$activeAuthenticationChallenge$inlined, true, (Map) this.$extractedValues$inlined.f186409a);
            this.label = 1;
            if (q.u(flowCollector, flow, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    public final Object invoke(@NotNull FlowCollector flowCollector, Tag tag2, Continuation<? super Unit> continuation) {
        NfcService$read$1$invokeSuspend$$inlined$flatMapLatest$1 nfcService$read$1$invokeSuspend$$inlined$flatMapLatest$1 = new NfcService$read$1$invokeSuspend$$inlined$flatMapLatest$1(continuation, this.this$0, this.$documentInfo$inlined, this.$dataGroups$inlined, this.$preferredAccessControl$inlined, this.$activeAuthenticationChallenge$inlined, this.$extractedValues$inlined);
        nfcService$read$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = flowCollector;
        nfcService$read$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = tag2;
        return nfcService$read$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(Unit.f186387a);
    }
}
