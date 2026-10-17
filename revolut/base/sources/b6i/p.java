package b6i;

import com.revolut.feature.insurance_pet.impl.ui.add.step.breed.PetBreedDetailsContract$BreedParam;
import com.revolut.feature.insurance_pet.impl.ui.planbuilder.PetPlanBuilderFlowContract$PlanBuilderAction;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements oim.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12809b;

    public /* synthetic */ p(Object obj2, int i) {
        this.f12808a = i;
        this.f12809b = obj2;
    }

    @Override // oim.o
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        switch (this.f12808a) {
            case 0:
                com.revolut.feature_move_money.impl.amount.c cVar = (com.revolut.feature_move_money.impl.amount.c) this.f12809b;
                AccountWrapper sourceAccount = (AccountWrapper) obj2;
                AccountWrapper targetAccount = (AccountWrapper) obj3;
                long jLongValue = ((Long) obj4).longValue();
                j8l.d buyMode = (j8l.d) obj5;
                OrderQuote orderQuote = (OrderQuote) obj6;
                Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
                Intrinsics.checkNotNullParameter(targetAccount, "targetAccount");
                Intrinsics.checkNotNullParameter(buyMode, "buyMode");
                Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
                return zh9.u0.c(((c8i.z) cVar.v).b(sourceAccount, targetAccount, jLongValue, buyMode == j8l.d.SELL, orderQuote, m6i.y.b(sourceAccount), cVar.Q2().f12787h));
            case 1:
                com.revolut.feature_move_money.impl.amount.c cVar2 = (com.revolut.feature_move_money.impl.amount.c) this.f12809b;
                AccountWrapper sourceAccount2 = (AccountWrapper) obj2;
                AccountWrapper targetAccount2 = (AccountWrapper) obj3;
                long jLongValue2 = ((Long) obj4).longValue();
                j8l.d buyMode2 = (j8l.d) obj5;
                OrderQuote orderQuote2 = (OrderQuote) obj6;
                Intrinsics.checkNotNullParameter(sourceAccount2, "sourceAccount");
                Intrinsics.checkNotNullParameter(targetAccount2, "targetAccount");
                Intrinsics.checkNotNullParameter(buyMode2, "buyMode");
                Intrinsics.checkNotNullParameter(orderQuote2, "orderQuote");
                return zh9.u0.c(((c8i.z) cVar2.v).c(sourceAccount2, targetAccount2, jLongValue2, buyMode2 == j8l.d.SELL, orderQuote2.f104755g.f104732b, m6i.y.b(sourceAccount2), cVar2.Q2().f12787h));
            default:
                String str = (String) this.f12809b;
                String name = (String) obj2;
                zw7.c0 type = (zw7.c0) obj3;
                zw7.z gender = (zw7.z) obj4;
                PetBreedDetailsContract$BreedParam breed = (PetBreedDetailsContract$BreedParam) obj5;
                Date startDate = (Date) obj6;
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(gender, "gender");
                Intrinsics.checkNotNullParameter(breed, "breed");
                Intrinsics.checkNotNullParameter(startDate, "startDate");
                return new PetPlanBuilderFlowContract$PlanBuilderAction(str, name, type, gender, breed.f76233b, startDate);
        }
    }
}
