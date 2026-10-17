package xtg;

import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureProgress;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureProgressStep;
import efm.d0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import le.u1;
import retrofit2.HttpException;
import ufm.i;
import wtg.c0;
import wtg.o;
import wtg.r;
import wtg.w;
import wtg.z;
import xng.l;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f308812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f308813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f308814c;

    public /* synthetic */ c(e eVar, String str, int i) {
        this.f308812a = i;
        this.f308813b = eVar;
        this.f308814c = str;
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        stg.c cVar;
        int i = this.f308812a;
        String str = this.f308814c;
        e eVar = this.f308813b;
        switch (i) {
            case 0:
                z it8 = (z) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Object obj3 = utg.b.f283100a;
                Intrinsics.checkNotNullParameter(it8, "<this>");
                w wVar = it8.f299981a;
                String str2 = wVar.f299974a;
                h4l.c cVar2 = (h4l.c) u1.v(wVar.f299975b, utg.b.f283100a);
                if (cVar2 == null) {
                    cVar2 = h4l.c.UNKNOWN;
                }
                h4l.c cVar3 = cVar2;
                String str3 = wVar.f299976c;
                Instant instant = Instant.parse(wVar.d);
                Intrinsics.checkNotNullExpressionValue(instant, "parse(...)");
                Instant instant2 = Instant.parse(wVar.e);
                Intrinsics.checkNotNullExpressionValue(instant2, "parse(...)");
                h4l.b bVar = (h4l.b) u1.v(wVar.f, utg.b.f283102c);
                if (bVar == null) {
                    bVar = h4l.b.UNKNOWN;
                }
                h4l.b bVar2 = bVar;
                String str4 = wVar.f299977g;
                boolean z = it8.e;
                String str5 = wVar.f299978h;
                AccountClosureProgressStep accountClosureProgressStepB = utg.b.b(it8.f299982b);
                List list = it8.f299983c;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    arrayList.add(utg.b.b((c0) it9.next()));
                }
                List list2 = it8.d;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it10 = list2.iterator();
                while (it10.hasNext()) {
                    arrayList2.add(utg.b.b((c0) it10.next()));
                }
                AccountClosureProgress accountClosureProgress = new AccountClosureProgress(str2, cVar3, str3, instant, instant2, bVar2, str4, str5, accountClosureProgressStepB, arrayList, arrayList2, z, it8.f);
                stg.b bVarB = eVar.f308817c.b(str);
                AccountClosureProgressStep accountClosureProgressStepA = (bVarB == null || (cVar = bVarB.i) == null) ? null : utg.b.a(cVar);
                if (accountClosureProgressStepA != null && !accountClosureProgressStepA.equals(accountClosureProgressStepB)) {
                    eVar.e.G(Unit.f186387a, j6.a.q("ACCOUNT_CLOSURE_PROGRESS_UPDATED_KEY_", str), wim.z.d(o0.b(Unit.class)));
                }
                return accountClosureProgress;
            case 1:
                Throwable th10 = (Throwable) obj2;
                Integer numValueOf = th10 instanceof HttpException ? Integer.valueOf(((HttpException) th10).code()) : th10 instanceof ServerErrorException ? Integer.valueOf(((ServerErrorException) th10).e) : null;
                if (numValueOf != null && numValueOf.intValue() == 404) {
                    eVar.f308817c.a(str);
                    eVar.f308816b.remove("ACCOUNT_CLOSURE_PROGRESS_MEM_KEY" + str);
                }
                return Unit.f186387a;
            default:
                r accountClosureDto = (r) obj2;
                Intrinsics.checkNotNullParameter(accountClosureDto, "accountClosureDto");
                d0<o> accountClosureFeedbackOptions = eVar.f308815a.getAccountClosureFeedbackOptions(str);
                xt1.a aVar = new xt1.a(11, new l(accountClosureDto, 21));
                accountClosureFeedbackOptions.getClass();
                return new i(accountClosureFeedbackOptions, aVar, 1);
        }
    }
}
