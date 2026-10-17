package ryd;

import com.revolut.feature.statements.api.models.StatementsFormat;
import java.time.LocalDate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import uyd.h0;
import uyd.i0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f258342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f258343c;
    public final /* synthetic */ LocalDate d;
    public final /* synthetic */ StatementsFormat e;

    public /* synthetic */ h(w wVar, LocalDate localDate, LocalDate localDate2, StatementsFormat statementsFormat, int i) {
        this.f258341a = i;
        this.f258342b = wVar;
        this.f258343c = localDate;
        this.d = localDate2;
        this.e = statementsFormat;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f258341a;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        switch (i) {
            case 0:
                h0 h0Var = (h0) this.f258342b.f258357a;
                h0Var.getClass();
                LocalDate fromDate = this.f258343c;
                Intrinsics.checkNotNullParameter(fromDate, "fromDate");
                LocalDate toDate = this.d;
                Intrinsics.checkNotNullParameter(toDate, "toDate");
                StatementsFormat format = this.e;
                Intrinsics.checkNotNullParameter(format, "format");
                return h0Var.f284191g.e(new uyd.g(fromDate, toDate, format, zBooleanValue), w4l.i.f294643c);
            case 1:
                h0 h0Var2 = (h0) this.f258342b.f258357a;
                h0Var2.getClass();
                LocalDate fromDate2 = this.f258343c;
                Intrinsics.checkNotNullParameter(fromDate2, "fromDate");
                LocalDate toDate2 = this.d;
                Intrinsics.checkNotNullParameter(toDate2, "toDate");
                StatementsFormat format2 = this.e;
                Intrinsics.checkNotNullParameter(format2, "format");
                return h0Var2.f284192h.e(new uyd.h(fromDate2, toDate2, format2, zBooleanValue), w4l.i.f294643c);
            default:
                h0 h0Var3 = (h0) this.f258342b.f258357a;
                h0Var3.getClass();
                LocalDate fromDate3 = this.f258343c;
                Intrinsics.checkNotNullParameter(fromDate3, "fromDate");
                LocalDate toDate3 = this.d;
                Intrinsics.checkNotNullParameter(toDate3, "toDate");
                StatementsFormat format3 = this.e;
                Intrinsics.checkNotNullParameter(format3, "format");
                return h0Var3.u.e(new i0(fromDate3, toDate3, format3, zBooleanValue), w4l.i.f294643c);
        }
    }
}
