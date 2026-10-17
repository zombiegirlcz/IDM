package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import com.fourthline.orca.internal.rh;
import com.fourthline.orca.internal.w2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class vh implements v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yh f34359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w2 f34360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qg0 f34361c;

    public vh(yh repository, w2 selectionValidator, qg0 analytics) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(selectionValidator, "selectionValidator");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f34359a = repository;
        this.f34360b = selectionValidator;
        this.f34361c = analytics;
    }

    @Override // com.fourthline.orca.internal.v2
    public void a(a01 item) {
        qg0.a eVar;
        Intrinsics.checkNotNullParameter(item, "item");
        fd fdVar = (fd) item;
        w2.a aVarA = this.f34360b.a(item);
        if (aVarA instanceof w2.a.b) {
            eVar = new rh.a.b(fdVar);
        } else {
            if (!(aVarA instanceof w2.a.C0303a)) {
                throw new NoWhenBranchMatchedException();
            }
            eVar = new rh.a.e(fdVar);
        }
        this.f34361c.track(eVar);
        this.f34359a.a(fdVar);
    }

    @Override // com.fourthline.orca.internal.v2
    public void a() {
        this.f34359a.a(null);
    }
}
