package dp4;

import com.revolut.feature.credit.card.impl.network.CreditCardUiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardUiService f116705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xx4.d f116706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xx4.e f116707c;
    public final ox4.c d;
    public final x4l.c e;
    public final x4l.c f;

    public w(CreditCardUiService creditCardUiService, xx4.d memoryCache, xx4.e storage, ox4.c contentItemEntityMapper) {
        Intrinsics.checkNotNullParameter(creditCardUiService, "creditCardUiService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(contentItemEntityMapper, "contentItemEntityMapper");
        this.f116705a = creditCardUiService;
        this.f116706b = memoryCache;
        this.f116707c = storage;
        this.d = contentItemEntityMapper;
        Continuation continuation = null;
        final int i = 0;
        this.e = new x4l.c(new cuh.a(this, continuation, 13), new Function1(this) { // from class: dp4.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f116699b;

            {
                this.f116699b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        cp4.y key = (cp4.y) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (vm4.b) this.f116699b.f116706b.a(key);
                    default:
                        cp4.x xVar = (cp4.x) obj2;
                        Intrinsics.checkNotNullParameter(xVar, "<destruct>");
                        return (vm4.a) this.f116699b.f116706b.a(new cp4.x(xVar.f107866a, xVar.f107867b));
                }
            }
        }, new Function2(this) { // from class: dp4.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f116703b;

            {
                this.f116703b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        cp4.y key = (cp4.y) obj2;
                        vm4.b sections = (vm4.b) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(sections, "sections");
                        this.f116703b.f116706b.b(key, sections);
                        break;
                    default:
                        cp4.x xVar = (cp4.x) obj2;
                        vm4.a details = (vm4.a) obj3;
                        Intrinsics.checkNotNullParameter(xVar, "<destruct>");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f116703b.f116706b.b(new cp4.x(xVar.f107866a, xVar.f107867b), details);
                        break;
                }
                return Unit.f186387a;
            }
        }, new dob.c(this, continuation, 6), new n(this, continuation, 4));
        final int i2 = 1;
        this.f = new x4l.c(new cuh.a(this, continuation, 12), new Function1(this) { // from class: dp4.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f116699b;

            {
                this.f116699b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        cp4.y key = (cp4.y) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (vm4.b) this.f116699b.f116706b.a(key);
                    default:
                        cp4.x xVar = (cp4.x) obj2;
                        Intrinsics.checkNotNullParameter(xVar, "<destruct>");
                        return (vm4.a) this.f116699b.f116706b.a(new cp4.x(xVar.f107866a, xVar.f107867b));
                }
            }
        }, new Function2(this) { // from class: dp4.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f116703b;

            {
                this.f116703b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        cp4.y key = (cp4.y) obj2;
                        vm4.b sections = (vm4.b) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(sections, "sections");
                        this.f116703b.f116706b.b(key, sections);
                        break;
                    default:
                        cp4.x xVar = (cp4.x) obj2;
                        vm4.a details = (vm4.a) obj3;
                        Intrinsics.checkNotNullParameter(xVar, "<destruct>");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f116703b.f116706b.b(new cp4.x(xVar.f107866a, xVar.f107867b), details);
                        break;
                }
                return Unit.f186387a;
            }
        }, new akl.o(2, 28, null), new a19.e(3, 25, continuation));
    }
}
