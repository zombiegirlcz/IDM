package cn;

import com.google.common.collect.ImmutableSet;
import efm.r;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes.dex */
public final class d extends nm.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final an0.e f25327j;
    public final Lazy k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lazy f25328l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ImmutableSet resultHandlers, e resultObservableProvider, qm.e resultDispatcherFactory) {
        super(resultDispatcherFactory, new fsi.b("ACTION_RESULT_MEDIATOR_DELEGATE"));
        Intrinsics.checkNotNullParameter(resultHandlers, "resultHandlers");
        Intrinsics.checkNotNullParameter(resultObservableProvider, "resultObservableProvider");
        Intrinsics.checkNotNullParameter(resultDispatcherFactory, "resultDispatcherFactory");
        this.f25327j = new an0.e(10);
        this.k = j.b(new androidx.lifecycle.b(resultObservableProvider, 11));
        this.f25328l = j.b(new c(0, resultHandlers));
    }

    @Override // nm.a
    public final Function1 N() {
        return this.f25327j;
    }

    @Override // nm.a
    public final List O() {
        return (List) this.f25328l.getValue();
    }

    @Override // nm.a
    public final r Q() {
        return (r) this.k.getValue();
    }
}
