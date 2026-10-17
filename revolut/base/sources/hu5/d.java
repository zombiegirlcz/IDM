package hu5;

import androidx.room.util.DBUtil;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.crypto_investments.api.model.CryptoCommodityPositions;
import com.revolut.feature.crypto_investments.impl.data.network.CryptoPositionsService;
import efm.d0;
import hu1.h0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import s7a.l0;
import te0.w;
import tnb.g0;
import ufm.i;
import w4l.f;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoPositionsService f155559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f155560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zt5.a f155561c;
    public final f d;
    public final f e;

    public d(CryptoPositionsService cryptoPositionsService, g0 cryptoPositionsCache, zt5.a cryptoPositionsDao, b80.c networkStateRepository) {
        Intrinsics.checkNotNullParameter(cryptoPositionsService, "cryptoPositionsService");
        Intrinsics.checkNotNullParameter(cryptoPositionsCache, "cryptoPositionsCache");
        Intrinsics.checkNotNullParameter(cryptoPositionsDao, "cryptoPositionsDao");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f155559a = cryptoPositionsService;
        this.f155560b = cryptoPositionsCache;
        this.f155561c = cryptoPositionsDao;
        final int i = 2;
        uj0.b bVarK0 = w.k0(networkStateRepository, new Function1(this) { // from class: hu5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f155554b;

            {
                this.f155554b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                c params = (c) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        g0 g0Var = this.f155554b.f155560b;
                        it5.e eVar = it5.e.COMMODITIES;
                        String str = params.f155558b;
                        xt5.a key = new xt5.a(eVar, str);
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (CryptoCommodityPositions) ((ne0.d) g0Var.f272384b).get(eVar.a() + "_" + str);
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        zt5.a aVar = this.f155554b.f155561c;
                        it5.e eVar2 = it5.e.COMMODITIES;
                        return t1.R((List) DBUtil.performBlocking(aVar.f325083a, true, false, new l0(aVar, eVar2.a(), params.f155558b)), eVar2);
                    case 2:
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<gu5.a> cryptoPositions = this.f155554b.f155559a.getCryptoPositions(params.f155557a, params.f155558b);
                        hp5.b bVar = new hp5.b(new h0(2), 27);
                        cryptoPositions.getClass();
                        i iVar = new i(cryptoPositions, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        Intrinsics.checkNotNullParameter(params, "params");
                        g0 g0Var2 = this.f155554b.f155560b;
                        it5.e eVar3 = it5.e.CRYPTO;
                        String str2 = params.f155558b;
                        xt5.a key2 = new xt5.a(eVar3, str2);
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (CryptoCommodityPositions) ((ne0.d) g0Var2.f272384b).get(eVar3.a() + "_" + str2);
                    case 4:
                        Intrinsics.checkNotNullParameter(params, "params");
                        zt5.a aVar2 = this.f155554b.f155561c;
                        it5.e eVar4 = it5.e.CRYPTO;
                        return t1.R((List) DBUtil.performBlocking(aVar2.f325083a, true, false, new l0(aVar2, eVar4.a(), params.f155558b)), eVar4);
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<gu5.a> commoditiesPositions = this.f155554b.f155559a.getCommoditiesPositions(params.f155557a, params.f155558b);
                        hp5.b bVar2 = new hp5.b(new h0(1), 26);
                        commoditiesPositions.getClass();
                        i iVar2 = new i(commoditiesPositions, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        });
        final int i2 = 3;
        Function1 function1 = new Function1(this) { // from class: hu5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f155554b;

            {
                this.f155554b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                c params = (c) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        g0 g0Var = this.f155554b.f155560b;
                        it5.e eVar = it5.e.COMMODITIES;
                        String str = params.f155558b;
                        xt5.a key = new xt5.a(eVar, str);
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (CryptoCommodityPositions) ((ne0.d) g0Var.f272384b).get(eVar.a() + "_" + str);
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        zt5.a aVar = this.f155554b.f155561c;
                        it5.e eVar2 = it5.e.COMMODITIES;
                        return t1.R((List) DBUtil.performBlocking(aVar.f325083a, true, false, new l0(aVar, eVar2.a(), params.f155558b)), eVar2);
                    case 2:
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<gu5.a> cryptoPositions = this.f155554b.f155559a.getCryptoPositions(params.f155557a, params.f155558b);
                        hp5.b bVar = new hp5.b(new h0(2), 27);
                        cryptoPositions.getClass();
                        i iVar = new i(cryptoPositions, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        Intrinsics.checkNotNullParameter(params, "params");
                        g0 g0Var2 = this.f155554b.f155560b;
                        it5.e eVar3 = it5.e.CRYPTO;
                        String str2 = params.f155558b;
                        xt5.a key2 = new xt5.a(eVar3, str2);
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (CryptoCommodityPositions) ((ne0.d) g0Var2.f272384b).get(eVar3.a() + "_" + str2);
                    case 4:
                        Intrinsics.checkNotNullParameter(params, "params");
                        zt5.a aVar2 = this.f155554b.f155561c;
                        it5.e eVar4 = it5.e.CRYPTO;
                        return t1.R((List) DBUtil.performBlocking(aVar2.f325083a, true, false, new l0(aVar2, eVar4.a(), params.f155558b)), eVar4);
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<gu5.a> commoditiesPositions = this.f155554b.f155559a.getCommoditiesPositions(params.f155557a, params.f155558b);
                        hp5.b bVar2 = new hp5.b(new h0(1), 26);
                        commoditiesPositions.getClass();
                        i iVar2 = new i(commoditiesPositions, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i3 = 2;
        Function2 function2 = new Function2(this) { // from class: hu5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f155556b;

            {
                this.f155556b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                c params = (c) obj2;
                CryptoCommodityPositions positions = (CryptoCommodityPositions) obj3;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(positions, "data");
                        g0 g0Var = this.f155556b.f155560b;
                        it5.e eVar = it5.e.COMMODITIES;
                        String str = params.f155558b;
                        xt5.a key = new xt5.a(eVar, str);
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(positions, "positions");
                        ((ne0.d) g0Var.f272384b).f(eVar.a() + "_" + str, positions);
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(positions, "data");
                        zt5.a aVar = this.f155556b.f155561c;
                        DBUtil.performBlocking(aVar.f325083a, false, true, new zp5.f(aVar, t1.P(positions, params.f155558b), 10));
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(positions, "data");
                        g0 g0Var2 = this.f155556b.f155560b;
                        it5.e eVar2 = it5.e.CRYPTO;
                        String str2 = params.f155558b;
                        xt5.a key2 = new xt5.a(eVar2, str2);
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(positions, "positions");
                        ((ne0.d) g0Var2.f272384b).f(eVar2.a() + "_" + str2, positions);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(positions, "data");
                        zt5.a aVar2 = this.f155556b.f155561c;
                        DBUtil.performBlocking(aVar2.f325083a, false, true, new zp5.f(aVar2, t1.P(positions, params.f155558b), 10));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i5 = 4;
        Function1 function12 = new Function1(this) { // from class: hu5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f155554b;

            {
                this.f155554b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                c params = (c) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        g0 g0Var = this.f155554b.f155560b;
                        it5.e eVar = it5.e.COMMODITIES;
                        String str = params.f155558b;
                        xt5.a key = new xt5.a(eVar, str);
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (CryptoCommodityPositions) ((ne0.d) g0Var.f272384b).get(eVar.a() + "_" + str);
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        zt5.a aVar = this.f155554b.f155561c;
                        it5.e eVar2 = it5.e.COMMODITIES;
                        return t1.R((List) DBUtil.performBlocking(aVar.f325083a, true, false, new l0(aVar, eVar2.a(), params.f155558b)), eVar2);
                    case 2:
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<gu5.a> cryptoPositions = this.f155554b.f155559a.getCryptoPositions(params.f155557a, params.f155558b);
                        hp5.b bVar = new hp5.b(new h0(2), 27);
                        cryptoPositions.getClass();
                        i iVar = new i(cryptoPositions, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        Intrinsics.checkNotNullParameter(params, "params");
                        g0 g0Var2 = this.f155554b.f155560b;
                        it5.e eVar3 = it5.e.CRYPTO;
                        String str2 = params.f155558b;
                        xt5.a key2 = new xt5.a(eVar3, str2);
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (CryptoCommodityPositions) ((ne0.d) g0Var2.f272384b).get(eVar3.a() + "_" + str2);
                    case 4:
                        Intrinsics.checkNotNullParameter(params, "params");
                        zt5.a aVar2 = this.f155554b.f155561c;
                        it5.e eVar4 = it5.e.CRYPTO;
                        return t1.R((List) DBUtil.performBlocking(aVar2.f325083a, true, false, new l0(aVar2, eVar4.a(), params.f155558b)), eVar4);
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<gu5.a> commoditiesPositions = this.f155554b.f155559a.getCommoditiesPositions(params.f155557a, params.f155558b);
                        hp5.b bVar2 = new hp5.b(new h0(1), 26);
                        commoditiesPositions.getClass();
                        i iVar2 = new i(commoditiesPositions, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i6 = 3;
        this.d = new f(bVarK0, function1, function2, function12, new Function2(this) { // from class: hu5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f155556b;

            {
                this.f155556b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                c params = (c) obj2;
                CryptoCommodityPositions positions = (CryptoCommodityPositions) obj3;
                switch (i6) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(positions, "data");
                        g0 g0Var = this.f155556b.f155560b;
                        it5.e eVar = it5.e.COMMODITIES;
                        String str = params.f155558b;
                        xt5.a key = new xt5.a(eVar, str);
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(positions, "positions");
                        ((ne0.d) g0Var.f272384b).f(eVar.a() + "_" + str, positions);
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(positions, "data");
                        zt5.a aVar = this.f155556b.f155561c;
                        DBUtil.performBlocking(aVar.f325083a, false, true, new zp5.f(aVar, t1.P(positions, params.f155558b), 10));
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(positions, "data");
                        g0 g0Var2 = this.f155556b.f155560b;
                        it5.e eVar2 = it5.e.CRYPTO;
                        String str2 = params.f155558b;
                        xt5.a key2 = new xt5.a(eVar2, str2);
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(positions, "positions");
                        ((ne0.d) g0Var2.f272384b).f(eVar2.a() + "_" + str2, positions);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(positions, "data");
                        zt5.a aVar2 = this.f155556b.f155561c;
                        DBUtil.performBlocking(aVar2.f325083a, false, true, new zp5.f(aVar2, t1.P(positions, params.f155558b), 10));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i21 = 5;
        uj0.b bVarK02 = w.k0(networkStateRepository, new Function1(this) { // from class: hu5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f155554b;

            {
                this.f155554b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                c params = (c) obj2;
                switch (i21) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        g0 g0Var = this.f155554b.f155560b;
                        it5.e eVar = it5.e.COMMODITIES;
                        String str = params.f155558b;
                        xt5.a key = new xt5.a(eVar, str);
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (CryptoCommodityPositions) ((ne0.d) g0Var.f272384b).get(eVar.a() + "_" + str);
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        zt5.a aVar = this.f155554b.f155561c;
                        it5.e eVar2 = it5.e.COMMODITIES;
                        return t1.R((List) DBUtil.performBlocking(aVar.f325083a, true, false, new l0(aVar, eVar2.a(), params.f155558b)), eVar2);
                    case 2:
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<gu5.a> cryptoPositions = this.f155554b.f155559a.getCryptoPositions(params.f155557a, params.f155558b);
                        hp5.b bVar = new hp5.b(new h0(2), 27);
                        cryptoPositions.getClass();
                        i iVar = new i(cryptoPositions, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        Intrinsics.checkNotNullParameter(params, "params");
                        g0 g0Var2 = this.f155554b.f155560b;
                        it5.e eVar3 = it5.e.CRYPTO;
                        String str2 = params.f155558b;
                        xt5.a key2 = new xt5.a(eVar3, str2);
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (CryptoCommodityPositions) ((ne0.d) g0Var2.f272384b).get(eVar3.a() + "_" + str2);
                    case 4:
                        Intrinsics.checkNotNullParameter(params, "params");
                        zt5.a aVar2 = this.f155554b.f155561c;
                        it5.e eVar4 = it5.e.CRYPTO;
                        return t1.R((List) DBUtil.performBlocking(aVar2.f325083a, true, false, new l0(aVar2, eVar4.a(), params.f155558b)), eVar4);
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<gu5.a> commoditiesPositions = this.f155554b.f155559a.getCommoditiesPositions(params.f155557a, params.f155558b);
                        hp5.b bVar2 = new hp5.b(new h0(1), 26);
                        commoditiesPositions.getClass();
                        i iVar2 = new i(commoditiesPositions, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        });
        final int i22 = 0;
        Function1 function13 = new Function1(this) { // from class: hu5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f155554b;

            {
                this.f155554b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                c params = (c) obj2;
                switch (i22) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        g0 g0Var = this.f155554b.f155560b;
                        it5.e eVar = it5.e.COMMODITIES;
                        String str = params.f155558b;
                        xt5.a key = new xt5.a(eVar, str);
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (CryptoCommodityPositions) ((ne0.d) g0Var.f272384b).get(eVar.a() + "_" + str);
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        zt5.a aVar = this.f155554b.f155561c;
                        it5.e eVar2 = it5.e.COMMODITIES;
                        return t1.R((List) DBUtil.performBlocking(aVar.f325083a, true, false, new l0(aVar, eVar2.a(), params.f155558b)), eVar2);
                    case 2:
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<gu5.a> cryptoPositions = this.f155554b.f155559a.getCryptoPositions(params.f155557a, params.f155558b);
                        hp5.b bVar = new hp5.b(new h0(2), 27);
                        cryptoPositions.getClass();
                        i iVar = new i(cryptoPositions, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        Intrinsics.checkNotNullParameter(params, "params");
                        g0 g0Var2 = this.f155554b.f155560b;
                        it5.e eVar3 = it5.e.CRYPTO;
                        String str2 = params.f155558b;
                        xt5.a key2 = new xt5.a(eVar3, str2);
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (CryptoCommodityPositions) ((ne0.d) g0Var2.f272384b).get(eVar3.a() + "_" + str2);
                    case 4:
                        Intrinsics.checkNotNullParameter(params, "params");
                        zt5.a aVar2 = this.f155554b.f155561c;
                        it5.e eVar4 = it5.e.CRYPTO;
                        return t1.R((List) DBUtil.performBlocking(aVar2.f325083a, true, false, new l0(aVar2, eVar4.a(), params.f155558b)), eVar4);
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<gu5.a> commoditiesPositions = this.f155554b.f155559a.getCommoditiesPositions(params.f155557a, params.f155558b);
                        hp5.b bVar2 = new hp5.b(new h0(1), 26);
                        commoditiesPositions.getClass();
                        i iVar2 = new i(commoditiesPositions, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        Function2 function22 = new Function2(this) { // from class: hu5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f155556b;

            {
                this.f155556b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                c params = (c) obj2;
                CryptoCommodityPositions positions = (CryptoCommodityPositions) obj3;
                switch (i22) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(positions, "data");
                        g0 g0Var = this.f155556b.f155560b;
                        it5.e eVar = it5.e.COMMODITIES;
                        String str = params.f155558b;
                        xt5.a key = new xt5.a(eVar, str);
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(positions, "positions");
                        ((ne0.d) g0Var.f272384b).f(eVar.a() + "_" + str, positions);
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(positions, "data");
                        zt5.a aVar = this.f155556b.f155561c;
                        DBUtil.performBlocking(aVar.f325083a, false, true, new zp5.f(aVar, t1.P(positions, params.f155558b), 10));
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(positions, "data");
                        g0 g0Var2 = this.f155556b.f155560b;
                        it5.e eVar2 = it5.e.CRYPTO;
                        String str2 = params.f155558b;
                        xt5.a key2 = new xt5.a(eVar2, str2);
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(positions, "positions");
                        ((ne0.d) g0Var2.f272384b).f(eVar2.a() + "_" + str2, positions);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(positions, "data");
                        zt5.a aVar2 = this.f155556b.f155561c;
                        DBUtil.performBlocking(aVar2.f325083a, false, true, new zp5.f(aVar2, t1.P(positions, params.f155558b), 10));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i32 = 1;
        this.e = new f(bVarK02, function13, function22, new Function1(this) { // from class: hu5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f155554b;

            {
                this.f155554b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                c params = (c) obj2;
                switch (i32) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        g0 g0Var = this.f155554b.f155560b;
                        it5.e eVar = it5.e.COMMODITIES;
                        String str = params.f155558b;
                        xt5.a key = new xt5.a(eVar, str);
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (CryptoCommodityPositions) ((ne0.d) g0Var.f272384b).get(eVar.a() + "_" + str);
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        zt5.a aVar = this.f155554b.f155561c;
                        it5.e eVar2 = it5.e.COMMODITIES;
                        return t1.R((List) DBUtil.performBlocking(aVar.f325083a, true, false, new l0(aVar, eVar2.a(), params.f155558b)), eVar2);
                    case 2:
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<gu5.a> cryptoPositions = this.f155554b.f155559a.getCryptoPositions(params.f155557a, params.f155558b);
                        hp5.b bVar = new hp5.b(new h0(2), 27);
                        cryptoPositions.getClass();
                        i iVar = new i(cryptoPositions, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        Intrinsics.checkNotNullParameter(params, "params");
                        g0 g0Var2 = this.f155554b.f155560b;
                        it5.e eVar3 = it5.e.CRYPTO;
                        String str2 = params.f155558b;
                        xt5.a key2 = new xt5.a(eVar3, str2);
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (CryptoCommodityPositions) ((ne0.d) g0Var2.f272384b).get(eVar3.a() + "_" + str2);
                    case 4:
                        Intrinsics.checkNotNullParameter(params, "params");
                        zt5.a aVar2 = this.f155554b.f155561c;
                        it5.e eVar4 = it5.e.CRYPTO;
                        return t1.R((List) DBUtil.performBlocking(aVar2.f325083a, true, false, new l0(aVar2, eVar4.a(), params.f155558b)), eVar4);
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<gu5.a> commoditiesPositions = this.f155554b.f155559a.getCommoditiesPositions(params.f155557a, params.f155558b);
                        hp5.b bVar2 = new hp5.b(new h0(1), 26);
                        commoditiesPositions.getClass();
                        i iVar2 = new i(commoditiesPositions, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, new Function2(this) { // from class: hu5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f155556b;

            {
                this.f155556b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                c params = (c) obj2;
                CryptoCommodityPositions positions = (CryptoCommodityPositions) obj3;
                switch (i32) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(positions, "data");
                        g0 g0Var = this.f155556b.f155560b;
                        it5.e eVar = it5.e.COMMODITIES;
                        String str = params.f155558b;
                        xt5.a key = new xt5.a(eVar, str);
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(positions, "positions");
                        ((ne0.d) g0Var.f272384b).f(eVar.a() + "_" + str, positions);
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(positions, "data");
                        zt5.a aVar = this.f155556b.f155561c;
                        DBUtil.performBlocking(aVar.f325083a, false, true, new zp5.f(aVar, t1.P(positions, params.f155558b), 10));
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(positions, "data");
                        g0 g0Var2 = this.f155556b.f155560b;
                        it5.e eVar2 = it5.e.CRYPTO;
                        String str2 = params.f155558b;
                        xt5.a key2 = new xt5.a(eVar2, str2);
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(positions, "positions");
                        ((ne0.d) g0Var2.f272384b).f(eVar2.a() + "_" + str2, positions);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(positions, "data");
                        zt5.a aVar2 = this.f155556b.f155561c;
                        DBUtil.performBlocking(aVar2.f325083a, false, true, new zp5.f(aVar2, t1.P(positions, params.f155558b), 10));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
