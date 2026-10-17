package bx8;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.kyc.impl.screens.documentid_input.KYCDocumentIdInputScreen;
import com.revolut.feature.kyc.impl.screens.documentid_input.KYCDocumentIdInputScreenContract$FormField;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ KYCDocumentIdInputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(KYCDocumentIdInputScreen kYCDocumentIdInputScreen, Continuation continuation) {
        super(2, continuation);
        this.v = kYCDocumentIdInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarE3 = this.v.R2();
        String listId = textData.f52597a;
        String text = textData.f52598b.toString();
        com.revolut.feature.kyc.impl.screens.documentid_input.b bVar = (com.revolut.feature.kyc.impl.screens.documentid_input.b) qVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        Iterator it8 = ((m) ((j2) bVar.u.f22677a).getValue()).f19522b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((KYCDocumentIdInputScreenContract$FormField) next).f77860a.e, listId)) {
                break;
            }
        }
        KYCDocumentIdInputScreenContract$FormField kYCDocumentIdInputScreenContract$FormField = (KYCDocumentIdInputScreenContract$FormField) next;
        if (kYCDocumentIdInputScreenContract$FormField != null) {
            bVar.J2(kYCDocumentIdInputScreenContract$FormField, KYCDocumentIdInputScreenContract$FormField.a(kYCDocumentIdInputScreenContract$FormField, text, null, false, null, null, 61));
        }
        return Unit.f186387a;
    }
}
