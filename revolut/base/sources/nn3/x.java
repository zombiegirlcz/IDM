package nn3;

import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserBannerContent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nme.c0;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes21.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.contacts_chooser.impl.ui.a f217463w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ContactsChooserBannerContent f217464x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(com.revolut.feature.contacts_chooser.impl.ui.a aVar, ContactsChooserBannerContent contactsChooserBannerContent, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f217463w = aVar;
        this.f217464x = contactsChooserBannerContent;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new x(this.f217463w, this.f217464x, continuation, 0);
            default:
                return new x(this.f217463w, this.f217464x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((x) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        com.revolut.feature.contacts_chooser.impl.ui.a aVar = this.f217463w;
        ContactsChooserBannerContent contactsChooserBannerContent = this.f217464x;
        switch (i) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    gn3.c cVar = aVar.f66091s;
                    String str = contactsChooserBannerContent.f66042a;
                    this.v = 1;
                    cVar.getClass();
                    gn3.b bVar = new gn3.b(cVar, str, null, 1);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, bVar, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar.H2(aVar.A, new c0(21));
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    gn3.c cVar2 = aVar.f66091s;
                    String str2 = contactsChooserBannerContent.f66042a;
                    this.v = 1;
                    cVar2.getClass();
                    gn3.b bVar2 = new gn3.b(cVar2, str2, null, 0);
                    p0 p0Var2 = p0.f264001a;
                    obj2 = e0.J(elm.f.f127540b, bVar2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                if (!((Boolean) obj2).booleanValue()) {
                    aVar.H2(aVar.A, new z(contactsChooserBannerContent, 0));
                }
                return Unit.f186387a;
        }
    }
}
