package v94;

import android.net.Uri;
import com.revolut.core.model.FileExtension;
import com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.CreditPdfDocumentController;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ExternalDestination;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lim.m;
import org.jmrtd.lds.LDSFile;
import vkm.j2;
import yhm.o;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CreditPdfDocumentController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CreditPdfDocumentController creditPdfDocumentController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = creditPdfDocumentController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            case 1:
                return new e(this.v, continuation, 1);
            default:
                return new e(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CreditPdfDocumentController creditPdfDocumentController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.g) creditPdfDocumentController.d()).C2(i.f286977a);
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.g gVar = (com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.g) creditPdfDocumentController.d();
                zk0.b bVar = gVar.f67555q;
                File file = (File) ((g) ((j2) gVar.f67558t.f22677a).getValue()).f286975a.getContent();
                if (file != null) {
                    Uri uriI = ((a80.h) bVar).i(file);
                    Intrinsics.checkNotNullParameter(file, "file");
                    String strD = o80.c.d(file);
                    List listK = v.k(1, 1073741824);
                    if (gVar.f67556r.a(strD, uriI, listK)) {
                        Iterator it8 = listK.iterator();
                        if (!it8.hasNext()) {
                            throw new UnsupportedOperationException("Empty collection can't be reduced.");
                        }
                        Object next = it8.next();
                        while (it8.hasNext()) {
                            next = Integer.valueOf(((Number) next).intValue() | ((Number) it8.next()).intValue());
                        }
                        gVar.C1(new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", null, uriI, ((Number) next).intValue(), strD, 398));
                    } else {
                        String str = gVar.o.f67547a + "." + FileExtension.Pdf.f51406b;
                        Intrinsics.checkNotNullParameter(file, "file");
                        gVar.C1(new BridgeDestination(gVar.f67557s.h(new tqi.c(str, null, new tqi.b(str, m.d(file)), null, LDSFile.EF_DG2_TAG))));
                    }
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.g gVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.g) creditPdfDocumentController.d();
                gVar2.C2(new h(gVar2.o.f67547a));
                return Unit.f186387a;
        }
    }
}
