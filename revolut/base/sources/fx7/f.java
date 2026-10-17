package fx7;

import a08.f0;
import efm.r;
import java.util.Date;
import jx7.a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kx7.l0;
import kx7.r0;
import kx7.y0;
import org.jetbrains.annotations.NotNull;
import pfm.t;
import te0.w;
import zw7.c0;
import zw7.p;
import zw7.q;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f138760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ij0.a f138761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r80.c f138762c;

    public f(l0 petRepository, ij0.a configuration, r80.c imageCompressTransformer) {
        Intrinsics.checkNotNullParameter(petRepository, "petRepository");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(imageCompressTransformer, "imageCompressTransformer");
        this.f138760a = petRepository;
        this.f138761b = configuration;
        this.f138762c = imageCompressTransformer;
    }

    public static r c(f fVar, c0 petType, zw7.h breedType) {
        Intrinsics.checkNotNullParameter(petType, "petType");
        Intrinsics.checkNotNullParameter(breedType, "breedType");
        return nim.a.w(((y0) fVar.f138760a).b(petType, false), new c(breedType, 0));
    }

    public final t a(String petId, p petData, q quoteData) {
        Intrinsics.checkNotNullParameter(petId, "petId");
        Intrinsics.checkNotNullParameter(petData, "petData");
        Intrinsics.checkNotNullParameter(quoteData, "quoteData");
        y0 y0Var = (y0) this.f138760a;
        y0Var.getClass();
        Intrinsics.checkNotNullParameter(petId, "petId");
        Intrinsics.checkNotNullParameter(petData, "petData");
        Intrinsics.checkNotNullParameter(quoteData, "quoteData");
        String str = petData.f325823a;
        String strA = petData.f325824b.a();
        String strA2 = petData.f325825c.a();
        String strA3 = petData.d.a();
        String str2 = petData.e;
        String strK = ce9.m.K(petData.f);
        Intrinsics.checkNotNullExpressionValue(strK, "toISO8601Format(...)");
        pfm.a aVarE = y0Var.f190501a.editPet(petId, new a.b(str, strA, strA2, strA3, str2, strK, petData.f325826g, mo3.a.p(petData.f325827h), quoteData.f325831a, quoteData.f325832b)).e(y0Var.a().g(Unit.f186387a, false));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        t tVarL = w.g0(aVarE).l(new b(this, 1));
        Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
        return tVarL;
    }

    public final String b(String relativeUrl) {
        Intrinsics.checkNotNullParameter(relativeUrl, "relativeUrl");
        return com.google.android.gms.internal.mlkit_vision_face.a.o(d0.g0(this.f138761b.getBaseUrl(), "/"), "/", d0.e0(relativeUrl, "/"));
    }

    public final r d(String petId) {
        Intrinsics.checkNotNullParameter(petId, "petId");
        r map = ((y0) this.f138760a).a().f(Unit.f186387a, false).map(new f0(14, new atg.t(petId, petId, 5)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final r e(Date startDate, String petId, boolean z) {
        Intrinsics.checkNotNullParameter(petId, "petId");
        Intrinsics.checkNotNullParameter(startDate, "policyStartDate");
        y0 y0Var = (y0) this.f138760a;
        y0Var.getClass();
        Intrinsics.checkNotNullParameter(petId, "petId");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        return ((w4l.f) y0Var.f190504g.getValue()).f(new r0(petId, startDate), z);
    }
}
