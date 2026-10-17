package com.revolut.feature.incentive_reward.impl.model.lotteries;

import kf7.o;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@g
public final class b {

    @NotNull
    public static final kf7.a Companion = new kf7.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f74858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LotteryDrawDetails$ShareInfo f74859c;

    public /* synthetic */ b(int i, String str, o oVar, LotteryDrawDetails$ShareInfo lotteryDrawDetails$ShareInfo) {
        if (7 != (i & 7)) {
            j1.f(a.f74856a.getDescriptor(), i, 7);
            throw null;
        }
        this.f74857a = str;
        this.f74858b = oVar;
        this.f74859c = lotteryDrawDetails$ShareInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f74857a, bVar.f74857a) && Intrinsics.f(this.f74858b, bVar.f74858b) && Intrinsics.f(this.f74859c, bVar.f74859c);
    }

    public final int hashCode() {
        return this.f74859c.hashCode() + ((this.f74858b.hashCode() + (this.f74857a.hashCode() * 31)) * 31);
    }
}
