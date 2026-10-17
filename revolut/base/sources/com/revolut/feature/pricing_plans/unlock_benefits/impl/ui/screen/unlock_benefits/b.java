package com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.screen.unlock_benefits;

import a0.d;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.kh;
import ieg.y;
import iga.e;
import iga.i;
import iga.k;
import iii.c;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements n {

    @NotNull
    private static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f80972a;

    public b(f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f80972a = uiKitResources;
    }

    public static ArrayList a() {
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList.add(new kh(d.n("unlock_benefits_loading_split_", i)));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    @Override // cli.n
    public final o c(j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i) c.f(domainState.f161101a, new id8.a(this, 26), new y(this, 4), new hnc.a(this, 29));
    }
}
