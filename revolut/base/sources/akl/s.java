package akl;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.widget.Toast;
import androidx.media3.common.Format;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import com.revolut.core.error.data.model.NoAuthTokenException;
import com.revolut.core.ui_kit.views.stories.StoriesPagerView;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.pcw_auth.api.models.PcwApplicationStatus;
import com.revolut.feature.topup_screen.common.CardDetails;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import e7l.g;
import grl.wb;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import no.j2;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import org.joda.time.DateTime;
import sm.a;
import yg0.b;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6085b;

    public /* synthetic */ s(dk0.c cVar, Ref$ObjectRef ref$ObjectRef) {
        this.f6084a = 9;
        this.f6085b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z;
        Object next;
        String str;
        MappingTrackSelector.MappedTrackInfo currentMappedTrackInfo;
        Integer numC;
        Object iVar;
        int i = this.f6084a;
        int i2 = 8;
        String strN = null;
        int i3 = 2;
        int i5 = 1;
        Object obj3 = this.f6085b;
        switch (i) {
            case 0:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (gkl.o) ((z) obj3).f6123c.get("CONFIG");
            case 1:
                bo.f fVar = (bo.f) obj3;
                yg0.b bVar = (yg0.b) obj2;
                boolean z3 = bVar instanceof yg0.a;
                b.a aVar = b.a.f313482a;
                if (z3) {
                    z = false;
                } else {
                    if (!(bVar instanceof yg0.c)) {
                        if (Intrinsics.f(bVar, aVar)) {
                            throw new IllegalStateException("Integrity check event should not be NotStarted");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    z = true;
                }
                if (z3) {
                    strN = oi0.d.n((yg0.a) bVar);
                } else if (!(bVar instanceof yg0.c)) {
                    if (Intrinsics.f(bVar, aVar)) {
                        throw new IllegalStateException("Integrity check event should not be NotStarted");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                String str2 = strN;
                j2 j2Var = fVar.f;
                ve0.c cVar = fVar.f17251c;
                ((com.revolut.analytics.tracking.v3.l) j2Var).q3(wb.IntegrityCheck, z, str2, null, null);
                cVar.G(Boolean.valueOf(!z), "ic_required", wim.z.d(kotlin.jvm.internal.o0.b(Boolean.TYPE)));
                cVar.G(Long.valueOf(fVar.d.millis()), "ic_timestamp", wim.z.d(kotlin.jvm.internal.o0.b(Long.TYPE)));
                return Unit.f186387a;
            case 2:
                bq.f fVar2 = (bq.f) obj3;
                nii.n1 result = (nii.n1) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!(result instanceof nii.k1) && !(result instanceof nii.l1)) {
                    throw new IllegalStateException(result.getClass().getSimpleName().concat(" is not handled").toString());
                }
                fVar2.f17652j.c(fVar2.i.a(null));
                return Unit.f186387a;
            case 3:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                List list = ((bsi.a) obj3).f239030h;
                if (list == null) {
                    Intrinsics.r("delegates");
                    throw null;
                }
                Iterator it9 = list.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next = it9.next();
                        if (((pri.f) next) instanceof bsi.d) {
                        }
                    } else {
                        next = null;
                    }
                }
                bsi.d dVar = next instanceof bsi.d ? (bsi.d) next : null;
                if (dVar != null && Intrinsics.f(dVar.k, Boolean.TRUE)) {
                    z = true;
                }
                if (!(throwable instanceof NoAuthTokenException) || z) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
                } else {
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.WARNING, null, null, throwable, h0Var2);
                }
                return Unit.f186387a;
            case 4:
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return ((bsi.d) obj3).f.a(asi.c.EXPIRED);
            case 5:
                ((ifm.c) obj3).dispose();
                return Unit.f186387a;
            case 6:
                Unit it11 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return ((cn0.g) obj3).d();
            case 7:
                String clientId = (String) obj2;
                Intrinsics.checkNotNullParameter(clientId, "clientId");
                return (PcwApplicationStatus) v7.r("PCW_STATUS_CACHE_", clientId, ((dak.f) obj3).f112549b);
            case 8:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                qad.a provider = (qad.a) obj2;
                Intrinsics.checkNotNullParameter(provider, "provider");
                Iterator it12 = provider.a().iterator();
                while (it12.hasNext()) {
                    ((OkHttpClient.a) ref$ObjectRef.f186409a).a((Interceptor) it12.next());
                }
                return Unit.f186387a;
            case 9:
                a0.d.B(obj2);
                Intrinsics.checkNotNullParameter(null, "interceptor");
                rj0.a aVar2 = ((dk0.c) obj3).f115425n;
                return Unit.f186387a;
            case 10:
                e0f.z zVar = (e0f.z) obj3;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                CardDetails cardDetails = (CardDetails) pair.f186385a;
                Data data = (Data) pair.f186386b;
                cue.d dVar2 = (cue.d) data.getContent();
                return dVar2 == null ? efm.d0.m(data) : (!dVar2.d() || dVar2.b()) ? efm.d0.m(data) : new pfm.z(new ufm.i(((exh.b) zVar.d).b(dVar2, cardDetails), new a31.o(12, e0f.o.f121654a), 1), i5, new tc7.m0(15), strN);
            case 11:
                Unit it13 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                ((e0m.b) obj3).f121743a.invoke();
                return Unit.f186387a;
            case 12:
                dkg.a it14 = (dkg.a) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return pd.b.u(it14, ((ekg.g) obj3).f127163g);
            case 13:
                eli.p pVar = (eli.p) obj3;
                String message = (String) obj2;
                Intrinsics.checkNotNullParameter(message, "message");
                Regex regex = pVar.e;
                Regex.Companion companion = Regex.INSTANCE;
                kotlin.text.o oVarB = regex.b(message);
                if (oVarB != null && (str = (String) zhm.d0.e0(1, oVarB.c())) != null) {
                    strN = jli.g.f(str);
                }
                if (strN != null) {
                    ((eli.l) pVar.f127491b).a(new zm0.d(strN, zm0.e.EXTERNAL, 12));
                }
                return Unit.f186387a;
            case 14:
                mm.a action = (mm.a) obj2;
                Intrinsics.checkNotNullParameter(action, "action");
                Map map = (Map) ((en.c) obj3).f127702j;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (((Class) entry.getKey()).isInstance(action)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                Iterator it15 = linkedHashMap.entrySet().iterator();
                while (it15.hasNext()) {
                    arrayList.add((mm.b) ((Map.Entry) it15.next()).getValue());
                }
                if (arrayList.isEmpty()) {
                    return new pfm.h(new a08.d(action, 13), i3);
                }
                if (arrayList.size() != 1) {
                    return new pfm.h(new a08.l(action, arrayList, 27), i3);
                }
                Object obj4 = arrayList.get(0);
                Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.action_framework_core.actions.ActionHandler<com.revolut.action_framework_core.actions.Action>");
                return ((mm.b) obj4).a3(action);
            case 15:
                fo.i it16 = (fo.i) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(Intrinsics.f(it16.a(), (String) obj3));
            case 16:
                gn.c cVar2 = (gn.c) obj3;
                sm.a action2 = (sm.a) obj2;
                Intrinsics.checkNotNullParameter(action2, "action");
                if (!Intrinsics.f(action2, a.C1475a.f264297a)) {
                    throw new NoWhenBranchMatchedException();
                }
                yyl.c cVar3 = ((lpi.b) cVar2.f144891j).f199139j;
                if (cVar3 != null) {
                    cVar3.b();
                }
                return Unit.f186387a;
            case 17:
                return StoriesPagerView.h((StoriesPagerView) obj3, (ru0.e) obj2);
            case 18:
                fk3.b bVar2 = ((ik3.c) obj3).f161878a;
                mm0.o session = (mm0.o) obj2;
                Intrinsics.checkNotNullParameter(session, "session");
                if (!(session instanceof mm0.m) || jli.b.d() - ((ik3.g) bVar2).f161888g.a() <= TimeUnit.MINUTES.toMillis(5L)) {
                    return pfm.m.f235744a;
                }
                efm.b bVarFlatMapCompletable = mo3.a.n(((ik3.g) bVar2).a(g.a.f123406a, true)).flatMapCompletable(new ihd.c(i2, new ijj.p(10)));
                ihd.c cVar4 = new ihd.c(9, new ijj.p(11));
                dfm.c cVar5 = mfm.f.d;
                en.a aVar3 = mfm.f.f205043c;
                bVarFlatMapCompletable.getClass();
                return new pfm.t(bVarFlatMapCompletable, cVar4, cVar5, aVar3, aVar3, aVar3, aVar3).l(new bji.a(i3));
            case 19:
                iri.l lVar = (iri.l) obj3;
                Throwable throwable2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable2, "throwable");
                BaseDelegatesActivity baseDelegatesActivity = lVar.i;
                iri.d dVar3 = lVar.f168062j;
                String f96958s0 = baseDelegatesActivity.getF81955s0();
                if (f96958s0 == null) {
                    f96958s0 = kotlin.jvm.internal.o0.f186429a.b(baseDelegatesActivity.getClass()).m();
                    if (f96958s0 == null) {
                        f96958s0 = "UNKNOWN";
                    }
                }
                zhm.h0 h0Var3 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, p.a.p("Source = ", f96958s0, ": all the states provided into fields: Sequence<BundleStateField<*>> = sequenceOf(...) must be supported by Bundle, otherwise they will not be store/restored"), throwable2, h0Var3);
                if (DateTime.parse("2023-05-30").isBeforeNow()) {
                    dVar3.getClass();
                    Intrinsics.checkNotNullParameter(throwable2, "throwable");
                    new Handler(Looper.getMainLooper()).post(new iri.c(throwable2, 0));
                } else {
                    String message2 = f96958s0 + ": " + throwable2.getMessage();
                    dVar3.getClass();
                    Intrinsics.checkNotNullParameter(message2, "message");
                    Toast.makeText(dVar3.f168052a, message2, 1).show();
                }
                return Unit.f186387a;
            case 20:
                jv0.g gVar = (jv0.g) obj3;
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                int iIntValue = ((Number) pair2.f186385a).intValue();
                Object obj5 = pair2.f186386b;
                Intrinsics.checkNotNullExpressionValue(obj5, "component2(...)");
                Format format = (Format) obj5;
                if (format.f7444id != null && format.label != null && format.language != null && (currentMappedTrackInfo = gVar.f178740a.getCurrentMappedTrackInfo()) != null && (numC = jv0.g.c(currentMappedTrackInfo)) != null && currentMappedTrackInfo.getTrackSupport(numC.intValue(), iIntValue, 0) == 4) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 21:
                Integer num = (Integer) obj3;
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                int iIntValue2 = ((Number) pair3.f186385a).intValue();
                Object obj6 = pair3.f186386b;
                Intrinsics.checkNotNullExpressionValue(obj6, "component2(...)");
                Format format2 = (Format) obj6;
                boolean z4 = (format2.selectionFlags & 1) == 1;
                String str3 = format2.f7444id;
                if (str3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String str4 = format2.label;
                if (str4 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String str5 = format2.language;
                if (str5 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                return new pz0.a(iIntValue2, str3, str4, str5, z4, num != null ? num.intValue() == iIntValue2 : z4);
            case 22:
                k3l.d dVar4 = (k3l.d) obj3;
                nii.n1 result2 = (nii.n1) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                Parcelable parcelableA = result2.a().a();
                Intrinsics.i(parcelableA, "null cannot be cast to non-null type com.revolut.retail.operation_status.modal_status.StatusViewConfiguration");
                StatusViewConfiguration statusViewConfiguration = (StatusViewConfiguration) parcelableA;
                if (result2 instanceof nii.j1) {
                    iVar = new k3l.f(statusViewConfiguration, ((nii.j1) result2).b());
                } else if (result2 instanceof nii.k1) {
                    iVar = new k3l.g(statusViewConfiguration);
                } else if (result2 instanceof nii.l1) {
                    iVar = new k3l.h(statusViewConfiguration);
                } else {
                    if (!(result2 instanceof nii.m1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iVar = new k3l.i(statusViewConfiguration);
                }
                dVar4.f180813j.onNext(iVar);
                return Unit.f186387a;
            case 23:
                kii.d dVar5 = (kii.d) obj2;
                Intrinsics.h(dVar5);
                ((kii.b) obj3).g(dVar5);
                return Unit.f186387a;
            case 24:
                IntRange it17 = (IntRange) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return kotlin.text.d0.s0((CharSequence) obj3, it17);
            case 25:
                NaviCommand naviCommand = (NaviCommand) obj2;
                sri.m mVar = (sri.m) ((en.c) obj3).f127702j;
                Intrinsics.h(naviCommand);
                mVar.c(naviCommand);
                return Unit.f186387a;
            case 26:
                mpi.d dVar6 = (mpi.d) obj3;
                al0.a aVar4 = (al0.a) obj2;
                int i6 = aVar4 == null ? -1 : mpi.c.f207817a[aVar4.ordinal()];
                if (i6 == 1) {
                    dVar6.Q(mpi.b.STATUS_VIEW);
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (dVar6.f207822j.compareAndSet(false, true)) {
                        dVar6.N().c(mpi.d.o);
                    }
                }
                return Unit.f186387a;
            case 27:
                mv9.k kVar = (mv9.k) obj3;
                dv9.m conversation = (dv9.m) obj2;
                Intrinsics.checkNotNullParameter(conversation, "conversation");
                Intrinsics.checkNotNullParameter(conversation, "conversation");
                efm.d0 d0VarFirstOrError = ((gv9.j) kVar.f209188b).b(conversation.f118076a, conversation instanceof dv9.k, zhm.u.c(dv9.f.ACTIVE.getId()), zhm.u.c(dv9.d.SENDING.getId())).firstOrError();
                mv9.h hVar = new mv9.h(3, new mv9.e(kVar, conversation, 5));
                d0VarFirstOrError.getClass();
                sfm.b bVar3 = new sfm.b(d0VarFirstOrError, hVar, i3);
                Intrinsics.checkNotNullExpressionValue(bVar3, "flatMapObservable(...)");
                qfm.r0 r0VarG = te0.w.w0(bVar3).toFlowable(efm.a.BUFFER).g(new mv9.h(i2, new mv9.e(kVar, conversation, 7)), 1);
                Intrinsics.checkNotNullExpressionValue(r0VarG, "flatMapCompletable(...)");
                return r0VarG;
            case 28:
                efm.r rVarX = ((efm.d0) ((Function1) ((ao.h) obj3).f7847b).invoke(obj2)).x();
                Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                return rVarX;
            default:
                return new pfm.h(new ne0.o((nm.a) obj3, obj2, i3), i3);
        }
    }

    public /* synthetic */ s(Object obj2, int i) {
        this.f6084a = i;
        this.f6085b = obj2;
    }

    public /* synthetic */ s(jv0.g gVar, Integer num) {
        this.f6084a = 21;
        this.f6085b = num;
    }
}
