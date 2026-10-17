package mri;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import qlm.d1;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a f208132a = new a();

    private a() {
    }

    @NotNull
    public final KSerializer serializer() {
        p0 p0Var = o0.f186429a;
        return new mlm.f("com.revolut.retail.core.job.BalanceUpdateInfo", p0Var.b(s.class), new KClass[]{p0Var.b(d.class), p0Var.b(g.class), p0Var.b(h.class), p0Var.b(k.class), p0Var.b(n.class), p0Var.b(q.class), p0Var.b(r.class)}, new KSerializer[]{b.f208133a, e.f208135a, new d1("com.revolut.retail.core.job.BalanceUpdateInfo.JointWallet", h.INSTANCE, new Annotation[0]), new d1("com.revolut.retail.core.job.BalanceUpdateInfo.RevPointsPocket", k.INSTANCE, new Annotation[0]), l.f208139a, o.f208143a, new d1("com.revolut.retail.core.job.BalanceUpdateInfo.Wallet", r.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
