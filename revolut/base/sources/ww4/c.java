package ww4;

import com.revolut.feature.credit.card.impl.widget.statement.CreditCardStatementWidgetMapper;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f300600a;

    public c(f fVar, String str) {
        this.f300600a = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
        return CreditCardStatementWidgetMapper.a(this.f300600a);
    }
}
