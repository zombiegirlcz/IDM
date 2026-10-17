package tbk;

import gim.i;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wbk.e f269555a;

    public e(wbk.e repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f269555a = repository;
    }

    public final Object a(String str, String str2, i iVar) {
        Object objCancelGift = this.f269555a.f296244a.cancelGift(str, str2, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objCancelGift != aVar) {
            objCancelGift = Unit.f186387a;
        }
        return objCancelGift == aVar ? objCancelGift : Unit.f186387a;
    }
}
