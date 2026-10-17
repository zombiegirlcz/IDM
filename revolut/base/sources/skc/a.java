package skc;

import android.content.Context;
import com.revolut.feature.rfi_tool.impl.data.service.RfiToolService;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import sri.o;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f263805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f263806b;

    public a(b bVar, int i) {
        this.f263805a = bVar;
        this.f263806b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f263805a;
        nj0.a aVar = bVar.f263808b;
        int i = this.f263806b;
        if (i == 0) {
            return new vkc.b((m) bVar.e.get());
        }
        if (i == 1) {
            Context context = bVar.f263807a;
            e.Companion.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            return o.c(context, null, null, 14);
        }
        if (i == 2) {
            return new qkc.a((RfiToolService) bVar.f263810g.get(), new pkc.a());
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        ik0.b factory = ((nj0.d) aVar).m();
        s.j(factory);
        ek.a converterFactory = ((nj0.d) aVar).d();
        g.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(factory, null, null, converterFactory, null, 27).create(RfiToolService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        RfiToolService rfiToolService = (RfiToolService) objCreate;
        s.k(rfiToolService);
        return rfiToolService;
    }
}
