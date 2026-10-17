package db0;

import com.revolut.feature.backend_flow.domain.models.BackendEntityItem;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import fc0.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackendFlow f112637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BackendEntityItem f112638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f112639c;

    public a(BackendFlow flow, BackendEntityItem item, f interactor) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f112637a = flow;
        this.f112638b = item;
        this.f112639c = interactor;
    }
}
