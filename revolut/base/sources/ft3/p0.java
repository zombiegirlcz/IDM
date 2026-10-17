package ft3;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lft3/p0;", "Lft3/q0;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final class p0 implements q0 {

    @NotNull
    public static final p0 INSTANCE = new p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j1 f137862a = j1.REFINANCING_MORTGAGE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Object f137863b = yhm.j.c(yhm.k.PUBLICATION, new h0(7));

    private p0() {
    }

    @Override // ft3.q0
    /* JADX INFO: renamed from: A4 */
    public final gt3.f getD() {
        return null;
    }

    @Override // ft3.q0
    /* JADX INFO: renamed from: E2 */
    public final j1 getF137852c() {
        return f137862a;
    }

    @Override // ft3.q0
    /* JADX INFO: renamed from: c0 */
    public final it3.k getF137851b() {
        return null;
    }

    @Override // ft3.q0
    /* JADX INFO: renamed from: f4 */
    public final String getF137850a() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) f137863b.getValue();
    }
}
