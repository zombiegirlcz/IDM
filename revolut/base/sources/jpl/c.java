package jpl;

import com.revolut.sso.api.exceptions.RevolutSSOException;
import com.revolut.sso.api.models.OAuthUserInfo;
import com.revolut.sso.api.models.UserInfoFromApp;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rqk.m;
import yhm.o;
import zhm.a0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f177322w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(2, continuation);
        this.f177322w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.f177322w, continuation);
        cVar.v = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((OAuthUserInfo) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        OAuthUserInfo oAuthUserInfo = (OAuthUserInfo) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            m mVar = this.f177322w.o;
            this.v = oAuthUserInfo;
            this.u = 1;
            obj2 = mVar.a(false, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        String str = ((UserInfoFromApp) obj2).f105997b;
        if (str == null) {
            throw new RevolutSSOException.IllegalState("Registered identity id is missing");
        }
        ArrayList<OAuthUserInfo.ConnectedClient> arrayList = oAuthUserInfo.f105947a;
        ArrayList arrayList2 = new ArrayList();
        for (OAuthUserInfo.ConnectedClient connectedClient : arrayList) {
            ArrayList arrayList3 = connectedClient.f105952b;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList3) {
                if (Intrinsics.f(((OAuthUserInfo.Connection) obj3).f105953a, str)) {
                    arrayList4.add(obj3);
                }
            }
            ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
            Iterator it8 = arrayList4.iterator();
            while (it8.hasNext()) {
                arrayList5.add(new com.revolut.sso.api.models.a(connectedClient.f105951a, (OAuthUserInfo.Connection) it8.next()));
            }
            a0.x(arrayList5, arrayList2);
        }
        return arrayList2;
    }
}
