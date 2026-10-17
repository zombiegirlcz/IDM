package a1a;

import a41.l1;
import a80.h;
import ael.y;
import ahe.w0;
import akl.n0;
import as1.a0;
import b4g.q;
import b4g.u;
import b4g.v;
import b6i.j;
import btb.k;
import btb.l;
import buf.a1;
import c34.e;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.in_app_calls.wrapper.VoiceCallRegistrationException;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData;
import com.revolut.feature.travel.flights.impl.data.network.TravelFlightsApi;
import com.revolut.feature.travel.flights.models.domain.booking.BookingConfirmParams;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep;
import com.revolut.sso.impl.domain.models.AuthAction;
import efl.g;
import ft3.h1;
import gim.i;
import h93.f0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import nr6.l0;
import o23.x;
import okhttp3.ResponseBody;
import pe7.f;
import retrofit2.HttpException;
import retrofit2.Response;
import v7g.r;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f573w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f574x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f575y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f573w = obj2;
        this.f574x = obj3;
        this.f575y = obj4;
        this.z = obj5;
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [gim.i, kotlin.jvm.functions.Function1] */
    private final Object b(Object obj2) {
        Object objA;
        String str = (String) this.f575y;
        zk0.b bVar = ((u) this.z).f12364b;
        CoroutineScope coroutineScope = (CoroutineScope) this.f573w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        try {
            if (i == 0) {
                o.b(obj2);
                ?? r72 = (i) this.f574x;
                this.f573w = coroutineScope;
                this.v = 1;
                obj2 = r72.invoke(this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            Response response = (Response) obj2;
            if (!response.isSuccessful()) {
                throw new HttpException(response);
            }
            ResponseBody responseBody = (ResponseBody) response.body();
            if (responseBody == null) {
                throw new IllegalStateException("Download response body is missing");
            }
            try {
                File fileQ = ((h) bVar).q(responseBody.byteStream(), str);
                if (fileQ == null) {
                    throw new IllegalStateException("Could not create file");
                }
                responseBody.close();
                return fileQ;
            } catch (Throwable th10) {
                try {
                    throw th10;
                } catch (Throwable th11) {
                    com.bumptech.glide.d.e(responseBody, th10);
                    throw th11;
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th12) {
            try {
                m.Companion companion = m.INSTANCE;
                objA = ((h) bVar).m(zk0.a.INTERNAL_CACHE, str);
            } catch (Throwable th13) {
                m.Companion companion2 = m.INSTANCE;
                objA = o.a(th13);
            }
            if (objA instanceof n) {
                objA = null;
            }
            File file = (File) objA;
            if (file == null || !file.exists()) {
                throw th12;
            }
            return file;
        }
    }

    private final Object c(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            List list = (List) this.f573w;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(new v7g.n((String) it8.next()));
            }
            v7g.o oVar = new v7g.o(arrayList);
            TravelFlightsApi travelFlightsApi = ((v) this.f574x).f12366a;
            String str = (String) this.f575y;
            String str2 = (String) this.z;
            this.v = 1;
            obj2 = travelFlightsApi.quoteExtraProducts(str, oVar, str2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return c8g.b.b(((r) obj2).f286651a);
    }

    private final Object n(Object obj2) {
        com.revolut.feature.joint.impl.ui.invite_flow.d dVar;
        yki.b bVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.joint.impl.ui.invite_flow.d dVar2 = (com.revolut.feature.joint.impl.ui.invite_flow.d) this.f575y;
            yki.b bVar2 = (yki.b) this.z;
            this.f573w = dVar2;
            this.f574x = bVar2;
            this.v = 1;
            Object objI2 = com.revolut.feature.joint.impl.ui.invite_flow.d.I2(dVar2, this);
            if (objI2 == aVar) {
                return aVar;
            }
            dVar = dVar2;
            bVar = bVar2;
            obj2 = objI2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yki.b bVar3 = (yki.b) this.f574x;
            com.revolut.feature.joint.impl.ui.invite_flow.d dVar3 = (com.revolut.feature.joint.impl.ui.invite_flow.d) this.f573w;
            o.b(obj2);
            bVar = bVar3;
            dVar = dVar3;
        }
        oki.h.t2(dVar, bVar, (FlowStep) obj2, false, null, false, 12);
        return Unit.f186387a;
    }

    private final Object o(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature_move_money.impl.amount.c cVar = (com.revolut.feature_move_money.impl.amount.c) this.f573w;
            a5k.n nVar = new a5k.n(3, cVar, (String) this.f575y, (k1j.a) this.f574x, (j) this.z, (Continuation) null);
            this.v = 1;
            if (cVar.p2(this, nVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1a.c.p(java.lang.Object):java.lang.Object");
    }

    private final Object s(Object obj2) throws Throwable {
        Object objA;
        com.revolut.feature.in_app_calls.a aVar = (com.revolut.feature.in_app_calls.a) this.f574x;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        try {
            if (i == 0) {
                o.b(obj2);
                String str = (String) this.f575y;
                String str2 = (String) this.z;
                m.Companion companion = m.INSTANCE;
                f fVar = aVar.f74791b;
                this.f573w = null;
                this.v = 1;
                if (fVar.register(str, str2, this) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            objA = Unit.f186387a;
            m.Companion companion2 = m.INSTANCE;
        } catch (Throwable th10) {
            m.Companion companion3 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (!(objA instanceof n)) {
            return Boolean.TRUE;
        }
        Throwable cause = m.a(objA);
        if (cause == null) {
            return Boolean.FALSE;
        }
        if (cause instanceof CancellationException) {
            throw cause;
        }
        VoiceCallRegistrationException voiceCallRegistrationException = cause instanceof VoiceCallRegistrationException ? (VoiceCallRegistrationException) cause : null;
        Integer num = voiceCallRegistrationException != null ? voiceCallRegistrationException.f74842a : null;
        be7.j jVar = (be7.j) aVar.f74792c.get();
        jVar.getClass();
        Intrinsics.checkNotNullParameter(cause, "cause");
        aim.o oVar = new aim.o();
        if (num != null) {
            oVar.add(new Pair("InAppCalls.RegistrationErrorCode", String.valueOf(num.intValue())));
        }
        oVar.addAll(jVar.a());
        aim.o oVarA = y0.a(oVar);
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "InAppCalls", null, cause, oVarA);
        return Boolean.FALSE;
    }

    private final Object t(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            l lVar = (l) this.f573w;
            k kVar = new k((v0d.b) this.f574x, lVar, (SharedStep) this.f575y, (plc.i) this.z, null);
            this.v = 1;
            if (lVar.Y2(this, kVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object u(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f574x
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r6.v
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L25
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L15
            yhm.o.b(r7)
            goto L4e
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            java.lang.Object r0 = r6.f573w
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            yhm.o.b(r7)
            goto L41
        L25:
            yhm.o.b(r7)
            java.lang.Object r7 = r6.f575y
            com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.a r7 = (com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.a) r7
            guf.b r7 = r7.f92471b
            java.lang.Object r2 = r6.z
            com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData r2 = (com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData) r2
            r6.f574x = r5
            r6.f573w = r0
            r6.v = r4
            guf.m r7 = (guf.m) r7
            java.lang.Object r7 = r7.e(r2, r6)
            if (r7 != r1) goto L41
            goto L4d
        L41:
            r6.f574x = r5
            r6.f573w = r5
            r6.v = r3
            java.lang.Object r7 = r0.emit(r7, r6)
            if (r7 != r1) goto L4e
        L4d:
            return r1
        L4e:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a1a.c.u(java.lang.Object):java.lang.Object");
    }

    private final Object v(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            a1 a1Var = (a1) this.f573w;
            afa.u uVar = new afa.u(2, a1Var, (AccountId) this.f574x, (String) this.f575y, (k1j.a) this.z, (Continuation) null);
            this.v = 1;
            if (a1Var.p2(this, uVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (r11 == r3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        if (r11 == r3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
    
        if (r11 == r3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ba, code lost:
    
        if (r11 == r3) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object w(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.z
            rub.j r0 = (rub.j) r0
            java.lang.Object r1 = r10.f574x
            bvb.r r1 = (bvb.r) r1
            java.lang.Object r2 = r10.f573w
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r10.v
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L38
            if (r4 == r8) goto L34
            if (r4 == r7) goto L30
            if (r4 == r6) goto L2b
            if (r4 != r5) goto L23
            yhm.o.b(r11)
            goto Lbd
        L23:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L2b:
            yhm.o.b(r11)
            goto La5
        L30:
            yhm.o.b(r11)
            goto L7e
        L34:
            yhm.o.b(r11)
            goto L67
        L38:
            yhm.o.b(r11)
            com.revolut.feature.rev_points.buying.impl.ui.screen.main.RevPointsBuyingControllerScreenContract$InputData r11 = r1.f19002p
            boolean r11 = r11.f83566a
            java.lang.String r4 = "PAYMENT_BUTTON_LOADING_ID"
            r9 = 0
            if (r11 == 0) goto L81
            java.lang.Object r11 = r10.f575y
            rub.i r11 = (rub.i) r11
            if (r11 == 0) goto L6a
            r10.f573w = r2
            r10.v = r8
            b94.s r0 = new b94.s
            r2 = 24
            r0.<init>(r1, r11, r9, r2)
            tji.f r11 = r1.X()
            java.lang.String r1 = "DEACTIVATE_BUTTON_LOADING_ID"
            java.lang.Object r11 = zh9.u0.b0(r11, r1, r0, r10)
            if (r11 != r3) goto L62
            goto L64
        L62:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        L64:
            if (r11 != r3) goto L67
            goto Lbc
        L67:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L6a:
            r10.f573w = r9
            r10.v = r7
            bvb.n r11 = new bvb.n
            r11.<init>(r0, r1, r9)
            tji.f r0 = r1.X()
            java.lang.Object r11 = zh9.u0.b0(r0, r4, r11, r10)
            if (r11 != r3) goto L7e
            goto Lbc
        L7e:
            kotlin.Unit r11 = (kotlin.Unit) r11
            return r11
        L81:
            cli.y r11 = r1.f19008x
            java.lang.Object r11 = r11.f22677a
            vkm.j2 r11 = (vkm.j2) r11
            java.lang.Object r11 = r11.getValue()
            bvb.e r11 = (bvb.e) r11
            boolean r11 = r11.d
            if (r11 == 0) goto La8
            r10.f573w = r9
            r10.v = r6
            bvb.n r11 = new bvb.n
            r11.<init>(r0, r1, r9)
            tji.f r0 = r1.X()
            java.lang.Object r11 = zh9.u0.b0(r0, r4, r11, r10)
            if (r11 != r3) goto La5
            goto Lbc
        La5:
            kotlin.Unit r11 = (kotlin.Unit) r11
            return r11
        La8:
            r10.f573w = r9
            r10.v = r5
            afa.u r11 = new afa.u
            r2 = 3
            r11.<init>(r0, r1, r9, r2)
            tji.f r0 = r1.X()
            java.lang.Object r11 = zh9.u0.b0(r0, r4, r11, r10)
            if (r11 != r3) goto Lbd
        Lbc:
            return r3
        Lbd:
            kotlin.Unit r11 = (kotlin.Unit) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a1a.c.w(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object x(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f573w
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r8.v
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L21
            if (r2 == r5) goto L1d
            if (r2 != r4) goto L15
            yhm.o.b(r9)
            goto L6b
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            yhm.o.b(r9)
            goto L5e
        L21:
            yhm.o.b(r9)
            java.lang.Object r9 = r8.f574x
            c0f.d r9 = (c0f.d) r9
            y51.a r9 = r9.f20253a
            java.lang.Object r2 = r8.f575y
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r6 = r8.z
            java.lang.String r6 = (java.lang.String) r6
            e0f.z r9 = (e0f.z) r9
            r9.getClass()
            java.lang.String r7 = "paymentId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r7)
            p71.a r9 = r9.f121703a
            u21.k r9 = (u21.k) r9
            r9.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r7)
            com.revolut.data.network.services.ExternalCardsService r9 = r9.f276535a
            if (r6 != 0) goto L4b
            r6 = r3
        L4b:
            efm.b r9 = r9.checkPaymentStatus(r2, r6)
            pfm.r r9 = te0.w.g0(r9)
            r8.f573w = r0
            r8.v = r5
            java.lang.Object r9 = nim.a.a(r9, r8)
            if (r9 != r1) goto L5e
            goto L6a
        L5e:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            r8.f573w = r3
            r8.v = r4
            java.lang.Object r9 = r0.emit(r9, r8)
            if (r9 != r1) goto L6b
        L6a:
            return r1
        L6b:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a1a.c.x(java.lang.Object):java.lang.Object");
    }

    private final Object y(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.card_order_new.impl.kompot.c cVar = (com.revolut.feature.card_order_new.impl.kompot.c) this.f573w;
            c23.i iVar = new c23.i((f0) this.f574x, cVar, (x) this.f575y, (Boolean) this.z, null);
            this.v = 1;
            if (cVar.p2(this, iVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c((d) this.f574x, (String) this.f575y, (com.revolut.feature.payments.splitbill.models.recurringsplit.c) this.z, continuation, 0);
            case 1:
                c cVar = new c((Set) this.f575y, (a35.m) this.z, continuation, 1);
                cVar.f574x = obj2;
                return cVar;
            case 2:
                c cVar2 = new c((l1) this.z, continuation, 2);
                cVar2.f575y = obj2;
                return cVar2;
            case 3:
                return new c(3, (a5k.f0) this.f573w, (Function1) this.f574x, (n1) this.f575y, (Function0) this.z, continuation);
            case 4:
                return new c((h) this.f574x, (zk0.c) this.z, (String) this.f575y, continuation);
            case 5:
                c cVar3 = new c((y) this.f574x, (efl.f) this.f575y, (g) this.z, continuation, 5);
                cVar3.f573w = obj2;
                return cVar3;
            case 6:
                c cVar4 = new c((w0) this.f575y, (sfe.a) this.z, continuation, 6);
                cVar4.f574x = obj2;
                return cVar4;
            case 7:
                c cVar5 = new c((w0) this.f574x, (List) this.f575y, (xi0.b) this.z, continuation, 7);
                cVar5.f573w = obj2;
                return cVar5;
            case 8:
                c cVar6 = new c((aj6.x) this.z, continuation, 8);
                cVar6.f575y = obj2;
                return cVar6;
            case 9:
                return new c(9, (akl.h) this.f573w, (AuthAction) this.f574x, (Set) this.f575y, (Set) this.z, continuation);
            case 10:
                return new c(10, (n0) this.f573w, (cjl.n) this.f574x, (String) this.f575y, (LocationDomain) this.z, continuation);
            case 11:
                return new c((h1j.d) this.f575y, (a0) this.z, continuation, 11);
            case 12:
                return new c((au6.v) this.f575y, (l0) this.z, continuation, 12);
            case 13:
                return new c((au6.v) this.f573w, (String) this.f574x, (nr6.a0) this.z, (String) this.f575y, continuation, 13);
            case 14:
                return new c((FavouritesAssetTypeKey) this.f573w, (mgd.f) this.f574x, (b4d.i) this.z, (String) this.f575y, continuation);
            case 15:
                c cVar7 = new c((b4g.f) this.z, (String) this.f575y, continuation);
                cVar7.f574x = obj2;
                return cVar7;
            case 16:
                return new c((BookingConfirmParams) this.f574x, (String) this.f575y, (q) this.z, continuation, 16);
            case 17:
                c cVar8 = new c((Function1) this.f574x, (u) this.z, (String) this.f575y, continuation);
                cVar8.f573w = obj2;
                return cVar8;
            case 18:
                return new c(18, (List) this.f573w, (v) this.f574x, (String) this.f575y, (String) this.z, continuation);
            case 19:
                return new c((com.revolut.feature.joint.impl.ui.invite_flow.d) this.f575y, (yki.b) this.z, continuation, 19);
            case 20:
                return new c((com.revolut.feature_move_money.impl.amount.c) this.f573w, (k1j.a) this.f574x, (j) this.z, (String) this.f575y, continuation, 20);
            case 21:
                return new c((List) this.f574x, (bci.b) this.f575y, (List) this.z, continuation, 21);
            case 22:
                c cVar9 = new c((com.revolut.feature.in_app_calls.a) this.f574x, (String) this.f575y, (String) this.z, continuation, 22);
                cVar9.f573w = obj2;
                return cVar9;
            case 23:
                return new c(23, (l) this.f573w, (v0d.b) this.f574x, (SharedStep) this.f575y, (plc.i) this.z, continuation);
            case 24:
                c cVar10 = new c((com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.a) this.f575y, (ManualTransferData) this.z, continuation, 24);
                cVar10.f574x = obj2;
                return cVar10;
            case 25:
                return new c(25, (a1) this.f573w, (AccountId) this.f574x, (String) this.f575y, (k1j.a) this.z, continuation);
            case 26:
                c cVar11 = new c((bvb.r) this.f574x, (rub.i) this.f575y, (rub.j) this.z, continuation, 26);
                cVar11.f573w = obj2;
                return cVar11;
            case 27:
                c cVar12 = new c((c0f.d) this.f574x, (String) this.f575y, (String) this.z, continuation, 27);
                cVar12.f573w = obj2;
                return cVar12;
            case 28:
                return new c(28, (com.revolut.feature.card_order_new.impl.kompot.c) this.f573w, (f0) this.f574x, (x) this.f575y, (Boolean) this.z, continuation);
            default:
                return new c((e) this.f574x, (h1) this.f575y, (pu3.a) this.z, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0378 A[LOOP:0: B:174:0x0372->B:176:0x0378, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0621 A[LOOP:2: B:282:0x061b->B:284:0x0621, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:486:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:504:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ad  */
    /* JADX WARN: Type inference failed for: r4v63, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v57, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v41, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x01aa -> B:78:0x015f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x01ba -> B:78:0x015f). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1a.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, zk0.c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 4;
        this.f574x = hVar;
        this.z = cVar;
        this.f575y = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b4g.f fVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 15;
        this.z = fVar;
        this.f575y = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FavouritesAssetTypeKey favouritesAssetTypeKey, mgd.f fVar, b4d.i iVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 14;
        this.f573w = favouritesAssetTypeKey;
        this.f574x = fVar;
        this.z = iVar;
        this.f575y = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Object obj3, Object obj4, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f573w = obj2;
        this.f575y = str;
        this.f574x = obj3;
        this.z = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f574x = obj2;
        this.f575y = obj3;
        this.z = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f575y = obj2;
        this.z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.z = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Function1 function1, u uVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 17;
        this.f574x = (i) function1;
        this.z = uVar;
        this.f575y = str;
    }
}
