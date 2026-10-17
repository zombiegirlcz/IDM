package sef;

import com.revolut.data.model.Data;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.add_note.AddNoteScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kef.a f262195p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f262196q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p stateMapper, AddNoteScreenContract$InputData inputData, kef.a interactor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f262195p = interactor;
        this.f262196q = new f(new Data(null, null, false, 7, null), inputData.f91823a, "");
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f262196q;
    }

    public final void y2() {
        String transactionId = ((f) t2()).f262187a;
        String message = ((f) t2()).f262188b;
        kef.a aVar = this.f262195p;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(message, "message");
        nef.d dVar = aVar.f183064a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(message, "message");
        l.a1(this, rd0.e.b(dVar.i.f(new pef.b(transactionId, message), true)), null, null, new se4.c(this, null, 1), 3);
    }
}
