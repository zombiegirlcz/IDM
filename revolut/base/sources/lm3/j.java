package lm3;

import com.revolut.kompot.common.ExternalDestination;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s7a.a0;
import s7a.c0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.contacts.impl.ui_kompot.add_contact.a f196873b;

    public /* synthetic */ j(com.revolut.feature.contacts.impl.ui_kompot.add_contact.a aVar, int i) {
        this.f196872a = i;
        this.f196873b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z;
        switch (this.f196872a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8 instanceof CancellationException) {
                    z = false;
                } else {
                    this.f196873b.J2();
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "e");
                hx7.e.h(e);
                this.f196873b.J2();
                return Boolean.TRUE;
            case 2:
                a0 output = (a0) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                c0 c0Var = output.f260599a;
                c8a.a aVar = c0Var instanceof c8a.a ? (c8a.a) c0Var : null;
                String countryCode = aVar != null ? aVar.f22154a : null;
                if (countryCode == null) {
                    r6.b.r("Failed to get country code from picker");
                } else {
                    com.revolut.feature.contacts.impl.ui_kompot.add_contact.a aVar2 = this.f196873b;
                    kgm.i iVar = aVar2.f66020q;
                    iVar.getClass();
                    Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                    wi0.b.Companion.getClass();
                    vm3.c cVarM = iVar.m(wi0.a.a(countryCode));
                    if (cVarM == null) {
                        hx7.e.h(new IllegalStateException(p.a.p("Failed to get phone info for '", countryCode, "'")));
                    } else {
                        aVar2.H2(aVar2.f66025x, new lk4.g(cVarM, 9));
                    }
                }
                return Unit.f186387a;
            default:
                r7a.i result = (r7a.i) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean z3 = result instanceof r7a.f;
                com.revolut.feature.contacts.impl.ui_kompot.add_contact.a aVar3 = this.f196873b;
                if (z3 || Intrinsics.f(result, r7a.g.f252056a)) {
                    aVar3.C1(new ExternalDestination.ByIntent(((s70.b) aVar3.f66024w).b(), null));
                } else if (!(result instanceof r7a.e)) {
                    if (!(result instanceof r7a.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar3.H2(aVar3.f66025x, new llb.e(5));
                }
                return Unit.f186387a;
        }
    }
}
