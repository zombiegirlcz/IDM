package oid;

import com.revolut.feature.shops.impl.service.ShopsService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsService f225612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f225613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f225614c;
    public final w4l.f d;

    public a0(ShopsService shopsService, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(shopsService, "shopsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f225612a = shopsService;
        this.f225613b = memoryCache;
        this.f225614c = storage;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: oid.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f225683b;

            {
                this.f225683b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String campaignId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                        a0 a0Var = this.f225683b;
                        efm.d0<Response<eid.t>> instructionByCampaignId = a0Var.f225612a.getInstructionByCampaignId(campaignId);
                        y yVar = new y(new nzj.n(1, a0Var, a0.class, "unwrapDto", "unwrapDto(Lretrofit2/Response;)Lcom/revolut/feature/shops/impl/dto/ShopsInstructionsResponseDto;", 0, 26), 0);
                        instructionByCampaignId.getClass();
                        ufm.i iVar = new ufm.i(instructionByCampaignId, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String campaignId2 = (String) obj2;
                        eid.t tVar = (eid.t) obj3;
                        Intrinsics.checkNotNullParameter(campaignId2, "campaignId");
                        Intrinsics.h(tVar);
                        this.f225683b.f225613b.f("STORAGE_KEY_SHOPS_INSTRUCTIONS_" + campaignId2, tVar);
                        break;
                    default:
                        String campaignId3 = (String) obj2;
                        eid.t tVar2 = (eid.t) obj3;
                        Intrinsics.checkNotNullParameter(campaignId3, "campaignId");
                        Intrinsics.h(tVar2);
                        this.f225683b.f225614c.G(tVar2, "STORAGE_KEY_SHOPS_INSTRUCTIONS_" + campaignId3, wim.z.d(o0.f186429a.h(o0.b(eid.t.class), o0.a(eid.t.class))));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i2 = 1;
        w wVar = new w(this, 1);
        Function2 function22 = new Function2(this) { // from class: oid.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f225683b;

            {
                this.f225683b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String campaignId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                        a0 a0Var = this.f225683b;
                        efm.d0<Response<eid.t>> instructionByCampaignId = a0Var.f225612a.getInstructionByCampaignId(campaignId);
                        y yVar = new y(new nzj.n(1, a0Var, a0.class, "unwrapDto", "unwrapDto(Lretrofit2/Response;)Lcom/revolut/feature/shops/impl/dto/ShopsInstructionsResponseDto;", 0, 26), 0);
                        instructionByCampaignId.getClass();
                        ufm.i iVar = new ufm.i(instructionByCampaignId, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String campaignId2 = (String) obj2;
                        eid.t tVar = (eid.t) obj3;
                        Intrinsics.checkNotNullParameter(campaignId2, "campaignId");
                        Intrinsics.h(tVar);
                        this.f225683b.f225613b.f("STORAGE_KEY_SHOPS_INSTRUCTIONS_" + campaignId2, tVar);
                        break;
                    default:
                        String campaignId3 = (String) obj2;
                        eid.t tVar2 = (eid.t) obj3;
                        Intrinsics.checkNotNullParameter(campaignId3, "campaignId");
                        Intrinsics.h(tVar2);
                        this.f225683b.f225614c.G(tVar2, "STORAGE_KEY_SHOPS_INSTRUCTIONS_" + campaignId3, wim.z.d(o0.f186429a.h(o0.b(eid.t.class), o0.a(eid.t.class))));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i3 = 2;
        this.d = new w4l.f(function2, wVar, function22, new w(this, 2), new Function2(this) { // from class: oid.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f225683b;

            {
                this.f225683b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String campaignId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                        a0 a0Var = this.f225683b;
                        efm.d0<Response<eid.t>> instructionByCampaignId = a0Var.f225612a.getInstructionByCampaignId(campaignId);
                        y yVar = new y(new nzj.n(1, a0Var, a0.class, "unwrapDto", "unwrapDto(Lretrofit2/Response;)Lcom/revolut/feature/shops/impl/dto/ShopsInstructionsResponseDto;", 0, 26), 0);
                        instructionByCampaignId.getClass();
                        ufm.i iVar = new ufm.i(instructionByCampaignId, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String campaignId2 = (String) obj2;
                        eid.t tVar = (eid.t) obj3;
                        Intrinsics.checkNotNullParameter(campaignId2, "campaignId");
                        Intrinsics.h(tVar);
                        this.f225683b.f225613b.f("STORAGE_KEY_SHOPS_INSTRUCTIONS_" + campaignId2, tVar);
                        break;
                    default:
                        String campaignId3 = (String) obj2;
                        eid.t tVar2 = (eid.t) obj3;
                        Intrinsics.checkNotNullParameter(campaignId3, "campaignId");
                        Intrinsics.h(tVar2);
                        this.f225683b.f225614c.G(tVar2, "STORAGE_KEY_SHOPS_INSTRUCTIONS_" + campaignId3, wim.z.d(o0.f186429a.h(o0.b(eid.t.class), o0.a(eid.t.class))));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
