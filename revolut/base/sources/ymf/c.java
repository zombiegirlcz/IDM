package ymf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.FileImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.feature.transactions.impl.ui.kompot.receipts.ReceiptsScreen;
import com.revolut.feature.view.image.api.navigation.ViewImageDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.revolut.feature_fourthline_impl.R;
import d9.t0;
import ip0.b8;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jmrtd.lds.LDSFile;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ReceiptsScreen f314975w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ReceiptsScreen receiptsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f314975w = receiptsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f314975w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f314975w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        b8 b8Var = (b8) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(b8Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ReceiptsScreen receiptsScreen = this.f314975w;
        switch (i) {
            case 0:
                b8 b8Var = (b8) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVar = (f) receiptsScreen.N.getValue();
                File file = b8Var.f;
                k kVar = (k) fVar;
                kVar.getClass();
                if (file == null) {
                    file = null;
                }
                if (file != null) {
                    if (t0.m(file)) {
                        kVar.C1(kVar.f314986r.a(file));
                    } else {
                        kVar.C1(new ViewImageDestination(new ViewImageDestination.InputData.Gallery(u.c(new FileImage(file, (FileImage.Placeholder) null, new ImageTransformations(null, null, null, gz0.b.FitCenter, null, null, null, LDSFile.EF_SOD_TAG), 10)), 0)));
                    }
                }
                break;
            default:
                b8 b8Var2 = (b8) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVar2 = (f) receiptsScreen.N.getValue();
                File file2 = b8Var2.f;
                k kVar2 = (k) fVar2;
                kVar2.getClass();
                if (file2 == null) {
                    file2 = null;
                }
                if (file2 != null) {
                    kVar2.f2(bmf.a.b(kVar2.f314985q, new TextLocalisedClause(R$string.transactionUI_transaction_details_attachment_delete_title, null, null, 14), new TextLocalisedClause(R$string.transactionUI_transaction_details_attachment_delete_subtitle, null, null, 14), new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), null, new TextLocalisedClause(R.string.common_action_confirm, null, null, 14), null, 472), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new yj2.b(kVar2, file2, 9));
                }
                break;
        }
        return Unit.f186387a;
    }
}
