package et6;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final au6.o2 f129262a;

    public k3(au6.o2 freelancerSettingsRepository) {
        Intrinsics.checkNotNullParameter(freelancerSettingsRepository, "freelancerSettingsRepository");
        this.f129262a = freelancerSettingsRepository;
    }

    public final Object a(String str, gim.i iVar) throws Throwable {
        au6.o2 o2Var = this.f129262a;
        o2Var.getClass();
        au6.n2 n2Var = new au6.n2(o2Var, str, null, 0);
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, n2Var, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }
}
