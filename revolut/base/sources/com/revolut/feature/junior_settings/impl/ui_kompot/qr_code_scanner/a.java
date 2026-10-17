package com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner;

import com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.JuniorAuthQrScannerFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import tj9.d;
import vkm.q;
import w4l.j;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements Function1 {
    public b u;
    public yki.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f77318w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f77319x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.f77319x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f77319x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        b bVar;
        yki.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.f77318w;
        if (i == 0) {
            o.b(obj2);
            bVar = this.f77319x;
            yki.a aVar3 = bVar.f77322r;
            this.u = bVar;
            this.v = aVar3;
            this.f77318w = 1;
            Object objX = q.x(mo3.a.g(hj8.a.a(bVar.f77320p, bVar.o.f77312a, j.f294644c), null, new d(20), 1), this);
            if (objX == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            obj2 = objX;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = this.v;
            bVar = this.u;
            o.b(obj2);
        }
        JuniorAuthQrScannerFlowContract$Step.QrCodeInstructionsDialog qrCodeInstructionsDialog = new JuniorAuthQrScannerFlowContract$Step.QrCodeInstructionsDialog(((com.revolut.feature.junior_profile.api.models.a) obj2).getF77099b());
        bVar.getClass();
        h.w2(aVar, qrCodeInstructionsDialog, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
