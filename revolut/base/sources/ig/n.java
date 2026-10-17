package ig;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes17.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Preferences.Key f161060w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f161061x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Object obj2, Preferences.Key key, o oVar, Continuation continuation) {
        super(2, continuation);
        this.v = obj2;
        this.f161060w = key;
        this.f161061x = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, this.f161060w, this.f161061x, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((MutablePreferences) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        MutablePreferences mutablePreferences = (MutablePreferences) this.u;
        Preferences.Key key = this.f161060w;
        Object obj3 = this.v;
        if (obj3 != null) {
            mutablePreferences.set(key, obj3);
        } else {
            mutablePreferences.remove(key);
        }
        o.a(this.f161061x, mutablePreferences);
        return Unit.f186387a;
    }
}
