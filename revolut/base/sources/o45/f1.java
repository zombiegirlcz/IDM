package o45;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00042\u00020\u0001:\t\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\n\u000e\b\t\u000f\u0007\u000b¨\u0006\u0010"}, d2 = {"Lo45/f1;", "", "<init>", "()V", "Companion", "c", "b", "o45/s1", "o45/l1", "o45/o1", "o45/i1", "o45/v1", "o45/e1", "a", "Lo45/f1$b;", "Lo45/f1$c;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@rlm.g(discriminator = "state")
@mlm.g
public abstract class f1 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f222053a = yhm.j.c(yhm.k.PUBLICATION, new o23.b(16));

    /* JADX INFO: renamed from: o45.f1$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f1.f222053a.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo45/f1$b;", "Lo45/f1;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class b extends f1 {

        @NotNull
        public static final b INSTANCE = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f222054b = yhm.j.c(yhm.k.PUBLICATION, new o23.b(17));

        private b() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f222054b.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo45/f1$c;", "Lo45/f1;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class c extends f1 {

        @NotNull
        public static final c INSTANCE = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f222055b = yhm.j.c(yhm.k.PUBLICATION, new o23.b(18));

        private c() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f222055b.getValue();
        }
    }

    private f1() {
    }
}
