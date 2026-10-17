package b30;

import com.revolut.chat.data.network.SuggestionsApi;
import com.revolut.chat.domain.model.ChatEntryPoint;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.h2;
import yhm.o;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f11976w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ChatEntryPoint f11977x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, ChatEntryPoint chatEntryPoint, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f11976w = eVar;
        this.f11977x = chatEntryPoint;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f11976w, this.f11977x, continuation, 0);
            default:
                return new d(this.f11976w, this.f11977x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    SuggestionsApi suggestionsApi = this.f11976w.f11979a;
                    ChatEntryPoint chatEntryPoint = this.f11977x;
                    String str = chatEntryPoint != null ? chatEntryPoint.f51028a : null;
                    this.v = 1;
                    obj2 = suggestionsApi.getSuggestions(str, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return ((l20.b) obj2).getSuggestions();
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                e eVar = this.f11976w;
                Continuation continuation = null;
                try {
                    if (i2 == 0) {
                        o.b(obj2);
                        d dVar = new d(eVar, this.f11977x, continuation, 0);
                        this.v = 1;
                        obj2 = h2.d(500L, dVar, this);
                        if (obj2 == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    List list = (List) obj2;
                    if (list != null) {
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        int i3 = 0;
                        for (Object obj3 : list2) {
                            int i5 = i3 + 1;
                            if (i3 < 0) {
                                v.s();
                                throw null;
                            }
                            arrayList.add(eVar.f11980b.a((l20.a) obj3, i3));
                            i3 = i5;
                        }
                        return arrayList;
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                }
                return null;
        }
    }
}
