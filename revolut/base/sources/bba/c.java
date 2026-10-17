package bba;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.pix.impl.flow.pix_area.screens.send.PixSendScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PixSendScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PixSendScreen pixSendScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pixSendScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.u
            com.revolut.core.ui_kit.delegates.RowDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.RowDelegate.Model) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r5)
            com.revolut.feature.pix.impl.flow.pix_area.screens.send.PixSendScreen r5 = r4.v
            bba.k r5 = r5.d()
            kotlin.jvm.internal.Intrinsics.h(r0)
            bba.s r5 = (bba.s) r5
            r5.getClass()
            java.lang.String r1 = "model"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = r0.f53228a
            java.lang.Object r2 = r0.u
            int r3 = r1.hashCode()
            switch(r3) {
                case -2042519211: goto L8c;
                case -1898929585: goto L71;
                case 646368293: goto L44;
                case 1577518970: goto L29;
                default: goto L27;
            }
        L27:
            goto L94
        L29:
            java.lang.String r0 = "CPF_TYPE_ID"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L32
            goto L94
        L32:
            boolean r0 = r2 instanceof com.revolut.apm.pix.validation.api.PixIdentifiedType.CpfOrBrazilianLocalPhoneAmbiguous
            if (r0 == 0) goto Lb3
            com.revolut.apm.pix.validation.api.PixIdentifiedType$Valid$Cpf r0 = new com.revolut.apm.pix.validation.api.PixIdentifiedType$Valid$Cpf
            com.revolut.apm.pix.validation.api.PixIdentifiedType$CpfOrBrazilianLocalPhoneAmbiguous r2 = (com.revolut.apm.pix.validation.api.PixIdentifiedType.CpfOrBrazilianLocalPhoneAmbiguous) r2
            java.lang.String r1 = r2.f50351b
            r0.<init>(r1)
            r5.I2(r0)
            goto Lb3
        L44:
            java.lang.String r0 = "SEND_KEY_LIST_ID"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L4d
            goto L94
        L4d:
            boolean r0 = r2 instanceof com.revolut.apm.pix.validation.api.PixIdentifiedType.Valid
            if (r0 == 0) goto L57
            com.revolut.apm.pix.validation.api.PixIdentifiedType$Valid r2 = (com.revolut.apm.pix.validation.api.PixIdentifiedType.Valid) r2
            r5.I2(r2)
            goto Lb3
        L57:
            boolean r0 = r2 instanceof com.revolut.apm.pix.validation.api.PixIdentifiedType.CpfOrBrazilianLocalPhoneAmbiguous
            if (r0 == 0) goto Lb3
            j60.a r0 = r5.u
            bba.n r5 = r5.f14220s
            com.revolut.apm.pix.validation.api.PixIdentifiedType$CpfOrBrazilianLocalPhoneAmbiguous r2 = (com.revolut.apm.pix.validation.api.PixIdentifiedType.CpfOrBrazilianLocalPhoneAmbiguous) r2
            r5.getClass()
            java.lang.String r5 = "ambiguousKey"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            rp0.y r5 = yca.o.b(r2)
            r0.x(r5)
            goto Lb3
        L71:
            java.lang.String r0 = "PHONE_TYPE_ID"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L7a
            goto L94
        L7a:
            boolean r0 = r2 instanceof com.revolut.apm.pix.validation.api.PixIdentifiedType.CpfOrBrazilianLocalPhoneAmbiguous
            if (r0 == 0) goto Lb3
            com.revolut.apm.pix.validation.api.PixIdentifiedType$Valid$Phone r0 = new com.revolut.apm.pix.validation.api.PixIdentifiedType$Valid$Phone
            com.revolut.apm.pix.validation.api.PixIdentifiedType$CpfOrBrazilianLocalPhoneAmbiguous r2 = (com.revolut.apm.pix.validation.api.PixIdentifiedType.CpfOrBrazilianLocalPhoneAmbiguous) r2
            java.lang.String r1 = r2.f50350a
            r2 = 0
            r0.<init>(r1, r2)
            r5.I2(r0)
            goto Lb3
        L8c:
            java.lang.String r3 = "SEND_QR_LIST_ID"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto La3
        L94:
            boolean r0 = r2 instanceof f5j.a
            if (r0 == 0) goto Lb3
            bba.h r0 = new bba.h
            f5j.a r2 = (f5j.a) r2
            r0.<init>(r2)
            r5.C2(r0)
            goto Lb3
        La3:
            b9i.f r1 = new b9i.f
            r2 = 8
            r1.<init>(r5, r2)
            bba.r r2 = new bba.r
            r3 = 0
            r2.<init>(r5, r0, r3)
            r5.l2(r2, r1)
        Lb3:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bba.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
