package j9k;

import com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLinkDetails;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PreloadScenario;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends gim.i implements Function2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ t B;
    public final /* synthetic */ PreloadScenario.TransferToAnonymousSplitLink C;
    public SplitBillLinkDetails u;
    public h0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PeerToPeerTransferInputData.Companion f172378w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public zm3.a f172379x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public SplitBillLinkDetails f172380y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, PreloadScenario.TransferToAnonymousSplitLink transferToAnonymousSplitLink, Continuation continuation) {
        super(2, continuation);
        this.B = tVar;
        this.C = transferToAnonymousSplitLink;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        r rVar = new r(this.B, this.C, continuation);
        rVar.A = obj2;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j9k.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
