package q65;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.api.models.LoanRepaymentDayChangeTerms;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f242500a = new k();

    public k() {
        super(1, Data.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Throwable;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return new Data((LoanRepaymentDayChangeTerms) obj2, null, false, 6, null);
    }
}
