package ska;

import com.revolut.feature.product_article.impl.network.ProductArticleService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nka.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductArticleService f263796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f263797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f263798c;
    public final lka.d d;
    public final l e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f263799g;

    public k(ProductArticleService service, ne0.j memoryCache, ue0.c storage, lka.d mapper, l storageKeyCalculator) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageKeyCalculator, "storageKeyCalculator");
        this.f263796a = service;
        this.f263797b = memoryCache;
        this.f263798c = storage;
        this.d = mapper;
        this.e = storageKeyCalculator;
        final int i = 0;
        Continuation continuation = null;
        this.f = new x4l.c(new i(this, continuation, i), new Function1(this) { // from class: ska.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f263790b;

            {
                this.f263790b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                q params = (q) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (aka.i) this.f263790b.f263797b.get(params.a());
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (aka.a) this.f263790b.f263797b.get(params.b());
                }
            }
        }, new Function2(this) { // from class: ska.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f263792b;

            {
                this.f263792b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                q params = (q) obj2;
                switch (i) {
                    case 0:
                        aka.i domain = (aka.i) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f263792b.f263797b.f(params.a(), domain);
                        break;
                    default:
                        aka.a domain2 = (aka.a) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f263792b.f263797b.f(params.b(), domain2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new j(this, continuation, i), new pfk.q(this, continuation, 27));
        final int i2 = 1;
        this.f263799g = new x4l.c(new i(this, continuation, i2), new Function1(this) { // from class: ska.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f263790b;

            {
                this.f263790b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                q params = (q) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (aka.i) this.f263790b.f263797b.get(params.a());
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (aka.a) this.f263790b.f263797b.get(params.b());
                }
            }
        }, new Function2(this) { // from class: ska.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f263792b;

            {
                this.f263792b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                q params = (q) obj2;
                switch (i2) {
                    case 0:
                        aka.i domain = (aka.i) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f263792b.f263797b.f(params.a(), domain);
                        break;
                    default:
                        aka.a domain2 = (aka.a) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f263792b.f263797b.f(params.b(), domain2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new j(this, continuation, i2), new pfk.q(this, continuation, 28));
    }
}
