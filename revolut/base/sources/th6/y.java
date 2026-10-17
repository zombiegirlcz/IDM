package th6;

import com.revolut.feature.external_accounts.impl.repository.MandateStorage$Companion;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f271301a;

    public y(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f271301a = storage;
    }

    public final List a() {
        x.Companion.getClass();
        return (List) this.f271301a.T2("MANDATE_ENTITIES_KEY", MandateStorage$Companion.f72486b);
    }

    public final void b(ArrayList entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        this.f271301a.G(entities, "MANDATE_ENTITIES_KEY", kii.e.o(ai6.b.class, KTypeProjection.INSTANCE, List.class));
    }
}
