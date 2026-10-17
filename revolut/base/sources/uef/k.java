package uef;

import com.revolut.data.model.Data;
import com.revolut.feature.transaction.recogniser.api.domain.models.TransactionRecogniserDetails;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements p {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dff.a f279358a;

    public k(dff.a transactionItemMapper) {
        Intrinsics.checkNotNullParameter(transactionItemMapper, "transactionItemMapper");
        this.f279358a = transactionItemMapper;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TransactionRecogniserDetails transactionRecogniserDetails = domainState.f279352a;
        Data data = domainState.f279353b;
        return new i(data.getContent() != null, (List) iii.c.f(data, new u69.g(this, transactionRecogniserDetails, 18), new u3a.p(this, transactionRecogniserDetails, 1), new tvh.e(this, transactionRecogniserDetails, 10)));
    }

    public final ArrayList b(TransactionRecogniserDetails transactionRecogniserDetails) {
        ArrayList arrayList = new ArrayList();
        IntRange intRange = new IntRange(1, 3, 1);
        ArrayList arrayList2 = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList2.add(Boolean.valueOf(arrayList.add(new pb0(a0.d.n("BEFORE_AFTER_LOADING", it8.nextInt())))));
        }
        arrayList.add(((dff.b) this.f279358a).b(transactionRecogniserDetails.f91803a, true));
        IntRange intRange2 = new IntRange(4, 6, 1);
        ArrayList arrayList3 = new ArrayList(w.t(intRange2, 10));
        vim.f it9 = intRange2.iterator();
        while (it9.f289625c) {
            arrayList3.add(Boolean.valueOf(arrayList.add(new pb0(a0.d.n("BEFORE_AFTER_LOADING", it9.nextInt())))));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }
}
