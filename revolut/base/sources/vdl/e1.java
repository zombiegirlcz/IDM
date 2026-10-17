package vdl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class e1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f287961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f287962b;

    public /* synthetic */ e1(h1 h1Var, int i) {
        this.f287961a = i;
        this.f287962b = h1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        switch (this.f287961a) {
            case 0:
                Throwable err = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(err, "err");
                ArrayList arrayListA = this.f287962b.a();
                if (arrayListA != null) {
                    return arrayListA;
                }
                throw err;
            case 1:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (List) this.f287962b.f287976a.get("STOCK_CONFIG");
            default:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return this.f287962b.a();
        }
    }
}
