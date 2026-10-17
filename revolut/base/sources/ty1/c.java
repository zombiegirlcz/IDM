package ty1;

import com.revolut.feature.insurance_pet.impl.ui.edit.details.PetEditDetailsContract$ConfirmPetEditUpdateQuoteAction;
import com.revolut.feature.selfserve.sot.impl.ui.document.other.SotOtherDocumentFragment;
import com.revolut.feature.selfserve.sow.impl.ui.description.SowDescriptionFragment;
import com.revolut.feature.statements.impl.ui.crypto_statement.screen.CryptoStatementScreen;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.payment_options.impl.ui.screens.vault.PaymentOptionsVaultWithdrawalScreen;
import efm.h0;
import java.util.List;
import kfm.o;
import kfm.p;
import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import q06.j;
import s78.n;
import tx.f;
import tx0.p4;
import uw1.g;
import vf0.h;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class c implements o, kfm.c, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f275457b;

    public /* synthetic */ c(Function function, int i) {
        this.f275456a = i;
        this.f275457b = function;
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) throws Throwable {
        int i = this.f275456a;
        Function function = this.f275457b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (g) ((f) function).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (uw1.a) ((f) function).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((f) function).invoke(p0);
            case 3:
            case 15:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((tyg.g) function).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((n) function).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (uw1.d) ((f) function).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((f) function).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((ty7.g) function).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (PetEditDetailsContract$ConfirmPetEditUpdateQuoteAction) ((ty7.g) function).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((ty7.g) function).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h) ((twg.a) function).invoke(p0);
            case 11:
                int i2 = SotOtherDocumentFragment.g0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CharSequence) ((f) function).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((p4) function).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((pud.b) function).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((t9f.n) function).invoke(p0);
                return Boolean.TRUE;
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) ((te8.a) function).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((p4) function).invoke(p0);
                return Boolean.TRUE;
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((cia.d) function).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (j) ((f) function).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((tyg.g) function).invoke(p0);
            case 21:
                int i3 = SowDescriptionFragment.g0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CharSequence) ((tyg.g) function).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((tzc.g) function).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((tzc.g) function).invoke(p0);
            case 24:
                KProperty[] kPropertyArr = CryptoStatementScreen.T;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((tyg.g) function).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (tzd.p) ((tyg.g) function).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((twg.a) function).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((twg.a) function).invoke(p0);
            case 28:
                KProperty[] kPropertyArr2 = PaymentOptionsVaultWithdrawalScreen.f101889e0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((tyg.g) function).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        f fVar = (f) this.f275457b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) fVar.invoke(p0)).booleanValue();
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        tw8.g gVar = (tw8.g) this.f275457b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (Boolean) gVar.invoke(p0, p17);
    }
}
