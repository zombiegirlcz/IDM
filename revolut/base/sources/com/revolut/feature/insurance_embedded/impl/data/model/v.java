package com.revolut.feature.insurance_embedded.impl.data.model;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\b\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\r\u0005\u0006\u0007\u000b\t\n¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/v;", "", "<init>", "()V", "Companion", "com/revolut/feature/insurance_embedded/impl/data/model/x", "com/revolut/feature/insurance_embedded/impl/data/model/y", "com/revolut/feature/insurance_embedded/impl/data/model/z", "a", "com/revolut/feature/insurance_embedded/impl/data/model/b0", "com/revolut/feature/insurance_embedded/impl/data/model/c0", "com/revolut/feature/insurance_embedded/impl/data/model/a0", "b", "Lcom/revolut/feature/insurance_embedded/impl/data/model/v$a;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@rlm.g(discriminator = "type")
@mlm.g
public abstract class v {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f76034a = yhm.j.c(yhm.k.PUBLICATION, new gu7.d(14));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/v$a;", "Lcom/revolut/feature/insurance_embedded/impl/data/model/v;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class a extends v {

        @NotNull
        public static final a INSTANCE = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f76035b = yhm.j.c(yhm.k.PUBLICATION, new gu7.d(15));

        private a() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f76035b.getValue();
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.insurance_embedded.impl.data.model.v$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) v.f76034a.getValue();
        }
    }

    private v() {
    }
}
