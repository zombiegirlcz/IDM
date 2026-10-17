package yg6;

import com.revolut.data.model.Data;
import com.revolut.feature.external_accounts.api.model.LinkedAccountPayload;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function3 {
    public /* synthetic */ List u;
    public /* synthetic */ Data v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f313549w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ LinkedAccountPayload f313550x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f313551y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, LinkedAccountPayload linkedAccountPayload, k kVar, String str2, Continuation continuation) {
        super(3, continuation);
        this.f313549w = str;
        this.f313550x = linkedAccountPayload;
        this.f313551y = kVar;
        this.z = str2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        k kVar = this.f313551y;
        String str = this.z;
        j jVar = new j(this.f313549w, this.f313550x, kVar, str, (Continuation) obj4);
        jVar.u = (List) obj2;
        jVar.v = (Data) obj3;
        return jVar.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yg6.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
