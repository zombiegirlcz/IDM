package com.revolut.feature.insurance_embedded.impl.data.model;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b1\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0005\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/j;", "", "<init>", "()V", "Companion", "com/revolut/feature/insurance_embedded/impl/data/model/h", "com/revolut/feature/insurance_embedded/impl/data/model/i", "a", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@rlm.g(discriminator = "type")
@mlm.g
public abstract class j {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f75997a = yhm.j.c(yhm.k.PUBLICATION, new gu7.d(3));

    /* JADX INFO: renamed from: com.revolut.feature.insurance_embedded.impl.data.model.j$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) j.f75997a.getValue();
        }
    }

    private j() {
    }
}
