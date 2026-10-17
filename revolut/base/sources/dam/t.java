package dam;

import android.webkit.WebView;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f112594w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(s sVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f112594w = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                t tVar = new t(this.f112594w, continuation, 0);
                tVar.v = obj2;
                return tVar;
            case 1:
                t tVar2 = new t(this.f112594w, continuation, 1);
                tVar2.v = obj2;
                return tVar2;
            case 2:
                t tVar3 = new t(this.f112594w, continuation, 2);
                tVar3.v = obj2;
                return tVar3;
            case 3:
                t tVar4 = new t(this.f112594w, continuation, 3);
                tVar4.v = obj2;
                return tVar4;
            case 4:
                t tVar5 = new t(this.f112594w, continuation, 4);
                tVar5.v = obj2;
                return tVar5;
            case 5:
                t tVar6 = new t(this.f112594w, continuation, 5);
                tVar6.v = obj2;
                return tVar6;
            case 6:
                t tVar7 = new t(this.f112594w, continuation, 6);
                tVar7.v = obj2;
                return tVar7;
            case 7:
                t tVar8 = new t(this.f112594w, continuation, 7);
                tVar8.v = obj2;
                return tVar8;
            case 8:
                t tVar9 = new t(this.f112594w, continuation, 8);
                tVar9.v = obj2;
                return tVar9;
            case 9:
                t tVar10 = new t(this.f112594w, continuation, 9);
                tVar10.v = obj2;
                return tVar10;
            case 10:
                t tVar11 = new t(this.f112594w, continuation, 10);
                tVar11.v = obj2;
                return tVar11;
            case 11:
                t tVar12 = new t(this.f112594w, continuation, 11);
                tVar12.v = obj2;
                return tVar12;
            case 12:
                t tVar13 = new t(this.f112594w, continuation, 12);
                tVar13.v = obj2;
                return tVar13;
            default:
                t tVar14 = new t(this.f112594w, continuation, 13);
                tVar14.v = obj2;
                return tVar14;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        cam.c cVar = (cam.c) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((t) create(cVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        s sVar = this.f112594w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cam.c cVar = (cam.c) this.v;
                String str = sVar.f112590c;
                cVar.getClass();
                Object obj3 = cVar.f22670b;
                Objects.toString(obj3);
                JSONObject jSONObject = (JSONObject) obj3;
                if (jSONObject != null) {
                    sVar.H(m.NATIVE_HIDE.f112581a, jSONObject);
                }
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cam.c cVar2 = (cam.c) this.v;
                String str2 = sVar.f112590c;
                cVar2.getClass();
                Object obj4 = cVar2.f22670b;
                Objects.toString(obj4);
                JSONObject jSONObject2 = (JSONObject) obj4;
                if (jSONObject2 != null) {
                    sVar.H(m.UPDATE_DOM_STATE.f112581a, jSONObject2);
                }
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cam.c cVar3 = (cam.c) this.v;
                String str3 = sVar.f112590c;
                cVar3.getClass();
                Object obj5 = cVar3.f22670b;
                Objects.toString(obj5);
                JSONObject jSONObject3 = (JSONObject) obj5;
                if (jSONObject3 != null) {
                    sVar.H(m.RR_WEB_RESPONSE.f112581a, jSONObject3);
                }
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cam.c cVar4 = (cam.c) this.v;
                String str4 = sVar.f112590c;
                cVar4.getClass();
                Object obj6 = cVar4.f22670b;
                Objects.toString(obj6);
                JSONObject jSONObject4 = (JSONObject) obj6;
                if (jSONObject4 != null) {
                    sVar.H(m.INTERCEPTED_REQUEST.f112581a, jSONObject4);
                }
                break;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cam.c cVar5 = (cam.c) this.v;
                String str5 = sVar.f112590c;
                cVar5.getClass();
                Object obj7 = cVar5.f22670b;
                Objects.toString(obj7);
                JSONObject jSONObject5 = (JSONObject) obj7;
                if (jSONObject5 != null) {
                    sVar.H(m.LOG.f112581a, jSONObject5);
                }
                break;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cam.c cVar6 = (cam.c) this.v;
                String str6 = sVar.f112590c;
                cVar6.getClass();
                Object obj8 = cVar6.f22670b;
                Objects.toString(obj8);
                JSONObject jSONObject6 = (JSONObject) obj8;
                if (jSONObject6 != null) {
                    sVar.H(m.STORAGE_RESPONSE.f112581a, jSONObject6);
                }
                break;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cam.c cVar7 = (cam.c) this.v;
                String str7 = sVar.f112590c;
                cVar7.getClass();
                Object obj9 = cVar7.f22670b;
                Objects.toString(obj9);
                JSONObject jSONObject7 = (JSONObject) obj9;
                if (jSONObject7 != null) {
                    sVar.H(m.SDK_ERROR.f112581a, jSONObject7);
                }
                break;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cam.c cVar8 = (cam.c) this.v;
                String str8 = sVar.f112590c;
                cVar8.getClass();
                Object obj10 = cVar8.f22670b;
                Objects.toString(obj10);
                JSONObject jSONObject8 = (JSONObject) obj10;
                if (jSONObject8 != null) {
                    sVar.H(m.UPDATE_URL.f112581a, jSONObject8);
                }
                break;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cam.c cVar9 = (cam.c) this.v;
                String str9 = sVar.f112590c;
                cVar9.getClass();
                Object obj11 = cVar9.f22670b;
                Objects.toString(obj11);
                JSONObject jSONObject9 = (JSONObject) obj11;
                if (jSONObject9 != null) {
                    sVar.H(m.EVALUATE_RESPONSE.f112581a, jSONObject9);
                }
                break;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cam.c cVar10 = (cam.c) this.v;
                String str10 = sVar.f112590c;
                cVar10.getClass();
                Object obj12 = cVar10.f22670b;
                Objects.toString(obj12);
                JSONObject jSONObject10 = (JSONObject) obj12;
                if (jSONObject10 != null) {
                    sVar.H(m.NETWORK_RESPONSE.f112581a, jSONObject10);
                }
                break;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cam.c cVar11 = (cam.c) this.v;
                String str11 = sVar.f112590c;
                cVar11.getClass();
                Object obj13 = cVar11.f22670b;
                Objects.toString(obj13);
                JSONObject jSONObject11 = (JSONObject) obj13;
                if (jSONObject11 != null) {
                    sVar.H(m.NATIVE_NAVIGATE_FINISHED.f112581a, jSONObject11);
                }
                break;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cam.c cVar12 = (cam.c) this.v;
                String str12 = sVar.f112590c;
                cVar12.getClass();
                Object obj14 = cVar12.f22670b;
                Objects.toString(obj14);
                JSONObject jSONObject12 = (JSONObject) obj14;
                if (jSONObject12 != null) {
                    sVar.H(m.NATIVE_NETWORK_RESPONSE.f112581a, jSONObject12);
                }
                break;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cam.c cVar13 = (cam.c) this.v;
                String str13 = sVar.f112590c;
                cVar13.getClass();
                Object obj15 = cVar13.f22670b;
                Objects.toString(obj15);
                JSONObject jSONObject13 = (JSONObject) obj15;
                if (jSONObject13 != null) {
                    sVar.H(m.NATIVE_SHOW.f112581a, jSONObject13);
                }
                break;
            default:
                Lazy lazy = sVar.f112591g;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cam.c cVar14 = (cam.c) this.v;
                JSONObject jSONObject14 = (JSONObject) cVar14.f22670b;
                Continuation continuation = null;
                String strOptString = jSONObject14 != null ? jSONObject14.optString("name") : null;
                if (Intrinsics.f(strOptString, "Clicked Button To Start Authentication")) {
                    WebView webView = ((cam.t) lazy.getValue()).f22697c;
                    Intrinsics.i(webView, "null cannot be cast to non-null type financial.atomic.transact.view.TransactView");
                    ((bam.b) webView).setNavigable(false);
                } else if (Intrinsics.f(strOptString, "Clicked Continue From Welcome Page")) {
                    ((cam.t) lazy.getValue()).y(cam.i.finished, new o(sVar, continuation, 1));
                }
                sVar.F(cVar14);
                break;
        }
        return Unit.f186387a;
    }
}
