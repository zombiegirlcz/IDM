package ft3;

import java.lang.annotation.Annotation;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ o f137857a = new o();

    private o() {
    }

    @NotNull
    public final KSerializer serializer() {
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        return new mlm.f("com.revolut.feature.credit.application.models.products.CreditApplicationProduct.FamilyCreditCard", p0Var.b(t.class), new KClass[]{p0Var.b(r.class), p0Var.b(s.class)}, new KSerializer[]{p.f137861a, new qlm.d1("familyCreditCardInvitee", s.INSTANCE, new Annotation[]{new v("type")})}, new Annotation[]{new v("type")});
    }
}
