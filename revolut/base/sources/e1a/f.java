package e1a;

import a09.o;
import com.revolut.feature.payments.splitbill.impl.data.splitbilllink.SplitBillLinkService;
import com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLink;
import com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLinkDetails;
import dp4.a1;
import dp4.f1;
import dp4.z0;
import dze.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SplitBillLinkService f121935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f121936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f121937c;
    public final x4l.c d;
    public final x4l.c e;

    public f(SplitBillLinkService splitBillLinkService, g syncHelper, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(splitBillLinkService, "splitBillLinkService");
        Intrinsics.checkNotNullParameter(syncHelper, "syncHelper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f121935a = splitBillLinkService;
        this.f121936b = memoryCache;
        this.f121937c = storage;
        Continuation continuation = null;
        a1 a1Var = new a1(this, continuation, 5);
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: e1a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f121927b;

            {
                this.f121927b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (SplitBillLinkDetails) this.f121927b.f121936b.get(id10);
                    default:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f121927b.f121936b.get("CACHE_KEY_SPLIT_BILL_LINKS");
                }
            }
        };
        Function2 function2 = new Function2(this) { // from class: e1a.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f121929b;

            {
                this.f121929b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        String id10 = (String) obj2;
                        SplitBillLinkDetails value = (SplitBillLinkDetails) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f121929b.f121936b.f(id10, value);
                        break;
                    default:
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f121929b.f121936b.f("CACHE_KEY_SPLIT_BILL_LINKS", value2);
                        break;
                }
                return Unit.f186387a;
            }
        };
        int i2 = 2;
        this.d = new x4l.c(a1Var, function1, function2, new e0b.c(this, continuation, i2), new f1(this, continuation, i2));
        final int i3 = 1;
        this.e = new x4l.c(new o(this, continuation, 28), new Function1(this) { // from class: e1a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f121927b;

            {
                this.f121927b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (SplitBillLinkDetails) this.f121927b.f121936b.get(id10);
                    default:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f121927b.f121936b.get("CACHE_KEY_SPLIT_BILL_LINKS");
                }
            }
        }, new Function2(this) { // from class: e1a.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f121929b;

            {
                this.f121929b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        String id10 = (String) obj2;
                        SplitBillLinkDetails value = (SplitBillLinkDetails) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f121929b.f121936b.f(id10, value);
                        break;
                    default:
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f121929b.f121936b.f("CACHE_KEY_SPLIT_BILL_LINKS", value2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new n(this, continuation, 4), new z0(this, continuation, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(e1a.f r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1a.f.a(e1a.f, gim.c):java.lang.Object");
    }

    public final Object b(gim.c cVar) {
        Unit unit = Unit.f186387a;
        Object objD = this.e.d(unit, false, cVar);
        return objD == fim.a.COROUTINE_SUSPENDED ? objD : unit;
    }

    public final ArrayList c() {
        List list = (List) p.a.j(f1a.o.class, KTypeProjection.INSTANCE, List.class, this.f121937c, "CACHE_KEY_SPLIT_BILL_LINKS");
        if (list == null) {
            return null;
        }
        List<f1a.o> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (f1a.o oVar : list2) {
            Intrinsics.checkNotNullParameter(oVar, "<this>");
            String str = oVar.f131216a;
            String str2 = oVar.f131217b;
            String str3 = oVar.f131218c;
            long j2 = oVar.d;
            long j3 = oVar.e;
            b2a.a aVarG = uj3.b.G(oVar.f);
            jo3.b bVar = oVar.f131219g;
            arrayList.add(new SplitBillLink(str, str2, str3, j2, j3, aVarG, bVar != null ? hx7.a.v(bVar) : null));
        }
        return arrayList;
    }
}
