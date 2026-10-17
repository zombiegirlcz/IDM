package vx9;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f292850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f292851c;

    public /* synthetic */ a(c cVar, List list, int i) {
        this.f292849a = i;
        this.f292850b = cVar;
        this.f292851c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f292849a) {
            case 0:
                List contactProviders = (List) obj2;
                Intrinsics.checkNotNullParameter(contactProviders, "contactProviders");
                boolean zIsEmpty = contactProviders.isEmpty();
                c cVar = this.f292850b;
                List list = this.f292851c;
                return !zIsEmpty ? new pfm.a(te0.w.o0(p0.f264003c, new vnl.o(cVar, contactProviders, null, 14)), new vx5.m(new a(cVar, list, 1), 2), 4) : new pfm.a(((ty1.b) ((uw1.c) cVar.e)).f(uw1.f.PAY_ID), new vx5.m(new a(cVar, list, 2), 3), 4);
            case 1:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f292850b.b(this.f292851c);
            default:
                Boolean payIdIsEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(payIdIsEnabled, "payIdIsEnabled");
                return payIdIsEnabled.booleanValue() ? this.f292850b.b(this.f292851c) : pfm.m.f235744a;
        }
    }
}
