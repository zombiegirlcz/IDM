package qpf;

import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.e3;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f248379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f248380b;

    public /* synthetic */ a(d dVar, int i) {
        this.f248379a = i;
        this.f248380b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f248379a) {
            case 0:
                a3 transaction = (a3) obj2;
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                e3 e3Var = transaction.I.d;
                String str = e3Var != null ? e3Var.f272726a : null;
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                d dVar = this.f248380b;
                d0 d0VarFirstOrError = dVar.d.j(str, w4l.h.f294642c).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                return new ufm.i(zi0.c.s(d0VarFirstOrError), new qmd.c(20, new qpb.a(dVar, transaction, 1)), 0);
            default:
                NaviCommand command = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command, "command");
                return new pfm.h(new phc.d(this.f248380b, command, 20), 2);
        }
    }
}
