package nm5;

import com.revolut.feature.crypto.tfr.validation.impl.data.models.CounterpartyUpdateData;
import gim.i;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import n8a.r;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f217178a;

    public g(b repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f217178a = repository;
    }

    public final Object a(String str, CounterpartyUpdateData counterpartyUpdateData, i iVar) throws Throwable {
        b bVar = this.f217178a;
        bVar.getClass();
        r rVar = new r(bVar, str, counterpartyUpdateData, null, 16);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, rVar, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }
}
