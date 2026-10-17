package nc0;

import com.revolut.feature.backend_flow.domain.models.SelectedTransaction;
import efm.r;
import fc0.i;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import n8i.q0;
import nb6.p;
import qc0.i1;
import rfm.o;
import tof.a3;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f214114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gc0.d f214115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f214116c;
    public volatile e d;
    public final AtomicBoolean e;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f214117g;

    public f(l80.e dateProvider, gc0.d mapper, i interactor) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f214114a = dateProvider;
        this.f214115b = mapper;
        this.f214116c = interactor;
        this.e = new AtomicBoolean(false);
        this.f = v0.a.d("create(...)");
        this.f214117g = v0.a.d("create(...)");
    }

    public static SelectedTransaction b(v9l.a aVar) {
        a3 a3Var = aVar.f287078a;
        String str = a3Var.f272581b;
        String str2 = a3Var.f272609r;
        if (str2 == null) {
            str2 = "";
        }
        dj0.d dVar = a3Var.k;
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(a3Var.f272591g.getMillis()), ZoneId.systemDefault());
        Intrinsics.checkNotNullExpressionValue(localDateTimeOfInstant, "ofInstant(...)");
        return new SelectedTransaction(str, str2, dVar, oi0.d.R(localDateTimeOfInstant));
    }

    public final void a() {
        e eVar = this.d;
        if (eVar != null && eVar.f214113c && this.e.compareAndSet(false, true)) {
            r rVarDoOnNext = new sfm.b(new o(new a(eVar, 0)), new nae.a(new b(this, 0), 16), 1).switchIfEmpty(zi0.c.j(f0.f322471a)).doOnNext(new nae.a(new b(this, 1), 17));
            Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
            pd.b.r(rVarDoOnNext, new d(this, eVar, 0)).filter(new nae.a(new q0(16), 23)).flatMap(new nae.a(new d(this, eVar, 1), 24)).map(new nae.a(new d(this, eVar, 2), 14)).subscribe(new nae.a(new p(1, this.f, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 1), 15));
        }
    }
}
