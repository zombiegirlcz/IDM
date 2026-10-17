package eam;

import android.content.Intent;
import cam.c;
import financial.atomic.transact.activity.TransactActivity;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransactActivity f124275w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(TransactActivity transactActivity, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f124275w = transactActivity;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a aVar = new a(this.f124275w, continuation, 0);
                aVar.v = obj2;
                return aVar;
            default:
                a aVar2 = new a(this.f124275w, continuation, 1);
                aVar2.v = obj2;
                return aVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        c cVar = (c) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(cVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TransactActivity transactActivity = this.f124275w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                c cVar = (c) this.v;
                Intent intent = new Intent();
                JSONObject jSONObject = (JSONObject) cVar.f22670b;
                intent.putExtra("reason", jSONObject != null ? jSONObject.optString("reason") : null);
                Unit unit = Unit.f186387a;
                transactActivity.setResult(0, intent);
                transactActivity.finish();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                c cVar2 = (c) this.v;
                Intent intent2 = new Intent();
                JSONObject jSONObject2 = (JSONObject) cVar2.f22670b;
                intent2.putExtra("taskId", jSONObject2 != null ? jSONObject2.optString("taskId") : null);
                Unit unit2 = Unit.f186387a;
                transactActivity.setResult(-1, intent2);
                transactActivity.finish();
                break;
        }
        return Unit.f186387a;
    }
}
