package oid;

import com.revolut.feature.shops.impl.model.ShopsInstruction;
import ip0.v7;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f225681b;

    public /* synthetic */ w(a0 a0Var, int i) {
        this.f225680a = i;
        this.f225681b = a0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ShopsInstruction shopsInstruction;
        switch (this.f225680a) {
            case 0:
                eid.t tVar = (eid.t) obj2;
                Intrinsics.h(tVar);
                this.f225681b.getClass();
                od0.h hVar = od0.i.Companion;
                eid.s defaultInstructions = tVar.getDefaultInstructions();
                if (defaultInstructions != null) {
                    Intrinsics.checkNotNullParameter(defaultInstructions, "<this>");
                    shopsInstruction = new ShopsInstruction(defaultInstructions.getInstructions(), defaultInstructions.getDisclaimer());
                } else {
                    shopsInstruction = null;
                }
                hVar.getClass();
                return od0.h.a(shopsInstruction);
            case 1:
                String campaignId = (String) obj2;
                Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                return (eid.t) v7.r("STORAGE_KEY_SHOPS_INSTRUCTIONS_", campaignId, this.f225681b.f225613b);
            default:
                String campaignId2 = (String) obj2;
                Intrinsics.checkNotNullParameter(campaignId2, "campaignId");
                return (eid.t) this.f225681b.f225614c.T2("STORAGE_KEY_SHOPS_INSTRUCTIONS_" + campaignId2, eid.t.class);
        }
    }
}
