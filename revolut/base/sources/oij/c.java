package oij;

import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$InputData;
import fij.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ogm.i;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225696a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EsimGetPlanScreenContract$InputData f225697b;

    public /* synthetic */ c(EsimGetPlanScreenContract$InputData esimGetPlanScreenContract$InputData) {
        this.f225697b = esimGetPlanScreenContract$InputData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        p it8 = (p) obj2;
        switch (this.f225696a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(i.d(it8.f135451a) == this.f225697b.f100994b);
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(Intrinsics.f(it8.f135452b.f100221p.getF100209b().f100235a, this.f225697b.f100993a));
        }
    }

    public /* synthetic */ c(i iVar, EsimGetPlanScreenContract$InputData esimGetPlanScreenContract$InputData) {
        this.f225697b = esimGetPlanScreenContract$InputData;
    }
}
