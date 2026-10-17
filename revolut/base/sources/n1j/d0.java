package n1j;

import ip0.pb0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 implements cli.n {

    @NotNull
    private static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2j.l f211379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zjh.j f211380b;

    public d0(o2j.l itemsMapper, r1j.a proceedButtonStateMapper, u1j.c countryProfileTabsMapper, zjh.j legalEntityDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(proceedButtonStateMapper, "proceedButtonStateMapper");
        Intrinsics.checkNotNullParameter(countryProfileTabsMapper, "countryProfileTabsMapper");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        this.f211379a = itemsMapper;
        this.f211380b = legalEntityDisclaimerMapper;
    }

    public static ArrayList a() {
        IntRange intRange = new IntRange(1, 3, 1);
        ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(new pb0(a0.d.n("BALANCE_LOADING", it8.nextInt())));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        m domainState = (m) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (s) iii.c.f(domainState.f211389a, new n1.y(this, domainState, 6), new mz3.r(this, domainState, 8), new m88.c(this, domainState, 18));
    }
}
