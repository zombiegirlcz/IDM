package b96;

import ard.c0;
import com.revolut.domain.models.statement.StatementTemplateId;
import com.revolut.feature.direct_deposit.impl.model.DepositAmount;
import efm.d0;
import efm.r;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ryd.w;
import u80.m;
import ufm.i;
import uyd.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zxd.b f13675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f13676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zxd.c f13677c;
    public final m d;
    public final l80.e e;
    public final zk0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kgm.c f13678g;

    public h(zxd.b templateCompiler, e directDepositInteractor, zxd.c statementInteractor, m moneyFormatter, l80.e dateProvider, zk0.b fileSystemRepository, kgm.c pdfPrinter) {
        Intrinsics.checkNotNullParameter(templateCompiler, "templateCompiler");
        Intrinsics.checkNotNullParameter(directDepositInteractor, "directDepositInteractor");
        Intrinsics.checkNotNullParameter(statementInteractor, "statementInteractor");
        Intrinsics.checkNotNullParameter(moneyFormatter, "moneyFormatter");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(pdfPrinter, "pdfPrinter");
        this.f13675a = templateCompiler;
        this.f13676b = directDepositInteractor;
        this.f13677c = statementInteractor;
        this.d = moneyFormatter;
        this.e = dateProvider;
        this.f = fileSystemRepository;
        this.f13678g = pdfPrinter;
    }

    public final c0 a(DepositAmount depositAmount, String companyName) {
        Intrinsics.checkNotNullParameter(depositAmount, "depositAmount");
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        r rVarX = ((w) this.f13677c).e(StatementTemplateId.DIRECT_DEPOSIT_US).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        vkm.d dVarB = rd0.e.b(rVarX);
        e eVar = this.f13676b;
        r rVarX2 = eVar.f13672b.f(false).x();
        Intrinsics.checkNotNullExpressionValue(rVarX2, "toObservable(...)");
        vkm.d dVarB2 = rd0.e.b(rVarX2);
        d0 d0VarFirstOrError = m70.a.g(((h0) ((w) eVar.d).f258357a).D.f(Unit.f186387a, false), null, new ru5.m(29), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        b79.g gVar = new b79.g(new a(0), 7);
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, gVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        r rVarX3 = iVar.x();
        Intrinsics.checkNotNullExpressionValue(rVarX3, "toObservable(...)");
        vkm.d dVarB3 = rd0.e.b(rVarX3);
        r rVarFlatMap = eVar.a(false).flatMap(new b79.g(new b(eVar, 0), 8));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        return new c0(yh5.b.g(dVarB, dVarB2, dVarB3, rd0.e.b(rVarFlatMap)), this, depositAmount, companyName, 2);
    }
}
