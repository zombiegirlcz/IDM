package o1a;

import com.revolut.core.model.account.AccountId;
import gim.i;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.payments.splitbill.impl.ui_new.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Map f221372w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ArrayList f221373x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AccountId.Joint f221374y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.payments.splitbill.impl.ui_new.e eVar, Map map, ArrayList arrayList, AccountId.Joint joint, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
        this.f221372w = map;
        this.f221373x = arrayList;
        this.f221374y = joint;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.v, this.f221372w, this.f221373x, this.f221374y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e8  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o1a.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
