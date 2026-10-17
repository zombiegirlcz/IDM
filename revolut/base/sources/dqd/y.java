package dqd;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f4h.a f116968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r9k.k f116969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f116970c;

    public y(f4h.a bankTransferErrorStateProvider, r9k.k p2pTransferErrorStateProvider) {
        Intrinsics.checkNotNullParameter(bankTransferErrorStateProvider, "bankTransferErrorStateProvider");
        Intrinsics.checkNotNullParameter(p2pTransferErrorStateProvider, "p2pTransferErrorStateProvider");
        this.f116968a = bankTransferErrorStateProvider;
        this.f116969b = p2pTransferErrorStateProvider;
        this.f116970c = new ConcurrentHashMap();
    }

    public static Flow a(ArrayList arrayList) {
        return arrayList.isEmpty() ? new go.g(f0.f322471a, 2) : new ag1.k((Flow[]) d0.d1(arrayList).toArray(new Flow[0]), 15);
    }
}
