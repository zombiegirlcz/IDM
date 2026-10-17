package sc2;

import aw0.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.ApmIdentifier;
import com.revolut.feature.apm.core.models.recipients.ApmRecipientSettings;
import com.revolut.feature.apm.core.models.recipients.QvikContact;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import eii.i;
import eii.k;
import java.io.IOException;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n61.j;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.qvik.impl.ui.new_recipient.a f261623b;

    public /* synthetic */ e(com.revolut.feature.apm.qvik.impl.ui.new_recipient.a aVar, int i) {
        this.f261622a = i;
        this.f261623b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws IOException {
        String descriptor;
        switch (this.f261622a) {
            case 0:
                k result = (k) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                i iVar = result instanceof i ? (i) result : null;
                if (iVar != null) {
                    Object obj3 = iVar.f126655a;
                    d dVar = obj3 instanceof d ? (d) obj3 : null;
                    if (dVar != null) {
                        int i = f.f261624a[dVar.ordinal()];
                        com.revolut.feature.apm.qvik.impl.ui.new_recipient.a aVar = this.f261623b;
                        if (i == 1) {
                            wi0.b.Companion.getClass();
                            wi0.b bVar = wi0.b.I0;
                            xi0.b.Companion.getClass();
                            ViewController viewControllerE1 = aVar.e1(new com.revolut.retail.feature.beneficiary.api.navigation.a(new BeneficiaryCreationKompotInputData.CreationConfiguration.LockedCountryCurrency(bVar, xi0.b.o, null, h0.f322473a)));
                            e block = new e(aVar, 1);
                            Intrinsics.checkNotNullParameter(block, "block");
                            viewControllerE1.H = block;
                            aVar.C1(new com.revolut.kompot.common.b(viewControllerE1, (ModalDestination.Style) null, 6));
                        } else {
                            if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar.C1(new com.revolut.kompot.common.b(aVar.e1(aVar.f62813q.a(aVar.o.f261621a, false, null)), (ModalDestination.Style) null, 6));
                            aVar.B2();
                        }
                    }
                }
                return Unit.f186387a;
            default:
                x2j.b result2 = (x2j.b) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                f5j.a beneficiary = result2.f302597a;
                com.revolut.feature.apm.qvik.impl.ui.new_recipient.a aVar2 = this.f261623b;
                j8 j8VarC = aVar2.f62814r.c(beneficiary);
                Map map = beneficiary.u;
                if (map == null || (descriptor = (String) map.get("IBAN")) == null) {
                    descriptor = map != null ? (String) map.get("ACCOUNT_NUMBER") : null;
                    if (descriptor == null) {
                        Clause clause = j8VarC.f10376b;
                        descriptor = clause != null ? aVar2.f62815s.b(clause).toString() : null;
                        if (descriptor == null) {
                            descriptor = "";
                        }
                    }
                }
                QvikContact.INSTANCE.getClass();
                Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                aVar2.C1(new com.revolut.kompot.common.b(aVar2.e1(aVar2.f62812p.g(new QvikContact((ApmIdentifier) new ApmIdentifier.Uuid(beneficiary.f132329a), (ApmDescriptor) new ApmDescriptor.BankAccount.Default(descriptor), j.c(beneficiary), (String) null, (String) null, (ApmContact.SimpleState) ApmContact.State.ACTIVE.f62099a, true, (ApmRecipientSettings) null, beneficiary, 256), aVar2.o.f261621a, new TransferMoneyPocket(null, null, 3))), (ModalDestination.Style) null, 6));
                aVar2.B2();
                return Unit.f186387a;
        }
    }
}
