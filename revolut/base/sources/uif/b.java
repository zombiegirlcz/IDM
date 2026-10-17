package uif;

import com.revolut.domain.interactors.transactions.Priority;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f280422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f280423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Priority f280424c;

    public /* synthetic */ b(g gVar, Priority priority, int i) {
        this.f280422a = i;
        this.f280423b = gVar;
        this.f280424c = priority;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f280422a) {
        }
        return this.f280423b.c(this.f280424c);
    }
}
