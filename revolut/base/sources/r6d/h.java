package r6d;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.kompot.common.R$string;
import ip0.zj;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o9c.q;
import o9c.z;
import s86.n;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zx0.n;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251672a;

    public /* synthetic */ h(int i) {
        this.f251672a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws Throwable {
        int i = this.f251672a;
        odc.d dVar = odc.d.f224442a;
        switch (i) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null));
            case 1:
                Throwable error = (Throwable) obj2;
                psg.a aVar = (psg.a) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (aVar == null) {
                    return error;
                }
                return null;
            case 2:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 3:
                Throwable error2 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (bool == null) {
                    return error2;
                }
                return null;
            case 4:
                Throwable error3 = (Throwable) obj2;
                Set set = (Set) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (set == null) {
                    return error3;
                }
                return null;
            case 5:
                Throwable error4 = (Throwable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (bool2 == null) {
                    return error4;
                }
                return null;
            case 6:
                Throwable error5 = (Throwable) obj2;
                Map map = (Map) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (map == null) {
                    return error5;
                }
                return null;
            case 7:
                Throwable error6 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (list == null) {
                    return error6;
                }
                return null;
            case 8:
                Throwable error7 = (Throwable) obj2;
                Boolean bool3 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (bool3 == null) {
                    return error7;
                }
                return null;
            case 9:
                Throwable error8 = (Throwable) obj2;
                SavingsAccountDetails savingsAccountDetails = (SavingsAccountDetails) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (savingsAccountDetails == null) {
                    return error8;
                }
                return null;
            case 10:
                Throwable error9 = (Throwable) obj2;
                Boolean bool4 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (bool4 == null) {
                    return error9;
                }
                return null;
            case 11:
                Throwable th10 = (Throwable) obj2;
                if (((LoanBackupCard) obj3) == null) {
                    return th10;
                }
                return null;
            case 12:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new s86.i(n.f260919a, (List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, true, null)));
            case 13:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 14:
                Throwable error10 = (Throwable) obj2;
                of8.b bVar = (of8.b) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (bVar == null) {
                    return error10;
                }
                return null;
            case 15:
                Function1 function1 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(function1, "default");
                return (List) function1.invoke(new iii.d(14, null, false, false, null));
            case 16:
                Throwable error11 = (Throwable) obj2;
                JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (juniorBankingProfile == null) {
                    return error11;
                }
                return null;
            case 17:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new q(odc.n.c(dVar, null, m6c.c.PAY));
            case 18:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new q(odc.n.c(dVar, null, m6c.c.PAY));
            case 19:
                Throwable illegalStateException = (Throwable) obj2;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                f0 f0Var = f0.f322471a;
                if (illegalStateException == null) {
                    illegalStateException = new IllegalStateException("Unable to load spare change");
                }
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                return f0Var;
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return z.f223252a;
            case 21:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 22:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 23:
                Throwable th11 = (Throwable) obj3;
                if (((Boolean) obj2).booleanValue()) {
                    return n.b.f326008a;
                }
                if (th11 != null) {
                    return n.a.f326007a;
                }
                return null;
            case 24:
                Throwable th12 = (Throwable) obj2;
                if (((com.revolut.feature.junior_profile.api.models.a) obj3) == null) {
                    return th12;
                }
                return null;
            case 25:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(12, null, true, true, null));
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ERROR_BLOCK_ID", new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_error_state_description, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), false, null, null, false, 0, 0, 31680);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return u.c(model);
            case 27:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 28:
                Throwable th13 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                if (th13 == null) {
                    return f0.f322471a;
                }
                throw th13;
            default:
                Throwable error12 = (Throwable) obj2;
                Set set2 = (Set) obj3;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (set2 == null) {
                    return error12;
                }
                return null;
        }
    }

    public /* synthetic */ h(Object obj2, int i) {
        this.f251672a = i;
    }
}
