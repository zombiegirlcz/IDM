package w5b;

import java.lang.annotation.Annotation;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import w5b.p5;

/* JADX INFO: loaded from: classes6.dex */
public final class o5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ o5 f294966a = new o5();

    private o5() {
    }

    @NotNull
    public final KSerializer serializer() {
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        return new mlm.f("com.revolut.feature.retail.cobranded_cards.impl.data.dto.CobrandedCardsUpsellBannerDto.ParamDto", p0Var.b(r5.class), new KClass[]{p0Var.b(p5.class), p0Var.b(q5.class)}, new KSerializer[]{p5.a.f294979a, new qlm.d1("com.revolut.feature.retail.cobranded_cards.impl.data.dto.CobrandedCardsUpsellBannerDto.ParamDto.Unknown", q5.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
