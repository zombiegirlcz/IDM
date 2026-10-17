package io3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.provider.Settings;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import ce9.q;
import com.facebook.shimmer.ShimmerConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.models.plugins.EntryPointParams;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceAddress;
import com.revolut.retail.feature.esim.api.model.EsimConnectivityTroubleshootingInfo;
import dej.p1;
import dej.u3;
import ft3.j1;
import g9f.n0;
import grl.r2;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kfj.b3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import n6l.p;
import n6l.t;
import org.joda.time.DateTime;
import qh0.d0;
import qh0.g0;
import qh0.h0;
import qh0.k0;
import qh0.l0;
import vg0.b0;
import vg0.c0;
import vg0.x;
import vg0.z;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public abstract class h {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecutionDestination A(htj.o r12) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io3.h.A(htj.o):com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecutionDestination");
    }

    public static final EsimConnectivityTroubleshootingInfo B(kfj.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        String strF = lVar.getSimProfileId();
        Long lA = lVar.getEstimatedConnectivitySetupFinalisationDate();
        Instant instantOfEpochMilli = lA != null ? Instant.ofEpochMilli(lA.longValue()) : null;
        boolean zC = lVar.getReissueAvailable();
        Long lD = lVar.getReissueAvailableAfterDate();
        Instant instantOfEpochMilli2 = lD != null ? Instant.ofEpochMilli(lD.longValue()) : null;
        Long lB = lVar.getPortingScheduledDate();
        return new EsimConnectivityTroubleshootingInfo(strF, instantOfEpochMilli, lB != null ? Instant.ofEpochMilli(lB.longValue()) : null, instantOfEpochMilli2, zC, lVar.getReissueRequested());
    }

    public static final d02.b C(yy1.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String strE = aVar.getId();
        String strI = aVar.getType();
        Intrinsics.checkNotNullParameter(strI, "<this>");
        d02.a aVar2 = d02.a.BIZUM_TRANSFER;
        if (!Intrinsics.f(strI, aVar2.a())) {
            throw new IllegalArgumentException(p.a.p("ApmType ", strI, " is not supported"));
        }
        long jD = aVar.getExpiresAt();
        long jB = aVar.getCreatedAt();
        long jC = aVar.getAmount().c();
        xi0.a aVar3 = xi0.b.Companion;
        String strD = aVar.getAmount().d();
        aVar3.getClass();
        return new d02.b(strE, aVar2, jD, jB, new dj0.d(jC, xi0.a.a(strD)), aVar.getRecurring(), aVar.getMerchantName(), aVar.getOperationId(), aVar.getDescription());
    }

    public static final hha.l D(zek.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        List listA = nVar.getActivePlanCampaigns();
        ArrayList arrayList = null;
        if (listA != null) {
            List<zek.m> list = listA;
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            for (zek.m mVar : list) {
                Intrinsics.checkNotNullParameter(mVar, "<this>");
                hha.k kVarValueOf = hha.k.valueOf(mVar.getType());
                String strC = mVar.getPricingPlanId();
                String strA = mVar.getEndDate();
                LocalDate localDateFrom = strA != null ? LocalDate.from(DateTimeFormatter.ISO_LOCAL_DATE.parse(strA)) : null;
                Period period = Period.parse(mVar.getTotalPeriod());
                Intrinsics.checkNotNullExpressionValue(period, "parse(...)");
                String strB = mVar.getLeftPeriod();
                arrayList2.add(new hha.j(kVarValueOf, strC, localDateFrom, period, strB != null ? Period.parse(strB) : null));
            }
            arrayList = arrayList2;
        }
        return new hha.l(arrayList);
    }

    public static final in8.c E(rn8.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Boolean boolC = dVar.getVisibleInContacts();
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : false;
        Boolean boolA = dVar.getDiscoverableByUsername();
        boolean zBooleanValue2 = boolA != null ? boolA.booleanValue() : false;
        Boolean boolB = dVar.getProfileReveal();
        return new in8.c(zBooleanValue, zBooleanValue2, boolB != null ? boolB.booleanValue() : false);
    }

    public static final ArrayList F(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<l9l.a> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (l9l.a aVar : list2) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            xi0.a aVar2 = xi0.b.Companion;
            String strA = aVar.getFrom();
            aVar2.getClass();
            xi0.b bVarA = xi0.a.a(strA);
            xi0.b bVarA2 = xi0.a.a(aVar.getTo());
            double dB = aVar.getRate();
            Boolean boolF = aVar.getIsWeekend();
            Long lD = aVar.getWeekendEndTime();
            DateTime dateTime = null;
            DateTime dateTime2 = lD != null ? new DateTime(lD.longValue()) : null;
            Long lE = aVar.getWeekendStartTime();
            if (lE != null) {
                dateTime = new DateTime(lE.longValue());
            }
            arrayList.add(new n9l.a(bVarA, bVarA2, dB, boolF, dateTime, dateTime2));
        }
        return arrayList;
    }

    public static final qta.d G(ipk.f fVar) {
        qta.f fVar2;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        double d = fVar.f167760a;
        xi0.a aVar = xi0.b.Companion;
        String str = fVar.f167761b;
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(str);
        xi0.b bVarA2 = xi0.a.a(fVar.f167762c);
        ipk.a aVar2 = fVar.d;
        Intrinsics.checkNotNullParameter(aVar2, "<this>");
        switch (fpk.g.d[aVar2.ordinal()]) {
            case 1:
                fVar2 = qta.f.DAY;
                break;
            case 2:
                fVar2 = qta.f.WEEK;
                break;
            case 3:
                fVar2 = qta.f.MONTH;
                break;
            case 4:
                fVar2 = qta.f.THREE_MONTH;
                break;
            case 5:
                fVar2 = qta.f.SIX_MONTH;
                break;
            case 6:
                fVar2 = qta.f.YEAR;
                break;
            case 7:
                fVar2 = qta.f.FIVE_YEARS;
                break;
            case 8:
                fVar2 = qta.f.ALL;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new qta.d(d, bVarA, bVarA2, fVar2, fVar.e);
    }

    public static final u8f.h H(n0 n0Var) throws Throwable {
        Intrinsics.checkNotNullParameter(n0Var, "<this>");
        switch (e9f.d.f123985a[n0Var.ordinal()]) {
            case 1:
                return u8f.h.ACAT_FULL;
            case 2:
                return u8f.h.ACAT_PARTIAL;
            case 3:
                return u8f.h.DRS;
            case 4:
                return u8f.h.DTC;
            case 5:
                return u8f.h.ISA;
            case 6:
                return u8f.h.FOP;
            case 7:
                hx7.e.n(new IllegalStateException(j6.a.q("TransferTypeDto UNKNONW type ", n0Var.name())));
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final ArrayList I(List list) {
        Object p1Var;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            b3 b3Var = (b3) it8.next();
            Intrinsics.checkNotNullParameter(b3Var, "<this>");
            List listA = b3Var.getScopes();
            ArrayList arrayList2 = new ArrayList();
            Iterator it9 = listA.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                String str = (String) it9.next();
                u3[] u3VarArrValues = u3.values();
                int length = u3VarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    u3 u3Var = u3VarArrValues[i];
                    if (a0.z(u3Var.name(), str, true)) {
                        p1Var = u3Var;
                        break;
                    }
                    i++;
                }
                if (p1Var != null) {
                    arrayList2.add(p1Var);
                }
            }
            p1Var = arrayList2.isEmpty() ? null : new p1(b3Var.getSimProfileId(), arrayList2);
            if (p1Var != null) {
                arrayList.add(p1Var);
            }
        }
        return arrayList;
    }

    public static final n0 J(u8f.h hVar) {
        switch (hVar == null ? -1 : e9f.d.f123986b[hVar.ordinal()]) {
            case -1:
                r6.b.D("TransferType UNKNONW type.");
                return n0.UNKNOWN;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return n0.ACAT_FULL;
            case 2:
                return n0.ACAT_PARTIAL;
            case 3:
                return n0.DRS;
            case 4:
                return n0.DTC;
            case 5:
                return n0.ISA;
            case 6:
                return n0.FOP;
        }
    }

    public static final String K(yzi.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        switch (gtj.c.f146622a[bVar.ordinal()]) {
            case 1:
                return "COMPLETED";
            case 2:
                return "FAILED";
            case 3:
                return "CREATED";
            case 4:
                return "IN_REVIEW";
            case 5:
                return "APPROVED";
            case 6:
                return "DEFERRED";
            case 7:
                return "SKIPPED";
            case 8:
                return "UNKNOWN";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public static final ehl.w L(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:88)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public static final ipk.a M(qta.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        switch (fpk.g.f137131a[fVar.ordinal()]) {
            case 1:
                return ipk.a.DAY;
            case 2:
                return ipk.a.WEEK;
            case 3:
                return ipk.a.MONTH;
            case 4:
                return ipk.a.THREE_MONTH;
            case 5:
                return ipk.a.SIX_MONTH;
            case 6:
                return ipk.a.YEAR;
            case 7:
                return ipk.a.FIVE_YEARS;
            case 8:
                return ipk.a.ALL;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final zek.n N(hha.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        List list = lVar.f152320a;
        ArrayList arrayList = null;
        if (list != null) {
            List<hha.j> list2 = list;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            for (hha.j jVar : list2) {
                Intrinsics.checkNotNullParameter(jVar, "<this>");
                String strName = jVar.f152316a.name();
                String str = jVar.f152317b;
                LocalDate localDate = jVar.f152318c;
                String str2 = localDate != null ? localDate.format(DateTimeFormatter.ISO_LOCAL_DATE) : null;
                String string = jVar.d.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                Period period = jVar.e;
                arrayList2.add(new zek.m(strName, str, str2, string, period != null ? period.toString() : null));
            }
            arrayList = arrayList2;
        }
        return new zek.n(arrayList);
    }

    public static final qh0.n0 O(c0 c0Var) {
        int i = ph0.e.f236191a[c0Var.ordinal()];
        if (i == 1) {
            return qh0.n0.DISCOURAGED;
        }
        if (i == 2) {
            return qh0.n0.PREFERRED;
        }
        if (i == 3) {
            return qh0.n0.REQUIRED;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final b0 P(l0 l0Var) {
        vg0.a0 zVar;
        Intrinsics.checkNotNullParameter(l0Var, "<this>");
        if (!(l0Var instanceof k0)) {
            throw new NoWhenBranchMatchedException();
        }
        k0 k0Var = (k0) l0Var;
        String str = k0Var.f246401a;
        String str2 = k0Var.f246403c;
        h0 h0Var = k0Var.d;
        if (h0Var instanceof d0) {
            d0 d0Var = (d0) h0Var;
            zVar = new x(d0Var.f246391a, d0Var.f246392b);
        } else {
            if (!(h0Var instanceof g0)) {
                throw new NoWhenBranchMatchedException();
            }
            g0 g0Var = (g0) h0Var;
            zVar = new z(g0Var.f246395a, g0Var.f246396b, g0Var.f246397c, g0Var.d);
        }
        return new b0(str, str2, zVar);
    }

    public static final zoe.a Q(dne.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        dj0.d dVar = aVar.f116289b;
        return new zoe.a(dVar.f115082a, dVar.f115083b.f306286a);
    }

    public static final CreditApplicationPluginFlowContract$Configuration R(PluginPayload pluginPayload, String flowName) {
        Intrinsics.checkNotNullParameter(pluginPayload, "<this>");
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        EntryPointParams entryPointParams = pluginPayload.f66249c;
        r2 r2Var = entryPointParams.f66246b;
        it3.d dVar = pluginPayload.f66247a;
        String str = dVar.f168323a;
        j1 j1Var = dVar.f168328j;
        gt3.f fVar = dVar.k;
        wi0.b bVar = pluginPayload.f66248b;
        ks3.b bVar2 = dVar.f168325c;
        ks3.c cVar = dVar.d;
        boolean z = dVar.f168327h;
        String str2 = dVar.f168332p;
        boolean z3 = dVar.f168333q;
        String str3 = entryPointParams.f66245a;
        return new CreditApplicationPluginFlowContract$Configuration(flowName, str, r2Var, j1Var, fVar, bVar, bVar2, cVar, z, pluginPayload.d, str2, z3, dVar.f168334r, str3, dVar.f168330m, Integer.valueOf(dVar.f168329l));
    }

    public static final epk.b S(qta.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        switch (fpk.g.f137131a[fVar.ordinal()]) {
            case 1:
                return epk.b.DAY;
            case 2:
                return epk.b.WEEK;
            case 3:
                return epk.b.MONTH;
            case 4:
                return epk.b.THREE_MONTHS;
            case 5:
                return epk.b.SIX_MONTHS;
            case 6:
                return epk.b.YEAR;
            case 7:
                return epk.b.FIVE_YEARS;
            case 8:
                return epk.b.ALL;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final zel.f T(vmh.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        switch (rmh.a.f255320a[fVar.ordinal()]) {
            case 1:
                return zel.f.STOCKS;
            case 2:
                return zel.f.ETP;
            case 3:
                return zel.f.BOND;
            case 4:
                return zel.f.CFD;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final void a(q qVar, ce9.n action) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        ((ce9.j) qVar).f.accept(action);
    }

    public static final String b(TravelExperienceAddress travelExperienceAddress) {
        Intrinsics.checkNotNullParameter(travelExperienceAddress, "<this>");
        List listK = v.k(travelExperienceAddress.f92780a, travelExperienceAddress.f92781b, travelExperienceAddress.f92782c, travelExperienceAddress.d, travelExperienceAddress.e, travelExperienceAddress.f);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listK) {
            if (!kotlin.text.d0.W((String) obj2)) {
                arrayList.add(obj2);
            }
        }
        return zhm.d0.k0(arrayList, ", ", null, null, 0, null, 62);
    }

    public static final epk.a c(epk.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        switch (fpk.g.f137132b[bVar.ordinal()]) {
            case 1:
                return epk.a.THIRTY_MINUTES;
            case 2:
                return epk.a.FOUR_HOURS;
            case 3:
                return epk.a.DAY;
            case 4:
                return epk.a.TWO_DAYS;
            case 5:
                return epk.a.FOUR_DAYS;
            case 6:
                return epk.a.WEEK;
            case 7:
            case 8:
                return epk.a.FOUR_WEEKS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String d(epk.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        switch (fpk.g.f137132b[bVar.ordinal()]) {
            case 1:
                return epk.a.FIVE_MINUTES.a();
            case 2:
                return epk.a.FIFTEEN_MINUTES.a();
            case 3:
                return epk.a.NINETY_MINUTES.a();
            case 4:
            case 5:
            case 6:
                return epk.a.DAY.a();
            case 7:
            case 8:
                return epk.a.WEEK.a();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final dj0.d e(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        long j2 = dVar.i;
        xi0.a aVar = xi0.b.Companion;
        String str = dVar.f163147c;
        aVar.getClass();
        return new dj0.d(j2, xi0.a.a(str));
    }

    public static final Integer g(f01.a aVar, String resKey) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(resKey, "resKey");
        int iA = aVar.a(resKey);
        if (iA != 0) {
            return Integer.valueOf(iA);
        }
        IllegalStateException illegalStateException = new IllegalStateException("Unknown drawable resource key: ".concat(resKey));
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        return null;
    }

    public static final boolean h(char c2) {
        if (c2 == 8206 || c2 == 8207) {
            return true;
        }
        if (8234 > c2 || c2 > 8238) {
            return 8294 <= c2 && c2 <= 8297;
        }
        return true;
    }

    public static final boolean i(nel.z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return zVar == nel.z.BOND;
    }

    public static final boolean j(nel.z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return zVar == nel.z.CFD;
    }

    public static final boolean k(nel.z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return zVar == nel.z.ETF || zVar == nel.z.ETC || zVar == nel.z.ETN;
    }

    public static final boolean l(nel.z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return zVar == nel.z.FUND;
    }

    public static final boolean m(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Settings.System.getInt(context.getContentResolver(), "haptic_feedback_enabled", 0) != 0;
    }

    public static final boolean n(nel.z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return zVar == nel.z.EQUITY || zVar == nel.z.ADR || zVar == nel.z.WARRANT || zVar == nel.z.SPAC;
    }

    public static final boolean o(nel.z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return zVar == nel.z.STRUCTURED_NOTE;
    }

    public static final void p(q qVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        if (i - (i2 + 1) <= 10) {
            a(qVar, ce9.n.LOAD_NEXT_PAGE);
        }
    }

    public static final Bitmap q(Bitmap bitmap) {
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * 0.25f), (int) (bitmap.getHeight() * 0.25f), false);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        ImageReader imageReaderNewInstance = ImageReader.newInstance(bitmapCreateScaledBitmap.getWidth(), bitmapCreateScaledBitmap.getHeight(), 1, 1, 768L);
        Intrinsics.checkNotNullExpressionValue(imageReaderNewInstance, "newInstance(...)");
        RenderNode renderNodeD = q2.a.D();
        renderNodeD.setPosition(0, 0, bitmapCreateScaledBitmap.getWidth(), bitmapCreateScaledBitmap.getHeight());
        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
        RenderEffect renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(25.0f, 25.0f, Shader.TileMode.MIRROR);
        Intrinsics.checkNotNullExpressionValue(renderEffectCreateBlurEffect, "createBlurEffect(...)");
        renderNodeD.setRenderEffect(renderEffectCreateBlurEffect);
        RecordingCanvas recordingCanvasBeginRecording = renderNodeD.beginRecording();
        Intrinsics.checkNotNullExpressionValue(recordingCanvasBeginRecording, "beginRecording(...)");
        recordingCanvasBeginRecording.drawBitmap(bitmapCreateScaledBitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        renderNodeD.endRecording();
        HardwareRenderer hardwareRendererD = q2.a.d();
        hardwareRendererD.setSurface(imageReaderNewInstance.getSurface());
        hardwareRendererD.setContentRoot(renderNodeD);
        hardwareRendererD.createRenderRequest().setWaitForPresent(true).syncAndDraw();
        Image imageAcquireNextImage = imageReaderNewInstance.acquireNextImage();
        if (imageAcquireNextImage == null) {
            throw new RuntimeException("Failed to acquire Image");
        }
        HardwareBuffer hardwareBuffer = imageAcquireNextImage.getHardwareBuffer();
        if (hardwareBuffer == null) {
            throw new RuntimeException("Failed to acquire HardwareBuffer");
        }
        Bitmap bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, null);
        if (bitmapWrapHardwareBuffer == null) {
            throw new RuntimeException("Failed to create Bitmap from HardwareBuffer");
        }
        hardwareBuffer.close();
        imageAcquireNextImage.close();
        imageReaderNewInstance.close();
        renderNodeD.discardDisplayList();
        hardwareRendererD.destroy();
        return bitmapWrapHardwareBuffer;
    }

    public static final Bitmap r(Context context, Bitmap bitmap) {
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * 0.25f), (int) (bitmap.getHeight() * 0.25f), false);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        RenderScript renderScriptCreate = RenderScript.create(context);
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
        Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
        scriptIntrinsicBlurCreate.setRadius(25.0f);
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
        allocationCreateFromBitmap2.copyTo(bitmapCreateScaledBitmap);
        Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, bitmapCreateScaledBitmap.getWidth(), bitmapCreateScaledBitmap.getHeight(), false);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap2, "createScaledBitmap(...)");
        return bitmapCreateScaledBitmap2;
    }

    public static final void s(ShimmerConstraintLayout shimmerConstraintLayout) {
        Intrinsics.checkNotNullParameter(shimmerConstraintLayout, "<this>");
        shimmerConstraintLayout.i0(yp0.a0.b());
    }

    public static final TextLocalisedClause t(myf.v vVar) {
        int i;
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        int i2 = d3g.a.f111101a[vVar.ordinal()];
        if (i2 == 1) {
            i = R$string.experiences_additional_details_guide_type_audio;
        } else if (i2 == 2) {
            i = R$string.experiences_additional_details_guide_type_written;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.experiences_additional_details_guide_type_guide;
        }
        return new TextLocalisedClause(i, null, null, 14);
    }

    public static final List u(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it8 = collection.iterator();
        while (it8.hasNext()) {
            Pair pair = (Pair) it8.next();
            xi0.b bVar = (xi0.b) pair.f186385a;
            xi0.b bVar2 = (xi0.b) pair.f186386b;
            if (!Intrinsics.f(bVar, bVar2) && cp5.d.E(bVar) && cp5.d.E(bVar2)) {
                linkedHashSet.add(cp5.d.d(pair));
            }
        }
        if (linkedHashSet.isEmpty()) {
            linkedHashSet = null;
        }
        if (linkedHashSet != null) {
            return zhm.d0.d1(linkedHashSet);
        }
        return null;
    }

    public static final c93.j v(n6l.w wVar) {
        c93.l lVarW;
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        c93.l lVarW2 = w(wVar.getPrice());
        n6l.v vVarA = wVar.getOriginalPrice();
        if (vVarA != null) {
            lVarW = w(vVarA);
        } else {
            c93.l.Companion.getClass();
            lVarW = c93.l.e;
        }
        return new c93.j(lVarW2, lVarW);
    }

    public static final c93.l w(n6l.v vVar) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        dj0.d dVarO = mo3.a.o(vVar.getTotal());
        dj0.d dVarO2 = mo3.a.o(vVar.getFee());
        List listC = vVar.getTaxes();
        if (listC != null) {
            List<p> list = listC;
            arrayList = new ArrayList(w.t(list, 10));
            for (p pVar : list) {
                Intrinsics.checkNotNullParameter(pVar, "<this>");
                dj0.d dVarO3 = mo3.a.o(pVar.getAmount());
                c93.n nVar = c93.o.Companion;
                String strB = pVar.getTaxName();
                nVar.getClass();
                arrayList.add(new c93.m(dVarO3, c93.n.a(strB)));
            }
        } else {
            arrayList = null;
        }
        t tVarB = vVar.getQuote();
        return new c93.l(dVarO, dVarO2, arrayList, tVarB != null ? hx7.q.d0(tVarB) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ce  */
    /* JADX WARN: Type inference failed for: r4v1, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.transfer_reasons.models.reason.TransferReasonNode x(gsf.n r10) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io3.h.x(gsf.n):com.revolut.feature.transfer_reasons.models.reason.TransferReasonNode");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0150  */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v9, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.transfer_reasons.models.reason.TransferReasons y(gsf.p r18) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io3.h.y(gsf.p):com.revolut.feature.transfer_reasons.models.reason.TransferReasons");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecution z(htj.r r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r2 = r10.f155436a
            java.lang.String r3 = r10.f155437b
            java.lang.String r5 = r10.d
            java.lang.String r0 = r10.f155438c
            int r1 = r0.hashCode()
            switch(r1) {
                case -1429540080: goto L5e;
                case 527514546: goto L52;
                case 1383663147: goto L46;
                case 1430517727: goto L3a;
                case 1746537160: goto L2e;
                case 1967871671: goto L22;
                case 2066319421: goto L15;
                default: goto L14;
            }
        L14:
            goto L66
        L15:
            java.lang.String r1 = "FAILED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            goto L66
        L1e:
            yzi.b r0 = yzi.b.FAILED
        L20:
            r4 = r0
            goto L6c
        L22:
            java.lang.String r1 = "APPROVED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L66
        L2b:
            yzi.b r0 = yzi.b.APPROVED
            goto L20
        L2e:
            java.lang.String r1 = "CREATED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L37
            goto L66
        L37:
            yzi.b r0 = yzi.b.CREATED
            goto L20
        L3a:
            java.lang.String r1 = "DEFERRED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L43
            goto L66
        L43:
            yzi.b r0 = yzi.b.DEFERRED
            goto L20
        L46:
            java.lang.String r1 = "COMPLETED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4f
            goto L66
        L4f:
            yzi.b r0 = yzi.b.COMPLETED
            goto L20
        L52:
            java.lang.String r1 = "IN_REVIEW"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5b
            goto L66
        L5b:
            yzi.b r0 = yzi.b.IN_REVIEW
            goto L20
        L5e:
            java.lang.String r1 = "SKIPPED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L69
        L66:
            yzi.b r0 = yzi.b.UNKNOWN
            goto L20
        L69:
            yzi.b r0 = yzi.b.SKIPPED
            goto L20
        L6c:
            long r6 = r10.e
            java.util.List r0 = r10.f
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r8 = new java.util.ArrayList
            r1 = 10
            int r1 = zhm.w.t(r0, r1)
            r8.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L81:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L95
            java.lang.Object r1 = r0.next()
            htj.o r1 = (htj.o) r1
            com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecutionDestination r1 = A(r1)
            r8.add(r1)
            goto L81
        L95:
            htj.o r10 = r10.f155439g
            if (r10 == 0) goto L9f
            com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecutionDestination r10 = A(r10)
        L9d:
            r9 = r10
            goto La1
        L9f:
            r10 = 0
            goto L9d
        La1:
            com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecution r1 = new com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecution
            r1.<init>(r2, r3, r4, r5, r6, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io3.h.z(htj.r):com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecution");
    }

    public abstract StatementPeriod f();
}
