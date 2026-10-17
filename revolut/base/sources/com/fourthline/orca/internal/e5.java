package com.fourthline.orca.internal;

import com.fourthline.orca.internal.e40;
import java.util.Iterator;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class e5 implements e40.e, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f27995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c4 f27996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d3 f27997c;
    private final aq0 d;

    public e5(c4 flowConfig, d3 dataBundle, aq0 popupHandler, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f27995a = coroutineScope;
        this.f27996b = flowConfig;
        this.f27997c = dataBundle;
        this.d = popupHandler;
    }

    @Override // com.fourthline.orca.internal.e40.e
    public void a(e40 e40Var) {
        Intrinsics.checkNotNullParameter(e40Var, "<this>");
        this.f27997c.a(a());
        if (lh0.f30621a.d() || this.f27996b.getBavStrategy().a(c5.f27366a.a())) {
            return;
        }
        this.d.a(q5.f32200a);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f27995a.getF74819h();
    }

    private final t5 a() {
        Object next;
        Iterator it8 = this.f27996b.getSupportedPaymentMethods().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((t5) next).getName() == v6.f34254b) {
                break;
            }
        }
        t5 t5Var = (t5) next;
        return t5Var == null ? new t5(v6.f34254b, false, 0) : t5Var;
    }
}
