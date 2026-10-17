package ael;

import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class w0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3673a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f3674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3675c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ w0(int i, b1 b1Var, Function1 function1) {
        this.f3675c = i;
        this.f3674b = b1Var;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f3673a) {
            case 0:
                wbl.k statement = (wbl.k) obj2;
                Intrinsics.checkNotNullParameter(statement, "statement");
                int i = z0.f3686c[statement.f296270a.ordinal()];
                if (i == 1) {
                    return efm.d0.m(statement);
                }
                if (i == 2) {
                    return efm.d0.l(new IllegalStateException());
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                int i2 = this.f3675c;
                Function1 function1 = this.d;
                return i2 > 0 ? new ufm.i(efm.d0.u(2000L, TimeUnit.MILLISECONDS, hhm.f.f152430b), new aed.f(new w0(this.f3674b, i2, function1), 17), 0) : new ufm.c(new v0(1, function1), 0);
            default:
                Long it8 = (Long) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                int i3 = this.f3675c - 1;
                Function1 function12 = this.d;
                ufm.i iVar = new ufm.i(new ufm.c(new v0(0, function12), 0), new aed.f(new w0(i3, this.f3674b, function12), 12), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return iVar;
        }
    }

    public /* synthetic */ w0(b1 b1Var, int i, Function1 function1) {
        this.f3674b = b1Var;
        this.f3675c = i;
        this.d = function1;
    }
}
