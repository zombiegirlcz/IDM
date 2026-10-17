package yrh;

import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements p {

    @NotNull
    public static final e Companion = new e();

    @Override // jki.p
    public final m a(i iVar) {
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        throw new IllegalArgumentException("Permissions promo screen shouldn't be launched at this point. Please, fix your flow setup");
    }
}
