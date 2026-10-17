package ru5;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.i7;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f257428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f257429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a3 f257430c;

    public /* synthetic */ n(z zVar, a3 a3Var, int i) {
        this.f257428a = i;
        this.f257429b = zVar;
        this.f257430c = a3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f257428a;
        a3 a3Var = this.f257430c;
        z zVar = this.f257429b;
        switch (i) {
            case 0:
                i7 baseFilter = (i7) obj2;
                Intrinsics.checkNotNullParameter(baseFilter, "baseFilter");
                List list = ((j) zVar.t2()).f257420h;
                i7 i7VarA = list != null ? zVar.v.a(list) : null;
                i7 i7Var = zVar.f257438p.f;
                if (i7Var != null && i7VarA != null) {
                    i7.Companion.getClass();
                    i7VarA = i7.c.a(i7Var, i7VarA);
                } else if (i7Var != null) {
                    i7VarA = i7Var;
                }
                if (i7VarA != null) {
                    i7.Companion.getClass();
                    baseFilter = i7.c.a(baseFilter, i7VarA);
                }
                return new pfm.h(new r2d.e(zVar, 2, a3Var, baseFilter), 2);
            default:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new pfm.h(new phc.d(zVar, a3Var, 29), 2);
        }
    }
}
