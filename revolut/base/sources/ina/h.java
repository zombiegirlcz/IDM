package ina;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.feature.statements.api.StatementsMode;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.c {
    public fna.c A;
    public fna.i B;
    public List C;
    public Collection D;
    public List E;
    public Iterator F;
    public StatementsMode G;
    public Collection H;
    public String I;
    public Clause J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i52.l f162719w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f162720x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Data f162721y;
    public Data z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i52.l lVar, Continuation continuation) {
        super(continuation);
        this.f162719w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f162719w.emit(null, this);
    }
}
