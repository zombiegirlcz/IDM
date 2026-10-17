package ww4;

import com.revolut.feature.credit.card.impl.widget.statement.CreditCardStatementWidgetMapper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f300599a;

    public b(f fVar, String str) {
        this.f300599a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Function0 it8 = (Function0) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return CreditCardStatementWidgetMapper.b(this.f300599a);
    }
}
