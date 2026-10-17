package ps9;

import android.os.Parcelable;
import bs9.d0;
import com.revolut.data.model.Data;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.impl.ui_chat.settings.GroupChatSettingsScreenModel$StatusViewSuccessPayload;
import e60.l;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.groups.impl.ui_chat.settings.d f239448w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(com.revolut.feature.payments.groups.impl.ui_chat.settings.d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f239448w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                w wVar = new w(this.f239448w, continuation, 0);
                wVar.v = obj2;
                return wVar;
            case 1:
                w wVar2 = new w(this.f239448w, continuation, 1);
                wVar2.v = obj2;
                return wVar2;
            case 2:
                w wVar3 = new w(this.f239448w, continuation, 2);
                wVar3.v = obj2;
                return wVar3;
            default:
                w wVar4 = new w(this.f239448w, continuation, 3);
                wVar4.v = obj2;
                return wVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((w) create((PaymentGroup) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((w) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((w) create((e60.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((w) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        com.revolut.feature.payments.groups.impl.ui_chat.settings.d dVar = this.f239448w;
        switch (i) {
            case 0:
                PaymentGroup paymentGroup = (PaymentGroup) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.C, new d0(paymentGroup, 6));
                return Unit.f186387a;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.C, new pnh.d0(data, 11));
                return Unit.f186387a;
            case 2:
                e60.l lVar = (e60.l) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (lVar instanceof e60.m) {
                    dVar.l2(new pnf.f(dVar, ((e60.m) lVar).b(), continuation, 10), new yi5.b(26));
                } else {
                    if (!(lVar instanceof l.a) && !(lVar instanceof e60.j) && !(lVar instanceof e60.k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.INFO, "GroupChatSettingsScreenModel", "MediaPicker.observeMediaPickerResult() returned unsupported result: " + lVar, null, null, 16);
                }
                return Unit.f186387a;
            default:
                n1 n1Var = (n1) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Parcelable parcelableA = n1Var.a().a();
                GroupChatSettingsScreenModel$StatusViewSuccessPayload groupChatSettingsScreenModel$StatusViewSuccessPayload = parcelableA instanceof GroupChatSettingsScreenModel$StatusViewSuccessPayload ? (GroupChatSettingsScreenModel$StatusViewSuccessPayload) parcelableA : null;
                if (groupChatSettingsScreenModel$StatusViewSuccessPayload != null) {
                    dVar.H2(dVar.C, new pp5.d(groupChatSettingsScreenModel$StatusViewSuccessPayload, 20));
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException(com.revolut.data.database.models.openbanking.d.s("StatusDialog Result not supported: ", n1Var));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
        }
    }
}
