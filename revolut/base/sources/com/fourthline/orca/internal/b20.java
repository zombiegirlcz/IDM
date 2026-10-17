package com.fourthline.orca.internal;

import com.fourthline.orca.internal.nc1;
import com.fourthline.orca.internal.u41;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class b20 implements u41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fl f26963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nc1 f26964b;

    public b20(fl identifierRepository, nc1 uploadDocumentImageWorker) {
        Intrinsics.checkNotNullParameter(identifierRepository, "identifierRepository");
        Intrinsics.checkNotNullParameter(uploadDocumentImageWorker, "uploadDocumentImageWorker");
        this.f26963a = identifierRepository;
        this.f26964b = uploadDocumentImageWorker;
    }

    @Override // com.fourthline.orca.internal.u41
    public Object a(dp dpVar, g51 g51Var, Continuation continuation) {
        this.f26964b.a(new nc1.a(this.f26963a.a(g51Var.c()), this.f26963a.b(g51Var.c()), g51Var.d().getImage().getFull(), g51Var.d()));
        return u41.a.f33954b;
    }

    @Override // com.fourthline.orca.internal.u41
    public /* bridge */ void reset() {
        super.reset();
    }
}
