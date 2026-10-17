package ie6;

import com.revolut.core.error.data.model.ServerErrorException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f160640b;

    public /* synthetic */ j(r rVar, int i) {
        this.f160639a = i;
        this.f160640b = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f160639a;
        r rVar = this.f160640b;
        switch (i) {
            case 0:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return Boolean.valueOf(rVar.J2(throwable));
            case 1:
                Throwable throwable2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable2, "throwable");
                return Boolean.valueOf(rVar.J2(throwable2));
            case 2:
                Throwable throwable3 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable3, "throwable");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable3, h0Var);
                if (throwable3 instanceof ServerErrorException) {
                    rVar.K2();
                } else {
                    rVar.H2(rVar.f160648q, new id8.a(10));
                }
                return Boolean.TRUE;
            default:
                rVar.C2(aii.q.f5292a);
                return Unit.f186387a;
        }
    }
}
