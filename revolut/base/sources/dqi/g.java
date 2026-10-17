package dqi;

import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import dkk.a0;
import efm.c0;
import efm.r;
import efm.u;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tfm.n4;
import tfm.z0;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends fsi.c implements k {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final fsi.b f116998n = new fsi.b("RECYCLER_VIEW_SCROLL_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Activity f116999h;
    public final h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ihm.b f117000j;
    public final Lazy k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lazy f117001l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n4 f117002m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Activity activity, h configuration) {
        super(f116998n);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f116999h = activity;
        this.i = configuration;
        od0.i.Companion.getClass();
        ihm.b bVarE = ihm.b.e(od0.i.f224256b);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f117000j = bVarE;
        final int i = 0;
        this.k = yhm.j.b(new Function0(this) { // from class: dqi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f116993b;

            {
                this.f116993b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        g gVar = this.f116993b;
                        return (RecyclerView) gVar.f116999h.findViewById(gVar.i.f117003a);
                    default:
                        RecyclerView.LayoutManager layoutManager = this.f116993b.N().getLayoutManager();
                        if (layoutManager != null) {
                            return layoutManager;
                        }
                        throw new IllegalStateException("provide layout manager to the recyclerView");
                }
            }
        });
        final int i2 = 1;
        this.f117001l = yhm.j.b(new Function0(this) { // from class: dqi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f116993b;

            {
                this.f116993b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        g gVar = this.f116993b;
                        return (RecyclerView) gVar.f116999h.findViewById(gVar.i.f117003a);
                    default:
                        RecyclerView.LayoutManager layoutManager = this.f116993b.N().getLayoutManager();
                        if (layoutManager != null) {
                            return layoutManager;
                        }
                        throw new IllegalStateException("provide layout manager to the recyclerView");
                }
            }
        });
        r rVarCreate = r.create(new u(this) { // from class: dqi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f116991b;

            {
                this.f116991b = this;
            }

            @Override // efm.u
            public final void a(z0 emitter) {
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(emitter, "emitter");
                        e eVar = new e(emitter);
                        g gVar = this.f116991b;
                        gVar.N().addOnScrollListener(eVar);
                        emitter.d(new b80.a(gVar, eVar, 2));
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(emitter, "it");
                        d dVar = new d(emitter);
                        RecyclerView.Adapter adapter = this.f116991b.N().getAdapter();
                        if (adapter != null) {
                            adapter.registerAdapterDataObserver(dVar);
                        }
                        emitter.d(new b80.a(adapter, dVar, 3));
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(emitter, "emitter");
                        g gVar2 = this.f116991b;
                        f fVar = new f(gVar2, emitter);
                        gVar2.N().addOnScrollListener(fVar);
                        emitter.d(new b80.a(gVar2, fVar, 4));
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(rVarCreate, "create(...)");
        r rVarC = o70.a.c(rVarCreate);
        c0 c0Var = hfm.c.f152030a;
        m70.a.p(c0Var);
        Intrinsics.checkNotNullExpressionValue(rVarC.unsubscribeOn(c0Var), "unsubscribeOn(...)");
        final int i3 = 2;
        r rVarMerge = r.merge(r.create(new u(this) { // from class: dqi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f116991b;

            {
                this.f116991b = this;
            }

            @Override // efm.u
            public final void a(z0 emitter) {
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(emitter, "emitter");
                        e eVar = new e(emitter);
                        g gVar = this.f116991b;
                        gVar.N().addOnScrollListener(eVar);
                        emitter.d(new b80.a(gVar, eVar, 2));
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(emitter, "it");
                        d dVar = new d(emitter);
                        RecyclerView.Adapter adapter = this.f116991b.N().getAdapter();
                        if (adapter != null) {
                            adapter.registerAdapterDataObserver(dVar);
                        }
                        emitter.d(new b80.a(adapter, dVar, 3));
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(emitter, "emitter");
                        g gVar2 = this.f116991b;
                        f fVar = new f(gVar2, emitter);
                        gVar2.N().addOnScrollListener(fVar);
                        emitter.d(new b80.a(gVar2, fVar, 4));
                        break;
                }
            }
        }), bVarE.filter(new a0(new dmj.a(24), 9)).map(new a0(new dmj.a(this, 25), 8)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        n4 n4VarE = o70.a.c(rVarMerge).unsubscribeOn(c0Var).replay(1).e();
        Intrinsics.checkNotNullExpressionValue(n4VarE, "refCount(...)");
        this.f117002m = n4VarE;
        final int i5 = 0;
        r rVarCreate2 = r.create(new u(this) { // from class: dqi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f116991b;

            {
                this.f116991b = this;
            }

            @Override // efm.u
            public final void a(z0 emitter) {
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(emitter, "emitter");
                        e eVar = new e(emitter);
                        g gVar = this.f116991b;
                        gVar.N().addOnScrollListener(eVar);
                        emitter.d(new b80.a(gVar, eVar, 2));
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(emitter, "it");
                        d dVar = new d(emitter);
                        RecyclerView.Adapter adapter = this.f116991b.N().getAdapter();
                        if (adapter != null) {
                            adapter.registerAdapterDataObserver(dVar);
                        }
                        emitter.d(new b80.a(adapter, dVar, 3));
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(emitter, "emitter");
                        g gVar2 = this.f116991b;
                        f fVar = new f(gVar2, emitter);
                        gVar2.N().addOnScrollListener(fVar);
                        emitter.d(new b80.a(gVar2, fVar, 4));
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(rVarCreate2, "create(...)");
        Intrinsics.checkNotNullExpressionValue(o70.a.c(rVarCreate2).unsubscribeOn(c0Var).replay(1).e(), "refCount(...)");
    }

    public static j O(int i) {
        if (i == 0) {
            return j.IDLE;
        }
        if (i == 1) {
            return j.DRAGGING;
        }
        if (i == 2) {
            return j.SETTLING;
        }
        if (i == 3) {
            return j.PROGRAMMATICALLY_STARTED;
        }
        throw new IllegalStateException(a0.d.n("can not map with state = ", i));
    }

    public final RecyclerView N() {
        Object value = this.k.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }
}
