package com.revolut.feature.pix.impl.flow.migrate_alias;

import com.revolut.feature.pix.impl.flow.migrate_alias.MigrateAliasContract$Step;
import cp5.d;
import eul.f;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements faa.a {
    public final MigrateAliasContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f80639p;

    public a(MigrateAliasContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        f fVar = new f(this, 24);
        this.f80639p = d.a(this, MigrateAliasContract$Step.Review.f80638a, f0.f322471a, fVar);
    }

    @Override // yki.g
    public final b s() {
        return this.f80639p;
    }
}
