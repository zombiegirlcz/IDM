package vtf;

import com.revolut.domain.models.moneyrequest.MoneyRequestChannel;
import com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData;
import do3.n;
import efm.d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import te0.w;
import ufm.i;
import vrl.i0;
import vrl.v0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292105a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferRequestApprovalData f292106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f292107c;

    public /* synthetic */ a(TransferRequestApprovalData transferRequestApprovalData, f fVar) {
        this.f292106b = transferRequestApprovalData;
        this.f292107c = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        d0 d0VarM;
        switch (this.f292105a) {
            case 0:
                Boolean hasSufficientBalance = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(hasSufficientBalance, "hasSufficientBalance");
                boolean zBooleanValue = hasSufficientBalance.booleanValue();
                f fVar = this.f292107c;
                TransferRequestApprovalData transferRequestApprovalData = this.f292106b;
                if (zBooleanValue) {
                    i iVar = new i(fVar.f292116b.f(false), new v0(9, new a(transferRequestApprovalData, fVar)), 0);
                    Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                    return new i(iVar, new v0(16, new i0(7)), 1);
                }
                if (transferRequestApprovalData instanceof TransferRequestApprovalData.GroupBillsApproval) {
                    d0VarM = fVar.c(((TransferRequestApprovalData.GroupBillsApproval) transferRequestApprovalData).f92450b);
                } else {
                    if (!(transferRequestApprovalData instanceof TransferRequestApprovalData.MoneyRequestApproval)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MoneyRequestChannel moneyRequestChannel = ((TransferRequestApprovalData.MoneyRequestApproval) transferRequestApprovalData).f92452b.f60316c;
                    if (moneyRequestChannel instanceof MoneyRequestChannel.Revolut) {
                        d0VarM = fVar.c(transferRequestApprovalData.f92449a);
                    } else if (moneyRequestChannel instanceof MoneyRequestChannel.APM) {
                        d0VarM = d0.m(Boolean.FALSE);
                        Intrinsics.checkNotNullExpressionValue(d0VarM, "just(...)");
                    } else {
                        if (!(moneyRequestChannel instanceof MoneyRequestChannel.BankBeneficiary)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d0VarM = d0.m(Boolean.FALSE);
                        Intrinsics.checkNotNullExpressionValue(d0VarM, "just(...)");
                    }
                }
                return new i(d0VarM, new v0(17, new i0(8)), 0);
            default:
                n user = (n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                return w.o0(p0.f264003c, new d(this.f292106b, this.f292107c, user, null));
        }
    }

    public /* synthetic */ a(f fVar, TransferRequestApprovalData transferRequestApprovalData) {
        this.f292107c = fVar;
        this.f292106b = transferRequestApprovalData;
    }
}
