package vlg;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.ConfigurableResourceImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.chooser.ChooserScreenContract$Model;
import com.revolut.feature.us_send_checks.impl.ui.recipient.SendChecksRecipientScreen;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SendChecksRecipientScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SendChecksRecipientScreen sendChecksRecipientScreen, Continuation continuation) {
        super(2, continuation);
        this.v = sendChecksRecipientScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (Intrinsics.f(model.f52580a, "STATE")) {
            s sVar = (s) this.v.R2();
            n8b.a aVar2 = sVar.o;
            y yVar = sVar.f290446q;
            ao3.a aVar3 = ((e) ((j2) yVar.f22677a).getValue()).f290433b;
            String str = aVar3 != null ? aVar3.f7895a : null;
            if (str == null) {
                str = "";
            }
            wi0.b.Companion.getClass();
            o8b.c cVar = (o8b.c) aVar2;
            cVar.getClass();
            Intrinsics.checkNotNullParameter("US", "countryCode");
            Iterable iterable = (Set) o8b.c.f222983j.get(com.bumptech.glide.d.c("US"));
            if (iterable == null) {
                iterable = h0.f322473a;
            }
            Iterable<String> iterable2 = iterable;
            ArrayList arrayList = new ArrayList(w.t(iterable2, 10));
            for (String str2 : iterable2) {
                ao3.a aVar4 = ((e) ((j2) yVar.f22677a).getValue()).f290433b;
                boolean zF = Intrinsics.f(str2, aVar4 != null ? aVar4.f7895a : null);
                wi0.b.Companion.getClass();
                String strE = cVar.e(str2, wi0.a.a("US"));
                arrayList.add(new ChooserScreenContract$Model(str2, strE == null ? "" : strE, qi3.p.TEXT_ITEM, str2, null, zF ? new ConfigurableResourceImage(R$drawable.uikit_icn_24_check, null, null, null, 1022) : null, zF, new ao3.a(str2, strE), 30052));
            }
            sVar.C2(new h(str, arrayList));
        }
        return Unit.f186387a;
    }
}
