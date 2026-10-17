package v58;

import com.revolut.core.error.data.model.ServerError;
import efm.d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import r58.c;
import skm.p0;
import te0.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f286163b;

    public /* synthetic */ e(h hVar, int i) {
        this.f286162a = i;
        this.f286163b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f286162a) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                ServerError serverErrorA = this.f286163b.f286167c.a(error);
                Integer numValueOf = serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null;
                return (numValueOf != null && numValueOf.intValue() == 20011) ? d0.m(c.a.f251541a) : (numValueOf != null && numValueOf.intValue() == 20012) ? d0.m(c.d.f251544a) : (numValueOf != null && numValueOf.intValue() == 20017) ? d0.m(c.C1388c.f251543a) : (numValueOf != null && numValueOf.intValue() == 20018) ? d0.m(c.b.f251542a) : d0.l(error);
            case 1:
                u58.d dto = (u58.d) obj2;
                Intrinsics.checkNotNullParameter(dto, "dto");
                h hVar = this.f286163b;
                z zVarD = hVar.f286165a.claimAccountActivation(dto).D(c.e.f251545a);
                Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
                return ue0.e.D(zVarD, new e(hVar, 0));
            case 2:
                r58.a request = (r58.a) obj2;
                Intrinsics.checkNotNullParameter(request, "request");
                return w.o0(p0.f264003c, new v06.i(this.f286163b, request, null, 12));
            default:
                u58.e dto2 = (u58.e) obj2;
                Intrinsics.checkNotNullParameter(dto2, "dto");
                z zVarD2 = this.f286163b.f286165a.declineAccountActivation(dto2).D(Unit.f186387a);
                Intrinsics.checkNotNullExpressionValue(zVarD2, "toSingleDefault(...)");
                return zVarD2;
        }
    }
}
