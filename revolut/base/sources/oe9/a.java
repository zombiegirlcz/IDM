package oe9;

import com.revolut.data.model.Data;
import kotlin.Unit;
import vkm.z1;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1 f224564a = ta6.a.a(0);

    public final Object a(Data data, gim.c cVar) throws Throwable {
        Object objEmit = this.f224564a.emit(data, cVar);
        return objEmit == fim.a.COROUTINE_SUSPENDED ? objEmit : Unit.f186387a;
    }
}
