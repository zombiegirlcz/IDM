package h30;

import android.content.Context;
import com.revolut.chat.data.network.AuthenticationApi;
import com.revolut.chat.data.network.InAppCallSupportApi;
import com.revolut.chat.data.network.MessagesApi;
import com.revolut.chat.data.network.SuggestionsApi;
import com.revolut.chat.data.network.TicketsInfoApi;
import com.revolut.chat.data.network.TranscriptApi;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import n30.p0;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import v20.v0;

/* JADX INFO: loaded from: classes.dex */
public final class m implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f148902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f148903b;

    public m(n nVar, int i) {
        this.f148902a = nVar;
        this.f148903b = i;
    }

    @Override // phm.a
    public final Object get() {
        n nVar = this.f148902a;
        int i = this.f148903b;
        switch (i) {
            case 0:
                e4m.e eVar = nVar.N;
                of3.f fVar = nVar.f148906b;
                s20.d dVar = (s20.d) eVar.get();
                TicketsInfoApi ticketsInfoApi = (TicketsInfoApi) nVar.K.get();
                d4m.a aVarA = e4m.b.a(nVar.L);
                tf3.b bVarD = fVar.d();
                vc.s.j(bVarD);
                e30.b bVarO = nVar.o();
                y10.h hVarR = nVar.r();
                ne0.j jVar = (ne0.j) nVar.M.get();
                ue0.c cVar = (ue0.c) nVar.S.get();
                d30.c cVar2 = (d30.c) nVar.T.get();
                j30.c cVarF = fVar.f();
                vc.s.j(cVarF);
                CoroutineScope coroutineScopeA = nVar.f148914j.a();
                vc.s.j(coroutineScopeA);
                a40.b bVarA = nVar.f148917m.a();
                vc.s.j(bVarA);
                return new v20.f0(dVar, ticketsInfoApi, aVarA, bVarD, bVarO, hVarR, jVar, cVar, cVar2, cVarF, coroutineScopeA, bVarA);
            case 1:
                return new s20.d(new y10.b(), (TicketsInfoApi) nVar.K.get(), e4m.b.a(nVar.L), (ne0.j) nVar.M.get());
            case 2:
                b bVar = nVar.f148904a;
                TicketsInfoApi ticketsInfoApi2 = (TicketsInfoApi) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) nVar.J.get(), "retrofit", TicketsInfoApi.class, "create(...)");
                vc.s.k(ticketsInfoApi2);
                return ticketsInfoApi2;
            case 3:
                b bVar2 = nVar.f148904a;
                Retrofit.Builder builder = (Retrofit.Builder) nVar.f148934y.get();
                OkHttpClient okHttpClient = (OkHttpClient) nVar.I.get();
                Intrinsics.checkNotNullParameter(builder, "builder");
                Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
                Retrofit retrofitBuild = builder.client(okHttpClient).build();
                Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                vc.s.k(retrofitBuild);
                return retrofitBuild;
            case 4:
                b bVar3 = nVar.f148904a;
                p10.b chatConfig = nVar.f148906b.e();
                vc.s.j(chatConfig);
                kg.o gson = (kg.o) nVar.f148932x.get();
                Intrinsics.checkNotNullParameter(chatConfig, "chatConfig");
                Intrinsics.checkNotNullParameter(gson, "gson");
                Retrofit.Builder builderAddConverterFactory = new Retrofit.Builder().baseUrl("https://chat.revolut.com").addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(hhm.f.f152431c)).addConverterFactory(ScalarsConverterFactory.create()).addConverterFactory(GsonConverterFactory.create(gson));
                Intrinsics.checkNotNullExpressionValue(builderAddConverterFactory, "addConverterFactory(...)");
                vc.s.k(builderAddConverterFactory);
                return builderAddConverterFactory;
            case 5:
                b bVar4 = nVar.f148904a;
                kg.o oVarA = w10.j.a();
                vc.s.k(oVarA);
                return oVarA;
            case 6:
                b bVar5 = nVar.f148904a;
                xj0.i factory = ((nj0.d) nVar.f148908c).l();
                vc.s.j(factory);
                p10.b chatConfig2 = nVar.f148906b.e();
                vc.s.j(chatConfig2);
                Interceptor commonHeadersInterceptor = (Interceptor) nVar.B.get();
                Interceptor authHeadersInterceptor = (Interceptor) nVar.H.get();
                b20.e customTimeoutInterceptor = new b20.e();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(chatConfig2, "chatConfig");
                Intrinsics.checkNotNullParameter(commonHeadersInterceptor, "commonHeadersInterceptor");
                Intrinsics.checkNotNullParameter(authHeadersInterceptor, "authHeadersInterceptor");
                Intrinsics.checkNotNullParameter(customTimeoutInterceptor, "customTimeoutInterceptor");
                return xj0.i.a(factory, null, false, !chatConfig2.f231592b, zhm.v.k(commonHeadersInterceptor, authHeadersInterceptor, customTimeoutInterceptor), null, zhm.u.c(new fk0.b(chatConfig2.f231593c, chatConfig2.d)), Constants.TAG_FIRMWARE_VERSION);
            case 7:
                b bVar6 = nVar.f148904a;
                b1j.a aVar = (b1j.a) nVar.z.get();
                p10.b bVarE = nVar.f148906b.e();
                vc.s.j(bVarE);
                l80.e eVarH = nVar.d.h();
                vc.s.j(eVarH);
                qd0.b bVar7 = (qd0.b) nVar.A.get();
                dm0.d dVarD = nVar.e.d();
                vc.s.j(dVarD);
                b20.c interceptor = new b20.c(aVar, bVarE, eVarH, bVar7, dVarD, nVar.f.a());
                Intrinsics.checkNotNullParameter(interceptor, "interceptor");
                return interceptor;
            case 8:
                rj0.b provider = ((nj0.d) nVar.f148908c).f;
                c.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                b1j.a aVarA2 = ((cpi.i) provider).a();
                vc.s.k(aVarA2);
                return aVarA2;
            case 9:
                qd0.b bVarN = nVar.d.n();
                vc.s.j(bVarN);
                return bVarN;
            case 10:
                b bVar8 = nVar.f148904a;
                t20.d authentication = (t20.d) nVar.G.get();
                tf3.b authorizationStatus = nVar.f148906b.d();
                vc.s.j(authorizationStatus);
                Intrinsics.checkNotNullParameter(authentication, "authentication");
                Intrinsics.checkNotNullParameter(authorizationStatus, "authorizationStatus");
                return new b20.b(authentication, authorizationStatus);
            case 11:
                tf3.b bVarD2 = nVar.f148906b.d();
                vc.s.j(bVarD2);
                rf3.l lVar = (rf3.l) nVar.f148906b.f224702x.get();
                vc.s.j(lVar);
                AuthenticationApi authenticationApi = (AuthenticationApi) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) nVar.D.get(), "retrofit", AuthenticationApi.class, "create(...)");
                vc.s.k(authenticationApi);
                return new t20.n(bVarD2, lVar, authenticationApi, (ue0.c) nVar.F.get(), new bm0.a());
            case 12:
                b bVar9 = nVar.f148904a;
                Retrofit.Builder builder2 = (Retrofit.Builder) nVar.f148934y.get();
                OkHttpClient okHttpClient2 = (OkHttpClient) nVar.C.get();
                Intrinsics.checkNotNullParameter(builder2, "builder");
                Intrinsics.checkNotNullParameter(okHttpClient2, "okHttpClient");
                Retrofit retrofitBuild2 = builder2.client(okHttpClient2).build();
                Intrinsics.checkNotNullExpressionValue(retrofitBuild2, "build(...)");
                vc.s.k(retrofitBuild2);
                return retrofitBuild2;
            case 13:
                b bVar10 = nVar.f148904a;
                xj0.i factory2 = ((nj0.d) nVar.f148908c).l();
                vc.s.j(factory2);
                p10.b chatConfig3 = nVar.f148906b.e();
                vc.s.j(chatConfig3);
                Interceptor interceptor2 = (Interceptor) nVar.B.get();
                b20.e customTimeoutInterceptor2 = new b20.e();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(chatConfig3, "chatConfig");
                Intrinsics.checkNotNullParameter(interceptor2, "interceptor");
                Intrinsics.checkNotNullParameter(customTimeoutInterceptor2, "customTimeoutInterceptor");
                return xj0.i.a(factory2, null, false, !chatConfig3.f231592b, zhm.v.k(interceptor2, customTimeoutInterceptor2), null, zhm.u.c(new fk0.b(chatConfig3.f231593c, chatConfig3.d)), Constants.TAG_FIRMWARE_VERSION);
            case 14:
                b bVar11 = nVar.f148904a;
                je0.d mapper = (je0.d) nVar.E.get();
                yk0.a databaseSessionProvider = nVar.f148912h.b();
                vc.s.j(databaseSessionProvider);
                xe0.f storageFactory = nVar.f148911g.f();
                vc.s.j(storageFactory);
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "chat.pref", mapper, 2, zhm.u.c(new exa.a(1, 2, 5)), 32);
            case 15:
                b bVar12 = nVar.f148904a;
                le0.b factory3 = nVar.f148911g.c();
                vc.s.j(factory3);
                kg.o gson2 = (kg.o) nVar.f148932x.get();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                Intrinsics.checkNotNullParameter(gson2, "gson");
                return factory3.a(gson2);
            case 16:
                b bVar13 = nVar.f148904a;
                Context context = nVar.i;
                yk0.a aVarB = nVar.f148912h.b();
                vc.s.j(aVarB);
                return gsi.d.j(bVar13, context, aVarB, ((c21.b) nVar.f148906b.f224690g).b());
            case 17:
                c.Companion.getClass();
                return new ne0.d(ne0.b.HASH);
            case 18:
                b bVar14 = nVar.f148904a;
                p10.b config = nVar.f148906b.e();
                vc.s.j(config);
                kg.o gson3 = (kg.o) nVar.f148932x.get();
                OkHttpClient okHttpClient3 = (OkHttpClient) nVar.I.get();
                CoroutineScope scope = nVar.f148914j.a();
                vc.s.j(scope);
                Intrinsics.checkNotNullParameter(config, "config");
                Intrinsics.checkNotNullParameter(gson3, "gson");
                Intrinsics.checkNotNullParameter(okHttpClient3, "okHttpClient");
                Intrinsics.checkNotNullParameter(scope, "scope");
                return new z10.e(config, okHttpClient3, gson3, scope);
            case 19:
                b bVar15 = nVar.f148904a;
                p10.b config2 = nVar.f148906b.e();
                vc.s.j(config2);
                Intrinsics.checkNotNullParameter(config2, "config");
                v0 repository = new v0();
                Intrinsics.checkNotNullParameter(repository, "repository");
                return repository;
            case 20:
                return new q50.n((ih0.b) nVar.Q.get());
            case 21:
                ih0.b bVarF = nVar.f148916l.f();
                vc.s.j(bVarF);
                return bVarF;
            case 22:
                je0.d dVarB = nVar.f148911g.b();
                vc.s.j(dVarB);
                yk0.a aVarB2 = nVar.f148912h.b();
                vc.s.j(aVarB2);
                xe0.f fVarF = nVar.f148911g.f();
                vc.s.j(fVarF);
                return d.a(dVarB, fVarF, aVarB2);
            case 23:
                return new d30.c((TicketsInfoApi) nVar.K.get(), (ne0.j) nVar.M.get());
            case 24:
                c.Companion.getClass();
                return new ifm.b();
            case 25:
                ksb.c cVar3 = (ksb.c) nVar.f148918n.i.get();
                vc.s.j(cVar3);
                return cVar3;
            case 26:
                b bVar16 = nVar.f148904a;
                InAppCallSupportApi inAppCallSupportApi = (InAppCallSupportApi) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) nVar.J.get(), "retrofit", InAppCallSupportApi.class, "create(...)");
                vc.s.k(inAppCallSupportApi);
                return inAppCallSupportApi;
            case 27:
                rg0.e eVar2 = nVar.f148914j;
                ee7.a aVar2 = nVar.o;
                l70.e eVar3 = nVar.d;
                CoroutineScope coroutineScopeA2 = eVar2.a();
                vc.s.j(coroutineScopeA2);
                s20.d dVar2 = (s20.d) nVar.N.get();
                z70.a aVarF = eVar3.f();
                vc.s.j(aVarF);
                InAppCallSupportApi inAppCallSupportApi2 = (InAppCallSupportApi) nVar.X.get();
                y10.c cVar4 = new y10.c(new y10.b());
                be7.h hVarB = aVar2.b();
                vc.s.j(hVarB);
                be7.k kVarC = aVar2.c();
                vc.s.j(kVarC);
                m mVar = nVar.Y;
                ue0.c cVar5 = (ue0.c) nVar.F.get();
                bm0.a aVar3 = new bm0.a();
                l80.e eVarH2 = eVar3.h();
                vc.s.j(eVarH2);
                hh0.e eVarA = th0.i.a();
                tf3.b bVarD3 = nVar.f148906b.d();
                vc.s.j(bVarD3);
                return new p0(coroutineScopeA2, dVar2, aVarF, inAppCallSupportApi2, cVar4, hVarB, kVarC, mVar, cVar5, aVar3, eVarH2, eVarA, bVarD3);
            case 28:
                be7.j jVarA = nVar.o.a();
                vc.s.j(jVarA);
                return jVarA;
            case 29:
                e30.b bVarO2 = nVar.o();
                n30.n nVarK = nVar.k();
                e30.e eVar4 = (e30.e) nVar.f148905a0.get();
                CoroutineScope coroutineScopeA3 = nVar.f148914j.a();
                vc.s.j(coroutineScopeA3);
                return new n30.b0(bVarO2, nVarK, eVar4, coroutineScopeA3);
            case 30:
                b bVar17 = nVar.f148904a;
                e30.e eVar5 = new e30.e((TicketsInfoApi) nVar.K.get(), nVar.r(), (ne0.j) nVar.M.get(), (ue0.c) nVar.F.get());
                gsi.d.o(bVar17, eVar5);
                return eVar5;
            case 31:
                j30.c cVarF2 = nVar.f148906b.f();
                vc.s.j(cVarF2);
                return new j30.f(cVarF2, (l30.b) nVar.p0.get());
            case 32:
                v20.o oVar = (v20.o) nVar.U.get();
                y20.g0 g0Var = (y20.g0) nVar.j0.get();
                j30.c cVarF3 = nVar.f148906b.f();
                vc.s.j(cVarF3);
                n30.v vVarM = nVar.m();
                q30.i iVar = (q30.i) nVar.m0.get();
                t30.f fVar2 = (t30.f) nVar.f148920o0.get();
                df0.b bVarA2 = nVar.f148921p.a();
                vc.s.j(bVarA2);
                CoroutineScope coroutineScopeA4 = nVar.f148914j.a();
                vc.s.j(coroutineScopeA4);
                return new l30.e(oVar, g0Var, cVarF3, vVarM, iVar, fVar2, bVarA2, coroutineScopeA4);
            case 33:
                e4m.e eVar6 = nVar.N;
                of3.f fVar3 = nVar.f148906b;
                s20.d dVar3 = (s20.d) eVar6.get();
                d4m.a aVarA3 = e4m.b.a(nVar.L);
                y20.f fVar4 = new y20.f(new tb4.t((MessagesApi) nVar.c0.get(), new v60.g((s20.d) nVar.N.get(), new y10.b(), e4m.b.a(nVar.L), (d30.c) nVar.T.get(), nVar.r())), e4m.b.a(nVar.L), nVar.y());
                d30.c cVar6 = (d30.c) nVar.T.get();
                kg.o oVar2 = (kg.o) nVar.f148932x.get();
                y10.h hVarR2 = nVar.r();
                ne0.j jVar2 = (ne0.j) nVar.M.get();
                f30.b bVar18 = new f30.b(e4m.b.a(nVar.L));
                r10.q qVarW = nVar.w();
                MessagesApi messagesApi = (MessagesApi) nVar.c0.get();
                uvl.c cVarY = nVar.y();
                v10.b bVar19 = new v10.b((ue0.c) nVar.F.get());
                z20.j jVar3 = (z20.j) nVar.f148909d0.get();
                CoroutineScope coroutineScopeA5 = nVar.f148914j.a();
                vc.s.j(coroutineScopeA5);
                z20.q qVar = (z20.q) nVar.i0.get();
                xe0.e eVarZ = nVar.z();
                v0 v0Var = (v0) nVar.P.get();
                a20.a aVarE = nVar.e();
                f01.a aVarG = fVar3.g();
                vc.s.j(aVarG);
                y10.l lVar2 = new y10.l(v0Var, aVarE, aVarG);
                TicketsInfoApi ticketsInfoApi3 = (TicketsInfoApi) nVar.K.get();
                i90.b bVar20 = new i90.b();
                e30.b bVarO3 = nVar.o();
                j30.c cVarF4 = fVar3.f();
                vc.s.j(cVarF4);
                return f.a(messagesApi, ticketsInfoApi3, cVar6, aVarA3, bVarO3, bVar18, bVar20, cVarF4, oVar2, coroutineScopeA5, jVar2, qVarW, dVar3, cVarY, bVar19, eVarZ, hVarR2, lVar2, fVar4, jVar3, qVar);
            case 34:
                b bVar21 = nVar.f148904a;
                MessagesApi messagesApi2 = (MessagesApi) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) nVar.J.get(), "retrofit", MessagesApi.class, "create(...)");
                vc.s.k(messagesApi2);
                return messagesApi2;
            case 35:
                return new z20.j(e4m.b.a(nVar.L), nVar.r(), nVar.y());
            case 36:
                j30.c cVarF5 = nVar.f148906b.f();
                vc.s.j(cVarF5);
                z20.h hVar = new z20.h();
                z20.t tVarB = nVar.B();
                MessagesApi messagesApi3 = (MessagesApi) nVar.c0.get();
                z20.u uVar = (z20.u) nVar.f148910e0.get();
                z20.g gVar = (z20.g) nVar.f0.get();
                z20.r rVar = (z20.r) nVar.g0.get();
                z20.j jVar4 = (z20.j) nVar.f148909d0.get();
                y10.h hVarR3 = nVar.r();
                m mVar2 = nVar.f148913h0;
                CoroutineScope coroutineScopeA6 = nVar.f148914j.a();
                vc.s.j(coroutineScopeA6);
                return new z20.q(cVarF5, hVar, tVarB, messagesApi3, uVar, gVar, rVar, jVar4, hVarR3, mVar2, coroutineScopeA6, new i90.b());
            case 37:
                return new z20.u();
            case 38:
                return new z20.g((MessagesApi) nVar.c0.get(), nVar.B(), (z20.u) nVar.f148910e0.get());
            case 39:
                return new z20.r((MessagesApi) nVar.c0.get(), nVar.B(), new z20.h(), nVar.r(), nVar.y(), new i90.b());
            case 40:
                return gsi.d.C(nVar.f148904a, nVar.i);
            case 41:
                rg0.e eVar7 = nVar.f148914j;
                of3.f fVar5 = nVar.f148906b;
                CoroutineScope coroutineScopeA7 = eVar7.a();
                vc.s.j(coroutineScopeA7);
                ryc.a aVarN = gsi.d.n(nVar.f148904a, e4m.b.a(nVar.u0), e4m.b.a(nVar.S));
                j30.c cVarF6 = fVar5.f();
                vc.s.j(cVarF6);
                nf3.a aVarC = fVar5.c();
                vc.s.j(aVarC);
                return new q30.h(coroutineScopeA7, aVarN, cVarF6, aVarC, nVar.Q, nVar.A, nVar.f148913h0, nVar.f148915k0, nVar.l0);
            case 42:
                b80.c cVarP = nVar.d.p();
                vc.s.j(cVarP);
                return cVarP;
            case 43:
                return gsi.d.B(nVar.f148904a, nVar.i);
            case 44:
                nVar.getClass();
                cf0.f fVar6 = nVar.f148921p;
                of3.f fVar7 = nVar.f148906b;
                SuggestionsApi suggestionsApiX = gsi.d.x(nVar.f148904a, (Retrofit) nVar.J.get());
                f01.a aVarG2 = fVar7.g();
                vc.s.j(aVarG2);
                mjj.a aVar4 = new mjj.a(aVarG2, 1);
                ue0.c cVar7 = (ue0.c) nVar.S.get();
                df0.b bVarA3 = fVar6.a();
                vc.s.j(bVarA3);
                CoroutineScope coroutineScopeA8 = nVar.f148914j.a();
                vc.s.j(coroutineScopeA8);
                nf3.a aVarC2 = fVar7.c();
                vc.s.j(aVarC2);
                b30.e eVar8 = new b30.e(suggestionsApiX, aVar4, cVar7, bVarA3, coroutineScopeA8, aVarC2);
                d4m.a aVarA4 = e4m.b.a(nVar.f148919n0);
                j30.c cVarF7 = fVar7.f();
                vc.s.j(cVarF7);
                f01.a aVarG3 = fVar7.g();
                vc.s.j(aVarG3);
                df0.b bVarA4 = fVar6.a();
                vc.s.j(bVarA4);
                return new t30.f(eVar8, aVarA4, cVarF7, aVarG3, bVarA4);
            case 45:
                return nVar.f148922q.c();
            case 46:
                return new l40.v(nVar.o, (m30.j) nVar.Z.get(), th0.i.a());
            case 47:
                return new w50.l(new t1j.b((c30.h) nVar.f148926s0.get()));
            case 48:
                b bVar22 = nVar.f148904a;
                TranscriptApi transcriptApi = (TranscriptApi) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) nVar.J.get(), "retrofit", TranscriptApi.class, "create(...)");
                vc.s.k(transcriptApi);
                CoroutineScope coroutineScopeA9 = nVar.f148914j.a();
                vc.s.j(coroutineScopeA9);
                ne0.j jVar5 = (ne0.j) nVar.M.get();
                ue0.c cVar8 = (ue0.c) nVar.S.get();
                l80.e eVarH3 = nVar.d.h();
                vc.s.j(eVarH3);
                return new c30.h(transcriptApi, coroutineScopeA9, jVar5, cVar8, eVarH3);
            case 49:
                return gsi.d.m(nVar.f148904a, ((nj0.d) nVar.f148908c).f());
            case 50:
                d4m.a aVarA5 = e4m.b.a(nVar.L);
                l80.e eVarH4 = nVar.d.h();
                vc.s.j(eVarH4);
                return new w20.e(aVarA5, eVarH4, nVar.r(), (ne0.j) nVar.M.get());
            case 51:
                return gsi.d.k(nVar.f148904a, nVar.i);
            case 52:
                return gsi.d.A(nVar.f148904a, nVar.i, nVar.e(), ((nj0.d) nVar.f148908c).h());
            case 53:
                return new f30.h(nVar.w(), nVar.r(), e4m.b.a(nVar.L));
            case 54:
                return e.a();
            default:
                throw new AssertionError(i);
        }
    }
}
