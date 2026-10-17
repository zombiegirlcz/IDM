package yh6;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import yh6.h;
import yh6.i;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f313809a = new g();

    private g() {
    }

    @NotNull
    public final KSerializer serializer() {
        p0 p0Var = o0.f186429a;
        return new mlm.f("com.revolut.feature.external_accounts.impl.repository.models.IndiaOpenBankingTopUpMethodProviderDetailsDto", p0Var.b(j.class), new KClass[]{p0Var.b(h.class), p0Var.b(i.class)}, new KSerializer[]{h.a.f313811a, i.a.f313815a}, new Annotation[0]);
    }
}
