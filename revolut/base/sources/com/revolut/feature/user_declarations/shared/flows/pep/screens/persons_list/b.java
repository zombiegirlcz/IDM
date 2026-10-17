package com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list;

import cli.g;
import cli.y;
import kj4.c;
import kog.i;
import kog.l;
import kog.n;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements i {

    @NotNull
    public static final l Companion = new l();
    public final y o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f94670p;

    public b(PersonsListScreenContract$InputData inputData, n stateMapper, kog.a saveStateDelegate) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        this.o = d.b(this, new PersonsListScreenContract$DomainState(inputData.f94664a, r0.g()), stateMapper, saveStateDelegate, false, 8);
        this.f94670p = new com.revolut.kompot.navigable.vc.modal.a(this, new c(this, 10));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f94670p;
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
