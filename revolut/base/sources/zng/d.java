package zng;

import bog.q;
import bog.r;
import bog.s;
import bog.t;
import bog.u;
import com.revolut.feature.user_declarations.shared.flows.name.screen.NameScreen;
import com.revolut.shared.feature.user_declarations.api.models.NativeName;
import com.revolut.shared.feature.user_declarations.api.navigation.NameControllerDescriptor$OutputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ NameScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(NameScreen nameScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = nameScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        NameControllerDescriptor$OutputData nameControllerDescriptor$OutputData;
        int i = this.u;
        NameScreen nameScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) nameScreen.Q.getValue();
                iVar.getClass();
                q qVar = u.Companion;
                u layout = ((g) ((j2) iVar.f323825p.f22677a).getValue()).f323819a;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(layout, "layout");
                NativeName nativeName = null;
                if (layout instanceof r) {
                    r rVar = (r) layout;
                    String str = rVar.f17450a.f17432c;
                    String str2 = rVar.f17452c.f17438c;
                    bog.j jVar = rVar.f17451b;
                    String str3 = jVar != null ? jVar.f17441c : null;
                    String str4 = (str3 == null || str3.length() == 0) ? null : str3;
                    bog.b bVar = rVar.d;
                    String str5 = bVar != null ? bVar.f17431c : null;
                    nameControllerDescriptor$OutputData = new NameControllerDescriptor$OutputData(str, str2, str4, (str5 == null || str5.length() == 0) ? null : str5, null, null, null);
                } else if (layout instanceof s) {
                    s sVar = (s) layout;
                    bog.l lVar = sVar.f17454b;
                    String str6 = sVar.d.f17432c;
                    String str7 = sVar.f17455c.f17438c;
                    bog.b bVar2 = sVar.e;
                    String str8 = bVar2 != null ? bVar2.f17431c : null;
                    String str9 = (str8 == null || str8.length() == 0) ? null : str8;
                    if (lVar.f17444c != null && (!d0.W(r3))) {
                        String str10 = lVar.f17444c;
                        if (str10 == null) {
                            str10 = "";
                        }
                        String str11 = sVar.f17453a.f17445c;
                        nativeName = new NativeName(str10, str11 != null ? str11 : "");
                    }
                    nameControllerDescriptor$OutputData = new NameControllerDescriptor$OutputData(str6, str7, null, str9, null, null, nativeName);
                } else {
                    if (!(layout instanceof t)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    t tVar = (t) layout;
                    String str12 = tVar.f17456a.f17432c;
                    String str13 = tVar.f17457b.f17435c;
                    String str14 = tVar.f17458c.f17446c;
                    nameControllerDescriptor$OutputData = new NameControllerDescriptor$OutputData(str12, null, null, null, str13, (str14 == null || str14.length() == 0) ? null : str14, null);
                }
                iVar.C2(nameControllerDescriptor$OutputData);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                nameScreen.m2().onBackPressed();
                return Unit.f186387a;
        }
    }
}
