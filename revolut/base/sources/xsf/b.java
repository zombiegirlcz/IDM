package xsf;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.transfer_reasons.impl.ui.additional_info.TransferReasonsAdditionalInfoScreen;
import com.revolut.kompot.common.R$id;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f308462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferReasonsAdditionalInfoScreen f308463b;

    public /* synthetic */ b(TransferReasonsAdditionalInfoScreen transferReasonsAdditionalInfoScreen, int i) {
        this.f308462a = i;
        this.f308463b = transferReasonsAdditionalInfoScreen;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        qd0.b bVarN;
        int i = this.f308462a;
        TransferReasonsAdditionalInfoScreen transferReasonsAdditionalInfoScreen = this.f308463b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = TransferReasonsAdditionalInfoScreen.T;
                TransferReasonsAdditionalInfoScreen transferReasonsAdditionalInfoScreen2 = this.f308463b;
                return tki.g.a(transferReasonsAdditionalInfoScreen2, transferReasonsAdditionalInfoScreen2.R2(), zhm.v.k((InputTextDelegate) transferReasonsAdditionalInfoScreen2.Q.getValue(), (RowDelegate) transferReasonsAdditionalInfoScreen2.R.getValue(), (SelectableDelegate) transferReasonsAdditionalInfoScreen2.S.getValue()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, new b(transferReasonsAdditionalInfoScreen2, 1), 24);
            case 1:
                KProperty[] kPropertyArr2 = TransferReasonsAdditionalInfoScreen.T;
                return rd0.e.b(((InputTextDelegate) transferReasonsAdditionalInfoScreen.Q.getValue()).e.f121375b);
            case 2:
                KProperty[] kPropertyArr3 = TransferReasonsAdditionalInfoScreen.T;
                nsf.j jVar = (nsf.j) transferReasonsAdditionalInfoScreen.M.getValue();
                switch (jVar.f218826a) {
                    case 0:
                        return (p) jVar.e.get();
                    default:
                        return (p) jVar.e.get();
                }
            case 3:
                KProperty[] kPropertyArr4 = TransferReasonsAdditionalInfoScreen.T;
                nsf.j jVar2 = (nsf.j) transferReasonsAdditionalInfoScreen.M.getValue();
                switch (jVar2.f218826a) {
                    case 0:
                        bVarN = jVar2.f218828c.k.n();
                        vc.s.j(bVarN);
                        break;
                    default:
                        bVarN = jVar2.f218828c.k.n();
                        vc.s.j(bVarN);
                        break;
                }
                return new u80.d(((s80.b) bVarN).b());
            case 4:
                KProperty[] kPropertyArr5 = TransferReasonsAdditionalInfoScreen.T;
                return new InputTextDelegate(new f(2, 0, TransferReasonsAdditionalInfoScreen.class, this.f308463b, "createMaskBinder", "createMaskBinder(Lcom/revolut/core/ui_kit/delegates/InputTextDelegate$Model;Lcom/revolut/core/ui_kit/views/input/InputText;)Lcom/revolut/core/ui_kit_core/inputtext/MaskingDelegate;"));
            default:
                KProperty[] kPropertyArr6 = TransferReasonsAdditionalInfoScreen.T;
                return new SelectableDelegate((RowDelegate) transferReasonsAdditionalInfoScreen.R.getValue());
        }
    }
}
