package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class gd {
    public final cd a(gz0 resourcesManager) {
        Intrinsics.checkNotNullParameter(resourcesManager, "resourcesManager");
        return new dd(resourcesManager);
    }

    public final bd a(gz0 resourcesManager, od countrySupportedUseCase) {
        Intrinsics.checkNotNullParameter(resourcesManager, "resourcesManager");
        Intrinsics.checkNotNullParameter(countrySupportedUseCase, "countrySupportedUseCase");
        return new ld(resourcesManager, countrySupportedUseCase);
    }

    public final rx a(cd countriesFilter, bd countriesComparator, Function0 resourcesFactory) {
        Intrinsics.checkNotNullParameter(countriesFilter, "countriesFilter");
        Intrinsics.checkNotNullParameter(countriesComparator, "countriesComparator");
        Intrinsics.checkNotNullParameter(resourcesFactory, "resourcesFactory");
        return new sx(countriesFilter, countriesComparator, resourcesFactory);
    }

    public final ux a(cd countriesFilter, bd countriesComparator) {
        Intrinsics.checkNotNullParameter(countriesFilter, "countriesFilter");
        Intrinsics.checkNotNullParameter(countriesComparator, "countriesComparator");
        return new tx(countriesFilter, countriesComparator);
    }
}
